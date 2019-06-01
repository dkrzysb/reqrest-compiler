package reqrest;

import reqrest.generated.ReqRestLexer;
import reqrest.generated.ReqRestParser;
import org.antlr.v4.runtime.ANTLRFileStream;
import org.antlr.v4.runtime.CommonTokenStream;

import java.io.IOException;

public class Main {
    public static void main(String[] args) throws IOException {
        ReqRestLexer lexer = new ReqRestLexer(new ANTLRFileStream("src\\main\\ReqRest\\example.reqrest"));
        ReqRestParser parser = new ReqRestParser(new CommonTokenStream(lexer));
        ReqRestVisitor visitor = new ReqRestVisitor();

        visitor.visit(parser.program());
    }
}
