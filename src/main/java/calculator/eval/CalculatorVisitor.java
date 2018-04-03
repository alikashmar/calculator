package calculator.eval;

import java.util.HashMap;

import calculator.antlr.CalculatorBaseVisitor;
import calculator.antlr.CalculatorParser.ExpContext;
import calculator.antlr.CalculatorParser.LetexpContext;
import calculator.antlr.CalculatorParser.MathexpContext;

public class CalculatorVisitor extends CalculatorBaseVisitor<Integer> {

	private HashMap<String, Integer> variables = new HashMap<String, Integer>();

	@Override
	public Integer visitLetexp(LetexpContext ctx) {
		variables.put(ctx.VARNAME().getText(), visit(ctx.exp(0)));
		return visit(ctx.exp(1));
	}

	@Override
	public Integer visitMathexp(MathexpContext ctx) {
		String op = ctx.OPERATION().getText();
		switch(op) {
		case "add":
			return visit(ctx.exp(0)) + visit(ctx.exp(1));
		case "sub":
			return visit(ctx.exp(0)) - visit(ctx.exp(1));
		case "mult":
			return visit(ctx.exp(0)) * visit(ctx.exp(1));
		case "div":
			return (int) (visit(ctx.exp(0)) / visit(ctx.exp(1)));
		default:
			throw new IllegalStateException("should not be here");
		}
	}

	@Override
	public Integer visitExp(ExpContext ctx) {
		if (ctx.VARNAME() != null) {
			return variables.get(ctx.VARNAME().getText());
		} else if(ctx.NUMBER() != null) {
			return Integer.parseInt(ctx.NUMBER().getText());
		} else if (ctx.mathexp() != null) {
			return visit(ctx.mathexp());
		} else if (ctx.letexp() != null) {
			return visit(ctx.letexp());
		}
		return null;
	}

}
