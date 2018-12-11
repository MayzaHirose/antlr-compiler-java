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
		RULE_expVarArranjoIni = 11, RULE_memoriaReservada = 12, RULE_decSub = 13, 
		RULE_decProc = 14, RULE_decFunc = 15, RULE_listaParametros = 16, RULE_specParam = 17, 
		RULE_param = 18, RULE_bloco = 19, RULE_comando = 20, RULE_cmdSimples = 21, 
		RULE_cmdAtrib = 22, RULE_atrib = 23, RULE_cmdIf = 24, RULE_cmdWhile = 25, 
		RULE_cmdFor = 26, RULE_atribIni = 27, RULE_atribPasso = 28, RULE_cmdStop = 29, 
		RULE_cmdSkip = 30, RULE_cmdReturn = 31, RULE_cmdChamadaProc = 32, RULE_listaExpressao = 33, 
		RULE_cmdRead = 34, RULE_cmdWrite = 35, RULE_variavel = 36, RULE_expressao = 37, 
		RULE_chamadaFuncao = 38;
	public static final String[] ruleNames = {
		"start", "declaracao", "decVar", "listaSpecVars", "tipo", "specVar", "specVarSimples", 
		"specVarSimplesIni", "specVarArranjo", "specVarArranjoIni", "expVarSimplesIni", 
		"expVarArranjoIni", "memoriaReservada", "decSub", "decProc", "decFunc", 
		"listaParametros", "specParam", "param", "bloco", "comando", "cmdSimples", 
		"cmdAtrib", "atrib", "cmdIf", "cmdWhile", "cmdFor", "atribIni", "atribPasso", 
		"cmdStop", "cmdSkip", "cmdReturn", "cmdChamadaProc", "listaExpressao", 
		"cmdRead", "cmdWrite", "variavel", "expressao", "chamadaFuncao"
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
			setState(79); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(78);
				declaracao();
				}
				}
				setState(81); 
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
			setState(85);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case VAR_KW:
				{
				setState(83);
				decVar();
				}
				break;
			case DEF_KW:
				{
				setState(84);
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
			setState(87);
			match(VAR_KW);
			setState(88);
			listaSpecVars();
			setState(89);
			match(COLON);
			setState(93);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,2,_ctx) ) {
			case 1:
				{
				setState(90);
				tipo();
				}
				break;
			case 2:
				{
				setState(91);
				match(STRING_KW);
				setState(92);
				memoriaReservada();
				}
				break;
			}
			setState(95);
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
			setState(97);
			specVar();
			setState(104);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==COMMA) {
				{
				setState(100); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					{
					setState(98);
					match(COMMA);
					setState(99);
					specVar();
					}
					}
					setState(102); 
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
			setState(106);
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
			setState(112);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,5,_ctx) ) {
			case 1:
				{
				setState(108);
				specVarSimples();
				}
				break;
			case 2:
				{
				setState(109);
				specVarSimplesIni();
				}
				break;
			case 3:
				{
				setState(110);
				specVarArranjo();
				}
				break;
			case 4:
				{
				setState(111);
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
			setState(114);
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
			setState(116);
			match(IDENTIFIER);
			setState(117);
			match(ATTRIB);
			setState(118);
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
			setState(120);
			match(IDENTIFIER);
			setState(121);
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
		public ExpVarArranjoIniContext expVarArranjoIni() {
			return getRuleContext(ExpVarArranjoIniContext.class,0);
		}
		public TerminalNode CBRACES_CLOSE() { return getToken(GraceParser.CBRACES_CLOSE, 0); }
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
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(123);
			match(IDENTIFIER);
			setState(124);
			memoriaReservada();
			setState(125);
			match(ATTRIB);
			setState(126);
			match(CBRACES_OPEN);
			setState(127);
			expVarArranjoIni();
			setState(128);
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
			setState(138);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case STRING:
				{
				setState(130);
				match(STRING);
				}
				break;
			case INTEGER:
				{
				setState(131);
				match(INTEGER);
				}
				break;
			case BOOLEAN:
				{
				setState(132);
				match(BOOLEAN);
				}
				break;
			case IDENTIFIER:
				{
				setState(133);
				variavel();
				}
				break;
			case PAREN_OPEN:
				{
				{
				setState(134);
				match(PAREN_OPEN);
				setState(135);
				expVarSimplesIni();
				setState(136);
				match(PAREN_CLOSE);
				}
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			setState(142);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==OP_ARITMETICO) {
				{
				setState(140);
				match(OP_ARITMETICO);
				setState(141);
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

	public static class ExpVarArranjoIniContext extends ParserRuleContext {
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
		public ExpVarArranjoIniContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expVarArranjoIni; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GraceListener ) ((GraceListener)listener).enterExpVarArranjoIni(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GraceListener ) ((GraceListener)listener).exitExpVarArranjoIni(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GraceVisitor ) return ((GraceVisitor<? extends T>)visitor).visitExpVarArranjoIni(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ExpVarArranjoIniContext expVarArranjoIni() throws RecognitionException {
		ExpVarArranjoIniContext _localctx = new ExpVarArranjoIniContext(_ctx, getState());
		enterRule(_localctx, 22, RULE_expVarArranjoIni);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(144);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << INTEGER) | (1L << BOOLEAN) | (1L << STRING))) != 0)) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			setState(151);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==COMMA) {
				{
				setState(147); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					{
					setState(145);
					match(COMMA);
					setState(146);
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
					setState(149); 
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
		enterRule(_localctx, 24, RULE_memoriaReservada);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(153);
			match(BRACKETS_OPEN);
			setState(155);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==INTEGER) {
				{
				setState(154);
				match(INTEGER);
				}
			}

			setState(157);
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
		enterRule(_localctx, 26, RULE_decSub);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(161);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,11,_ctx) ) {
			case 1:
				{
				setState(159);
				decProc();
				}
				break;
			case 2:
				{
				setState(160);
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
		enterRule(_localctx, 28, RULE_decProc);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(163);
			match(DEF_KW);
			setState(164);
			match(IDENTIFIER);
			setState(165);
			match(PAREN_OPEN);
			setState(167);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==IDENTIFIER) {
				{
				setState(166);
				listaParametros();
				}
			}

			setState(169);
			match(PAREN_CLOSE);
			setState(170);
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
		enterRule(_localctx, 30, RULE_decFunc);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(172);
			match(DEF_KW);
			setState(173);
			match(IDENTIFIER);
			setState(174);
			match(PAREN_OPEN);
			setState(176);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==IDENTIFIER) {
				{
				setState(175);
				listaParametros();
				}
			}

			setState(178);
			match(PAREN_CLOSE);
			setState(179);
			match(COLON);
			setState(180);
			tipo();
			setState(181);
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
		enterRule(_localctx, 32, RULE_listaParametros);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(183);
			specParam();
			setState(190);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==SEMICOLON) {
				{
				setState(186); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					{
					setState(184);
					match(SEMICOLON);
					setState(185);
					specParam();
					}
					}
					setState(188); 
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
		enterRule(_localctx, 34, RULE_specParam);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(192);
			param();
			setState(199);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==COMMA) {
				{
				setState(195); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					{
					setState(193);
					match(COMMA);
					setState(194);
					param();
					}
					}
					setState(197); 
					_errHandler.sync(this);
					_la = _input.LA(1);
				} while ( _la==COMMA );
				}
			}

			setState(201);
			match(COLON);
			setState(202);
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
		enterRule(_localctx, 36, RULE_param);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(208);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,18,_ctx) ) {
			case 1:
				{
				setState(204);
				match(IDENTIFIER);
				}
				break;
			case 2:
				{
				setState(205);
				match(IDENTIFIER);
				setState(206);
				match(BRACKETS_OPEN);
				setState(207);
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
		enterRule(_localctx, 38, RULE_bloco);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(210);
			match(CBRACES_OPEN);
			setState(216);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==DEF_KW || _la==VAR_KW) {
				{
				setState(212); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					{
					setState(211);
					declaracao();
					}
					}
					setState(214); 
					_errHandler.sync(this);
					_la = _input.LA(1);
				} while ( _la==DEF_KW || _la==VAR_KW );
				}
			}

			setState(223);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << FOR_KW) | (1L << IF_KW) | (1L << READ_KW) | (1L << RETURN_KW) | (1L << SKIP_KW) | (1L << STOP_KW) | (1L << WHILE_KW) | (1L << WRITE_KW) | (1L << IDENTIFIER))) != 0)) {
				{
				setState(219); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					{
					setState(218);
					comando();
					}
					}
					setState(221); 
					_errHandler.sync(this);
					_la = _input.LA(1);
				} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << FOR_KW) | (1L << IF_KW) | (1L << READ_KW) | (1L << RETURN_KW) | (1L << SKIP_KW) | (1L << STOP_KW) | (1L << WHILE_KW) | (1L << WRITE_KW) | (1L << IDENTIFIER))) != 0) );
				}
			}

			setState(225);
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
		enterRule(_localctx, 40, RULE_comando);
		try {
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(227);
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
		enterRule(_localctx, 42, RULE_cmdSimples);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(239);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,23,_ctx) ) {
			case 1:
				{
				setState(229);
				cmdAtrib();
				}
				break;
			case 2:
				{
				setState(230);
				cmdIf();
				}
				break;
			case 3:
				{
				setState(231);
				cmdWhile();
				}
				break;
			case 4:
				{
				setState(232);
				cmdFor();
				}
				break;
			case 5:
				{
				setState(233);
				cmdStop();
				}
				break;
			case 6:
				{
				setState(234);
				cmdSkip();
				}
				break;
			case 7:
				{
				setState(235);
				cmdReturn();
				}
				break;
			case 8:
				{
				setState(236);
				cmdChamadaProc();
				}
				break;
			case 9:
				{
				setState(237);
				cmdRead();
				}
				break;
			case 10:
				{
				setState(238);
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
		enterRule(_localctx, 44, RULE_cmdAtrib);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(241);
			atrib();
			setState(242);
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
		enterRule(_localctx, 46, RULE_atrib);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(244);
			variavel();
			setState(245);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << ATTRIB_PLUS) | (1L << ATTRIB_MINUS) | (1L << ATTRIB_TIMES) | (1L << ATTRIB_DIV) | (1L << ATTRIB_REMAINDER) | (1L << ATTRIB))) != 0)) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			setState(246);
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
		enterRule(_localctx, 48, RULE_cmdIf);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(248);
			match(IF_KW);
			setState(249);
			match(PAREN_OPEN);
			setState(250);
			expressao();
			setState(251);
			match(PAREN_CLOSE);
			setState(252);
			bloco();
			setState(255);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==ELSE_KW) {
				{
				setState(253);
				match(ELSE_KW);
				setState(254);
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
		enterRule(_localctx, 50, RULE_cmdWhile);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(257);
			match(WHILE_KW);
			setState(258);
			match(PAREN_OPEN);
			setState(259);
			expressao();
			setState(260);
			match(PAREN_CLOSE);
			setState(261);
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
		enterRule(_localctx, 52, RULE_cmdFor);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(263);
			match(FOR_KW);
			setState(264);
			match(PAREN_OPEN);
			setState(265);
			atribIni();
			setState(266);
			match(SEMICOLON);
			setState(267);
			expressao();
			setState(268);
			match(SEMICOLON);
			setState(269);
			atribPasso();
			setState(270);
			match(PAREN_CLOSE);
			setState(271);
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
		enterRule(_localctx, 54, RULE_atribIni);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(273);
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
		enterRule(_localctx, 56, RULE_atribPasso);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(275);
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
		enterRule(_localctx, 58, RULE_cmdStop);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(277);
			match(STOP_KW);
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
		enterRule(_localctx, 60, RULE_cmdSkip);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(280);
			match(SKIP_KW);
			setState(281);
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
		enterRule(_localctx, 62, RULE_cmdReturn);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(283);
			match(RETURN_KW);
			setState(285);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << PAREN_OPEN) | (1L << INTEGER) | (1L << BOOLEAN) | (1L << STRING) | (1L << IDENTIFIER))) != 0)) {
				{
				setState(284);
				expressao();
				}
			}

			setState(287);
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
		enterRule(_localctx, 64, RULE_cmdChamadaProc);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(289);
			match(IDENTIFIER);
			setState(290);
			match(PAREN_OPEN);
			setState(292);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << PAREN_OPEN) | (1L << INTEGER) | (1L << BOOLEAN) | (1L << STRING) | (1L << IDENTIFIER))) != 0)) {
				{
				setState(291);
				listaExpressao();
				}
			}

			setState(294);
			match(PAREN_CLOSE);
			setState(295);
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
		enterRule(_localctx, 66, RULE_listaExpressao);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(297);
			expressao();
			setState(304);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==COMMA) {
				{
				setState(300); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					{
					setState(298);
					match(COMMA);
					setState(299);
					expressao();
					}
					}
					setState(302); 
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
		enterRule(_localctx, 68, RULE_cmdRead);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(306);
			match(READ_KW);
			setState(307);
			variavel();
			setState(308);
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
		enterRule(_localctx, 70, RULE_cmdWrite);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(310);
			match(WRITE_KW);
			setState(311);
			expressao();
			setState(318);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==COMMA) {
				{
				setState(314); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					{
					setState(312);
					match(COMMA);
					setState(313);
					expressao();
					}
					}
					setState(316); 
					_errHandler.sync(this);
					_la = _input.LA(1);
				} while ( _la==COMMA );
				}
			}

			setState(320);
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
		enterRule(_localctx, 72, RULE_variavel);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(328);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,31,_ctx) ) {
			case 1:
				{
				setState(322);
				match(IDENTIFIER);
				}
				break;
			case 2:
				{
				{
				setState(323);
				match(IDENTIFIER);
				setState(324);
				match(BRACKETS_OPEN);
				setState(325);
				expressao();
				setState(326);
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
		enterRule(_localctx, 74, RULE_expressao);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(339);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,32,_ctx) ) {
			case 1:
				{
				setState(330);
				match(STRING);
				}
				break;
			case 2:
				{
				setState(331);
				match(INTEGER);
				}
				break;
			case 3:
				{
				setState(332);
				match(BOOLEAN);
				}
				break;
			case 4:
				{
				setState(333);
				variavel();
				}
				break;
			case 5:
				{
				setState(334);
				chamadaFuncao();
				}
				break;
			case 6:
				{
				{
				setState(335);
				match(PAREN_OPEN);
				setState(336);
				expressao();
				setState(337);
				match(PAREN_CLOSE);
				}
				}
				break;
			}
			setState(343);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==OP_ARITMETICO || _la==OP_EXPRESSAO) {
				{
				setState(341);
				_la = _input.LA(1);
				if ( !(_la==OP_ARITMETICO || _la==OP_EXPRESSAO) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(342);
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
		enterRule(_localctx, 76, RULE_chamadaFuncao);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(345);
			match(IDENTIFIER);
			setState(346);
			match(PAREN_OPEN);
			setState(348);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << PAREN_OPEN) | (1L << INTEGER) | (1L << BOOLEAN) | (1L << STRING) | (1L << IDENTIFIER))) != 0)) {
				{
				setState(347);
				listaExpressao();
				}
			}

			setState(350);
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
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\39\u0163\4\2\t\2\4"+
		"\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13\t"+
		"\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31\t\31"+
		"\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37\t\37\4 \t \4!"+
		"\t!\4\"\t\"\4#\t#\4$\t$\4%\t%\4&\t&\4\'\t\'\4(\t(\3\2\6\2R\n\2\r\2\16"+
		"\2S\3\3\3\3\5\3X\n\3\3\4\3\4\3\4\3\4\3\4\3\4\5\4`\n\4\3\4\3\4\3\5\3\5"+
		"\3\5\6\5g\n\5\r\5\16\5h\5\5k\n\5\3\6\3\6\3\7\3\7\3\7\3\7\5\7s\n\7\3\b"+
		"\3\b\3\t\3\t\3\t\3\t\3\n\3\n\3\n\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3"+
		"\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\5\f\u008d\n\f\3\f\3\f\5\f\u0091\n\f\3\r"+
		"\3\r\3\r\6\r\u0096\n\r\r\r\16\r\u0097\5\r\u009a\n\r\3\16\3\16\5\16\u009e"+
		"\n\16\3\16\3\16\3\17\3\17\5\17\u00a4\n\17\3\20\3\20\3\20\3\20\5\20\u00aa"+
		"\n\20\3\20\3\20\3\20\3\21\3\21\3\21\3\21\5\21\u00b3\n\21\3\21\3\21\3\21"+
		"\3\21\3\21\3\22\3\22\3\22\6\22\u00bd\n\22\r\22\16\22\u00be\5\22\u00c1"+
		"\n\22\3\23\3\23\3\23\6\23\u00c6\n\23\r\23\16\23\u00c7\5\23\u00ca\n\23"+
		"\3\23\3\23\3\23\3\24\3\24\3\24\3\24\5\24\u00d3\n\24\3\25\3\25\6\25\u00d7"+
		"\n\25\r\25\16\25\u00d8\5\25\u00db\n\25\3\25\6\25\u00de\n\25\r\25\16\25"+
		"\u00df\5\25\u00e2\n\25\3\25\3\25\3\26\3\26\3\27\3\27\3\27\3\27\3\27\3"+
		"\27\3\27\3\27\3\27\3\27\5\27\u00f2\n\27\3\30\3\30\3\30\3\31\3\31\3\31"+
		"\3\31\3\32\3\32\3\32\3\32\3\32\3\32\3\32\5\32\u0102\n\32\3\33\3\33\3\33"+
		"\3\33\3\33\3\33\3\34\3\34\3\34\3\34\3\34\3\34\3\34\3\34\3\34\3\34\3\35"+
		"\3\35\3\36\3\36\3\37\3\37\3\37\3 \3 \3 \3!\3!\5!\u0120\n!\3!\3!\3\"\3"+
		"\"\3\"\5\"\u0127\n\"\3\"\3\"\3\"\3#\3#\3#\6#\u012f\n#\r#\16#\u0130\5#"+
		"\u0133\n#\3$\3$\3$\3$\3%\3%\3%\3%\6%\u013d\n%\r%\16%\u013e\5%\u0141\n"+
		"%\3%\3%\3&\3&\3&\3&\3&\3&\5&\u014b\n&\3\'\3\'\3\'\3\'\3\'\3\'\3\'\3\'"+
		"\3\'\5\'\u0156\n\'\3\'\3\'\5\'\u015a\n\'\3(\3(\3(\5(\u015f\n(\3(\3(\3"+
		"(\2\2)\2\4\6\b\n\f\16\20\22\24\26\30\32\34\36 \"$&(*,.\60\62\64\668:<"+
		">@BDFHJLN\2\6\5\2\3\3\b\b\r\r\4\2\61\62\65\65\4\2\33\37%%\4\2\21\21&&"+
		"\2\u016f\2Q\3\2\2\2\4W\3\2\2\2\6Y\3\2\2\2\bc\3\2\2\2\nl\3\2\2\2\fr\3\2"+
		"\2\2\16t\3\2\2\2\20v\3\2\2\2\22z\3\2\2\2\24}\3\2\2\2\26\u008c\3\2\2\2"+
		"\30\u0092\3\2\2\2\32\u009b\3\2\2\2\34\u00a3\3\2\2\2\36\u00a5\3\2\2\2 "+
		"\u00ae\3\2\2\2\"\u00b9\3\2\2\2$\u00c2\3\2\2\2&\u00d2\3\2\2\2(\u00d4\3"+
		"\2\2\2*\u00e5\3\2\2\2,\u00f1\3\2\2\2.\u00f3\3\2\2\2\60\u00f6\3\2\2\2\62"+
		"\u00fa\3\2\2\2\64\u0103\3\2\2\2\66\u0109\3\2\2\28\u0113\3\2\2\2:\u0115"+
		"\3\2\2\2<\u0117\3\2\2\2>\u011a\3\2\2\2@\u011d\3\2\2\2B\u0123\3\2\2\2D"+
		"\u012b\3\2\2\2F\u0134\3\2\2\2H\u0138\3\2\2\2J\u014a\3\2\2\2L\u0155\3\2"+
		"\2\2N\u015b\3\2\2\2PR\5\4\3\2QP\3\2\2\2RS\3\2\2\2SQ\3\2\2\2ST\3\2\2\2"+
		"T\3\3\2\2\2UX\5\6\4\2VX\5\34\17\2WU\3\2\2\2WV\3\2\2\2X\5\3\2\2\2YZ\7\16"+
		"\2\2Z[\5\b\5\2[_\7\31\2\2\\`\5\n\6\2]^\7\r\2\2^`\5\32\16\2_\\\3\2\2\2"+
		"_]\3\2\2\2`a\3\2\2\2ab\7\32\2\2b\7\3\2\2\2cj\5\f\7\2de\7\30\2\2eg\5\f"+
		"\7\2fd\3\2\2\2gh\3\2\2\2hf\3\2\2\2hi\3\2\2\2ik\3\2\2\2jf\3\2\2\2jk\3\2"+
		"\2\2k\t\3\2\2\2lm\t\2\2\2m\13\3\2\2\2ns\5\16\b\2os\5\20\t\2ps\5\22\n\2"+
		"qs\5\24\13\2rn\3\2\2\2ro\3\2\2\2rp\3\2\2\2rq\3\2\2\2s\r\3\2\2\2tu\78\2"+
		"\2u\17\3\2\2\2vw\78\2\2wx\7%\2\2xy\5\26\f\2y\21\3\2\2\2z{\78\2\2{|\5\32"+
		"\16\2|\23\3\2\2\2}~\78\2\2~\177\5\32\16\2\177\u0080\7%\2\2\u0080\u0081"+
		"\7\26\2\2\u0081\u0082\5\30\r\2\u0082\u0083\7\27\2\2\u0083\25\3\2\2\2\u0084"+
		"\u008d\7\65\2\2\u0085\u008d\7\61\2\2\u0086\u008d\7\62\2\2\u0087\u008d"+
		"\5J&\2\u0088\u0089\7\22\2\2\u0089\u008a\5\26\f\2\u008a\u008b\7\23\2\2"+
		"\u008b\u008d\3\2\2\2\u008c\u0084\3\2\2\2\u008c\u0085\3\2\2\2\u008c\u0086"+
		"\3\2\2\2\u008c\u0087\3\2\2\2\u008c\u0088\3\2\2\2\u008d\u0090\3\2\2\2\u008e"+
		"\u008f\7\21\2\2\u008f\u0091\5\26\f\2\u0090\u008e\3\2\2\2\u0090\u0091\3"+
		"\2\2\2\u0091\27\3\2\2\2\u0092\u0099\t\3\2\2\u0093\u0094\7\30\2\2\u0094"+
		"\u0096\t\3\2\2\u0095\u0093\3\2\2\2\u0096\u0097\3\2\2\2\u0097\u0095\3\2"+
		"\2\2\u0097\u0098\3\2\2\2\u0098\u009a\3\2\2\2\u0099\u0095\3\2\2\2\u0099"+
		"\u009a\3\2\2\2\u009a\31\3\2\2\2\u009b\u009d\7\24\2\2\u009c\u009e\7\61"+
		"\2\2\u009d\u009c\3\2\2\2\u009d\u009e\3\2\2\2\u009e\u009f\3\2\2\2\u009f"+
		"\u00a0\7\25\2\2\u00a0\33\3\2\2\2\u00a1\u00a4\5\36\20\2\u00a2\u00a4\5 "+
		"\21\2\u00a3\u00a1\3\2\2\2\u00a3\u00a2\3\2\2\2\u00a4\35\3\2\2\2\u00a5\u00a6"+
		"\7\4\2\2\u00a6\u00a7\78\2\2\u00a7\u00a9\7\22\2\2\u00a8\u00aa\5\"\22\2"+
		"\u00a9\u00a8\3\2\2\2\u00a9\u00aa\3\2\2\2\u00aa\u00ab\3\2\2\2\u00ab\u00ac"+
		"\7\23\2\2\u00ac\u00ad\5(\25\2\u00ad\37\3\2\2\2\u00ae\u00af\7\4\2\2\u00af"+
		"\u00b0\78\2\2\u00b0\u00b2\7\22\2\2\u00b1\u00b3\5\"\22\2\u00b2\u00b1\3"+
		"\2\2\2\u00b2\u00b3\3\2\2\2\u00b3\u00b4\3\2\2\2\u00b4\u00b5\7\23\2\2\u00b5"+
		"\u00b6\7\31\2\2\u00b6\u00b7\5\n\6\2\u00b7\u00b8\5(\25\2\u00b8!\3\2\2\2"+
		"\u00b9\u00c0\5$\23\2\u00ba\u00bb\7\32\2\2\u00bb\u00bd\5$\23\2\u00bc\u00ba"+
		"\3\2\2\2\u00bd\u00be\3\2\2\2\u00be\u00bc\3\2\2\2\u00be\u00bf\3\2\2\2\u00bf"+
		"\u00c1\3\2\2\2\u00c0\u00bc\3\2\2\2\u00c0\u00c1\3\2\2\2\u00c1#\3\2\2\2"+
		"\u00c2\u00c9\5&\24\2\u00c3\u00c4\7\30\2\2\u00c4\u00c6\5&\24\2\u00c5\u00c3"+
		"\3\2\2\2\u00c6\u00c7\3\2\2\2\u00c7\u00c5\3\2\2\2\u00c7\u00c8\3\2\2\2\u00c8"+
		"\u00ca\3\2\2\2\u00c9\u00c5\3\2\2\2\u00c9\u00ca\3\2\2\2\u00ca\u00cb\3\2"+
		"\2\2\u00cb\u00cc\7\31\2\2\u00cc\u00cd\5\n\6\2\u00cd%\3\2\2\2\u00ce\u00d3"+
		"\78\2\2\u00cf\u00d0\78\2\2\u00d0\u00d1\7\24\2\2\u00d1\u00d3\7\25\2\2\u00d2"+
		"\u00ce\3\2\2\2\u00d2\u00cf\3\2\2\2\u00d3\'\3\2\2\2\u00d4\u00da\7\26\2"+
		"\2\u00d5\u00d7\5\4\3\2\u00d6\u00d5\3\2\2\2\u00d7\u00d8\3\2\2\2\u00d8\u00d6"+
		"\3\2\2\2\u00d8\u00d9\3\2\2\2\u00d9\u00db\3\2\2\2\u00da\u00d6\3\2\2\2\u00da"+
		"\u00db\3\2\2\2\u00db\u00e1\3\2\2\2\u00dc\u00de\5*\26\2\u00dd\u00dc\3\2"+
		"\2\2\u00de\u00df\3\2\2\2\u00df\u00dd\3\2\2\2\u00df\u00e0\3\2\2\2\u00e0"+
		"\u00e2\3\2\2\2\u00e1\u00dd\3\2\2\2\u00e1\u00e2\3\2\2\2\u00e2\u00e3\3\2"+
		"\2\2\u00e3\u00e4\7\27\2\2\u00e4)\3\2\2\2\u00e5\u00e6\5,\27\2\u00e6+\3"+
		"\2\2\2\u00e7\u00f2\5.\30\2\u00e8\u00f2\5\62\32\2\u00e9\u00f2\5\64\33\2"+
		"\u00ea\u00f2\5\66\34\2\u00eb\u00f2\5<\37\2\u00ec\u00f2\5> \2\u00ed\u00f2"+
		"\5@!\2\u00ee\u00f2\5B\"\2\u00ef\u00f2\5F$\2\u00f0\u00f2\5H%\2\u00f1\u00e7"+
		"\3\2\2\2\u00f1\u00e8\3\2\2\2\u00f1\u00e9\3\2\2\2\u00f1\u00ea\3\2\2\2\u00f1"+
		"\u00eb\3\2\2\2\u00f1\u00ec\3\2\2\2\u00f1\u00ed\3\2\2\2\u00f1\u00ee\3\2"+
		"\2\2\u00f1\u00ef\3\2\2\2\u00f1\u00f0\3\2\2\2\u00f2-\3\2\2\2\u00f3\u00f4"+
		"\5\60\31\2\u00f4\u00f5\7\32\2\2\u00f5/\3\2\2\2\u00f6\u00f7\5J&\2\u00f7"+
		"\u00f8\t\4\2\2\u00f8\u00f9\5L\'\2\u00f9\61\3\2\2\2\u00fa\u00fb\7\7\2\2"+
		"\u00fb\u00fc\7\22\2\2\u00fc\u00fd\5L\'\2\u00fd\u00fe\7\23\2\2\u00fe\u0101"+
		"\5(\25\2\u00ff\u0100\7\5\2\2\u0100\u0102\5(\25\2\u0101\u00ff\3\2\2\2\u0101"+
		"\u0102\3\2\2\2\u0102\63\3\2\2\2\u0103\u0104\7\17\2\2\u0104\u0105\7\22"+
		"\2\2\u0105\u0106\5L\'\2\u0106\u0107\7\23\2\2\u0107\u0108\5(\25\2\u0108"+
		"\65\3\2\2\2\u0109\u010a\7\6\2\2\u010a\u010b\7\22\2\2\u010b\u010c\58\35"+
		"\2\u010c\u010d\7\32\2\2\u010d\u010e\5L\'\2\u010e\u010f\7\32\2\2\u010f"+
		"\u0110\5:\36\2\u0110\u0111\7\23\2\2\u0111\u0112\5(\25\2\u0112\67\3\2\2"+
		"\2\u0113\u0114\5\60\31\2\u01149\3\2\2\2\u0115\u0116\5\60\31\2\u0116;\3"+
		"\2\2\2\u0117\u0118\7\f\2\2\u0118\u0119\7\32\2\2\u0119=\3\2\2\2\u011a\u011b"+
		"\7\13\2\2\u011b\u011c\7\32\2\2\u011c?\3\2\2\2\u011d\u011f\7\n\2\2\u011e"+
		"\u0120\5L\'\2\u011f\u011e\3\2\2\2\u011f\u0120\3\2\2\2\u0120\u0121\3\2"+
		"\2\2\u0121\u0122\7\32\2\2\u0122A\3\2\2\2\u0123\u0124\78\2\2\u0124\u0126"+
		"\7\22\2\2\u0125\u0127\5D#\2\u0126\u0125\3\2\2\2\u0126\u0127\3\2\2\2\u0127"+
		"\u0128\3\2\2\2\u0128\u0129\7\23\2\2\u0129\u012a\7\32\2\2\u012aC\3\2\2"+
		"\2\u012b\u0132\5L\'\2\u012c\u012d\7\30\2\2\u012d\u012f\5L\'\2\u012e\u012c"+
		"\3\2\2\2\u012f\u0130\3\2\2\2\u0130\u012e\3\2\2\2\u0130\u0131\3\2\2\2\u0131"+
		"\u0133\3\2\2\2\u0132\u012e\3\2\2\2\u0132\u0133\3\2\2\2\u0133E\3\2\2\2"+
		"\u0134\u0135\7\t\2\2\u0135\u0136\5J&\2\u0136\u0137\7\32\2\2\u0137G\3\2"+
		"\2\2\u0138\u0139\7\20\2\2\u0139\u0140\5L\'\2\u013a\u013b\7\30\2\2\u013b"+
		"\u013d\5L\'\2\u013c\u013a\3\2\2\2\u013d\u013e\3\2\2\2\u013e\u013c\3\2"+
		"\2\2\u013e\u013f\3\2\2\2\u013f\u0141\3\2\2\2\u0140\u013c\3\2\2\2\u0140"+
		"\u0141\3\2\2\2\u0141\u0142\3\2\2\2\u0142\u0143\7\32\2\2\u0143I\3\2\2\2"+
		"\u0144\u014b\78\2\2\u0145\u0146\78\2\2\u0146\u0147\7\24\2\2\u0147\u0148"+
		"\5L\'\2\u0148\u0149\7\25\2\2\u0149\u014b\3\2\2\2\u014a\u0144\3\2\2\2\u014a"+
		"\u0145\3\2\2\2\u014bK\3\2\2\2\u014c\u0156\7\65\2\2\u014d\u0156\7\61\2"+
		"\2\u014e\u0156\7\62\2\2\u014f\u0156\5J&\2\u0150\u0156\5N(\2\u0151\u0152"+
		"\7\22\2\2\u0152\u0153\5L\'\2\u0153\u0154\7\23\2\2\u0154\u0156\3\2\2\2"+
		"\u0155\u014c\3\2\2\2\u0155\u014d\3\2\2\2\u0155\u014e\3\2\2\2\u0155\u014f"+
		"\3\2\2\2\u0155\u0150\3\2\2\2\u0155\u0151\3\2\2\2\u0156\u0159\3\2\2\2\u0157"+
		"\u0158\t\5\2\2\u0158\u015a\5L\'\2\u0159\u0157\3\2\2\2\u0159\u015a\3\2"+
		"\2\2\u015aM\3\2\2\2\u015b\u015c\78\2\2\u015c\u015e\7\22\2\2\u015d\u015f"+
		"\5D#\2\u015e\u015d\3\2\2\2\u015e\u015f\3\2\2\2\u015f\u0160\3\2\2\2\u0160"+
		"\u0161\7\23\2\2\u0161O\3\2\2\2%SW_hjr\u008c\u0090\u0097\u0099\u009d\u00a3"+
		"\u00a9\u00b2\u00be\u00c0\u00c7\u00c9\u00d2\u00d8\u00da\u00df\u00e1\u00f1"+
		"\u0101\u011f\u0126\u0130\u0132\u013e\u0140\u014a\u0155\u0159\u015e";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}