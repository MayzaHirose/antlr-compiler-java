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
	 * Enter a parse tree produced by {@link GraceParser#operacaoAritmetica}.
	 * @param ctx the parse tree
	 */
	void enterOperacaoAritmetica(GraceParser.OperacaoAritmeticaContext ctx);
	/**
	 * Exit a parse tree produced by {@link GraceParser#operacaoAritmetica}.
	 * @param ctx the parse tree
	 */
	void exitOperacaoAritmetica(GraceParser.OperacaoAritmeticaContext ctx);
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
}