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
		WRITE_KW=14, OP_ARITMETICO=15, PAREN_OPEN=16, PAREN_CLOSE=17, BRACKETS_OPEN=18, 
		BRACKETS_CLOSE=19, CBRACES_OPEN=20, CBRACES_CLOSE=21, COMMA=22, COLON=23, 
		SEMICOLON=24, ATTRIB_PLUS=25, ATTRIB_MINUS=26, ATTRIB_TIMES=27, ATTRIB_DIV=28, 
		ATTRIB_REMAINDER=29, PLUS=30, MINUS=31, TIMES=32, DIV=33, REMAINDER=34, 
		ATTRIB=35, OP_EXPRESSAO=36, EQUAL=37, NEQUAL=38, GREATER=39, GREATER_OR_EQUAL=40, 
		LESS=41, LESS_OR_EQUAL=42, OR=43, AND=44, NOT=45, TERNARY=46, INTEGER=47, 
		BOOLEAN=48, TRUE=49, FALSE=50, STRING=51, COMMENT=52, IGNORE=53, IDENTIFIER=54, 
		ERROR_CHAR=55;
	public static final int
		RULE_start = 0, RULE_declaracao = 1, RULE_decVar = 2, RULE_listaSpecVars = 3, 
		RULE_tipo = 4, RULE_specVar = 5, RULE_specVarSimples = 6, RULE_specVarSimplesIni = 7, 
		RULE_specVarArranjo = 8, RULE_specVarArranjoIni = 9, RULE_expVarSimplesIni = 10, 
		RULE_memoriaReservada = 11, RULE_decSub = 12, RULE_decProc = 13, RULE_decFunc = 14, 
		RULE_listaParametros = 15, RULE_specParam = 16, RULE_param = 17, RULE_bloco = 18, 
		RULE_comando = 19, RULE_cmdSimples = 20, RULE_cmdAtrib = 21, RULE_atrib = 22, 
		RULE_cmdIf = 23, RULE_cmdWhile = 24, RULE_cmdFor = 25, RULE_atribIni = 26, 
		RULE_atribPasso = 27, RULE_cmdStop = 28, RULE_cmdSkip = 29, RULE_cmdReturn = 30, 
		RULE_cmdChamadaProc = 31, RULE_listaExpressao = 32, RULE_cmdRead = 33, 
		RULE_cmdWrite = 34, RULE_variavel = 35, RULE_expressao = 36, RULE_chamadaFuncao = 37;
	public static final String[] ruleNames = {
		"start", "declaracao", "decVar", "listaSpecVars", "tipo", "specVar", "specVarSimples", 
		"specVarSimplesIni", "specVarArranjo", "specVarArranjoIni", "expVarSimplesIni", 
		"memoriaReservada", "decSub", "decProc", "decFunc", "listaParametros", 
		"specParam", "param", "bloco", "comando", "cmdSimples", "cmdAtrib", "atrib", 
		"cmdIf", "cmdWhile", "cmdFor", "atribIni", "atribPasso", "cmdStop", "cmdSkip", 
		"cmdReturn", "cmdChamadaProc", "listaExpressao", "cmdRead", "cmdWrite", 
		"variavel", "expressao", "chamadaFuncao"
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
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GraceVisitor ) return ((GraceVisitor<? extends T>)visitor).visitStart(this);
			else return visitor.visitChildren(this);
		}
	}

	public final StartContext start() throws RecognitionException {
		StartContext _localctx = new StartContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_start);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(77); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(76);
				declaracao();
				}
				}
				setState(79); 
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
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GraceVisitor ) return ((GraceVisitor<? extends T>)visitor).visitDeclaracao(this);
			else return visitor.visitChildren(this);
		}
	}

	public final DeclaracaoContext declaracao() throws RecognitionException {
		DeclaracaoContext _localctx = new DeclaracaoContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_declaracao);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(83);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case VAR_KW:
				{
				setState(81);
				decVar();
				}
				break;
			case DEF_KW:
				{
				setState(82);
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
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GraceVisitor ) return ((GraceVisitor<? extends T>)visitor).visitDecVar(this);
			else return visitor.visitChildren(this);
		}
	}

	public final DecVarContext decVar() throws RecognitionException {
		DecVarContext _localctx = new DecVarContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_decVar);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(85);
			match(VAR_KW);
			setState(86);
			listaSpecVars();
			setState(87);
			match(COLON);
			setState(91);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,2,_ctx) ) {
			case 1:
				{
				setState(88);
				tipo();
				}
				break;
			case 2:
				{
				setState(89);
				match(STRING_KW);
				setState(90);
				memoriaReservada();
				}
				break;
			}
			setState(93);
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
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GraceVisitor ) return ((GraceVisitor<? extends T>)visitor).visitListaSpecVars(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ListaSpecVarsContext listaSpecVars() throws RecognitionException {
		ListaSpecVarsContext _localctx = new ListaSpecVarsContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_listaSpecVars);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(95);
			specVar();
			setState(102);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==COMMA) {
				{
				setState(98); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					{
					setState(96);
					match(COMMA);
					setState(97);
					specVar();
					}
					}
					setState(100); 
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
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GraceVisitor ) return ((GraceVisitor<? extends T>)visitor).visitTipo(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TipoContext tipo() throws RecognitionException {
		TipoContext _localctx = new TipoContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_tipo);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(104);
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
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GraceVisitor ) return ((GraceVisitor<? extends T>)visitor).visitSpecVar(this);
			else return visitor.visitChildren(this);
		}
	}

	public final SpecVarContext specVar() throws RecognitionException {
		SpecVarContext _localctx = new SpecVarContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_specVar);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(110);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,5,_ctx) ) {
			case 1:
				{
				setState(106);
				specVarSimples();
				}
				break;
			case 2:
				{
				setState(107);
				specVarSimplesIni();
				}
				break;
			case 3:
				{
				setState(108);
				specVarArranjo();
				}
				break;
			case 4:
				{
				setState(109);
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
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GraceVisitor ) return ((GraceVisitor<? extends T>)visitor).visitSpecVarSimples(this);
			else return visitor.visitChildren(this);
		}
	}

	public final SpecVarSimplesContext specVarSimples() throws RecognitionException {
		SpecVarSimplesContext _localctx = new SpecVarSimplesContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_specVarSimples);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(112);
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
		public ExpVarSimplesIniContext expVarSimplesIni() {
			return getRuleContext(ExpVarSimplesIniContext.class,0);
		}
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
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GraceVisitor ) return ((GraceVisitor<? extends T>)visitor).visitSpecVarSimplesIni(this);
			else return visitor.visitChildren(this);
		}
	}

	public final SpecVarSimplesIniContext specVarSimplesIni() throws RecognitionException {
		SpecVarSimplesIniContext _localctx = new SpecVarSimplesIniContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_specVarSimplesIni);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(114);
			match(IDENTIFIER);
			setState(115);
			match(ATTRIB);
			setState(116);
			expVarSimplesIni();
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
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GraceVisitor ) return ((GraceVisitor<? extends T>)visitor).visitSpecVarArranjo(this);
			else return visitor.visitChildren(this);
		}
	}

	public final SpecVarArranjoContext specVarArranjo() throws RecognitionException {
		SpecVarArranjoContext _localctx = new SpecVarArranjoContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_specVarArranjo);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(118);
			match(IDENTIFIER);
			setState(119);
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
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GraceVisitor ) return ((GraceVisitor<? extends T>)visitor).visitSpecVarArranjoIni(this);
			else return visitor.visitChildren(this);
		}
	}

	public final SpecVarArranjoIniContext specVarArranjoIni() throws RecognitionException {
		SpecVarArranjoIniContext _localctx = new SpecVarArranjoIniContext(_ctx, getState());
		enterRule(_localctx, 18, RULE_specVarArranjoIni);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(121);
			match(IDENTIFIER);
			setState(122);
			memoriaReservada();
			setState(123);
			match(ATTRIB);
			setState(124);
			match(CBRACES_OPEN);
			setState(125);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << INTEGER) | (1L << BOOLEAN) | (1L << STRING))) != 0)) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			setState(132);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==COMMA) {
				{
				setState(128); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					{
					setState(126);
					match(COMMA);
					setState(127);
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
					setState(130); 
					_errHandler.sync(this);
					_la = _input.LA(1);
				} while ( _la==COMMA );
				}
			}

			setState(134);
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

	public static class ExpVarSimplesIniContext extends ParserRuleContext {
		public TerminalNode STRING() { return getToken(GraceParser.STRING, 0); }
		public TerminalNode INTEGER() { return getToken(GraceParser.INTEGER, 0); }
		public TerminalNode BOOLEAN() { return getToken(GraceParser.BOOLEAN, 0); }
		public VariavelContext variavel() {
			return getRuleContext(VariavelContext.class,0);
		}
		public TerminalNode OP_ARITMETICO() { return getToken(GraceParser.OP_ARITMETICO, 0); }
		public List<ExpVarSimplesIniContext> expVarSimplesIni() {
			return getRuleContexts(ExpVarSimplesIniContext.class);
		}
		public ExpVarSimplesIniContext expVarSimplesIni(int i) {
			return getRuleContext(ExpVarSimplesIniContext.class,i);
		}
		public TerminalNode PAREN_OPEN() { return getToken(GraceParser.PAREN_OPEN, 0); }
		public TerminalNode PAREN_CLOSE() { return getToken(GraceParser.PAREN_CLOSE, 0); }
		public ExpVarSimplesIniContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expVarSimplesIni; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GraceListener ) ((GraceListener)listener).enterExpVarSimplesIni(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GraceListener ) ((GraceListener)listener).exitExpVarSimplesIni(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GraceVisitor ) return ((GraceVisitor<? extends T>)visitor).visitExpVarSimplesIni(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ExpVarSimplesIniContext expVarSimplesIni() throws RecognitionException {
		ExpVarSimplesIniContext _localctx = new ExpVarSimplesIniContext(_ctx, getState());
		enterRule(_localctx, 20, RULE_expVarSimplesIni);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(144);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case STRING:
				{
				setState(136);
				match(STRING);
				}
				break;
			case INTEGER:
				{
				setState(137);
				match(INTEGER);
				}
				break;
			case BOOLEAN:
				{
				setState(138);
				match(BOOLEAN);
				}
				break;
			case IDENTIFIER:
				{
				setState(139);
				variavel();
				}
				break;
			case PAREN_OPEN:
				{
				{
				setState(140);
				match(PAREN_OPEN);
				setState(141);
				expVarSimplesIni();
				setState(142);
				match(PAREN_CLOSE);
				}
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			setState(148);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==OP_ARITMETICO) {
				{
				setState(146);
				match(OP_ARITMETICO);
				setState(147);
				expVarSimplesIni();
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
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GraceVisitor ) return ((GraceVisitor<? extends T>)visitor).visitMemoriaReservada(this);
			else return visitor.visitChildren(this);
		}
	}

	public final MemoriaReservadaContext memoriaReservada() throws RecognitionException {
		MemoriaReservadaContext _localctx = new MemoriaReservadaContext(_ctx, getState());
		enterRule(_localctx, 22, RULE_memoriaReservada);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(150);
			match(BRACKETS_OPEN);
			setState(152);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==INTEGER) {
				{
				setState(151);
				match(INTEGER);
				}
			}

			setState(154);
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
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GraceVisitor ) return ((GraceVisitor<? extends T>)visitor).visitDecSub(this);
			else return visitor.visitChildren(this);
		}
	}

	public final DecSubContext decSub() throws RecognitionException {
		DecSubContext _localctx = new DecSubContext(_ctx, getState());
		enterRule(_localctx, 24, RULE_decSub);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(158);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,11,_ctx) ) {
			case 1:
				{
				setState(156);
				decProc();
				}
				break;
			case 2:
				{
				setState(157);
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
		public TerminalNode PAREN_CLOSE() { return getToken(GraceParser.PAREN_CLOSE, 0); }
		public BlocoContext bloco() {
			return getRuleContext(BlocoContext.class,0);
		}
		public ListaParametrosContext listaParametros() {
			return getRuleContext(ListaParametrosContext.class,0);
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
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GraceVisitor ) return ((GraceVisitor<? extends T>)visitor).visitDecProc(this);
			else return visitor.visitChildren(this);
		}
	}

	public final DecProcContext decProc() throws RecognitionException {
		DecProcContext _localctx = new DecProcContext(_ctx, getState());
		enterRule(_localctx, 26, RULE_decProc);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(160);
			match(DEF_KW);
			setState(161);
			match(IDENTIFIER);
			setState(162);
			match(PAREN_OPEN);
			setState(164);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==IDENTIFIER) {
				{
				setState(163);
				listaParametros();
				}
			}

			setState(166);
			match(PAREN_CLOSE);
			setState(167);
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
		public TerminalNode PAREN_CLOSE() { return getToken(GraceParser.PAREN_CLOSE, 0); }
		public TerminalNode COLON() { return getToken(GraceParser.COLON, 0); }
		public TipoContext tipo() {
			return getRuleContext(TipoContext.class,0);
		}
		public BlocoContext bloco() {
			return getRuleContext(BlocoContext.class,0);
		}
		public ListaParametrosContext listaParametros() {
			return getRuleContext(ListaParametrosContext.class,0);
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
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GraceVisitor ) return ((GraceVisitor<? extends T>)visitor).visitDecFunc(this);
			else return visitor.visitChildren(this);
		}
	}

	public final DecFuncContext decFunc() throws RecognitionException {
		DecFuncContext _localctx = new DecFuncContext(_ctx, getState());
		enterRule(_localctx, 28, RULE_decFunc);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(169);
			match(DEF_KW);
			setState(170);
			match(IDENTIFIER);
			setState(171);
			match(PAREN_OPEN);
			setState(173);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==IDENTIFIER) {
				{
				setState(172);
				listaParametros();
				}
			}

			setState(175);
			match(PAREN_CLOSE);
			setState(176);
			match(COLON);
			setState(177);
			tipo();
			setState(178);
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
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GraceVisitor ) return ((GraceVisitor<? extends T>)visitor).visitListaParametros(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ListaParametrosContext listaParametros() throws RecognitionException {
		ListaParametrosContext _localctx = new ListaParametrosContext(_ctx, getState());
		enterRule(_localctx, 30, RULE_listaParametros);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(180);
			specParam();
			setState(187);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==SEMICOLON) {
				{
				setState(183); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					{
					setState(181);
					match(SEMICOLON);
					setState(182);
					specParam();
					}
					}
					setState(185); 
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
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GraceVisitor ) return ((GraceVisitor<? extends T>)visitor).visitSpecParam(this);
			else return visitor.visitChildren(this);
		}
	}

	public final SpecParamContext specParam() throws RecognitionException {
		SpecParamContext _localctx = new SpecParamContext(_ctx, getState());
		enterRule(_localctx, 32, RULE_specParam);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(189);
			param();
			setState(196);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==COMMA) {
				{
				setState(192); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					{
					setState(190);
					match(COMMA);
					setState(191);
					param();
					}
					}
					setState(194); 
					_errHandler.sync(this);
					_la = _input.LA(1);
				} while ( _la==COMMA );
				}
			}

			setState(198);
			match(COLON);
			setState(199);
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
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GraceVisitor ) return ((GraceVisitor<? extends T>)visitor).visitParam(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ParamContext param() throws RecognitionException {
		ParamContext _localctx = new ParamContext(_ctx, getState());
		enterRule(_localctx, 34, RULE_param);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(205);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,18,_ctx) ) {
			case 1:
				{
				setState(201);
				match(IDENTIFIER);
				}
				break;
			case 2:
				{
				setState(202);
				match(IDENTIFIER);
				setState(203);
				match(BRACKETS_OPEN);
				setState(204);
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
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GraceVisitor ) return ((GraceVisitor<? extends T>)visitor).visitBloco(this);
			else return visitor.visitChildren(this);
		}
	}

	public final BlocoContext bloco() throws RecognitionException {
		BlocoContext _localctx = new BlocoContext(_ctx, getState());
		enterRule(_localctx, 36, RULE_bloco);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(207);
			match(CBRACES_OPEN);
			setState(213);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==DEF_KW || _la==VAR_KW) {
				{
				setState(209); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					{
					setState(208);
					declaracao();
					}
					}
					setState(211); 
					_errHandler.sync(this);
					_la = _input.LA(1);
				} while ( _la==DEF_KW || _la==VAR_KW );
				}
			}

			setState(220);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << FOR_KW) | (1L << IF_KW) | (1L << READ_KW) | (1L << RETURN_KW) | (1L << SKIP_KW) | (1L << STOP_KW) | (1L << WHILE_KW) | (1L << WRITE_KW) | (1L << IDENTIFIER))) != 0)) {
				{
				setState(216); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					{
					setState(215);
					comando();
					}
					}
					setState(218); 
					_errHandler.sync(this);
					_la = _input.LA(1);
				} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << FOR_KW) | (1L << IF_KW) | (1L << READ_KW) | (1L << RETURN_KW) | (1L << SKIP_KW) | (1L << STOP_KW) | (1L << WHILE_KW) | (1L << WRITE_KW) | (1L << IDENTIFIER))) != 0) );
				}
			}

			setState(222);
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
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GraceVisitor ) return ((GraceVisitor<? extends T>)visitor).visitComando(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ComandoContext comando() throws RecognitionException {
		ComandoContext _localctx = new ComandoContext(_ctx, getState());
		enterRule(_localctx, 38, RULE_comando);
		try {
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(224);
			cmdSimples();
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
		public CmdStopContext cmdStop() {
			return getRuleContext(CmdStopContext.class,0);
		}
		public CmdSkipContext cmdSkip() {
			return getRuleContext(CmdSkipContext.class,0);
		}
		public CmdReturnContext cmdReturn() {
			return getRuleContext(CmdReturnContext.class,0);
		}
		public CmdChamadaProcContext cmdChamadaProc() {
			return getRuleContext(CmdChamadaProcContext.class,0);
		}
		public CmdReadContext cmdRead() {
			return getRuleContext(CmdReadContext.class,0);
		}
		public CmdWriteContext cmdWrite() {
			return getRuleContext(CmdWriteContext.class,0);
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
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GraceVisitor ) return ((GraceVisitor<? extends T>)visitor).visitCmdSimples(this);
			else return visitor.visitChildren(this);
		}
	}

	public final CmdSimplesContext cmdSimples() throws RecognitionException {
		CmdSimplesContext _localctx = new CmdSimplesContext(_ctx, getState());
		enterRule(_localctx, 40, RULE_cmdSimples);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(236);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,23,_ctx) ) {
			case 1:
				{
				setState(226);
				cmdAtrib();
				}
				break;
			case 2:
				{
				setState(227);
				cmdIf();
				}
				break;
			case 3:
				{
				setState(228);
				cmdWhile();
				}
				break;
			case 4:
				{
				setState(229);
				cmdFor();
				}
				break;
			case 5:
				{
				setState(230);
				cmdStop();
				}
				break;
			case 6:
				{
				setState(231);
				cmdSkip();
				}
				break;
			case 7:
				{
				setState(232);
				cmdReturn();
				}
				break;
			case 8:
				{
				setState(233);
				cmdChamadaProc();
				}
				break;
			case 9:
				{
				setState(234);
				cmdRead();
				}
				break;
			case 10:
				{
				setState(235);
				cmdWrite();
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
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GraceVisitor ) return ((GraceVisitor<? extends T>)visitor).visitCmdAtrib(this);
			else return visitor.visitChildren(this);
		}
	}

	public final CmdAtribContext cmdAtrib() throws RecognitionException {
		CmdAtribContext _localctx = new CmdAtribContext(_ctx, getState());
		enterRule(_localctx, 42, RULE_cmdAtrib);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(238);
			atrib();
			setState(239);
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
		public VariavelContext variavel() {
			return getRuleContext(VariavelContext.class,0);
		}
		public ExpressaoContext expressao() {
			return getRuleContext(ExpressaoContext.class,0);
		}
		public TerminalNode ATTRIB() { return getToken(GraceParser.ATTRIB, 0); }
		public TerminalNode ATTRIB_PLUS() { return getToken(GraceParser.ATTRIB_PLUS, 0); }
		public TerminalNode ATTRIB_MINUS() { return getToken(GraceParser.ATTRIB_MINUS, 0); }
		public TerminalNode ATTRIB_TIMES() { return getToken(GraceParser.ATTRIB_TIMES, 0); }
		public TerminalNode ATTRIB_DIV() { return getToken(GraceParser.ATTRIB_DIV, 0); }
		public TerminalNode ATTRIB_REMAINDER() { return getToken(GraceParser.ATTRIB_REMAINDER, 0); }
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
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GraceVisitor ) return ((GraceVisitor<? extends T>)visitor).visitAtrib(this);
			else return visitor.visitChildren(this);
		}
	}

	public final AtribContext atrib() throws RecognitionException {
		AtribContext _localctx = new AtribContext(_ctx, getState());
		enterRule(_localctx, 44, RULE_atrib);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(241);
			variavel();
			setState(242);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << ATTRIB_PLUS) | (1L << ATTRIB_MINUS) | (1L << ATTRIB_TIMES) | (1L << ATTRIB_DIV) | (1L << ATTRIB_REMAINDER) | (1L << ATTRIB))) != 0)) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			setState(243);
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
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GraceVisitor ) return ((GraceVisitor<? extends T>)visitor).visitCmdIf(this);
			else return visitor.visitChildren(this);
		}
	}

	public final CmdIfContext cmdIf() throws RecognitionException {
		CmdIfContext _localctx = new CmdIfContext(_ctx, getState());
		enterRule(_localctx, 46, RULE_cmdIf);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(245);
			match(IF_KW);
			setState(246);
			match(PAREN_OPEN);
			setState(247);
			expressao();
			setState(248);
			match(PAREN_CLOSE);
			setState(249);
			bloco();
			setState(252);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==ELSE_KW) {
				{
				setState(250);
				match(ELSE_KW);
				setState(251);
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
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GraceVisitor ) return ((GraceVisitor<? extends T>)visitor).visitCmdWhile(this);
			else return visitor.visitChildren(this);
		}
	}

	public final CmdWhileContext cmdWhile() throws RecognitionException {
		CmdWhileContext _localctx = new CmdWhileContext(_ctx, getState());
		enterRule(_localctx, 48, RULE_cmdWhile);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(254);
			match(WHILE_KW);
			setState(255);
			match(PAREN_OPEN);
			setState(256);
			expressao();
			setState(257);
			match(PAREN_CLOSE);
			setState(258);
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
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GraceVisitor ) return ((GraceVisitor<? extends T>)visitor).visitCmdFor(this);
			else return visitor.visitChildren(this);
		}
	}

	public final CmdForContext cmdFor() throws RecognitionException {
		CmdForContext _localctx = new CmdForContext(_ctx, getState());
		enterRule(_localctx, 50, RULE_cmdFor);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(260);
			match(FOR_KW);
			setState(261);
			match(PAREN_OPEN);
			setState(262);
			atribIni();
			setState(263);
			match(SEMICOLON);
			setState(264);
			expressao();
			setState(265);
			match(SEMICOLON);
			setState(266);
			atribPasso();
			setState(267);
			match(PAREN_CLOSE);
			setState(268);
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
		public AtribContext atrib() {
			return getRuleContext(AtribContext.class,0);
		}
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
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GraceVisitor ) return ((GraceVisitor<? extends T>)visitor).visitAtribIni(this);
			else return visitor.visitChildren(this);
		}
	}

	public final AtribIniContext atribIni() throws RecognitionException {
		AtribIniContext _localctx = new AtribIniContext(_ctx, getState());
		enterRule(_localctx, 52, RULE_atribIni);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(270);
			atrib();
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
		public AtribContext atrib() {
			return getRuleContext(AtribContext.class,0);
		}
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
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GraceVisitor ) return ((GraceVisitor<? extends T>)visitor).visitAtribPasso(this);
			else return visitor.visitChildren(this);
		}
	}

	public final AtribPassoContext atribPasso() throws RecognitionException {
		AtribPassoContext _localctx = new AtribPassoContext(_ctx, getState());
		enterRule(_localctx, 54, RULE_atribPasso);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(272);
			atrib();
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

	public static class CmdStopContext extends ParserRuleContext {
		public TerminalNode STOP_KW() { return getToken(GraceParser.STOP_KW, 0); }
		public TerminalNode SEMICOLON() { return getToken(GraceParser.SEMICOLON, 0); }
		public CmdStopContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_cmdStop; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GraceListener ) ((GraceListener)listener).enterCmdStop(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GraceListener ) ((GraceListener)listener).exitCmdStop(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GraceVisitor ) return ((GraceVisitor<? extends T>)visitor).visitCmdStop(this);
			else return visitor.visitChildren(this);
		}
	}

	public final CmdStopContext cmdStop() throws RecognitionException {
		CmdStopContext _localctx = new CmdStopContext(_ctx, getState());
		enterRule(_localctx, 56, RULE_cmdStop);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(274);
			match(STOP_KW);
			setState(275);
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

	public static class CmdSkipContext extends ParserRuleContext {
		public TerminalNode SKIP_KW() { return getToken(GraceParser.SKIP_KW, 0); }
		public TerminalNode SEMICOLON() { return getToken(GraceParser.SEMICOLON, 0); }
		public CmdSkipContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_cmdSkip; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GraceListener ) ((GraceListener)listener).enterCmdSkip(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GraceListener ) ((GraceListener)listener).exitCmdSkip(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GraceVisitor ) return ((GraceVisitor<? extends T>)visitor).visitCmdSkip(this);
			else return visitor.visitChildren(this);
		}
	}

	public final CmdSkipContext cmdSkip() throws RecognitionException {
		CmdSkipContext _localctx = new CmdSkipContext(_ctx, getState());
		enterRule(_localctx, 58, RULE_cmdSkip);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(277);
			match(SKIP_KW);
			setState(278);
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

	public static class CmdReturnContext extends ParserRuleContext {
		public TerminalNode RETURN_KW() { return getToken(GraceParser.RETURN_KW, 0); }
		public TerminalNode SEMICOLON() { return getToken(GraceParser.SEMICOLON, 0); }
		public ExpressaoContext expressao() {
			return getRuleContext(ExpressaoContext.class,0);
		}
		public CmdReturnContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_cmdReturn; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GraceListener ) ((GraceListener)listener).enterCmdReturn(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GraceListener ) ((GraceListener)listener).exitCmdReturn(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GraceVisitor ) return ((GraceVisitor<? extends T>)visitor).visitCmdReturn(this);
			else return visitor.visitChildren(this);
		}
	}

	public final CmdReturnContext cmdReturn() throws RecognitionException {
		CmdReturnContext _localctx = new CmdReturnContext(_ctx, getState());
		enterRule(_localctx, 60, RULE_cmdReturn);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(280);
			match(RETURN_KW);
			setState(282);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << PAREN_OPEN) | (1L << INTEGER) | (1L << BOOLEAN) | (1L << STRING) | (1L << IDENTIFIER))) != 0)) {
				{
				setState(281);
				expressao();
				}
			}

			setState(284);
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

	public static class CmdChamadaProcContext extends ParserRuleContext {
		public TerminalNode IDENTIFIER() { return getToken(GraceParser.IDENTIFIER, 0); }
		public TerminalNode PAREN_OPEN() { return getToken(GraceParser.PAREN_OPEN, 0); }
		public TerminalNode PAREN_CLOSE() { return getToken(GraceParser.PAREN_CLOSE, 0); }
		public TerminalNode SEMICOLON() { return getToken(GraceParser.SEMICOLON, 0); }
		public ListaExpressaoContext listaExpressao() {
			return getRuleContext(ListaExpressaoContext.class,0);
		}
		public CmdChamadaProcContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_cmdChamadaProc; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GraceListener ) ((GraceListener)listener).enterCmdChamadaProc(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GraceListener ) ((GraceListener)listener).exitCmdChamadaProc(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GraceVisitor ) return ((GraceVisitor<? extends T>)visitor).visitCmdChamadaProc(this);
			else return visitor.visitChildren(this);
		}
	}

	public final CmdChamadaProcContext cmdChamadaProc() throws RecognitionException {
		CmdChamadaProcContext _localctx = new CmdChamadaProcContext(_ctx, getState());
		enterRule(_localctx, 62, RULE_cmdChamadaProc);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(286);
			match(IDENTIFIER);
			setState(287);
			match(PAREN_OPEN);
			setState(289);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << PAREN_OPEN) | (1L << INTEGER) | (1L << BOOLEAN) | (1L << STRING) | (1L << IDENTIFIER))) != 0)) {
				{
				setState(288);
				listaExpressao();
				}
			}

			setState(291);
			match(PAREN_CLOSE);
			setState(292);
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

	public static class ListaExpressaoContext extends ParserRuleContext {
		public List<ExpressaoContext> expressao() {
			return getRuleContexts(ExpressaoContext.class);
		}
		public ExpressaoContext expressao(int i) {
			return getRuleContext(ExpressaoContext.class,i);
		}
		public List<TerminalNode> COMMA() { return getTokens(GraceParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(GraceParser.COMMA, i);
		}
		public ListaExpressaoContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_listaExpressao; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GraceListener ) ((GraceListener)listener).enterListaExpressao(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GraceListener ) ((GraceListener)listener).exitListaExpressao(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GraceVisitor ) return ((GraceVisitor<? extends T>)visitor).visitListaExpressao(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ListaExpressaoContext listaExpressao() throws RecognitionException {
		ListaExpressaoContext _localctx = new ListaExpressaoContext(_ctx, getState());
		enterRule(_localctx, 64, RULE_listaExpressao);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(294);
			expressao();
			setState(301);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==COMMA) {
				{
				setState(297); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					{
					setState(295);
					match(COMMA);
					setState(296);
					expressao();
					}
					}
					setState(299); 
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

	public static class CmdReadContext extends ParserRuleContext {
		public TerminalNode READ_KW() { return getToken(GraceParser.READ_KW, 0); }
		public VariavelContext variavel() {
			return getRuleContext(VariavelContext.class,0);
		}
		public TerminalNode SEMICOLON() { return getToken(GraceParser.SEMICOLON, 0); }
		public CmdReadContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_cmdRead; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GraceListener ) ((GraceListener)listener).enterCmdRead(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GraceListener ) ((GraceListener)listener).exitCmdRead(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GraceVisitor ) return ((GraceVisitor<? extends T>)visitor).visitCmdRead(this);
			else return visitor.visitChildren(this);
		}
	}

	public final CmdReadContext cmdRead() throws RecognitionException {
		CmdReadContext _localctx = new CmdReadContext(_ctx, getState());
		enterRule(_localctx, 66, RULE_cmdRead);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(303);
			match(READ_KW);
			setState(304);
			variavel();
			setState(305);
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

	public static class CmdWriteContext extends ParserRuleContext {
		public TerminalNode WRITE_KW() { return getToken(GraceParser.WRITE_KW, 0); }
		public List<ExpressaoContext> expressao() {
			return getRuleContexts(ExpressaoContext.class);
		}
		public ExpressaoContext expressao(int i) {
			return getRuleContext(ExpressaoContext.class,i);
		}
		public TerminalNode SEMICOLON() { return getToken(GraceParser.SEMICOLON, 0); }
		public List<TerminalNode> COMMA() { return getTokens(GraceParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(GraceParser.COMMA, i);
		}
		public CmdWriteContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_cmdWrite; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GraceListener ) ((GraceListener)listener).enterCmdWrite(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GraceListener ) ((GraceListener)listener).exitCmdWrite(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GraceVisitor ) return ((GraceVisitor<? extends T>)visitor).visitCmdWrite(this);
			else return visitor.visitChildren(this);
		}
	}

	public final CmdWriteContext cmdWrite() throws RecognitionException {
		CmdWriteContext _localctx = new CmdWriteContext(_ctx, getState());
		enterRule(_localctx, 68, RULE_cmdWrite);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(307);
			match(WRITE_KW);
			setState(308);
			expressao();
			setState(315);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==COMMA) {
				{
				setState(311); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					{
					setState(309);
					match(COMMA);
					setState(310);
					expressao();
					}
					}
					setState(313); 
					_errHandler.sync(this);
					_la = _input.LA(1);
				} while ( _la==COMMA );
				}
			}

			setState(317);
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

	public static class VariavelContext extends ParserRuleContext {
		public TerminalNode IDENTIFIER() { return getToken(GraceParser.IDENTIFIER, 0); }
		public TerminalNode BRACKETS_OPEN() { return getToken(GraceParser.BRACKETS_OPEN, 0); }
		public ExpressaoContext expressao() {
			return getRuleContext(ExpressaoContext.class,0);
		}
		public TerminalNode BRACKETS_CLOSE() { return getToken(GraceParser.BRACKETS_CLOSE, 0); }
		public VariavelContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_variavel; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GraceListener ) ((GraceListener)listener).enterVariavel(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GraceListener ) ((GraceListener)listener).exitVariavel(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GraceVisitor ) return ((GraceVisitor<? extends T>)visitor).visitVariavel(this);
			else return visitor.visitChildren(this);
		}
	}

	public final VariavelContext variavel() throws RecognitionException {
		VariavelContext _localctx = new VariavelContext(_ctx, getState());
		enterRule(_localctx, 70, RULE_variavel);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(325);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,31,_ctx) ) {
			case 1:
				{
				setState(319);
				match(IDENTIFIER);
				}
				break;
			case 2:
				{
				{
				setState(320);
				match(IDENTIFIER);
				setState(321);
				match(BRACKETS_OPEN);
				setState(322);
				expressao();
				setState(323);
				match(BRACKETS_CLOSE);
				}
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

	public static class ExpressaoContext extends ParserRuleContext {
		public TerminalNode STRING() { return getToken(GraceParser.STRING, 0); }
		public TerminalNode INTEGER() { return getToken(GraceParser.INTEGER, 0); }
		public TerminalNode BOOLEAN() { return getToken(GraceParser.BOOLEAN, 0); }
		public VariavelContext variavel() {
			return getRuleContext(VariavelContext.class,0);
		}
		public ChamadaFuncaoContext chamadaFuncao() {
			return getRuleContext(ChamadaFuncaoContext.class,0);
		}
		public List<ExpressaoContext> expressao() {
			return getRuleContexts(ExpressaoContext.class);
		}
		public ExpressaoContext expressao(int i) {
			return getRuleContext(ExpressaoContext.class,i);
		}
		public TerminalNode PAREN_OPEN() { return getToken(GraceParser.PAREN_OPEN, 0); }
		public TerminalNode PAREN_CLOSE() { return getToken(GraceParser.PAREN_CLOSE, 0); }
		public TerminalNode OP_EXPRESSAO() { return getToken(GraceParser.OP_EXPRESSAO, 0); }
		public TerminalNode OP_ARITMETICO() { return getToken(GraceParser.OP_ARITMETICO, 0); }
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
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GraceVisitor ) return ((GraceVisitor<? extends T>)visitor).visitExpressao(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ExpressaoContext expressao() throws RecognitionException {
		ExpressaoContext _localctx = new ExpressaoContext(_ctx, getState());
		enterRule(_localctx, 72, RULE_expressao);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(336);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,32,_ctx) ) {
			case 1:
				{
				setState(327);
				match(STRING);
				}
				break;
			case 2:
				{
				setState(328);
				match(INTEGER);
				}
				break;
			case 3:
				{
				setState(329);
				match(BOOLEAN);
				}
				break;
			case 4:
				{
				setState(330);
				variavel();
				}
				break;
			case 5:
				{
				setState(331);
				chamadaFuncao();
				}
				break;
			case 6:
				{
				{
				setState(332);
				match(PAREN_OPEN);
				setState(333);
				expressao();
				setState(334);
				match(PAREN_CLOSE);
				}
				}
				break;
			}
			setState(340);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==OP_ARITMETICO || _la==OP_EXPRESSAO) {
				{
				setState(338);
				_la = _input.LA(1);
				if ( !(_la==OP_ARITMETICO || _la==OP_EXPRESSAO) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(339);
				expressao();
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

	public static class ChamadaFuncaoContext extends ParserRuleContext {
		public TerminalNode IDENTIFIER() { return getToken(GraceParser.IDENTIFIER, 0); }
		public TerminalNode PAREN_OPEN() { return getToken(GraceParser.PAREN_OPEN, 0); }
		public TerminalNode PAREN_CLOSE() { return getToken(GraceParser.PAREN_CLOSE, 0); }
		public ListaExpressaoContext listaExpressao() {
			return getRuleContext(ListaExpressaoContext.class,0);
		}
		public ChamadaFuncaoContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_chamadaFuncao; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GraceListener ) ((GraceListener)listener).enterChamadaFuncao(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GraceListener ) ((GraceListener)listener).exitChamadaFuncao(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GraceVisitor ) return ((GraceVisitor<? extends T>)visitor).visitChamadaFuncao(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ChamadaFuncaoContext chamadaFuncao() throws RecognitionException {
		ChamadaFuncaoContext _localctx = new ChamadaFuncaoContext(_ctx, getState());
		enterRule(_localctx, 74, RULE_chamadaFuncao);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(342);
			match(IDENTIFIER);
			setState(343);
			match(PAREN_OPEN);
			setState(345);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << PAREN_OPEN) | (1L << INTEGER) | (1L << BOOLEAN) | (1L << STRING) | (1L << IDENTIFIER))) != 0)) {
				{
				setState(344);
				listaExpressao();
				}
			}

			setState(347);
			match(PAREN_CLOSE);
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
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\39\u0160\4\2\t\2\4"+
		"\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13\t"+
		"\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31\t\31"+
		"\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37\t\37\4 \t \4!"+
		"\t!\4\"\t\"\4#\t#\4$\t$\4%\t%\4&\t&\4\'\t\'\3\2\6\2P\n\2\r\2\16\2Q\3\3"+
		"\3\3\5\3V\n\3\3\4\3\4\3\4\3\4\3\4\3\4\5\4^\n\4\3\4\3\4\3\5\3\5\3\5\6\5"+
		"e\n\5\r\5\16\5f\5\5i\n\5\3\6\3\6\3\7\3\7\3\7\3\7\5\7q\n\7\3\b\3\b\3\t"+
		"\3\t\3\t\3\t\3\n\3\n\3\n\3\13\3\13\3\13\3\13\3\13\3\13\3\13\6\13\u0083"+
		"\n\13\r\13\16\13\u0084\5\13\u0087\n\13\3\13\3\13\3\f\3\f\3\f\3\f\3\f\3"+
		"\f\3\f\3\f\5\f\u0093\n\f\3\f\3\f\5\f\u0097\n\f\3\r\3\r\5\r\u009b\n\r\3"+
		"\r\3\r\3\16\3\16\5\16\u00a1\n\16\3\17\3\17\3\17\3\17\5\17\u00a7\n\17\3"+
		"\17\3\17\3\17\3\20\3\20\3\20\3\20\5\20\u00b0\n\20\3\20\3\20\3\20\3\20"+
		"\3\20\3\21\3\21\3\21\6\21\u00ba\n\21\r\21\16\21\u00bb\5\21\u00be\n\21"+
		"\3\22\3\22\3\22\6\22\u00c3\n\22\r\22\16\22\u00c4\5\22\u00c7\n\22\3\22"+
		"\3\22\3\22\3\23\3\23\3\23\3\23\5\23\u00d0\n\23\3\24\3\24\6\24\u00d4\n"+
		"\24\r\24\16\24\u00d5\5\24\u00d8\n\24\3\24\6\24\u00db\n\24\r\24\16\24\u00dc"+
		"\5\24\u00df\n\24\3\24\3\24\3\25\3\25\3\26\3\26\3\26\3\26\3\26\3\26\3\26"+
		"\3\26\3\26\3\26\5\26\u00ef\n\26\3\27\3\27\3\27\3\30\3\30\3\30\3\30\3\31"+
		"\3\31\3\31\3\31\3\31\3\31\3\31\5\31\u00ff\n\31\3\32\3\32\3\32\3\32\3\32"+
		"\3\32\3\33\3\33\3\33\3\33\3\33\3\33\3\33\3\33\3\33\3\33\3\34\3\34\3\35"+
		"\3\35\3\36\3\36\3\36\3\37\3\37\3\37\3 \3 \5 \u011d\n \3 \3 \3!\3!\3!\5"+
		"!\u0124\n!\3!\3!\3!\3\"\3\"\3\"\6\"\u012c\n\"\r\"\16\"\u012d\5\"\u0130"+
		"\n\"\3#\3#\3#\3#\3$\3$\3$\3$\6$\u013a\n$\r$\16$\u013b\5$\u013e\n$\3$\3"+
		"$\3%\3%\3%\3%\3%\3%\5%\u0148\n%\3&\3&\3&\3&\3&\3&\3&\3&\3&\5&\u0153\n"+
		"&\3&\3&\5&\u0157\n&\3\'\3\'\3\'\5\'\u015c\n\'\3\'\3\'\3\'\2\2(\2\4\6\b"+
		"\n\f\16\20\22\24\26\30\32\34\36 \"$&(*,.\60\62\64\668:<>@BDFHJL\2\6\5"+
		"\2\3\3\b\b\r\r\4\2\61\62\65\65\4\2\33\37%%\4\2\21\21&&\2\u016d\2O\3\2"+
		"\2\2\4U\3\2\2\2\6W\3\2\2\2\ba\3\2\2\2\nj\3\2\2\2\fp\3\2\2\2\16r\3\2\2"+
		"\2\20t\3\2\2\2\22x\3\2\2\2\24{\3\2\2\2\26\u0092\3\2\2\2\30\u0098\3\2\2"+
		"\2\32\u00a0\3\2\2\2\34\u00a2\3\2\2\2\36\u00ab\3\2\2\2 \u00b6\3\2\2\2\""+
		"\u00bf\3\2\2\2$\u00cf\3\2\2\2&\u00d1\3\2\2\2(\u00e2\3\2\2\2*\u00ee\3\2"+
		"\2\2,\u00f0\3\2\2\2.\u00f3\3\2\2\2\60\u00f7\3\2\2\2\62\u0100\3\2\2\2\64"+
		"\u0106\3\2\2\2\66\u0110\3\2\2\28\u0112\3\2\2\2:\u0114\3\2\2\2<\u0117\3"+
		"\2\2\2>\u011a\3\2\2\2@\u0120\3\2\2\2B\u0128\3\2\2\2D\u0131\3\2\2\2F\u0135"+
		"\3\2\2\2H\u0147\3\2\2\2J\u0152\3\2\2\2L\u0158\3\2\2\2NP\5\4\3\2ON\3\2"+
		"\2\2PQ\3\2\2\2QO\3\2\2\2QR\3\2\2\2R\3\3\2\2\2SV\5\6\4\2TV\5\32\16\2US"+
		"\3\2\2\2UT\3\2\2\2V\5\3\2\2\2WX\7\16\2\2XY\5\b\5\2Y]\7\31\2\2Z^\5\n\6"+
		"\2[\\\7\r\2\2\\^\5\30\r\2]Z\3\2\2\2][\3\2\2\2^_\3\2\2\2_`\7\32\2\2`\7"+
		"\3\2\2\2ah\5\f\7\2bc\7\30\2\2ce\5\f\7\2db\3\2\2\2ef\3\2\2\2fd\3\2\2\2"+
		"fg\3\2\2\2gi\3\2\2\2hd\3\2\2\2hi\3\2\2\2i\t\3\2\2\2jk\t\2\2\2k\13\3\2"+
		"\2\2lq\5\16\b\2mq\5\20\t\2nq\5\22\n\2oq\5\24\13\2pl\3\2\2\2pm\3\2\2\2"+
		"pn\3\2\2\2po\3\2\2\2q\r\3\2\2\2rs\78\2\2s\17\3\2\2\2tu\78\2\2uv\7%\2\2"+
		"vw\5\26\f\2w\21\3\2\2\2xy\78\2\2yz\5\30\r\2z\23\3\2\2\2{|\78\2\2|}\5\30"+
		"\r\2}~\7%\2\2~\177\7\26\2\2\177\u0086\t\3\2\2\u0080\u0081\7\30\2\2\u0081"+
		"\u0083\t\3\2\2\u0082\u0080\3\2\2\2\u0083\u0084\3\2\2\2\u0084\u0082\3\2"+
		"\2\2\u0084\u0085\3\2\2\2\u0085\u0087\3\2\2\2\u0086\u0082\3\2\2\2\u0086"+
		"\u0087\3\2\2\2\u0087\u0088\3\2\2\2\u0088\u0089\7\27\2\2\u0089\25\3\2\2"+
		"\2\u008a\u0093\7\65\2\2\u008b\u0093\7\61\2\2\u008c\u0093\7\62\2\2\u008d"+
		"\u0093\5H%\2\u008e\u008f\7\22\2\2\u008f\u0090\5\26\f\2\u0090\u0091\7\23"+
		"\2\2\u0091\u0093\3\2\2\2\u0092\u008a\3\2\2\2\u0092\u008b\3\2\2\2\u0092"+
		"\u008c\3\2\2\2\u0092\u008d\3\2\2\2\u0092\u008e\3\2\2\2\u0093\u0096\3\2"+
		"\2\2\u0094\u0095\7\21\2\2\u0095\u0097\5\26\f\2\u0096\u0094\3\2\2\2\u0096"+
		"\u0097\3\2\2\2\u0097\27\3\2\2\2\u0098\u009a\7\24\2\2\u0099\u009b\7\61"+
		"\2\2\u009a\u0099\3\2\2\2\u009a\u009b\3\2\2\2\u009b\u009c\3\2\2\2\u009c"+
		"\u009d\7\25\2\2\u009d\31\3\2\2\2\u009e\u00a1\5\34\17\2\u009f\u00a1\5\36"+
		"\20\2\u00a0\u009e\3\2\2\2\u00a0\u009f\3\2\2\2\u00a1\33\3\2\2\2\u00a2\u00a3"+
		"\7\4\2\2\u00a3\u00a4\78\2\2\u00a4\u00a6\7\22\2\2\u00a5\u00a7\5 \21\2\u00a6"+
		"\u00a5\3\2\2\2\u00a6\u00a7\3\2\2\2\u00a7\u00a8\3\2\2\2\u00a8\u00a9\7\23"+
		"\2\2\u00a9\u00aa\5&\24\2\u00aa\35\3\2\2\2\u00ab\u00ac\7\4\2\2\u00ac\u00ad"+
		"\78\2\2\u00ad\u00af\7\22\2\2\u00ae\u00b0\5 \21\2\u00af\u00ae\3\2\2\2\u00af"+
		"\u00b0\3\2\2\2\u00b0\u00b1\3\2\2\2\u00b1\u00b2\7\23\2\2\u00b2\u00b3\7"+
		"\31\2\2\u00b3\u00b4\5\n\6\2\u00b4\u00b5\5&\24\2\u00b5\37\3\2\2\2\u00b6"+
		"\u00bd\5\"\22\2\u00b7\u00b8\7\32\2\2\u00b8\u00ba\5\"\22\2\u00b9\u00b7"+
		"\3\2\2\2\u00ba\u00bb\3\2\2\2\u00bb\u00b9\3\2\2\2\u00bb\u00bc\3\2\2\2\u00bc"+
		"\u00be\3\2\2\2\u00bd\u00b9\3\2\2\2\u00bd\u00be\3\2\2\2\u00be!\3\2\2\2"+
		"\u00bf\u00c6\5$\23\2\u00c0\u00c1\7\30\2\2\u00c1\u00c3\5$\23\2\u00c2\u00c0"+
		"\3\2\2\2\u00c3\u00c4\3\2\2\2\u00c4\u00c2\3\2\2\2\u00c4\u00c5\3\2\2\2\u00c5"+
		"\u00c7\3\2\2\2\u00c6\u00c2\3\2\2\2\u00c6\u00c7\3\2\2\2\u00c7\u00c8\3\2"+
		"\2\2\u00c8\u00c9\7\31\2\2\u00c9\u00ca\5\n\6\2\u00ca#\3\2\2\2\u00cb\u00d0"+
		"\78\2\2\u00cc\u00cd\78\2\2\u00cd\u00ce\7\24\2\2\u00ce\u00d0\7\25\2\2\u00cf"+
		"\u00cb\3\2\2\2\u00cf\u00cc\3\2\2\2\u00d0%\3\2\2\2\u00d1\u00d7\7\26\2\2"+
		"\u00d2\u00d4\5\4\3\2\u00d3\u00d2\3\2\2\2\u00d4\u00d5\3\2\2\2\u00d5\u00d3"+
		"\3\2\2\2\u00d5\u00d6\3\2\2\2\u00d6\u00d8\3\2\2\2\u00d7\u00d3\3\2\2\2\u00d7"+
		"\u00d8\3\2\2\2\u00d8\u00de\3\2\2\2\u00d9\u00db\5(\25\2\u00da\u00d9\3\2"+
		"\2\2\u00db\u00dc\3\2\2\2\u00dc\u00da\3\2\2\2\u00dc\u00dd\3\2\2\2\u00dd"+
		"\u00df\3\2\2\2\u00de\u00da\3\2\2\2\u00de\u00df\3\2\2\2\u00df\u00e0\3\2"+
		"\2\2\u00e0\u00e1\7\27\2\2\u00e1\'\3\2\2\2\u00e2\u00e3\5*\26\2\u00e3)\3"+
		"\2\2\2\u00e4\u00ef\5,\27\2\u00e5\u00ef\5\60\31\2\u00e6\u00ef\5\62\32\2"+
		"\u00e7\u00ef\5\64\33\2\u00e8\u00ef\5:\36\2\u00e9\u00ef\5<\37\2\u00ea\u00ef"+
		"\5> \2\u00eb\u00ef\5@!\2\u00ec\u00ef\5D#\2\u00ed\u00ef\5F$\2\u00ee\u00e4"+
		"\3\2\2\2\u00ee\u00e5\3\2\2\2\u00ee\u00e6\3\2\2\2\u00ee\u00e7\3\2\2\2\u00ee"+
		"\u00e8\3\2\2\2\u00ee\u00e9\3\2\2\2\u00ee\u00ea\3\2\2\2\u00ee\u00eb\3\2"+
		"\2\2\u00ee\u00ec\3\2\2\2\u00ee\u00ed\3\2\2\2\u00ef+\3\2\2\2\u00f0\u00f1"+
		"\5.\30\2\u00f1\u00f2\7\32\2\2\u00f2-\3\2\2\2\u00f3\u00f4\5H%\2\u00f4\u00f5"+
		"\t\4\2\2\u00f5\u00f6\5J&\2\u00f6/\3\2\2\2\u00f7\u00f8\7\7\2\2\u00f8\u00f9"+
		"\7\22\2\2\u00f9\u00fa\5J&\2\u00fa\u00fb\7\23\2\2\u00fb\u00fe\5&\24\2\u00fc"+
		"\u00fd\7\5\2\2\u00fd\u00ff\5&\24\2\u00fe\u00fc\3\2\2\2\u00fe\u00ff\3\2"+
		"\2\2\u00ff\61\3\2\2\2\u0100\u0101\7\17\2\2\u0101\u0102\7\22\2\2\u0102"+
		"\u0103\5J&\2\u0103\u0104\7\23\2\2\u0104\u0105\5&\24\2\u0105\63\3\2\2\2"+
		"\u0106\u0107\7\6\2\2\u0107\u0108\7\22\2\2\u0108\u0109\5\66\34\2\u0109"+
		"\u010a\7\32\2\2\u010a\u010b\5J&\2\u010b\u010c\7\32\2\2\u010c\u010d\58"+
		"\35\2\u010d\u010e\7\23\2\2\u010e\u010f\5&\24\2\u010f\65\3\2\2\2\u0110"+
		"\u0111\5.\30\2\u0111\67\3\2\2\2\u0112\u0113\5.\30\2\u01139\3\2\2\2\u0114"+
		"\u0115\7\f\2\2\u0115\u0116\7\32\2\2\u0116;\3\2\2\2\u0117\u0118\7\13\2"+
		"\2\u0118\u0119\7\32\2\2\u0119=\3\2\2\2\u011a\u011c\7\n\2\2\u011b\u011d"+
		"\5J&\2\u011c\u011b\3\2\2\2\u011c\u011d\3\2\2\2\u011d\u011e\3\2\2\2\u011e"+
		"\u011f\7\32\2\2\u011f?\3\2\2\2\u0120\u0121\78\2\2\u0121\u0123\7\22\2\2"+
		"\u0122\u0124\5B\"\2\u0123\u0122\3\2\2\2\u0123\u0124\3\2\2\2\u0124\u0125"+
		"\3\2\2\2\u0125\u0126\7\23\2\2\u0126\u0127\7\32\2\2\u0127A\3\2\2\2\u0128"+
		"\u012f\5J&\2\u0129\u012a\7\30\2\2\u012a\u012c\5J&\2\u012b\u0129\3\2\2"+
		"\2\u012c\u012d\3\2\2\2\u012d\u012b\3\2\2\2\u012d\u012e\3\2\2\2\u012e\u0130"+
		"\3\2\2\2\u012f\u012b\3\2\2\2\u012f\u0130\3\2\2\2\u0130C\3\2\2\2\u0131"+
		"\u0132\7\t\2\2\u0132\u0133\5H%\2\u0133\u0134\7\32\2\2\u0134E\3\2\2\2\u0135"+
		"\u0136\7\20\2\2\u0136\u013d\5J&\2\u0137\u0138\7\30\2\2\u0138\u013a\5J"+
		"&\2\u0139\u0137\3\2\2\2\u013a\u013b\3\2\2\2\u013b\u0139\3\2\2\2\u013b"+
		"\u013c\3\2\2\2\u013c\u013e\3\2\2\2\u013d\u0139\3\2\2\2\u013d\u013e\3\2"+
		"\2\2\u013e\u013f\3\2\2\2\u013f\u0140\7\32\2\2\u0140G\3\2\2\2\u0141\u0148"+
		"\78\2\2\u0142\u0143\78\2\2\u0143\u0144\7\24\2\2\u0144\u0145\5J&\2\u0145"+
		"\u0146\7\25\2\2\u0146\u0148\3\2\2\2\u0147\u0141\3\2\2\2\u0147\u0142\3"+
		"\2\2\2\u0148I\3\2\2\2\u0149\u0153\7\65\2\2\u014a\u0153\7\61\2\2\u014b"+
		"\u0153\7\62\2\2\u014c\u0153\5H%\2\u014d\u0153\5L\'\2\u014e\u014f\7\22"+
		"\2\2\u014f\u0150\5J&\2\u0150\u0151\7\23\2\2\u0151\u0153\3\2\2\2\u0152"+
		"\u0149\3\2\2\2\u0152\u014a\3\2\2\2\u0152\u014b\3\2\2\2\u0152\u014c\3\2"+
		"\2\2\u0152\u014d\3\2\2\2\u0152\u014e\3\2\2\2\u0153\u0156\3\2\2\2\u0154"+
		"\u0155\t\5\2\2\u0155\u0157\5J&\2\u0156\u0154\3\2\2\2\u0156\u0157\3\2\2"+
		"\2\u0157K\3\2\2\2\u0158\u0159\78\2\2\u0159\u015b\7\22\2\2\u015a\u015c"+
		"\5B\"\2\u015b\u015a\3\2\2\2\u015b\u015c\3\2\2\2\u015c\u015d\3\2\2\2\u015d"+
		"\u015e\7\23\2\2\u015eM\3\2\2\2%QU]fhp\u0084\u0086\u0092\u0096\u009a\u00a0"+
		"\u00a6\u00af\u00bb\u00bd\u00c4\u00c6\u00cf\u00d5\u00d7\u00dc\u00de\u00ee"+
		"\u00fe\u011c\u0123\u012d\u012f\u013b\u013d\u0147\u0152\u0156\u015b";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}