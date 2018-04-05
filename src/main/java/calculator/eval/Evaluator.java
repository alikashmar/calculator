package calculator.eval;

import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.CharStreams;
import org.antlr.v4.runtime.CommonTokenStream;
import org.antlr.v4.runtime.misc.ParseCancellationException;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import calculator.antlr.CalculatorLexer;
import calculator.antlr.CalculatorParser;

public class Evaluator {

	static Logger log = LogManager.getLogger(Evaluator.class);

	/**
	 * Evaluates the expression provided
	 * 
	 * @param exp
	 *            the expression to evaluate
	 * @return the result of the evaluation
	 */
	public int evaluate(String exp) throws ParseCancellationException {
		log.debug("creating character stream");
		CharStream input = CharStreams.fromString(exp);
		
		log.debug("creating lexer");
		CalculatorLexer lexer = new CalculatorLexer(input);
		lexer.removeErrorListeners();
		lexer.addErrorListener(ThrowingErrorListener.INSTANCE);

		log.debug("lexing expression");
		CommonTokenStream stream = new CommonTokenStream(lexer);

		log.debug("creating parser");
		CalculatorParser parser = new CalculatorParser(stream);
		parser.removeErrorListeners();
		parser.addErrorListener(ThrowingErrorListener.INSTANCE);

		log.debug("parsing expression and evaluating through visitor");
		CalculatorVisitor calcVisitor = new CalculatorVisitor();
		return calcVisitor.visit(parser.exp());
	}
}
