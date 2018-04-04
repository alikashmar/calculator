package calculator;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.fail;

import org.junit.Test;

import calculator.eval.Evaluator;

public class EvaluatorTest {

	@Test
	public void testAdd() {
		Evaluator eval = new Evaluator();
		int result = eval.evaluate("add(1, 2)");
		assertEquals(3, result);
	}

	@Test
	public void testSubtract() {
		Evaluator eval = new Evaluator();
		int result = eval.evaluate("sub(2, 1)");
		assertEquals(1, result);
	}

	@Test
	public void testMult() {
		Evaluator eval = new Evaluator();
		int result = eval.evaluate("mult(5, 6)");
		assertEquals(30, result);
	}

	@Test
	public void testDiv() {
		Evaluator eval = new Evaluator();
		int result = eval.evaluate("div(12, 2)");
		assertEquals(6, result);
	}

	@Test
	public void testAddMult() {
		Evaluator eval = new Evaluator();
		int result = eval.evaluate("add(1, mult(2, 3))");
		assertEquals(7, result);
	}

	@Test
	public void testMultDiv() {
		Evaluator eval = new Evaluator();
		int result = eval.evaluate("mult(add(2, 2), div(9, 3))");
		assertEquals(12, result);
	}

	@Test
	public void testLetAdd() {
		Evaluator eval = new Evaluator();
		int result = eval.evaluate("let(a, 5, add(a, a))");
		assertEquals(10, result);
	}

	@Test
	public void testComplex1() {
		Evaluator eval = new Evaluator();
		int result = eval.evaluate("let(a, 5, let(b, mult(a, 10), add(b, a)))");
		assertEquals(55, result);
	}

	@Test
	public void testComplex2() {
		Evaluator eval = new Evaluator();
		int result = eval.evaluate("let(a, let(b, 10, add(b, b)), let(b, 20, add(a, b)))");
		assertEquals(40, result);
	}

	@Test
	public void testParsingFailure() {
		Evaluator eval = new Evaluator();
		try {
			eval.evaluate("let(a, let(b, 10, add(b, b)), let(b, 20, add(a, b))");
			fail("should have seen a parsing error");
		} catch(Exception ex) {
			
		}
	}
	
}
