import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;

import grace.structure.DecFuncao;
import grace.structure.DecProcedimento;
import grace.structure.DecVariavel;
import grace.structure.PilhaDeTabelas;
import grace.structure.RegistroTabelaDeSimbolos;
import grace.structure.TabelaDeSimbolos;
import grace.structure.TabelaParametrosSubprogramas;
import grace.util.Categoria;
import grace.util.TipoDeDado;

public class GraceVisitorSemanticAnalysis extends GraceGrammarBaseVisitor<String> {
	public static PilhaDeTabelas pilhaDeTabelas;
	public static HashMap<String, TabelaParametrosSubprogramas> mapParametros;
	public static Integer ordemParametroAtual = 0;
	
    public static String left = "", right="", opRel="";
    public static Boolean leftOK, opRelacionalOK, rightOK;
    public static TipoDeDado retornoSubprograma;
	
    public void start(GraceGrammarParser.StartContext ctx) {
    	pilhaDeTabelas = new PilhaDeTabelas();
    	mapParametros = new HashMap<>();
        //mapRegistros = new HashMap<>();
        pilhaDeTabelas.empilhar(new TabelaDeSimbolos("global"));
        
    	visitStart(ctx);
    	
    	if(!pilhaDeTabelas.topo().getEscopo().equals("main")) {
    		System.err.println("Erro Semântico -> Funcao \"main\" nao encontrada. Deve ser declarada no final do programa.");
    	}
  	
    }
    
    @Override public String visitStart(GraceGrammarParser.StartContext ctx) { 
        ////.println("START -> " + ctx.getText());
        
        return visitChildren(ctx);
	}
    
	@Override public String visitDeclaracao(GraceGrammarParser.DeclaracaoContext ctx) { 
		////.println("DECLARACAO -> " + ctx.getText());
		
		return visitChildren(ctx); 
	}
	
	@Override public String visitDecVar(GraceGrammarParser.DecVarContext ctx) { 
		////.println("DEC VAR -> " + ctx.getText());
		
		return visitChildren(ctx); 
	}

	@Override public String visitListaSpecVars(GraceGrammarParser.ListaSpecVarsContext ctx) { 
		////.println("LISTA SPEC VARS -> " + ctx.getText());
		
		return visitChildren(ctx); 
	}

	@Override public String visitSpecVar(GraceGrammarParser.SpecVarContext ctx) { 
		////.println("SPEC VAR -> " + ctx.getText());
		
		return visitChildren(ctx); 
	}
	
	@Override public String visitSpecVarSimples(GraceGrammarParser.SpecVarSimplesContext ctx) { 
		////.println("SPEC VAR SIMPLES -> " + ctx.getText());
		
		TabelaDeSimbolos escopoAtual = pilhaDeTabelas.topo();
		
		if(!GraceRulesSemanticAnalysis.verificaExisteRegistroMesmoNome(ctx.IDENTIFIER().getText(), escopoAtual)) {
			pilhaDeTabelas.topo().adicionarRegistro(new DecVariavel(ctx.IDENTIFIER().getText(), Categoria.VARIAVEL_SIMPLES, null, null));
		} else {
			System.err.println("Erro Semântico -> Linha: " + ctx.start.getLine() + "  Coluna:" + ctx.start.getCharPositionInLine() + "\t O seguinte simbolo ja foi declarado anteriomente: " + ctx.IDENTIFIER().getText());
		}
		
		return visitChildren(ctx); 
	}
	
	@Override public String visitSpecVarSimplesIni(GraceGrammarParser.SpecVarSimplesIniContext ctx) { 
		////.println("SPEC VAR SIMPLES INI -> " + ctx.getText());
		
		TabelaDeSimbolos escopoAtual = pilhaDeTabelas.topo();
		
		if(!GraceRulesSemanticAnalysis.verificaExisteRegistroMesmoNome(ctx.IDENTIFIER().getText(), escopoAtual)) {
			pilhaDeTabelas.topo().adicionarRegistro(new DecVariavel(ctx.IDENTIFIER().getText(), Categoria.VARIAVEL_SIMPLES, null, null));
		} else {
			System.err.println("Erro Semântico -> Linha: " + ctx.start.getLine() + "  Coluna:" + ctx.start.getCharPositionInLine() + "\t O seguinte simbolo ja foi declarado anteriormente: " + ctx.IDENTIFIER().getText());
		}
		
		return visitChildren(ctx); 
	}
	
	@Override public String visitExpVarSimplesIni(GraceGrammarParser.ExpVarSimplesIniContext ctx) { 
		////.println("EXP VAR SIMPLES INI -> " + ctx.getText());
		
		LinkedList<TabelaDeSimbolos> pilha = pilhaDeTabelas.getPilha();
		DecVariavel registroVariavelAtual = (DecVariavel) pilhaDeTabelas.topo().getUltimoRegistroTabela();
		
		if(registroVariavelAtual.getValor() == null) {
			registroVariavelAtual.setValor(ctx.getText());
		} 
			
		if(ctx.variavel() != null) {
			for (int i = 0; i < pilha.size(); i++) {
				if(!GraceRulesSemanticAnalysis.verificaExisteRegistroMesmoNome(ctx.variavel().getText(), pilha.get(i))) {
					System.err.println("Erro Semântico -> Linha: " + ctx.start.getLine() + "  Coluna:" + ctx.start.getCharPositionInLine() + "\t O seguinte simbolo nao foi declarado anteriormente: " + ctx.variavel().getText());
				} else if(GraceRulesSemanticAnalysis.verificaCategoriaRegistro(ctx.variavel().getText(), pilha.get(i)) != Categoria.VARIAVEL_SIMPLES) {
					System.err.println("Erro Semântico -> Linha: " + ctx.start.getLine() + "  Coluna:" + ctx.start.getCharPositionInLine() + "\t O seguinte simbolo nao e uma entrada valida (nao e uma variavel): " + ctx.variavel().getText());
				}
			}
		} 
		
		return visitChildren(ctx); 
	}

	@Override public String visitSpecVarArranjo(GraceGrammarParser.SpecVarArranjoContext ctx) { 
		////.println("SPEC VAR ARRANJO -> " + ctx.getText());
		
		TabelaDeSimbolos escopoAtual = pilhaDeTabelas.topo();
		
		if(!GraceRulesSemanticAnalysis.verificaExisteRegistroMesmoNome(ctx.IDENTIFIER().getText(), escopoAtual)) {
			pilhaDeTabelas.topo().adicionarRegistro(new DecVariavel(ctx.IDENTIFIER().getText(), Categoria.VARIAVEL_ARRANJO, null, null));
		} else {
			System.err.println("Erro Semântico -> Linha: " + ctx.start.getLine() + "  Coluna:" + ctx.start.getCharPositionInLine() + "\t O seguinte simbolo ja foi declarado anteriomente: " + ctx.IDENTIFIER().getText());
		}
		
		return visitChildren(ctx); 
	}

	@Override public String visitSpecVarArranjoIni(GraceGrammarParser.SpecVarArranjoIniContext ctx) { 
		////.println("SPEC VAR ARRANJO INI -> " + ctx.getText());
		
		TabelaDeSimbolos escopoAtual = pilhaDeTabelas.topo();
		
		if(!GraceRulesSemanticAnalysis.verificaExisteRegistroMesmoNome(ctx.IDENTIFIER().getText(), escopoAtual)) {
			pilhaDeTabelas.topo().adicionarRegistro(new DecVariavel(ctx.IDENTIFIER().getText(), Categoria.VARIAVEL_ARRANJO, null, null));
		} else {
			System.err.println("Erro Semântico -> Linha: " + ctx.start.getLine() + "  Coluna:" + ctx.start.getCharPositionInLine() + "\t O seguinte simbolo ja foi declarado anteriomente: " + ctx.IDENTIFIER().getText());
		}
		
		return visitChildren(ctx); 
	}
	
	@Override public String visitExpVarArranjoIni(GraceGrammarParser.ExpVarArranjoIniContext ctx) { 
		////.println("EXP VAR ARRANJO INI -> " + ctx.getText());
		
		DecVariavel registroVariavelAtual = (DecVariavel) pilhaDeTabelas.topo().getUltimoRegistroTabela();
		
		if(registroVariavelAtual.getValor() == null) {
			registroVariavelAtual.setValor(ctx.getText());
		} 
			
		return visitChildren(ctx); 
	}

	@Override public String visitMemoriaReservada(GraceGrammarParser.MemoriaReservadaContext ctx) { 
		////.println("MEMORIA RESERVADA -> " + ctx.getText());
		
		return visitChildren(ctx); 
	}
	
	@Override public String visitDecSub(GraceGrammarParser.DecSubContext ctx) { 
		////.println("DEC SUB -> " + ctx.getText());
		
		return visitChildren(ctx); 
	}

	@Override public String visitDecProc(GraceGrammarParser.DecProcContext ctx) {
		////.println("DEC PROC -> " + ctx.getText());
		
		TabelaDeSimbolos escopoAtual = pilhaDeTabelas.topo();
		
		if(!GraceRulesSemanticAnalysis.verificaExisteRegistroMesmoNome(ctx.IDENTIFIER().getText(), escopoAtual)) {
			pilhaDeTabelas.topo().adicionarRegistro(new DecProcedimento(ctx.IDENTIFIER().getText(), Categoria.PROCEDIMENTO, null));
		} else {
			System.err.println("Erro Semântico -> Linha: " + ctx.start.getLine() + "  Coluna:" + ctx.start.getCharPositionInLine() + "\t O seguinte procedimento ja foi declarado anteriomente: " + ctx.IDENTIFIER().getText());
		}
		
		mapParametros.put(ctx.IDENTIFIER().getText(), new TabelaParametrosSubprogramas());
		
		return visitChildren(ctx); 
	}
	
	@Override public String visitDecFunc(GraceGrammarParser.DecFuncContext ctx) {
		////.println("DEC FUNC -> " + ctx.getText());
		
		TabelaDeSimbolos escopoAtual = pilhaDeTabelas.topo();
		
		if(!GraceRulesSemanticAnalysis.verificaExisteRegistroMesmoNome(ctx.IDENTIFIER().getText(), escopoAtual)) {
			TipoDeDado tipoRetorno = null;
			
			if(ctx.tipo().getText().equals(TipoDeDado.INT.toString())) {
				tipoRetorno = TipoDeDado.INT;
			} else if(ctx.tipo().getText().equals(TipoDeDado.BOOL.toString())) {
				tipoRetorno = TipoDeDado.BOOL;
			} else {
				tipoRetorno = TipoDeDado.STRING;
			} 
			pilhaDeTabelas.topo().adicionarRegistro(new DecFuncao(ctx.IDENTIFIER().getText(), Categoria.PROCEDIMENTO, tipoRetorno, null));
		} else {
			System.err.println("Erro Semântico -> Linha: " + ctx.start.getLine() + "  Coluna:" + ctx.start.getCharPositionInLine() + "\t A seguinte funcao ja foi declarado anteriomente: " + ctx.IDENTIFIER().getText());
		}
		
		mapParametros.put(ctx.IDENTIFIER().getText(), new TabelaParametrosSubprogramas());
		
		return visitChildren(ctx); 
	}

	@Override public String visitListaParametros(GraceGrammarParser.ListaParametrosContext ctx) { 
		////.println("LISTA PARAMETROS -> " + ctx.getText());
		
		return visitChildren(ctx); 
	}
	
	@Override public String visitSpecParam(GraceGrammarParser.SpecParamContext ctx) {
		////.println("SPEC PARAM -> " + ctx.getText());
		
		TabelaDeSimbolos escopoAtual = pilhaDeTabelas.topo();
		TabelaParametrosSubprogramas parametrosSubprograma = mapParametros.get(escopoAtual.getUltimoRegistroTabela().getCadeia());
		
		TipoDeDado tipoParam = null;
		switch (ctx.tipo().getText()) {
		case "int":
			tipoParam = TipoDeDado.INT;
			break;
		case "bool":
			tipoParam = TipoDeDado.BOOL;
			break;
		case "string":
			tipoParam = TipoDeDado.STRING;
			break;
		}
		
		for(int i=0;i<ctx.param().size();i++) {
			parametrosSubprograma.getParametros().get(tipoParam).add(ctx.param(i).getText());
			parametrosSubprograma.getOrdemParametros().add(tipoParam);
		}
		
		return visitChildren(ctx); 
	}

	@Override public String visitParam(GraceGrammarParser.ParamContext ctx) { 
		////.println("PARAM -> " + ctx.getText());
		
		return visitChildren(ctx); 
	}
	
	@Override public String visitTipo(GraceGrammarParser.TipoContext ctx) { 
		////.println("TIPO -> " + ctx.getText());
		
		List<RegistroTabelaDeSimbolos> registrosEscopoAtual = pilhaDeTabelas.topo().getRegistros();
		TipoDeDado tipoDeDadoAtual = null;
		
		switch (ctx.getText()) {
		case "int":
			tipoDeDadoAtual = TipoDeDado.INT;
			break;
		case "bool":
			tipoDeDadoAtual = TipoDeDado.BOOL;
			break;
		case "string":
			tipoDeDadoAtual = TipoDeDado.STRING;
			break;
		}
		
		//.println(tipoDeDadoAtual);
		
		switch (ctx.getParent().getRuleIndex()) {
		case GraceGrammarParser.RULE_decVar:	
			//.println("DECL VAR");
			for(RegistroTabelaDeSimbolos registro: registrosEscopoAtual) {
				if(registro instanceof DecVariavel) {
					DecVariavel registroVar = (DecVariavel) registro;
					if(registroVar.getTipoDeDado() == null) {
						if(registroVar.getValor() != null) {
							TipoDeDado tipoEncontrado = GraceRulesSemanticAnalysis.verificaVariavelInicializadaComTipoCorreto(registroVar.getValor(), tipoDeDadoAtual, registroVar.getCategoria());

							if(tipoEncontrado != null && tipoEncontrado.equals(tipoDeDadoAtual)) {
								registroVar.setTipoDeDado(tipoDeDadoAtual); 
							} else {
								registroVar.setTipoDeDado(tipoEncontrado);
								System.err.println("Erro Semântico -> Linha: " + ctx.start.getLine() + "  Coluna:" + ctx.start.getCharPositionInLine() + "\t Tipo incompativel. Esperado tipo " + tipoDeDadoAtual.toString() + " em " + registroVar.getCadeia() + "=" + registroVar.getValor());
							}
						
						} else {
							registroVar.setTipoDeDado(tipoDeDadoAtual); 
						} 
					}
				}
				
			}
			break;
		case GraceGrammarParser.RULE_decFunc:
			//.println("DECL FUN");
			retornoSubprograma = tipoDeDadoAtual;
			for(RegistroTabelaDeSimbolos registro: registrosEscopoAtual) {
				if(registro instanceof DecFuncao) {
					DecFuncao registroFunc = (DecFuncao) registro;
					if(registroFunc.getTipoRetorno() == null) {
						registroFunc.setTipoRetorno(tipoDeDadoAtual);
					}
				}
				
			}
			if(pilhaDeTabelas.topo().getUltimoRegistroTabela().getCadeia().equals("main")) {
				if(!tipoDeDadoAtual.equals(TipoDeDado.INT)) {
					System.err.println("Erro Semântico -> Linha: " + ctx.start.getLine() + "  Coluna:" + ctx.start.getCharPositionInLine() + "\t A funcao main deve retornar o tipo int.");
				}
			}
			break;
		case GraceGrammarParser.RULE_specParam:
			//.println("SPEC PARAM");
			
			break;
		}
		
		return visitChildren(ctx);
	}
	
	@Override public String visitCmdChamadaProc(GraceGrammarParser.CmdChamadaProcContext ctx) { 
		////.println("CMD CHAMADA PROC -> " + ctx.getText());
		
		String nomeProcedimento = ctx.IDENTIFIER().getText();
		
		if(!GraceRulesSemanticAnalysis.verificaSeExisteSubprograma(nomeProcedimento)) {
			System.err.println("Erro Semântico -> Linha: " + ctx.start.getLine() + "  Coluna:" + ctx.start.getCharPositionInLine() + "\t A chamada \"" + nomeProcedimento + "\" nao foi declarada.");
		} else {
			if(GraceRulesSemanticAnalysis.subprogramaTemParametros(nomeProcedimento)) {
				if(ctx.listaExpressao() == null) {
					System.err.println("Erro Semântico -> Linha: " + ctx.start.getLine() + "  Coluna:" + ctx.start.getCharPositionInLine() + "\t A chamada \"" + nomeProcedimento + "\" necessita de parametros.");
				}
			}
		}
		
		return visitChildren(ctx); 
	}
	
	@Override public String visitListaExpressao(GraceGrammarParser.ListaExpressaoContext ctx) { 
		////.println("LISTA EXPRESSAO -> " + ctx.getText());
		
		ordemParametroAtual = 0;
		
		if(ctx.expressao().size() < mapParametros.get(ctx.getParent().getChild(0).getText()).getOrdemParametros().size()) {
			System.err.println("Erro Semântico -> Linha: " + ctx.start.getLine() + "  Coluna:" + ctx.start.getCharPositionInLine() + "\t A chamada de procedimento \"" + ctx.getParent().getChild(0).getText() + "\" espera " + mapParametros.get(ctx.getParent().getChild(0).getText()).getOrdemParametros().size() + " parametros, mas so recebe " + ctx.expressao().size());
		}
		
		return visitChildren(ctx); 
		
	}
	
	@Override public String visitChamadaFuncao(GraceGrammarParser.ChamadaFuncaoContext ctx) { 
		////.println("CHAMADA FUNCAO -> " + ctx.getText());
		
		String nomeFuncao = ctx.IDENTIFIER().getText();
		
		if(!GraceRulesSemanticAnalysis.verificaSeExisteSubprograma(nomeFuncao)) {
			System.err.println("Erro Semântico -> Linha: " + ctx.start.getLine() + "  Coluna:" + ctx.start.getCharPositionInLine() + "\t A chamada \"" + nomeFuncao + "\" nao foi declarada.");
		} else {
			if(GraceRulesSemanticAnalysis.subprogramaTemParametros(nomeFuncao)) {
				if(ctx.listaExpressao() == null) {
					System.err.println("Erro Semântico -> Linha: " + ctx.start.getLine() + "  Coluna:" + ctx.start.getCharPositionInLine() + "\t A chamada \"" + nomeFuncao + "\" necessita de parametros.");
				}
			}
		}
		
		return visitChildren(ctx); 
	}
	
	@Override public String visitComando(GraceGrammarParser.ComandoContext ctx) { 
		////.println("COMANDO -> " + ctx.getText());
		
		return visitChildren(ctx); 
	}

	@Override public String visitCmdSimples(GraceGrammarParser.CmdSimplesContext ctx) { 
		////.println("CMD SIMPLES -> " + ctx.getText());
		
		return visitChildren(ctx); 
	}
	
	@Override public String visitCmdIf(GraceGrammarParser.CmdIfContext ctx) { 
		////.println("CMD IF -> " + ctx.getText());
		
		left = "";
		right= "";
		opRel= "";

		return visitChildren(ctx); 
	}

	@Override public String visitCmdWhile(GraceGrammarParser.CmdWhileContext ctx) { 
		////.println("CMD WHILE -> " + ctx.getText());
		
		left = "";
		right= "";
		opRel= "";
		
		return visitChildren(ctx); 
	}
	
	@Override public String visitCmdFor(GraceGrammarParser.CmdForContext ctx) { 
		////.println("CMD FOR -> " + ctx.getText());
		
		left = "";
		right= "";
		opRel= "";
		
		return visitChildren(ctx); 
	}
	
	@Override public String visitCmdStop(GraceGrammarParser.CmdStopContext ctx) { 
		////.println("CMD STOP -> " + ctx.getText());
		
		if(!pilhaDeTabelas.topo().getEscopo().equals("CMD WHILE") || !pilhaDeTabelas.topo().getEscopo().equals("CMD FOR")) {
			System.err.println("Erro Semântico -> Linha: " + ctx.start.getLine() + "  Coluna:" + ctx.start.getCharPositionInLine() + "\t O comando stop deve estar dentro de um laco while ou for.");
		}
		
		return visitChildren(ctx); 
	}

	@Override public String visitCmdSkip(GraceGrammarParser.CmdSkipContext ctx) { 
		////.println("CMD SKIP -> " + ctx.getText());
		
		if(!pilhaDeTabelas.topo().getEscopo().equals("CMD WHILE") || !pilhaDeTabelas.topo().getEscopo().equals("CMD FOR")) {
			System.err.println("Erro Semântico -> Linha: " + ctx.start.getLine() + "  Coluna:" + ctx.start.getCharPositionInLine() + "\t O comando skip deve estar dentro de um laco while ou for.");
		}
		
		return visitChildren(ctx); 
	}
	
	@Override public String visitCmdReturn(GraceGrammarParser.CmdReturnContext ctx) { 
		////.println("CMD RETURN -> " + ctx.getText());
				
		if(ctx.getParent().getParent().getRuleIndex() == GraceGrammarParser.RULE_decProc) {
			if(ctx.expressao() != null) {
				System.err.println("Erro Semântico -> Linha: " + ctx.start.getLine() + "  Coluna:" + ctx.start.getCharPositionInLine() + "\t O comando return de um procedimento nao deve retornar valores.");
			}
		} else if(ctx.getParent().getParent().getRuleIndex() == GraceGrammarParser.RULE_decFunc) {
			if(ctx.expressao() == null) {
				System.err.println("Erro Semântico -> Linha: " + ctx.start.getLine() + "  Coluna:" + ctx.start.getCharPositionInLine() + "\t O comando return de uma funcao deve retornar valor.");
			} else if(GraceRulesSemanticAnalysis.isRetornoIgualDeclarado(ctx.expressao().getText(), retornoSubprograma)) {
				System.err.println("Erro Semântico -> Linha: " + ctx.start.getLine() + "  Coluna:" + ctx.start.getCharPositionInLine() + "\t O valor de retorno e diferente do declarado.");
			}
		} else {
			System.err.println("Erro Semântico -> Linha: " + ctx.start.getLine() + "  Coluna:" + ctx.start.getCharPositionInLine() + "\t O comando return deve estar dentro de um procedimento ou funcao.");
		}
		
		return visitChildren(ctx); 
	}
	
	@Override public String visitCmdRead(GraceGrammarParser.CmdReadContext ctx) { 
		////.println("CMD READ -> " + ctx.getText());
		
		String varToRead = ctx.variavel().getText();
		if(!GraceRulesSemanticAnalysis.variavelReadDeclarada(varToRead)) {
			System.err.println("Erro Semântico -> Linha: " + ctx.start.getLine() + "  Coluna:" + ctx.start.getCharPositionInLine() + "\t O simbolo \"" + varToRead + "\" nao foi declarado.");
		}
		
		return visitChildren(ctx); 
	}
	
	@Override public String visitCmdWrite(GraceGrammarParser.CmdWriteContext ctx) { 
		////.println("CMD WRITE -> " + ctx.getText());
		
		return visitChildren(ctx); 
	}
	
	@Override public String visitBloco(GraceGrammarParser.BlocoContext ctx) { 
		////.println("BLOCO -> " + ctx.getText());
		
		switch (ctx.getParent().getRuleIndex()) {
		case GraceGrammarParser.RULE_decProc:	
			//.println("Decl. PROCEDIMENTO");
			pilhaDeTabelas.empilhar(new TabelaDeSimbolos(ctx.getParent().getChild(1).getText()));
			break;
		case GraceGrammarParser.RULE_decFunc:
			//.println("Decl. FUNCAO");
			pilhaDeTabelas.empilhar(new TabelaDeSimbolos(ctx.getParent().getChild(1).getText()));
			break;
		case GraceGrammarParser.RULE_cmdIf:
			//.println("Comando IF");
			pilhaDeTabelas.empilhar(new TabelaDeSimbolos("CMD IF"));
			break;
		case GraceGrammarParser.RULE_cmdWhile:
			//.println("Comando WHILE");
			pilhaDeTabelas.empilhar(new TabelaDeSimbolos("CMD WHILE"));
			break;
		case GraceGrammarParser.RULE_cmdFor:
			//.println("Comando FOR");
			pilhaDeTabelas.empilhar(new TabelaDeSimbolos("CMD FOR"));
			break;
		}
		
		return visitChildren(ctx); 
	}

	@Override public String visitExpressao(GraceGrammarParser.ExpressaoContext ctx) { 
		////.println("EXPRESSAO -> " + ctx.getText());

		switch (ctx.getParent().getRuleIndex()) {
		case GraceGrammarParser.RULE_atrib:	
			//.println("ATRIBUICAO");
			break;
			
		case GraceGrammarParser.RULE_cmdIf:
			//.println("Comando IF");
			
			left = ctx.getChild(0).getText();
			opRel = ctx.OP_EXPRESSAO().getText();
			right = ctx.getChild(2).getText();

			if(!GraceRulesSemanticAnalysis.verificaExpressaoCondicionalCorreta(left, opRel, right)) {
				if(!leftOK)
					System.err.println("Erro Semântico -> Linha: " + ctx.start.getLine() + "  Coluna:" + ctx.start.getCharPositionInLine() + "\t A expressao nao e valida. Variavel \"" + left + "\" nao esta definida ou nao e do tipo inteiro");
				if(!opRelacionalOK)
					System.err.println("Erro Semântico -> Linha: " + ctx.start.getLine() + "  Coluna:" + ctx.start.getCharPositionInLine() + "\t A expressao nao e valida. O resultado deve ser logico");
				if(!rightOK)
					System.err.println("Erro Semântico -> Linha: " + ctx.start.getLine() + "  Coluna:" + ctx.start.getCharPositionInLine() + "\t A expressao nao e valida. Variavel \"" + right + "\" nao esta definida ou nao e do tipo inteiro");
			}
			
			break;
		case GraceGrammarParser.RULE_cmdWhile:
			//.println("Comando WHILE");
			
			left = ctx.getChild(0).getText();
			opRel = ctx.OP_EXPRESSAO().getText();
			right = ctx.getChild(2).getText();

			if(!GraceRulesSemanticAnalysis.verificaExpressaoCondicionalCorreta(left, opRel, right)) {
				if(!leftOK)
					System.err.println("Erro Semântico -> Linha: " + ctx.start.getLine() + "  Coluna:" + ctx.start.getCharPositionInLine() + "\t A expressao nao e valida. Variavel \"" + left + "\" nao esta definida ou nao e do tipo inteiro");
				if(!opRelacionalOK)
					System.err.println("Erro Semântico -> Linha: " + ctx.start.getLine() + "  Coluna:" + ctx.start.getCharPositionInLine() + "\t A expressao nao e valida. O resultado deve ser logico");
				if(!rightOK)
					System.err.println("Erro Semântico -> Linha: " + ctx.start.getLine() + "  Coluna:" + ctx.start.getCharPositionInLine() + "\t A expressao nao e valida. Variavel \"" + right + "\" nao esta definida ou nao e do tipo inteiro");
			}
			
			break;
		case GraceGrammarParser.RULE_cmdFor:
			//.println("Comando FOR");
			
			left = ctx.getChild(0).getText();
			opRel = ctx.OP_EXPRESSAO().getText();
			right = ctx.getChild(2).getText();

			if(!GraceRulesSemanticAnalysis.verificaExpressaoCondicionalCorreta(left, opRel, right)) {
				if(!leftOK)
					System.err.println("Erro Semântico -> Linha: " + ctx.start.getLine() + "  Coluna:" + ctx.start.getCharPositionInLine() + "\t A expressao nao e valida. Variavel \"" + left + "\" nao esta definida ou nao e do tipo inteiro");
				if(!opRelacionalOK)
					System.err.println("Erro Semântico -> Linha: " + ctx.start.getLine() + "  Coluna:" + ctx.start.getCharPositionInLine() + "\t A expressao nao e valida. O resultado deve ser logico");
				if(!rightOK)
					System.err.println("Erro Semântico -> Linha: " + ctx.start.getLine() + "  Coluna:" + ctx.start.getCharPositionInLine() + "\t A expressao nao e valida. Variavel \"" + right + "\" nao esta definida ou nao e do tipo inteiro");
			}
			
			break;
		case GraceGrammarParser.RULE_cmdReturn:
			//.println("Comando RETURN");
			break;
		case GraceGrammarParser.RULE_listaExpressao:
			//.println("Lista de Expressao");
			
			if(!GraceRulesSemanticAnalysis.tipoParametroNaOrdemCorreta(ctx.getText(), ordemParametroAtual, ctx.getParent().getChild(0).getText())) {
				System.err.println("Erro Semântico -> Linha: " + ctx.start.getLine() + "  Coluna:" + ctx.start.getCharPositionInLine() + "\t O parametro \"" + ctx.getText() + "\" nao tem o tipo correto esperado.");
			}
			
			ordemParametroAtual++;
			
			break;
		case GraceGrammarParser.RULE_cmdWrite:
			//.println("Comando WRITE");
			break;
		case GraceGrammarParser.RULE_variavel:
			//.println("Variavel");
			break;
		default:
			break;
		}
		
		return visitChildren(ctx); 
	}
	
	@Override public String visitCmdAtrib(GraceGrammarParser.CmdAtribContext ctx) { 
		////.println("CMD ATRIB -> " + ctx.getText());
		
		return visitChildren(ctx); 
	}
	
	@Override public String visitAtrib(GraceGrammarParser.AtribContext ctx) { 
		////.println("ATRIB -> " + ctx.getText());
		
		if(!GraceRulesSemanticAnalysis.isVariavelDeclarada(ctx.variavel().getText(), null)) {
			System.err.println("Erro Semântico -> Linha: " + ctx.start.getLine() + "  Coluna:" + ctx.start.getCharPositionInLine() + "\t A variavel " + ctx.variavel().getText() + " nao esta declarada.");
		} 
		TipoDeDado tipoVar = null;
		LinkedList<TabelaDeSimbolos> pilha = GraceVisitorSemanticAnalysis.pilhaDeTabelas.getPilha();
		
		for (int i = 0; i < pilha.size(); i++) {
			if(pilha.get(i).existeSimbolo(ctx.expressao().getText())) {	
				if(pilha.get(i).getRegistro(ctx.expressao().getText()) instanceof DecVariavel) {
					DecVariavel registroVar = (DecVariavel) pilha.get(i).getRegistro(ctx.expressao().getText());
					tipoVar = registroVar.getTipoDeDado();
				}
			}
		}
		
		if(!GraceRulesSemanticAnalysis.verificaVariavelInicializadaComTipoCorreto(ctx.expressao().getText(), tipoVar, Categoria.VARIAVEL_SIMPLES).equals(tipoVar)) {
			System.err.println("Erro Semântico -> Linha: " + ctx.start.getLine() + "  Coluna:" + ctx.start.getCharPositionInLine() + "\t A variavel " + ctx.variavel().getText() + " deve receber o mesmo valor declarado.");
		}
		
		return visitChildren(ctx); 
	}

	@Override public String visitAtribIni(GraceGrammarParser.AtribIniContext ctx) { 
		////.println("ATRIB INI -> " + ctx.getText());
		return visitChildren(ctx); 
	}

	@Override public String visitAtribPasso(GraceGrammarParser.AtribPassoContext ctx) {
		////.println("ATRIB PASSO -> " + ctx.getText());
		return visitChildren(ctx); 
	}
	
	@Override public String visitVariavel(GraceGrammarParser.VariavelContext ctx) {
		////.println("VARIAVEL -> " + ctx.getText());

		return visitChildren(ctx); 
	}
	
	
}
