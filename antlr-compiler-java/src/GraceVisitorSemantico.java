import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;

import compiler.util.Categoria;
import compiler.util.TipoDeDado;

public class GraceVisitorSemantico extends GraceBaseVisitor<String> {
	public static PilhaDeTabelas pilhaDeTabelas; // cada tabela comum escopo
    HashMap<String, LinkedList<EntradaTabelaDeSimbolos>> mapRegistros; // mapeia o nome de cada registro com uma lista que armazena todos os seus respectivos campos
    HashMap<String, ParametroFunProc> mapParametros; // mapeia o nome de cada função e procedimento com uma lista que armazena todos os seus respectivos parâmetros
	
    public void teste(GraceParser.StartContext ctx) {
    	pilhaDeTabelas = new PilhaDeTabelas();
        mapRegistros = new HashMap<>();
        mapParametros = new HashMap<>();
        pilhaDeTabelas.empilhar(new TabelaDeSimbolos("global"));
        
    	System.err.println(visitStart(ctx));
    	
    	if(pilhaDeTabelas.topo().getListaSimbolos().get(pilhaDeTabelas.topo().getListaSimbolos().size()-1).getCadeia().equals("main")) {
    		System.out.println("Sucesso");
    	}
    	
    }
    
    @Override 
	public String visitStart(GraceParser.StartContext ctx) { 
        System.out.println("START -> " + ctx.getText());
        return visitChildren(ctx);
	}
    
	@Override 
	public String visitDeclaracao(GraceParser.DeclaracaoContext ctx) { 
		System.out.println("DECLARACAO -> " + ctx.getText());
		return visitChildren(ctx); 
	}
	
	@Override public String visitDecVar(GraceParser.DecVarContext ctx) { 
		System.out.println("DEC VAR -> " + ctx.getText());
		return visitChildren(ctx); 
	}

	@Override public String visitListaSpecVars(GraceParser.ListaSpecVarsContext ctx) { 
		System.out.println("LISTA SPEC VARS -> " + ctx.getText());
		return visitChildren(ctx); 
	}

	@Override public String visitTipo(GraceParser.TipoContext ctx) { 
		System.out.println("TIPO -> " + ctx.getText());
		List<EntradaTabelaDeSimbolos> listaDeSimbolos = pilhaDeTabelas.topo().getListaSimbolos();
		for(EntradaTabelaDeSimbolos simbolo: listaDeSimbolos) {
			if(simbolo.getTipoDeDado() == null) {
				switch (ctx.getText()) {
				case "bool":
					if(simbolo.getValor() != null) {
						TipoDeDado tipoEncontrado = GraceSemanticRules.verificaVariavelInicializadaComTipoCorreto(simbolo.getValor(), TipoDeDado.BOOL);
						if(tipoEncontrado.equals(TipoDeDado.BOOL)) {
							simbolo.setTipoDeDado(TipoDeDado.BOOL); 
						} else {
							simbolo.setTipoDeDado(tipoEncontrado);
							System.err.println("Erro Semântico -> Linha: " + ctx.start.getLine() + "  Coluna:" + ctx.start.getCharPositionInLine() + "\t Tipo incompativel. Esperado tipo bool. Encontrado " + tipoEncontrado.toString() + " em " + simbolo.getCadeia() + "=" + simbolo.getValor());
							return "";
						}
					} else {
						simbolo.setTipoDeDado(TipoDeDado.BOOL); 
					}
					break;
				case "int":
					if(simbolo.getValor() != null) {
						TipoDeDado tipoEncontrado = GraceSemanticRules.verificaVariavelInicializadaComTipoCorreto(simbolo.getValor(), TipoDeDado.INT);
						if(tipoEncontrado.equals(TipoDeDado.INT)) {
							simbolo.setTipoDeDado(TipoDeDado.INT);
						} else {
							simbolo.setTipoDeDado(tipoEncontrado);
							System.err.println("Erro Semântico -> Linha: " + ctx.start.getLine() + "  Coluna:" + ctx.start.getCharPositionInLine() + "\t Tipo incompativel. Esperado tipo int. Encontrado " + tipoEncontrado.toString() + " em " + simbolo.getCadeia() + "=" + simbolo.getValor());
							return "";
						}
					} else {
						simbolo.setTipoDeDado(TipoDeDado.INT); 
					}
					break;
				case "string":
					if(simbolo.getValor() != null) {
						TipoDeDado tipoEncontrado = GraceSemanticRules.verificaVariavelInicializadaComTipoCorreto(simbolo.getValor(), TipoDeDado.STRING);
						if(tipoEncontrado.equals(TipoDeDado.STRING)) {
							simbolo.setTipoDeDado(TipoDeDado.STRING);
						} else {
							simbolo.setTipoDeDado(tipoEncontrado);
							System.err.println("Erro Semântico -> Linha: " + ctx.start.getLine() + "  Coluna:" + ctx.start.getCharPositionInLine() + "\t Tipo incompativel. Esperado tipo string. Encontrado " + tipoEncontrado.toString() + " em " + simbolo.getCadeia() + "=" + simbolo.getValor());
							return "";
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

	@Override public String visitSpecVar(GraceParser.SpecVarContext ctx) { 
		System.out.println("SPEC VAR -> " + ctx.getText());
		return visitChildren(ctx); 
	}

	@Override public String visitSpecVarSimples(GraceParser.SpecVarSimplesContext ctx) { 
		System.out.println("SPEC VAR SIMPLES -> " + ctx.getText());
		TabelaDeSimbolos tabelaDeSimbolos = pilhaDeTabelas.topo();
		if(!GraceSemanticRules.verificaExisteVariavelMesmoNome(ctx.IDENTIFIER().getText(), tabelaDeSimbolos)) {
			pilhaDeTabelas.topo().adicionarSimbolo(ctx.IDENTIFIER().getText(), Categoria.VARIAVEL, null, null);
			return visitChildren(ctx); 
		} else {
			System.err.println("Erro Semântico -> Linha: " + ctx.start.getLine() + "  Coluna:" + ctx.start.getCharPositionInLine() + "\t A seguinte variavel ja foi declarada: " + ctx.IDENTIFIER().getText());
		}
		return ""; 
	}

	@Override public String visitSpecVarSimplesIni(GraceParser.SpecVarSimplesIniContext ctx) { 
		System.out.println("SPEC VAR SIMPLES INI -> " + ctx.getText());
		TabelaDeSimbolos tabelaDeSimbolos = pilhaDeTabelas.topo();
		if(!GraceSemanticRules.verificaExisteVariavelMesmoNome(ctx.IDENTIFIER().getText(), tabelaDeSimbolos)) {
			pilhaDeTabelas.topo().adicionarSimbolo(ctx.IDENTIFIER().getText(), Categoria.VARIAVEL, null, null);
			return visitChildren(ctx); 
		} else {
			System.err.println("Erro Semântico -> Linha: " + ctx.start.getLine() + "  Coluna:" + ctx.start.getCharPositionInLine() + "\t A seguinte variavel ja foi declarada: " + ctx.IDENTIFIER().getText());
		}
		return "";
	}

	@Override public String visitSpecVarArranjo(GraceParser.SpecVarArranjoContext ctx) { 
		System.out.println("SPEC VAR ARRANJO -> " + ctx.getText());
		TabelaDeSimbolos tabelaDeSimbolos = pilhaDeTabelas.topo();
		if(!GraceSemanticRules.verificaExisteVariavelMesmoNome(ctx.IDENTIFIER().getText(), tabelaDeSimbolos)) {
			pilhaDeTabelas.topo().adicionarSimbolo(ctx.IDENTIFIER().getText(), Categoria.VARIAVEL, null, null);
			return visitChildren(ctx); 
		} else {
			System.err.println("Erro Semântico -> Linha: " + ctx.start.getLine() + "  Coluna:" + ctx.start.getCharPositionInLine() + "\t A seguinte variavel ja foi declarada: " + ctx.IDENTIFIER().getText());
		}
		return "";
	}

	@Override public String visitSpecVarArranjoIni(GraceParser.SpecVarArranjoIniContext ctx) { 
		System.out.println("SPEC VAR ARRANJO INI -> " + ctx.getText());
		TabelaDeSimbolos tabelaDeSimbolos = pilhaDeTabelas.topo();
		if(!GraceSemanticRules.verificaExisteVariavelMesmoNome(ctx.IDENTIFIER().getText(), tabelaDeSimbolos)) {
			pilhaDeTabelas.topo().adicionarSimbolo(ctx.IDENTIFIER().getText(), Categoria.VARIAVEL, null, null);
			return visitChildren(ctx); 
		} else {
			System.err.println("Erro Semântico -> Linha: " + ctx.start.getLine() + "  Coluna:" + ctx.start.getCharPositionInLine() + "\t A seguinte variavel ja foi declarada: " + ctx.IDENTIFIER().getText());
		}
		return "";
	}

	@Override public String visitExpVarSimplesIni(GraceParser.ExpVarSimplesIniContext ctx) { 
		System.out.println("EXP VAR SIMPLES INI -> " + ctx.getText());
		List<EntradaTabelaDeSimbolos> listaDeSimbolos = pilhaDeTabelas.topo().getListaSimbolos();
		EntradaTabelaDeSimbolos simboloContexto = listaDeSimbolos.get(listaDeSimbolos.size()-1);
		if(simboloContexto.getValor() == null) {
			simboloContexto.setValor(ctx.getText());
		}
		
		return visitChildren(ctx); 
	}
	
	@Override public String visitExpVarArranjoIni(GraceParser.ExpVarArranjoIniContext ctx) { 
		System.out.println("EXP VAR ARRANJO INI -> " + ctx.getText());
		List<EntradaTabelaDeSimbolos> listaDeSimbolos = pilhaDeTabelas.topo().getListaSimbolos();
		EntradaTabelaDeSimbolos simboloContexto = listaDeSimbolos.get(listaDeSimbolos.size()-1);
		simboloContexto.setValor(ctx.getText());
		
		return visitChildren(ctx); 
	}

	@Override public String visitMemoriaReservada(GraceParser.MemoriaReservadaContext ctx) { 
		System.out.println("MEMORIA RESERVADA -> " + ctx.getText());
		return visitChildren(ctx); 
	}

	@Override public String visitDecSub(GraceParser.DecSubContext ctx) { 
		System.out.println("DEC SUB -> " + ctx.getText());
		return visitChildren(ctx); 
	}

	@Override public String visitDecProc(GraceParser.DecProcContext ctx) {
		System.out.println("DEC PROC -> " + ctx.getText());
		pilhaDeTabelas.topo().adicionarSimbolo(ctx.IDENTIFIER().getText(), Categoria.PROCEDIMENTO, null, null);
		mapParametros.put(ctx.IDENTIFIER().getText(), new ParametroFunProc());
		pilhaDeTabelas.empilhar(new TabelaDeSimbolos(ctx.IDENTIFIER().getText()));
		return visitChildren(ctx); 
	}
	
	@Override public String visitDecFunc(GraceParser.DecFuncContext ctx) {
		System.out.println("DEC FUNC -> " + ctx.getText());
		pilhaDeTabelas.topo().adicionarSimbolo(ctx.IDENTIFIER().getText(), Categoria.FUNCAO, null, null);
		mapParametros.put(ctx.IDENTIFIER().getText(), new ParametroFunProc());
		pilhaDeTabelas.empilhar(new TabelaDeSimbolos(ctx.IDENTIFIER().getText()));
		return visitChildren(ctx); 
	}

	@Override public String visitListaParametros(GraceParser.ListaParametrosContext ctx) { 
		System.out.println("LISTA PARAMETROS -> " + ctx.getText());
		return visitChildren(ctx); 
	}

	@Override public String visitSpecParam(GraceParser.SpecParamContext ctx) {
		System.out.println("SPEC PARAM -> " + ctx.getText());
		Map<TipoDeDado, List<String>> param = new HashMap<>();
		String var = visitChildren(ctx);
		switch (ctx.tipo().getText()) {
		case "int":
			//param.get(TipoDeDado.INT).add(var);
			break;
		case "bool":
			param.get(TipoDeDado.BOOL).add(var);
			break;
		case "string":
			param.get(TipoDeDado.STRING).add(var);
			break;
		}
		//mapParametros.get(pilhaDeTabelas.topo().getEscopo()).setParametros(parametros);;
		return ""; 
	}

	@Override public String visitParam(GraceParser.ParamContext ctx) { 
		System.out.println("PARAM -> " + ctx.getText());
		return ctx.getText(); 
	}

	@Override public String visitBloco(GraceParser.BlocoContext ctx) { 
		System.out.println("BLOCO -> " + ctx.getText());
		pilhaDeTabelas.empilhar(new TabelaDeSimbolos("procedimento"));
		return visitChildren(ctx); 
	}

	@Override public String visitComando(GraceParser.ComandoContext ctx) { 
		System.out.println("COMANDO -> " + ctx.getText());
		return visitChildren(ctx); 
	}

	@Override public String visitCmdSimples(GraceParser.CmdSimplesContext ctx) { 
		System.out.println("CMD SIMPLES -> " + ctx.getText());
		return visitChildren(ctx); 
	}

	@Override public String visitCmdAtrib(GraceParser.CmdAtribContext ctx) { 
		System.out.println("CMD ATRIB -> " + ctx.getText());
		return visitChildren(ctx); 
	}
	
	@Override public String visitAtrib(GraceParser.AtribContext ctx) { 
		System.out.println("ATRIB -> " + ctx.getText());
		return visitChildren(ctx); 
	}

	@Override public String visitCmdIf(GraceParser.CmdIfContext ctx) { 
		System.out.println("CMD IF -> " + ctx.getText());
		return visitChildren(ctx); 
	}

	@Override public String visitCmdWhile(GraceParser.CmdWhileContext ctx) { 
		System.out.println("CMD WHILE -> " + ctx.getText());
		return visitChildren(ctx); 
	}

	@Override public String visitCmdFor(GraceParser.CmdForContext ctx) { 
		System.out.println("CMD FOR -> " + ctx.getText());
		return visitChildren(ctx); 
	}

	@Override public String visitAtribIni(GraceParser.AtribIniContext ctx) { 
		System.out.println("ATRIB INI -> " + ctx.getText());
		return visitChildren(ctx); 
	}

	@Override public String visitAtribPasso(GraceParser.AtribPassoContext ctx) {
		System.out.println("ATRIB PASSO -> " + ctx.getText());
		return visitChildren(ctx); 
	}

	@Override public String visitCmdStop(GraceParser.CmdStopContext ctx) { 
		System.out.println("CMD STOP -> " + ctx.getText());
		return visitChildren(ctx); 
	}

	@Override public String visitCmdSkip(GraceParser.CmdSkipContext ctx) { 
		System.out.println("CMD SKIP -> " + ctx.getText());
		return visitChildren(ctx); 
	}
	
	@Override public String visitCmdReturn(GraceParser.CmdReturnContext ctx) { 
		System.out.println("CMD RETURN -> " + ctx.getText());
		return visitChildren(ctx); 
	}

	@Override public String visitCmdChamadaProc(GraceParser.CmdChamadaProcContext ctx) { 
		System.out.println("CMD CHAMADA PROC -> " + ctx.getText());
		return visitChildren(ctx); 
	}
	
	@Override public String visitListaExpressao(GraceParser.ListaExpressaoContext ctx) { 
		System.out.println("LISTA EXPRESSAO -> " + ctx.getText());
		return visitChildren(ctx); 
	}
	
	@Override public String visitCmdRead(GraceParser.CmdReadContext ctx) { 
		System.out.println("CMD READ -> " + ctx.getText());
		return visitChildren(ctx); 
	}
	
	@Override public String visitCmdWrite(GraceParser.CmdWriteContext ctx) { 
		System.out.println("CMD WRITE -> " + ctx.getText());
		return visitChildren(ctx); 
	}
	
	@Override public String visitVariavel(GraceParser.VariavelContext ctx) {
		System.out.println("VARIAVEL -> " + ctx.getText());
		return visitChildren(ctx); 
	}
	
	@Override public String visitExpressao(GraceParser.ExpressaoContext ctx) { 
		System.out.println("EXPRESSAO -> " + ctx.getText());
		return visitChildren(ctx); 
	}
	
	@Override public String visitChamadaFuncao(GraceParser.ChamadaFuncaoContext ctx) { 
		System.out.println("CHAMADA FUNCAO -> " + ctx.getText());
		return visitChildren(ctx); 
	}
	
	//@Override public String visitExpressaoIf(GraceParser.ExpressaoIfContext ctx) { return visitChildren(ctx); }
	
	//@Override public String visitExpressaoWhile(GraceParser.ExpressaoWhileContext ctx) { return visitChildren(ctx); }
	
	//@Override public String visitExpressaoFor(GraceParser.ExpressaoForContext ctx) { return visitChildren(ctx); }
	
	//@Override public String visitExpressaoForCond(GraceParser.ExpressaoForCondContext ctx) { return visitChildren(ctx); }
	
	//@Override public String visitExpressaoVar(GraceParser.ExpressaoVarContext ctx) { return visitChildren(ctx); }

}
