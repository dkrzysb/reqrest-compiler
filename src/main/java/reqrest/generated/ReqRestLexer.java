package reqrest.generated;
import org.antlr.v4.runtime.Lexer;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.TokenStream;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.misc.*;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class ReqRestLexer extends Lexer {
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
	public static String[] channelNames = {
		"DEFAULT_TOKEN_CHANNEL", "HIDDEN"
	};

	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	private static String[] makeRuleNames() {
		return new String[] {
			"Start", "Finish", "If", "Elsif", "Else", "While", "Load", "Print", "Assign", 
			"Add", "Subtract", "Multiply", "Divide", "Equal", "NotEqual", "GreaterThan", 
			"LowerThan", "GreaterOrEqual", "LowerOrEqual", "Not", "And", "Or", "ExpressionEnd", 
			"HttpGet", "HttpPost", "HttpPut", "HttpPatch", "HttpDelete", "OpeningParenthesis", 
			"ClosingParenthesis", "OpeningCurlyBracket", "ClosingCurlyBracket", "Definition", 
			"Comma", "NewLine", "True", "False", "ID", "Minus", "Integer", "Float", 
			"String", "Comment", "Whitespaces"
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


	public ReqRestLexer(CharStream input) {
		super(input);
		_interp = new LexerATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@Override
	public String getGrammarFileName() { return "ReqRest.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public String[] getChannelNames() { return channelNames; }

	@Override
	public String[] getModeNames() { return modeNames; }

	@Override
	public ATN getATN() { return _ATN; }

	public static final String _serializedATN =
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\2.\u0131\b\1\4\2\t"+
		"\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13"+
		"\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31\t\31"+
		"\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37\t\37\4 \t \4!"+
		"\t!\4\"\t\"\4#\t#\4$\t$\4%\t%\4&\t&\4\'\t\'\4(\t(\4)\t)\4*\t*\4+\t+\4"+
		",\t,\4-\t-\3\2\3\2\3\2\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\4\3\4\3\4\3\5\3\5"+
		"\3\5\3\5\3\5\3\5\3\6\3\6\3\6\3\6\3\6\3\7\3\7\3\7\3\7\3\7\3\7\3\b\3\b\3"+
		"\b\3\b\3\b\3\t\3\t\3\t\3\t\3\t\3\t\3\n\3\n\3\13\3\13\3\13\3\13\3\f\3\f"+
		"\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\16"+
		"\3\16\3\16\3\16\3\16\3\16\3\16\3\17\3\17\3\17\3\20\3\20\3\20\3\20\3\21"+
		"\3\21\3\21\3\22\3\22\3\22\3\23\3\23\3\23\3\24\3\24\3\24\3\25\3\25\3\26"+
		"\3\26\3\26\3\27\3\27\3\27\3\30\3\30\3\31\3\31\3\31\3\31\3\32\3\32\3\32"+
		"\3\32\3\32\3\33\3\33\3\33\3\33\3\34\3\34\3\34\3\34\3\34\3\34\3\35\3\35"+
		"\3\35\3\35\3\35\3\35\3\35\3\36\3\36\3\37\3\37\3 \3 \3!\3!\3\"\3\"\3\""+
		"\3\"\3#\3#\3$\3$\3$\3$\3$\3$\3$\3$\3%\3%\3%\3%\3%\3&\3&\3&\3&\3&\3&\3"+
		"\'\6\'\u00fd\n\'\r\'\16\'\u00fe\3\'\7\'\u0102\n\'\f\'\16\'\u0105\13\'"+
		"\3(\3(\3)\6)\u010a\n)\r)\16)\u010b\3*\6*\u010f\n*\r*\16*\u0110\3*\3*\7"+
		"*\u0115\n*\f*\16*\u0118\13*\3+\3+\3+\3+\7+\u011e\n+\f+\16+\u0121\13+\3"+
		"+\3+\3,\3,\7,\u0127\n,\f,\16,\u012a\13,\3,\3,\3-\3-\3-\3-\2\2.\3\3\5\4"+
		"\7\5\t\6\13\7\r\b\17\t\21\n\23\13\25\f\27\r\31\16\33\17\35\20\37\21!\22"+
		"#\23%\24\'\25)\26+\27-\30/\31\61\32\63\33\65\34\67\359\36;\37= ?!A\"C"+
		"#E$G%I&K\'M(O)Q*S+U,W-Y.\3\2\b\4\2C\\c|\6\2\62;C\\aac|\3\2\62;\5\2\f\f"+
		"\17\17$$\4\2\f\f\17\17\5\2\13\f\17\17\"\"\2\u0138\2\3\3\2\2\2\2\5\3\2"+
		"\2\2\2\7\3\2\2\2\2\t\3\2\2\2\2\13\3\2\2\2\2\r\3\2\2\2\2\17\3\2\2\2\2\21"+
		"\3\2\2\2\2\23\3\2\2\2\2\25\3\2\2\2\2\27\3\2\2\2\2\31\3\2\2\2\2\33\3\2"+
		"\2\2\2\35\3\2\2\2\2\37\3\2\2\2\2!\3\2\2\2\2#\3\2\2\2\2%\3\2\2\2\2\'\3"+
		"\2\2\2\2)\3\2\2\2\2+\3\2\2\2\2-\3\2\2\2\2/\3\2\2\2\2\61\3\2\2\2\2\63\3"+
		"\2\2\2\2\65\3\2\2\2\2\67\3\2\2\2\29\3\2\2\2\2;\3\2\2\2\2=\3\2\2\2\2?\3"+
		"\2\2\2\2A\3\2\2\2\2C\3\2\2\2\2E\3\2\2\2\2G\3\2\2\2\2I\3\2\2\2\2K\3\2\2"+
		"\2\2M\3\2\2\2\2O\3\2\2\2\2Q\3\2\2\2\2S\3\2\2\2\2U\3\2\2\2\2W\3\2\2\2\2"+
		"Y\3\2\2\2\3[\3\2\2\2\5^\3\2\2\2\7e\3\2\2\2\th\3\2\2\2\13n\3\2\2\2\rs\3"+
		"\2\2\2\17y\3\2\2\2\21~\3\2\2\2\23\u0084\3\2\2\2\25\u0086\3\2\2\2\27\u008a"+
		"\3\2\2\2\31\u0093\3\2\2\2\33\u009c\3\2\2\2\35\u00a3\3\2\2\2\37\u00a6\3"+
		"\2\2\2!\u00aa\3\2\2\2#\u00ad\3\2\2\2%\u00b0\3\2\2\2\'\u00b3\3\2\2\2)\u00b6"+
		"\3\2\2\2+\u00b8\3\2\2\2-\u00bb\3\2\2\2/\u00be\3\2\2\2\61\u00c0\3\2\2\2"+
		"\63\u00c4\3\2\2\2\65\u00c9\3\2\2\2\67\u00cd\3\2\2\29\u00d3\3\2\2\2;\u00da"+
		"\3\2\2\2=\u00dc\3\2\2\2?\u00de\3\2\2\2A\u00e0\3\2\2\2C\u00e2\3\2\2\2E"+
		"\u00e6\3\2\2\2G\u00e8\3\2\2\2I\u00f0\3\2\2\2K\u00f5\3\2\2\2M\u00fc\3\2"+
		"\2\2O\u0106\3\2\2\2Q\u0109\3\2\2\2S\u010e\3\2\2\2U\u0119\3\2\2\2W\u0124"+
		"\3\2\2\2Y\u012d\3\2\2\2[\\\7i\2\2\\]\7q\2\2]\4\3\2\2\2^_\7h\2\2_`\7k\2"+
		"\2`a\7p\2\2ab\7k\2\2bc\7u\2\2cd\7j\2\2d\6\3\2\2\2ef\7k\2\2fg\7h\2\2g\b"+
		"\3\2\2\2hi\7g\2\2ij\7n\2\2jk\7u\2\2kl\7k\2\2lm\7h\2\2m\n\3\2\2\2no\7g"+
		"\2\2op\7n\2\2pq\7u\2\2qr\7g\2\2r\f\3\2\2\2st\7y\2\2tu\7j\2\2uv\7k\2\2"+
		"vw\7n\2\2wx\7g\2\2x\16\3\2\2\2yz\7n\2\2z{\7q\2\2{|\7c\2\2|}\7f\2\2}\20"+
		"\3\2\2\2~\177\7r\2\2\177\u0080\7t\2\2\u0080\u0081\7k\2\2\u0081\u0082\7"+
		"p\2\2\u0082\u0083\7v\2\2\u0083\22\3\2\2\2\u0084\u0085\7?\2\2\u0085\24"+
		"\3\2\2\2\u0086\u0087\7c\2\2\u0087\u0088\7f\2\2\u0088\u0089\7f\2\2\u0089"+
		"\26\3\2\2\2\u008a\u008b\7u\2\2\u008b\u008c\7w\2\2\u008c\u008d\7d\2\2\u008d"+
		"\u008e\7v\2\2\u008e\u008f\7t\2\2\u008f\u0090\7c\2\2\u0090\u0091\7e\2\2"+
		"\u0091\u0092\7v\2\2\u0092\30\3\2\2\2\u0093\u0094\7o\2\2\u0094\u0095\7"+
		"w\2\2\u0095\u0096\7n\2\2\u0096\u0097\7v\2\2\u0097\u0098\7k\2\2\u0098\u0099"+
		"\7r\2\2\u0099\u009a\7n\2\2\u009a\u009b\7{\2\2\u009b\32\3\2\2\2\u009c\u009d"+
		"\7f\2\2\u009d\u009e\7k\2\2\u009e\u009f\7x\2\2\u009f\u00a0\7k\2\2\u00a0"+
		"\u00a1\7f\2\2\u00a1\u00a2\7g\2\2\u00a2\34\3\2\2\2\u00a3\u00a4\7g\2\2\u00a4"+
		"\u00a5\7s\2\2\u00a5\36\3\2\2\2\u00a6\u00a7\7p\2\2\u00a7\u00a8\7g\2\2\u00a8"+
		"\u00a9\7s\2\2\u00a9 \3\2\2\2\u00aa\u00ab\7i\2\2\u00ab\u00ac\7v\2\2\u00ac"+
		"\"\3\2\2\2\u00ad\u00ae\7n\2\2\u00ae\u00af\7v\2\2\u00af$\3\2\2\2\u00b0"+
		"\u00b1\7i\2\2\u00b1\u00b2\7g\2\2\u00b2&\3\2\2\2\u00b3\u00b4\7n\2\2\u00b4"+
		"\u00b5\7g\2\2\u00b5(\3\2\2\2\u00b6\u00b7\7\u0080\2\2\u00b7*\3\2\2\2\u00b8"+
		"\u00b9\7(\2\2\u00b9\u00ba\7(\2\2\u00ba,\3\2\2\2\u00bb\u00bc\7~\2\2\u00bc"+
		"\u00bd\7~\2\2\u00bd.\3\2\2\2\u00be\u00bf\7%\2\2\u00bf\60\3\2\2\2\u00c0"+
		"\u00c1\7i\2\2\u00c1\u00c2\7g\2\2\u00c2\u00c3\7v\2\2\u00c3\62\3\2\2\2\u00c4"+
		"\u00c5\7r\2\2\u00c5\u00c6\7q\2\2\u00c6\u00c7\7u\2\2\u00c7\u00c8\7v\2\2"+
		"\u00c8\64\3\2\2\2\u00c9\u00ca\7r\2\2\u00ca\u00cb\7w\2\2\u00cb\u00cc\7"+
		"v\2\2\u00cc\66\3\2\2\2\u00cd\u00ce\7r\2\2\u00ce\u00cf\7c\2\2\u00cf\u00d0"+
		"\7v\2\2\u00d0\u00d1\7e\2\2\u00d1\u00d2\7j\2\2\u00d28\3\2\2\2\u00d3\u00d4"+
		"\7f\2\2\u00d4\u00d5\7g\2\2\u00d5\u00d6\7n\2\2\u00d6\u00d7\7g\2\2\u00d7"+
		"\u00d8\7v\2\2\u00d8\u00d9\7g\2\2\u00d9:\3\2\2\2\u00da\u00db\7*\2\2\u00db"+
		"<\3\2\2\2\u00dc\u00dd\7+\2\2\u00dd>\3\2\2\2\u00de\u00df\7}\2\2\u00df@"+
		"\3\2\2\2\u00e0\u00e1\7\177\2\2\u00e1B\3\2\2\2\u00e2\u00e3\7f\2\2\u00e3"+
		"\u00e4\7g\2\2\u00e4\u00e5\7h\2\2\u00e5D\3\2\2\2\u00e6\u00e7\7.\2\2\u00e7"+
		"F\3\2\2\2\u00e8\u00e9\7p\2\2\u00e9\u00ea\7g\2\2\u00ea\u00eb\7y\2\2\u00eb"+
		"\u00ec\7n\2\2\u00ec\u00ed\7k\2\2\u00ed\u00ee\7p\2\2\u00ee\u00ef\7g\2\2"+
		"\u00efH\3\2\2\2\u00f0\u00f1\7v\2\2\u00f1\u00f2\7t\2\2\u00f2\u00f3\7w\2"+
		"\2\u00f3\u00f4\7g\2\2\u00f4J\3\2\2\2\u00f5\u00f6\7h\2\2\u00f6\u00f7\7"+
		"c\2\2\u00f7\u00f8\7n\2\2\u00f8\u00f9\7u\2\2\u00f9\u00fa\7g\2\2\u00faL"+
		"\3\2\2\2\u00fb\u00fd\t\2\2\2\u00fc\u00fb\3\2\2\2\u00fd\u00fe\3\2\2\2\u00fe"+
		"\u00fc\3\2\2\2\u00fe\u00ff\3\2\2\2\u00ff\u0103\3\2\2\2\u0100\u0102\t\3"+
		"\2\2\u0101\u0100\3\2\2\2\u0102\u0105\3\2\2\2\u0103\u0101\3\2\2\2\u0103"+
		"\u0104\3\2\2\2\u0104N\3\2\2\2\u0105\u0103\3\2\2\2\u0106\u0107\7/\2\2\u0107"+
		"P\3\2\2\2\u0108\u010a\t\4\2\2\u0109\u0108\3\2\2\2\u010a\u010b\3\2\2\2"+
		"\u010b\u0109\3\2\2\2\u010b\u010c\3\2\2\2\u010cR\3\2\2\2\u010d\u010f\t"+
		"\4\2\2\u010e\u010d\3\2\2\2\u010f\u0110\3\2\2\2\u0110\u010e\3\2\2\2\u0110"+
		"\u0111\3\2\2\2\u0111\u0112\3\2\2\2\u0112\u0116\7\60\2\2\u0113\u0115\t"+
		"\4\2\2\u0114\u0113\3\2\2\2\u0115\u0118\3\2\2\2\u0116\u0114\3\2\2\2\u0116"+
		"\u0117\3\2\2\2\u0117T\3\2\2\2\u0118\u0116\3\2\2\2\u0119\u011f\7$\2\2\u011a"+
		"\u011e\n\5\2\2\u011b\u011c\7$\2\2\u011c\u011e\7$\2\2\u011d\u011a\3\2\2"+
		"\2\u011d\u011b\3\2\2\2\u011e\u0121\3\2\2\2\u011f\u011d\3\2\2\2\u011f\u0120"+
		"\3\2\2\2\u0120\u0122\3\2\2\2\u0121\u011f\3\2\2\2\u0122\u0123\7$\2\2\u0123"+
		"V\3\2\2\2\u0124\u0128\7%\2\2\u0125\u0127\n\6\2\2\u0126\u0125\3\2\2\2\u0127"+
		"\u012a\3\2\2\2\u0128\u0126\3\2\2\2\u0128\u0129\3\2\2\2\u0129\u012b\3\2"+
		"\2\2\u012a\u0128\3\2\2\2\u012b\u012c\b,\2\2\u012cX\3\2\2\2\u012d\u012e"+
		"\t\7\2\2\u012e\u012f\3\2\2\2\u012f\u0130\b-\2\2\u0130Z\3\2\2\2\13\2\u00fe"+
		"\u0103\u010b\u0110\u0116\u011d\u011f\u0128\3\b\2\2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}