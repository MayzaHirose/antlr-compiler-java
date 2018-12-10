import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;

import compiler.util.Categoria;
import compiler.util.TipoDeDado;

public class GraceVisitorSemantico extends GraceBaseVisitor<String> {
	public static PilhaDeTabelas pilhaDeTabelas; // cada tabela comum escopo
    HashMap<String, LinkedList<EntradaTabelaDeSimbolos>> mapRegistros; // mapeia o nome de cada registro com uma lista que armazena todos os seus respectivos campos
    HashMap<String, LinkedList<String>> mapParametros; // mapeia o nome de cada função e procedimento com uma lista que armazena todos os seus respectivos parâmetros
	
    @Override 
	public String visitStart(GraceParser.StartContext ctx) { 
    	pilhaDeTabelas = new PilhaDeTabelas();
        mapRegistros = new HashMap<>();
        mapParametros = new HashMap<String, LinkedList<String>>();
        pilhaDeTabelas.empilhar(new TabelaDeSimbolos("global"));
        //System.out.println("START");
        return visitChildren(ctx);
	}
    
	@Override 
	public String visitDeclaracao(GraceParser.DeclaracaoContext ctx) { 
		//System.out.println("DECLARACAO");
		return visitChildren(ctx); 
	}
	
	@Override public String visitDecVar(GraceParser.DecVarContext ctx) { 
		//System.out.println("DEC VAR");
		return visitChildren(ctx); 
	}

	@Override public String visitListaSpecVars(GraceParser.ListaSpecVarsContext ctx) { 
		//System.out.println("LISTA SPEC VARS");
		return visitChildren(ctx); 
	}

	@Override public String visitTipo(GraceParser.TipoContext ctx) { 
		//System.out.println("TIPO");
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
		//System.out.println("SPEC VAR");
		return visitChildren(ctx); 
	}

	@Override public String visitSpecVarSimples(GraceParser.SpecVarSimplesContext ctx) { 
		//System.out.println("SPEC VAR SIMPLES");
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
		//System.out.println("SPEC VAR SIMPLES INI");
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
		//System.out.println("SPEC VAR ARRANJO");
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
		//System.out.println("SPEC VAR ARRANJO INI");
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
		//System.out.println("EXP VAR SIMPLES INI");
		List<EntradaTabelaDeSimbolos> listaDeSimbolos = pilhaDeTabelas.topo().getListaSimbolos();
		EntradaTabelaDeSimbolos simboloContexto = listaDeSimbolos.get(listaDeSimbolos.size()-1);
		simboloContexto.setValor(ctx.getText());
		
		return visitChildren(ctx); 
	}

	@Override public String visitMemoriaReservada(GraceParser.MemoriaReservadaContext ctx) { 
		//System.out.println("MEMORIA RESERVADA");
		return visitChildren(ctx); 
	}

	@Override public String visitDecSub(GraceParser.DecSubContext ctx) { 
		//System.out.println("DEC SUB");
		return visitChildren(ctx); 
	}

	@Override public String visitDecProc(GraceParser.DecProcContext ctx) {
		//System.out.println("DEC PROC");
		return visitChildren(ctx); 
	}
	
	@Override public String visitDecFunc(GraceParser.DecFuncContext ctx) {
		//System.out.println("DEC FUNC");
		return visitChildren(ctx); 
	}

	@Override public String visitListaParametros(GraceParser.ListaParametrosContext ctx) { 
		//System.out.println("LISTA PARAMETROS");
		return visitChildren(ctx); 
	}

	@Override public String visitSpecParam(GraceParser.SpecParamContext ctx) {
		//System.out.println("SPEC PARAM");
		return visitChildren(ctx); 
	}

	@Override public String visitParam(GraceParser.ParamContext ctx) { 
		//System.out.println("PARAM");
		return visitChildren(ctx); 
	}

	@Override public String visitBloco(GraceParser.BlocoContext ctx) { 
		//System.out.println("BLOCO");
		return visitChildren(ctx); 
	}

	@Override public String visitComando(GraceParser.ComandoContext ctx) { 
		//System.out.println("COMANDO");
		return visitChildren(ctx); 
	}

	@Override public String visitCmdSimples(GraceParser.CmdSimplesContext ctx) { 
		//System.out.println("CMD SIMPLES");
		return visitChildren(ctx); 
	}

	@Override public String visitCmdAtrib(GraceParser.CmdAtribContext ctx) { 
		//System.out.println("CMD ATRIB");
		return visitChildren(ctx); 
	}
	
	@Override public String visitAtrib(GraceParser.AtribContext ctx) { 
		//System.out.println("ATRIB");
		return visitChildren(ctx); 
	}

	@Override public String visitCmdIf(GraceParser.CmdIfContext ctx) { 
		//System.out.println("CMD IF");
		return visitChildren(ctx); 
	}

	@Override public String visitCmdWhile(GraceParser.CmdWhileContext ctx) { 
		//System.out.println("CMD WHILE");
		return visitChildren(ctx); 
	}

	@Override public String visitCmdFor(GraceParser.CmdForContext ctx) { 
		//System.out.println("CMD FOR");
		return visitChildren(ctx); 
	}

	@Override public String visitAtribIni(GraceParser.AtribIniContext ctx) { 
		//System.out.println("ATRIB INI");
		return visitChildren(ctx); 
	}

	@Override public String visitAtribPasso(GraceParser.AtribPassoContext ctx) {
		//System.out.println("ATRIB PASSO");
		return visitChildren(ctx); 
	}

	@Override public String visitCmdStop(GraceParser.CmdStopContext ctx) { 
		//System.out.println("CMD STOP");
		return visitChildren(ctx); 
	}

	@Override public String visitCmdSkip(GraceParser.CmdSkipContext ctx) { 
		//System.out.println("CMD SKIP");
		return visitChildren(ctx); 
	}
	
	@Override public String visitCmdReturn(GraceParser.CmdReturnContext ctx) { 
		//System.out.println("CMD RETURN");
		return visitChildren(ctx); 
	}

	@Override public String visitCmdChamadaProc(GraceParser.CmdChamadaProcContext ctx) { 
		//System.out.println("CMD CHAMADA PROC");
		return visitChildren(ctx); 
	}
	
	@Override public String visitListaExpressao(GraceParser.ListaExpressaoContext ctx) { 
		//System.out.println("LISTA EXPRESSAO");
		return visitChildren(ctx); 
	}
	
	@Override public String visitCmdRead(GraceParser.CmdReadContext ctx) { 
		//System.out.println("CMD READ");
		return visitChildren(ctx); 
	}
	
	@Override public String visitCmdWrite(GraceParser.CmdWriteContext ctx) { 
		//System.out.println("CMD WRITE");
		return visitChildren(ctx); 
	}
	
	@Override public String visitVariavel(GraceParser.VariavelContext ctx) {
		//System.out.println("VARIAVEL");
		return visitChildren(ctx); 
	}
	
	@Override public String visitExpressao(GraceParser.ExpressaoContext ctx) { 
		//System.out.println("EXPRESSAO");
		return visitChildren(ctx); 
	}
	
	@Override public String visitChamadaFuncao(GraceParser.ChamadaFuncaoContext ctx) { 
		//System.out.println("CHAMADA FUNCAO");
		return visitChildren(ctx); 
	}
	
	//@Override public String visitExpressaoIf(GraceParser.ExpressaoIfContext ctx) { return visitChildren(ctx); }
	
	//@Override public String visitExpressaoWhile(GraceParser.ExpressaoWhileContext ctx) { return visitChildren(ctx); }
	
	//@Override public String visitExpressaoFor(GraceParser.ExpressaoForContext ctx) { return visitChildren(ctx); }
	
	//@Override public String visitExpressaoForCond(GraceParser.ExpressaoForCondContext ctx) { return visitChildren(ctx); }
	
	//@Override public String visitExpressaoVar(GraceParser.ExpressaoVarContext ctx) { return visitChildren(ctx); }

}
