// Generated from Grace.g4 by ANTLR 4.7.1
import org.antlr.v4.runtime.Lexer;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.TokenStream;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.misc.*;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class GraceLexer extends Lexer {
	static { RuntimeMetaData.checkVersion("4.7.1", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		BOOL_KW=1, DEF_KW=2, ELSE_KW=3, FOR_KW=4, IF_KW=5, INT_KW=6, READ_KW=7, 
		RETURN_KW=8, SKIP_KW=9, STOP_KW=10, STRING_KW=11, VAR_KW=12, WHILE_KW=13, 
		WRITE_KW=14, PAREN_OPEN=15, PAREN_CLOSE=16, BRACKETS_OPEN=17, BRACKETS_CLOSE=18, 
		CBRACES_OPEN=19, CBRACES_CLOSE=20, COMMA=21, COLON=22, SEMICOLON=23, PLUS=24, 
		MINUS=25, TIMES=26, DIV=27, PERCENT=28, EQUAL=29, NEQUAL=30, GREATER=31, 
		GREATER_OR_EQUAL=32, OR=33, AND=34, NOT=35, ATTRIB=36, ATTRIB_PLUS=37, 
		ATTRIB_MINUS=38, ATTRIB_TIMES=39, ATTRIB_DIV=40, ATTRIB_PERCENT=41, TERNARY=42, 
		IDENTIFIER=43, INTEGER=44, BOOLEAN=45, STRING=46, IGNORE=47, COMMENT=48;
	public static String[] channelNames = {
		"DEFAULT_TOKEN_CHANNEL", "HIDDEN"
	};

	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	public static final String[] ruleNames = {
		"LOWERCASE", "UPPERCASE", "NUMBER", "ASCII", "ESCAPED_QUOTE", "WHITESPACE", 
		"BOOL_KW", "DEF_KW", "ELSE_KW", "FOR_KW", "IF_KW", "INT_KW", "READ_KW", 
		"RETURN_KW", "SKIP_KW", "STOP_KW", "STRING_KW", "VAR_KW", "WHILE_KW", 
		"WRITE_KW", "PAREN_OPEN", "PAREN_CLOSE", "BRACKETS_OPEN", "BRACKETS_CLOSE", 
		"CBRACES_OPEN", "CBRACES_CLOSE", "COMMA", "COLON", "SEMICOLON", "PLUS", 
		"MINUS", "TIMES", "DIV", "PERCENT", "EQUAL", "NEQUAL", "GREATER", "GREATER_OR_EQUAL", 
		"OR", "AND", "NOT", "ATTRIB", "ATTRIB_PLUS", "ATTRIB_MINUS", "ATTRIB_TIMES", 
		"ATTRIB_DIV", "ATTRIB_PERCENT", "TERNARY", "IDENTIFIER", "INTEGER", "BOOLEAN", 
		"STRING", "IGNORE", "COMMENT"
	};

	private static final String[] _LITERAL_NAMES = {
		null, "'bool'", "'def'", "'else'", "'for'", "'if'", "'int'", "'read'", 
		"'return'", "'skip'", "'stop'", "'string'", "'var'", "'while'", "'write'", 
		"'('", "')'", "'['", "']'", "'{'", "'}'", "','", "':'", "';'", "'+'", 
		"'-'", "'*'", "'/'", "'%'", "'=='", "'!='", "'>'", "'>='", "'||'", "'&&'", 
		"'!'", "'='", "'+='", "'-='", "'*='", "'/='", "'%='", "'?'"
	};
	private static final String[] _SYMBOLIC_NAMES = {
		null, "BOOL_KW", "DEF_KW", "ELSE_KW", "FOR_KW", "IF_KW", "INT_KW", "READ_KW", 
		"RETURN_KW", "SKIP_KW", "STOP_KW", "STRING_KW", "VAR_KW", "WHILE_KW", 
		"WRITE_KW", "PAREN_OPEN", "PAREN_CLOSE", "BRACKETS_OPEN", "BRACKETS_CLOSE", 
		"CBRACES_OPEN", "CBRACES_CLOSE", "COMMA", "COLON", "SEMICOLON", "PLUS", 
		"MINUS", "TIMES", "DIV", "PERCENT", "EQUAL", "NEQUAL", "GREATER", "GREATER_OR_EQUAL", 
		"OR", "AND", "NOT", "ATTRIB", "ATTRIB_PLUS", "ATTRIB_MINUS", "ATTRIB_TIMES", 
		"ATTRIB_DIV", "ATTRIB_PERCENT", "TERNARY", "IDENTIFIER", "INTEGER", "BOOLEAN", 
		"STRING", "IGNORE", "COMMENT"
	};
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


	public GraceLexer(CharStream input) {
		super(input);
		_interp = new LexerATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@Override
	public String getGrammarFileName() { return "Grace.g4"; }

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
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\2\62\u014c\b\1\4\2"+
		"\t\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4"+
		"\13\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22"+
		"\t\22\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31"+
		"\t\31\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37\t\37\4 \t"+
		" \4!\t!\4\"\t\"\4#\t#\4$\t$\4%\t%\4&\t&\4\'\t\'\4(\t(\4)\t)\4*\t*\4+\t"+
		"+\4,\t,\4-\t-\4.\t.\4/\t/\4\60\t\60\4\61\t\61\4\62\t\62\4\63\t\63\4\64"+
		"\t\64\4\65\t\65\4\66\t\66\4\67\t\67\3\2\6\2q\n\2\r\2\16\2r\3\3\6\3v\n"+
		"\3\r\3\16\3w\3\4\3\4\3\5\3\5\3\6\3\6\3\6\3\7\3\7\3\b\3\b\3\b\3\b\3\b\3"+
		"\t\3\t\3\t\3\t\3\n\3\n\3\n\3\n\3\n\3\13\3\13\3\13\3\13\3\f\3\f\3\f\3\r"+
		"\3\r\3\r\3\r\3\16\3\16\3\16\3\16\3\16\3\17\3\17\3\17\3\17\3\17\3\17\3"+
		"\17\3\20\3\20\3\20\3\20\3\20\3\21\3\21\3\21\3\21\3\21\3\22\3\22\3\22\3"+
		"\22\3\22\3\22\3\22\3\23\3\23\3\23\3\23\3\24\3\24\3\24\3\24\3\24\3\24\3"+
		"\25\3\25\3\25\3\25\3\25\3\25\3\26\3\26\3\27\3\27\3\30\3\30\3\31\3\31\3"+
		"\32\3\32\3\33\3\33\3\34\3\34\3\35\3\35\3\36\3\36\3\37\3\37\3 \3 \3!\3"+
		"!\3\"\3\"\3#\3#\3$\3$\3$\3%\3%\3%\3&\3&\3\'\3\'\3\'\3(\3(\3(\3)\3)\3)"+
		"\3*\3*\3+\3+\3,\3,\3,\3-\3-\3-\3.\3.\3.\3/\3/\3/\3\60\3\60\3\60\3\61\3"+
		"\61\3\62\3\62\3\62\5\62\u010e\n\62\3\62\3\62\3\62\3\62\6\62\u0114\n\62"+
		"\r\62\16\62\u0115\3\63\6\63\u0119\n\63\r\63\16\63\u011a\3\64\3\64\3\64"+
		"\3\64\3\64\3\64\3\64\3\64\3\64\5\64\u0126\n\64\3\65\3\65\3\65\3\65\3\65"+
		"\3\65\3\65\6\65\u012f\n\65\r\65\16\65\u0130\3\65\3\65\3\66\6\66\u0136"+
		"\n\66\r\66\16\66\u0137\3\66\3\66\3\67\3\67\3\67\3\67\3\67\3\67\3\67\3"+
		"\67\3\67\6\67\u0145\n\67\r\67\16\67\u0146\3\67\3\67\3\67\3\67\2\28\3\2"+
		"\5\2\7\2\t\2\13\2\r\2\17\3\21\4\23\5\25\6\27\7\31\b\33\t\35\n\37\13!\f"+
		"#\r%\16\'\17)\20+\21-\22/\23\61\24\63\25\65\26\67\279\30;\31=\32?\33A"+
		"\34C\35E\36G\37I K!M\"O#Q$S%U&W\'Y([)]*_+a,c-e.g/i\60k\61m\62\3\2\7\3"+
		"\2c|\3\2C\\\3\2\62;\3\2\2\u0081\5\2\13\f\17\17\"\"\2\u015c\2\17\3\2\2"+
		"\2\2\21\3\2\2\2\2\23\3\2\2\2\2\25\3\2\2\2\2\27\3\2\2\2\2\31\3\2\2\2\2"+
		"\33\3\2\2\2\2\35\3\2\2\2\2\37\3\2\2\2\2!\3\2\2\2\2#\3\2\2\2\2%\3\2\2\2"+
		"\2\'\3\2\2\2\2)\3\2\2\2\2+\3\2\2\2\2-\3\2\2\2\2/\3\2\2\2\2\61\3\2\2\2"+
		"\2\63\3\2\2\2\2\65\3\2\2\2\2\67\3\2\2\2\29\3\2\2\2\2;\3\2\2\2\2=\3\2\2"+
		"\2\2?\3\2\2\2\2A\3\2\2\2\2C\3\2\2\2\2E\3\2\2\2\2G\3\2\2\2\2I\3\2\2\2\2"+
		"K\3\2\2\2\2M\3\2\2\2\2O\3\2\2\2\2Q\3\2\2\2\2S\3\2\2\2\2U\3\2\2\2\2W\3"+
		"\2\2\2\2Y\3\2\2\2\2[\3\2\2\2\2]\3\2\2\2\2_\3\2\2\2\2a\3\2\2\2\2c\3\2\2"+
		"\2\2e\3\2\2\2\2g\3\2\2\2\2i\3\2\2\2\2k\3\2\2\2\2m\3\2\2\2\3p\3\2\2\2\5"+
		"u\3\2\2\2\7y\3\2\2\2\t{\3\2\2\2\13}\3\2\2\2\r\u0080\3\2\2\2\17\u0082\3"+
		"\2\2\2\21\u0087\3\2\2\2\23\u008b\3\2\2\2\25\u0090\3\2\2\2\27\u0094\3\2"+
		"\2\2\31\u0097\3\2\2\2\33\u009b\3\2\2\2\35\u00a0\3\2\2\2\37\u00a7\3\2\2"+
		"\2!\u00ac\3\2\2\2#\u00b1\3\2\2\2%\u00b8\3\2\2\2\'\u00bc\3\2\2\2)\u00c2"+
		"\3\2\2\2+\u00c8\3\2\2\2-\u00ca\3\2\2\2/\u00cc\3\2\2\2\61\u00ce\3\2\2\2"+
		"\63\u00d0\3\2\2\2\65\u00d2\3\2\2\2\67\u00d4\3\2\2\29\u00d6\3\2\2\2;\u00d8"+
		"\3\2\2\2=\u00da\3\2\2\2?\u00dc\3\2\2\2A\u00de\3\2\2\2C\u00e0\3\2\2\2E"+
		"\u00e2\3\2\2\2G\u00e4\3\2\2\2I\u00e7\3\2\2\2K\u00ea\3\2\2\2M\u00ec\3\2"+
		"\2\2O\u00ef\3\2\2\2Q\u00f2\3\2\2\2S\u00f5\3\2\2\2U\u00f7\3\2\2\2W\u00f9"+
		"\3\2\2\2Y\u00fc\3\2\2\2[\u00ff\3\2\2\2]\u0102\3\2\2\2_\u0105\3\2\2\2a"+
		"\u0108\3\2\2\2c\u010d\3\2\2\2e\u0118\3\2\2\2g\u0125\3\2\2\2i\u0127\3\2"+
		"\2\2k\u0135\3\2\2\2m\u013b\3\2\2\2oq\t\2\2\2po\3\2\2\2qr\3\2\2\2rp\3\2"+
		"\2\2rs\3\2\2\2s\4\3\2\2\2tv\t\3\2\2ut\3\2\2\2vw\3\2\2\2wu\3\2\2\2wx\3"+
		"\2\2\2x\6\3\2\2\2yz\t\4\2\2z\b\3\2\2\2{|\t\5\2\2|\n\3\2\2\2}~\7^\2\2~"+
		"\177\7$\2\2\177\f\3\2\2\2\u0080\u0081\7\"\2\2\u0081\16\3\2\2\2\u0082\u0083"+
		"\7d\2\2\u0083\u0084\7q\2\2\u0084\u0085\7q\2\2\u0085\u0086\7n\2\2\u0086"+
		"\20\3\2\2\2\u0087\u0088\7f\2\2\u0088\u0089\7g\2\2\u0089\u008a\7h\2\2\u008a"+
		"\22\3\2\2\2\u008b\u008c\7g\2\2\u008c\u008d\7n\2\2\u008d\u008e\7u\2\2\u008e"+
		"\u008f\7g\2\2\u008f\24\3\2\2\2\u0090\u0091\7h\2\2\u0091\u0092\7q\2\2\u0092"+
		"\u0093\7t\2\2\u0093\26\3\2\2\2\u0094\u0095\7k\2\2\u0095\u0096\7h\2\2\u0096"+
		"\30\3\2\2\2\u0097\u0098\7k\2\2\u0098\u0099\7p\2\2\u0099\u009a\7v\2\2\u009a"+
		"\32\3\2\2\2\u009b\u009c\7t\2\2\u009c\u009d\7g\2\2\u009d\u009e\7c\2\2\u009e"+
		"\u009f\7f\2\2\u009f\34\3\2\2\2\u00a0\u00a1\7t\2\2\u00a1\u00a2\7g\2\2\u00a2"+
		"\u00a3\7v\2\2\u00a3\u00a4\7w\2\2\u00a4\u00a5\7t\2\2\u00a5\u00a6\7p\2\2"+
		"\u00a6\36\3\2\2\2\u00a7\u00a8\7u\2\2\u00a8\u00a9\7m\2\2\u00a9\u00aa\7"+
		"k\2\2\u00aa\u00ab\7r\2\2\u00ab \3\2\2\2\u00ac\u00ad\7u\2\2\u00ad\u00ae"+
		"\7v\2\2\u00ae\u00af\7q\2\2\u00af\u00b0\7r\2\2\u00b0\"\3\2\2\2\u00b1\u00b2"+
		"\7u\2\2\u00b2\u00b3\7v\2\2\u00b3\u00b4\7t\2\2\u00b4\u00b5\7k\2\2\u00b5"+
		"\u00b6\7p\2\2\u00b6\u00b7\7i\2\2\u00b7$\3\2\2\2\u00b8\u00b9\7x\2\2\u00b9"+
		"\u00ba\7c\2\2\u00ba\u00bb\7t\2\2\u00bb&\3\2\2\2\u00bc\u00bd\7y\2\2\u00bd"+
		"\u00be\7j\2\2\u00be\u00bf\7k\2\2\u00bf\u00c0\7n\2\2\u00c0\u00c1\7g\2\2"+
		"\u00c1(\3\2\2\2\u00c2\u00c3\7y\2\2\u00c3\u00c4\7t\2\2\u00c4\u00c5\7k\2"+
		"\2\u00c5\u00c6\7v\2\2\u00c6\u00c7\7g\2\2\u00c7*\3\2\2\2\u00c8\u00c9\7"+
		"*\2\2\u00c9,\3\2\2\2\u00ca\u00cb\7+\2\2\u00cb.\3\2\2\2\u00cc\u00cd\7]"+
		"\2\2\u00cd\60\3\2\2\2\u00ce\u00cf\7_\2\2\u00cf\62\3\2\2\2\u00d0\u00d1"+
		"\7}\2\2\u00d1\64\3\2\2\2\u00d2\u00d3\7\177\2\2\u00d3\66\3\2\2\2\u00d4"+
		"\u00d5\7.\2\2\u00d58\3\2\2\2\u00d6\u00d7\7<\2\2\u00d7:\3\2\2\2\u00d8\u00d9"+
		"\7=\2\2\u00d9<\3\2\2\2\u00da\u00db\7-\2\2\u00db>\3\2\2\2\u00dc\u00dd\7"+
		"/\2\2\u00dd@\3\2\2\2\u00de\u00df\7,\2\2\u00dfB\3\2\2\2\u00e0\u00e1\7\61"+
		"\2\2\u00e1D\3\2\2\2\u00e2\u00e3\7\'\2\2\u00e3F\3\2\2\2\u00e4\u00e5\7?"+
		"\2\2\u00e5\u00e6\7?\2\2\u00e6H\3\2\2\2\u00e7\u00e8\7#\2\2\u00e8\u00e9"+
		"\7?\2\2\u00e9J\3\2\2\2\u00ea\u00eb\7@\2\2\u00ebL\3\2\2\2\u00ec\u00ed\7"+
		"@\2\2\u00ed\u00ee\7?\2\2\u00eeN\3\2\2\2\u00ef\u00f0\7~\2\2\u00f0\u00f1"+
		"\7~\2\2\u00f1P\3\2\2\2\u00f2\u00f3\7(\2\2\u00f3\u00f4\7(\2\2\u00f4R\3"+
		"\2\2\2\u00f5\u00f6\7#\2\2\u00f6T\3\2\2\2\u00f7\u00f8\7?\2\2\u00f8V\3\2"+
		"\2\2\u00f9\u00fa\7-\2\2\u00fa\u00fb\7?\2\2\u00fbX\3\2\2\2\u00fc\u00fd"+
		"\7/\2\2\u00fd\u00fe\7?\2\2\u00feZ\3\2\2\2\u00ff\u0100\7,\2\2\u0100\u0101"+
		"\7?\2\2\u0101\\\3\2\2\2\u0102\u0103\7\61\2\2\u0103\u0104\7?\2\2\u0104"+
		"^\3\2\2\2\u0105\u0106\7\'\2\2\u0106\u0107\7?\2\2\u0107`\3\2\2\2\u0108"+
		"\u0109\7A\2\2\u0109b\3\2\2\2\u010a\u010e\7a\2\2\u010b\u010e\5\3\2\2\u010c"+
		"\u010e\5\5\3\2\u010d\u010a\3\2\2\2\u010d\u010b\3\2\2\2\u010d\u010c\3\2"+
		"\2\2\u010e\u0113\3\2\2\2\u010f\u0114\7a\2\2\u0110\u0114\5\3\2\2\u0111"+
		"\u0114\5\5\3\2\u0112\u0114\5\7\4\2\u0113\u010f\3\2\2\2\u0113\u0110\3\2"+
		"\2\2\u0113\u0111\3\2\2\2\u0113\u0112\3\2\2\2\u0114\u0115\3\2\2\2\u0115"+
		"\u0113\3\2\2\2\u0115\u0116\3\2\2\2\u0116d\3\2\2\2\u0117\u0119\5\7\4\2"+
		"\u0118\u0117\3\2\2\2\u0119\u011a\3\2\2\2\u011a\u0118\3\2\2\2\u011a\u011b"+
		"\3\2\2\2\u011bf\3\2\2\2\u011c\u011d\7v\2\2\u011d\u011e\7t\2\2\u011e\u011f"+
		"\7w\2\2\u011f\u0126\7g\2\2\u0120\u0121\7h\2\2\u0121\u0122\7c\2\2\u0122"+
		"\u0123\7n\2\2\u0123\u0124\7u\2\2\u0124\u0126\7g\2\2\u0125\u011c\3\2\2"+
		"\2\u0125\u0120\3\2\2\2\u0126h\3\2\2\2\u0127\u012e\7$\2\2\u0128\u012f\5"+
		"\3\2\2\u0129\u012f\5\5\3\2\u012a\u012f\5\13\6\2\u012b\u012f\5\r\7\2\u012c"+
		"\u012f\5\7\4\2\u012d\u012f\5\t\5\2\u012e\u0128\3\2\2\2\u012e\u0129\3\2"+
		"\2\2\u012e\u012a\3\2\2\2\u012e\u012b\3\2\2\2\u012e\u012c\3\2\2\2\u012e"+
		"\u012d\3\2\2\2\u012f\u0130\3\2\2\2\u0130\u012e\3\2\2\2\u0130\u0131\3\2"+
		"\2\2\u0131\u0132\3\2\2\2\u0132\u0133\7$\2\2\u0133j\3\2\2\2\u0134\u0136"+
		"\t\6\2\2\u0135\u0134\3\2\2\2\u0136\u0137\3\2\2\2\u0137\u0135\3\2\2\2\u0137"+
		"\u0138\3\2\2\2\u0138\u0139\3\2\2\2\u0139\u013a\b\66\2\2\u013al\3\2\2\2"+
		"\u013b\u013c\7\61\2\2\u013c\u013d\7\61\2\2\u013d\u0144\3\2\2\2\u013e\u0145"+
		"\5\3\2\2\u013f\u0145\5\5\3\2\u0140\u0145\5\13\6\2\u0141\u0145\5\r\7\2"+
		"\u0142\u0145\5\7\4\2\u0143\u0145\5\t\5\2\u0144\u013e\3\2\2\2\u0144\u013f"+
		"\3\2\2\2\u0144\u0140\3\2\2\2\u0144\u0141\3\2\2\2\u0144\u0142\3\2\2\2\u0144"+
		"\u0143\3\2\2\2\u0145\u0146\3\2\2\2\u0146\u0144\3\2\2\2\u0146\u0147\3\2"+
		"\2\2\u0147\u0148\3\2\2\2\u0148\u0149\7\f\2\2\u0149\u014a\3\2\2\2\u014a"+
		"\u014b\b\67\2\2\u014bn\3\2\2\2\17\2rw\u010d\u0113\u0115\u011a\u0125\u012e"+
		"\u0130\u0137\u0144\u0146\3\b\2\2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}