import java.util.HashMap;
import java.util.LinkedList;

public class GraceVisitorSemantico extends GraceBaseVisitor<String> {
	PilhaDeTabelas pilhaDeTabelas; // cada tabela comum escopo
    HashMap<String, LinkedList<EntradaTabelaDeSimbolos>> mapRegistros; // mapeia o nome de cada registro com uma lista que armazena todos os seus respectivos campos
    HashMap<String, LinkedList<String>> mapParametros; // mapeia o nome de cada função e procedimento com uma lista que armazena todos os seus respectivos parâmetros
	
    @Override 
	public String visitStart(GraceParser.StartContext ctx) { 
    	pilhaDeTabelas = new PilhaDeTabelas();
        mapRegistros = new HashMap<>();
        mapParametros = new HashMap<String, LinkedList<String>>();
        pilhaDeTabelas.empilhar(new TabelaDeSimbolos("global"));
        for(int i = 0;i < ctx.declaracao().size();i++) {
        	visitDeclaracao(ctx.declaracao(i));
        }
		return "";
	}
    
	@Override 
	public String visitDeclaracao(GraceParser.DeclaracaoContext ctx) { 
		System.out.println("DECLARACAO");
		return visitChildren(ctx); 
	}
	
	@Override public String visitDecVar(GraceParser.DecVarContext ctx) { 
		System.out.println("DECLARACAO VAR");
		return visitChildren(ctx); 
	}

	@Override public String visitListaSpecVars(GraceParser.ListaSpecVarsContext ctx) { return visitChildren(ctx); }

	@Override public String visitTipo(GraceParser.TipoContext ctx) { return visitChildren(ctx); }

	@Override public String visitSpecVar(GraceParser.SpecVarContext ctx) { return visitChildren(ctx); }

	@Override public String visitSpecVarSimples(GraceParser.SpecVarSimplesContext ctx) { return visitChildren(ctx); }

	@Override public String visitSpecVarSimplesIni(GraceParser.SpecVarSimplesIniContext ctx) { return visitChildren(ctx); }

	@Override public String visitSpecVarArranjo(GraceParser.SpecVarArranjoContext ctx) { return visitChildren(ctx); }

	@Override public String visitSpecVarArranjoIni(GraceParser.SpecVarArranjoIniContext ctx) { return visitChildren(ctx); }

	@Override public String visitExpVarSimplesIni(GraceParser.ExpVarSimplesIniContext ctx) { return visitChildren(ctx); }

	@Override public String visitMemoriaReservada(GraceParser.MemoriaReservadaContext ctx) { return visitChildren(ctx); }

	@Override public String visitDecSub(GraceParser.DecSubContext ctx) { 
		System.out.println("DECLARACAO SUBPROGRAMA");
		return visitChildren(ctx); 
	}

	@Override public String visitDecProc(GraceParser.DecProcContext ctx) { return visitChildren(ctx); }
	
	@Override public String visitDecFunc(GraceParser.DecFuncContext ctx) { return visitChildren(ctx); }

	@Override public String visitListaParametros(GraceParser.ListaParametrosContext ctx) { return visitChildren(ctx); }

	@Override public String visitSpecParam(GraceParser.SpecParamContext ctx) { return visitChildren(ctx); }

	@Override public String visitParam(GraceParser.ParamContext ctx) { return visitChildren(ctx); }

	@Override public String visitBloco(GraceParser.BlocoContext ctx) { return visitChildren(ctx); }

	@Override public String visitComando(GraceParser.ComandoContext ctx) { return visitChildren(ctx); }

	@Override public String visitCmdSimples(GraceParser.CmdSimplesContext ctx) { return visitChildren(ctx); }

	@Override public String visitCmdAtrib(GraceParser.CmdAtribContext ctx) { return visitChildren(ctx); }
	
	@Override public String visitAtrib(GraceParser.AtribContext ctx) { return visitChildren(ctx); }

	@Override public String visitCmdIf(GraceParser.CmdIfContext ctx) { return visitChildren(ctx); }

	@Override public String visitCmdWhile(GraceParser.CmdWhileContext ctx) { return visitChildren(ctx); }

	@Override public String visitCmdFor(GraceParser.CmdForContext ctx) { return visitChildren(ctx); }

	@Override public String visitAtribIni(GraceParser.AtribIniContext ctx) { return visitChildren(ctx); }

	@Override public String visitAtribPasso(GraceParser.AtribPassoContext ctx) { return visitChildren(ctx); }

	@Override public String visitCmdStop(GraceParser.CmdStopContext ctx) { return visitChildren(ctx); }

	@Override public String visitCmdSkip(GraceParser.CmdSkipContext ctx) { return visitChildren(ctx); }
	
	@Override public String visitCmdReturn(GraceParser.CmdReturnContext ctx) { return visitChildren(ctx); }

	@Override public String visitCmdChamadaProc(GraceParser.CmdChamadaProcContext ctx) { return visitChildren(ctx); }
	
	@Override public String visitListaExpressao(GraceParser.ListaExpressaoContext ctx) { return visitChildren(ctx); }
	
	@Override public String visitCmdRead(GraceParser.CmdReadContext ctx) { return visitChildren(ctx); }
	
	@Override public String visitCmdWrite(GraceParser.CmdWriteContext ctx) { return visitChildren(ctx); }
	
	@Override public String visitVariavel(GraceParser.VariavelContext ctx) { return visitChildren(ctx); }
	
	@Override public String visitExpressao(GraceParser.ExpressaoContext ctx) { return visitChildren(ctx); }
	
	@Override public String visitChamadaFuncao(GraceParser.ChamadaFuncaoContext ctx) { return visitChildren(ctx); }
	
	@Override public String visitExpressaoIf(GraceParser.ExpressaoIfContext ctx) { return visitChildren(ctx); }
	
	@Override public String visitExpressaoWhile(GraceParser.ExpressaoWhileContext ctx) { return visitChildren(ctx); }
	
	@Override public String visitExpressaoFor(GraceParser.ExpressaoForContext ctx) { return visitChildren(ctx); }
	
	@Override public String visitExpressaoForCond(GraceParser.ExpressaoForCondContext ctx) { return visitChildren(ctx); }
	
	@Override public String visitExpressaoVar(GraceParser.ExpressaoVarContext ctx) { return visitChildren(ctx); }

}
