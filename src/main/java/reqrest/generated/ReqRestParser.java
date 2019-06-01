package reqrest.generated;

import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class ReqRestParser extends Parser {
	static { RuntimeMetaData.checkVersion("4.7.2", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		Start=1, Finish=2, If=3, Elsif=4, Else=5, While=6, Load=7, Print=8, Assign=9, 
		Add=10, Subtract=11, Multiply=12, Divide=13, Equal=14, NotEqual=15, GreaterThan=16, 
		LowerThan=17, GreaterOrEqual=18, LowerOrEqual=19, Not=20, And=21, Or=22, 
		ExpressionEnd=23, HttpGet=24, HttpPost=25, HttpPut=26, HttpPatch=27, HttpDelete=28, 
		OpeningParenthesis=29, ClosingParenthesis=30, OpeningCurlyBracket=31, 
		ClosingCurlyBracket=32, Definition=33, Comma=34, NewLine=35, True=36, 
		False=37, ID=38, Minus=39, Integer=40, Float=41, String=42, Comment=43, 
		Whitespaces=44;
	public static final int
		RULE_program = 0, RULE_statement = 1, RULE_expression = 2, RULE_atom = 3, 
		RULE_httpMethods = 4, RULE_httpGet = 5, RULE_httpPost = 6, RULE_httpPut = 7, 
		RULE_httpPatch = 8, RULE_httpDelete = 9, RULE_initialization = 10, RULE_assignment = 11, 
		RULE_print = 12, RULE_load = 13, RULE_newLine = 14, RULE_ifStatement = 15, 
		RULE_conditionBlock = 16, RULE_statementBlock = 17, RULE_whileLoop = 18;
	private static String[] makeRuleNames() {
		return new String[] {
			"program", "statement", "expression", "atom", "httpMethods", "httpGet", 
			"httpPost", "httpPut", "httpPatch", "httpDelete", "initialization", "assignment", 
			"print", "load", "newLine", "ifStatement", "conditionBlock", "statementBlock", 
			"whileLoop"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "'go'", "'finish'", "'if'", "'elsif'", "'else'", "'while'", "'load'", 
			"'print'", "'='", "'add'", "'subtract'", "'multiply'", "'divide'", "'eq'", 
			"'neq'", "'gt'", "'lt'", "'ge'", "'le'", "'~'", "'&&'", "'||'", "'#'", 
			"'get'", "'post'", "'put'", "'patch'", "'delete'", "'('", "')'", "'{'", 
			"'}'", "'def'", "','", "'newline'", "'true'", "'false'", null, "'-'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, "Start", "Finish", "If", "Elsif", "Else", "While", "Load", "Print", 
			"Assign", "Add", "Subtract", "Multiply", "Divide", "Equal", "NotEqual", 
			"GreaterThan", "LowerThan", "GreaterOrEqual", "LowerOrEqual", "Not", 
			"And", "Or", "ExpressionEnd", "HttpGet", "HttpPost", "HttpPut", "HttpPatch", 
			"HttpDelete", "OpeningParenthesis", "ClosingParenthesis", "OpeningCurlyBracket", 
			"ClosingCurlyBracket", "Definition", "Comma", "NewLine", "True", "False", 
			"ID", "Minus", "Integer", "Float", "String", "Comment", "Whitespaces"
		};
	}
	private static final String[] _SYMBOLIC_NAMES = makeSymbolicNames();
	public static final Vocabulary VOCABULARY = new VocabularyImpl(_LITERAL_NAMES, _SYMBOLIC_NAMES);

	/**
	 * @deprecated Use {@link #VOCABULARY} instead.
	 */
	@Deprecated
	public static final String[] tokenNames;
	static {
		tokenNames = new String[_SYMBOLIC_NAMES.length];
		for (int i = 0; i < tokenNames.length; i++) {
			tokenNames[i] = VOCABULARY.getLiteralName(i);
			if (tokenNames[i] == null) {
				tokenNames[i] = VOCABULARY.getSymbolicName(i);
			}

			if (tokenNames[i] == null) {
				tokenNames[i] = "<INVALID>";
			}
		}
	}

	@Override
	@Deprecated
	public String[] getTokenNames() {
		return tokenNames;
	}

	@Override

	public Vocabulary getVocabulary() {
		return VOCABULARY;
	}

	@Override
	public String getGrammarFileName() { return "ReqRest.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public ReqRestParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	public static class ProgramContext extends ParserRuleContext {
		public TerminalNode Start() { return getToken(ReqRestParser.Start, 0); }
		public TerminalNode Finish() { return getToken(ReqRestParser.Finish, 0); }
		public TerminalNode EOF() { return getToken(ReqRestParser.EOF, 0); }
		public List<StatementContext> statement() {
			return getRuleContexts(StatementContext.class);
		}
		public StatementContext statement(int i) {
			return getRuleContext(StatementContext.class,i);
		}
		public ProgramContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_program; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ReqRestVisitor ) return ((ReqRestVisitor<? extends T>)visitor).visitProgram(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ProgramContext program() throws RecognitionException {
		ProgramContext _localctx = new ProgramContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_program);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(38);
			match(Start);
			setState(42);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << If) | (1L << While) | (1L << Load) | (1L << Print) | (1L << HttpGet) | (1L << HttpPost) | (1L << HttpPut) | (1L << HttpPatch) | (1L << HttpDelete) | (1L << Definition) | (1L << NewLine) | (1L << ID))) != 0)) {
				{
				{
				setState(39);
				statement();
				}
				}
				setState(44);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(45);
			match(Finish);
			setState(46);
			match(EOF);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class StatementContext extends ParserRuleContext {
		public InitializationContext initialization() {
			return getRuleContext(InitializationContext.class,0);
		}
		public AssignmentContext assignment() {
			return getRuleContext(AssignmentContext.class,0);
		}
		public IfStatementContext ifStatement() {
			return getRuleContext(IfStatementContext.class,0);
		}
		public WhileLoopContext whileLoop() {
			return getRuleContext(WhileLoopContext.class,0);
		}
		public PrintContext print() {
			return getRuleContext(PrintContext.class,0);
		}
		public LoadContext load() {
			return getRuleContext(LoadContext.class,0);
		}
		public HttpMethodsContext httpMethods() {
			return getRuleContext(HttpMethodsContext.class,0);
		}
		public NewLineContext newLine() {
			return getRuleContext(NewLineContext.class,0);
		}
		public StatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_statement; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ReqRestVisitor ) return ((ReqRestVisitor<? extends T>)visitor).visitStatement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final StatementContext statement() throws RecognitionException {
		StatementContext _localctx = new StatementContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_statement);
		try {
			setState(56);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case Definition:
				enterOuterAlt(_localctx, 1);
				{
				setState(48);
				initialization();
				}
				break;
			case ID:
				enterOuterAlt(_localctx, 2);
				{
				setState(49);
				assignment();
				}
				break;
			case If:
				enterOuterAlt(_localctx, 3);
				{
				setState(50);
				ifStatement();
				}
				break;
			case While:
				enterOuterAlt(_localctx, 4);
				{
				setState(51);
				whileLoop();
				}
				break;
			case Print:
				enterOuterAlt(_localctx, 5);
				{
				setState(52);
				print();
				}
				break;
			case Load:
				enterOuterAlt(_localctx, 6);
				{
				setState(53);
				load();
				}
				break;
			case HttpGet:
			case HttpPost:
			case HttpPut:
			case HttpPatch:
			case HttpDelete:
				enterOuterAlt(_localctx, 7);
				{
				setState(54);
				httpMethods();
				}
				break;
			case NewLine:
				enterOuterAlt(_localctx, 8);
				{
				setState(55);
				newLine();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ExpressionContext extends ParserRuleContext {
		public ExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expression; }
	 
		public ExpressionContext() { }
		public void copyFrom(ExpressionContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class OrExpressionContext extends ExpressionContext {
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public TerminalNode Or() { return getToken(ReqRestParser.Or, 0); }
		public OrExpressionContext(ExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ReqRestVisitor ) return ((ReqRestVisitor<? extends T>)visitor).visitOrExpression(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class UnaryMinusExpressionContext extends ExpressionContext {
		public TerminalNode Minus() { return getToken(ReqRestParser.Minus, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public UnaryMinusExpressionContext(ExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ReqRestVisitor ) return ((ReqRestVisitor<? extends T>)visitor).visitUnaryMinusExpression(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class AndExpressionContext extends ExpressionContext {
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public TerminalNode And() { return getToken(ReqRestParser.And, 0); }
		public AndExpressionContext(ExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ReqRestVisitor ) return ((ReqRestVisitor<? extends T>)visitor).visitAndExpression(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class AtomExpressionContext extends ExpressionContext {
		public AtomContext atom() {
			return getRuleContext(AtomContext.class,0);
		}
		public AtomExpressionContext(ExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ReqRestVisitor ) return ((ReqRestVisitor<? extends T>)visitor).visitAtomExpression(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class RelationalExpressionContext extends ExpressionContext {
		public Token op;
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public TerminalNode GreaterThan() { return getToken(ReqRestParser.GreaterThan, 0); }
		public TerminalNode GreaterOrEqual() { return getToken(ReqRestParser.GreaterOrEqual, 0); }
		public TerminalNode LowerThan() { return getToken(ReqRestParser.LowerThan, 0); }
		public TerminalNode LowerOrEqual() { return getToken(ReqRestParser.LowerOrEqual, 0); }
		public RelationalExpressionContext(ExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ReqRestVisitor ) return ((ReqRestVisitor<? extends T>)visitor).visitRelationalExpression(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class EqualityExpressionContext extends ExpressionContext {
		public Token op;
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public TerminalNode Equal() { return getToken(ReqRestParser.Equal, 0); }
		public TerminalNode NotEqual() { return getToken(ReqRestParser.NotEqual, 0); }
		public EqualityExpressionContext(ExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ReqRestVisitor ) return ((ReqRestVisitor<? extends T>)visitor).visitEqualityExpression(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class NotExpressionContext extends ExpressionContext {
		public TerminalNode Not() { return getToken(ReqRestParser.Not, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public NotExpressionContext(ExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ReqRestVisitor ) return ((ReqRestVisitor<? extends T>)visitor).visitNotExpression(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class ArithmeticExpressionContext extends ExpressionContext {
		public Token op;
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public TerminalNode Add() { return getToken(ReqRestParser.Add, 0); }
		public TerminalNode Subtract() { return getToken(ReqRestParser.Subtract, 0); }
		public TerminalNode Multiply() { return getToken(ReqRestParser.Multiply, 0); }
		public TerminalNode Divide() { return getToken(ReqRestParser.Divide, 0); }
		public ArithmeticExpressionContext(ExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ReqRestVisitor ) return ((ReqRestVisitor<? extends T>)visitor).visitArithmeticExpression(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ExpressionContext expression() throws RecognitionException {
		return expression(0);
	}

	private ExpressionContext expression(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		ExpressionContext _localctx = new ExpressionContext(_ctx, _parentState);
		ExpressionContext _prevctx = _localctx;
		int _startState = 4;
		enterRecursionRule(_localctx, 4, RULE_expression, _p);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(64);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case Minus:
				{
				_localctx = new UnaryMinusExpressionContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;

				setState(59);
				match(Minus);
				setState(60);
				expression(8);
				}
				break;
			case Not:
				{
				_localctx = new NotExpressionContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(61);
				match(Not);
				setState(62);
				expression(2);
				}
				break;
			case OpeningParenthesis:
			case True:
			case False:
			case ID:
			case Integer:
			case Float:
			case String:
				{
				_localctx = new AtomExpressionContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(63);
				atom();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			_ctx.stop = _input.LT(-1);
			setState(83);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,4,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(81);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,3,_ctx) ) {
					case 1:
						{
						_localctx = new ArithmeticExpressionContext(new ExpressionContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(66);
						if (!(precpred(_ctx, 7))) throw new FailedPredicateException(this, "precpred(_ctx, 7)");
						setState(67);
						((ArithmeticExpressionContext)_localctx).op = _input.LT(1);
						_la = _input.LA(1);
						if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << Add) | (1L << Subtract) | (1L << Multiply) | (1L << Divide))) != 0)) ) {
							((ArithmeticExpressionContext)_localctx).op = (Token)_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						setState(68);
						expression(8);
						}
						break;
					case 2:
						{
						_localctx = new RelationalExpressionContext(new ExpressionContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(69);
						if (!(precpred(_ctx, 6))) throw new FailedPredicateException(this, "precpred(_ctx, 6)");
						setState(70);
						((RelationalExpressionContext)_localctx).op = _input.LT(1);
						_la = _input.LA(1);
						if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << GreaterThan) | (1L << LowerThan) | (1L << GreaterOrEqual) | (1L << LowerOrEqual))) != 0)) ) {
							((RelationalExpressionContext)_localctx).op = (Token)_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						setState(71);
						expression(7);
						}
						break;
					case 3:
						{
						_localctx = new EqualityExpressionContext(new ExpressionContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(72);
						if (!(precpred(_ctx, 5))) throw new FailedPredicateException(this, "precpred(_ctx, 5)");
						setState(73);
						((EqualityExpressionContext)_localctx).op = _input.LT(1);
						_la = _input.LA(1);
						if ( !(_la==Equal || _la==NotEqual) ) {
							((EqualityExpressionContext)_localctx).op = (Token)_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						setState(74);
						expression(6);
						}
						break;
					case 4:
						{
						_localctx = new AndExpressionContext(new ExpressionContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(75);
						if (!(precpred(_ctx, 4))) throw new FailedPredicateException(this, "precpred(_ctx, 4)");
						setState(76);
						match(And);
						setState(77);
						expression(5);
						}
						break;
					case 5:
						{
						_localctx = new OrExpressionContext(new ExpressionContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(78);
						if (!(precpred(_ctx, 3))) throw new FailedPredicateException(this, "precpred(_ctx, 3)");
						setState(79);
						match(Or);
						setState(80);
						expression(4);
						}
						break;
					}
					} 
				}
				setState(85);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,4,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			unrollRecursionContexts(_parentctx);
		}
		return _localctx;
	}

	public static class AtomContext extends ParserRuleContext {
		public AtomContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_atom; }
	 
		public AtomContext() { }
		public void copyFrom(AtomContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class BooleanAtomContext extends AtomContext {
		public TerminalNode True() { return getToken(ReqRestParser.True, 0); }
		public TerminalNode False() { return getToken(ReqRestParser.False, 0); }
		public BooleanAtomContext(AtomContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ReqRestVisitor ) return ((ReqRestVisitor<? extends T>)visitor).visitBooleanAtom(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class IdAtomContext extends AtomContext {
		public TerminalNode ID() { return getToken(ReqRestParser.ID, 0); }
		public IdAtomContext(AtomContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ReqRestVisitor ) return ((ReqRestVisitor<? extends T>)visitor).visitIdAtom(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class StringAtomContext extends AtomContext {
		public TerminalNode String() { return getToken(ReqRestParser.String, 0); }
		public StringAtomContext(AtomContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ReqRestVisitor ) return ((ReqRestVisitor<? extends T>)visitor).visitStringAtom(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class ComplexExpressionContext extends AtomContext {
		public TerminalNode OpeningParenthesis() { return getToken(ReqRestParser.OpeningParenthesis, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public TerminalNode ClosingParenthesis() { return getToken(ReqRestParser.ClosingParenthesis, 0); }
		public ComplexExpressionContext(AtomContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ReqRestVisitor ) return ((ReqRestVisitor<? extends T>)visitor).visitComplexExpression(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class NumberAtomContext extends AtomContext {
		public TerminalNode Integer() { return getToken(ReqRestParser.Integer, 0); }
		public TerminalNode Float() { return getToken(ReqRestParser.Float, 0); }
		public NumberAtomContext(AtomContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ReqRestVisitor ) return ((ReqRestVisitor<? extends T>)visitor).visitNumberAtom(this);
			else return visitor.visitChildren(this);
		}
	}

	public final AtomContext atom() throws RecognitionException {
		AtomContext _localctx = new AtomContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_atom);
		int _la;
		try {
			setState(94);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case OpeningParenthesis:
				_localctx = new ComplexExpressionContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(86);
				match(OpeningParenthesis);
				setState(87);
				expression(0);
				setState(88);
				match(ClosingParenthesis);
				}
				break;
			case Integer:
			case Float:
				_localctx = new NumberAtomContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(90);
				_la = _input.LA(1);
				if ( !(_la==Integer || _la==Float) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				}
				break;
			case True:
			case False:
				_localctx = new BooleanAtomContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(91);
				_la = _input.LA(1);
				if ( !(_la==True || _la==False) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				}
				break;
			case ID:
				_localctx = new IdAtomContext(_localctx);
				enterOuterAlt(_localctx, 4);
				{
				setState(92);
				match(ID);
				}
				break;
			case String:
				_localctx = new StringAtomContext(_localctx);
				enterOuterAlt(_localctx, 5);
				{
				setState(93);
				match(String);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class HttpMethodsContext extends ParserRuleContext {
		public HttpGetContext httpGet() {
			return getRuleContext(HttpGetContext.class,0);
		}
		public HttpPostContext httpPost() {
			return getRuleContext(HttpPostContext.class,0);
		}
		public HttpPutContext httpPut() {
			return getRuleContext(HttpPutContext.class,0);
		}
		public HttpPatchContext httpPatch() {
			return getRuleContext(HttpPatchContext.class,0);
		}
		public HttpDeleteContext httpDelete() {
			return getRuleContext(HttpDeleteContext.class,0);
		}
		public HttpMethodsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_httpMethods; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ReqRestVisitor ) return ((ReqRestVisitor<? extends T>)visitor).visitHttpMethods(this);
			else return visitor.visitChildren(this);
		}
	}

	public final HttpMethodsContext httpMethods() throws RecognitionException {
		HttpMethodsContext _localctx = new HttpMethodsContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_httpMethods);
		try {
			setState(101);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case HttpGet:
				enterOuterAlt(_localctx, 1);
				{
				setState(96);
				httpGet();
				}
				break;
			case HttpPost:
				enterOuterAlt(_localctx, 2);
				{
				setState(97);
				httpPost();
				}
				break;
			case HttpPut:
				enterOuterAlt(_localctx, 3);
				{
				setState(98);
				httpPut();
				}
				break;
			case HttpPatch:
				enterOuterAlt(_localctx, 4);
				{
				setState(99);
				httpPatch();
				}
				break;
			case HttpDelete:
				enterOuterAlt(_localctx, 5);
				{
				setState(100);
				httpDelete();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class HttpGetContext extends ParserRuleContext {
		public TerminalNode HttpGet() { return getToken(ReqRestParser.HttpGet, 0); }
		public TerminalNode OpeningParenthesis() { return getToken(ReqRestParser.OpeningParenthesis, 0); }
		public TerminalNode String() { return getToken(ReqRestParser.String, 0); }
		public TerminalNode ClosingParenthesis() { return getToken(ReqRestParser.ClosingParenthesis, 0); }
		public TerminalNode ExpressionEnd() { return getToken(ReqRestParser.ExpressionEnd, 0); }
		public HttpGetContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_httpGet; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ReqRestVisitor ) return ((ReqRestVisitor<? extends T>)visitor).visitHttpGet(this);
			else return visitor.visitChildren(this);
		}
	}

	public final HttpGetContext httpGet() throws RecognitionException {
		HttpGetContext _localctx = new HttpGetContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_httpGet);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(103);
			match(HttpGet);
			setState(104);
			match(OpeningParenthesis);
			setState(105);
			match(String);
			setState(106);
			match(ClosingParenthesis);
			setState(107);
			match(ExpressionEnd);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class HttpPostContext extends ParserRuleContext {
		public TerminalNode HttpPost() { return getToken(ReqRestParser.HttpPost, 0); }
		public TerminalNode OpeningParenthesis() { return getToken(ReqRestParser.OpeningParenthesis, 0); }
		public List<TerminalNode> String() { return getTokens(ReqRestParser.String); }
		public TerminalNode String(int i) {
			return getToken(ReqRestParser.String, i);
		}
		public TerminalNode Comma() { return getToken(ReqRestParser.Comma, 0); }
		public TerminalNode ClosingParenthesis() { return getToken(ReqRestParser.ClosingParenthesis, 0); }
		public TerminalNode ExpressionEnd() { return getToken(ReqRestParser.ExpressionEnd, 0); }
		public HttpPostContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_httpPost; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ReqRestVisitor ) return ((ReqRestVisitor<? extends T>)visitor).visitHttpPost(this);
			else return visitor.visitChildren(this);
		}
	}

	public final HttpPostContext httpPost() throws RecognitionException {
		HttpPostContext _localctx = new HttpPostContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_httpPost);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(109);
			match(HttpPost);
			setState(110);
			match(OpeningParenthesis);
			setState(111);
			match(String);
			setState(112);
			match(Comma);
			setState(113);
			match(String);
			setState(114);
			match(ClosingParenthesis);
			setState(115);
			match(ExpressionEnd);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class HttpPutContext extends ParserRuleContext {
		public TerminalNode HttpPut() { return getToken(ReqRestParser.HttpPut, 0); }
		public TerminalNode OpeningParenthesis() { return getToken(ReqRestParser.OpeningParenthesis, 0); }
		public List<TerminalNode> String() { return getTokens(ReqRestParser.String); }
		public TerminalNode String(int i) {
			return getToken(ReqRestParser.String, i);
		}
		public TerminalNode Comma() { return getToken(ReqRestParser.Comma, 0); }
		public TerminalNode ClosingParenthesis() { return getToken(ReqRestParser.ClosingParenthesis, 0); }
		public TerminalNode ExpressionEnd() { return getToken(ReqRestParser.ExpressionEnd, 0); }
		public HttpPutContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_httpPut; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ReqRestVisitor ) return ((ReqRestVisitor<? extends T>)visitor).visitHttpPut(this);
			else return visitor.visitChildren(this);
		}
	}

	public final HttpPutContext httpPut() throws RecognitionException {
		HttpPutContext _localctx = new HttpPutContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_httpPut);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(117);
			match(HttpPut);
			setState(118);
			match(OpeningParenthesis);
			setState(119);
			match(String);
			setState(120);
			match(Comma);
			setState(121);
			match(String);
			setState(122);
			match(ClosingParenthesis);
			setState(123);
			match(ExpressionEnd);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class HttpPatchContext extends ParserRuleContext {
		public TerminalNode HttpPatch() { return getToken(ReqRestParser.HttpPatch, 0); }
		public TerminalNode OpeningParenthesis() { return getToken(ReqRestParser.OpeningParenthesis, 0); }
		public List<TerminalNode> String() { return getTokens(ReqRestParser.String); }
		public TerminalNode String(int i) {
			return getToken(ReqRestParser.String, i);
		}
		public TerminalNode Comma() { return getToken(ReqRestParser.Comma, 0); }
		public TerminalNode ClosingParenthesis() { return getToken(ReqRestParser.ClosingParenthesis, 0); }
		public TerminalNode ExpressionEnd() { return getToken(ReqRestParser.ExpressionEnd, 0); }
		public HttpPatchContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_httpPatch; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ReqRestVisitor ) return ((ReqRestVisitor<? extends T>)visitor).visitHttpPatch(this);
			else return visitor.visitChildren(this);
		}
	}

	public final HttpPatchContext httpPatch() throws RecognitionException {
		HttpPatchContext _localctx = new HttpPatchContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_httpPatch);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(125);
			match(HttpPatch);
			setState(126);
			match(OpeningParenthesis);
			setState(127);
			match(String);
			setState(128);
			match(Comma);
			setState(129);
			match(String);
			setState(130);
			match(ClosingParenthesis);
			setState(131);
			match(ExpressionEnd);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class HttpDeleteContext extends ParserRuleContext {
		public TerminalNode HttpDelete() { return getToken(ReqRestParser.HttpDelete, 0); }
		public TerminalNode OpeningParenthesis() { return getToken(ReqRestParser.OpeningParenthesis, 0); }
		public TerminalNode String() { return getToken(ReqRestParser.String, 0); }
		public TerminalNode ClosingParenthesis() { return getToken(ReqRestParser.ClosingParenthesis, 0); }
		public TerminalNode ExpressionEnd() { return getToken(ReqRestParser.ExpressionEnd, 0); }
		public HttpDeleteContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_httpDelete; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ReqRestVisitor ) return ((ReqRestVisitor<? extends T>)visitor).visitHttpDelete(this);
			else return visitor.visitChildren(this);
		}
	}

	public final HttpDeleteContext httpDelete() throws RecognitionException {
		HttpDeleteContext _localctx = new HttpDeleteContext(_ctx, getState());
		enterRule(_localctx, 18, RULE_httpDelete);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(133);
			match(HttpDelete);
			setState(134);
			match(OpeningParenthesis);
			setState(135);
			match(String);
			setState(136);
			match(ClosingParenthesis);
			setState(137);
			match(ExpressionEnd);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class InitializationContext extends ParserRuleContext {
		public TerminalNode Definition() { return getToken(ReqRestParser.Definition, 0); }
		public TerminalNode ID() { return getToken(ReqRestParser.ID, 0); }
		public TerminalNode Assign() { return getToken(ReqRestParser.Assign, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public TerminalNode ExpressionEnd() { return getToken(ReqRestParser.ExpressionEnd, 0); }
		public HttpMethodsContext httpMethods() {
			return getRuleContext(HttpMethodsContext.class,0);
		}
		public InitializationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_initialization; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ReqRestVisitor ) return ((ReqRestVisitor<? extends T>)visitor).visitInitialization(this);
			else return visitor.visitChildren(this);
		}
	}

	public final InitializationContext initialization() throws RecognitionException {
		InitializationContext _localctx = new InitializationContext(_ctx, getState());
		enterRule(_localctx, 20, RULE_initialization);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(139);
			match(Definition);
			setState(140);
			match(ID);
			setState(141);
			match(Assign);
			setState(146);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case Not:
			case OpeningParenthesis:
			case True:
			case False:
			case ID:
			case Minus:
			case Integer:
			case Float:
			case String:
				{
				setState(142);
				expression(0);
				setState(143);
				match(ExpressionEnd);
				}
				break;
			case HttpGet:
			case HttpPost:
			case HttpPut:
			case HttpPatch:
			case HttpDelete:
				{
				setState(145);
				httpMethods();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class AssignmentContext extends ParserRuleContext {
		public TerminalNode ID() { return getToken(ReqRestParser.ID, 0); }
		public TerminalNode Assign() { return getToken(ReqRestParser.Assign, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public TerminalNode ExpressionEnd() { return getToken(ReqRestParser.ExpressionEnd, 0); }
		public HttpMethodsContext httpMethods() {
			return getRuleContext(HttpMethodsContext.class,0);
		}
		public AssignmentContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_assignment; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ReqRestVisitor ) return ((ReqRestVisitor<? extends T>)visitor).visitAssignment(this);
			else return visitor.visitChildren(this);
		}
	}

	public final AssignmentContext assignment() throws RecognitionException {
		AssignmentContext _localctx = new AssignmentContext(_ctx, getState());
		enterRule(_localctx, 22, RULE_assignment);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(148);
			match(ID);
			setState(149);
			match(Assign);
			setState(154);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case Not:
			case OpeningParenthesis:
			case True:
			case False:
			case ID:
			case Minus:
			case Integer:
			case Float:
			case String:
				{
				setState(150);
				expression(0);
				setState(151);
				match(ExpressionEnd);
				}
				break;
			case HttpGet:
			case HttpPost:
			case HttpPut:
			case HttpPatch:
			case HttpDelete:
				{
				setState(153);
				httpMethods();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class PrintContext extends ParserRuleContext {
		public TerminalNode Print() { return getToken(ReqRestParser.Print, 0); }
		public TerminalNode OpeningParenthesis() { return getToken(ReqRestParser.OpeningParenthesis, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public TerminalNode ClosingParenthesis() { return getToken(ReqRestParser.ClosingParenthesis, 0); }
		public TerminalNode ExpressionEnd() { return getToken(ReqRestParser.ExpressionEnd, 0); }
		public PrintContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_print; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ReqRestVisitor ) return ((ReqRestVisitor<? extends T>)visitor).visitPrint(this);
			else return visitor.visitChildren(this);
		}
	}

	public final PrintContext print() throws RecognitionException {
		PrintContext _localctx = new PrintContext(_ctx, getState());
		enterRule(_localctx, 24, RULE_print);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(156);
			match(Print);
			setState(157);
			match(OpeningParenthesis);
			setState(158);
			expression(0);
			setState(159);
			match(ClosingParenthesis);
			setState(160);
			match(ExpressionEnd);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class LoadContext extends ParserRuleContext {
		public TerminalNode Load() { return getToken(ReqRestParser.Load, 0); }
		public TerminalNode OpeningParenthesis() { return getToken(ReqRestParser.OpeningParenthesis, 0); }
		public TerminalNode ID() { return getToken(ReqRestParser.ID, 0); }
		public TerminalNode ClosingParenthesis() { return getToken(ReqRestParser.ClosingParenthesis, 0); }
		public TerminalNode ExpressionEnd() { return getToken(ReqRestParser.ExpressionEnd, 0); }
		public LoadContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_load; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ReqRestVisitor ) return ((ReqRestVisitor<? extends T>)visitor).visitLoad(this);
			else return visitor.visitChildren(this);
		}
	}

	public final LoadContext load() throws RecognitionException {
		LoadContext _localctx = new LoadContext(_ctx, getState());
		enterRule(_localctx, 26, RULE_load);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(162);
			match(Load);
			setState(163);
			match(OpeningParenthesis);
			setState(164);
			match(ID);
			setState(165);
			match(ClosingParenthesis);
			setState(166);
			match(ExpressionEnd);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class NewLineContext extends ParserRuleContext {
		public TerminalNode NewLine() { return getToken(ReqRestParser.NewLine, 0); }
		public TerminalNode ExpressionEnd() { return getToken(ReqRestParser.ExpressionEnd, 0); }
		public NewLineContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_newLine; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ReqRestVisitor ) return ((ReqRestVisitor<? extends T>)visitor).visitNewLine(this);
			else return visitor.visitChildren(this);
		}
	}

	public final NewLineContext newLine() throws RecognitionException {
		NewLineContext _localctx = new NewLineContext(_ctx, getState());
		enterRule(_localctx, 28, RULE_newLine);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(168);
			match(NewLine);
			setState(169);
			match(ExpressionEnd);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class IfStatementContext extends ParserRuleContext {
		public TerminalNode If() { return getToken(ReqRestParser.If, 0); }
		public List<ConditionBlockContext> conditionBlock() {
			return getRuleContexts(ConditionBlockContext.class);
		}
		public ConditionBlockContext conditionBlock(int i) {
			return getRuleContext(ConditionBlockContext.class,i);
		}
		public List<TerminalNode> Elsif() { return getTokens(ReqRestParser.Elsif); }
		public TerminalNode Elsif(int i) {
			return getToken(ReqRestParser.Elsif, i);
		}
		public TerminalNode Else() { return getToken(ReqRestParser.Else, 0); }
		public StatementBlockContext statementBlock() {
			return getRuleContext(StatementBlockContext.class,0);
		}
		public IfStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_ifStatement; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ReqRestVisitor ) return ((ReqRestVisitor<? extends T>)visitor).visitIfStatement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final IfStatementContext ifStatement() throws RecognitionException {
		IfStatementContext _localctx = new IfStatementContext(_ctx, getState());
		enterRule(_localctx, 30, RULE_ifStatement);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(171);
			match(If);
			setState(172);
			conditionBlock();
			setState(177);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,9,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(173);
					match(Elsif);
					setState(174);
					conditionBlock();
					}
					} 
				}
				setState(179);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,9,_ctx);
			}
			setState(182);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,10,_ctx) ) {
			case 1:
				{
				setState(180);
				match(Else);
				setState(181);
				statementBlock();
				}
				break;
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ConditionBlockContext extends ParserRuleContext {
		public TerminalNode OpeningParenthesis() { return getToken(ReqRestParser.OpeningParenthesis, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public TerminalNode ClosingParenthesis() { return getToken(ReqRestParser.ClosingParenthesis, 0); }
		public StatementBlockContext statementBlock() {
			return getRuleContext(StatementBlockContext.class,0);
		}
		public ConditionBlockContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_conditionBlock; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ReqRestVisitor ) return ((ReqRestVisitor<? extends T>)visitor).visitConditionBlock(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ConditionBlockContext conditionBlock() throws RecognitionException {
		ConditionBlockContext _localctx = new ConditionBlockContext(_ctx, getState());
		enterRule(_localctx, 32, RULE_conditionBlock);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(184);
			match(OpeningParenthesis);
			setState(185);
			expression(0);
			setState(186);
			match(ClosingParenthesis);
			setState(187);
			statementBlock();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class StatementBlockContext extends ParserRuleContext {
		public TerminalNode OpeningCurlyBracket() { return getToken(ReqRestParser.OpeningCurlyBracket, 0); }
		public TerminalNode ClosingCurlyBracket() { return getToken(ReqRestParser.ClosingCurlyBracket, 0); }
		public List<StatementContext> statement() {
			return getRuleContexts(StatementContext.class);
		}
		public StatementContext statement(int i) {
			return getRuleContext(StatementContext.class,i);
		}
		public StatementBlockContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_statementBlock; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ReqRestVisitor ) return ((ReqRestVisitor<? extends T>)visitor).visitStatementBlock(this);
			else return visitor.visitChildren(this);
		}
	}

	public final StatementBlockContext statementBlock() throws RecognitionException {
		StatementBlockContext _localctx = new StatementBlockContext(_ctx, getState());
		enterRule(_localctx, 34, RULE_statementBlock);
		int _la;
		try {
			setState(198);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case OpeningCurlyBracket:
				enterOuterAlt(_localctx, 1);
				{
				setState(189);
				match(OpeningCurlyBracket);
				setState(193);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << If) | (1L << While) | (1L << Load) | (1L << Print) | (1L << HttpGet) | (1L << HttpPost) | (1L << HttpPut) | (1L << HttpPatch) | (1L << HttpDelete) | (1L << Definition) | (1L << NewLine) | (1L << ID))) != 0)) {
					{
					{
					setState(190);
					statement();
					}
					}
					setState(195);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(196);
				match(ClosingCurlyBracket);
				}
				break;
			case If:
			case While:
			case Load:
			case Print:
			case HttpGet:
			case HttpPost:
			case HttpPut:
			case HttpPatch:
			case HttpDelete:
			case Definition:
			case NewLine:
			case ID:
				enterOuterAlt(_localctx, 2);
				{
				setState(197);
				statement();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class WhileLoopContext extends ParserRuleContext {
		public TerminalNode While() { return getToken(ReqRestParser.While, 0); }
		public TerminalNode OpeningParenthesis() { return getToken(ReqRestParser.OpeningParenthesis, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public TerminalNode ClosingParenthesis() { return getToken(ReqRestParser.ClosingParenthesis, 0); }
		public StatementBlockContext statementBlock() {
			return getRuleContext(StatementBlockContext.class,0);
		}
		public WhileLoopContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_whileLoop; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ReqRestVisitor ) return ((ReqRestVisitor<? extends T>)visitor).visitWhileLoop(this);
			else return visitor.visitChildren(this);
		}
	}

	public final WhileLoopContext whileLoop() throws RecognitionException {
		WhileLoopContext _localctx = new WhileLoopContext(_ctx, getState());
		enterRule(_localctx, 36, RULE_whileLoop);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(200);
			match(While);
			setState(201);
			match(OpeningParenthesis);
			setState(202);
			expression(0);
			setState(203);
			match(ClosingParenthesis);
			setState(204);
			statementBlock();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public boolean sempred(RuleContext _localctx, int ruleIndex, int predIndex) {
		switch (ruleIndex) {
		case 2:
			return expression_sempred((ExpressionContext)_localctx, predIndex);
		}
		return true;
	}
	private boolean expression_sempred(ExpressionContext _localctx, int predIndex) {
		switch (predIndex) {
		case 0:
			return precpred(_ctx, 7);
		case 1:
			return precpred(_ctx, 6);
		case 2:
			return precpred(_ctx, 5);
		case 3:
			return precpred(_ctx, 4);
		case 4:
			return precpred(_ctx, 3);
		}
		return true;
	}

	public static final String _serializedATN =
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\3.\u00d1\4\2\t\2\4"+
		"\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13\t"+
		"\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\3\2\3\2\7\2+\n\2\f\2\16\2.\13\2\3\2\3\2\3\2\3\3\3"+
		"\3\3\3\3\3\3\3\3\3\3\3\3\3\5\3;\n\3\3\4\3\4\3\4\3\4\3\4\3\4\5\4C\n\4\3"+
		"\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\7\4T\n\4\f"+
		"\4\16\4W\13\4\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\5\5a\n\5\3\6\3\6\3\6\3\6"+
		"\3\6\5\6h\n\6\3\7\3\7\3\7\3\7\3\7\3\7\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b"+
		"\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\13"+
		"\3\13\3\13\3\13\3\13\3\13\3\f\3\f\3\f\3\f\3\f\3\f\3\f\5\f\u0095\n\f\3"+
		"\r\3\r\3\r\3\r\3\r\3\r\5\r\u009d\n\r\3\16\3\16\3\16\3\16\3\16\3\16\3\17"+
		"\3\17\3\17\3\17\3\17\3\17\3\20\3\20\3\20\3\21\3\21\3\21\3\21\7\21\u00b2"+
		"\n\21\f\21\16\21\u00b5\13\21\3\21\3\21\5\21\u00b9\n\21\3\22\3\22\3\22"+
		"\3\22\3\22\3\23\3\23\7\23\u00c2\n\23\f\23\16\23\u00c5\13\23\3\23\3\23"+
		"\5\23\u00c9\n\23\3\24\3\24\3\24\3\24\3\24\3\24\3\24\2\3\6\25\2\4\6\b\n"+
		"\f\16\20\22\24\26\30\32\34\36 \"$&\2\7\3\2\f\17\3\2\22\25\3\2\20\21\3"+
		"\2*+\3\2&\'\2\u00da\2(\3\2\2\2\4:\3\2\2\2\6B\3\2\2\2\b`\3\2\2\2\ng\3\2"+
		"\2\2\fi\3\2\2\2\16o\3\2\2\2\20w\3\2\2\2\22\177\3\2\2\2\24\u0087\3\2\2"+
		"\2\26\u008d\3\2\2\2\30\u0096\3\2\2\2\32\u009e\3\2\2\2\34\u00a4\3\2\2\2"+
		"\36\u00aa\3\2\2\2 \u00ad\3\2\2\2\"\u00ba\3\2\2\2$\u00c8\3\2\2\2&\u00ca"+
		"\3\2\2\2(,\7\3\2\2)+\5\4\3\2*)\3\2\2\2+.\3\2\2\2,*\3\2\2\2,-\3\2\2\2-"+
		"/\3\2\2\2.,\3\2\2\2/\60\7\4\2\2\60\61\7\2\2\3\61\3\3\2\2\2\62;\5\26\f"+
		"\2\63;\5\30\r\2\64;\5 \21\2\65;\5&\24\2\66;\5\32\16\2\67;\5\34\17\28;"+
		"\5\n\6\29;\5\36\20\2:\62\3\2\2\2:\63\3\2\2\2:\64\3\2\2\2:\65\3\2\2\2:"+
		"\66\3\2\2\2:\67\3\2\2\2:8\3\2\2\2:9\3\2\2\2;\5\3\2\2\2<=\b\4\1\2=>\7)"+
		"\2\2>C\5\6\4\n?@\7\26\2\2@C\5\6\4\4AC\5\b\5\2B<\3\2\2\2B?\3\2\2\2BA\3"+
		"\2\2\2CU\3\2\2\2DE\f\t\2\2EF\t\2\2\2FT\5\6\4\nGH\f\b\2\2HI\t\3\2\2IT\5"+
		"\6\4\tJK\f\7\2\2KL\t\4\2\2LT\5\6\4\bMN\f\6\2\2NO\7\27\2\2OT\5\6\4\7PQ"+
		"\f\5\2\2QR\7\30\2\2RT\5\6\4\6SD\3\2\2\2SG\3\2\2\2SJ\3\2\2\2SM\3\2\2\2"+
		"SP\3\2\2\2TW\3\2\2\2US\3\2\2\2UV\3\2\2\2V\7\3\2\2\2WU\3\2\2\2XY\7\37\2"+
		"\2YZ\5\6\4\2Z[\7 \2\2[a\3\2\2\2\\a\t\5\2\2]a\t\6\2\2^a\7(\2\2_a\7,\2\2"+
		"`X\3\2\2\2`\\\3\2\2\2`]\3\2\2\2`^\3\2\2\2`_\3\2\2\2a\t\3\2\2\2bh\5\f\7"+
		"\2ch\5\16\b\2dh\5\20\t\2eh\5\22\n\2fh\5\24\13\2gb\3\2\2\2gc\3\2\2\2gd"+
		"\3\2\2\2ge\3\2\2\2gf\3\2\2\2h\13\3\2\2\2ij\7\32\2\2jk\7\37\2\2kl\7,\2"+
		"\2lm\7 \2\2mn\7\31\2\2n\r\3\2\2\2op\7\33\2\2pq\7\37\2\2qr\7,\2\2rs\7$"+
		"\2\2st\7,\2\2tu\7 \2\2uv\7\31\2\2v\17\3\2\2\2wx\7\34\2\2xy\7\37\2\2yz"+
		"\7,\2\2z{\7$\2\2{|\7,\2\2|}\7 \2\2}~\7\31\2\2~\21\3\2\2\2\177\u0080\7"+
		"\35\2\2\u0080\u0081\7\37\2\2\u0081\u0082\7,\2\2\u0082\u0083\7$\2\2\u0083"+
		"\u0084\7,\2\2\u0084\u0085\7 \2\2\u0085\u0086\7\31\2\2\u0086\23\3\2\2\2"+
		"\u0087\u0088\7\36\2\2\u0088\u0089\7\37\2\2\u0089\u008a\7,\2\2\u008a\u008b"+
		"\7 \2\2\u008b\u008c\7\31\2\2\u008c\25\3\2\2\2\u008d\u008e\7#\2\2\u008e"+
		"\u008f\7(\2\2\u008f\u0094\7\13\2\2\u0090\u0091\5\6\4\2\u0091\u0092\7\31"+
		"\2\2\u0092\u0095\3\2\2\2\u0093\u0095\5\n\6\2\u0094\u0090\3\2\2\2\u0094"+
		"\u0093\3\2\2\2\u0095\27\3\2\2\2\u0096\u0097\7(\2\2\u0097\u009c\7\13\2"+
		"\2\u0098\u0099\5\6\4\2\u0099\u009a\7\31\2\2\u009a\u009d\3\2\2\2\u009b"+
		"\u009d\5\n\6\2\u009c\u0098\3\2\2\2\u009c\u009b\3\2\2\2\u009d\31\3\2\2"+
		"\2\u009e\u009f\7\n\2\2\u009f\u00a0\7\37\2\2\u00a0\u00a1\5\6\4\2\u00a1"+
		"\u00a2\7 \2\2\u00a2\u00a3\7\31\2\2\u00a3\33\3\2\2\2\u00a4\u00a5\7\t\2"+
		"\2\u00a5\u00a6\7\37\2\2\u00a6\u00a7\7(\2\2\u00a7\u00a8\7 \2\2\u00a8\u00a9"+
		"\7\31\2\2\u00a9\35\3\2\2\2\u00aa\u00ab\7%\2\2\u00ab\u00ac\7\31\2\2\u00ac"+
		"\37\3\2\2\2\u00ad\u00ae\7\5\2\2\u00ae\u00b3\5\"\22\2\u00af\u00b0\7\6\2"+
		"\2\u00b0\u00b2\5\"\22\2\u00b1\u00af\3\2\2\2\u00b2\u00b5\3\2\2\2\u00b3"+
		"\u00b1\3\2\2\2\u00b3\u00b4\3\2\2\2\u00b4\u00b8\3\2\2\2\u00b5\u00b3\3\2"+
		"\2\2\u00b6\u00b7\7\7\2\2\u00b7\u00b9\5$\23\2\u00b8\u00b6\3\2\2\2\u00b8"+
		"\u00b9\3\2\2\2\u00b9!\3\2\2\2\u00ba\u00bb\7\37\2\2\u00bb\u00bc\5\6\4\2"+
		"\u00bc\u00bd\7 \2\2\u00bd\u00be\5$\23\2\u00be#\3\2\2\2\u00bf\u00c3\7!"+
		"\2\2\u00c0\u00c2\5\4\3\2\u00c1\u00c0\3\2\2\2\u00c2\u00c5\3\2\2\2\u00c3"+
		"\u00c1\3\2\2\2\u00c3\u00c4\3\2\2\2\u00c4\u00c6\3\2\2\2\u00c5\u00c3\3\2"+
		"\2\2\u00c6\u00c9\7\"\2\2\u00c7\u00c9\5\4\3\2\u00c8\u00bf\3\2\2\2\u00c8"+
		"\u00c7\3\2\2\2\u00c9%\3\2\2\2\u00ca\u00cb\7\b\2\2\u00cb\u00cc\7\37\2\2"+
		"\u00cc\u00cd\5\6\4\2\u00cd\u00ce\7 \2\2\u00ce\u00cf\5$\23\2\u00cf\'\3"+
		"\2\2\2\17,:BSU`g\u0094\u009c\u00b3\u00b8\u00c3\u00c8";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}