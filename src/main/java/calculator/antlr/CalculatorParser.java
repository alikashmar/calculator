// Generated from Calculator.g4 by ANTLR 4.7.1

package calculator.antlr;

import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class CalculatorParser extends Parser {
	static { RuntimeMetaData.checkVersion("4.7.1", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		NUMBER=1, VARNAME=2, LET=3, OPERATION=4, LPAREN=5, RPAREN=6, COMMA=7, 
		WHITESPACE=8;
	public static final int
		RULE_exp = 0, RULE_letexp = 1, RULE_mathexp = 2;
	public static final String[] ruleNames = {
		"exp", "letexp", "mathexp"
	};

	private static final String[] _LITERAL_NAMES = {
		null, null, null, "'let'", null, "'('", "')'", "','"
	};
	private static final String[] _SYMBOLIC_NAMES = {
		null, "NUMBER", "VARNAME", "LET", "OPERATION", "LPAREN", "RPAREN", "COMMA", 
		"WHITESPACE"
	};
	public static final Vocabulary VOCABULARY = new VocabularyImpl(_LITERAL_NAMES, _SYMBOLIC_NAMES);

	/**
	 * @deprecated Use {@link #VOCABULARY} instead.
	 */
	@Deprecated
	public static final String[] tokenNames;
	static {
		tokenNames = new String[_SYMBOLIC_NAMES.length];
		for (int i = 0; i < tokenNames.length; i++) {
			tokenNames[i] = VOCABULARY.getLiteralName(i);
			if (tokenNames[i] == null) {
				tokenNames[i] = VOCABULARY.getSymbolicName(i);
			}

			if (tokenNames[i] == null) {
				tokenNames[i] = "<INVALID>";
			}
		}
	}

	@Override
	@Deprecated
	public String[] getTokenNames() {
		return tokenNames;
	}

	@Override

	public Vocabulary getVocabulary() {
		return VOCABULARY;
	}

	@Override
	public String getGrammarFileName() { return "Calculator.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public CalculatorParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}
	public static class ExpContext extends ParserRuleContext {
		public int result;
		public LetexpContext letexp() {
			return getRuleContext(LetexpContext.class,0);
		}
		public MathexpContext mathexp() {
			return getRuleContext(MathexpContext.class,0);
		}
		public TerminalNode NUMBER() { return getToken(CalculatorParser.NUMBER, 0); }
		public TerminalNode VARNAME() { return getToken(CalculatorParser.VARNAME, 0); }
		public ExpContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_exp; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CalculatorVisitor ) return ((CalculatorVisitor<? extends T>)visitor).visitExp(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ExpContext exp() throws RecognitionException {
		ExpContext _localctx = new ExpContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_exp);
		try {
			setState(10);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case LET:
				enterOuterAlt(_localctx, 1);
				{
				setState(6);
				letexp();
				}
				break;
			case OPERATION:
				enterOuterAlt(_localctx, 2);
				{
				setState(7);
				mathexp();
				}
				break;
			case NUMBER:
				enterOuterAlt(_localctx, 3);
				{
				setState(8);
				match(NUMBER);
				}
				break;
			case VARNAME:
				enterOuterAlt(_localctx, 4);
				{
				setState(9);
				match(VARNAME);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class LetexpContext extends ParserRuleContext {
		public int result;
		public TerminalNode LET() { return getToken(CalculatorParser.LET, 0); }
		public TerminalNode LPAREN() { return getToken(CalculatorParser.LPAREN, 0); }
		public TerminalNode VARNAME() { return getToken(CalculatorParser.VARNAME, 0); }
		public List<TerminalNode> COMMA() { return getTokens(CalculatorParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(CalculatorParser.COMMA, i);
		}
		public List<ExpContext> exp() {
			return getRuleContexts(ExpContext.class);
		}
		public ExpContext exp(int i) {
			return getRuleContext(ExpContext.class,i);
		}
		public TerminalNode RPAREN() { return getToken(CalculatorParser.RPAREN, 0); }
		public LetexpContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_letexp; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CalculatorVisitor ) return ((CalculatorVisitor<? extends T>)visitor).visitLetexp(this);
			else return visitor.visitChildren(this);
		}
	}

	public final LetexpContext letexp() throws RecognitionException {
		LetexpContext _localctx = new LetexpContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_letexp);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(12);
			match(LET);
			setState(13);
			match(LPAREN);
			setState(14);
			match(VARNAME);
			setState(15);
			match(COMMA);
			setState(16);
			exp();
			setState(17);
			match(COMMA);
			setState(18);
			exp();
			setState(19);
			match(RPAREN);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class MathexpContext extends ParserRuleContext {
		public int result;
		public TerminalNode OPERATION() { return getToken(CalculatorParser.OPERATION, 0); }
		public TerminalNode LPAREN() { return getToken(CalculatorParser.LPAREN, 0); }
		public List<ExpContext> exp() {
			return getRuleContexts(ExpContext.class);
		}
		public ExpContext exp(int i) {
			return getRuleContext(ExpContext.class,i);
		}
		public TerminalNode COMMA() { return getToken(CalculatorParser.COMMA, 0); }
		public TerminalNode RPAREN() { return getToken(CalculatorParser.RPAREN, 0); }
		public MathexpContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_mathexp; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CalculatorVisitor ) return ((CalculatorVisitor<? extends T>)visitor).visitMathexp(this);
			else return visitor.visitChildren(this);
		}
	}

	public final MathexpContext mathexp() throws RecognitionException {
		MathexpContext _localctx = new MathexpContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_mathexp);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(21);
			match(OPERATION);
			setState(22);
			match(LPAREN);
			setState(23);
			exp();
			setState(24);
			match(COMMA);
			setState(25);
			exp();
			setState(26);
			match(RPAREN);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static final String _serializedATN =
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\3\n\37\4\2\t\2\4\3"+
		"\t\3\4\4\t\4\3\2\3\2\3\2\3\2\5\2\r\n\2\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3"+
		"\3\3\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\2\2\5\2\4\6\2\2\2\36\2\f\3\2\2\2"+
		"\4\16\3\2\2\2\6\27\3\2\2\2\b\r\5\4\3\2\t\r\5\6\4\2\n\r\7\3\2\2\13\r\7"+
		"\4\2\2\f\b\3\2\2\2\f\t\3\2\2\2\f\n\3\2\2\2\f\13\3\2\2\2\r\3\3\2\2\2\16"+
		"\17\7\5\2\2\17\20\7\7\2\2\20\21\7\4\2\2\21\22\7\t\2\2\22\23\5\2\2\2\23"+
		"\24\7\t\2\2\24\25\5\2\2\2\25\26\7\b\2\2\26\5\3\2\2\2\27\30\7\6\2\2\30"+
		"\31\7\7\2\2\31\32\5\2\2\2\32\33\7\t\2\2\33\34\5\2\2\2\34\35\7\b\2\2\35"+
		"\7\3\2\2\2\3\f";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}