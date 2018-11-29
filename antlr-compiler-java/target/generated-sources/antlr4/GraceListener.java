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