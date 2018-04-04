// Generated from Calculator.g4 by ANTLR 4.7.1

package calculator.antlr;

import org.antlr.v4.runtime.tree.ParseTreeVisitor;

/**
 * This interface defines a complete generic visitor for a parse tree produced
 * by {@link CalculatorParser}.
 *
 * @param <T> The return type of the visit operation. Use {@link Void} for
 * operations with no return type.
 */
public interface CalculatorVisitor<T> extends ParseTreeVisitor<T> {
	/**
	 * Visit a parse tree produced by {@link CalculatorParser#exp}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExp(CalculatorParser.ExpContext ctx);
	/**
	 * Visit a parse tree produced by {@link CalculatorParser#letexp}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLetexp(CalculatorParser.LetexpContext ctx);
	/**
	 * Visit a parse tree produced by {@link CalculatorParser#mathexp}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMathexp(CalculatorParser.MathexpContext ctx);
}