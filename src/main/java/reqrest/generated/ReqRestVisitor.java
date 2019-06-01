package reqrest.generated;

import org.antlr.v4.runtime.tree.ParseTreeVisitor;

/**
 * This interface defines a complete generic visitor for a parse tree produced
 * by {@link ReqRestParser}.
 *
 * @param <T> The return type of the visit operation. Use {@link Void} for
 * operations with no return type.
 */
public interface ReqRestVisitor<T> extends ParseTreeVisitor<T> {
	/**
	 * Visit a parse tree produced by {@link ReqRestParser#program}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitProgram(ReqRestParser.ProgramContext ctx);
	/**
	 * Visit a parse tree produced by {@link ReqRestParser#statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStatement(ReqRestParser.StatementContext ctx);
	/**
	 * Visit a parse tree produced by the {@code orExpression}
	 * labeled alternative in {@link ReqRestParser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitOrExpression(ReqRestParser.OrExpressionContext ctx);
	/**
	 * Visit a parse tree produced by the {@code unaryMinusExpression}
	 * labeled alternative in {@link ReqRestParser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitUnaryMinusExpression(ReqRestParser.UnaryMinusExpressionContext ctx);
	/**
	 * Visit a parse tree produced by the {@code andExpression}
	 * labeled alternative in {@link ReqRestParser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAndExpression(ReqRestParser.AndExpressionContext ctx);
	/**
	 * Visit a parse tree produced by the {@code atomExpression}
	 * labeled alternative in {@link ReqRestParser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAtomExpression(ReqRestParser.AtomExpressionContext ctx);
	/**
	 * Visit a parse tree produced by the {@code relationalExpression}
	 * labeled alternative in {@link ReqRestParser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitRelationalExpression(ReqRestParser.RelationalExpressionContext ctx);
	/**
	 * Visit a parse tree produced by the {@code equalityExpression}
	 * labeled alternative in {@link ReqRestParser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitEqualityExpression(ReqRestParser.EqualityExpressionContext ctx);
	/**
	 * Visit a parse tree produced by the {@code notExpression}
	 * labeled alternative in {@link ReqRestParser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNotExpression(ReqRestParser.NotExpressionContext ctx);
	/**
	 * Visit a parse tree produced by the {@code arithmeticExpression}
	 * labeled alternative in {@link ReqRestParser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitArithmeticExpression(ReqRestParser.ArithmeticExpressionContext ctx);
	/**
	 * Visit a parse tree produced by the {@code complexExpression}
	 * labeled alternative in {@link ReqRestParser#atom}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitComplexExpression(ReqRestParser.ComplexExpressionContext ctx);
	/**
	 * Visit a parse tree produced by the {@code numberAtom}
	 * labeled alternative in {@link ReqRestParser#atom}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNumberAtom(ReqRestParser.NumberAtomContext ctx);
	/**
	 * Visit a parse tree produced by the {@code booleanAtom}
	 * labeled alternative in {@link ReqRestParser#atom}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBooleanAtom(ReqRestParser.BooleanAtomContext ctx);
	/**
	 * Visit a parse tree produced by the {@code idAtom}
	 * labeled alternative in {@link ReqRestParser#atom}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIdAtom(ReqRestParser.IdAtomContext ctx);
	/**
	 * Visit a parse tree produced by the {@code stringAtom}
	 * labeled alternative in {@link ReqRestParser#atom}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStringAtom(ReqRestParser.StringAtomContext ctx);
	/**
	 * Visit a parse tree produced by {@link ReqRestParser#httpMethods}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitHttpMethods(ReqRestParser.HttpMethodsContext ctx);
	/**
	 * Visit a parse tree produced by {@link ReqRestParser#httpGet}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitHttpGet(ReqRestParser.HttpGetContext ctx);
	/**
	 * Visit a parse tree produced by {@link ReqRestParser#httpPost}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitHttpPost(ReqRestParser.HttpPostContext ctx);
	/**
	 * Visit a parse tree produced by {@link ReqRestParser#httpPut}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitHttpPut(ReqRestParser.HttpPutContext ctx);
	/**
	 * Visit a parse tree produced by {@link ReqRestParser#httpPatch}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitHttpPatch(ReqRestParser.HttpPatchContext ctx);
	/**
	 * Visit a parse tree produced by {@link ReqRestParser#httpDelete}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitHttpDelete(ReqRestParser.HttpDeleteContext ctx);
	/**
	 * Visit a parse tree produced by {@link ReqRestParser#initialization}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitInitialization(ReqRestParser.InitializationContext ctx);
	/**
	 * Visit a parse tree produced by {@link ReqRestParser#assignment}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAssignment(ReqRestParser.AssignmentContext ctx);
	/**
	 * Visit a parse tree produced by {@link ReqRestParser#print}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPrint(ReqRestParser.PrintContext ctx);
	/**
	 * Visit a parse tree produced by {@link ReqRestParser#load}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLoad(ReqRestParser.LoadContext ctx);
	/**
	 * Visit a parse tree produced by {@link ReqRestParser#newLine}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNewLine(ReqRestParser.NewLineContext ctx);
	/**
	 * Visit a parse tree produced by {@link ReqRestParser#ifStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIfStatement(ReqRestParser.IfStatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link ReqRestParser#conditionBlock}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitConditionBlock(ReqRestParser.ConditionBlockContext ctx);
	/**
	 * Visit a parse tree produced by {@link ReqRestParser#statementBlock}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStatementBlock(ReqRestParser.StatementBlockContext ctx);
	/**
	 * Visit a parse tree produced by {@link ReqRestParser#whileLoop}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitWhileLoop(ReqRestParser.WhileLoopContext ctx);
}