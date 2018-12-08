// Generated from Grace.g4 by ANTLR 4.7.1
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class GraceParser extends Parser {
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
	public static final int
		RULE_start = 0, RULE_declaracao = 1, RULE_decVar = 2, RULE_listaSpecVars = 3, 
		RULE_tipo = 4, RULE_specVar = 5, RULE_specVarSimples = 6, RULE_specVarSimplesIni = 7, 
		RULE_specVarArranjo = 8, RULE_specVarArranjoIni = 9, RULE_operacaoAritmetica = 10, 
		RULE_memoriaReservada = 11, RULE_decSub = 12, RULE_decProc = 13, RULE_decFunc = 14, 
		RULE_listaParametros = 15, RULE_specParam = 16, RULE_param = 17, RULE_bloco = 18, 
		RULE_comando = 19, RULE_cmdSimples = 20, RULE_cmdAtrib = 21, RULE_atrib = 22, 
		RULE_cmdIf = 23, RULE_cmdWhile = 24, RULE_cmdFor = 25, RULE_atribIni = 26, 
		RULE_atribPasso = 27, RULE_cmdBloco = 28, RULE_expressao = 29;
	public static final String[] ruleNames = {
		"start", "declaracao", "decVar", "listaSpecVars", "tipo", "specVar", "specVarSimples", 
		"specVarSimplesIni", "specVarArranjo", "specVarArranjoIni", "operacaoAritmetica", 
		"memoriaReservada", "decSub", "decProc", "decFunc", "listaParametros", 
		"specParam", "param", "bloco", "comando", "cmdSimples", "cmdAtrib", "atrib", 
		"cmdIf", "cmdWhile", "cmdFor", "atribIni", "atribPasso", "cmdBloco", "expressao"
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

	@Override
	public String getGrammarFileName() { return "Grace.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public GraceParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}
	public static class StartContext extends ParserRuleContext {
		public List<DeclaracaoContext> declaracao() {
			return getRuleContexts(DeclaracaoContext.class);
		}
		public DeclaracaoContext declaracao(int i) {
			return getRuleContext(DeclaracaoContext.class,i);
		}
		public StartContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_start; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GraceListener ) ((GraceListener)listener).enterStart(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GraceListener ) ((GraceListener)listener).exitStart(this);
		}
	}

	public final StartContext start() throws RecognitionException {
		StartContext _localctx = new StartContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_start);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(61); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(60);
				declaracao();
				}
				}
				setState(63); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( _la==DEF_KW || _la==VAR_KW );
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

	public static class DeclaracaoContext extends ParserRuleContext {
		public DecVarContext decVar() {
			return getRuleContext(DecVarContext.class,0);
		}
		public DecSubContext decSub() {
			return getRuleContext(DecSubContext.class,0);
		}
		public DeclaracaoContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_declaracao; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GraceListener ) ((GraceListener)listener).enterDeclaracao(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GraceListener ) ((GraceListener)listener).exitDeclaracao(this);
		}
	}

	public final DeclaracaoContext declaracao() throws RecognitionException {
		DeclaracaoContext _localctx = new DeclaracaoContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_declaracao);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(67);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case VAR_KW:
				{
				setState(65);
				decVar();
				}
				break;
			case DEF_KW:
				{
				setState(66);
				decSub();
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

	public static class DecVarContext extends ParserRuleContext {
		public TerminalNode VAR_KW() { return getToken(GraceParser.VAR_KW, 0); }
		public ListaSpecVarsContext listaSpecVars() {
			return getRuleContext(ListaSpecVarsContext.class,0);
		}
		public TerminalNode COLON() { return getToken(GraceParser.COLON, 0); }
		public TerminalNode SEMICOLON() { return getToken(GraceParser.SEMICOLON, 0); }
		public TipoContext tipo() {
			return getRuleContext(TipoContext.class,0);
		}
		public TerminalNode STRING_KW() { return getToken(GraceParser.STRING_KW, 0); }
		public MemoriaReservadaContext memoriaReservada() {
			return getRuleContext(MemoriaReservadaContext.class,0);
		}
		public DecVarContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_decVar; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GraceListener ) ((GraceListener)listener).enterDecVar(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GraceListener ) ((GraceListener)listener).exitDecVar(this);
		}
	}

	public final DecVarContext decVar() throws RecognitionException {
		DecVarContext _localctx = new DecVarContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_decVar);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(69);
			match(VAR_KW);
			setState(70);
			listaSpecVars();
			setState(71);
			match(COLON);
			setState(75);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,2,_ctx) ) {
			case 1:
				{
				setState(72);
				tipo();
				}
				break;
			case 2:
				{
				setState(73);
				match(STRING_KW);
				setState(74);
				memoriaReservada();
				}
				break;
			}
			setState(77);
			match(SEMICOLON);
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

	public static class ListaSpecVarsContext extends ParserRuleContext {
		public List<SpecVarContext> specVar() {
			return getRuleContexts(SpecVarContext.class);
		}
		public SpecVarContext specVar(int i) {
			return getRuleContext(SpecVarContext.class,i);
		}
		public List<TerminalNode> COMMA() { return getTokens(GraceParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(GraceParser.COMMA, i);
		}
		public ListaSpecVarsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_listaSpecVars; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GraceListener ) ((GraceListener)listener).enterListaSpecVars(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GraceListener ) ((GraceListener)listener).exitListaSpecVars(this);
		}
	}

	public final ListaSpecVarsContext listaSpecVars() throws RecognitionException {
		ListaSpecVarsContext _localctx = new ListaSpecVarsContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_listaSpecVars);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(79);
			specVar();
			setState(86);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==COMMA) {
				{
				setState(82); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					{
					setState(80);
					match(COMMA);
					setState(81);
					specVar();
					}
					}
					setState(84); 
					_errHandler.sync(this);
					_la = _input.LA(1);
				} while ( _la==COMMA );
				}
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

	public static class TipoContext extends ParserRuleContext {
		public TerminalNode BOOL_KW() { return getToken(GraceParser.BOOL_KW, 0); }
		public TerminalNode INT_KW() { return getToken(GraceParser.INT_KW, 0); }
		public TerminalNode STRING_KW() { return getToken(GraceParser.STRING_KW, 0); }
		public TipoContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_tipo; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GraceListener ) ((GraceListener)listener).enterTipo(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GraceListener ) ((GraceListener)listener).exitTipo(this);
		}
	}

	public final TipoContext tipo() throws RecognitionException {
		TipoContext _localctx = new TipoContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_tipo);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(88);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << BOOL_KW) | (1L << INT_KW) | (1L << STRING_KW))) != 0)) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
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

	public static class SpecVarContext extends ParserRuleContext {
		public SpecVarSimplesContext specVarSimples() {
			return getRuleContext(SpecVarSimplesContext.class,0);
		}
		public SpecVarSimplesIniContext specVarSimplesIni() {
			return getRuleContext(SpecVarSimplesIniContext.class,0);
		}
		public SpecVarArranjoContext specVarArranjo() {
			return getRuleContext(SpecVarArranjoContext.class,0);
		}
		public SpecVarArranjoIniContext specVarArranjoIni() {
			return getRuleContext(SpecVarArranjoIniContext.class,0);
		}
		public SpecVarContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_specVar; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GraceListener ) ((GraceListener)listener).enterSpecVar(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GraceListener ) ((GraceListener)listener).exitSpecVar(this);
		}
	}

	public final SpecVarContext specVar() throws RecognitionException {
		SpecVarContext _localctx = new SpecVarContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_specVar);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(94);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,5,_ctx) ) {
			case 1:
				{
				setState(90);
				specVarSimples();
				}
				break;
			case 2:
				{
				setState(91);
				specVarSimplesIni();
				}
				break;
			case 3:
				{
				setState(92);
				specVarArranjo();
				}
				break;
			case 4:
				{
				setState(93);
				specVarArranjoIni();
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

	public static class SpecVarSimplesContext extends ParserRuleContext {
		public TerminalNode IDENTIFIER() { return getToken(GraceParser.IDENTIFIER, 0); }
		public SpecVarSimplesContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_specVarSimples; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GraceListener ) ((GraceListener)listener).enterSpecVarSimples(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GraceListener ) ((GraceListener)listener).exitSpecVarSimples(this);
		}
	}

	public final SpecVarSimplesContext specVarSimples() throws RecognitionException {
		SpecVarSimplesContext _localctx = new SpecVarSimplesContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_specVarSimples);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(96);
			match(IDENTIFIER);
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

	public static class SpecVarSimplesIniContext extends ParserRuleContext {
		public TerminalNode IDENTIFIER() { return getToken(GraceParser.IDENTIFIER, 0); }
		public TerminalNode ATTRIB() { return getToken(GraceParser.ATTRIB, 0); }
		public OperacaoAritmeticaContext operacaoAritmetica() {
			return getRuleContext(OperacaoAritmeticaContext.class,0);
		}
		public TerminalNode INTEGER() { return getToken(GraceParser.INTEGER, 0); }
		public TerminalNode BOOLEAN() { return getToken(GraceParser.BOOLEAN, 0); }
		public TerminalNode STRING() { return getToken(GraceParser.STRING, 0); }
		public SpecVarSimplesIniContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_specVarSimplesIni; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GraceListener ) ((GraceListener)listener).enterSpecVarSimplesIni(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GraceListener ) ((GraceListener)listener).exitSpecVarSimplesIni(this);
		}
	}

	public final SpecVarSimplesIniContext specVarSimplesIni() throws RecognitionException {
		SpecVarSimplesIniContext _localctx = new SpecVarSimplesIniContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_specVarSimplesIni);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(98);
			match(IDENTIFIER);
			setState(99);
			match(ATTRIB);
			setState(104);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,6,_ctx) ) {
			case 1:
				{
				setState(100);
				operacaoAritmetica();
				}
				break;
			case 2:
				{
				setState(101);
				match(INTEGER);
				}
				break;
			case 3:
				{
				setState(102);
				match(BOOLEAN);
				}
				break;
			case 4:
				{
				setState(103);
				match(STRING);
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

	public static class SpecVarArranjoContext extends ParserRuleContext {
		public TerminalNode IDENTIFIER() { return getToken(GraceParser.IDENTIFIER, 0); }
		public MemoriaReservadaContext memoriaReservada() {
			return getRuleContext(MemoriaReservadaContext.class,0);
		}
		public SpecVarArranjoContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_specVarArranjo; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GraceListener ) ((GraceListener)listener).enterSpecVarArranjo(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GraceListener ) ((GraceListener)listener).exitSpecVarArranjo(this);
		}
	}

	public final SpecVarArranjoContext specVarArranjo() throws RecognitionException {
		SpecVarArranjoContext _localctx = new SpecVarArranjoContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_specVarArranjo);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(106);
			match(IDENTIFIER);
			setState(107);
			memoriaReservada();
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

	public static class SpecVarArranjoIniContext extends ParserRuleContext {
		public TerminalNode IDENTIFIER() { return getToken(GraceParser.IDENTIFIER, 0); }
		public MemoriaReservadaContext memoriaReservada() {
			return getRuleContext(MemoriaReservadaContext.class,0);
		}
		public TerminalNode ATTRIB() { return getToken(GraceParser.ATTRIB, 0); }
		public TerminalNode CBRACES_OPEN() { return getToken(GraceParser.CBRACES_OPEN, 0); }
		public TerminalNode CBRACES_CLOSE() { return getToken(GraceParser.CBRACES_CLOSE, 0); }
		public List<TerminalNode> INTEGER() { return getTokens(GraceParser.INTEGER); }
		public TerminalNode INTEGER(int i) {
			return getToken(GraceParser.INTEGER, i);
		}
		public List<TerminalNode> BOOLEAN() { return getTokens(GraceParser.BOOLEAN); }
		public TerminalNode BOOLEAN(int i) {
			return getToken(GraceParser.BOOLEAN, i);
		}
		public List<TerminalNode> STRING() { return getTokens(GraceParser.STRING); }
		public TerminalNode STRING(int i) {
			return getToken(GraceParser.STRING, i);
		}
		public List<TerminalNode> COMMA() { return getTokens(GraceParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(GraceParser.COMMA, i);
		}
		public SpecVarArranjoIniContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_specVarArranjoIni; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GraceListener ) ((GraceListener)listener).enterSpecVarArranjoIni(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GraceListener ) ((GraceListener)listener).exitSpecVarArranjoIni(this);
		}
	}

	public final SpecVarArranjoIniContext specVarArranjoIni() throws RecognitionException {
		SpecVarArranjoIniContext _localctx = new SpecVarArranjoIniContext(_ctx, getState());
		enterRule(_localctx, 18, RULE_specVarArranjoIni);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(109);
			match(IDENTIFIER);
			setState(110);
			memoriaReservada();
			setState(111);
			match(ATTRIB);
			setState(112);
			match(CBRACES_OPEN);
			setState(113);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << INTEGER) | (1L << BOOLEAN) | (1L << STRING))) != 0)) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			setState(120);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==COMMA) {
				{
				setState(116); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					{
					setState(114);
					match(COMMA);
					setState(115);
					_la = _input.LA(1);
					if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << INTEGER) | (1L << BOOLEAN) | (1L << STRING))) != 0)) ) {
					_errHandler.recoverInline(this);
					}
					else {
						if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
						_errHandler.reportMatch(this);
						consume();
					}
					}
					}
					setState(118); 
					_errHandler.sync(this);
					_la = _input.LA(1);
				} while ( _la==COMMA );
				}
			}

			setState(122);
			match(CBRACES_CLOSE);
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

	public static class OperacaoAritmeticaContext extends ParserRuleContext {
		public List<TerminalNode> OP_ARITMETICO() { return getTokens(GraceParser.OP_ARITMETICO); }
		public TerminalNode OP_ARITMETICO(int i) {
			return getToken(GraceParser.OP_ARITMETICO, i);
		}
		public List<TerminalNode> INTEGER() { return getTokens(GraceParser.INTEGER); }
		public TerminalNode INTEGER(int i) {
			return getToken(GraceParser.INTEGER, i);
		}
		public List<TerminalNode> IDENTIFIER() { return getTokens(GraceParser.IDENTIFIER); }
		public TerminalNode IDENTIFIER(int i) {
			return getToken(GraceParser.IDENTIFIER, i);
		}
		public OperacaoAritmeticaContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_operacaoAritmetica; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GraceListener ) ((GraceListener)listener).enterOperacaoAritmetica(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GraceListener ) ((GraceListener)listener).exitOperacaoAritmetica(this);
		}
	}

	public final OperacaoAritmeticaContext operacaoAritmetica() throws RecognitionException {
		OperacaoAritmeticaContext _localctx = new OperacaoAritmeticaContext(_ctx, getState());
		enterRule(_localctx, 20, RULE_operacaoAritmetica);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(124);
			_la = _input.LA(1);
			if ( !(_la==INTEGER || _la==IDENTIFIER) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			setState(125);
			match(OP_ARITMETICO);
			setState(126);
			_la = _input.LA(1);
			if ( !(_la==INTEGER || _la==IDENTIFIER) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			setState(133);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==OP_ARITMETICO) {
				{
				setState(129); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					{
					setState(127);
					match(OP_ARITMETICO);
					setState(128);
					_la = _input.LA(1);
					if ( !(_la==INTEGER || _la==IDENTIFIER) ) {
					_errHandler.recoverInline(this);
					}
					else {
						if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
						_errHandler.reportMatch(this);
						consume();
					}
					}
					}
					setState(131); 
					_errHandler.sync(this);
					_la = _input.LA(1);
				} while ( _la==OP_ARITMETICO );
				}
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

	public static class MemoriaReservadaContext extends ParserRuleContext {
		public TerminalNode BRACKETS_OPEN() { return getToken(GraceParser.BRACKETS_OPEN, 0); }
		public TerminalNode BRACKETS_CLOSE() { return getToken(GraceParser.BRACKETS_CLOSE, 0); }
		public TerminalNode INTEGER() { return getToken(GraceParser.INTEGER, 0); }
		public MemoriaReservadaContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_memoriaReservada; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GraceListener ) ((GraceListener)listener).enterMemoriaReservada(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GraceListener ) ((GraceListener)listener).exitMemoriaReservada(this);
		}
	}

	public final MemoriaReservadaContext memoriaReservada() throws RecognitionException {
		MemoriaReservadaContext _localctx = new MemoriaReservadaContext(_ctx, getState());
		enterRule(_localctx, 22, RULE_memoriaReservada);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(135);
			match(BRACKETS_OPEN);
			setState(137);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==INTEGER) {
				{
				setState(136);
				match(INTEGER);
				}
			}

			setState(139);
			match(BRACKETS_CLOSE);
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

	public static class DecSubContext extends ParserRuleContext {
		public DecProcContext decProc() {
			return getRuleContext(DecProcContext.class,0);
		}
		public DecFuncContext decFunc() {
			return getRuleContext(DecFuncContext.class,0);
		}
		public DecSubContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_decSub; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GraceListener ) ((GraceListener)listener).enterDecSub(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GraceListener ) ((GraceListener)listener).exitDecSub(this);
		}
	}

	public final DecSubContext decSub() throws RecognitionException {
		DecSubContext _localctx = new DecSubContext(_ctx, getState());
		enterRule(_localctx, 24, RULE_decSub);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(143);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,12,_ctx) ) {
			case 1:
				{
				setState(141);
				decProc();
				}
				break;
			case 2:
				{
				setState(142);
				decFunc();
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

	public static class DecProcContext extends ParserRuleContext {
		public TerminalNode DEF_KW() { return getToken(GraceParser.DEF_KW, 0); }
		public TerminalNode IDENTIFIER() { return getToken(GraceParser.IDENTIFIER, 0); }
		public TerminalNode PAREN_OPEN() { return getToken(GraceParser.PAREN_OPEN, 0); }
		public ListaParametrosContext listaParametros() {
			return getRuleContext(ListaParametrosContext.class,0);
		}
		public TerminalNode PAREN_CLOSE() { return getToken(GraceParser.PAREN_CLOSE, 0); }
		public BlocoContext bloco() {
			return getRuleContext(BlocoContext.class,0);
		}
		public DecProcContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_decProc; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GraceListener ) ((GraceListener)listener).enterDecProc(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GraceListener ) ((GraceListener)listener).exitDecProc(this);
		}
	}

	public final DecProcContext decProc() throws RecognitionException {
		DecProcContext _localctx = new DecProcContext(_ctx, getState());
		enterRule(_localctx, 26, RULE_decProc);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(145);
			match(DEF_KW);
			setState(146);
			match(IDENTIFIER);
			setState(147);
			match(PAREN_OPEN);
			setState(148);
			listaParametros();
			setState(149);
			match(PAREN_CLOSE);
			setState(150);
			bloco();
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

	public static class DecFuncContext extends ParserRuleContext {
		public TerminalNode DEF_KW() { return getToken(GraceParser.DEF_KW, 0); }
		public TerminalNode IDENTIFIER() { return getToken(GraceParser.IDENTIFIER, 0); }
		public TerminalNode PAREN_OPEN() { return getToken(GraceParser.PAREN_OPEN, 0); }
		public ListaParametrosContext listaParametros() {
			return getRuleContext(ListaParametrosContext.class,0);
		}
		public TerminalNode PAREN_CLOSE() { return getToken(GraceParser.PAREN_CLOSE, 0); }
		public TerminalNode COLON() { return getToken(GraceParser.COLON, 0); }
		public TipoContext tipo() {
			return getRuleContext(TipoContext.class,0);
		}
		public BlocoContext bloco() {
			return getRuleContext(BlocoContext.class,0);
		}
		public DecFuncContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_decFunc; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GraceListener ) ((GraceListener)listener).enterDecFunc(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GraceListener ) ((GraceListener)listener).exitDecFunc(this);
		}
	}

	public final DecFuncContext decFunc() throws RecognitionException {
		DecFuncContext _localctx = new DecFuncContext(_ctx, getState());
		enterRule(_localctx, 28, RULE_decFunc);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(152);
			match(DEF_KW);
			setState(153);
			match(IDENTIFIER);
			setState(154);
			match(PAREN_OPEN);
			setState(155);
			listaParametros();
			setState(156);
			match(PAREN_CLOSE);
			setState(157);
			match(COLON);
			setState(158);
			tipo();
			setState(159);
			bloco();
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

	public static class ListaParametrosContext extends ParserRuleContext {
		public List<SpecParamContext> specParam() {
			return getRuleContexts(SpecParamContext.class);
		}
		public SpecParamContext specParam(int i) {
			return getRuleContext(SpecParamContext.class,i);
		}
		public List<TerminalNode> SEMICOLON() { return getTokens(GraceParser.SEMICOLON); }
		public TerminalNode SEMICOLON(int i) {
			return getToken(GraceParser.SEMICOLON, i);
		}
		public ListaParametrosContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_listaParametros; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GraceListener ) ((GraceListener)listener).enterListaParametros(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GraceListener ) ((GraceListener)listener).exitListaParametros(this);
		}
	}

	public final ListaParametrosContext listaParametros() throws RecognitionException {
		ListaParametrosContext _localctx = new ListaParametrosContext(_ctx, getState());
		enterRule(_localctx, 30, RULE_listaParametros);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(161);
			specParam();
			setState(168);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==SEMICOLON) {
				{
				setState(164); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					{
					setState(162);
					match(SEMICOLON);
					setState(163);
					specParam();
					}
					}
					setState(166); 
					_errHandler.sync(this);
					_la = _input.LA(1);
				} while ( _la==SEMICOLON );
				}
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

	public static class SpecParamContext extends ParserRuleContext {
		public List<ParamContext> param() {
			return getRuleContexts(ParamContext.class);
		}
		public ParamContext param(int i) {
			return getRuleContext(ParamContext.class,i);
		}
		public TerminalNode COLON() { return getToken(GraceParser.COLON, 0); }
		public TipoContext tipo() {
			return getRuleContext(TipoContext.class,0);
		}
		public List<TerminalNode> COMMA() { return getTokens(GraceParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(GraceParser.COMMA, i);
		}
		public SpecParamContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_specParam; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GraceListener ) ((GraceListener)listener).enterSpecParam(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GraceListener ) ((GraceListener)listener).exitSpecParam(this);
		}
	}

	public final SpecParamContext specParam() throws RecognitionException {
		SpecParamContext _localctx = new SpecParamContext(_ctx, getState());
		enterRule(_localctx, 32, RULE_specParam);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(170);
			param();
			setState(177);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==COMMA) {
				{
				setState(173); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					{
					setState(171);
					match(COMMA);
					setState(172);
					param();
					}
					}
					setState(175); 
					_errHandler.sync(this);
					_la = _input.LA(1);
				} while ( _la==COMMA );
				}
			}

			setState(179);
			match(COLON);
			setState(180);
			tipo();
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

	public static class ParamContext extends ParserRuleContext {
		public TerminalNode IDENTIFIER() { return getToken(GraceParser.IDENTIFIER, 0); }
		public TerminalNode BRACKETS_OPEN() { return getToken(GraceParser.BRACKETS_OPEN, 0); }
		public TerminalNode BRACKETS_CLOSE() { return getToken(GraceParser.BRACKETS_CLOSE, 0); }
		public ParamContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_param; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GraceListener ) ((GraceListener)listener).enterParam(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GraceListener ) ((GraceListener)listener).exitParam(this);
		}
	}

	public final ParamContext param() throws RecognitionException {
		ParamContext _localctx = new ParamContext(_ctx, getState());
		enterRule(_localctx, 34, RULE_param);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(186);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,17,_ctx) ) {
			case 1:
				{
				setState(182);
				match(IDENTIFIER);
				}
				break;
			case 2:
				{
				setState(183);
				match(IDENTIFIER);
				setState(184);
				match(BRACKETS_OPEN);
				setState(185);
				match(BRACKETS_CLOSE);
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

	public static class BlocoContext extends ParserRuleContext {
		public TerminalNode CBRACES_OPEN() { return getToken(GraceParser.CBRACES_OPEN, 0); }
		public TerminalNode CBRACES_CLOSE() { return getToken(GraceParser.CBRACES_CLOSE, 0); }
		public List<DeclaracaoContext> declaracao() {
			return getRuleContexts(DeclaracaoContext.class);
		}
		public DeclaracaoContext declaracao(int i) {
			return getRuleContext(DeclaracaoContext.class,i);
		}
		public List<ComandoContext> comando() {
			return getRuleContexts(ComandoContext.class);
		}
		public ComandoContext comando(int i) {
			return getRuleContext(ComandoContext.class,i);
		}
		public BlocoContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_bloco; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GraceListener ) ((GraceListener)listener).enterBloco(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GraceListener ) ((GraceListener)listener).exitBloco(this);
		}
	}

	public final BlocoContext bloco() throws RecognitionException {
		BlocoContext _localctx = new BlocoContext(_ctx, getState());
		enterRule(_localctx, 36, RULE_bloco);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(188);
			match(CBRACES_OPEN);
			setState(194);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==DEF_KW || _la==VAR_KW) {
				{
				setState(190); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					{
					setState(189);
					declaracao();
					}
					}
					setState(192); 
					_errHandler.sync(this);
					_la = _input.LA(1);
				} while ( _la==DEF_KW || _la==VAR_KW );
				}
			}

			setState(201);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << FOR_KW) | (1L << IF_KW) | (1L << WHILE_KW) | (1L << AND) | (1L << IDENTIFIER))) != 0)) {
				{
				setState(197); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					{
					setState(196);
					comando();
					}
					}
					setState(199); 
					_errHandler.sync(this);
					_la = _input.LA(1);
				} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << FOR_KW) | (1L << IF_KW) | (1L << WHILE_KW) | (1L << AND) | (1L << IDENTIFIER))) != 0) );
				}
			}

			setState(203);
			match(CBRACES_CLOSE);
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

	public static class ComandoContext extends ParserRuleContext {
		public CmdSimplesContext cmdSimples() {
			return getRuleContext(CmdSimplesContext.class,0);
		}
		public CmdBlocoContext cmdBloco() {
			return getRuleContext(CmdBlocoContext.class,0);
		}
		public ComandoContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_comando; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GraceListener ) ((GraceListener)listener).enterComando(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GraceListener ) ((GraceListener)listener).exitComando(this);
		}
	}

	public final ComandoContext comando() throws RecognitionException {
		ComandoContext _localctx = new ComandoContext(_ctx, getState());
		enterRule(_localctx, 38, RULE_comando);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(207);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case FOR_KW:
			case IF_KW:
			case WHILE_KW:
			case IDENTIFIER:
				{
				setState(205);
				cmdSimples();
				}
				break;
			case AND:
				{
				setState(206);
				cmdBloco();
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

	public static class CmdSimplesContext extends ParserRuleContext {
		public CmdAtribContext cmdAtrib() {
			return getRuleContext(CmdAtribContext.class,0);
		}
		public CmdIfContext cmdIf() {
			return getRuleContext(CmdIfContext.class,0);
		}
		public CmdWhileContext cmdWhile() {
			return getRuleContext(CmdWhileContext.class,0);
		}
		public CmdForContext cmdFor() {
			return getRuleContext(CmdForContext.class,0);
		}
		public CmdSimplesContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_cmdSimples; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GraceListener ) ((GraceListener)listener).enterCmdSimples(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GraceListener ) ((GraceListener)listener).exitCmdSimples(this);
		}
	}

	public final CmdSimplesContext cmdSimples() throws RecognitionException {
		CmdSimplesContext _localctx = new CmdSimplesContext(_ctx, getState());
		enterRule(_localctx, 40, RULE_cmdSimples);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(213);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case IDENTIFIER:
				{
				setState(209);
				cmdAtrib();
				}
				break;
			case IF_KW:
				{
				setState(210);
				cmdIf();
				}
				break;
			case WHILE_KW:
				{
				setState(211);
				cmdWhile();
				}
				break;
			case FOR_KW:
				{
				setState(212);
				cmdFor();
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

	public static class CmdAtribContext extends ParserRuleContext {
		public AtribContext atrib() {
			return getRuleContext(AtribContext.class,0);
		}
		public TerminalNode SEMICOLON() { return getToken(GraceParser.SEMICOLON, 0); }
		public CmdAtribContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_cmdAtrib; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GraceListener ) ((GraceListener)listener).enterCmdAtrib(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GraceListener ) ((GraceListener)listener).exitCmdAtrib(this);
		}
	}

	public final CmdAtribContext cmdAtrib() throws RecognitionException {
		CmdAtribContext _localctx = new CmdAtribContext(_ctx, getState());
		enterRule(_localctx, 42, RULE_cmdAtrib);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(215);
			atrib();
			setState(216);
			match(SEMICOLON);
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

	public static class AtribContext extends ParserRuleContext {
		public TerminalNode IDENTIFIER() { return getToken(GraceParser.IDENTIFIER, 0); }
		public ExpressaoContext expressao() {
			return getRuleContext(ExpressaoContext.class,0);
		}
		public TerminalNode ATTRIB() { return getToken(GraceParser.ATTRIB, 0); }
		public TerminalNode ATTRIB_PLUS() { return getToken(GraceParser.ATTRIB_PLUS, 0); }
		public TerminalNode ATTRIB_MINUS() { return getToken(GraceParser.ATTRIB_MINUS, 0); }
		public TerminalNode OP_ATRIBUICAO() { return getToken(GraceParser.OP_ATRIBUICAO, 0); }
		public AtribContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_atrib; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GraceListener ) ((GraceListener)listener).enterAtrib(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GraceListener ) ((GraceListener)listener).exitAtrib(this);
		}
	}

	public final AtribContext atrib() throws RecognitionException {
		AtribContext _localctx = new AtribContext(_ctx, getState());
		enterRule(_localctx, 44, RULE_atrib);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(218);
			match(IDENTIFIER);
			setState(219);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << OP_ATRIBUICAO) | (1L << ATTRIB_PLUS) | (1L << ATTRIB_MINUS) | (1L << ATTRIB))) != 0)) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			setState(220);
			expressao();
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

	public static class CmdIfContext extends ParserRuleContext {
		public TerminalNode IF_KW() { return getToken(GraceParser.IF_KW, 0); }
		public TerminalNode PAREN_OPEN() { return getToken(GraceParser.PAREN_OPEN, 0); }
		public ExpressaoContext expressao() {
			return getRuleContext(ExpressaoContext.class,0);
		}
		public TerminalNode PAREN_CLOSE() { return getToken(GraceParser.PAREN_CLOSE, 0); }
		public List<BlocoContext> bloco() {
			return getRuleContexts(BlocoContext.class);
		}
		public BlocoContext bloco(int i) {
			return getRuleContext(BlocoContext.class,i);
		}
		public TerminalNode ELSE_KW() { return getToken(GraceParser.ELSE_KW, 0); }
		public CmdIfContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_cmdIf; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GraceListener ) ((GraceListener)listener).enterCmdIf(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GraceListener ) ((GraceListener)listener).exitCmdIf(this);
		}
	}

	public final CmdIfContext cmdIf() throws RecognitionException {
		CmdIfContext _localctx = new CmdIfContext(_ctx, getState());
		enterRule(_localctx, 46, RULE_cmdIf);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(222);
			match(IF_KW);
			setState(223);
			match(PAREN_OPEN);
			setState(224);
			expressao();
			setState(225);
			match(PAREN_CLOSE);
			setState(226);
			bloco();
			setState(229);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==ELSE_KW) {
				{
				setState(227);
				match(ELSE_KW);
				setState(228);
				bloco();
				}
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

	public static class CmdWhileContext extends ParserRuleContext {
		public TerminalNode WHILE_KW() { return getToken(GraceParser.WHILE_KW, 0); }
		public TerminalNode PAREN_OPEN() { return getToken(GraceParser.PAREN_OPEN, 0); }
		public ExpressaoContext expressao() {
			return getRuleContext(ExpressaoContext.class,0);
		}
		public TerminalNode PAREN_CLOSE() { return getToken(GraceParser.PAREN_CLOSE, 0); }
		public BlocoContext bloco() {
			return getRuleContext(BlocoContext.class,0);
		}
		public CmdWhileContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_cmdWhile; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GraceListener ) ((GraceListener)listener).enterCmdWhile(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GraceListener ) ((GraceListener)listener).exitCmdWhile(this);
		}
	}

	public final CmdWhileContext cmdWhile() throws RecognitionException {
		CmdWhileContext _localctx = new CmdWhileContext(_ctx, getState());
		enterRule(_localctx, 48, RULE_cmdWhile);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(231);
			match(WHILE_KW);
			setState(232);
			match(PAREN_OPEN);
			setState(233);
			expressao();
			setState(234);
			match(PAREN_CLOSE);
			setState(235);
			bloco();
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

	public static class CmdForContext extends ParserRuleContext {
		public TerminalNode FOR_KW() { return getToken(GraceParser.FOR_KW, 0); }
		public TerminalNode PAREN_OPEN() { return getToken(GraceParser.PAREN_OPEN, 0); }
		public AtribIniContext atribIni() {
			return getRuleContext(AtribIniContext.class,0);
		}
		public List<TerminalNode> SEMICOLON() { return getTokens(GraceParser.SEMICOLON); }
		public TerminalNode SEMICOLON(int i) {
			return getToken(GraceParser.SEMICOLON, i);
		}
		public ExpressaoContext expressao() {
			return getRuleContext(ExpressaoContext.class,0);
		}
		public AtribPassoContext atribPasso() {
			return getRuleContext(AtribPassoContext.class,0);
		}
		public TerminalNode PAREN_CLOSE() { return getToken(GraceParser.PAREN_CLOSE, 0); }
		public BlocoContext bloco() {
			return getRuleContext(BlocoContext.class,0);
		}
		public CmdForContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_cmdFor; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GraceListener ) ((GraceListener)listener).enterCmdFor(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GraceListener ) ((GraceListener)listener).exitCmdFor(this);
		}
	}

	public final CmdForContext cmdFor() throws RecognitionException {
		CmdForContext _localctx = new CmdForContext(_ctx, getState());
		enterRule(_localctx, 50, RULE_cmdFor);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(237);
			match(FOR_KW);
			setState(238);
			match(PAREN_OPEN);
			setState(239);
			atribIni();
			setState(240);
			match(SEMICOLON);
			setState(241);
			expressao();
			setState(242);
			match(SEMICOLON);
			setState(243);
			atribPasso();
			setState(244);
			match(PAREN_CLOSE);
			setState(245);
			bloco();
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

	public static class AtribIniContext extends ParserRuleContext {
		public TerminalNode IDENTIFIER() { return getToken(GraceParser.IDENTIFIER, 0); }
		public TerminalNode ATTRIB() { return getToken(GraceParser.ATTRIB, 0); }
		public TerminalNode INTEGER() { return getToken(GraceParser.INTEGER, 0); }
		public AtribIniContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_atribIni; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GraceListener ) ((GraceListener)listener).enterAtribIni(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GraceListener ) ((GraceListener)listener).exitAtribIni(this);
		}
	}

	public final AtribIniContext atribIni() throws RecognitionException {
		AtribIniContext _localctx = new AtribIniContext(_ctx, getState());
		enterRule(_localctx, 52, RULE_atribIni);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(247);
			match(IDENTIFIER);
			setState(248);
			match(ATTRIB);
			setState(249);
			match(INTEGER);
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

	public static class AtribPassoContext extends ParserRuleContext {
		public TerminalNode IDENTIFIER() { return getToken(GraceParser.IDENTIFIER, 0); }
		public TerminalNode INTEGER() { return getToken(GraceParser.INTEGER, 0); }
		public TerminalNode ATTRIB_PLUS() { return getToken(GraceParser.ATTRIB_PLUS, 0); }
		public TerminalNode ATTRIB_MINUS() { return getToken(GraceParser.ATTRIB_MINUS, 0); }
		public AtribPassoContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_atribPasso; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GraceListener ) ((GraceListener)listener).enterAtribPasso(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GraceListener ) ((GraceListener)listener).exitAtribPasso(this);
		}
	}

	public final AtribPassoContext atribPasso() throws RecognitionException {
		AtribPassoContext _localctx = new AtribPassoContext(_ctx, getState());
		enterRule(_localctx, 54, RULE_atribPasso);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(251);
			match(IDENTIFIER);
			setState(252);
			_la = _input.LA(1);
			if ( !(_la==ATTRIB_PLUS || _la==ATTRIB_MINUS) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			setState(253);
			match(INTEGER);
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

	public static class CmdBlocoContext extends ParserRuleContext {
		public TerminalNode AND() { return getToken(GraceParser.AND, 0); }
		public CmdBlocoContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_cmdBloco; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GraceListener ) ((GraceListener)listener).enterCmdBloco(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GraceListener ) ((GraceListener)listener).exitCmdBloco(this);
		}
	}

	public final CmdBlocoContext cmdBloco() throws RecognitionException {
		CmdBlocoContext _localctx = new CmdBlocoContext(_ctx, getState());
		enterRule(_localctx, 56, RULE_cmdBloco);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(255);
			match(AND);
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

	public static class ExpressaoContext extends ParserRuleContext {
		public TerminalNode AND() { return getToken(GraceParser.AND, 0); }
		public ExpressaoContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expressao; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GraceListener ) ((GraceListener)listener).enterExpressao(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GraceListener ) ((GraceListener)listener).exitExpressao(this);
		}
	}

	public final ExpressaoContext expressao() throws RecognitionException {
		ExpressaoContext _localctx = new ExpressaoContext(_ctx, getState());
		enterRule(_localctx, 58, RULE_expressao);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(257);
			match(AND);
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

	public static final String _serializedATN =
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\3\66\u0106\4\2\t\2"+
		"\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13"+
		"\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31\t\31"+
		"\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37\t\37\3\2\6\2@"+
		"\n\2\r\2\16\2A\3\3\3\3\5\3F\n\3\3\4\3\4\3\4\3\4\3\4\3\4\5\4N\n\4\3\4\3"+
		"\4\3\5\3\5\3\5\6\5U\n\5\r\5\16\5V\5\5Y\n\5\3\6\3\6\3\7\3\7\3\7\3\7\5\7"+
		"a\n\7\3\b\3\b\3\t\3\t\3\t\3\t\3\t\3\t\5\tk\n\t\3\n\3\n\3\n\3\13\3\13\3"+
		"\13\3\13\3\13\3\13\3\13\6\13w\n\13\r\13\16\13x\5\13{\n\13\3\13\3\13\3"+
		"\f\3\f\3\f\3\f\3\f\6\f\u0084\n\f\r\f\16\f\u0085\5\f\u0088\n\f\3\r\3\r"+
		"\5\r\u008c\n\r\3\r\3\r\3\16\3\16\5\16\u0092\n\16\3\17\3\17\3\17\3\17\3"+
		"\17\3\17\3\17\3\20\3\20\3\20\3\20\3\20\3\20\3\20\3\20\3\20\3\21\3\21\3"+
		"\21\6\21\u00a7\n\21\r\21\16\21\u00a8\5\21\u00ab\n\21\3\22\3\22\3\22\6"+
		"\22\u00b0\n\22\r\22\16\22\u00b1\5\22\u00b4\n\22\3\22\3\22\3\22\3\23\3"+
		"\23\3\23\3\23\5\23\u00bd\n\23\3\24\3\24\6\24\u00c1\n\24\r\24\16\24\u00c2"+
		"\5\24\u00c5\n\24\3\24\6\24\u00c8\n\24\r\24\16\24\u00c9\5\24\u00cc\n\24"+
		"\3\24\3\24\3\25\3\25\5\25\u00d2\n\25\3\26\3\26\3\26\3\26\5\26\u00d8\n"+
		"\26\3\27\3\27\3\27\3\30\3\30\3\30\3\30\3\31\3\31\3\31\3\31\3\31\3\31\3"+
		"\31\5\31\u00e8\n\31\3\32\3\32\3\32\3\32\3\32\3\32\3\33\3\33\3\33\3\33"+
		"\3\33\3\33\3\33\3\33\3\33\3\33\3\34\3\34\3\34\3\34\3\35\3\35\3\35\3\35"+
		"\3\36\3\36\3\37\3\37\3\37\2\2 \2\4\6\b\n\f\16\20\22\24\26\30\32\34\36"+
		" \"$&(*,.\60\62\64\668:<\2\7\5\2\3\3\b\b\r\r\4\2/\60\63\63\4\2//\66\66"+
		"\5\2\21\21\34\35--\3\2\34\35\2\u0106\2?\3\2\2\2\4E\3\2\2\2\6G\3\2\2\2"+
		"\bQ\3\2\2\2\nZ\3\2\2\2\f`\3\2\2\2\16b\3\2\2\2\20d\3\2\2\2\22l\3\2\2\2"+
		"\24o\3\2\2\2\26~\3\2\2\2\30\u0089\3\2\2\2\32\u0091\3\2\2\2\34\u0093\3"+
		"\2\2\2\36\u009a\3\2\2\2 \u00a3\3\2\2\2\"\u00ac\3\2\2\2$\u00bc\3\2\2\2"+
		"&\u00be\3\2\2\2(\u00d1\3\2\2\2*\u00d7\3\2\2\2,\u00d9\3\2\2\2.\u00dc\3"+
		"\2\2\2\60\u00e0\3\2\2\2\62\u00e9\3\2\2\2\64\u00ef\3\2\2\2\66\u00f9\3\2"+
		"\2\28\u00fd\3\2\2\2:\u0101\3\2\2\2<\u0103\3\2\2\2>@\5\4\3\2?>\3\2\2\2"+
		"@A\3\2\2\2A?\3\2\2\2AB\3\2\2\2B\3\3\2\2\2CF\5\6\4\2DF\5\32\16\2EC\3\2"+
		"\2\2ED\3\2\2\2F\5\3\2\2\2GH\7\16\2\2HI\5\b\5\2IM\7\32\2\2JN\5\n\6\2KL"+
		"\7\r\2\2LN\5\30\r\2MJ\3\2\2\2MK\3\2\2\2NO\3\2\2\2OP\7\33\2\2P\7\3\2\2"+
		"\2QX\5\f\7\2RS\7\31\2\2SU\5\f\7\2TR\3\2\2\2UV\3\2\2\2VT\3\2\2\2VW\3\2"+
		"\2\2WY\3\2\2\2XT\3\2\2\2XY\3\2\2\2Y\t\3\2\2\2Z[\t\2\2\2[\13\3\2\2\2\\"+
		"a\5\16\b\2]a\5\20\t\2^a\5\22\n\2_a\5\24\13\2`\\\3\2\2\2`]\3\2\2\2`^\3"+
		"\2\2\2`_\3\2\2\2a\r\3\2\2\2bc\7\66\2\2c\17\3\2\2\2de\7\66\2\2ej\7-\2\2"+
		"fk\5\26\f\2gk\7/\2\2hk\7\60\2\2ik\7\63\2\2jf\3\2\2\2jg\3\2\2\2jh\3\2\2"+
		"\2ji\3\2\2\2k\21\3\2\2\2lm\7\66\2\2mn\5\30\r\2n\23\3\2\2\2op\7\66\2\2"+
		"pq\5\30\r\2qr\7-\2\2rs\7\27\2\2sz\t\3\2\2tu\7\31\2\2uw\t\3\2\2vt\3\2\2"+
		"\2wx\3\2\2\2xv\3\2\2\2xy\3\2\2\2y{\3\2\2\2zv\3\2\2\2z{\3\2\2\2{|\3\2\2"+
		"\2|}\7\30\2\2}\25\3\2\2\2~\177\t\4\2\2\177\u0080\7\22\2\2\u0080\u0087"+
		"\t\4\2\2\u0081\u0082\7\22\2\2\u0082\u0084\t\4\2\2\u0083\u0081\3\2\2\2"+
		"\u0084\u0085\3\2\2\2\u0085\u0083\3\2\2\2\u0085\u0086\3\2\2\2\u0086\u0088"+
		"\3\2\2\2\u0087\u0083\3\2\2\2\u0087\u0088\3\2\2\2\u0088\27\3\2\2\2\u0089"+
		"\u008b\7\25\2\2\u008a\u008c\7/\2\2\u008b\u008a\3\2\2\2\u008b\u008c\3\2"+
		"\2\2\u008c\u008d\3\2\2\2\u008d\u008e\7\26\2\2\u008e\31\3\2\2\2\u008f\u0092"+
		"\5\34\17\2\u0090\u0092\5\36\20\2\u0091\u008f\3\2\2\2\u0091\u0090\3\2\2"+
		"\2\u0092\33\3\2\2\2\u0093\u0094\7\4\2\2\u0094\u0095\7\66\2\2\u0095\u0096"+
		"\7\23\2\2\u0096\u0097\5 \21\2\u0097\u0098\7\24\2\2\u0098\u0099\5&\24\2"+
		"\u0099\35\3\2\2\2\u009a\u009b\7\4\2\2\u009b\u009c\7\66\2\2\u009c\u009d"+
		"\7\23\2\2\u009d\u009e\5 \21\2\u009e\u009f\7\24\2\2\u009f\u00a0\7\32\2"+
		"\2\u00a0\u00a1\5\n\6\2\u00a1\u00a2\5&\24\2\u00a2\37\3\2\2\2\u00a3\u00aa"+
		"\5\"\22\2\u00a4\u00a5\7\33\2\2\u00a5\u00a7\5\"\22\2\u00a6\u00a4\3\2\2"+
		"\2\u00a7\u00a8\3\2\2\2\u00a8\u00a6\3\2\2\2\u00a8\u00a9\3\2\2\2\u00a9\u00ab"+
		"\3\2\2\2\u00aa\u00a6\3\2\2\2\u00aa\u00ab\3\2\2\2\u00ab!\3\2\2\2\u00ac"+
		"\u00b3\5$\23\2\u00ad\u00ae\7\31\2\2\u00ae\u00b0\5$\23\2\u00af\u00ad\3"+
		"\2\2\2\u00b0\u00b1\3\2\2\2\u00b1\u00af\3\2\2\2\u00b1\u00b2\3\2\2\2\u00b2"+
		"\u00b4\3\2\2\2\u00b3\u00af\3\2\2\2\u00b3\u00b4\3\2\2\2\u00b4\u00b5\3\2"+
		"\2\2\u00b5\u00b6\7\32\2\2\u00b6\u00b7\5\n\6\2\u00b7#\3\2\2\2\u00b8\u00bd"+
		"\7\66\2\2\u00b9\u00ba\7\66\2\2\u00ba\u00bb\7\25\2\2\u00bb\u00bd\7\26\2"+
		"\2\u00bc\u00b8\3\2\2\2\u00bc\u00b9\3\2\2\2\u00bd%\3\2\2\2\u00be\u00c4"+
		"\7\27\2\2\u00bf\u00c1\5\4\3\2\u00c0\u00bf\3\2\2\2\u00c1\u00c2\3\2\2\2"+
		"\u00c2\u00c0\3\2\2\2\u00c2\u00c3\3\2\2\2\u00c3\u00c5\3\2\2\2\u00c4\u00c0"+
		"\3\2\2\2\u00c4\u00c5\3\2\2\2\u00c5\u00cb\3\2\2\2\u00c6\u00c8\5(\25\2\u00c7"+
		"\u00c6\3\2\2\2\u00c8\u00c9\3\2\2\2\u00c9\u00c7\3\2\2\2\u00c9\u00ca\3\2"+
		"\2\2\u00ca\u00cc\3\2\2\2\u00cb\u00c7\3\2\2\2\u00cb\u00cc\3\2\2\2\u00cc"+
		"\u00cd\3\2\2\2\u00cd\u00ce\7\30\2\2\u00ce\'\3\2\2\2\u00cf\u00d2\5*\26"+
		"\2\u00d0\u00d2\5:\36\2\u00d1\u00cf\3\2\2\2\u00d1\u00d0\3\2\2\2\u00d2)"+
		"\3\2\2\2\u00d3\u00d8\5,\27\2\u00d4\u00d8\5\60\31\2\u00d5\u00d8\5\62\32"+
		"\2\u00d6\u00d8\5\64\33\2\u00d7\u00d3\3\2\2\2\u00d7\u00d4\3\2\2\2\u00d7"+
		"\u00d5\3\2\2\2\u00d7\u00d6\3\2\2\2\u00d8+\3\2\2\2\u00d9\u00da\5.\30\2"+
		"\u00da\u00db\7\33\2\2\u00db-\3\2\2\2\u00dc\u00dd\7\66\2\2\u00dd\u00de"+
		"\t\5\2\2\u00de\u00df\5<\37\2\u00df/\3\2\2\2\u00e0\u00e1\7\7\2\2\u00e1"+
		"\u00e2\7\23\2\2\u00e2\u00e3\5<\37\2\u00e3\u00e4\7\24\2\2\u00e4\u00e7\5"+
		"&\24\2\u00e5\u00e6\7\5\2\2\u00e6\u00e8\5&\24\2\u00e7\u00e5\3\2\2\2\u00e7"+
		"\u00e8\3\2\2\2\u00e8\61\3\2\2\2\u00e9\u00ea\7\17\2\2\u00ea\u00eb\7\23"+
		"\2\2\u00eb\u00ec\5<\37\2\u00ec\u00ed\7\24\2\2\u00ed\u00ee\5&\24\2\u00ee"+
		"\63\3\2\2\2\u00ef\u00f0\7\6\2\2\u00f0\u00f1\7\23\2\2\u00f1\u00f2\5\66"+
		"\34\2\u00f2\u00f3\7\33\2\2\u00f3\u00f4\5<\37\2\u00f4\u00f5\7\33\2\2\u00f5"+
		"\u00f6\58\35\2\u00f6\u00f7\7\24\2\2\u00f7\u00f8\5&\24\2\u00f8\65\3\2\2"+
		"\2\u00f9\u00fa\7\66\2\2\u00fa\u00fb\7-\2\2\u00fb\u00fc\7/\2\2\u00fc\67"+
		"\3\2\2\2\u00fd\u00fe\7\66\2\2\u00fe\u00ff\t\6\2\2\u00ff\u0100\7/\2\2\u0100"+
		"9\3\2\2\2\u0101\u0102\7+\2\2\u0102;\3\2\2\2\u0103\u0104\7+\2\2\u0104="+
		"\3\2\2\2\33AEMVX`jxz\u0085\u0087\u008b\u0091\u00a8\u00aa\u00b1\u00b3\u00bc"+
		"\u00c2\u00c4\u00c9\u00cb\u00d1\u00d7\u00e7";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}