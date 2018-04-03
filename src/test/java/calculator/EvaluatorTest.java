package calculator;

import org.junit.Test;

import calculator.eval.Evaluator;
import junit.framework.Assert;

public class EvaluatorTest {

	@Test
	public void testAdd() {
		Evaluator eval = new Evaluator();
		int result = eval.evaluate("add(1, 2)");
		Assert.assertEquals(3, result);
	}

	@Test
	public void testSubtract() {
		Evaluator eval = new Evaluator();
		int result = eval.evaluate("sub(2, 1)");
		Assert.assertEquals(1, result);
	}

	@Test
	public void testMult() {
		Evaluator eval = new Evaluator();
		int result = eval.evaluate("mult(5, 6)");
		Assert.assertEquals(30, result);
	}

	@Test
	public void testDiv() {
		Evaluator eval = new Evaluator();
		int result = eval.evaluate("div(12, 2)");
		Assert.assertEquals(6, result);
	}

	@Test
	public void testAddMult() {
		Evaluator eval = new Evaluator();
		int result = eval.evaluate("add(1, mult(2, 3))");
		Assert.assertEquals(7, result);
	}

	@Test
	public void testMultDiv() {
		Evaluator eval = new Evaluator();
		int result = eval.evaluate("mult(add(2, 2), div(9, 3))");
		Assert.assertEquals(12, result);
	}

	@Test
	public void testLetAdd() {
		Evaluator eval = new Evaluator();
		int result = eval.evaluate("let(a, 5, add(a, a))");
		Assert.assertEquals(10, result);
	}

	@Test
	public void testComplex1() {
		Evaluator eval = new Evaluator();
		int result = eval.evaluate("let(a, 5, let(b, mult(a, 10), add(b, a)))");
		Assert.assertEquals(55, result);
	}

	@Test
	public void testComplex2() {
		Evaluator eval = new Evaluator();
		int result = eval.evaluate("let(a, let(b, 10, add(b, b)), let(b, 20, add(a, b)))");
		Assert.assertEquals(40, result);
	}
	
}
