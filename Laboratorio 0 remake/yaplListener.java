// Generated from yapl.g4 by ANTLR 4.10.1
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link yaplParser}.
 */
public interface yaplListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link yaplParser#tipoVariable}.
	 * @param ctx the parse tree
	 */
	void enterTipoVariable(yaplParser.TipoVariableContext ctx);
	/**
	 * Exit a parse tree produced by {@link yaplParser#tipoVariable}.
	 * @param ctx the parse tree
	 */
	void exitTipoVariable(yaplParser.TipoVariableContext ctx);
	/**
	 * Enter a parse tree produced by {@link yaplParser#start}.
	 * @param ctx the parse tree
	 */
	void enterStart(yaplParser.StartContext ctx);
	/**
	 * Exit a parse tree produced by {@link yaplParser#start}.
	 * @param ctx the parse tree
	 */
	void exitStart(yaplParser.StartContext ctx);
	/**
	 * Enter a parse tree produced by {@link yaplParser#clase}.
	 * @param ctx the parse tree
	 */
	void enterClase(yaplParser.ClaseContext ctx);
	/**
	 * Exit a parse tree produced by {@link yaplParser#clase}.
	 * @param ctx the parse tree
	 */
	void exitClase(yaplParser.ClaseContext ctx);
	/**
	 * Enter a parse tree produced by {@link yaplParser#feature_clases}.
	 * @param ctx the parse tree
	 */
	void enterFeature_clases(yaplParser.Feature_clasesContext ctx);
	/**
	 * Exit a parse tree produced by {@link yaplParser#feature_clases}.
	 * @param ctx the parse tree
	 */
	void exitFeature_clases(yaplParser.Feature_clasesContext ctx);
	/**
	 * Enter a parse tree produced by {@link yaplParser#nombreAtributo}.
	 * @param ctx the parse tree
	 */
	void enterNombreAtributo(yaplParser.NombreAtributoContext ctx);
	/**
	 * Exit a parse tree produced by {@link yaplParser#nombreAtributo}.
	 * @param ctx the parse tree
	 */
	void exitNombreAtributo(yaplParser.NombreAtributoContext ctx);
	/**
	 * Enter a parse tree produced by {@link yaplParser#nombreMetodo}.
	 * @param ctx the parse tree
	 */
	void enterNombreMetodo(yaplParser.NombreMetodoContext ctx);
	/**
	 * Exit a parse tree produced by {@link yaplParser#nombreMetodo}.
	 * @param ctx the parse tree
	 */
	void exitNombreMetodo(yaplParser.NombreMetodoContext ctx);
	/**
	 * Enter a parse tree produced by {@link yaplParser#asignacion}.
	 * @param ctx the parse tree
	 */
	void enterAsignacion(yaplParser.AsignacionContext ctx);
	/**
	 * Exit a parse tree produced by {@link yaplParser#asignacion}.
	 * @param ctx the parse tree
	 */
	void exitAsignacion(yaplParser.AsignacionContext ctx);
	/**
	 * Enter a parse tree produced by {@link yaplParser#operacion}.
	 * @param ctx the parse tree
	 */
	void enterOperacion(yaplParser.OperacionContext ctx);
	/**
	 * Exit a parse tree produced by {@link yaplParser#operacion}.
	 * @param ctx the parse tree
	 */
	void exitOperacion(yaplParser.OperacionContext ctx);
	/**
	 * Enter a parse tree produced by {@link yaplParser#self}.
	 * @param ctx the parse tree
	 */
	void enterSelf(yaplParser.SelfContext ctx);
	/**
	 * Exit a parse tree produced by {@link yaplParser#self}.
	 * @param ctx the parse tree
	 */
	void exitSelf(yaplParser.SelfContext ctx);
	/**
	 * Enter a parse tree produced by {@link yaplParser#declararAtributo}.
	 * @param ctx the parse tree
	 */
	void enterDeclararAtributo(yaplParser.DeclararAtributoContext ctx);
	/**
	 * Exit a parse tree produced by {@link yaplParser#declararAtributo}.
	 * @param ctx the parse tree
	 */
	void exitDeclararAtributo(yaplParser.DeclararAtributoContext ctx);
	/**
	 * Enter a parse tree produced by {@link yaplParser#inicializar}.
	 * @param ctx the parse tree
	 */
	void enterInicializar(yaplParser.InicializarContext ctx);
	/**
	 * Exit a parse tree produced by {@link yaplParser#inicializar}.
	 * @param ctx the parse tree
	 */
	void exitInicializar(yaplParser.InicializarContext ctx);
	/**
	 * Enter a parse tree produced by {@link yaplParser#metodo}.
	 * @param ctx the parse tree
	 */
	void enterMetodo(yaplParser.MetodoContext ctx);
	/**
	 * Exit a parse tree produced by {@link yaplParser#metodo}.
	 * @param ctx the parse tree
	 */
	void exitMetodo(yaplParser.MetodoContext ctx);
}