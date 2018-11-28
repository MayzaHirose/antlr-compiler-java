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
		T__0=1, BOOL_KW=2, DEF_KW=3, ELSE_KW=4, FOR_KW=5, IF_KW=6, INT_KW=7, READ_KW=8, 
		RETURN_KW=9, SKIP_KW=10, STOP_KW=11, STRING_KW=12, VAR_KW=13, WHILE_KW=14, 
		WRITE_KW=15, INTEGER=16, BOOLEAN=17, STRING=18, IGNORAR=19, COMENTARIOS=20;
	public static String[] channelNames = {
		"DEFAULT_TOKEN_CHANNEL", "HIDDEN"
	};

	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	public static final String[] ruleNames = {
		"T__0", "LOWERCASE", "UPPERCASE", "NUMBER", "ASCII", "ESCAPED_QUOTE", 
		"WHITESPACE", "BOOL_KW", "DEF_KW", "ELSE_KW", "FOR_KW", "IF_KW", "INT_KW", 
		"READ_KW", "RETURN_KW", "SKIP_KW", "STOP_KW", "STRING_KW", "VAR_KW", "WHILE_KW", 
		"WRITE_KW", "INTEGER", "BOOLEAN", "STRING", "IGNORAR", "COMENTARIOS"
	};

	private static final String[] _LITERAL_NAMES = {
		null, "'Mayza'", "'bool'", "'def'", "'else'", "'for'", "'if'", "'int'", 
		"'read'", "'return'", "'skip'", "'stop'", "'string'", "'var'", "'while'", 
		"'write'"
	};
	private static final String[] _SYMBOLIC_NAMES = {
		null, null, "BOOL_KW", "DEF_KW", "ELSE_KW", "FOR_KW", "IF_KW", "INT_KW", 
		"READ_KW", "RETURN_KW", "SKIP_KW", "STOP_KW", "STRING_KW", "VAR_KW", "WHILE_KW", 
		"WRITE_KW", "INTEGER", "BOOLEAN", "STRING", "IGNORAR", "COMENTARIOS"
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
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\2\26\u00cb\b\1\4\2"+
		"\t\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4"+
		"\13\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22"+
		"\t\22\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31"+
		"\t\31\4\32\t\32\4\33\t\33\3\2\3\2\3\2\3\2\3\2\3\2\3\3\6\3?\n\3\r\3\16"+
		"\3@\3\4\6\4D\n\4\r\4\16\4E\3\5\3\5\3\6\3\6\3\7\3\7\3\7\3\b\3\b\3\t\3\t"+
		"\3\t\3\t\3\t\3\n\3\n\3\n\3\n\3\13\3\13\3\13\3\13\3\13\3\f\3\f\3\f\3\f"+
		"\3\r\3\r\3\r\3\16\3\16\3\16\3\16\3\17\3\17\3\17\3\17\3\17\3\20\3\20\3"+
		"\20\3\20\3\20\3\20\3\20\3\21\3\21\3\21\3\21\3\21\3\22\3\22\3\22\3\22\3"+
		"\22\3\23\3\23\3\23\3\23\3\23\3\23\3\23\3\24\3\24\3\24\3\24\3\25\3\25\3"+
		"\25\3\25\3\25\3\25\3\26\3\26\3\26\3\26\3\26\3\26\3\27\6\27\u0098\n\27"+
		"\r\27\16\27\u0099\3\30\3\30\3\30\3\30\3\30\3\30\3\30\3\30\3\30\5\30\u00a5"+
		"\n\30\3\31\3\31\3\31\3\31\3\31\3\31\3\31\6\31\u00ae\n\31\r\31\16\31\u00af"+
		"\3\31\3\31\3\32\6\32\u00b5\n\32\r\32\16\32\u00b6\3\32\3\32\3\33\3\33\3"+
		"\33\3\33\3\33\3\33\3\33\3\33\3\33\6\33\u00c4\n\33\r\33\16\33\u00c5\3\33"+
		"\3\33\3\33\3\33\2\2\34\3\3\5\2\7\2\t\2\13\2\r\2\17\2\21\4\23\5\25\6\27"+
		"\7\31\b\33\t\35\n\37\13!\f#\r%\16\'\17)\20+\21-\22/\23\61\24\63\25\65"+
		"\26\3\2\7\3\2c|\3\2C\\\3\2\62;\3\2\2\u0081\5\2\13\f\17\17\"\"\2\u00d5"+
		"\2\3\3\2\2\2\2\21\3\2\2\2\2\23\3\2\2\2\2\25\3\2\2\2\2\27\3\2\2\2\2\31"+
		"\3\2\2\2\2\33\3\2\2\2\2\35\3\2\2\2\2\37\3\2\2\2\2!\3\2\2\2\2#\3\2\2\2"+
		"\2%\3\2\2\2\2\'\3\2\2\2\2)\3\2\2\2\2+\3\2\2\2\2-\3\2\2\2\2/\3\2\2\2\2"+
		"\61\3\2\2\2\2\63\3\2\2\2\2\65\3\2\2\2\3\67\3\2\2\2\5>\3\2\2\2\7C\3\2\2"+
		"\2\tG\3\2\2\2\13I\3\2\2\2\rK\3\2\2\2\17N\3\2\2\2\21P\3\2\2\2\23U\3\2\2"+
		"\2\25Y\3\2\2\2\27^\3\2\2\2\31b\3\2\2\2\33e\3\2\2\2\35i\3\2\2\2\37n\3\2"+
		"\2\2!u\3\2\2\2#z\3\2\2\2%\177\3\2\2\2\'\u0086\3\2\2\2)\u008a\3\2\2\2+"+
		"\u0090\3\2\2\2-\u0097\3\2\2\2/\u00a4\3\2\2\2\61\u00a6\3\2\2\2\63\u00b4"+
		"\3\2\2\2\65\u00ba\3\2\2\2\678\7O\2\289\7c\2\29:\7{\2\2:;\7|\2\2;<\7c\2"+
		"\2<\4\3\2\2\2=?\t\2\2\2>=\3\2\2\2?@\3\2\2\2@>\3\2\2\2@A\3\2\2\2A\6\3\2"+
		"\2\2BD\t\3\2\2CB\3\2\2\2DE\3\2\2\2EC\3\2\2\2EF\3\2\2\2F\b\3\2\2\2GH\t"+
		"\4\2\2H\n\3\2\2\2IJ\t\5\2\2J\f\3\2\2\2KL\7^\2\2LM\7$\2\2M\16\3\2\2\2N"+
		"O\7\"\2\2O\20\3\2\2\2PQ\7d\2\2QR\7q\2\2RS\7q\2\2ST\7n\2\2T\22\3\2\2\2"+
		"UV\7f\2\2VW\7g\2\2WX\7h\2\2X\24\3\2\2\2YZ\7g\2\2Z[\7n\2\2[\\\7u\2\2\\"+
		"]\7g\2\2]\26\3\2\2\2^_\7h\2\2_`\7q\2\2`a\7t\2\2a\30\3\2\2\2bc\7k\2\2c"+
		"d\7h\2\2d\32\3\2\2\2ef\7k\2\2fg\7p\2\2gh\7v\2\2h\34\3\2\2\2ij\7t\2\2j"+
		"k\7g\2\2kl\7c\2\2lm\7f\2\2m\36\3\2\2\2no\7t\2\2op\7g\2\2pq\7v\2\2qr\7"+
		"w\2\2rs\7t\2\2st\7p\2\2t \3\2\2\2uv\7u\2\2vw\7m\2\2wx\7k\2\2xy\7r\2\2"+
		"y\"\3\2\2\2z{\7u\2\2{|\7v\2\2|}\7q\2\2}~\7r\2\2~$\3\2\2\2\177\u0080\7"+
		"u\2\2\u0080\u0081\7v\2\2\u0081\u0082\7t\2\2\u0082\u0083\7k\2\2\u0083\u0084"+
		"\7p\2\2\u0084\u0085\7i\2\2\u0085&\3\2\2\2\u0086\u0087\7x\2\2\u0087\u0088"+
		"\7c\2\2\u0088\u0089\7t\2\2\u0089(\3\2\2\2\u008a\u008b\7y\2\2\u008b\u008c"+
		"\7j\2\2\u008c\u008d\7k\2\2\u008d\u008e\7n\2\2\u008e\u008f\7g\2\2\u008f"+
		"*\3\2\2\2\u0090\u0091\7y\2\2\u0091\u0092\7t\2\2\u0092\u0093\7k\2\2\u0093"+
		"\u0094\7v\2\2\u0094\u0095\7g\2\2\u0095,\3\2\2\2\u0096\u0098\5\t\5\2\u0097"+
		"\u0096\3\2\2\2\u0098\u0099\3\2\2\2\u0099\u0097\3\2\2\2\u0099\u009a\3\2"+
		"\2\2\u009a.\3\2\2\2\u009b\u009c\7v\2\2\u009c\u009d\7t\2\2\u009d\u009e"+
		"\7w\2\2\u009e\u00a5\7g\2\2\u009f\u00a0\7h\2\2\u00a0\u00a1\7c\2\2\u00a1"+
		"\u00a2\7n\2\2\u00a2\u00a3\7u\2\2\u00a3\u00a5\7g\2\2\u00a4\u009b\3\2\2"+
		"\2\u00a4\u009f\3\2\2\2\u00a5\60\3\2\2\2\u00a6\u00ad\7$\2\2\u00a7\u00ae"+
		"\5\5\3\2\u00a8\u00ae\5\7\4\2\u00a9\u00ae\5\r\7\2\u00aa\u00ae\5\17\b\2"+
		"\u00ab\u00ae\5\t\5\2\u00ac\u00ae\5\13\6\2\u00ad\u00a7\3\2\2\2\u00ad\u00a8"+
		"\3\2\2\2\u00ad\u00a9\3\2\2\2\u00ad\u00aa\3\2\2\2\u00ad\u00ab\3\2\2\2\u00ad"+
		"\u00ac\3\2\2\2\u00ae\u00af\3\2\2\2\u00af\u00ad\3\2\2\2\u00af\u00b0\3\2"+
		"\2\2\u00b0\u00b1\3\2\2\2\u00b1\u00b2\7$\2\2\u00b2\62\3\2\2\2\u00b3\u00b5"+
		"\t\6\2\2\u00b4\u00b3\3\2\2\2\u00b5\u00b6\3\2\2\2\u00b6\u00b4\3\2\2\2\u00b6"+
		"\u00b7\3\2\2\2\u00b7\u00b8\3\2\2\2\u00b8\u00b9\b\32\2\2\u00b9\64\3\2\2"+
		"\2\u00ba\u00bb\7\61\2\2\u00bb\u00bc\7\61\2\2\u00bc\u00c3\3\2\2\2\u00bd"+
		"\u00c4\5\5\3\2\u00be\u00c4\5\7\4\2\u00bf\u00c4\5\r\7\2\u00c0\u00c4\5\17"+
		"\b\2\u00c1\u00c4\5\t\5\2\u00c2\u00c4\5\13\6\2\u00c3\u00bd\3\2\2\2\u00c3"+
		"\u00be\3\2\2\2\u00c3\u00bf\3\2\2\2\u00c3\u00c0\3\2\2\2\u00c3\u00c1\3\2"+
		"\2\2\u00c3\u00c2\3\2\2\2\u00c4\u00c5\3\2\2\2\u00c5\u00c3\3\2\2\2\u00c5"+
		"\u00c6\3\2\2\2\u00c6\u00c7\3\2\2\2\u00c7\u00c8\7\f\2\2\u00c8\u00c9\3\2"+
		"\2\2\u00c9\u00ca\b\33\2\2\u00ca\66\3\2\2\2\f\2@E\u0099\u00a4\u00ad\u00af"+
		"\u00b6\u00c3\u00c5\3\b\2\2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}