package calculator;

import calculator.eval.Evaluator;

public class Main {

	public static void main(String[] args) {
		if (args.length == 0) {
			System.err.println("Usage: java calculator.Main <expression>");
			System.exit(1);
		}
		
		Evaluator eval = new Evaluator();
		System.out.println(eval.evaluate(args[0]));
	}

}
