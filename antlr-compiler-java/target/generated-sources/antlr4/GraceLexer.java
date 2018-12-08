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
		SEMICOLON=24, ATTRIB_PLUS=25, ATTRIB_MINUS=26, ATTRIB_TIMES=27, ATTRIB_DIV=28, 
		ATTRIB_REMAINDER=29, PLUS=30, MINUS=31, TIMES=32, DIV=33, REMAINDER=34, 
		ATTRIB=35, OP_EXPRESSAO=36, EQUAL=37, NEQUAL=38, GREATER=39, GREATER_OR_EQUAL=40, 
		LESS=41, LESS_OR_EQUAL=42, OR=43, AND=44, NOT=45, TERNARY=46, INTEGER=47, 
		BOOLEAN=48, TRUE=49, FALSE=50, STRING=51, COMMENT=52, IGNORE=53, IDENTIFIER=54;
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
		"STRING", "COMMENT", "IGNORE", "IDENTIFIER"
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
		"STRING", "COMMENT", "IGNORE", "IDENTIFIER"
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
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\28\u016d\b\1\4\2\t"+
		"\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13"+
		"\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31\t\31"+
		"\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37\t\37\4 \t \4!"+
		"\t!\4\"\t\"\4#\t#\4$\t$\4%\t%\4&\t&\4\'\t\'\4(\t(\4)\t)\4*\t*\4+\t+\4"+
		",\t,\4-\t-\4.\t.\4/\t/\4\60\t\60\4\61\t\61\4\62\t\62\4\63\t\63\4\64\t"+
		"\64\4\65\t\65\4\66\t\66\4\67\t\67\48\t8\49\t9\4:\t:\4;\t;\4<\t<\4=\t="+
		"\3\2\6\2}\n\2\r\2\16\2~\3\3\6\3\u0082\n\3\r\3\16\3\u0083\3\4\3\4\3\5\3"+
		"\5\3\6\3\6\3\6\3\7\3\7\3\b\3\b\3\b\3\b\3\b\3\t\3\t\3\t\3\t\3\n\3\n\3\n"+
		"\3\n\3\n\3\13\3\13\3\13\3\13\3\f\3\f\3\f\3\r\3\r\3\r\3\r\3\16\3\16\3\16"+
		"\3\16\3\16\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\20\3\20\3\20\3\20\3\20"+
		"\3\21\3\21\3\21\3\21\3\21\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3\23\3\23"+
		"\3\23\3\23\3\24\3\24\3\24\3\24\3\24\3\24\3\25\3\25\3\25\3\25\3\25\3\25"+
		"\3\26\3\26\3\26\3\26\3\26\5\26\u00da\n\26\3\27\3\27\3\30\3\30\3\31\3\31"+
		"\3\32\3\32\3\33\3\33\3\34\3\34\3\35\3\35\3\36\3\36\3\37\3\37\3 \3 \3 "+
		"\3!\3!\3!\3\"\3\"\3\"\3#\3#\3#\3$\3$\3$\3%\3%\3&\3&\3\'\3\'\3(\3(\3)\3"+
		")\3*\3*\3+\3+\3+\3+\3+\3+\3+\3+\3+\5+\u0112\n+\3,\3,\3,\3-\3-\3-\3.\3"+
		".\3/\3/\3/\3\60\3\60\3\61\3\61\3\61\3\62\3\62\3\62\3\63\3\63\3\63\3\64"+
		"\3\64\3\65\3\65\3\66\6\66\u012f\n\66\r\66\16\66\u0130\3\67\3\67\5\67\u0135"+
		"\n\67\38\38\38\38\38\39\39\39\39\39\39\3:\3:\3:\3:\3:\3:\6:\u0148\n:\r"+
		":\16:\u0149\3:\3:\3;\3;\3;\3;\6;\u0152\n;\r;\16;\u0153\3;\3;\3<\6<\u0159"+
		"\n<\r<\16<\u015a\3<\3<\3=\3=\3=\5=\u0162\n=\3=\3=\3=\3=\6=\u0168\n=\r"+
		"=\16=\u0169\5=\u016c\n=\2\2>\3\2\5\2\7\2\t\2\13\2\r\2\17\3\21\4\23\5\25"+
		"\6\27\7\31\b\33\t\35\n\37\13!\f#\r%\16\'\17)\20+\21-\22/\23\61\24\63\25"+
		"\65\26\67\279\30;\31=\32?\33A\34C\35E\36G\37I K!M\"O#Q$S%U&W\'Y([)]*_"+
		"+a,c-e.g/i\60k\61m\62o\63q\64s\65u\66w\67y8\3\2\b\3\2c|\3\2C\\\3\2\62"+
		";\3\2\2\u0081\4\2\f\f\17\17\5\2\13\f\17\17\"\"\2\u0184\2\17\3\2\2\2\2"+
		"\21\3\2\2\2\2\23\3\2\2\2\2\25\3\2\2\2\2\27\3\2\2\2\2\31\3\2\2\2\2\33\3"+
		"\2\2\2\2\35\3\2\2\2\2\37\3\2\2\2\2!\3\2\2\2\2#\3\2\2\2\2%\3\2\2\2\2\'"+
		"\3\2\2\2\2)\3\2\2\2\2+\3\2\2\2\2-\3\2\2\2\2/\3\2\2\2\2\61\3\2\2\2\2\63"+
		"\3\2\2\2\2\65\3\2\2\2\2\67\3\2\2\2\29\3\2\2\2\2;\3\2\2\2\2=\3\2\2\2\2"+
		"?\3\2\2\2\2A\3\2\2\2\2C\3\2\2\2\2E\3\2\2\2\2G\3\2\2\2\2I\3\2\2\2\2K\3"+
		"\2\2\2\2M\3\2\2\2\2O\3\2\2\2\2Q\3\2\2\2\2S\3\2\2\2\2U\3\2\2\2\2W\3\2\2"+
		"\2\2Y\3\2\2\2\2[\3\2\2\2\2]\3\2\2\2\2_\3\2\2\2\2a\3\2\2\2\2c\3\2\2\2\2"+
		"e\3\2\2\2\2g\3\2\2\2\2i\3\2\2\2\2k\3\2\2\2\2m\3\2\2\2\2o\3\2\2\2\2q\3"+
		"\2\2\2\2s\3\2\2\2\2u\3\2\2\2\2w\3\2\2\2\2y\3\2\2\2\3|\3\2\2\2\5\u0081"+
		"\3\2\2\2\7\u0085\3\2\2\2\t\u0087\3\2\2\2\13\u0089\3\2\2\2\r\u008c\3\2"+
		"\2\2\17\u008e\3\2\2\2\21\u0093\3\2\2\2\23\u0097\3\2\2\2\25\u009c\3\2\2"+
		"\2\27\u00a0\3\2\2\2\31\u00a3\3\2\2\2\33\u00a7\3\2\2\2\35\u00ac\3\2\2\2"+
		"\37\u00b3\3\2\2\2!\u00b8\3\2\2\2#\u00bd\3\2\2\2%\u00c4\3\2\2\2\'\u00c8"+
		"\3\2\2\2)\u00ce\3\2\2\2+\u00d9\3\2\2\2-\u00db\3\2\2\2/\u00dd\3\2\2\2\61"+
		"\u00df\3\2\2\2\63\u00e1\3\2\2\2\65\u00e3\3\2\2\2\67\u00e5\3\2\2\29\u00e7"+
		"\3\2\2\2;\u00e9\3\2\2\2=\u00eb\3\2\2\2?\u00ed\3\2\2\2A\u00f0\3\2\2\2C"+
		"\u00f3\3\2\2\2E\u00f6\3\2\2\2G\u00f9\3\2\2\2I\u00fc\3\2\2\2K\u00fe\3\2"+
		"\2\2M\u0100\3\2\2\2O\u0102\3\2\2\2Q\u0104\3\2\2\2S\u0106\3\2\2\2U\u0111"+
		"\3\2\2\2W\u0113\3\2\2\2Y\u0116\3\2\2\2[\u0119\3\2\2\2]\u011b\3\2\2\2_"+
		"\u011e\3\2\2\2a\u0120\3\2\2\2c\u0123\3\2\2\2e\u0126\3\2\2\2g\u0129\3\2"+
		"\2\2i\u012b\3\2\2\2k\u012e\3\2\2\2m\u0134\3\2\2\2o\u0136\3\2\2\2q\u013b"+
		"\3\2\2\2s\u0141\3\2\2\2u\u014d\3\2\2\2w\u0158\3\2\2\2y\u0161\3\2\2\2{"+
		"}\t\2\2\2|{\3\2\2\2}~\3\2\2\2~|\3\2\2\2~\177\3\2\2\2\177\4\3\2\2\2\u0080"+
		"\u0082\t\3\2\2\u0081\u0080\3\2\2\2\u0082\u0083\3\2\2\2\u0083\u0081\3\2"+
		"\2\2\u0083\u0084\3\2\2\2\u0084\6\3\2\2\2\u0085\u0086\t\4\2\2\u0086\b\3"+
		"\2\2\2\u0087\u0088\t\5\2\2\u0088\n\3\2\2\2\u0089\u008a\7^\2\2\u008a\u008b"+
		"\7$\2\2\u008b\f\3\2\2\2\u008c\u008d\7\"\2\2\u008d\16\3\2\2\2\u008e\u008f"+
		"\7d\2\2\u008f\u0090\7q\2\2\u0090\u0091\7q\2\2\u0091\u0092\7n\2\2\u0092"+
		"\20\3\2\2\2\u0093\u0094\7f\2\2\u0094\u0095\7g\2\2\u0095\u0096\7h\2\2\u0096"+
		"\22\3\2\2\2\u0097\u0098\7g\2\2\u0098\u0099\7n\2\2\u0099\u009a\7u\2\2\u009a"+
		"\u009b\7g\2\2\u009b\24\3\2\2\2\u009c\u009d\7h\2\2\u009d\u009e\7q\2\2\u009e"+
		"\u009f\7t\2\2\u009f\26\3\2\2\2\u00a0\u00a1\7k\2\2\u00a1\u00a2\7h\2\2\u00a2"+
		"\30\3\2\2\2\u00a3\u00a4\7k\2\2\u00a4\u00a5\7p\2\2\u00a5\u00a6\7v\2\2\u00a6"+
		"\32\3\2\2\2\u00a7\u00a8\7t\2\2\u00a8\u00a9\7g\2\2\u00a9\u00aa\7c\2\2\u00aa"+
		"\u00ab\7f\2\2\u00ab\34\3\2\2\2\u00ac\u00ad\7t\2\2\u00ad\u00ae\7g\2\2\u00ae"+
		"\u00af\7v\2\2\u00af\u00b0\7w\2\2\u00b0\u00b1\7t\2\2\u00b1\u00b2\7p\2\2"+
		"\u00b2\36\3\2\2\2\u00b3\u00b4\7u\2\2\u00b4\u00b5\7m\2\2\u00b5\u00b6\7"+
		"k\2\2\u00b6\u00b7\7r\2\2\u00b7 \3\2\2\2\u00b8\u00b9\7u\2\2\u00b9\u00ba"+
		"\7v\2\2\u00ba\u00bb\7q\2\2\u00bb\u00bc\7r\2\2\u00bc\"\3\2\2\2\u00bd\u00be"+
		"\7u\2\2\u00be\u00bf\7v\2\2\u00bf\u00c0\7t\2\2\u00c0\u00c1\7k\2\2\u00c1"+
		"\u00c2\7p\2\2\u00c2\u00c3\7i\2\2\u00c3$\3\2\2\2\u00c4\u00c5\7x\2\2\u00c5"+
		"\u00c6\7c\2\2\u00c6\u00c7\7t\2\2\u00c7&\3\2\2\2\u00c8\u00c9\7y\2\2\u00c9"+
		"\u00ca\7j\2\2\u00ca\u00cb\7k\2\2\u00cb\u00cc\7n\2\2\u00cc\u00cd\7g\2\2"+
		"\u00cd(\3\2\2\2\u00ce\u00cf\7y\2\2\u00cf\u00d0\7t\2\2\u00d0\u00d1\7k\2"+
		"\2\u00d1\u00d2\7v\2\2\u00d2\u00d3\7g\2\2\u00d3*\3\2\2\2\u00d4\u00da\5"+
		"I%\2\u00d5\u00da\5K&\2\u00d6\u00da\5M\'\2\u00d7\u00da\5O(\2\u00d8\u00da"+
		"\5Q)\2\u00d9\u00d4\3\2\2\2\u00d9\u00d5\3\2\2\2\u00d9\u00d6\3\2\2\2\u00d9"+
		"\u00d7\3\2\2\2\u00d9\u00d8\3\2\2\2\u00da,\3\2\2\2\u00db\u00dc\7*\2\2\u00dc"+
		".\3\2\2\2\u00dd\u00de\7+\2\2\u00de\60\3\2\2\2\u00df\u00e0\7]\2\2\u00e0"+
		"\62\3\2\2\2\u00e1\u00e2\7_\2\2\u00e2\64\3\2\2\2\u00e3\u00e4\7}\2\2\u00e4"+
		"\66\3\2\2\2\u00e5\u00e6\7\177\2\2\u00e68\3\2\2\2\u00e7\u00e8\7.\2\2\u00e8"+
		":\3\2\2\2\u00e9\u00ea\7<\2\2\u00ea<\3\2\2\2\u00eb\u00ec\7=\2\2\u00ec>"+
		"\3\2\2\2\u00ed\u00ee\7-\2\2\u00ee\u00ef\7?\2\2\u00ef@\3\2\2\2\u00f0\u00f1"+
		"\7/\2\2\u00f1\u00f2\7?\2\2\u00f2B\3\2\2\2\u00f3\u00f4\7,\2\2\u00f4\u00f5"+
		"\7?\2\2\u00f5D\3\2\2\2\u00f6\u00f7\7\61\2\2\u00f7\u00f8\7?\2\2\u00f8F"+
		"\3\2\2\2\u00f9\u00fa\7\'\2\2\u00fa\u00fb\7?\2\2\u00fbH\3\2\2\2\u00fc\u00fd"+
		"\7-\2\2\u00fdJ\3\2\2\2\u00fe\u00ff\7/\2\2\u00ffL\3\2\2\2\u0100\u0101\7"+
		",\2\2\u0101N\3\2\2\2\u0102\u0103\7\61\2\2\u0103P\3\2\2\2\u0104\u0105\7"+
		"\'\2\2\u0105R\3\2\2\2\u0106\u0107\7?\2\2\u0107T\3\2\2\2\u0108\u0112\5"+
		"W,\2\u0109\u0112\5Y-\2\u010a\u0112\5[.\2\u010b\u0112\5]/\2\u010c\u0112"+
		"\5_\60\2\u010d\u0112\5a\61\2\u010e\u0112\5c\62\2\u010f\u0112\5e\63\2\u0110"+
		"\u0112\5g\64\2\u0111\u0108\3\2\2\2\u0111\u0109\3\2\2\2\u0111\u010a\3\2"+
		"\2\2\u0111\u010b\3\2\2\2\u0111\u010c\3\2\2\2\u0111\u010d\3\2\2\2\u0111"+
		"\u010e\3\2\2\2\u0111\u010f\3\2\2\2\u0111\u0110\3\2\2\2\u0112V\3\2\2\2"+
		"\u0113\u0114\7?\2\2\u0114\u0115\7?\2\2\u0115X\3\2\2\2\u0116\u0117\7#\2"+
		"\2\u0117\u0118\7?\2\2\u0118Z\3\2\2\2\u0119\u011a\7@\2\2\u011a\\\3\2\2"+
		"\2\u011b\u011c\7@\2\2\u011c\u011d\7?\2\2\u011d^\3\2\2\2\u011e\u011f\7"+
		">\2\2\u011f`\3\2\2\2\u0120\u0121\7>\2\2\u0121\u0122\7?\2\2\u0122b\3\2"+
		"\2\2\u0123\u0124\7~\2\2\u0124\u0125\7~\2\2\u0125d\3\2\2\2\u0126\u0127"+
		"\7(\2\2\u0127\u0128\7(\2\2\u0128f\3\2\2\2\u0129\u012a\7#\2\2\u012ah\3"+
		"\2\2\2\u012b\u012c\7A\2\2\u012cj\3\2\2\2\u012d\u012f\5\7\4\2\u012e\u012d"+
		"\3\2\2\2\u012f\u0130\3\2\2\2\u0130\u012e\3\2\2\2\u0130\u0131\3\2\2\2\u0131"+
		"l\3\2\2\2\u0132\u0135\5o8\2\u0133\u0135\5q9\2\u0134\u0132\3\2\2\2\u0134"+
		"\u0133\3\2\2\2\u0135n\3\2\2\2\u0136\u0137\7v\2\2\u0137\u0138\7t\2\2\u0138"+
		"\u0139\7w\2\2\u0139\u013a\7g\2\2\u013ap\3\2\2\2\u013b\u013c\7h\2\2\u013c"+
		"\u013d\7c\2\2\u013d\u013e\7n\2\2\u013e\u013f\7u\2\2\u013f\u0140\7g\2\2"+
		"\u0140r\3\2\2\2\u0141\u0147\7$\2\2\u0142\u0148\5\3\2\2\u0143\u0148\5\5"+
		"\3\2\u0144\u0148\5\13\6\2\u0145\u0148\5\r\7\2\u0146\u0148\5\7\4\2\u0147"+
		"\u0142\3\2\2\2\u0147\u0143\3\2\2\2\u0147\u0144\3\2\2\2\u0147\u0145\3\2"+
		"\2\2\u0147\u0146\3\2\2\2\u0148\u0149\3\2\2\2\u0149\u0147\3\2\2\2\u0149"+
		"\u014a\3\2\2\2\u014a\u014b\3\2\2\2\u014b\u014c\7$\2\2\u014ct\3\2\2\2\u014d"+
		"\u014e\7\61\2\2\u014e\u014f\7\61\2\2\u014f\u0151\3\2\2\2\u0150\u0152\n"+
		"\6\2\2\u0151\u0150\3\2\2\2\u0152\u0153\3\2\2\2\u0153\u0151\3\2\2\2\u0153"+
		"\u0154\3\2\2\2\u0154\u0155\3\2\2\2\u0155\u0156\b;\2\2\u0156v\3\2\2\2\u0157"+
		"\u0159\t\7\2\2\u0158\u0157\3\2\2\2\u0159\u015a\3\2\2\2\u015a\u0158\3\2"+
		"\2\2\u015a\u015b\3\2\2\2\u015b\u015c\3\2\2\2\u015c\u015d\b<\2\2\u015d"+
		"x\3\2\2\2\u015e\u0162\7a\2\2\u015f\u0162\5\3\2\2\u0160\u0162\5\5\3\2\u0161"+
		"\u015e\3\2\2\2\u0161\u015f\3\2\2\2\u0161\u0160\3\2\2\2\u0162\u016b\3\2"+
		"\2\2\u0163\u0168\7a\2\2\u0164\u0168\5\3\2\2\u0165\u0168\5\5\3\2\u0166"+
		"\u0168\5\7\4\2\u0167\u0163\3\2\2\2\u0167\u0164\3\2\2\2\u0167\u0165\3\2"+
		"\2\2\u0167\u0166\3\2\2\2\u0168\u0169\3\2\2\2\u0169\u0167\3\2\2\2\u0169"+
		"\u016a\3\2\2\2\u016a\u016c\3\2\2\2\u016b\u0167\3\2\2\2\u016b\u016c\3\2"+
		"\2\2\u016cz\3\2\2\2\21\2~\u0083\u00d9\u0111\u0130\u0134\u0147\u0149\u0153"+
		"\u015a\u0161\u0167\u0169\u016b\3\b\2\2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}