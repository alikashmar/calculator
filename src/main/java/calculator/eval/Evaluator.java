package calculator.eval;

import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.CharStreams;
import org.antlr.v4.runtime.CommonTokenStream;

import calculator.antlr.CalculatorLexer;
import calculator.antlr.CalculatorParser;

public class Evaluator {

	/**
	 * Evaluates the expression provided
	 * 
	 * @param exp the expression to evaluate
	 * @return the result of the evaluation
	 */
	public int evaluate(String exp) {
		CharStream input = CharStreams.fromString(exp); 
		CalculatorLexer lexer = new CalculatorLexer(input);
		CommonTokenStream stream = new CommonTokenStream(lexer);
		CalculatorParser parser = new CalculatorParser(stream);

        CalculatorVisitor calcVisitor = new CalculatorVisitor();
        return calcVisitor.visit(parser.exp());
	}
}
