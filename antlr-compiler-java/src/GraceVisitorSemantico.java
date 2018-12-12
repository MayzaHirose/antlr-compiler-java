import java.util.HashMap;
import java.util.List;

import compiler.util.Categoria;
import compiler.util.TipoDeDado;

public class GraceVisitorSemantico extends GraceBaseVisitor<String> {
	public static PilhaDeTabelas pilhaDeTabelas;
	public static HashMap<String, ParametroFunProc> mapParametros;
    public static String left = "",right="",opRel="";
    public static Boolean leftOK, opRelacionalOK, rightOK;
    public static Boolean isParametroSubprograma = Boolean.FALSE;
	
    public void start(GraceParser.StartContext ctx) {
    	pilhaDeTabelas = new PilhaDeTabelas();
    	mapParametros = new HashMap<>();
        //mapRegistros = new HashMap<>();
        pilhaDeTabelas.empilhar(new TabelaDeSimbolos("global"));
        
    	visitStart(ctx);
    	
    	if(!pilhaDeTabelas.topo().getEscopo().equals("main")) {
    		System.err.println("Erro Semântico -> Funcao \"main\" nao encontrada. Deve ser declarada no final do programa.");
    	}
  	
    }
    
    @Override public String visitStart(GraceParser.StartContext ctx) { 
        //System.out.println("START -> " + ctx.getText());
        
        return visitChildren(ctx);
	}
    
	@Override public String visitDeclaracao(GraceParser.DeclaracaoContext ctx) { 
		//System.out.println("DECLARACAO -> " + ctx.getText());
		
		return visitChildren(ctx); 
	}
	
	@Override public String visitDecVar(GraceParser.DecVarContext ctx) { 
		//System.out.println("DEC VAR -> " + ctx.getText());
		
		return visitChildren(ctx); 
	}

	@Override public String visitListaSpecVars(GraceParser.ListaSpecVarsContext ctx) { 
		//System.out.println("LISTA SPEC VARS -> " + ctx.getText());
		
		return visitChildren(ctx); 
	}

	@Override public String visitSpecVar(GraceParser.SpecVarContext ctx) { 
		//System.out.println("SPEC VAR -> " + ctx.getText());
		
		return visitChildren(ctx); 
	}
	
	@Override public String visitSpecVarSimples(GraceParser.SpecVarSimplesContext ctx) { 
		//System.out.println("SPEC VAR SIMPLES -> " + ctx.getText());
		
		TabelaDeSimbolos tabelaDeSimbolos = pilhaDeTabelas.topo();
		if(!GraceSemanticRules.verificaExisteVariavelMesmoNome(ctx.getText(), tabelaDeSimbolos)) {
			pilhaDeTabelas.topo().adicionarSimbolo(ctx.getText(), Categoria.VARIAVEL_SIMPLES, null, null);
		} else {
			System.err.println("Erro Semântico -> Linha: " + ctx.start.getLine() + "  Coluna:" + ctx.start.getCharPositionInLine() + "\t O seguinte simbolo ja foi declarado anteriomente: " + ctx.getText());
		}
		return visitChildren(ctx); 
	}
	
	@Override public String visitSpecVarSimplesIni(GraceParser.SpecVarSimplesIniContext ctx) { 
		//System.out.println("SPEC VAR SIMPLES INI -> " + ctx.getText());
		
		TabelaDeSimbolos tabelaDeSimbolos = pilhaDeTabelas.topo();
		if(!GraceSemanticRules.verificaExisteVariavelMesmoNome(ctx.IDENTIFIER().getText(), tabelaDeSimbolos)) {
			pilhaDeTabelas.topo().adicionarSimbolo(ctx.IDENTIFIER().getText(), Categoria.VARIAVEL_SIMPLES, null, null);
		} else {
			System.err.println("Erro Semântico -> Linha: " + ctx.start.getLine() + "  Coluna:" + ctx.start.getCharPositionInLine() + "\t O seguinte simbolo ja foi declarado anteriormente: " + ctx.IDENTIFIER().getText());
		}
		return visitChildren(ctx); 
	}
	
	@Override public String visitExpVarSimplesIni(GraceParser.ExpVarSimplesIniContext ctx) { 
		//System.out.println("EXP VAR SIMPLES INI -> " + ctx.getText());
		
		List<EntradaTabelaDeSimbolos> listaDeSimbolos = pilhaDeTabelas.topo().getListaSimbolos();
		EntradaTabelaDeSimbolos simboloContexto = listaDeSimbolos.get(listaDeSimbolos.size()-1);
		for(int i=0;i<ctx.getChildCount()-1;i++) {	
			if(simboloContexto.getValor() == null) {
				simboloContexto.setValor(ctx.getChild(i).getText());
			} else {
				simboloContexto.setValor(simboloContexto.getValor()+ctx.getChild(i).getText());
			}
		}
		if(ctx.getChildCount() == 1) {
			if(ctx.variavel() != null) {
				if(GraceSemanticRules.verificaExisteVariavelMesmoNome(ctx.variavel().getText(), pilhaDeTabelas.topo())) {
					if(simboloContexto.getValor() == null) {
						simboloContexto.setValor(ctx.variavel().getText());
					} else {
						simboloContexto.setValor(simboloContexto.getValor()+ctx.variavel().getText());
					}
				} else {
					System.err.println("Erro Semântico -> Linha: " + ctx.start.getLine() + "  Coluna:" + ctx.start.getCharPositionInLine() + "\t O seguinte simbolo nao foi declarado anteriormente: " + ctx.variavel().getText());
				}
			} else {
				if(simboloContexto.getValor() == null) {
					simboloContexto.setValor(ctx.getText());
				} else {
					simboloContexto.setValor(simboloContexto.getValor()+ctx.getText());
				}
			}
		}
		return visitChildren(ctx); 
	}

	@Override public String visitSpecVarArranjo(GraceParser.SpecVarArranjoContext ctx) { 
		//System.out.println("SPEC VAR ARRANJO -> " + ctx.getText());
		
		TabelaDeSimbolos tabelaDeSimbolos = pilhaDeTabelas.topo();
		if(!GraceSemanticRules.verificaExisteVariavelMesmoNome(ctx.IDENTIFIER().getText(), tabelaDeSimbolos)) {
			pilhaDeTabelas.topo().adicionarSimbolo(ctx.IDENTIFIER().getText(), Categoria.VARIAVEL_ARRANJO, null, null);
		} else {
			System.err.println("Erro Semântico -> Linha: " + ctx.start.getLine() + "  Coluna:" + ctx.start.getCharPositionInLine() + "\t O seguinte simbolo ja foi declarado anteriormente: " + ctx.IDENTIFIER().getText());
		}
		return visitChildren(ctx); 
	}

	@Override public String visitSpecVarArranjoIni(GraceParser.SpecVarArranjoIniContext ctx) { 
		//System.out.println("SPEC VAR ARRANJO INI -> " + ctx.getText());
		
		TabelaDeSimbolos tabelaDeSimbolos = pilhaDeTabelas.topo();
		if(!GraceSemanticRules.verificaExisteVariavelMesmoNome(ctx.IDENTIFIER().getText(), tabelaDeSimbolos)) {
			pilhaDeTabelas.topo().adicionarSimbolo(ctx.IDENTIFIER().getText(), Categoria.VARIAVEL_ARRANJO, null, null); 
		} else {
			System.err.println("Erro Semântico -> Linha: " + ctx.start.getLine() + "  Coluna:" + ctx.start.getCharPositionInLine() + "\t O seguinte simbolo ja foi declarado anteriormente: " + ctx.IDENTIFIER().getText());
		}
		return visitChildren(ctx);
	}
	
	@Override public String visitExpVarArranjoIni(GraceParser.ExpVarArranjoIniContext ctx) { 
		//System.out.println("EXP VAR ARRANJO INI -> " + ctx.getText());
		
		List<EntradaTabelaDeSimbolos> listaDeSimbolos = pilhaDeTabelas.topo().getListaSimbolos();
		EntradaTabelaDeSimbolos simboloContexto = listaDeSimbolos.get(listaDeSimbolos.size()-1);
		for(int i=0;i<ctx.getChildCount();i++) {	
			if(simboloContexto.getValor() == null) {
				simboloContexto.setValor(ctx.getChild(i).getText());
			} else {
				simboloContexto.setValor(simboloContexto.getValor()+ctx.getChild(i).getText());
			}
		}
		
		return visitChildren(ctx); 
	}

	@Override public String visitMemoriaReservada(GraceParser.MemoriaReservadaContext ctx) { 
		//System.out.println("MEMORIA RESERVADA -> " + ctx.getText());
		
		return visitChildren(ctx); 
	}
	
	@Override public String visitTipo(GraceParser.TipoContext ctx) { 
		//System.out.println("TIPO -> " + ctx.getText());
		
		List<EntradaTabelaDeSimbolos> listaDeSimbolosEscopoAtual = pilhaDeTabelas.topo().getListaSimbolos();
		for(EntradaTabelaDeSimbolos simbolo: listaDeSimbolosEscopoAtual) {
			if(simbolo.getTipoDeDado() == null) {
				switch (ctx.getText()) {
				case "bool":
					// se o simbolo foi inicializado. Senao o simbolo nao foi inicializado, e ele pode ser de qlq tipo
					if(simbolo.getValor() != null) {
						TipoDeDado tipoEncontrado = GraceSemanticRules.verificaVariavelInicializadaComTipoCorreto(simbolo.getValor(), TipoDeDado.BOOL, simbolo.getCategoria());
						if(tipoEncontrado.equals(TipoDeDado.BOOL)) {
							simbolo.setTipoDeDado(TipoDeDado.BOOL); 
						} else {
							simbolo.setTipoDeDado(tipoEncontrado);
							System.err.println("Erro Semântico -> Linha: " + ctx.start.getLine() + "  Coluna:" + ctx.start.getCharPositionInLine() + "\t Tipo incompativel. Esperado tipo bool. Encontrado " + tipoEncontrado.toString() + " em " + simbolo.getCadeia() + "=" + simbolo.getValor());
						}
					} else {
						simbolo.setTipoDeDado(TipoDeDado.BOOL); 
					}
					break;
				case "int":
					// se o simbolo foi inicializado. Senao o simbolo nao foi inicializado, e ele pode ser de qlq tipo
					if(simbolo.getValor() != null) {
						TipoDeDado tipoEncontrado = GraceSemanticRules.verificaVariavelInicializadaComTipoCorreto(simbolo.getValor(), TipoDeDado.INT, simbolo.getCategoria());
						if(tipoEncontrado.equals(TipoDeDado.INT)) {
							simbolo.setTipoDeDado(TipoDeDado.INT);
						} else {
							simbolo.setTipoDeDado(tipoEncontrado);
							System.err.println("Erro Semântico -> Linha: " + ctx.start.getLine() + "  Coluna:" + ctx.start.getCharPositionInLine() + "\t Tipo incompativel. Esperado tipo int. Encontrado " + tipoEncontrado.toString() + " em " + simbolo.getCadeia() + "=" + simbolo.getValor());
						}
					} else {
						simbolo.setTipoDeDado(TipoDeDado.INT); 
					}
					break;
				case "string":
					// se o simbolo foi inicializado. Senao o simbolo nao foi inicializado, e ele pode ser de qlq tipo
					if(simbolo.getValor() != null) {
						TipoDeDado tipoEncontrado = GraceSemanticRules.verificaVariavelInicializadaComTipoCorreto(simbolo.getValor(), TipoDeDado.STRING, simbolo.getCategoria());
						if(tipoEncontrado.equals(TipoDeDado.STRING)) {
							simbolo.setTipoDeDado(TipoDeDado.STRING);
						} else {
							simbolo.setTipoDeDado(tipoEncontrado);
							System.err.println("Erro Semântico -> Linha: " + ctx.start.getLine() + "  Coluna:" + ctx.start.getCharPositionInLine() + "\t Tipo incompativel. Esperado tipo string. Encontrado " + tipoEncontrado.toString() + " em " + simbolo.getCadeia() + "=" + simbolo.getValor());
						}
					} else {
						simbolo.setTipoDeDado(TipoDeDado.STRING); 
					}
					break;
				}
			}
		}

		return visitChildren(ctx);
	}
	
	@Override public String visitDecSub(GraceParser.DecSubContext ctx) { 
		//System.out.println("DEC SUB -> " + ctx.getText());
		
		return visitChildren(ctx); 
	}

	@Override public String visitDecProc(GraceParser.DecProcContext ctx) {
		//System.out.println("DEC PROC -> " + ctx.getText());
		
		pilhaDeTabelas.topo().adicionarSimbolo(ctx.IDENTIFIER().getText(), Categoria.PROCEDIMENTO, TipoDeDado.VAZIO, null);
		mapParametros.put(ctx.IDENTIFIER().getText(), new ParametroFunProc());
		pilhaDeTabelas.empilhar(new TabelaDeSimbolos(ctx.IDENTIFIER().getText()));
		
		return visitChildren(ctx); 
	}
	
	@Override public String visitDecFunc(GraceParser.DecFuncContext ctx) {
		//System.out.println("DEC FUNC -> " + ctx.getText());
		
		pilhaDeTabelas.topo().adicionarSimbolo(ctx.IDENTIFIER().getText(), Categoria.FUNCAO, null, null);
		mapParametros.put(ctx.IDENTIFIER().getText(), new ParametroFunProc());
		pilhaDeTabelas.empilhar(new TabelaDeSimbolos(ctx.IDENTIFIER().getText()));
		
		return visitChildren(ctx); 
	}

	@Override public String visitListaParametros(GraceParser.ListaParametrosContext ctx) { 
		//System.out.println("LISTA PARAMETROS -> " + ctx.getText());
		
		return visitChildren(ctx); 
	}

	@Override public String visitSpecParam(GraceParser.SpecParamContext ctx) {
		//System.out.println("SPEC PARAM -> " + ctx.getText());
		
		if(ctx.getChildCount() > 1) {
			ParametroFunProc parametroFunProc = mapParametros.get(pilhaDeTabelas.topo().getEscopo());
			for(int i=0;i<ctx.getChildCount()-2;i++) {
				switch (ctx.tipo().getText()) {
				case "int":
					if(ctx.param(i) != null) {
						parametroFunProc.getParametros().get(TipoDeDado.INT).add(ctx.param(i).getChild(0).getText());
						parametroFunProc.getOrdemParametros().add(TipoDeDado.INT);
					}
					break;
				case "bool":
					if(ctx.param(i) != null) {
						parametroFunProc.getParametros().get(TipoDeDado.BOOL).add(ctx.param(i).getChild(0).getText());
						parametroFunProc.getOrdemParametros().add(TipoDeDado.BOOL);
					}
					break;
				case "string":
					if(ctx.param(i) != null) {
						parametroFunProc.getParametros().get(TipoDeDado.STRING).add(ctx.param(i).getChild(0).getText());
						parametroFunProc.getOrdemParametros().add(TipoDeDado.STRING);
					}
					break;
				}
			}
		}
		return visitChildren(ctx); 
	}

	@Override public String visitParam(GraceParser.ParamContext ctx) { 
		//System.out.println("PARAM -> " + ctx.getText());
		
		return ctx.getText(); 
	}

	@Override public String visitCmdIf(GraceParser.CmdIfContext ctx) { 
		//System.out.println("CMD IF -> " + ctx.getText());
		
		left = "";
		right="";
		opRel="";

		isParametroSubprograma = Boolean.FALSE;
		return visitChildren(ctx); 
	}

	@Override public String visitCmdWhile(GraceParser.CmdWhileContext ctx) { 
		//System.out.println("CMD WHILE -> " + ctx.getText());
		
		left = "";
		right="";
		opRel="";
		
		isParametroSubprograma = Boolean.FALSE;
		return visitChildren(ctx); 
	}
	
	@Override public String visitCmdFor(GraceParser.CmdForContext ctx) { 
		//System.out.println("CMD FOR -> " + ctx.getText());
		
		left = "";
		right="";
		opRel="";
		
		isParametroSubprograma = Boolean.FALSE;
		return visitChildren(ctx); 
	}
	
	@Override public String visitBloco(GraceParser.BlocoContext ctx) { 
		//System.out.println("BLOCO -> " + ctx.getText());
		
		return visitChildren(ctx); 
	}

	@Override public String visitComando(GraceParser.ComandoContext ctx) { 
		//System.out.println("COMANDO -> " + ctx.getText());
		
		return visitChildren(ctx); 
	}

	@Override public String visitCmdSimples(GraceParser.CmdSimplesContext ctx) { 
		//System.out.println("CMD SIMPLES -> " + ctx.getText());
		
		return visitChildren(ctx); 
	}

	@Override public String visitCmdRead(GraceParser.CmdReadContext ctx) { 
		//System.out.println("CMD READ -> " + ctx.getText());
		
		String varToRead = ctx.variavel().getText();
		if(!GraceSemanticRules.variavelReadDeclarada(varToRead)) {
			System.err.println("Erro Semântico -> Linha: " + ctx.start.getLine() + "  Coluna:" + ctx.start.getCharPositionInLine() + "\t O simbolo \"" + varToRead + "\" nao foi declarado.");
		}
		
		isParametroSubprograma = Boolean.FALSE;
		return visitChildren(ctx); 
	}
	
	@Override public String visitCmdWrite(GraceParser.CmdWriteContext ctx) { 
		//System.out.println("CMD WRITE -> " + ctx.getText());
		
		isParametroSubprograma = Boolean.FALSE;
		return visitChildren(ctx); 
	}
	
	@Override public String visitCmdChamadaProc(GraceParser.CmdChamadaProcContext ctx) { 
		//System.out.println("CMD CHAMADA PROC -> " + ctx.getText());
		
		String nomeProcedimento = ctx.getChild(0).getText();
		if(!GraceSemanticRules.verificaSeExisteProcedimento(nomeProcedimento)) {
			System.err.println("Erro Semântico -> Linha: " + ctx.start.getLine() + "  Coluna:" + ctx.start.getCharPositionInLine() + "\t A chamada \"" + nomeProcedimento + "\" nao foi declarada.");
		} else {
			if(GraceSemanticRules.subprogramaTemParametros(nomeProcedimento)) {
				if(ctx.listaExpressao() == null) {
					System.err.println("Erro Semântico -> Linha: " + ctx.start.getLine() + "  Coluna:" + ctx.start.getCharPositionInLine() + "\t A chamada \"" + nomeProcedimento + "\" necessita de parametros.");
				}
			}
		}
		isParametroSubprograma = Boolean.TRUE;
		return visitChildren(ctx); 
	}
	
	@Override public String visitListaExpressao(GraceParser.ListaExpressaoContext ctx) { 
		//System.out.println("LISTA EXPRESSAO -> " + ctx.getText());
		
		int qtdParam = 0;
		for(int j=0;j<ctx.getChildCount();j++) {
			if(ctx.expressao(j) != null) {
				qtdParam++;
				if(!GraceSemanticRules.tipoParametroOK(ctx.expressao(j).getText(), j, ctx.getParent().getChild(0).getText())) {
					System.err.println("Erro Semântico -> Linha: " + ctx.start.getLine() + "  Coluna:" + ctx.start.getCharPositionInLine() + "\t O parametro \"" + ctx.expressao(j).getText() + "\" nao tem o tipo correto esperado.");
				}
			} else {
				break;
			}
		}
		if(qtdParam < mapParametros.get(ctx.getParent().getChild(0).getText()).getOrdemParametros().size()) {
			System.err.println("Erro Semântico -> Linha: " + ctx.start.getLine() + "  Coluna:" + ctx.start.getCharPositionInLine() + "\t A chamada de procedimento \"" + ctx.getParent().getChild(0).getText() + "\" espera " + mapParametros.get(ctx.getParent().getChild(0).getText()).getOrdemParametros().size() + " parametros, mas so recebe " + qtdParam);
		}
		return visitChildren(ctx); 
	}
	
	@Override public String visitVariavel(GraceParser.VariavelContext ctx) {
		//System.out.println("VARIAVEL -> " + ctx.getText());
		
		left = ctx.getText();
		
		isParametroSubprograma = Boolean.FALSE;
		return visitChildren(ctx); 
	}
	
	@Override public String visitExpressao(GraceParser.ExpressaoContext ctx) { 
		//System.out.println("EXPRESSAO -> " + ctx.getText());
		
		if(!isParametroSubprograma) {
			if(ctx.OP_EXPRESSAO() != null) {
				opRel = ctx.OP_EXPRESSAO().getText();
			}
			right = ctx.getText();
			
			if(!left.isEmpty()) {
				if(!GraceSemanticRules.verificaExpressaoIfCorreto(left, opRel, right)) {
					if(!leftOK)
						System.err.println("Erro Semântico -> Linha: " + ctx.start.getLine() + "  Coluna:" + ctx.start.getCharPositionInLine() + "\t A expressao nao e valida. Variavel \"" + left + "\" nao esta definida ou nao e do tipo inteiro");
					if(!opRelacionalOK)
						System.err.println("Erro Semântico -> Linha: " + ctx.start.getLine() + "  Coluna:" + ctx.start.getCharPositionInLine() + "\t A expressao nao e valida. O resultado deve ser logico");
					if(!rightOK)
						System.err.println("Erro Semântico -> Linha: " + ctx.start.getLine() + "  Coluna:" + ctx.start.getCharPositionInLine() + "\t A expressao nao e valida. Variavel \"" + right + "\" nao esta definida ou nao e do tipo inteiro");
					
				}
			}
		} 
		
		return visitChildren(ctx); 
	}
	
	@Override public String visitChamadaFuncao(GraceParser.ChamadaFuncaoContext ctx) { 
		//System.out.println("CHAMADA FUNCAO -> " + ctx.getText());
		
		String nomeFuncao = ctx.getChild(0).getText();
		if(!GraceSemanticRules.verificaSeExisteProcedimento(nomeFuncao)) {
			System.err.println("Erro Semântico -> Linha: " + ctx.start.getLine() + "  Coluna:" + ctx.start.getCharPositionInLine() + "\t A chamada \"" + nomeFuncao + "\" nao foi declarada.");
		} else {
			if(GraceSemanticRules.subprogramaTemParametros(nomeFuncao)) {
				if(ctx.listaExpressao() == null) {
					System.err.println("Erro Semântico -> Linha: " + ctx.start.getLine() + "  Coluna:" + ctx.start.getCharPositionInLine() + "\t A chamada \"" + nomeFuncao + "\" necessita de parametros.");
				}
			}
		}
		isParametroSubprograma = Boolean.TRUE;
		return visitChildren(ctx); 
	}
	
	
	
	
	
	
	@Override public String visitCmdAtrib(GraceParser.CmdAtribContext ctx) { 
		//System.out.println("CMD ATRIB -> " + ctx.getText());
		
		return visitChildren(ctx); 
	}
	
	@Override public String visitAtrib(GraceParser.AtribContext ctx) { 
		//System.out.println("ATRIB -> " + ctx.getText());
		
		return visitChildren(ctx); 
	}

	@Override public String visitAtribIni(GraceParser.AtribIniContext ctx) { 
		//System.out.println("ATRIB INI -> " + ctx.getText());
		return visitChildren(ctx); 
	}

	@Override public String visitAtribPasso(GraceParser.AtribPassoContext ctx) {
		//System.out.println("ATRIB PASSO -> " + ctx.getText());
		return visitChildren(ctx); 
	}

	@Override public String visitCmdStop(GraceParser.CmdStopContext ctx) { 
		//System.out.println("CMD STOP -> " + ctx.getText());
		
		return visitChildren(ctx); 
	}

	@Override public String visitCmdSkip(GraceParser.CmdSkipContext ctx) { 
		//System.out.println("CMD SKIP -> " + ctx.getText());
		return visitChildren(ctx); 
	}
	
	@Override public String visitCmdReturn(GraceParser.CmdReturnContext ctx) { 
		//System.out.println("CMD RETURN -> " + ctx.getText());
		
		isParametroSubprograma = Boolean.FALSE;
		return visitChildren(ctx); 
	}


}
