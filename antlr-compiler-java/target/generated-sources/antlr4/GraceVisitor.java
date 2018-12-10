// Generated from Grace.g4 by ANTLR 4.7.1
import org.antlr.v4.runtime.tree.ParseTreeVisitor;

/**
 * This interface defines a complete generic visitor for a parse tree produced
 * by {@link GraceParser}.
 *
 * @param <T> The return type of the visit operation. Use {@link Void} for
 * operations with no return type.
 */
public interface GraceVisitor<T> extends ParseTreeVisitor<T> {
	/**
	 * Visit a parse tree produced by {@link GraceParser#start}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStart(GraceParser.StartContext ctx);
	/**
	 * Visit a parse tree produced by {@link GraceParser#declaracao}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDeclaracao(GraceParser.DeclaracaoContext ctx);
	/**
	 * Visit a parse tree produced by {@link GraceParser#decVar}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDecVar(GraceParser.DecVarContext ctx);
	/**
	 * Visit a parse tree produced by {@link GraceParser#listaSpecVars}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitListaSpecVars(GraceParser.ListaSpecVarsContext ctx);
	/**
	 * Visit a parse tree produced by {@link GraceParser#tipo}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTipo(GraceParser.TipoContext ctx);
	/**
	 * Visit a parse tree produced by {@link GraceParser#specVar}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSpecVar(GraceParser.SpecVarContext ctx);
	/**
	 * Visit a parse tree produced by {@link GraceParser#specVarSimples}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSpecVarSimples(GraceParser.SpecVarSimplesContext ctx);
	/**
	 * Visit a parse tree produced by {@link GraceParser#specVarSimplesIni}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSpecVarSimplesIni(GraceParser.SpecVarSimplesIniContext ctx);
	/**
	 * Visit a parse tree produced by {@link GraceParser#specVarArranjo}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSpecVarArranjo(GraceParser.SpecVarArranjoContext ctx);
	/**
	 * Visit a parse tree produced by {@link GraceParser#specVarArranjoIni}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSpecVarArranjoIni(GraceParser.SpecVarArranjoIniContext ctx);
	/**
	 * Visit a parse tree produced by {@link GraceParser#expVarSimplesIni}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExpVarSimplesIni(GraceParser.ExpVarSimplesIniContext ctx);
	/**
	 * Visit a parse tree produced by {@link GraceParser#memoriaReservada}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMemoriaReservada(GraceParser.MemoriaReservadaContext ctx);
	/**
	 * Visit a parse tree produced by {@link GraceParser#decSub}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDecSub(GraceParser.DecSubContext ctx);
	/**
	 * Visit a parse tree produced by {@link GraceParser#decProc}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDecProc(GraceParser.DecProcContext ctx);
	/**
	 * Visit a parse tree produced by {@link GraceParser#decFunc}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDecFunc(GraceParser.DecFuncContext ctx);
	/**
	 * Visit a parse tree produced by {@link GraceParser#listaParametros}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitListaParametros(GraceParser.ListaParametrosContext ctx);
	/**
	 * Visit a parse tree produced by {@link GraceParser#specParam}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSpecParam(GraceParser.SpecParamContext ctx);
	/**
	 * Visit a parse tree produced by {@link GraceParser#param}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitParam(GraceParser.ParamContext ctx);
	/**
	 * Visit a parse tree produced by {@link GraceParser#bloco}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBloco(GraceParser.BlocoContext ctx);
	/**
	 * Visit a parse tree produced by {@link GraceParser#comando}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitComando(GraceParser.ComandoContext ctx);
	/**
	 * Visit a parse tree produced by {@link GraceParser#cmdSimples}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCmdSimples(GraceParser.CmdSimplesContext ctx);
	/**
	 * Visit a parse tree produced by {@link GraceParser#cmdAtrib}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCmdAtrib(GraceParser.CmdAtribContext ctx);
	/**
	 * Visit a parse tree produced by {@link GraceParser#atrib}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAtrib(GraceParser.AtribContext ctx);
	/**
	 * Visit a parse tree produced by {@link GraceParser#cmdIf}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCmdIf(GraceParser.CmdIfContext ctx);
	/**
	 * Visit a parse tree produced by {@link GraceParser#cmdWhile}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCmdWhile(GraceParser.CmdWhileContext ctx);
	/**
	 * Visit a parse tree produced by {@link GraceParser#cmdFor}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCmdFor(GraceParser.CmdForContext ctx);
	/**
	 * Visit a parse tree produced by {@link GraceParser#atribIni}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAtribIni(GraceParser.AtribIniContext ctx);
	/**
	 * Visit a parse tree produced by {@link GraceParser#atribPasso}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAtribPasso(GraceParser.AtribPassoContext ctx);
	/**
	 * Visit a parse tree produced by {@link GraceParser#cmdStop}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCmdStop(GraceParser.CmdStopContext ctx);
	/**
	 * Visit a parse tree produced by {@link GraceParser#cmdSkip}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCmdSkip(GraceParser.CmdSkipContext ctx);
	/**
	 * Visit a parse tree produced by {@link GraceParser#cmdReturn}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCmdReturn(GraceParser.CmdReturnContext ctx);
	/**
	 * Visit a parse tree produced by {@link GraceParser#cmdChamadaProc}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCmdChamadaProc(GraceParser.CmdChamadaProcContext ctx);
	/**
	 * Visit a parse tree produced by {@link GraceParser#listaExpressao}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitListaExpressao(GraceParser.ListaExpressaoContext ctx);
	/**
	 * Visit a parse tree produced by {@link GraceParser#cmdRead}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCmdRead(GraceParser.CmdReadContext ctx);
	/**
	 * Visit a parse tree produced by {@link GraceParser#cmdWrite}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCmdWrite(GraceParser.CmdWriteContext ctx);
	/**
	 * Visit a parse tree produced by {@link GraceParser#variavel}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitVariavel(GraceParser.VariavelContext ctx);
	/**
	 * Visit a parse tree produced by {@link GraceParser#expressao}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExpressao(GraceParser.ExpressaoContext ctx);
	/**
	 * Visit a parse tree produced by {@link GraceParser#chamadaFuncao}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitChamadaFuncao(GraceParser.ChamadaFuncaoContext ctx);
}