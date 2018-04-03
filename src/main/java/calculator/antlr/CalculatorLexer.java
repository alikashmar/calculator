// Generated from Calculator.g4 by ANTLR 4.3

package calculator.antlr;

import org.antlr.v4.runtime.Lexer;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.TokenStream;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.misc.*;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class CalculatorLexer extends Lexer {
	static { RuntimeMetaData.checkVersion("4.3", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		NUMBER=1, VARNAME=2, LET=3, OPERATION=4, LPAREN=5, RPAREN=6, COMMA=7, 
		WHITESPACE=8;
	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	public static final String[] tokenNames = {
		"'\\u0000'", "'\\u0001'", "'\\u0002'", "'\\u0003'", "'\\u0004'", "'\\u0005'", 
		"'\\u0006'", "'\\u0007'", "'\b'"
	};
	public static final String[] ruleNames = {
		"NUMBER", "VARNAME", "LET", "OPERATION", "LPAREN", "RPAREN", "COMMA", 
		"WHITESPACE"
	};


	public CalculatorLexer(CharStream input) {
		super(input);
		_interp = new LexerATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@Override
	public String getGrammarFileName() { return "Calculator.g4"; }

	@Override
	public String[] getTokenNames() { return tokenNames; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public String[] getModeNames() { return modeNames; }

	@Override
	public ATN getATN() { return _ATN; }

	public static final String _serializedATN =
		"\3\u0430\ud6d1\u8206\uad2d\u4417\uaef1\u8d80\uaadd\2\nB\b\1\4\2\t\2\4"+
		"\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\3\2\6\2\25\n\2"+
		"\r\2\16\2\26\3\2\3\2\6\2\33\n\2\r\2\16\2\34\5\2\37\n\2\3\3\3\3\3\4\3\4"+
		"\3\4\3\4\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\5\5\64\n"+
		"\5\3\6\3\6\3\7\3\7\3\b\3\b\3\t\6\t=\n\t\r\t\16\t>\3\t\3\t\2\2\n\3\3\5"+
		"\4\7\5\t\6\13\7\r\b\17\t\21\n\3\2\4\4\2C\\c|\5\2\13\f\16\17\"\"H\2\3\3"+
		"\2\2\2\2\5\3\2\2\2\2\7\3\2\2\2\2\t\3\2\2\2\2\13\3\2\2\2\2\r\3\2\2\2\2"+
		"\17\3\2\2\2\2\21\3\2\2\2\3\24\3\2\2\2\5 \3\2\2\2\7\"\3\2\2\2\t\63\3\2"+
		"\2\2\13\65\3\2\2\2\r\67\3\2\2\2\179\3\2\2\2\21<\3\2\2\2\23\25\4\62;\2"+
		"\24\23\3\2\2\2\25\26\3\2\2\2\26\24\3\2\2\2\26\27\3\2\2\2\27\36\3\2\2\2"+
		"\30\32\7\60\2\2\31\33\4\62;\2\32\31\3\2\2\2\33\34\3\2\2\2\34\32\3\2\2"+
		"\2\34\35\3\2\2\2\35\37\3\2\2\2\36\30\3\2\2\2\36\37\3\2\2\2\37\4\3\2\2"+
		"\2 !\t\2\2\2!\6\3\2\2\2\"#\7n\2\2#$\7g\2\2$%\7v\2\2%\b\3\2\2\2&\'\7c\2"+
		"\2\'(\7f\2\2(\64\7f\2\2)*\7u\2\2*+\7w\2\2+\64\7d\2\2,-\7o\2\2-.\7w\2\2"+
		"./\7n\2\2/\64\7v\2\2\60\61\7f\2\2\61\62\7k\2\2\62\64\7x\2\2\63&\3\2\2"+
		"\2\63)\3\2\2\2\63,\3\2\2\2\63\60\3\2\2\2\64\n\3\2\2\2\65\66\7*\2\2\66"+
		"\f\3\2\2\2\678\7+\2\28\16\3\2\2\29:\7.\2\2:\20\3\2\2\2;=\t\3\2\2<;\3\2"+
		"\2\2=>\3\2\2\2><\3\2\2\2>?\3\2\2\2?@\3\2\2\2@A\b\t\2\2A\22\3\2\2\2\b\2"+
		"\26\34\36\63>\3\b\2\2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}