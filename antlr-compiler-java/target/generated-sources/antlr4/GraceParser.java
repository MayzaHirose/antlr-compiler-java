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
		RULE_cmdWrite = 34, RULE_variavel = 35, RULE_expressao = 36, RULE_chamadaFuncao = 37, 
		RULE_expressaoIf = 38, RULE_expressaoWhile = 39, RULE_expressaoFor = 40, 
		RULE_expressaoForCond = 41, RULE_expressaoVar = 42;
	public static final String[] ruleNames = {
		"start", "declaracao", "decVar", "listaSpecVars", "tipo", "specVar", "specVarSimples", 
		"specVarSimplesIni", "specVarArranjo", "specVarArranjoIni", "expVarSimplesIni", 
		"memoriaReservada", "decSub", "decProc", "decFunc", "listaParametros", 
		"specParam", "param", "bloco", "comando", "cmdSimples", "cmdAtrib", "atrib", 
		"cmdIf", "cmdWhile", "cmdFor", "atribIni", "atribPasso", "cmdStop", "cmdSkip", 
		"cmdReturn", "cmdChamadaProc", "listaExpressao", "cmdRead", "cmdWrite", 
		"variavel", "expressao", "chamadaFuncao", "expressaoIf", "expressaoWhile", 
		"expressaoFor", "expressaoForCond", "expressaoVar"
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
			setState(87); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(86);
				declaracao();
				}
				}
				setState(89); 
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
			setState(93);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case VAR_KW:
				{
				setState(91);
				decVar();
				}
				break;
			case DEF_KW:
				{
				setState(92);
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
			setState(95);
			match(VAR_KW);
			setState(96);
			listaSpecVars();
			setState(97);
			match(COLON);
			setState(101);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,2,_ctx) ) {
			case 1:
				{
				setState(98);
				tipo();
				}
				break;
			case 2:
				{
				setState(99);
				match(STRING_KW);
				setState(100);
				memoriaReservada();
				}
				break;
			}
			setState(103);
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
			setState(105);
			specVar();
			setState(112);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==COMMA) {
				{
				setState(108); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					{
					setState(106);
					match(COMMA);
					setState(107);
					specVar();
					}
					}
					setState(110); 
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
			setState(114);
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
			setState(120);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,5,_ctx) ) {
			case 1:
				{
				setState(116);
				specVarSimples();
				}
				break;
			case 2:
				{
				setState(117);
				specVarSimplesIni();
				}
				break;
			case 3:
				{
				setState(118);
				specVarArranjo();
				}
				break;
			case 4:
				{
				setState(119);
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
			setState(122);
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
			setState(124);
			match(IDENTIFIER);
			setState(125);
			match(ATTRIB);
			setState(126);
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
			setState(128);
			match(IDENTIFIER);
			setState(129);
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
			setState(131);
			match(IDENTIFIER);
			setState(132);
			memoriaReservada();
			setState(133);
			match(ATTRIB);
			setState(134);
			match(CBRACES_OPEN);
			setState(135);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << INTEGER) | (1L << BOOLEAN) | (1L << STRING))) != 0)) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			setState(142);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==COMMA) {
				{
				setState(138); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					{
					setState(136);
					match(COMMA);
					setState(137);
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
					setState(140); 
					_errHandler.sync(this);
					_la = _input.LA(1);
				} while ( _la==COMMA );
				}
			}

			setState(144);
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
			setState(154);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case STRING:
				{
				setState(146);
				match(STRING);
				}
				break;
			case INTEGER:
				{
				setState(147);
				match(INTEGER);
				}
				break;
			case BOOLEAN:
				{
				setState(148);
				match(BOOLEAN);
				}
				break;
			case IDENTIFIER:
				{
				setState(149);
				variavel();
				}
				break;
			case PAREN_OPEN:
				{
				{
				setState(150);
				match(PAREN_OPEN);
				setState(151);
				expVarSimplesIni();
				setState(152);
				match(PAREN_CLOSE);
				}
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			setState(158);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==OP_ARITMETICO) {
				{
				setState(156);
				match(OP_ARITMETICO);
				setState(157);
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
			setState(160);
			match(BRACKETS_OPEN);
			setState(162);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==INTEGER) {
				{
				setState(161);
				match(INTEGER);
				}
			}

			setState(164);
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
			setState(168);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,11,_ctx) ) {
			case 1:
				{
				setState(166);
				decProc();
				}
				break;
			case 2:
				{
				setState(167);
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
			setState(170);
			match(DEF_KW);
			setState(171);
			match(IDENTIFIER);
			setState(172);
			match(PAREN_OPEN);
			setState(174);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==IDENTIFIER) {
				{
				setState(173);
				listaParametros();
				}
			}

			setState(176);
			match(PAREN_CLOSE);
			setState(177);
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
			setState(179);
			match(DEF_KW);
			setState(180);
			match(IDENTIFIER);
			setState(181);
			match(PAREN_OPEN);
			setState(183);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==IDENTIFIER) {
				{
				setState(182);
				listaParametros();
				}
			}

			setState(185);
			match(PAREN_CLOSE);
			setState(186);
			match(COLON);
			setState(187);
			tipo();
			setState(188);
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
			setState(190);
			specParam();
			setState(197);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==SEMICOLON) {
				{
				setState(193); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					{
					setState(191);
					match(SEMICOLON);
					setState(192);
					specParam();
					}
					}
					setState(195); 
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
			setState(199);
			param();
			setState(206);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==COMMA) {
				{
				setState(202); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					{
					setState(200);
					match(COMMA);
					setState(201);
					param();
					}
					}
					setState(204); 
					_errHandler.sync(this);
					_la = _input.LA(1);
				} while ( _la==COMMA );
				}
			}

			setState(208);
			match(COLON);
			setState(209);
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
			setState(215);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,18,_ctx) ) {
			case 1:
				{
				setState(211);
				match(IDENTIFIER);
				}
				break;
			case 2:
				{
				setState(212);
				match(IDENTIFIER);
				setState(213);
				match(BRACKETS_OPEN);
				setState(214);
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
			setState(217);
			match(CBRACES_OPEN);
			setState(223);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==DEF_KW || _la==VAR_KW) {
				{
				setState(219); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					{
					setState(218);
					declaracao();
					}
					}
					setState(221); 
					_errHandler.sync(this);
					_la = _input.LA(1);
				} while ( _la==DEF_KW || _la==VAR_KW );
				}
			}

			setState(230);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << FOR_KW) | (1L << IF_KW) | (1L << READ_KW) | (1L << RETURN_KW) | (1L << SKIP_KW) | (1L << STOP_KW) | (1L << WHILE_KW) | (1L << WRITE_KW) | (1L << IDENTIFIER))) != 0)) {
				{
				setState(226); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					{
					setState(225);
					comando();
					}
					}
					setState(228); 
					_errHandler.sync(this);
					_la = _input.LA(1);
				} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << FOR_KW) | (1L << IF_KW) | (1L << READ_KW) | (1L << RETURN_KW) | (1L << SKIP_KW) | (1L << STOP_KW) | (1L << WHILE_KW) | (1L << WRITE_KW) | (1L << IDENTIFIER))) != 0) );
				}
			}

			setState(232);
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
			setState(234);
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
			setState(246);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,23,_ctx) ) {
			case 1:
				{
				setState(236);
				cmdAtrib();
				}
				break;
			case 2:
				{
				setState(237);
				cmdIf();
				}
				break;
			case 3:
				{
				setState(238);
				cmdWhile();
				}
				break;
			case 4:
				{
				setState(239);
				cmdFor();
				}
				break;
			case 5:
				{
				setState(240);
				cmdStop();
				}
				break;
			case 6:
				{
				setState(241);
				cmdSkip();
				}
				break;
			case 7:
				{
				setState(242);
				cmdReturn();
				}
				break;
			case 8:
				{
				setState(243);
				cmdChamadaProc();
				}
				break;
			case 9:
				{
				setState(244);
				cmdRead();
				}
				break;
			case 10:
				{
				setState(245);
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
			setState(248);
			atrib();
			setState(249);
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
			setState(251);
			variavel();
			setState(252);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << ATTRIB_PLUS) | (1L << ATTRIB_MINUS) | (1L << ATTRIB_TIMES) | (1L << ATTRIB_DIV) | (1L << ATTRIB_REMAINDER) | (1L << ATTRIB))) != 0)) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			setState(253);
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
		public ExpressaoIfContext expressaoIf() {
			return getRuleContext(ExpressaoIfContext.class,0);
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
			setState(255);
			match(IF_KW);
			setState(256);
			match(PAREN_OPEN);
			setState(257);
			expressaoIf();
			setState(258);
			match(PAREN_CLOSE);
			setState(259);
			bloco();
			setState(262);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==ELSE_KW) {
				{
				setState(260);
				match(ELSE_KW);
				setState(261);
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
		public ExpressaoWhileContext expressaoWhile() {
			return getRuleContext(ExpressaoWhileContext.class,0);
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
			setState(264);
			match(WHILE_KW);
			setState(265);
			match(PAREN_OPEN);
			setState(266);
			expressaoWhile();
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
		public ExpressaoForContext expressaoFor() {
			return getRuleContext(ExpressaoForContext.class,0);
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
			setState(270);
			match(FOR_KW);
			setState(271);
			match(PAREN_OPEN);
			setState(272);
			atribIni();
			setState(273);
			match(SEMICOLON);
			setState(274);
			expressaoFor();
			setState(275);
			match(SEMICOLON);
			setState(276);
			atribPasso();
			setState(277);
			match(PAREN_CLOSE);
			setState(278);
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
			setState(280);
			match(IDENTIFIER);
			setState(281);
			match(ATTRIB);
			setState(282);
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
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GraceVisitor ) return ((GraceVisitor<? extends T>)visitor).visitAtribPasso(this);
			else return visitor.visitChildren(this);
		}
	}

	public final AtribPassoContext atribPasso() throws RecognitionException {
		AtribPassoContext _localctx = new AtribPassoContext(_ctx, getState());
		enterRule(_localctx, 54, RULE_atribPasso);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(284);
			match(IDENTIFIER);
			setState(285);
			_la = _input.LA(1);
			if ( !(_la==ATTRIB_PLUS || _la==ATTRIB_MINUS) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			setState(286);
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
			setState(288);
			match(STOP_KW);
			setState(289);
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
			setState(291);
			match(SKIP_KW);
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
			setState(294);
			match(RETURN_KW);
			setState(296);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << PAREN_OPEN) | (1L << INTEGER) | (1L << BOOLEAN) | (1L << STRING) | (1L << IDENTIFIER))) != 0)) {
				{
				setState(295);
				expressao();
				}
			}

			setState(298);
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
			setState(300);
			match(IDENTIFIER);
			setState(301);
			match(PAREN_OPEN);
			setState(303);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << PAREN_OPEN) | (1L << INTEGER) | (1L << BOOLEAN) | (1L << STRING) | (1L << IDENTIFIER))) != 0)) {
				{
				setState(302);
				listaExpressao();
				}
			}

			setState(305);
			match(PAREN_CLOSE);
			setState(306);
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
			setState(317);
			match(READ_KW);
			setState(318);
			variavel();
			setState(319);
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
			setState(321);
			match(WRITE_KW);
			setState(322);
			expressao();
			setState(329);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==COMMA) {
				{
				setState(325); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					{
					setState(323);
					match(COMMA);
					setState(324);
					expressao();
					}
					}
					setState(327); 
					_errHandler.sync(this);
					_la = _input.LA(1);
				} while ( _la==COMMA );
				}
			}

			setState(331);
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
		public ExpressaoVarContext expressaoVar() {
			return getRuleContext(ExpressaoVarContext.class,0);
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
			setState(339);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,31,_ctx) ) {
			case 1:
				{
				setState(333);
				match(IDENTIFIER);
				}
				break;
			case 2:
				{
				{
				setState(334);
				match(IDENTIFIER);
				setState(335);
				match(BRACKETS_OPEN);
				setState(336);
				expressaoVar();
				setState(337);
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
			setState(350);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,32,_ctx) ) {
			case 1:
				{
				setState(341);
				match(STRING);
				}
				break;
			case 2:
				{
				setState(342);
				match(INTEGER);
				}
				break;
			case 3:
				{
				setState(343);
				match(BOOLEAN);
				}
				break;
			case 4:
				{
				setState(344);
				variavel();
				}
				break;
			case 5:
				{
				setState(345);
				chamadaFuncao();
				}
				break;
			case 6:
				{
				{
				setState(346);
				match(PAREN_OPEN);
				setState(347);
				expressao();
				setState(348);
				match(PAREN_CLOSE);
				}
				}
				break;
			}
			setState(354);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==OP_ARITMETICO || _la==OP_EXPRESSAO) {
				{
				setState(352);
				_la = _input.LA(1);
				if ( !(_la==OP_ARITMETICO || _la==OP_EXPRESSAO) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(353);
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
			setState(356);
			match(IDENTIFIER);
			setState(357);
			match(PAREN_OPEN);
			setState(359);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << PAREN_OPEN) | (1L << INTEGER) | (1L << BOOLEAN) | (1L << STRING) | (1L << IDENTIFIER))) != 0)) {
				{
				setState(358);
				listaExpressao();
				}
			}

			setState(361);
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

	public static class ExpressaoIfContext extends ParserRuleContext {
		public TerminalNode INTEGER() { return getToken(GraceParser.INTEGER, 0); }
		public TerminalNode BOOLEAN() { return getToken(GraceParser.BOOLEAN, 0); }
		public VariavelContext variavel() {
			return getRuleContext(VariavelContext.class,0);
		}
		public ChamadaFuncaoContext chamadaFuncao() {
			return getRuleContext(ChamadaFuncaoContext.class,0);
		}
		public List<ExpressaoIfContext> expressaoIf() {
			return getRuleContexts(ExpressaoIfContext.class);
		}
		public ExpressaoIfContext expressaoIf(int i) {
			return getRuleContext(ExpressaoIfContext.class,i);
		}
		public TerminalNode PAREN_OPEN() { return getToken(GraceParser.PAREN_OPEN, 0); }
		public TerminalNode PAREN_CLOSE() { return getToken(GraceParser.PAREN_CLOSE, 0); }
		public TerminalNode OP_EXPRESSAO() { return getToken(GraceParser.OP_EXPRESSAO, 0); }
		public ExpressaoIfContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expressaoIf; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GraceListener ) ((GraceListener)listener).enterExpressaoIf(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GraceListener ) ((GraceListener)listener).exitExpressaoIf(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GraceVisitor ) return ((GraceVisitor<? extends T>)visitor).visitExpressaoIf(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ExpressaoIfContext expressaoIf() throws RecognitionException {
		ExpressaoIfContext _localctx = new ExpressaoIfContext(_ctx, getState());
		enterRule(_localctx, 76, RULE_expressaoIf);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(371);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,35,_ctx) ) {
			case 1:
				{
				setState(363);
				match(INTEGER);
				}
				break;
			case 2:
				{
				setState(364);
				match(BOOLEAN);
				}
				break;
			case 3:
				{
				setState(365);
				variavel();
				}
				break;
			case 4:
				{
				setState(366);
				chamadaFuncao();
				}
				break;
			case 5:
				{
				{
				setState(367);
				match(PAREN_OPEN);
				setState(368);
				expressaoIf();
				setState(369);
				match(PAREN_CLOSE);
				}
				}
				break;
			}
			setState(375);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==OP_EXPRESSAO) {
				{
				{
				setState(373);
				match(OP_EXPRESSAO);
				}
				setState(374);
				expressaoIf();
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

	public static class ExpressaoWhileContext extends ParserRuleContext {
		public ExpressaoIfContext expressaoIf() {
			return getRuleContext(ExpressaoIfContext.class,0);
		}
		public ExpressaoWhileContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expressaoWhile; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GraceListener ) ((GraceListener)listener).enterExpressaoWhile(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GraceListener ) ((GraceListener)listener).exitExpressaoWhile(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GraceVisitor ) return ((GraceVisitor<? extends T>)visitor).visitExpressaoWhile(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ExpressaoWhileContext expressaoWhile() throws RecognitionException {
		ExpressaoWhileContext _localctx = new ExpressaoWhileContext(_ctx, getState());
		enterRule(_localctx, 78, RULE_expressaoWhile);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(377);
			expressaoIf();
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

	public static class ExpressaoForContext extends ParserRuleContext {
		public VariavelContext variavel() {
			return getRuleContext(VariavelContext.class,0);
		}
		public TerminalNode OP_EXPRESSAO() { return getToken(GraceParser.OP_EXPRESSAO, 0); }
		public ExpressaoForCondContext expressaoForCond() {
			return getRuleContext(ExpressaoForCondContext.class,0);
		}
		public ExpressaoForContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expressaoFor; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GraceListener ) ((GraceListener)listener).enterExpressaoFor(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GraceListener ) ((GraceListener)listener).exitExpressaoFor(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GraceVisitor ) return ((GraceVisitor<? extends T>)visitor).visitExpressaoFor(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ExpressaoForContext expressaoFor() throws RecognitionException {
		ExpressaoForContext _localctx = new ExpressaoForContext(_ctx, getState());
		enterRule(_localctx, 80, RULE_expressaoFor);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(379);
			variavel();
			setState(380);
			match(OP_EXPRESSAO);
			setState(381);
			expressaoForCond();
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

	public static class ExpressaoForCondContext extends ParserRuleContext {
		public TerminalNode INTEGER() { return getToken(GraceParser.INTEGER, 0); }
		public VariavelContext variavel() {
			return getRuleContext(VariavelContext.class,0);
		}
		public ChamadaFuncaoContext chamadaFuncao() {
			return getRuleContext(ChamadaFuncaoContext.class,0);
		}
		public TerminalNode OP_ARITMETICO() { return getToken(GraceParser.OP_ARITMETICO, 0); }
		public List<ExpressaoForCondContext> expressaoForCond() {
			return getRuleContexts(ExpressaoForCondContext.class);
		}
		public ExpressaoForCondContext expressaoForCond(int i) {
			return getRuleContext(ExpressaoForCondContext.class,i);
		}
		public TerminalNode PAREN_OPEN() { return getToken(GraceParser.PAREN_OPEN, 0); }
		public TerminalNode PAREN_CLOSE() { return getToken(GraceParser.PAREN_CLOSE, 0); }
		public ExpressaoForCondContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expressaoForCond; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GraceListener ) ((GraceListener)listener).enterExpressaoForCond(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GraceListener ) ((GraceListener)listener).exitExpressaoForCond(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GraceVisitor ) return ((GraceVisitor<? extends T>)visitor).visitExpressaoForCond(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ExpressaoForCondContext expressaoForCond() throws RecognitionException {
		ExpressaoForCondContext _localctx = new ExpressaoForCondContext(_ctx, getState());
		enterRule(_localctx, 82, RULE_expressaoForCond);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(390);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,37,_ctx) ) {
			case 1:
				{
				setState(383);
				match(INTEGER);
				}
				break;
			case 2:
				{
				setState(384);
				variavel();
				}
				break;
			case 3:
				{
				setState(385);
				chamadaFuncao();
				}
				break;
			case 4:
				{
				{
				setState(386);
				match(PAREN_OPEN);
				setState(387);
				expressaoForCond();
				setState(388);
				match(PAREN_CLOSE);
				}
				}
				break;
			}
			setState(394);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==OP_ARITMETICO) {
				{
				setState(392);
				match(OP_ARITMETICO);
				setState(393);
				expressaoForCond();
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

	public static class ExpressaoVarContext extends ParserRuleContext {
		public TerminalNode INTEGER() { return getToken(GraceParser.INTEGER, 0); }
		public VariavelContext variavel() {
			return getRuleContext(VariavelContext.class,0);
		}
		public ChamadaFuncaoContext chamadaFuncao() {
			return getRuleContext(ChamadaFuncaoContext.class,0);
		}
		public TerminalNode OP_ARITMETICO() { return getToken(GraceParser.OP_ARITMETICO, 0); }
		public List<ExpressaoVarContext> expressaoVar() {
			return getRuleContexts(ExpressaoVarContext.class);
		}
		public ExpressaoVarContext expressaoVar(int i) {
			return getRuleContext(ExpressaoVarContext.class,i);
		}
		public TerminalNode PAREN_OPEN() { return getToken(GraceParser.PAREN_OPEN, 0); }
		public TerminalNode PAREN_CLOSE() { return getToken(GraceParser.PAREN_CLOSE, 0); }
		public ExpressaoVarContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expressaoVar; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GraceListener ) ((GraceListener)listener).enterExpressaoVar(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GraceListener ) ((GraceListener)listener).exitExpressaoVar(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GraceVisitor ) return ((GraceVisitor<? extends T>)visitor).visitExpressaoVar(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ExpressaoVarContext expressaoVar() throws RecognitionException {
		ExpressaoVarContext _localctx = new ExpressaoVarContext(_ctx, getState());
		enterRule(_localctx, 84, RULE_expressaoVar);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(403);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,39,_ctx) ) {
			case 1:
				{
				setState(396);
				match(INTEGER);
				}
				break;
			case 2:
				{
				setState(397);
				variavel();
				}
				break;
			case 3:
				{
				setState(398);
				chamadaFuncao();
				}
				break;
			case 4:
				{
				{
				setState(399);
				match(PAREN_OPEN);
				setState(400);
				expressaoVar();
				setState(401);
				match(PAREN_CLOSE);
				}
				}
				break;
			}
			setState(407);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==OP_ARITMETICO) {
				{
				setState(405);
				match(OP_ARITMETICO);
				setState(406);
				expressaoVar();
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

	public static final String _serializedATN =
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\39\u019c\4\2\t\2\4"+
		"\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13\t"+
		"\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31\t\31"+
		"\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37\t\37\4 \t \4!"+
		"\t!\4\"\t\"\4#\t#\4$\t$\4%\t%\4&\t&\4\'\t\'\4(\t(\4)\t)\4*\t*\4+\t+\4"+
		",\t,\3\2\6\2Z\n\2\r\2\16\2[\3\3\3\3\5\3`\n\3\3\4\3\4\3\4\3\4\3\4\3\4\5"+
		"\4h\n\4\3\4\3\4\3\5\3\5\3\5\6\5o\n\5\r\5\16\5p\5\5s\n\5\3\6\3\6\3\7\3"+
		"\7\3\7\3\7\5\7{\n\7\3\b\3\b\3\t\3\t\3\t\3\t\3\n\3\n\3\n\3\13\3\13\3\13"+
		"\3\13\3\13\3\13\3\13\6\13\u008d\n\13\r\13\16\13\u008e\5\13\u0091\n\13"+
		"\3\13\3\13\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\5\f\u009d\n\f\3\f\3\f\5\f\u00a1"+
		"\n\f\3\r\3\r\5\r\u00a5\n\r\3\r\3\r\3\16\3\16\5\16\u00ab\n\16\3\17\3\17"+
		"\3\17\3\17\5\17\u00b1\n\17\3\17\3\17\3\17\3\20\3\20\3\20\3\20\5\20\u00ba"+
		"\n\20\3\20\3\20\3\20\3\20\3\20\3\21\3\21\3\21\6\21\u00c4\n\21\r\21\16"+
		"\21\u00c5\5\21\u00c8\n\21\3\22\3\22\3\22\6\22\u00cd\n\22\r\22\16\22\u00ce"+
		"\5\22\u00d1\n\22\3\22\3\22\3\22\3\23\3\23\3\23\3\23\5\23\u00da\n\23\3"+
		"\24\3\24\6\24\u00de\n\24\r\24\16\24\u00df\5\24\u00e2\n\24\3\24\6\24\u00e5"+
		"\n\24\r\24\16\24\u00e6\5\24\u00e9\n\24\3\24\3\24\3\25\3\25\3\26\3\26\3"+
		"\26\3\26\3\26\3\26\3\26\3\26\3\26\3\26\5\26\u00f9\n\26\3\27\3\27\3\27"+
		"\3\30\3\30\3\30\3\30\3\31\3\31\3\31\3\31\3\31\3\31\3\31\5\31\u0109\n\31"+
		"\3\32\3\32\3\32\3\32\3\32\3\32\3\33\3\33\3\33\3\33\3\33\3\33\3\33\3\33"+
		"\3\33\3\33\3\34\3\34\3\34\3\34\3\35\3\35\3\35\3\35\3\36\3\36\3\36\3\37"+
		"\3\37\3\37\3 \3 \5 \u012b\n \3 \3 \3!\3!\3!\5!\u0132\n!\3!\3!\3!\3\"\3"+
		"\"\3\"\6\"\u013a\n\"\r\"\16\"\u013b\5\"\u013e\n\"\3#\3#\3#\3#\3$\3$\3"+
		"$\3$\6$\u0148\n$\r$\16$\u0149\5$\u014c\n$\3$\3$\3%\3%\3%\3%\3%\3%\5%\u0156"+
		"\n%\3&\3&\3&\3&\3&\3&\3&\3&\3&\5&\u0161\n&\3&\3&\5&\u0165\n&\3\'\3\'\3"+
		"\'\5\'\u016a\n\'\3\'\3\'\3(\3(\3(\3(\3(\3(\3(\3(\5(\u0176\n(\3(\3(\5("+
		"\u017a\n(\3)\3)\3*\3*\3*\3*\3+\3+\3+\3+\3+\3+\3+\5+\u0189\n+\3+\3+\5+"+
		"\u018d\n+\3,\3,\3,\3,\3,\3,\3,\5,\u0196\n,\3,\3,\5,\u019a\n,\3,\2\2-\2"+
		"\4\6\b\n\f\16\20\22\24\26\30\32\34\36 \"$&(*,.\60\62\64\668:<>@BDFHJL"+
		"NPRTV\2\7\5\2\3\3\b\b\r\r\4\2\61\62\65\65\4\2\33\37%%\3\2\33\34\4\2\21"+
		"\21&&\2\u01b1\2Y\3\2\2\2\4_\3\2\2\2\6a\3\2\2\2\bk\3\2\2\2\nt\3\2\2\2\f"+
		"z\3\2\2\2\16|\3\2\2\2\20~\3\2\2\2\22\u0082\3\2\2\2\24\u0085\3\2\2\2\26"+
		"\u009c\3\2\2\2\30\u00a2\3\2\2\2\32\u00aa\3\2\2\2\34\u00ac\3\2\2\2\36\u00b5"+
		"\3\2\2\2 \u00c0\3\2\2\2\"\u00c9\3\2\2\2$\u00d9\3\2\2\2&\u00db\3\2\2\2"+
		"(\u00ec\3\2\2\2*\u00f8\3\2\2\2,\u00fa\3\2\2\2.\u00fd\3\2\2\2\60\u0101"+
		"\3\2\2\2\62\u010a\3\2\2\2\64\u0110\3\2\2\2\66\u011a\3\2\2\28\u011e\3\2"+
		"\2\2:\u0122\3\2\2\2<\u0125\3\2\2\2>\u0128\3\2\2\2@\u012e\3\2\2\2B\u0136"+
		"\3\2\2\2D\u013f\3\2\2\2F\u0143\3\2\2\2H\u0155\3\2\2\2J\u0160\3\2\2\2L"+
		"\u0166\3\2\2\2N\u0175\3\2\2\2P\u017b\3\2\2\2R\u017d\3\2\2\2T\u0188\3\2"+
		"\2\2V\u0195\3\2\2\2XZ\5\4\3\2YX\3\2\2\2Z[\3\2\2\2[Y\3\2\2\2[\\\3\2\2\2"+
		"\\\3\3\2\2\2]`\5\6\4\2^`\5\32\16\2_]\3\2\2\2_^\3\2\2\2`\5\3\2\2\2ab\7"+
		"\16\2\2bc\5\b\5\2cg\7\31\2\2dh\5\n\6\2ef\7\r\2\2fh\5\30\r\2gd\3\2\2\2"+
		"ge\3\2\2\2hi\3\2\2\2ij\7\32\2\2j\7\3\2\2\2kr\5\f\7\2lm\7\30\2\2mo\5\f"+
		"\7\2nl\3\2\2\2op\3\2\2\2pn\3\2\2\2pq\3\2\2\2qs\3\2\2\2rn\3\2\2\2rs\3\2"+
		"\2\2s\t\3\2\2\2tu\t\2\2\2u\13\3\2\2\2v{\5\16\b\2w{\5\20\t\2x{\5\22\n\2"+
		"y{\5\24\13\2zv\3\2\2\2zw\3\2\2\2zx\3\2\2\2zy\3\2\2\2{\r\3\2\2\2|}\78\2"+
		"\2}\17\3\2\2\2~\177\78\2\2\177\u0080\7%\2\2\u0080\u0081\5\26\f\2\u0081"+
		"\21\3\2\2\2\u0082\u0083\78\2\2\u0083\u0084\5\30\r\2\u0084\23\3\2\2\2\u0085"+
		"\u0086\78\2\2\u0086\u0087\5\30\r\2\u0087\u0088\7%\2\2\u0088\u0089\7\26"+
		"\2\2\u0089\u0090\t\3\2\2\u008a\u008b\7\30\2\2\u008b\u008d\t\3\2\2\u008c"+
		"\u008a\3\2\2\2\u008d\u008e\3\2\2\2\u008e\u008c\3\2\2\2\u008e\u008f\3\2"+
		"\2\2\u008f\u0091\3\2\2\2\u0090\u008c\3\2\2\2\u0090\u0091\3\2\2\2\u0091"+
		"\u0092\3\2\2\2\u0092\u0093\7\27\2\2\u0093\25\3\2\2\2\u0094\u009d\7\65"+
		"\2\2\u0095\u009d\7\61\2\2\u0096\u009d\7\62\2\2\u0097\u009d\5H%\2\u0098"+
		"\u0099\7\22\2\2\u0099\u009a\5\26\f\2\u009a\u009b\7\23\2\2\u009b\u009d"+
		"\3\2\2\2\u009c\u0094\3\2\2\2\u009c\u0095\3\2\2\2\u009c\u0096\3\2\2\2\u009c"+
		"\u0097\3\2\2\2\u009c\u0098\3\2\2\2\u009d\u00a0\3\2\2\2\u009e\u009f\7\21"+
		"\2\2\u009f\u00a1\5\26\f\2\u00a0\u009e\3\2\2\2\u00a0\u00a1\3\2\2\2\u00a1"+
		"\27\3\2\2\2\u00a2\u00a4\7\24\2\2\u00a3\u00a5\7\61\2\2\u00a4\u00a3\3\2"+
		"\2\2\u00a4\u00a5\3\2\2\2\u00a5\u00a6\3\2\2\2\u00a6\u00a7\7\25\2\2\u00a7"+
		"\31\3\2\2\2\u00a8\u00ab\5\34\17\2\u00a9\u00ab\5\36\20\2\u00aa\u00a8\3"+
		"\2\2\2\u00aa\u00a9\3\2\2\2\u00ab\33\3\2\2\2\u00ac\u00ad\7\4\2\2\u00ad"+
		"\u00ae\78\2\2\u00ae\u00b0\7\22\2\2\u00af\u00b1\5 \21\2\u00b0\u00af\3\2"+
		"\2\2\u00b0\u00b1\3\2\2\2\u00b1\u00b2\3\2\2\2\u00b2\u00b3\7\23\2\2\u00b3"+
		"\u00b4\5&\24\2\u00b4\35\3\2\2\2\u00b5\u00b6\7\4\2\2\u00b6\u00b7\78\2\2"+
		"\u00b7\u00b9\7\22\2\2\u00b8\u00ba\5 \21\2\u00b9\u00b8\3\2\2\2\u00b9\u00ba"+
		"\3\2\2\2\u00ba\u00bb\3\2\2\2\u00bb\u00bc\7\23\2\2\u00bc\u00bd\7\31\2\2"+
		"\u00bd\u00be\5\n\6\2\u00be\u00bf\5&\24\2\u00bf\37\3\2\2\2\u00c0\u00c7"+
		"\5\"\22\2\u00c1\u00c2\7\32\2\2\u00c2\u00c4\5\"\22\2\u00c3\u00c1\3\2\2"+
		"\2\u00c4\u00c5\3\2\2\2\u00c5\u00c3\3\2\2\2\u00c5\u00c6\3\2\2\2\u00c6\u00c8"+
		"\3\2\2\2\u00c7\u00c3\3\2\2\2\u00c7\u00c8\3\2\2\2\u00c8!\3\2\2\2\u00c9"+
		"\u00d0\5$\23\2\u00ca\u00cb\7\30\2\2\u00cb\u00cd\5$\23\2\u00cc\u00ca\3"+
		"\2\2\2\u00cd\u00ce\3\2\2\2\u00ce\u00cc\3\2\2\2\u00ce\u00cf\3\2\2\2\u00cf"+
		"\u00d1\3\2\2\2\u00d0\u00cc\3\2\2\2\u00d0\u00d1\3\2\2\2\u00d1\u00d2\3\2"+
		"\2\2\u00d2\u00d3\7\31\2\2\u00d3\u00d4\5\n\6\2\u00d4#\3\2\2\2\u00d5\u00da"+
		"\78\2\2\u00d6\u00d7\78\2\2\u00d7\u00d8\7\24\2\2\u00d8\u00da\7\25\2\2\u00d9"+
		"\u00d5\3\2\2\2\u00d9\u00d6\3\2\2\2\u00da%\3\2\2\2\u00db\u00e1\7\26\2\2"+
		"\u00dc\u00de\5\4\3\2\u00dd\u00dc\3\2\2\2\u00de\u00df\3\2\2\2\u00df\u00dd"+
		"\3\2\2\2\u00df\u00e0\3\2\2\2\u00e0\u00e2\3\2\2\2\u00e1\u00dd\3\2\2\2\u00e1"+
		"\u00e2\3\2\2\2\u00e2\u00e8\3\2\2\2\u00e3\u00e5\5(\25\2\u00e4\u00e3\3\2"+
		"\2\2\u00e5\u00e6\3\2\2\2\u00e6\u00e4\3\2\2\2\u00e6\u00e7\3\2\2\2\u00e7"+
		"\u00e9\3\2\2\2\u00e8\u00e4\3\2\2\2\u00e8\u00e9\3\2\2\2\u00e9\u00ea\3\2"+
		"\2\2\u00ea\u00eb\7\27\2\2\u00eb\'\3\2\2\2\u00ec\u00ed\5*\26\2\u00ed)\3"+
		"\2\2\2\u00ee\u00f9\5,\27\2\u00ef\u00f9\5\60\31\2\u00f0\u00f9\5\62\32\2"+
		"\u00f1\u00f9\5\64\33\2\u00f2\u00f9\5:\36\2\u00f3\u00f9\5<\37\2\u00f4\u00f9"+
		"\5> \2\u00f5\u00f9\5@!\2\u00f6\u00f9\5D#\2\u00f7\u00f9\5F$\2\u00f8\u00ee"+
		"\3\2\2\2\u00f8\u00ef\3\2\2\2\u00f8\u00f0\3\2\2\2\u00f8\u00f1\3\2\2\2\u00f8"+
		"\u00f2\3\2\2\2\u00f8\u00f3\3\2\2\2\u00f8\u00f4\3\2\2\2\u00f8\u00f5\3\2"+
		"\2\2\u00f8\u00f6\3\2\2\2\u00f8\u00f7\3\2\2\2\u00f9+\3\2\2\2\u00fa\u00fb"+
		"\5.\30\2\u00fb\u00fc\7\32\2\2\u00fc-\3\2\2\2\u00fd\u00fe\5H%\2\u00fe\u00ff"+
		"\t\4\2\2\u00ff\u0100\5J&\2\u0100/\3\2\2\2\u0101\u0102\7\7\2\2\u0102\u0103"+
		"\7\22\2\2\u0103\u0104\5N(\2\u0104\u0105\7\23\2\2\u0105\u0108\5&\24\2\u0106"+
		"\u0107\7\5\2\2\u0107\u0109\5&\24\2\u0108\u0106\3\2\2\2\u0108\u0109\3\2"+
		"\2\2\u0109\61\3\2\2\2\u010a\u010b\7\17\2\2\u010b\u010c\7\22\2\2\u010c"+
		"\u010d\5P)\2\u010d\u010e\7\23\2\2\u010e\u010f\5&\24\2\u010f\63\3\2\2\2"+
		"\u0110\u0111\7\6\2\2\u0111\u0112\7\22\2\2\u0112\u0113\5\66\34\2\u0113"+
		"\u0114\7\32\2\2\u0114\u0115\5R*\2\u0115\u0116\7\32\2\2\u0116\u0117\58"+
		"\35\2\u0117\u0118\7\23\2\2\u0118\u0119\5&\24\2\u0119\65\3\2\2\2\u011a"+
		"\u011b\78\2\2\u011b\u011c\7%\2\2\u011c\u011d\7\61\2\2\u011d\67\3\2\2\2"+
		"\u011e\u011f\78\2\2\u011f\u0120\t\5\2\2\u0120\u0121\7\61\2\2\u01219\3"+
		"\2\2\2\u0122\u0123\7\f\2\2\u0123\u0124\7\32\2\2\u0124;\3\2\2\2\u0125\u0126"+
		"\7\13\2\2\u0126\u0127\7\32\2\2\u0127=\3\2\2\2\u0128\u012a\7\n\2\2\u0129"+
		"\u012b\5J&\2\u012a\u0129\3\2\2\2\u012a\u012b\3\2\2\2\u012b\u012c\3\2\2"+
		"\2\u012c\u012d\7\32\2\2\u012d?\3\2\2\2\u012e\u012f\78\2\2\u012f\u0131"+
		"\7\22\2\2\u0130\u0132\5B\"\2\u0131\u0130\3\2\2\2\u0131\u0132\3\2\2\2\u0132"+
		"\u0133\3\2\2\2\u0133\u0134\7\23\2\2\u0134\u0135\7\32\2\2\u0135A\3\2\2"+
		"\2\u0136\u013d\5J&\2\u0137\u0138\7\30\2\2\u0138\u013a\5J&\2\u0139\u0137"+
		"\3\2\2\2\u013a\u013b\3\2\2\2\u013b\u0139\3\2\2\2\u013b\u013c\3\2\2\2\u013c"+
		"\u013e\3\2\2\2\u013d\u0139\3\2\2\2\u013d\u013e\3\2\2\2\u013eC\3\2\2\2"+
		"\u013f\u0140\7\t\2\2\u0140\u0141\5H%\2\u0141\u0142\7\32\2\2\u0142E\3\2"+
		"\2\2\u0143\u0144\7\20\2\2\u0144\u014b\5J&\2\u0145\u0146\7\30\2\2\u0146"+
		"\u0148\5J&\2\u0147\u0145\3\2\2\2\u0148\u0149\3\2\2\2\u0149\u0147\3\2\2"+
		"\2\u0149\u014a\3\2\2\2\u014a\u014c\3\2\2\2\u014b\u0147\3\2\2\2\u014b\u014c"+
		"\3\2\2\2\u014c\u014d\3\2\2\2\u014d\u014e\7\32\2\2\u014eG\3\2\2\2\u014f"+
		"\u0156\78\2\2\u0150\u0151\78\2\2\u0151\u0152\7\24\2\2\u0152\u0153\5V,"+
		"\2\u0153\u0154\7\25\2\2\u0154\u0156\3\2\2\2\u0155\u014f\3\2\2\2\u0155"+
		"\u0150\3\2\2\2\u0156I\3\2\2\2\u0157\u0161\7\65\2\2\u0158\u0161\7\61\2"+
		"\2\u0159\u0161\7\62\2\2\u015a\u0161\5H%\2\u015b\u0161\5L\'\2\u015c\u015d"+
		"\7\22\2\2\u015d\u015e\5J&\2\u015e\u015f\7\23\2\2\u015f\u0161\3\2\2\2\u0160"+
		"\u0157\3\2\2\2\u0160\u0158\3\2\2\2\u0160\u0159\3\2\2\2\u0160\u015a\3\2"+
		"\2\2\u0160\u015b\3\2\2\2\u0160\u015c\3\2\2\2\u0161\u0164\3\2\2\2\u0162"+
		"\u0163\t\6\2\2\u0163\u0165\5J&\2\u0164\u0162\3\2\2\2\u0164\u0165\3\2\2"+
		"\2\u0165K\3\2\2\2\u0166\u0167\78\2\2\u0167\u0169\7\22\2\2\u0168\u016a"+
		"\5B\"\2\u0169\u0168\3\2\2\2\u0169\u016a\3\2\2\2\u016a\u016b\3\2\2\2\u016b"+
		"\u016c\7\23\2\2\u016cM\3\2\2\2\u016d\u0176\7\61\2\2\u016e\u0176\7\62\2"+
		"\2\u016f\u0176\5H%\2\u0170\u0176\5L\'\2\u0171\u0172\7\22\2\2\u0172\u0173"+
		"\5N(\2\u0173\u0174\7\23\2\2\u0174\u0176\3\2\2\2\u0175\u016d\3\2\2\2\u0175"+
		"\u016e\3\2\2\2\u0175\u016f\3\2\2\2\u0175\u0170\3\2\2\2\u0175\u0171\3\2"+
		"\2\2\u0176\u0179\3\2\2\2\u0177\u0178\7&\2\2\u0178\u017a\5N(\2\u0179\u0177"+
		"\3\2\2\2\u0179\u017a\3\2\2\2\u017aO\3\2\2\2\u017b\u017c\5N(\2\u017cQ\3"+
		"\2\2\2\u017d\u017e\5H%\2\u017e\u017f\7&\2\2\u017f\u0180\5T+\2\u0180S\3"+
		"\2\2\2\u0181\u0189\7\61\2\2\u0182\u0189\5H%\2\u0183\u0189\5L\'\2\u0184"+
		"\u0185\7\22\2\2\u0185\u0186\5T+\2\u0186\u0187\7\23\2\2\u0187\u0189\3\2"+
		"\2\2\u0188\u0181\3\2\2\2\u0188\u0182\3\2\2\2\u0188\u0183\3\2\2\2\u0188"+
		"\u0184\3\2\2\2\u0189\u018c\3\2\2\2\u018a\u018b\7\21\2\2\u018b\u018d\5"+
		"T+\2\u018c\u018a\3\2\2\2\u018c\u018d\3\2\2\2\u018dU\3\2\2\2\u018e\u0196"+
		"\7\61\2\2\u018f\u0196\5H%\2\u0190\u0196\5L\'\2\u0191\u0192\7\22\2\2\u0192"+
		"\u0193\5V,\2\u0193\u0194\7\23\2\2\u0194\u0196\3\2\2\2\u0195\u018e\3\2"+
		"\2\2\u0195\u018f\3\2\2\2\u0195\u0190\3\2\2\2\u0195\u0191\3\2\2\2\u0196"+
		"\u0199\3\2\2\2\u0197\u0198\7\21\2\2\u0198\u019a\5V,\2\u0199\u0197\3\2"+
		"\2\2\u0199\u019a\3\2\2\2\u019aW\3\2\2\2+[_gprz\u008e\u0090\u009c\u00a0"+
		"\u00a4\u00aa\u00b0\u00b9\u00c5\u00c7\u00ce\u00d0\u00d9\u00df\u00e1\u00e6"+
		"\u00e8\u00f8\u0108\u012a\u0131\u013b\u013d\u0149\u014b\u0155\u0160\u0164"+
		"\u0169\u0175\u0179\u0188\u018c\u0195\u0199";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}