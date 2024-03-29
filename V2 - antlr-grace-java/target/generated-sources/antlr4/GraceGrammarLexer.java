// Generated from GraceGrammar.g4 by ANTLR 4.7.1
import org.antlr.v4.runtime.Lexer;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.TokenStream;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.misc.*;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class GraceGrammarLexer extends Lexer {
	static { RuntimeMetaData.checkVersion("4.7.1", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		BOOL_KW=1, DEF_KW=2, ELSE_KW=3, FOR_KW=4, IF_KW=5, INT_KW=6, READ_KW=7, 
		RETURN_KW=8, SKIP_KW=9, STOP_KW=10, STRING_KW=11, VAR_KW=12, WHILE_KW=13, 
		WRITE_KW=14, OP_ARITMETICO=15, PAREN_OPEN=16, PAREN_CLOSE=17, BRACKETS_OPEN=18, 
		BRACKETS_CLOSE=19, CBRACES_OPEN=20, CBRACES_CLOSE=21, COMMA=22, COLON=23, 
		SEMICOLON=24, ATTRIB_PLUS=25, ATTRIB_MINUS=26, ATTRIB_TIMES=27, ATTRIB_DIV=28, 
		ATTRIB_REMAINDER=29, PLUS=30, MINUS=31, TIMES=32, DIV=33, REMAINDER=34, 
		ATTRIB=35, OP_EXPRESSAO=36, EQUAL=37, NEQUAL=38, GREATER=39, GREATER_OR_EQUAL=40, 
		LESS=41, LESS_OR_EQUAL=42, OR=43, AND=44, NOT=45, TERNARY=46, INTEGER=47, 
		BOOLEAN=48, TRUE=49, FALSE=50, STRING=51, COMMENT=52, IGNORE=53, IDENTIFIER=54, 
		ERROR_CHAR=55;
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
		"ATTRIB_PLUS", "ATTRIB_MINUS", "ATTRIB_TIMES", "ATTRIB_DIV", "ATTRIB_REMAINDER", 
		"PLUS", "MINUS", "TIMES", "DIV", "REMAINDER", "ATTRIB", "OP_EXPRESSAO", 
		"EQUAL", "NEQUAL", "GREATER", "GREATER_OR_EQUAL", "LESS", "LESS_OR_EQUAL", 
		"OR", "AND", "NOT", "TERNARY", "INTEGER", "BOOLEAN", "TRUE", "FALSE", 
		"STRING", "COMMENT", "IGNORE", "IDENTIFIER", "ERROR_CHAR"
	};

	private static final String[] _LITERAL_NAMES = {
		null, "'bool'", "'def'", "'else'", "'for'", "'if'", "'int'", "'read'", 
		"'return'", "'skip'", "'stop'", "'string'", "'var'", "'while'", "'write'", 
		null, "'('", "')'", "'['", "']'", "'{'", "'}'", "','", "':'", "';'", "'+='", 
		"'-='", "'*='", "'/='", "'%='", "'+'", "'-'", "'*'", "'/'", "'%'", "'='", 
		null, "'=='", "'!='", "'>'", "'>='", "'<'", "'<='", "'||'", "'&&'", "'!'", 
		"'?'", null, null, "'true'", "'false'"
	};
	private static final String[] _SYMBOLIC_NAMES = {
		null, "BOOL_KW", "DEF_KW", "ELSE_KW", "FOR_KW", "IF_KW", "INT_KW", "READ_KW", 
		"RETURN_KW", "SKIP_KW", "STOP_KW", "STRING_KW", "VAR_KW", "WHILE_KW", 
		"WRITE_KW", "OP_ARITMETICO", "PAREN_OPEN", "PAREN_CLOSE", "BRACKETS_OPEN", 
		"BRACKETS_CLOSE", "CBRACES_OPEN", "CBRACES_CLOSE", "COMMA", "COLON", "SEMICOLON", 
		"ATTRIB_PLUS", "ATTRIB_MINUS", "ATTRIB_TIMES", "ATTRIB_DIV", "ATTRIB_REMAINDER", 
		"PLUS", "MINUS", "TIMES", "DIV", "REMAINDER", "ATTRIB", "OP_EXPRESSAO", 
		"EQUAL", "NEQUAL", "GREATER", "GREATER_OR_EQUAL", "LESS", "LESS_OR_EQUAL", 
		"OR", "AND", "NOT", "TERNARY", "INTEGER", "BOOLEAN", "TRUE", "FALSE", 
		"STRING", "COMMENT", "IGNORE", "IDENTIFIER", "ERROR_CHAR"
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


	public GraceGrammarLexer(CharStream input) {
		super(input);
		_interp = new LexerATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@Override
	public String getGrammarFileName() { return "GraceGrammar.g4"; }

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
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\29\u0171\b\1\4\2\t"+
		"\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13"+
		"\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31\t\31"+
		"\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37\t\37\4 \t \4!"+
		"\t!\4\"\t\"\4#\t#\4$\t$\4%\t%\4&\t&\4\'\t\'\4(\t(\4)\t)\4*\t*\4+\t+\4"+
		",\t,\4-\t-\4.\t.\4/\t/\4\60\t\60\4\61\t\61\4\62\t\62\4\63\t\63\4\64\t"+
		"\64\4\65\t\65\4\66\t\66\4\67\t\67\48\t8\49\t9\4:\t:\4;\t;\4<\t<\4=\t="+
		"\4>\t>\3\2\6\2\177\n\2\r\2\16\2\u0080\3\3\6\3\u0084\n\3\r\3\16\3\u0085"+
		"\3\4\3\4\3\5\3\5\3\6\3\6\3\6\3\7\3\7\3\b\3\b\3\b\3\b\3\b\3\t\3\t\3\t\3"+
		"\t\3\n\3\n\3\n\3\n\3\n\3\13\3\13\3\13\3\13\3\f\3\f\3\f\3\r\3\r\3\r\3\r"+
		"\3\16\3\16\3\16\3\16\3\16\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\20\3\20"+
		"\3\20\3\20\3\20\3\21\3\21\3\21\3\21\3\21\3\22\3\22\3\22\3\22\3\22\3\22"+
		"\3\22\3\23\3\23\3\23\3\23\3\24\3\24\3\24\3\24\3\24\3\24\3\25\3\25\3\25"+
		"\3\25\3\25\3\25\3\26\3\26\3\26\3\26\3\26\5\26\u00dc\n\26\3\27\3\27\3\30"+
		"\3\30\3\31\3\31\3\32\3\32\3\33\3\33\3\34\3\34\3\35\3\35\3\36\3\36\3\37"+
		"\3\37\3 \3 \3 \3!\3!\3!\3\"\3\"\3\"\3#\3#\3#\3$\3$\3$\3%\3%\3&\3&\3\'"+
		"\3\'\3(\3(\3)\3)\3*\3*\3+\3+\3+\3+\3+\3+\3+\3+\3+\5+\u0114\n+\3,\3,\3"+
		",\3-\3-\3-\3.\3.\3/\3/\3/\3\60\3\60\3\61\3\61\3\61\3\62\3\62\3\62\3\63"+
		"\3\63\3\63\3\64\3\64\3\65\3\65\3\66\6\66\u0131\n\66\r\66\16\66\u0132\3"+
		"\67\3\67\5\67\u0137\n\67\38\38\38\38\38\39\39\39\39\39\39\3:\3:\3:\3:"+
		"\3:\3:\6:\u014a\n:\r:\16:\u014b\3:\3:\3;\3;\3;\3;\6;\u0154\n;\r;\16;\u0155"+
		"\3;\3;\3<\6<\u015b\n<\r<\16<\u015c\3<\3<\3=\3=\3=\5=\u0164\n=\3=\3=\3"+
		"=\3=\6=\u016a\n=\r=\16=\u016b\5=\u016e\n=\3>\3>\2\2?\3\2\5\2\7\2\t\2\13"+
		"\2\r\2\17\3\21\4\23\5\25\6\27\7\31\b\33\t\35\n\37\13!\f#\r%\16\'\17)\20"+
		"+\21-\22/\23\61\24\63\25\65\26\67\279\30;\31=\32?\33A\34C\35E\36G\37I"+
		" K!M\"O#Q$S%U&W\'Y([)]*_+a,c-e.g/i\60k\61m\62o\63q\64s\65u\66w\67y8{9"+
		"\3\2\b\3\2c|\3\2C\\\3\2\62;\3\2\2\u0081\4\2\f\f\17\17\5\2\13\f\17\17\""+
		"\"\2\u0188\2\17\3\2\2\2\2\21\3\2\2\2\2\23\3\2\2\2\2\25\3\2\2\2\2\27\3"+
		"\2\2\2\2\31\3\2\2\2\2\33\3\2\2\2\2\35\3\2\2\2\2\37\3\2\2\2\2!\3\2\2\2"+
		"\2#\3\2\2\2\2%\3\2\2\2\2\'\3\2\2\2\2)\3\2\2\2\2+\3\2\2\2\2-\3\2\2\2\2"+
		"/\3\2\2\2\2\61\3\2\2\2\2\63\3\2\2\2\2\65\3\2\2\2\2\67\3\2\2\2\29\3\2\2"+
		"\2\2;\3\2\2\2\2=\3\2\2\2\2?\3\2\2\2\2A\3\2\2\2\2C\3\2\2\2\2E\3\2\2\2\2"+
		"G\3\2\2\2\2I\3\2\2\2\2K\3\2\2\2\2M\3\2\2\2\2O\3\2\2\2\2Q\3\2\2\2\2S\3"+
		"\2\2\2\2U\3\2\2\2\2W\3\2\2\2\2Y\3\2\2\2\2[\3\2\2\2\2]\3\2\2\2\2_\3\2\2"+
		"\2\2a\3\2\2\2\2c\3\2\2\2\2e\3\2\2\2\2g\3\2\2\2\2i\3\2\2\2\2k\3\2\2\2\2"+
		"m\3\2\2\2\2o\3\2\2\2\2q\3\2\2\2\2s\3\2\2\2\2u\3\2\2\2\2w\3\2\2\2\2y\3"+
		"\2\2\2\2{\3\2\2\2\3~\3\2\2\2\5\u0083\3\2\2\2\7\u0087\3\2\2\2\t\u0089\3"+
		"\2\2\2\13\u008b\3\2\2\2\r\u008e\3\2\2\2\17\u0090\3\2\2\2\21\u0095\3\2"+
		"\2\2\23\u0099\3\2\2\2\25\u009e\3\2\2\2\27\u00a2\3\2\2\2\31\u00a5\3\2\2"+
		"\2\33\u00a9\3\2\2\2\35\u00ae\3\2\2\2\37\u00b5\3\2\2\2!\u00ba\3\2\2\2#"+
		"\u00bf\3\2\2\2%\u00c6\3\2\2\2\'\u00ca\3\2\2\2)\u00d0\3\2\2\2+\u00db\3"+
		"\2\2\2-\u00dd\3\2\2\2/\u00df\3\2\2\2\61\u00e1\3\2\2\2\63\u00e3\3\2\2\2"+
		"\65\u00e5\3\2\2\2\67\u00e7\3\2\2\29\u00e9\3\2\2\2;\u00eb\3\2\2\2=\u00ed"+
		"\3\2\2\2?\u00ef\3\2\2\2A\u00f2\3\2\2\2C\u00f5\3\2\2\2E\u00f8\3\2\2\2G"+
		"\u00fb\3\2\2\2I\u00fe\3\2\2\2K\u0100\3\2\2\2M\u0102\3\2\2\2O\u0104\3\2"+
		"\2\2Q\u0106\3\2\2\2S\u0108\3\2\2\2U\u0113\3\2\2\2W\u0115\3\2\2\2Y\u0118"+
		"\3\2\2\2[\u011b\3\2\2\2]\u011d\3\2\2\2_\u0120\3\2\2\2a\u0122\3\2\2\2c"+
		"\u0125\3\2\2\2e\u0128\3\2\2\2g\u012b\3\2\2\2i\u012d\3\2\2\2k\u0130\3\2"+
		"\2\2m\u0136\3\2\2\2o\u0138\3\2\2\2q\u013d\3\2\2\2s\u0143\3\2\2\2u\u014f"+
		"\3\2\2\2w\u015a\3\2\2\2y\u0163\3\2\2\2{\u016f\3\2\2\2}\177\t\2\2\2~}\3"+
		"\2\2\2\177\u0080\3\2\2\2\u0080~\3\2\2\2\u0080\u0081\3\2\2\2\u0081\4\3"+
		"\2\2\2\u0082\u0084\t\3\2\2\u0083\u0082\3\2\2\2\u0084\u0085\3\2\2\2\u0085"+
		"\u0083\3\2\2\2\u0085\u0086\3\2\2\2\u0086\6\3\2\2\2\u0087\u0088\t\4\2\2"+
		"\u0088\b\3\2\2\2\u0089\u008a\t\5\2\2\u008a\n\3\2\2\2\u008b\u008c\7^\2"+
		"\2\u008c\u008d\7$\2\2\u008d\f\3\2\2\2\u008e\u008f\7\"\2\2\u008f\16\3\2"+
		"\2\2\u0090\u0091\7d\2\2\u0091\u0092\7q\2\2\u0092\u0093\7q\2\2\u0093\u0094"+
		"\7n\2\2\u0094\20\3\2\2\2\u0095\u0096\7f\2\2\u0096\u0097\7g\2\2\u0097\u0098"+
		"\7h\2\2\u0098\22\3\2\2\2\u0099\u009a\7g\2\2\u009a\u009b\7n\2\2\u009b\u009c"+
		"\7u\2\2\u009c\u009d\7g\2\2\u009d\24\3\2\2\2\u009e\u009f\7h\2\2\u009f\u00a0"+
		"\7q\2\2\u00a0\u00a1\7t\2\2\u00a1\26\3\2\2\2\u00a2\u00a3\7k\2\2\u00a3\u00a4"+
		"\7h\2\2\u00a4\30\3\2\2\2\u00a5\u00a6\7k\2\2\u00a6\u00a7\7p\2\2\u00a7\u00a8"+
		"\7v\2\2\u00a8\32\3\2\2\2\u00a9\u00aa\7t\2\2\u00aa\u00ab\7g\2\2\u00ab\u00ac"+
		"\7c\2\2\u00ac\u00ad\7f\2\2\u00ad\34\3\2\2\2\u00ae\u00af\7t\2\2\u00af\u00b0"+
		"\7g\2\2\u00b0\u00b1\7v\2\2\u00b1\u00b2\7w\2\2\u00b2\u00b3\7t\2\2\u00b3"+
		"\u00b4\7p\2\2\u00b4\36\3\2\2\2\u00b5\u00b6\7u\2\2\u00b6\u00b7\7m\2\2\u00b7"+
		"\u00b8\7k\2\2\u00b8\u00b9\7r\2\2\u00b9 \3\2\2\2\u00ba\u00bb\7u\2\2\u00bb"+
		"\u00bc\7v\2\2\u00bc\u00bd\7q\2\2\u00bd\u00be\7r\2\2\u00be\"\3\2\2\2\u00bf"+
		"\u00c0\7u\2\2\u00c0\u00c1\7v\2\2\u00c1\u00c2\7t\2\2\u00c2\u00c3\7k\2\2"+
		"\u00c3\u00c4\7p\2\2\u00c4\u00c5\7i\2\2\u00c5$\3\2\2\2\u00c6\u00c7\7x\2"+
		"\2\u00c7\u00c8\7c\2\2\u00c8\u00c9\7t\2\2\u00c9&\3\2\2\2\u00ca\u00cb\7"+
		"y\2\2\u00cb\u00cc\7j\2\2\u00cc\u00cd\7k\2\2\u00cd\u00ce\7n\2\2\u00ce\u00cf"+
		"\7g\2\2\u00cf(\3\2\2\2\u00d0\u00d1\7y\2\2\u00d1\u00d2\7t\2\2\u00d2\u00d3"+
		"\7k\2\2\u00d3\u00d4\7v\2\2\u00d4\u00d5\7g\2\2\u00d5*\3\2\2\2\u00d6\u00dc"+
		"\5I%\2\u00d7\u00dc\5K&\2\u00d8\u00dc\5M\'\2\u00d9\u00dc\5O(\2\u00da\u00dc"+
		"\5Q)\2\u00db\u00d6\3\2\2\2\u00db\u00d7\3\2\2\2\u00db\u00d8\3\2\2\2\u00db"+
		"\u00d9\3\2\2\2\u00db\u00da\3\2\2\2\u00dc,\3\2\2\2\u00dd\u00de\7*\2\2\u00de"+
		".\3\2\2\2\u00df\u00e0\7+\2\2\u00e0\60\3\2\2\2\u00e1\u00e2\7]\2\2\u00e2"+
		"\62\3\2\2\2\u00e3\u00e4\7_\2\2\u00e4\64\3\2\2\2\u00e5\u00e6\7}\2\2\u00e6"+
		"\66\3\2\2\2\u00e7\u00e8\7\177\2\2\u00e88\3\2\2\2\u00e9\u00ea\7.\2\2\u00ea"+
		":\3\2\2\2\u00eb\u00ec\7<\2\2\u00ec<\3\2\2\2\u00ed\u00ee\7=\2\2\u00ee>"+
		"\3\2\2\2\u00ef\u00f0\7-\2\2\u00f0\u00f1\7?\2\2\u00f1@\3\2\2\2\u00f2\u00f3"+
		"\7/\2\2\u00f3\u00f4\7?\2\2\u00f4B\3\2\2\2\u00f5\u00f6\7,\2\2\u00f6\u00f7"+
		"\7?\2\2\u00f7D\3\2\2\2\u00f8\u00f9\7\61\2\2\u00f9\u00fa\7?\2\2\u00faF"+
		"\3\2\2\2\u00fb\u00fc\7\'\2\2\u00fc\u00fd\7?\2\2\u00fdH\3\2\2\2\u00fe\u00ff"+
		"\7-\2\2\u00ffJ\3\2\2\2\u0100\u0101\7/\2\2\u0101L\3\2\2\2\u0102\u0103\7"+
		",\2\2\u0103N\3\2\2\2\u0104\u0105\7\61\2\2\u0105P\3\2\2\2\u0106\u0107\7"+
		"\'\2\2\u0107R\3\2\2\2\u0108\u0109\7?\2\2\u0109T\3\2\2\2\u010a\u0114\5"+
		"W,\2\u010b\u0114\5Y-\2\u010c\u0114\5[.\2\u010d\u0114\5]/\2\u010e\u0114"+
		"\5_\60\2\u010f\u0114\5a\61\2\u0110\u0114\5c\62\2\u0111\u0114\5e\63\2\u0112"+
		"\u0114\5g\64\2\u0113\u010a\3\2\2\2\u0113\u010b\3\2\2\2\u0113\u010c\3\2"+
		"\2\2\u0113\u010d\3\2\2\2\u0113\u010e\3\2\2\2\u0113\u010f\3\2\2\2\u0113"+
		"\u0110\3\2\2\2\u0113\u0111\3\2\2\2\u0113\u0112\3\2\2\2\u0114V\3\2\2\2"+
		"\u0115\u0116\7?\2\2\u0116\u0117\7?\2\2\u0117X\3\2\2\2\u0118\u0119\7#\2"+
		"\2\u0119\u011a\7?\2\2\u011aZ\3\2\2\2\u011b\u011c\7@\2\2\u011c\\\3\2\2"+
		"\2\u011d\u011e\7@\2\2\u011e\u011f\7?\2\2\u011f^\3\2\2\2\u0120\u0121\7"+
		">\2\2\u0121`\3\2\2\2\u0122\u0123\7>\2\2\u0123\u0124\7?\2\2\u0124b\3\2"+
		"\2\2\u0125\u0126\7~\2\2\u0126\u0127\7~\2\2\u0127d\3\2\2\2\u0128\u0129"+
		"\7(\2\2\u0129\u012a\7(\2\2\u012af\3\2\2\2\u012b\u012c\7#\2\2\u012ch\3"+
		"\2\2\2\u012d\u012e\7A\2\2\u012ej\3\2\2\2\u012f\u0131\5\7\4\2\u0130\u012f"+
		"\3\2\2\2\u0131\u0132\3\2\2\2\u0132\u0130\3\2\2\2\u0132\u0133\3\2\2\2\u0133"+
		"l\3\2\2\2\u0134\u0137\5o8\2\u0135\u0137\5q9\2\u0136\u0134\3\2\2\2\u0136"+
		"\u0135\3\2\2\2\u0137n\3\2\2\2\u0138\u0139\7v\2\2\u0139\u013a\7t\2\2\u013a"+
		"\u013b\7w\2\2\u013b\u013c\7g\2\2\u013cp\3\2\2\2\u013d\u013e\7h\2\2\u013e"+
		"\u013f\7c\2\2\u013f\u0140\7n\2\2\u0140\u0141\7u\2\2\u0141\u0142\7g\2\2"+
		"\u0142r\3\2\2\2\u0143\u0149\7$\2\2\u0144\u014a\5\3\2\2\u0145\u014a\5\5"+
		"\3\2\u0146\u014a\5\13\6\2\u0147\u014a\5\r\7\2\u0148\u014a\5\7\4\2\u0149"+
		"\u0144\3\2\2\2\u0149\u0145\3\2\2\2\u0149\u0146\3\2\2\2\u0149\u0147\3\2"+
		"\2\2\u0149\u0148\3\2\2\2\u014a\u014b\3\2\2\2\u014b\u0149\3\2\2\2\u014b"+
		"\u014c\3\2\2\2\u014c\u014d\3\2\2\2\u014d\u014e\7$\2\2\u014et\3\2\2\2\u014f"+
		"\u0150\7\61\2\2\u0150\u0151\7\61\2\2\u0151\u0153\3\2\2\2\u0152\u0154\n"+
		"\6\2\2\u0153\u0152\3\2\2\2\u0154\u0155\3\2\2\2\u0155\u0153\3\2\2\2\u0155"+
		"\u0156\3\2\2\2\u0156\u0157\3\2\2\2\u0157\u0158\b;\2\2\u0158v\3\2\2\2\u0159"+
		"\u015b\t\7\2\2\u015a\u0159\3\2\2\2\u015b\u015c\3\2\2\2\u015c\u015a\3\2"+
		"\2\2\u015c\u015d\3\2\2\2\u015d\u015e\3\2\2\2\u015e\u015f\b<\2\2\u015f"+
		"x\3\2\2\2\u0160\u0164\7a\2\2\u0161\u0164\5\3\2\2\u0162\u0164\5\5\3\2\u0163"+
		"\u0160\3\2\2\2\u0163\u0161\3\2\2\2\u0163\u0162\3\2\2\2\u0164\u016d\3\2"+
		"\2\2\u0165\u016a\7a\2\2\u0166\u016a\5\3\2\2\u0167\u016a\5\5\3\2\u0168"+
		"\u016a\5\7\4\2\u0169\u0165\3\2\2\2\u0169\u0166\3\2\2\2\u0169\u0167\3\2"+
		"\2\2\u0169\u0168\3\2\2\2\u016a\u016b\3\2\2\2\u016b\u0169\3\2\2\2\u016b"+
		"\u016c\3\2\2\2\u016c\u016e\3\2\2\2\u016d\u0169\3\2\2\2\u016d\u016e\3\2"+
		"\2\2\u016ez\3\2\2\2\u016f\u0170\13\2\2\2\u0170|\3\2\2\2\21\2\u0080\u0085"+
		"\u00db\u0113\u0132\u0136\u0149\u014b\u0155\u015c\u0163\u0169\u016b\u016d"+
		"\3\b\2\2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}