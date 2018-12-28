// Generated from GraceGrammar.g4 by ANTLR 4.7.1
import org.antlr.v4.runtime.tree.ParseTreeVisitor;

/**
 * This interface defines a complete generic visitor for a parse tree produced
 * by {@link GraceGrammarParser}.
 *
 * @param <T> The return type of the visit operation. Use {@link Void} for
 * operations with no return type.
 */
public interface GraceGrammarVisitor<T> extends ParseTreeVisitor<T> {
	/**
	 * Visit a parse tree produced by {@link GraceGrammarParser#start}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStart(GraceGrammarParser.StartContext ctx);
	/**
	 * Visit a parse tree produced by {@link GraceGrammarParser#declaracao}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDeclaracao(GraceGrammarParser.DeclaracaoContext ctx);
	/**
	 * Visit a parse tree produced by {@link GraceGrammarParser#decVar}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDecVar(GraceGrammarParser.DecVarContext ctx);
	/**
	 * Visit a parse tree produced by {@link GraceGrammarParser#listaSpecVars}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitListaSpecVars(GraceGrammarParser.ListaSpecVarsContext ctx);
	/**
	 * Visit a parse tree produced by {@link GraceGrammarParser#tipo}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTipo(GraceGrammarParser.TipoContext ctx);
	/**
	 * Visit a parse tree produced by {@link GraceGrammarParser#specVar}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSpecVar(GraceGrammarParser.SpecVarContext ctx);
	/**
	 * Visit a parse tree produced by {@link GraceGrammarParser#specVarSimples}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSpecVarSimples(GraceGrammarParser.SpecVarSimplesContext ctx);
	/**
	 * Visit a parse tree produced by {@link GraceGrammarParser#specVarSimplesIni}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSpecVarSimplesIni(GraceGrammarParser.SpecVarSimplesIniContext ctx);
	/**
	 * Visit a parse tree produced by {@link GraceGrammarParser#specVarArranjo}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSpecVarArranjo(GraceGrammarParser.SpecVarArranjoContext ctx);
	/**
	 * Visit a parse tree produced by {@link GraceGrammarParser#specVarArranjoIni}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSpecVarArranjoIni(GraceGrammarParser.SpecVarArranjoIniContext ctx);
	/**
	 * Visit a parse tree produced by {@link GraceGrammarParser#expVarSimplesIni}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExpVarSimplesIni(GraceGrammarParser.ExpVarSimplesIniContext ctx);
	/**
	 * Visit a parse tree produced by {@link GraceGrammarParser#expVarArranjoIni}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExpVarArranjoIni(GraceGrammarParser.ExpVarArranjoIniContext ctx);
	/**
	 * Visit a parse tree produced by {@link GraceGrammarParser#memoriaReservada}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMemoriaReservada(GraceGrammarParser.MemoriaReservadaContext ctx);
	/**
	 * Visit a parse tree produced by {@link GraceGrammarParser#decSub}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDecSub(GraceGrammarParser.DecSubContext ctx);
	/**
	 * Visit a parse tree produced by {@link GraceGrammarParser#decProc}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDecProc(GraceGrammarParser.DecProcContext ctx);
	/**
	 * Visit a parse tree produced by {@link GraceGrammarParser#decFunc}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDecFunc(GraceGrammarParser.DecFuncContext ctx);
	/**
	 * Visit a parse tree produced by {@link GraceGrammarParser#listaParametros}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitListaParametros(GraceGrammarParser.ListaParametrosContext ctx);
	/**
	 * Visit a parse tree produced by {@link GraceGrammarParser#specParam}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSpecParam(GraceGrammarParser.SpecParamContext ctx);
	/**
	 * Visit a parse tree produced by {@link GraceGrammarParser#param}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitParam(GraceGrammarParser.ParamContext ctx);
	/**
	 * Visit a parse tree produced by {@link GraceGrammarParser#bloco}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBloco(GraceGrammarParser.BlocoContext ctx);
	/**
	 * Visit a parse tree produced by {@link GraceGrammarParser#comando}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitComando(GraceGrammarParser.ComandoContext ctx);
	/**
	 * Visit a parse tree produced by {@link GraceGrammarParser#cmdSimples}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCmdSimples(GraceGrammarParser.CmdSimplesContext ctx);
	/**
	 * Visit a parse tree produced by {@link GraceGrammarParser#cmdAtrib}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCmdAtrib(GraceGrammarParser.CmdAtribContext ctx);
	/**
	 * Visit a parse tree produced by {@link GraceGrammarParser#atrib}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAtrib(GraceGrammarParser.AtribContext ctx);
	/**
	 * Visit a parse tree produced by {@link GraceGrammarParser#cmdIf}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCmdIf(GraceGrammarParser.CmdIfContext ctx);
	/**
	 * Visit a parse tree produced by {@link GraceGrammarParser#cmdWhile}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCmdWhile(GraceGrammarParser.CmdWhileContext ctx);
	/**
	 * Visit a parse tree produced by {@link GraceGrammarParser#cmdFor}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCmdFor(GraceGrammarParser.CmdForContext ctx);
	/**
	 * Visit a parse tree produced by {@link GraceGrammarParser#atribIni}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAtribIni(GraceGrammarParser.AtribIniContext ctx);
	/**
	 * Visit a parse tree produced by {@link GraceGrammarParser#atribPasso}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAtribPasso(GraceGrammarParser.AtribPassoContext ctx);
	/**
	 * Visit a parse tree produced by {@link GraceGrammarParser#cmdStop}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCmdStop(GraceGrammarParser.CmdStopContext ctx);
	/**
	 * Visit a parse tree produced by {@link GraceGrammarParser#cmdSkip}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCmdSkip(GraceGrammarParser.CmdSkipContext ctx);
	/**
	 * Visit a parse tree produced by {@link GraceGrammarParser#cmdReturn}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCmdReturn(GraceGrammarParser.CmdReturnContext ctx);
	/**
	 * Visit a parse tree produced by {@link GraceGrammarParser#cmdChamadaProc}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCmdChamadaProc(GraceGrammarParser.CmdChamadaProcContext ctx);
	/**
	 * Visit a parse tree produced by {@link GraceGrammarParser#listaExpressao}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitListaExpressao(GraceGrammarParser.ListaExpressaoContext ctx);
	/**
	 * Visit a parse tree produced by {@link GraceGrammarParser#cmdRead}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCmdRead(GraceGrammarParser.CmdReadContext ctx);
	/**
	 * Visit a parse tree produced by {@link GraceGrammarParser#cmdWrite}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCmdWrite(GraceGrammarParser.CmdWriteContext ctx);
	/**
	 * Visit a parse tree produced by {@link GraceGrammarParser#variavel}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitVariavel(GraceGrammarParser.VariavelContext ctx);
	/**
	 * Visit a parse tree produced by {@link GraceGrammarParser#expressao}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExpressao(GraceGrammarParser.ExpressaoContext ctx);
	/**
	 * Visit a parse tree produced by {@link GraceGrammarParser#chamadaFuncao}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitChamadaFuncao(GraceGrammarParser.ChamadaFuncaoContext ctx);
}