// Generated from Grace.g4 by ANTLR 4.7.1
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link GraceParser}.
 */
public interface GraceListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link GraceParser#start}.
	 * @param ctx the parse tree
	 */
	void enterStart(GraceParser.StartContext ctx);
	/**
	 * Exit a parse tree produced by {@link GraceParser#start}.
	 * @param ctx the parse tree
	 */
	void exitStart(GraceParser.StartContext ctx);
	/**
	 * Enter a parse tree produced by {@link GraceParser#declaracao}.
	 * @param ctx the parse tree
	 */
	void enterDeclaracao(GraceParser.DeclaracaoContext ctx);
	/**
	 * Exit a parse tree produced by {@link GraceParser#declaracao}.
	 * @param ctx the parse tree
	 */
	void exitDeclaracao(GraceParser.DeclaracaoContext ctx);
	/**
	 * Enter a parse tree produced by {@link GraceParser#decVar}.
	 * @param ctx the parse tree
	 */
	void enterDecVar(GraceParser.DecVarContext ctx);
	/**
	 * Exit a parse tree produced by {@link GraceParser#decVar}.
	 * @param ctx the parse tree
	 */
	void exitDecVar(GraceParser.DecVarContext ctx);
	/**
	 * Enter a parse tree produced by {@link GraceParser#listaSpecVars}.
	 * @param ctx the parse tree
	 */
	void enterListaSpecVars(GraceParser.ListaSpecVarsContext ctx);
	/**
	 * Exit a parse tree produced by {@link GraceParser#listaSpecVars}.
	 * @param ctx the parse tree
	 */
	void exitListaSpecVars(GraceParser.ListaSpecVarsContext ctx);
	/**
	 * Enter a parse tree produced by {@link GraceParser#tipo}.
	 * @param ctx the parse tree
	 */
	void enterTipo(GraceParser.TipoContext ctx);
	/**
	 * Exit a parse tree produced by {@link GraceParser#tipo}.
	 * @param ctx the parse tree
	 */
	void exitTipo(GraceParser.TipoContext ctx);
	/**
	 * Enter a parse tree produced by {@link GraceParser#specVar}.
	 * @param ctx the parse tree
	 */
	void enterSpecVar(GraceParser.SpecVarContext ctx);
	/**
	 * Exit a parse tree produced by {@link GraceParser#specVar}.
	 * @param ctx the parse tree
	 */
	void exitSpecVar(GraceParser.SpecVarContext ctx);
	/**
	 * Enter a parse tree produced by {@link GraceParser#specVarSimples}.
	 * @param ctx the parse tree
	 */
	void enterSpecVarSimples(GraceParser.SpecVarSimplesContext ctx);
	/**
	 * Exit a parse tree produced by {@link GraceParser#specVarSimples}.
	 * @param ctx the parse tree
	 */
	void exitSpecVarSimples(GraceParser.SpecVarSimplesContext ctx);
	/**
	 * Enter a parse tree produced by {@link GraceParser#specVarSimplesIni}.
	 * @param ctx the parse tree
	 */
	void enterSpecVarSimplesIni(GraceParser.SpecVarSimplesIniContext ctx);
	/**
	 * Exit a parse tree produced by {@link GraceParser#specVarSimplesIni}.
	 * @param ctx the parse tree
	 */
	void exitSpecVarSimplesIni(GraceParser.SpecVarSimplesIniContext ctx);
	/**
	 * Enter a parse tree produced by {@link GraceParser#specVarArranjo}.
	 * @param ctx the parse tree
	 */
	void enterSpecVarArranjo(GraceParser.SpecVarArranjoContext ctx);
	/**
	 * Exit a parse tree produced by {@link GraceParser#specVarArranjo}.
	 * @param ctx the parse tree
	 */
	void exitSpecVarArranjo(GraceParser.SpecVarArranjoContext ctx);
	/**
	 * Enter a parse tree produced by {@link GraceParser#specVarArranjoIni}.
	 * @param ctx the parse tree
	 */
	void enterSpecVarArranjoIni(GraceParser.SpecVarArranjoIniContext ctx);
	/**
	 * Exit a parse tree produced by {@link GraceParser#specVarArranjoIni}.
	 * @param ctx the parse tree
	 */
	void exitSpecVarArranjoIni(GraceParser.SpecVarArranjoIniContext ctx);
	/**
	 * Enter a parse tree produced by {@link GraceParser#expVarSimplesIni}.
	 * @param ctx the parse tree
	 */
	void enterExpVarSimplesIni(GraceParser.ExpVarSimplesIniContext ctx);
	/**
	 * Exit a parse tree produced by {@link GraceParser#expVarSimplesIni}.
	 * @param ctx the parse tree
	 */
	void exitExpVarSimplesIni(GraceParser.ExpVarSimplesIniContext ctx);
	/**
	 * Enter a parse tree produced by {@link GraceParser#memoriaReservada}.
	 * @param ctx the parse tree
	 */
	void enterMemoriaReservada(GraceParser.MemoriaReservadaContext ctx);
	/**
	 * Exit a parse tree produced by {@link GraceParser#memoriaReservada}.
	 * @param ctx the parse tree
	 */
	void exitMemoriaReservada(GraceParser.MemoriaReservadaContext ctx);
	/**
	 * Enter a parse tree produced by {@link GraceParser#decSub}.
	 * @param ctx the parse tree
	 */
	void enterDecSub(GraceParser.DecSubContext ctx);
	/**
	 * Exit a parse tree produced by {@link GraceParser#decSub}.
	 * @param ctx the parse tree
	 */
	void exitDecSub(GraceParser.DecSubContext ctx);
	/**
	 * Enter a parse tree produced by {@link GraceParser#decProc}.
	 * @param ctx the parse tree
	 */
	void enterDecProc(GraceParser.DecProcContext ctx);
	/**
	 * Exit a parse tree produced by {@link GraceParser#decProc}.
	 * @param ctx the parse tree
	 */
	void exitDecProc(GraceParser.DecProcContext ctx);
	/**
	 * Enter a parse tree produced by {@link GraceParser#decFunc}.
	 * @param ctx the parse tree
	 */
	void enterDecFunc(GraceParser.DecFuncContext ctx);
	/**
	 * Exit a parse tree produced by {@link GraceParser#decFunc}.
	 * @param ctx the parse tree
	 */
	void exitDecFunc(GraceParser.DecFuncContext ctx);
	/**
	 * Enter a parse tree produced by {@link GraceParser#listaParametros}.
	 * @param ctx the parse tree
	 */
	void enterListaParametros(GraceParser.ListaParametrosContext ctx);
	/**
	 * Exit a parse tree produced by {@link GraceParser#listaParametros}.
	 * @param ctx the parse tree
	 */
	void exitListaParametros(GraceParser.ListaParametrosContext ctx);
	/**
	 * Enter a parse tree produced by {@link GraceParser#specParam}.
	 * @param ctx the parse tree
	 */
	void enterSpecParam(GraceParser.SpecParamContext ctx);
	/**
	 * Exit a parse tree produced by {@link GraceParser#specParam}.
	 * @param ctx the parse tree
	 */
	void exitSpecParam(GraceParser.SpecParamContext ctx);
	/**
	 * Enter a parse tree produced by {@link GraceParser#param}.
	 * @param ctx the parse tree
	 */
	void enterParam(GraceParser.ParamContext ctx);
	/**
	 * Exit a parse tree produced by {@link GraceParser#param}.
	 * @param ctx the parse tree
	 */
	void exitParam(GraceParser.ParamContext ctx);
	/**
	 * Enter a parse tree produced by {@link GraceParser#bloco}.
	 * @param ctx the parse tree
	 */
	void enterBloco(GraceParser.BlocoContext ctx);
	/**
	 * Exit a parse tree produced by {@link GraceParser#bloco}.
	 * @param ctx the parse tree
	 */
	void exitBloco(GraceParser.BlocoContext ctx);
	/**
	 * Enter a parse tree produced by {@link GraceParser#comando}.
	 * @param ctx the parse tree
	 */
	void enterComando(GraceParser.ComandoContext ctx);
	/**
	 * Exit a parse tree produced by {@link GraceParser#comando}.
	 * @param ctx the parse tree
	 */
	void exitComando(GraceParser.ComandoContext ctx);
	/**
	 * Enter a parse tree produced by {@link GraceParser#cmdSimples}.
	 * @param ctx the parse tree
	 */
	void enterCmdSimples(GraceParser.CmdSimplesContext ctx);
	/**
	 * Exit a parse tree produced by {@link GraceParser#cmdSimples}.
	 * @param ctx the parse tree
	 */
	void exitCmdSimples(GraceParser.CmdSimplesContext ctx);
	/**
	 * Enter a parse tree produced by {@link GraceParser#cmdAtrib}.
	 * @param ctx the parse tree
	 */
	void enterCmdAtrib(GraceParser.CmdAtribContext ctx);
	/**
	 * Exit a parse tree produced by {@link GraceParser#cmdAtrib}.
	 * @param ctx the parse tree
	 */
	void exitCmdAtrib(GraceParser.CmdAtribContext ctx);
	/**
	 * Enter a parse tree produced by {@link GraceParser#atrib}.
	 * @param ctx the parse tree
	 */
	void enterAtrib(GraceParser.AtribContext ctx);
	/**
	 * Exit a parse tree produced by {@link GraceParser#atrib}.
	 * @param ctx the parse tree
	 */
	void exitAtrib(GraceParser.AtribContext ctx);
	/**
	 * Enter a parse tree produced by {@link GraceParser#cmdIf}.
	 * @param ctx the parse tree
	 */
	void enterCmdIf(GraceParser.CmdIfContext ctx);
	/**
	 * Exit a parse tree produced by {@link GraceParser#cmdIf}.
	 * @param ctx the parse tree
	 */
	void exitCmdIf(GraceParser.CmdIfContext ctx);
	/**
	 * Enter a parse tree produced by {@link GraceParser#cmdWhile}.
	 * @param ctx the parse tree
	 */
	void enterCmdWhile(GraceParser.CmdWhileContext ctx);
	/**
	 * Exit a parse tree produced by {@link GraceParser#cmdWhile}.
	 * @param ctx the parse tree
	 */
	void exitCmdWhile(GraceParser.CmdWhileContext ctx);
	/**
	 * Enter a parse tree produced by {@link GraceParser#cmdFor}.
	 * @param ctx the parse tree
	 */
	void enterCmdFor(GraceParser.CmdForContext ctx);
	/**
	 * Exit a parse tree produced by {@link GraceParser#cmdFor}.
	 * @param ctx the parse tree
	 */
	void exitCmdFor(GraceParser.CmdForContext ctx);
	/**
	 * Enter a parse tree produced by {@link GraceParser#atribIni}.
	 * @param ctx the parse tree
	 */
	void enterAtribIni(GraceParser.AtribIniContext ctx);
	/**
	 * Exit a parse tree produced by {@link GraceParser#atribIni}.
	 * @param ctx the parse tree
	 */
	void exitAtribIni(GraceParser.AtribIniContext ctx);
	/**
	 * Enter a parse tree produced by {@link GraceParser#atribPasso}.
	 * @param ctx the parse tree
	 */
	void enterAtribPasso(GraceParser.AtribPassoContext ctx);
	/**
	 * Exit a parse tree produced by {@link GraceParser#atribPasso}.
	 * @param ctx the parse tree
	 */
	void exitAtribPasso(GraceParser.AtribPassoContext ctx);
	/**
	 * Enter a parse tree produced by {@link GraceParser#cmdStop}.
	 * @param ctx the parse tree
	 */
	void enterCmdStop(GraceParser.CmdStopContext ctx);
	/**
	 * Exit a parse tree produced by {@link GraceParser#cmdStop}.
	 * @param ctx the parse tree
	 */
	void exitCmdStop(GraceParser.CmdStopContext ctx);
	/**
	 * Enter a parse tree produced by {@link GraceParser#cmdSkip}.
	 * @param ctx the parse tree
	 */
	void enterCmdSkip(GraceParser.CmdSkipContext ctx);
	/**
	 * Exit a parse tree produced by {@link GraceParser#cmdSkip}.
	 * @param ctx the parse tree
	 */
	void exitCmdSkip(GraceParser.CmdSkipContext ctx);
	/**
	 * Enter a parse tree produced by {@link GraceParser#cmdReturn}.
	 * @param ctx the parse tree
	 */
	void enterCmdReturn(GraceParser.CmdReturnContext ctx);
	/**
	 * Exit a parse tree produced by {@link GraceParser#cmdReturn}.
	 * @param ctx the parse tree
	 */
	void exitCmdReturn(GraceParser.CmdReturnContext ctx);
	/**
	 * Enter a parse tree produced by {@link GraceParser#cmdChamadaProc}.
	 * @param ctx the parse tree
	 */
	void enterCmdChamadaProc(GraceParser.CmdChamadaProcContext ctx);
	/**
	 * Exit a parse tree produced by {@link GraceParser#cmdChamadaProc}.
	 * @param ctx the parse tree
	 */
	void exitCmdChamadaProc(GraceParser.CmdChamadaProcContext ctx);
	/**
	 * Enter a parse tree produced by {@link GraceParser#listaExpressao}.
	 * @param ctx the parse tree
	 */
	void enterListaExpressao(GraceParser.ListaExpressaoContext ctx);
	/**
	 * Exit a parse tree produced by {@link GraceParser#listaExpressao}.
	 * @param ctx the parse tree
	 */
	void exitListaExpressao(GraceParser.ListaExpressaoContext ctx);
	/**
	 * Enter a parse tree produced by {@link GraceParser#cmdRead}.
	 * @param ctx the parse tree
	 */
	void enterCmdRead(GraceParser.CmdReadContext ctx);
	/**
	 * Exit a parse tree produced by {@link GraceParser#cmdRead}.
	 * @param ctx the parse tree
	 */
	void exitCmdRead(GraceParser.CmdReadContext ctx);
	/**
	 * Enter a parse tree produced by {@link GraceParser#cmdWrite}.
	 * @param ctx the parse tree
	 */
	void enterCmdWrite(GraceParser.CmdWriteContext ctx);
	/**
	 * Exit a parse tree produced by {@link GraceParser#cmdWrite}.
	 * @param ctx the parse tree
	 */
	void exitCmdWrite(GraceParser.CmdWriteContext ctx);
	/**
	 * Enter a parse tree produced by {@link GraceParser#variavel}.
	 * @param ctx the parse tree
	 */
	void enterVariavel(GraceParser.VariavelContext ctx);
	/**
	 * Exit a parse tree produced by {@link GraceParser#variavel}.
	 * @param ctx the parse tree
	 */
	void exitVariavel(GraceParser.VariavelContext ctx);
	/**
	 * Enter a parse tree produced by {@link GraceParser#expressao}.
	 * @param ctx the parse tree
	 */
	void enterExpressao(GraceParser.ExpressaoContext ctx);
	/**
	 * Exit a parse tree produced by {@link GraceParser#expressao}.
	 * @param ctx the parse tree
	 */
	void exitExpressao(GraceParser.ExpressaoContext ctx);
	/**
	 * Enter a parse tree produced by {@link GraceParser#chamadaFuncao}.
	 * @param ctx the parse tree
	 */
	void enterChamadaFuncao(GraceParser.ChamadaFuncaoContext ctx);
	/**
	 * Exit a parse tree produced by {@link GraceParser#chamadaFuncao}.
	 * @param ctx the parse tree
	 */
	void exitChamadaFuncao(GraceParser.ChamadaFuncaoContext ctx);
}