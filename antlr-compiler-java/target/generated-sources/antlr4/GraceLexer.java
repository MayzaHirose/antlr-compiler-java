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
		WRITE_KW=14, OP_ATRIBUICAO=15, OP_ARITMETICO=16, PAREN_OPEN=17, PAREN_CLOSE=18, 
		BRACKETS_OPEN=19, BRACKETS_CLOSE=20, CBRACES_OPEN=21, CBRACES_CLOSE=22, 
		COMMA=23, COLON=24, SEMICOLON=25, ATTRIB_PLUS=26, ATTRIB_MINUS=27, ATTRIB_TIMES=28, 
		ATTRIB_DIV=29, ATTRIB_REMAINDER=30, PLUS=31, MINUS=32, TIMES=33, DIV=34, 
		REMAINDER=35, EQUAL=36, NEQUAL=37, GREATER=38, GREATER_OR_EQUAL=39, OR=40, 
		AND=41, NOT=42, ATTRIB=43, TERNARY=44, INTEGER=45, BOOLEAN=46, TRUE=47, 
		FALSE=48, STRING=49, COMMENT=50, IGNORE=51, IDENTIFIER=52;
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
		"WRITE_KW", "OP_ATRIBUICAO", "OP_ARITMETICO", "PAREN_OPEN", "PAREN_CLOSE", 
		"BRACKETS_OPEN", "BRACKETS_CLOSE", "CBRACES_OPEN", "CBRACES_CLOSE", "COMMA", 
		"COLON", "SEMICOLON", "ATTRIB_PLUS", "ATTRIB_MINUS", "ATTRIB_TIMES", "ATTRIB_DIV", 
		"ATTRIB_REMAINDER", "PLUS", "MINUS", "TIMES", "DIV", "REMAINDER", "EQUAL", 
		"NEQUAL", "GREATER", "GREATER_OR_EQUAL", "OR", "AND", "NOT", "ATTRIB", 
		"TERNARY", "INTEGER", "BOOLEAN", "TRUE", "FALSE", "STRING", "COMMENT", 
		"IGNORE", "IDENTIFIER"
	};

	private static final String[] _LITERAL_NAMES = {
		null, "'bool'", "'def'", "'else'", "'for'", "'if'", "'int'", "'read'", 
		"'return'", "'skip'", "'stop'", "'string'", "'var'", "'while'", "'write'", 
		null, null, "'('", "')'", "'['", "']'", "'{'", "'}'", "','", "':'", "';'", 
		"'+='", "'-='", "'*='", "'/='", "'%='", "'+'", "'-'", "'*'", "'/'", "'%'", 
		"'=='", "'!='", "'>'", "'>='", "'||'", "'&&'", "'!'", "'='", "'?'", null, 
		null, "'true'", "'false'"
	};
	private static final String[] _SYMBOLIC_NAMES = {
		null, "BOOL_KW", "DEF_KW", "ELSE_KW", "FOR_KW", "IF_KW", "INT_KW", "READ_KW", 
		"RETURN_KW", "SKIP_KW", "STOP_KW", "STRING_KW", "VAR_KW", "WHILE_KW", 
		"WRITE_KW", "OP_ATRIBUICAO", "OP_ARITMETICO", "PAREN_OPEN", "PAREN_CLOSE", 
		"BRACKETS_OPEN", "BRACKETS_CLOSE", "CBRACES_OPEN", "CBRACES_CLOSE", "COMMA", 
		"COLON", "SEMICOLON", "ATTRIB_PLUS", "ATTRIB_MINUS", "ATTRIB_TIMES", "ATTRIB_DIV", 
		"ATTRIB_REMAINDER", "PLUS", "MINUS", "TIMES", "DIV", "REMAINDER", "EQUAL", 
		"NEQUAL", "GREATER", "GREATER_OR_EQUAL", "OR", "AND", "NOT", "ATTRIB", 
		"TERNARY", "INTEGER", "BOOLEAN", "TRUE", "FALSE", "STRING", "COMMENT", 
		"IGNORE", "IDENTIFIER"
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
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\2\66\u015e\b\1\4\2"+
		"\t\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4"+
		"\13\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22"+
		"\t\22\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31"+
		"\t\31\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37\t\37\4 \t"+
		" \4!\t!\4\"\t\"\4#\t#\4$\t$\4%\t%\4&\t&\4\'\t\'\4(\t(\4)\t)\4*\t*\4+\t"+
		"+\4,\t,\4-\t-\4.\t.\4/\t/\4\60\t\60\4\61\t\61\4\62\t\62\4\63\t\63\4\64"+
		"\t\64\4\65\t\65\4\66\t\66\4\67\t\67\48\t8\49\t9\4:\t:\4;\t;\3\2\6\2y\n"+
		"\2\r\2\16\2z\3\3\6\3~\n\3\r\3\16\3\177\3\4\3\4\3\5\3\5\3\6\3\6\3\6\3\7"+
		"\3\7\3\b\3\b\3\b\3\b\3\b\3\t\3\t\3\t\3\t\3\n\3\n\3\n\3\n\3\n\3\13\3\13"+
		"\3\13\3\13\3\f\3\f\3\f\3\r\3\r\3\r\3\r\3\16\3\16\3\16\3\16\3\16\3\17\3"+
		"\17\3\17\3\17\3\17\3\17\3\17\3\20\3\20\3\20\3\20\3\20\3\21\3\21\3\21\3"+
		"\21\3\21\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3\23\3\23\3\23\3\23\3\24\3"+
		"\24\3\24\3\24\3\24\3\24\3\25\3\25\3\25\3\25\3\25\3\25\3\26\3\26\3\26\5"+
		"\26\u00d4\n\26\3\27\3\27\3\27\3\27\3\27\5\27\u00db\n\27\3\30\3\30\3\31"+
		"\3\31\3\32\3\32\3\33\3\33\3\34\3\34\3\35\3\35\3\36\3\36\3\37\3\37\3 \3"+
		" \3!\3!\3!\3\"\3\"\3\"\3#\3#\3#\3$\3$\3$\3%\3%\3%\3&\3&\3\'\3\'\3(\3("+
		"\3)\3)\3*\3*\3+\3+\3+\3,\3,\3,\3-\3-\3.\3.\3.\3/\3/\3/\3\60\3\60\3\60"+
		"\3\61\3\61\3\62\3\62\3\63\3\63\3\64\6\64\u0120\n\64\r\64\16\64\u0121\3"+
		"\65\3\65\5\65\u0126\n\65\3\66\3\66\3\66\3\66\3\66\3\67\3\67\3\67\3\67"+
		"\3\67\3\67\38\38\38\38\38\38\68\u0139\n8\r8\168\u013a\38\38\39\39\39\3"+
		"9\69\u0143\n9\r9\169\u0144\39\39\3:\6:\u014a\n:\r:\16:\u014b\3:\3:\3;"+
		"\3;\3;\5;\u0153\n;\3;\3;\3;\3;\6;\u0159\n;\r;\16;\u015a\5;\u015d\n;\2"+
		"\2<\3\2\5\2\7\2\t\2\13\2\r\2\17\3\21\4\23\5\25\6\27\7\31\b\33\t\35\n\37"+
		"\13!\f#\r%\16\'\17)\20+\21-\22/\23\61\24\63\25\65\26\67\279\30;\31=\32"+
		"?\33A\34C\35E\36G\37I K!M\"O#Q$S%U&W\'Y([)]*_+a,c-e.g/i\60k\61m\62o\63"+
		"q\64s\65u\66\3\2\b\3\2c|\3\2C\\\3\2\62;\3\2\2\u0081\4\2\f\f\17\17\5\2"+
		"\13\f\17\17\"\"\2\u016f\2\17\3\2\2\2\2\21\3\2\2\2\2\23\3\2\2\2\2\25\3"+
		"\2\2\2\2\27\3\2\2\2\2\31\3\2\2\2\2\33\3\2\2\2\2\35\3\2\2\2\2\37\3\2\2"+
		"\2\2!\3\2\2\2\2#\3\2\2\2\2%\3\2\2\2\2\'\3\2\2\2\2)\3\2\2\2\2+\3\2\2\2"+
		"\2-\3\2\2\2\2/\3\2\2\2\2\61\3\2\2\2\2\63\3\2\2\2\2\65\3\2\2\2\2\67\3\2"+
		"\2\2\29\3\2\2\2\2;\3\2\2\2\2=\3\2\2\2\2?\3\2\2\2\2A\3\2\2\2\2C\3\2\2\2"+
		"\2E\3\2\2\2\2G\3\2\2\2\2I\3\2\2\2\2K\3\2\2\2\2M\3\2\2\2\2O\3\2\2\2\2Q"+
		"\3\2\2\2\2S\3\2\2\2\2U\3\2\2\2\2W\3\2\2\2\2Y\3\2\2\2\2[\3\2\2\2\2]\3\2"+
		"\2\2\2_\3\2\2\2\2a\3\2\2\2\2c\3\2\2\2\2e\3\2\2\2\2g\3\2\2\2\2i\3\2\2\2"+
		"\2k\3\2\2\2\2m\3\2\2\2\2o\3\2\2\2\2q\3\2\2\2\2s\3\2\2\2\2u\3\2\2\2\3x"+
		"\3\2\2\2\5}\3\2\2\2\7\u0081\3\2\2\2\t\u0083\3\2\2\2\13\u0085\3\2\2\2\r"+
		"\u0088\3\2\2\2\17\u008a\3\2\2\2\21\u008f\3\2\2\2\23\u0093\3\2\2\2\25\u0098"+
		"\3\2\2\2\27\u009c\3\2\2\2\31\u009f\3\2\2\2\33\u00a3\3\2\2\2\35\u00a8\3"+
		"\2\2\2\37\u00af\3\2\2\2!\u00b4\3\2\2\2#\u00b9\3\2\2\2%\u00c0\3\2\2\2\'"+
		"\u00c4\3\2\2\2)\u00ca\3\2\2\2+\u00d3\3\2\2\2-\u00da\3\2\2\2/\u00dc\3\2"+
		"\2\2\61\u00de\3\2\2\2\63\u00e0\3\2\2\2\65\u00e2\3\2\2\2\67\u00e4\3\2\2"+
		"\29\u00e6\3\2\2\2;\u00e8\3\2\2\2=\u00ea\3\2\2\2?\u00ec\3\2\2\2A\u00ee"+
		"\3\2\2\2C\u00f1\3\2\2\2E\u00f4\3\2\2\2G\u00f7\3\2\2\2I\u00fa\3\2\2\2K"+
		"\u00fd\3\2\2\2M\u00ff\3\2\2\2O\u0101\3\2\2\2Q\u0103\3\2\2\2S\u0105\3\2"+
		"\2\2U\u0107\3\2\2\2W\u010a\3\2\2\2Y\u010d\3\2\2\2[\u010f\3\2\2\2]\u0112"+
		"\3\2\2\2_\u0115\3\2\2\2a\u0118\3\2\2\2c\u011a\3\2\2\2e\u011c\3\2\2\2g"+
		"\u011f\3\2\2\2i\u0125\3\2\2\2k\u0127\3\2\2\2m\u012c\3\2\2\2o\u0132\3\2"+
		"\2\2q\u013e\3\2\2\2s\u0149\3\2\2\2u\u0152\3\2\2\2wy\t\2\2\2xw\3\2\2\2"+
		"yz\3\2\2\2zx\3\2\2\2z{\3\2\2\2{\4\3\2\2\2|~\t\3\2\2}|\3\2\2\2~\177\3\2"+
		"\2\2\177}\3\2\2\2\177\u0080\3\2\2\2\u0080\6\3\2\2\2\u0081\u0082\t\4\2"+
		"\2\u0082\b\3\2\2\2\u0083\u0084\t\5\2\2\u0084\n\3\2\2\2\u0085\u0086\7^"+
		"\2\2\u0086\u0087\7$\2\2\u0087\f\3\2\2\2\u0088\u0089\7\"\2\2\u0089\16\3"+
		"\2\2\2\u008a\u008b\7d\2\2\u008b\u008c\7q\2\2\u008c\u008d\7q\2\2\u008d"+
		"\u008e\7n\2\2\u008e\20\3\2\2\2\u008f\u0090\7f\2\2\u0090\u0091\7g\2\2\u0091"+
		"\u0092\7h\2\2\u0092\22\3\2\2\2\u0093\u0094\7g\2\2\u0094\u0095\7n\2\2\u0095"+
		"\u0096\7u\2\2\u0096\u0097\7g\2\2\u0097\24\3\2\2\2\u0098\u0099\7h\2\2\u0099"+
		"\u009a\7q\2\2\u009a\u009b\7t\2\2\u009b\26\3\2\2\2\u009c\u009d\7k\2\2\u009d"+
		"\u009e\7h\2\2\u009e\30\3\2\2\2\u009f\u00a0\7k\2\2\u00a0\u00a1\7p\2\2\u00a1"+
		"\u00a2\7v\2\2\u00a2\32\3\2\2\2\u00a3\u00a4\7t\2\2\u00a4\u00a5\7g\2\2\u00a5"+
		"\u00a6\7c\2\2\u00a6\u00a7\7f\2\2\u00a7\34\3\2\2\2\u00a8\u00a9\7t\2\2\u00a9"+
		"\u00aa\7g\2\2\u00aa\u00ab\7v\2\2\u00ab\u00ac\7w\2\2\u00ac\u00ad\7t\2\2"+
		"\u00ad\u00ae\7p\2\2\u00ae\36\3\2\2\2\u00af\u00b0\7u\2\2\u00b0\u00b1\7"+
		"m\2\2\u00b1\u00b2\7k\2\2\u00b2\u00b3\7r\2\2\u00b3 \3\2\2\2\u00b4\u00b5"+
		"\7u\2\2\u00b5\u00b6\7v\2\2\u00b6\u00b7\7q\2\2\u00b7\u00b8\7r\2\2\u00b8"+
		"\"\3\2\2\2\u00b9\u00ba\7u\2\2\u00ba\u00bb\7v\2\2\u00bb\u00bc\7t\2\2\u00bc"+
		"\u00bd\7k\2\2\u00bd\u00be\7p\2\2\u00be\u00bf\7i\2\2\u00bf$\3\2\2\2\u00c0"+
		"\u00c1\7x\2\2\u00c1\u00c2\7c\2\2\u00c2\u00c3\7t\2\2\u00c3&\3\2\2\2\u00c4"+
		"\u00c5\7y\2\2\u00c5\u00c6\7j\2\2\u00c6\u00c7\7k\2\2\u00c7\u00c8\7n\2\2"+
		"\u00c8\u00c9\7g\2\2\u00c9(\3\2\2\2\u00ca\u00cb\7y\2\2\u00cb\u00cc\7t\2"+
		"\2\u00cc\u00cd\7k\2\2\u00cd\u00ce\7v\2\2\u00ce\u00cf\7g\2\2\u00cf*\3\2"+
		"\2\2\u00d0\u00d4\5E#\2\u00d1\u00d4\5G$\2\u00d2\u00d4\5I%\2\u00d3\u00d0"+
		"\3\2\2\2\u00d3\u00d1\3\2\2\2\u00d3\u00d2\3\2\2\2\u00d4,\3\2\2\2\u00d5"+
		"\u00db\5K&\2\u00d6\u00db\5M\'\2\u00d7\u00db\5O(\2\u00d8\u00db\5Q)\2\u00d9"+
		"\u00db\5S*\2\u00da\u00d5\3\2\2\2\u00da\u00d6\3\2\2\2\u00da\u00d7\3\2\2"+
		"\2\u00da\u00d8\3\2\2\2\u00da\u00d9\3\2\2\2\u00db.\3\2\2\2\u00dc\u00dd"+
		"\7*\2\2\u00dd\60\3\2\2\2\u00de\u00df\7+\2\2\u00df\62\3\2\2\2\u00e0\u00e1"+
		"\7]\2\2\u00e1\64\3\2\2\2\u00e2\u00e3\7_\2\2\u00e3\66\3\2\2\2\u00e4\u00e5"+
		"\7}\2\2\u00e58\3\2\2\2\u00e6\u00e7\7\177\2\2\u00e7:\3\2\2\2\u00e8\u00e9"+
		"\7.\2\2\u00e9<\3\2\2\2\u00ea\u00eb\7<\2\2\u00eb>\3\2\2\2\u00ec\u00ed\7"+
		"=\2\2\u00ed@\3\2\2\2\u00ee\u00ef\7-\2\2\u00ef\u00f0\7?\2\2\u00f0B\3\2"+
		"\2\2\u00f1\u00f2\7/\2\2\u00f2\u00f3\7?\2\2\u00f3D\3\2\2\2\u00f4\u00f5"+
		"\7,\2\2\u00f5\u00f6\7?\2\2\u00f6F\3\2\2\2\u00f7\u00f8\7\61\2\2\u00f8\u00f9"+
		"\7?\2\2\u00f9H\3\2\2\2\u00fa\u00fb\7\'\2\2\u00fb\u00fc\7?\2\2\u00fcJ\3"+
		"\2\2\2\u00fd\u00fe\7-\2\2\u00feL\3\2\2\2\u00ff\u0100\7/\2\2\u0100N\3\2"+
		"\2\2\u0101\u0102\7,\2\2\u0102P\3\2\2\2\u0103\u0104\7\61\2\2\u0104R\3\2"+
		"\2\2\u0105\u0106\7\'\2\2\u0106T\3\2\2\2\u0107\u0108\7?\2\2\u0108\u0109"+
		"\7?\2\2\u0109V\3\2\2\2\u010a\u010b\7#\2\2\u010b\u010c\7?\2\2\u010cX\3"+
		"\2\2\2\u010d\u010e\7@\2\2\u010eZ\3\2\2\2\u010f\u0110\7@\2\2\u0110\u0111"+
		"\7?\2\2\u0111\\\3\2\2\2\u0112\u0113\7~\2\2\u0113\u0114\7~\2\2\u0114^\3"+
		"\2\2\2\u0115\u0116\7(\2\2\u0116\u0117\7(\2\2\u0117`\3\2\2\2\u0118\u0119"+
		"\7#\2\2\u0119b\3\2\2\2\u011a\u011b\7?\2\2\u011bd\3\2\2\2\u011c\u011d\7"+
		"A\2\2\u011df\3\2\2\2\u011e\u0120\5\7\4\2\u011f\u011e\3\2\2\2\u0120\u0121"+
		"\3\2\2\2\u0121\u011f\3\2\2\2\u0121\u0122\3\2\2\2\u0122h\3\2\2\2\u0123"+
		"\u0126\5k\66\2\u0124\u0126\5m\67\2\u0125\u0123\3\2\2\2\u0125\u0124\3\2"+
		"\2\2\u0126j\3\2\2\2\u0127\u0128\7v\2\2\u0128\u0129\7t\2\2\u0129\u012a"+
		"\7w\2\2\u012a\u012b\7g\2\2\u012bl\3\2\2\2\u012c\u012d\7h\2\2\u012d\u012e"+
		"\7c\2\2\u012e\u012f\7n\2\2\u012f\u0130\7u\2\2\u0130\u0131\7g\2\2\u0131"+
		"n\3\2\2\2\u0132\u0138\7$\2\2\u0133\u0139\5\3\2\2\u0134\u0139\5\5\3\2\u0135"+
		"\u0139\5\13\6\2\u0136\u0139\5\r\7\2\u0137\u0139\5\7\4\2\u0138\u0133\3"+
		"\2\2\2\u0138\u0134\3\2\2\2\u0138\u0135\3\2\2\2\u0138\u0136\3\2\2\2\u0138"+
		"\u0137\3\2\2\2\u0139\u013a\3\2\2\2\u013a\u0138\3\2\2\2\u013a\u013b\3\2"+
		"\2\2\u013b\u013c\3\2\2\2\u013c\u013d\7$\2\2\u013dp\3\2\2\2\u013e\u013f"+
		"\7\61\2\2\u013f\u0140\7\61\2\2\u0140\u0142\3\2\2\2\u0141\u0143\n\6\2\2"+
		"\u0142\u0141\3\2\2\2\u0143\u0144\3\2\2\2\u0144\u0142\3\2\2\2\u0144\u0145"+
		"\3\2\2\2\u0145\u0146\3\2\2\2\u0146\u0147\b9\2\2\u0147r\3\2\2\2\u0148\u014a"+
		"\t\7\2\2\u0149\u0148\3\2\2\2\u014a\u014b\3\2\2\2\u014b\u0149\3\2\2\2\u014b"+
		"\u014c\3\2\2\2\u014c\u014d\3\2\2\2\u014d\u014e\b:\2\2\u014et\3\2\2\2\u014f"+
		"\u0153\7a\2\2\u0150\u0153\5\3\2\2\u0151\u0153\5\5\3\2\u0152\u014f\3\2"+
		"\2\2\u0152\u0150\3\2\2\2\u0152\u0151\3\2\2\2\u0153\u015c\3\2\2\2\u0154"+
		"\u0159\7a\2\2\u0155\u0159\5\3\2\2\u0156\u0159\5\5\3\2\u0157\u0159\5\7"+
		"\4\2\u0158\u0154\3\2\2\2\u0158\u0155\3\2\2\2\u0158\u0156\3\2\2\2\u0158"+
		"\u0157\3\2\2\2\u0159\u015a\3\2\2\2\u015a\u0158\3\2\2\2\u015a\u015b\3\2"+
		"\2\2\u015b\u015d\3\2\2\2\u015c\u0158\3\2\2\2\u015c\u015d\3\2\2\2\u015d"+
		"v\3\2\2\2\21\2z\177\u00d3\u00da\u0121\u0125\u0138\u013a\u0144\u014b\u0152"+
		"\u0158\u015a\u015c\3\b\2\2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}