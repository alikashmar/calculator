package calculator.eval;

import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.CharStreams;
import org.antlr.v4.runtime.CommonTokenStream;
import org.antlr.v4.runtime.misc.ParseCancellationException;

import calculator.antlr.CalculatorLexer;
import calculator.antlr.CalculatorParser;

public class Evaluator {

	/**
	 * Evaluates the expression provided
	 * 
	 * @param exp
	 *            the expression to evaluate
	 * @return the result of the evaluation
	 */
	public int evaluate(String exp) throws ParseCancellationException {
		CharStream input = CharStreams.fromString(exp);
		CalculatorLexer lexer = new CalculatorLexer(input);
		lexer.removeErrorListeners();
		lexer.addErrorListener(ThrowingErrorListener.INSTANCE);

		CommonTokenStream stream = new CommonTokenStream(lexer);

		CalculatorParser parser = new CalculatorParser(stream);
		parser.removeErrorListeners();
		parser.addErrorListener(ThrowingErrorListener.INSTANCE);

		CalculatorVisitor calcVisitor = new CalculatorVisitor();
		return calcVisitor.visit(parser.exp());
	}
}
