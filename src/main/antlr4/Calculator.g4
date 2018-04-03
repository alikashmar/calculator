grammar Calculator;

@header {
package calculator.antlr;
}

/* Parser rules */
exp	returns [int result]	
	: letexp | mathexp | NUMBER | VARNAME;
	
letexp returns [int result]
	: LET LPAREN VARNAME COMMA exp COMMA exp RPAREN;
	
mathexp returns [int result]
	: OPERATION LPAREN exp COMMA exp RPAREN;


/* Lexer rules */
NUMBER		: ('0'..'9')+ ('.' ('0'..'9')+)?;
VARNAME 	: [a-zA-Z];
LET			: 'let';
OPERATION	: 'add' | 'sub' | 'mult' | 'div';
LPAREN		: '(';
RPAREN		: ')';
COMMA		: ',';


/* We're going to ignore all white space characters */
WHITESPACE 	: ( '\t' | ' ' | '\r' | '\n'| '\u000C' )+ -> skip ;