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
		WRITE_KW=14, OP_ARITMETICO=15, PAREN_OPEN=16, PAREN_CLOSE=17, BRACKETS_OPEN=18, 
		BRACKETS_CLOSE=19, CBRACES_OPEN=20, CBRACES_CLOSE=21, COMMA=22, COLON=23, 
		SEMICOLON=24, PLUS=25, MINUS=26, TIMES=27, DIV=28, REMAINDER=29, EQUAL=30, 
		NEQUAL=31, GREATER=32, GREATER_OR_EQUAL=33, OR=34, AND=35, NOT=36, ATTRIB=37, 
		ATTRIB_PLUS=38, ATTRIB_MINUS=39, ATTRIB_TIMES=40, ATTRIB_DIV=41, ATTRIB_PERCENT=42, 
		TERNARY=43, INTEGER=44, BOOLEAN=45, TRUE=46, FALSE=47, STRING=48, COMMENT=49, 
		IGNORE=50, IDENTIFIER=51;
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
		"WRITE_KW", "OP_ARITMETICO", "PAREN_OPEN", "PAREN_CLOSE", "BRACKETS_OPEN", 
		"BRACKETS_CLOSE", "CBRACES_OPEN", "CBRACES_CLOSE", "COMMA", "COLON", "SEMICOLON", 
		"PLUS", "MINUS", "TIMES", "DIV", "REMAINDER", "EQUAL", "NEQUAL", "GREATER", 
		"GREATER_OR_EQUAL", "OR", "AND", "NOT", "ATTRIB", "ATTRIB_PLUS", "ATTRIB_MINUS", 
		"ATTRIB_TIMES", "ATTRIB_DIV", "ATTRIB_PERCENT", "TERNARY", "INTEGER", 
		"BOOLEAN", "TRUE", "FALSE", "STRING", "COMMENT", "IGNORE", "IDENTIFIER"
	};

	private static final String[] _LITERAL_NAMES = {
		null, "'bool'", "'def'", "'else'", "'for'", "'if'", "'int'", "'read'", 
		"'return'", "'skip'", "'stop'", "'string'", "'var'", "'while'", "'write'", 
		null, "'('", "')'", "'['", "']'", "'{'", "'}'", "','", "':'", "';'", "'+'", 
		"'-'", "'*'", "'/'", "'%'", "'=='", "'!='", "'>'", "'>='", "'||'", "'&&'", 
		"'!'", "'='", "'+='", "'-='", "'*='", "'/='", "'%='", "'?'", null, null, 
		"'true'", "'false'"
	};
	private static final String[] _SYMBOLIC_NAMES = {
		null, "BOOL_KW", "DEF_KW", "ELSE_KW", "FOR_KW", "IF_KW", "INT_KW", "READ_KW", 
		"RETURN_KW", "SKIP_KW", "STOP_KW", "STRING_KW", "VAR_KW", "WHILE_KW", 
		"WRITE_KW", "OP_ARITMETICO", "PAREN_OPEN", "PAREN_CLOSE", "BRACKETS_OPEN", 
		"BRACKETS_CLOSE", "CBRACES_OPEN", "CBRACES_CLOSE", "COMMA", "COLON", "SEMICOLON", 
		"PLUS", "MINUS", "TIMES", "DIV", "REMAINDER", "EQUAL", "NEQUAL", "GREATER", 
		"GREATER_OR_EQUAL", "OR", "AND", "NOT", "ATTRIB", "ATTRIB_PLUS", "ATTRIB_MINUS", 
		"ATTRIB_TIMES", "ATTRIB_DIV", "ATTRIB_PERCENT", "TERNARY", "INTEGER", 
		"BOOLEAN", "TRUE", "FALSE", "STRING", "COMMENT", "IGNORE", "IDENTIFIER"
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
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\2\65\u0158\b\1\4\2"+
		"\t\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4"+
		"\13\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22"+
		"\t\22\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31"+
		"\t\31\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37\t\37\4 \t"+
		" \4!\t!\4\"\t\"\4#\t#\4$\t$\4%\t%\4&\t&\4\'\t\'\4(\t(\4)\t)\4*\t*\4+\t"+
		"+\4,\t,\4-\t-\4.\t.\4/\t/\4\60\t\60\4\61\t\61\4\62\t\62\4\63\t\63\4\64"+
		"\t\64\4\65\t\65\4\66\t\66\4\67\t\67\48\t8\49\t9\4:\t:\3\2\6\2w\n\2\r\2"+
		"\16\2x\3\3\6\3|\n\3\r\3\16\3}\3\4\3\4\3\5\3\5\3\6\3\6\3\6\3\7\3\7\3\b"+
		"\3\b\3\b\3\b\3\b\3\t\3\t\3\t\3\t\3\n\3\n\3\n\3\n\3\n\3\13\3\13\3\13\3"+
		"\13\3\f\3\f\3\f\3\r\3\r\3\r\3\r\3\16\3\16\3\16\3\16\3\16\3\17\3\17\3\17"+
		"\3\17\3\17\3\17\3\17\3\20\3\20\3\20\3\20\3\20\3\21\3\21\3\21\3\21\3\21"+
		"\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3\23\3\23\3\23\3\23\3\24\3\24\3\24"+
		"\3\24\3\24\3\24\3\25\3\25\3\25\3\25\3\25\3\25\3\26\3\26\3\26\3\26\3\26"+
		"\5\26\u00d4\n\26\3\27\3\27\3\30\3\30\3\31\3\31\3\32\3\32\3\33\3\33\3\34"+
		"\3\34\3\35\3\35\3\36\3\36\3\37\3\37\3 \3 \3!\3!\3\"\3\"\3#\3#\3$\3$\3"+
		"%\3%\3%\3&\3&\3&\3\'\3\'\3(\3(\3(\3)\3)\3)\3*\3*\3*\3+\3+\3,\3,\3-\3-"+
		"\3-\3.\3.\3.\3/\3/\3/\3\60\3\60\3\60\3\61\3\61\3\61\3\62\3\62\3\63\6\63"+
		"\u0119\n\63\r\63\16\63\u011a\3\64\3\64\5\64\u011f\n\64\3\65\3\65\3\65"+
		"\3\65\3\65\3\66\3\66\3\66\3\66\3\66\3\66\3\67\3\67\3\67\3\67\3\67\3\67"+
		"\6\67\u0132\n\67\r\67\16\67\u0133\3\67\3\67\38\38\38\38\78\u013c\n8\f"+
		"8\168\u013f\138\38\38\39\69\u0144\n9\r9\169\u0145\39\39\3:\3:\3:\5:\u014d"+
		"\n:\3:\3:\3:\3:\6:\u0153\n:\r:\16:\u0154\5:\u0157\n:\2\2;\3\2\5\2\7\2"+
		"\t\2\13\2\r\2\17\3\21\4\23\5\25\6\27\7\31\b\33\t\35\n\37\13!\f#\r%\16"+
		"\'\17)\20+\21-\22/\23\61\24\63\25\65\26\67\279\30;\31=\32?\33A\34C\35"+
		"E\36G\37I K!M\"O#Q$S%U&W\'Y([)]*_+a,c-e.g/i\60k\61m\62o\63q\64s\65\3\2"+
		"\b\3\2c|\3\2C\\\3\2\62;\3\2\2\u0081\4\2\f\f\17\17\5\2\13\f\17\17\"\"\2"+
		"\u0167\2\17\3\2\2\2\2\21\3\2\2\2\2\23\3\2\2\2\2\25\3\2\2\2\2\27\3\2\2"+
		"\2\2\31\3\2\2\2\2\33\3\2\2\2\2\35\3\2\2\2\2\37\3\2\2\2\2!\3\2\2\2\2#\3"+
		"\2\2\2\2%\3\2\2\2\2\'\3\2\2\2\2)\3\2\2\2\2+\3\2\2\2\2-\3\2\2\2\2/\3\2"+
		"\2\2\2\61\3\2\2\2\2\63\3\2\2\2\2\65\3\2\2\2\2\67\3\2\2\2\29\3\2\2\2\2"+
		";\3\2\2\2\2=\3\2\2\2\2?\3\2\2\2\2A\3\2\2\2\2C\3\2\2\2\2E\3\2\2\2\2G\3"+
		"\2\2\2\2I\3\2\2\2\2K\3\2\2\2\2M\3\2\2\2\2O\3\2\2\2\2Q\3\2\2\2\2S\3\2\2"+
		"\2\2U\3\2\2\2\2W\3\2\2\2\2Y\3\2\2\2\2[\3\2\2\2\2]\3\2\2\2\2_\3\2\2\2\2"+
		"a\3\2\2\2\2c\3\2\2\2\2e\3\2\2\2\2g\3\2\2\2\2i\3\2\2\2\2k\3\2\2\2\2m\3"+
		"\2\2\2\2o\3\2\2\2\2q\3\2\2\2\2s\3\2\2\2\3v\3\2\2\2\5{\3\2\2\2\7\177\3"+
		"\2\2\2\t\u0081\3\2\2\2\13\u0083\3\2\2\2\r\u0086\3\2\2\2\17\u0088\3\2\2"+
		"\2\21\u008d\3\2\2\2\23\u0091\3\2\2\2\25\u0096\3\2\2\2\27\u009a\3\2\2\2"+
		"\31\u009d\3\2\2\2\33\u00a1\3\2\2\2\35\u00a6\3\2\2\2\37\u00ad\3\2\2\2!"+
		"\u00b2\3\2\2\2#\u00b7\3\2\2\2%\u00be\3\2\2\2\'\u00c2\3\2\2\2)\u00c8\3"+
		"\2\2\2+\u00d3\3\2\2\2-\u00d5\3\2\2\2/\u00d7\3\2\2\2\61\u00d9\3\2\2\2\63"+
		"\u00db\3\2\2\2\65\u00dd\3\2\2\2\67\u00df\3\2\2\29\u00e1\3\2\2\2;\u00e3"+
		"\3\2\2\2=\u00e5\3\2\2\2?\u00e7\3\2\2\2A\u00e9\3\2\2\2C\u00eb\3\2\2\2E"+
		"\u00ed\3\2\2\2G\u00ef\3\2\2\2I\u00f1\3\2\2\2K\u00f4\3\2\2\2M\u00f7\3\2"+
		"\2\2O\u00f9\3\2\2\2Q\u00fc\3\2\2\2S\u00ff\3\2\2\2U\u0102\3\2\2\2W\u0104"+
		"\3\2\2\2Y\u0106\3\2\2\2[\u0109\3\2\2\2]\u010c\3\2\2\2_\u010f\3\2\2\2a"+
		"\u0112\3\2\2\2c\u0115\3\2\2\2e\u0118\3\2\2\2g\u011e\3\2\2\2i\u0120\3\2"+
		"\2\2k\u0125\3\2\2\2m\u012b\3\2\2\2o\u0137\3\2\2\2q\u0143\3\2\2\2s\u014c"+
		"\3\2\2\2uw\t\2\2\2vu\3\2\2\2wx\3\2\2\2xv\3\2\2\2xy\3\2\2\2y\4\3\2\2\2"+
		"z|\t\3\2\2{z\3\2\2\2|}\3\2\2\2}{\3\2\2\2}~\3\2\2\2~\6\3\2\2\2\177\u0080"+
		"\t\4\2\2\u0080\b\3\2\2\2\u0081\u0082\t\5\2\2\u0082\n\3\2\2\2\u0083\u0084"+
		"\7^\2\2\u0084\u0085\7$\2\2\u0085\f\3\2\2\2\u0086\u0087\7\"\2\2\u0087\16"+
		"\3\2\2\2\u0088\u0089\7d\2\2\u0089\u008a\7q\2\2\u008a\u008b\7q\2\2\u008b"+
		"\u008c\7n\2\2\u008c\20\3\2\2\2\u008d\u008e\7f\2\2\u008e\u008f\7g\2\2\u008f"+
		"\u0090\7h\2\2\u0090\22\3\2\2\2\u0091\u0092\7g\2\2\u0092\u0093\7n\2\2\u0093"+
		"\u0094\7u\2\2\u0094\u0095\7g\2\2\u0095\24\3\2\2\2\u0096\u0097\7h\2\2\u0097"+
		"\u0098\7q\2\2\u0098\u0099\7t\2\2\u0099\26\3\2\2\2\u009a\u009b\7k\2\2\u009b"+
		"\u009c\7h\2\2\u009c\30\3\2\2\2\u009d\u009e\7k\2\2\u009e\u009f\7p\2\2\u009f"+
		"\u00a0\7v\2\2\u00a0\32\3\2\2\2\u00a1\u00a2\7t\2\2\u00a2\u00a3\7g\2\2\u00a3"+
		"\u00a4\7c\2\2\u00a4\u00a5\7f\2\2\u00a5\34\3\2\2\2\u00a6\u00a7\7t\2\2\u00a7"+
		"\u00a8\7g\2\2\u00a8\u00a9\7v\2\2\u00a9\u00aa\7w\2\2\u00aa\u00ab\7t\2\2"+
		"\u00ab\u00ac\7p\2\2\u00ac\36\3\2\2\2\u00ad\u00ae\7u\2\2\u00ae\u00af\7"+
		"m\2\2\u00af\u00b0\7k\2\2\u00b0\u00b1\7r\2\2\u00b1 \3\2\2\2\u00b2\u00b3"+
		"\7u\2\2\u00b3\u00b4\7v\2\2\u00b4\u00b5\7q\2\2\u00b5\u00b6\7r\2\2\u00b6"+
		"\"\3\2\2\2\u00b7\u00b8\7u\2\2\u00b8\u00b9\7v\2\2\u00b9\u00ba\7t\2\2\u00ba"+
		"\u00bb\7k\2\2\u00bb\u00bc\7p\2\2\u00bc\u00bd\7i\2\2\u00bd$\3\2\2\2\u00be"+
		"\u00bf\7x\2\2\u00bf\u00c0\7c\2\2\u00c0\u00c1\7t\2\2\u00c1&\3\2\2\2\u00c2"+
		"\u00c3\7y\2\2\u00c3\u00c4\7j\2\2\u00c4\u00c5\7k\2\2\u00c5\u00c6\7n\2\2"+
		"\u00c6\u00c7\7g\2\2\u00c7(\3\2\2\2\u00c8\u00c9\7y\2\2\u00c9\u00ca\7t\2"+
		"\2\u00ca\u00cb\7k\2\2\u00cb\u00cc\7v\2\2\u00cc\u00cd\7g\2\2\u00cd*\3\2"+
		"\2\2\u00ce\u00d4\5? \2\u00cf\u00d4\5A!\2\u00d0\u00d4\5C\"\2\u00d1\u00d4"+
		"\5E#\2\u00d2\u00d4\5G$\2\u00d3\u00ce\3\2\2\2\u00d3\u00cf\3\2\2\2\u00d3"+
		"\u00d0\3\2\2\2\u00d3\u00d1\3\2\2\2\u00d3\u00d2\3\2\2\2\u00d4,\3\2\2\2"+
		"\u00d5\u00d6\7*\2\2\u00d6.\3\2\2\2\u00d7\u00d8\7+\2\2\u00d8\60\3\2\2\2"+
		"\u00d9\u00da\7]\2\2\u00da\62\3\2\2\2\u00db\u00dc\7_\2\2\u00dc\64\3\2\2"+
		"\2\u00dd\u00de\7}\2\2\u00de\66\3\2\2\2\u00df\u00e0\7\177\2\2\u00e08\3"+
		"\2\2\2\u00e1\u00e2\7.\2\2\u00e2:\3\2\2\2\u00e3\u00e4\7<\2\2\u00e4<\3\2"+
		"\2\2\u00e5\u00e6\7=\2\2\u00e6>\3\2\2\2\u00e7\u00e8\7-\2\2\u00e8@\3\2\2"+
		"\2\u00e9\u00ea\7/\2\2\u00eaB\3\2\2\2\u00eb\u00ec\7,\2\2\u00ecD\3\2\2\2"+
		"\u00ed\u00ee\7\61\2\2\u00eeF\3\2\2\2\u00ef\u00f0\7\'\2\2\u00f0H\3\2\2"+
		"\2\u00f1\u00f2\7?\2\2\u00f2\u00f3\7?\2\2\u00f3J\3\2\2\2\u00f4\u00f5\7"+
		"#\2\2\u00f5\u00f6\7?\2\2\u00f6L\3\2\2\2\u00f7\u00f8\7@\2\2\u00f8N\3\2"+
		"\2\2\u00f9\u00fa\7@\2\2\u00fa\u00fb\7?\2\2\u00fbP\3\2\2\2\u00fc\u00fd"+
		"\7~\2\2\u00fd\u00fe\7~\2\2\u00feR\3\2\2\2\u00ff\u0100\7(\2\2\u0100\u0101"+
		"\7(\2\2\u0101T\3\2\2\2\u0102\u0103\7#\2\2\u0103V\3\2\2\2\u0104\u0105\7"+
		"?\2\2\u0105X\3\2\2\2\u0106\u0107\7-\2\2\u0107\u0108\7?\2\2\u0108Z\3\2"+
		"\2\2\u0109\u010a\7/\2\2\u010a\u010b\7?\2\2\u010b\\\3\2\2\2\u010c\u010d"+
		"\7,\2\2\u010d\u010e\7?\2\2\u010e^\3\2\2\2\u010f\u0110\7\61\2\2\u0110\u0111"+
		"\7?\2\2\u0111`\3\2\2\2\u0112\u0113\7\'\2\2\u0113\u0114\7?\2\2\u0114b\3"+
		"\2\2\2\u0115\u0116\7A\2\2\u0116d\3\2\2\2\u0117\u0119\5\7\4\2\u0118\u0117"+
		"\3\2\2\2\u0119\u011a\3\2\2\2\u011a\u0118\3\2\2\2\u011a\u011b\3\2\2\2\u011b"+
		"f\3\2\2\2\u011c\u011f\5i\65\2\u011d\u011f\5k\66\2\u011e\u011c\3\2\2\2"+
		"\u011e\u011d\3\2\2\2\u011fh\3\2\2\2\u0120\u0121\7v\2\2\u0121\u0122\7t"+
		"\2\2\u0122\u0123\7w\2\2\u0123\u0124\7g\2\2\u0124j\3\2\2\2\u0125\u0126"+
		"\7h\2\2\u0126\u0127\7c\2\2\u0127\u0128\7n\2\2\u0128\u0129\7u\2\2\u0129"+
		"\u012a\7g\2\2\u012al\3\2\2\2\u012b\u0131\7$\2\2\u012c\u0132\5\3\2\2\u012d"+
		"\u0132\5\5\3\2\u012e\u0132\5\13\6\2\u012f\u0132\5\r\7\2\u0130\u0132\5"+
		"\7\4\2\u0131\u012c\3\2\2\2\u0131\u012d\3\2\2\2\u0131\u012e\3\2\2\2\u0131"+
		"\u012f\3\2\2\2\u0131\u0130\3\2\2\2\u0132\u0133\3\2\2\2\u0133\u0131\3\2"+
		"\2\2\u0133\u0134\3\2\2\2\u0134\u0135\3\2\2\2\u0135\u0136\7$\2\2\u0136"+
		"n\3\2\2\2\u0137\u0138\7\61\2\2\u0138\u0139\7\61\2\2\u0139\u013d\3\2\2"+
		"\2\u013a\u013c\n\6\2\2\u013b\u013a\3\2\2\2\u013c\u013f\3\2\2\2\u013d\u013b"+
		"\3\2\2\2\u013d\u013e\3\2\2\2\u013e\u0140\3\2\2\2\u013f\u013d\3\2\2\2\u0140"+
		"\u0141\b8\2\2\u0141p\3\2\2\2\u0142\u0144\t\7\2\2\u0143\u0142\3\2\2\2\u0144"+
		"\u0145\3\2\2\2\u0145\u0143\3\2\2\2\u0145\u0146\3\2\2\2\u0146\u0147\3\2"+
		"\2\2\u0147\u0148\b9\2\2\u0148r\3\2\2\2\u0149\u014d\7a\2\2\u014a\u014d"+
		"\5\3\2\2\u014b\u014d\5\5\3\2\u014c\u0149\3\2\2\2\u014c\u014a\3\2\2\2\u014c"+
		"\u014b\3\2\2\2\u014d\u0156\3\2\2\2\u014e\u0153\7a\2\2\u014f\u0153\5\3"+
		"\2\2\u0150\u0153\5\5\3\2\u0151\u0153\5\7\4\2\u0152\u014e\3\2\2\2\u0152"+
		"\u014f\3\2\2\2\u0152\u0150\3\2\2\2\u0152\u0151\3\2\2\2\u0153\u0154\3\2"+
		"\2\2\u0154\u0152\3\2\2\2\u0154\u0155\3\2\2\2\u0155\u0157\3\2\2\2\u0156"+
		"\u0152\3\2\2\2\u0156\u0157\3\2\2\2\u0157t\3\2\2\2\20\2x}\u00d3\u011a\u011e"+
		"\u0131\u0133\u013d\u0145\u014c\u0152\u0154\u0156\3\b\2\2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}