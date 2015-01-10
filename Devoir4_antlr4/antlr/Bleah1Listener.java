// Generated from Bleah1.g4 by ANTLR 4.4

//package ant2;
import java.util.HashMap;

import org.antlr.v4.runtime.misc.NotNull;
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link Bleah1Parser}.
 */
public interface Bleah1Listener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link Bleah1Parser#multExpr}.
	 * @param ctx the parse tree
	 */
	void enterMultExpr(@NotNull Bleah1Parser.MultExprContext ctx);
	/**
	 * Exit a parse tree produced by {@link Bleah1Parser#multExpr}.
	 * @param ctx the parse tree
	 */
	void exitMultExpr(@NotNull Bleah1Parser.MultExprContext ctx);
	/**
	 * Enter a parse tree produced by {@link Bleah1Parser#atom}.
	 * @param ctx the parse tree
	 */
	void enterAtom(@NotNull Bleah1Parser.AtomContext ctx);
	/**
	 * Exit a parse tree produced by {@link Bleah1Parser#atom}.
	 * @param ctx the parse tree
	 */
	void exitAtom(@NotNull Bleah1Parser.AtomContext ctx);
	/**
	 * Enter a parse tree produced by {@link Bleah1Parser#prog}.
	 * @param ctx the parse tree
	 */
	void enterProg(@NotNull Bleah1Parser.ProgContext ctx);
	/**
	 * Exit a parse tree produced by {@link Bleah1Parser#prog}.
	 * @param ctx the parse tree
	 */
	void exitProg(@NotNull Bleah1Parser.ProgContext ctx);
	/**
	 * Enter a parse tree produced by {@link Bleah1Parser#expr}.
	 * @param ctx the parse tree
	 */
	void enterExpr(@NotNull Bleah1Parser.ExprContext ctx);
	/**
	 * Exit a parse tree produced by {@link Bleah1Parser#expr}.
	 * @param ctx the parse tree
	 */
	void exitExpr(@NotNull Bleah1Parser.ExprContext ctx);
	/**
	 * Enter a parse tree produced by {@link Bleah1Parser#stat}.
	 * @param ctx the parse tree
	 */
	void enterStat(@NotNull Bleah1Parser.StatContext ctx);
	/**
	 * Exit a parse tree produced by {@link Bleah1Parser#stat}.
	 * @param ctx the parse tree
	 */
	void exitStat(@NotNull Bleah1Parser.StatContext ctx);
}