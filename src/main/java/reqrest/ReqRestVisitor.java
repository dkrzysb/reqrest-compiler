package reqrest;

import reqrest.generated.ReqRestBaseVisitor;
import reqrest.generated.ReqRestParser;
import reqrest.model.Value;

import java.io.BufferedReader;
import java.io.DataOutputStream;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Scanner;

public class ReqRestVisitor extends ReqRestBaseVisitor<Value> {
    private static final double EPSILON = 0.00000000001;
    private Map<String, Value> memory = new HashMap<>();
    private static Scanner inputReader = new Scanner(System.in);

    @Override
    public Value visitAssignment(ReqRestParser.AssignmentContext ctx) {
        String id = ctx.ID().getText();
        if(memory.containsKey(id)) {
            Value value = null;
            if (ctx.expression() != null)
                value = this.visit(ctx.expression());
            else if (ctx.httpMethods() != null)
                value = this.visit(ctx.httpMethods());

            return memory.replace(id, value);
        }
        else
            throw new RuntimeException("No such variable: " + id);
    }

    @Override
    public Value visitInitialization(ReqRestParser.InitializationContext ctx) {
        String id = ctx.ID().getText();
        if(memory.containsKey(id))
            throw new RuntimeException("Variable with id " + id + " already exist.");
        Value value = null;
        if(ctx.expression() != null)
            value = this.visit(ctx.expression());
        else if(ctx.httpMethods() != null)
            value = this.visit(ctx.httpMethods());

        return memory.put(id, value);
    }

    @Override
    public Value visitIdAtom(ReqRestParser.IdAtomContext ctx) {
        String id = ctx.getText();
        Value value = memory.get(id);
        if(value == null)
            throw new RuntimeException("No such variable: " + id);
        return value;
    }

    @Override
    public Value visitStringAtom(ReqRestParser.StringAtomContext ctx) {
        String str = ctx.getText();
        str = str.substring(1, str.length() - 1).replace("\"\"", "\"");

        return new Value(str);
    }

    @Override
    public Value visitBooleanAtom(ReqRestParser.BooleanAtomContext ctx) {
        return new Value(Boolean.valueOf(ctx.getText()));
    }

    @Override
    public Value visitNumberAtom(ReqRestParser.NumberAtomContext ctx) {
        return new Value(Double.valueOf(ctx.getText()));
    }

    @Override
    public Value visitComplexExpression(ReqRestParser.ComplexExpressionContext ctx) {
        return this.visit(ctx.expression());
    }

    @Override
    public Value visitArithmeticExpression(ReqRestParser.ArithmeticExpressionContext ctx) {
        Value left = this.visit(ctx.expression(0));
        Value right = this.visit(ctx.expression(1));

        switch(ctx.op.getType()) {
            case ReqRestParser.Add:
                return new Value(left.asDouble() + right.asDouble());
            case ReqRestParser.Subtract:
                return new Value(left.asDouble() - right.asDouble());
            case ReqRestParser.Multiply:
                return new Value(left.asDouble() * right.asDouble());
            case ReqRestParser.Divide:
                return new Value(left.asDouble() / right.asDouble());
            default:
                throw new RuntimeException("Unknown operator");
        }
    }

    @Override
    public Value visitUnaryMinusExpression(ReqRestParser.UnaryMinusExpressionContext ctx) {
        Value value = this.visit(ctx.expression());
        return new Value(-value.asDouble());
    }

    @Override
    public Value visitNotExpression(ReqRestParser.NotExpressionContext ctx) {
        Value value = this.visit(ctx.expression());

        return new Value(!value.asBoolean());
    }

    @Override
    public Value visitAndExpression(ReqRestParser.AndExpressionContext ctx) {
        Value left = this.visit(ctx.expression(0));
        Value right = this.visit(ctx.expression(1));

        return new Value(left.asBoolean() && right.asBoolean());
    }

    @Override
    public Value visitOrExpression(ReqRestParser.OrExpressionContext ctx) {
        Value left = this.visit(ctx.expression(0));
        Value right = this.visit(ctx.expression(1));

        return new Value(left.asBoolean() || right.asBoolean());
    }

    @Override
    public Value visitEqualityExpression(ReqRestParser.EqualityExpressionContext ctx) {
        Value left = this.visit(ctx.expression(0));
        Value right = this.visit(ctx.expression(1));

        switch(ctx.op.getType()) {
            case ReqRestParser.Equal:
                return left.isDouble() && right.isDouble() ?
                        new Value(left.asDouble() - right.asDouble() < EPSILON) :
                        new Value(left.equals(right));
            case ReqRestParser.NotEqual:
                return left.isDouble() && right.isDouble() ?
                        new Value(left.asDouble() - right.asDouble() >= EPSILON) :
                        new Value(!left.equals(right));
            default:
                throw new RuntimeException("Unknown operator: " + ReqRestParser.tokenNames[ctx.op.getType()]);
        }
    }

    @Override
    public Value visitRelationalExpression(ReqRestParser.RelationalExpressionContext ctx) {
        Value left = this.visit(ctx.expression(0));
        Value right = this.visit(ctx.expression(1));

        switch(ctx.op.getType()) {
            case ReqRestParser.GreaterThan:
                return new Value(left.asDouble() > right.asDouble());
            case ReqRestParser.GreaterOrEqual:
                return new Value(left.asDouble() >= right.asDouble());
            case ReqRestParser.LowerThan:
                return new Value(left.asDouble() < right.asDouble());
            case ReqRestParser.LowerOrEqual:
                return new Value(left.asDouble() <= right.asDouble());
            default:
                throw new RuntimeException("Unknown operator: " + ReqRestParser.tokenNames[ctx.op.getType()]);
        }
    }

    @Override
    public Value visitHttpGet(ReqRestParser.HttpGetContext ctx) {
        try {
            String urlString = ctx.String().getText().substring(1, ctx.String().getText().length() - 1);
            URL url = new URL(urlString);
            HttpURLConnection connection = (HttpURLConnection)url.openConnection();
            connection.setRequestMethod("GET");

            BufferedReader in = new BufferedReader(new InputStreamReader(connection.getInputStream()));
            String inputLine;
            StringBuilder result = new StringBuilder();
            while((inputLine = in.readLine()) != null)
                result.append(inputLine);
            in.close();

            return new Value(result);
        }
        catch(Exception ex) {
            throw new RuntimeException(ex.getMessage());
        }
    }

    @Override
    public Value visitHttpPost(ReqRestParser.HttpPostContext ctx) {
        try {
            String urlString = ctx.String(0).getText().substring(1, ctx.String(0).getText().length() - 1);
            URL url = new URL(urlString);
            HttpURLConnection connection = (HttpURLConnection)url.openConnection();
            connection.setRequestMethod("POST");

            connection.setDoOutput(true);
            DataOutputStream writer = new DataOutputStream(connection.getOutputStream());
            writer.writeBytes(ctx.String(1).getText().substring(1, ctx.String(1).getText().length() - 1));
            writer.flush();
            writer.close();

            BufferedReader in = new BufferedReader(new InputStreamReader(connection.getInputStream()));
            String inputLine;
            StringBuilder result = new StringBuilder();
            while((inputLine = in.readLine()) != null)
                result.append(inputLine);
            in.close();

            return new Value(result);
        }
        catch(Exception ex) {
            throw new RuntimeException(ex.getMessage());
        }
    }

    @Override
    public Value visitHttpPut(ReqRestParser.HttpPutContext ctx) {
        try {
            String urlString = ctx.String(0).getText().substring(1, ctx.String(0).getText().length() - 1);
            URL url = new URL(urlString);
            HttpURLConnection connection = (HttpURLConnection)url.openConnection();
            connection.setRequestMethod("PUT");

            connection.setDoOutput(true);
            DataOutputStream writer = new DataOutputStream(connection.getOutputStream());
            writer.writeBytes(ctx.String(1).getText().substring(1, ctx.String(1).getText().length() - 1));
            writer.flush();
            writer.close();

            BufferedReader in = new BufferedReader(new InputStreamReader(connection.getInputStream()));
            String inputLine;
            StringBuilder result = new StringBuilder();
            while((inputLine = in.readLine()) != null)
                result.append(inputLine);
            in.close();

            return new Value(result);
        }
        catch(Exception ex) {
            throw new RuntimeException(ex.getMessage());
        }
    }

    @Override
    public Value visitHttpPatch(ReqRestParser.HttpPatchContext ctx) {
        try {
            String urlString = ctx.String(0).getText().substring(1, ctx.String(0).getText().length() - 1);
            URL url = new URL(urlString);
            HttpURLConnection connection = (HttpURLConnection)url.openConnection();
            connection.setRequestProperty("X-HTTP-Method-Override", "PATCH");
            connection.setRequestMethod("POST");

            connection.setDoOutput(true);
            DataOutputStream writer = new DataOutputStream(connection.getOutputStream());
            writer.writeBytes(ctx.String(1).getText().substring(1, ctx.String(1).getText().length() - 1));
            writer.flush();
            writer.close();

            BufferedReader in = new BufferedReader(new InputStreamReader(connection.getInputStream()));
            String inputLine;
            StringBuilder result = new StringBuilder();
            while((inputLine = in.readLine()) != null)
                result.append(inputLine);
            in.close();

            return new Value(result);
        }
        catch(Exception ex) {
            throw new RuntimeException(ex.getMessage());
        }
    }

    @Override
    public Value visitHttpDelete(ReqRestParser.HttpDeleteContext ctx) {
        try {
            String urlString = ctx.String().getText().substring(1, ctx.String().getText().length() - 1);
            URL url = new URL(urlString);
            HttpURLConnection connection = (HttpURLConnection)url.openConnection();
            connection.setRequestMethod("DELETE");

            return new Value(connection.getResponseCode());
        }
        catch(Exception ex) {
            throw new RuntimeException(ex.getMessage());
        }
    }

    @Override
    public Value visitPrint(ReqRestParser.PrintContext ctx) {
        Value value = this.visit(ctx.expression());

        System.out.println(value.toString());

        return Value.VOID;
    }

    @Override
    public Value visitLoad(ReqRestParser.LoadContext ctx) {
        String id = ctx.ID().getText();

        if(!memory.containsKey(ctx.ID().getText()))
            throw new RuntimeException("No such variable: " + id);
        else {
            System.out.print("Enter value: ");
            memory.replace(id, new Value(inputReader.next()));
        }

        return Value.VOID;
    }

    @Override
    public Value visitNewLine(ReqRestParser.NewLineContext ctx) {
        System.out.println();

        return Value.VOID;
    }

    @Override
    public Value visitIfStatement(ReqRestParser.IfStatementContext ctx) {
        List<ReqRestParser.ConditionBlockContext> conditions = ctx.conditionBlock();
        boolean evaluatedBlock = false;

        for(ReqRestParser.ConditionBlockContext condition : conditions) {
            Value evaluated = this.visit(condition.expression());

            if(evaluated.asBoolean()) {
                evaluatedBlock = true;
                this.visit(condition.statementBlock());
                break;
            }

            if(!evaluatedBlock && ctx.statementBlock() != null)
                this.visit(ctx.statementBlock());
        }

        return Value.VOID;
    }

    @Override
    public Value visitWhileLoop(ReqRestParser.WhileLoopContext ctx) {
        Value value = this.visit(ctx.expression());

        while(value.asBoolean()) {
            this.visit(ctx.statementBlock());

            value = this.visit(ctx.expression());
        }

        return Value.VOID;
    }
}
