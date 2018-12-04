grammar Grace;
/*
 * Parser Rules
 */
 
 start					: declaracao+ ;
 declaracao				: (decVar | decSub) ;
 decVar					: VAR_KW listaSpecVars COLON tipo SEMICOLON ;
 listaSpecVars			: specVar ((COMMA specVar)+)? ;
 tipo					: (BOOL_KW | INT_KW | STRING_KW | (STRING_KW memoriaReservada)) ;
 specVar				: (specVarSimples | specVarSimplesIni | specVarArranjo | specVarArranjoIni) ;
 specVarSimples			: IDENTIFIER ;
 specVarSimplesIni		: IDENTIFIER ATTRIB (operacaoAritmetica | INTEGER | BOOLEAN | STRING) ;
 specVarArranjo			: IDENTIFIER memoriaReservada ;
 specVarArranjoIni		: IDENTIFIER memoriaReservada ATTRIB CBRACES_OPEN (INTEGER | BOOLEAN | STRING) ((COMMA (INTEGER | BOOLEAN | STRING))+)? CBRACES_CLOSE;
 operacaoAritmetica		: (INTEGER | IDENTIFIER) OP_ARITMETICO (INTEGER | IDENTIFIER) ((OP_ARITMETICO (INTEGER | IDENTIFIER))+)?;
 memoriaReservada		: BRACKETS_OPEN INTEGER BRACKETS_CLOSE ;
 decSub					: IDENTIFIER ;
 
 /*
 * Lexer Rules
 */
 
 fragment LOWERCASE		: [a-z]+ ;
 fragment UPPERCASE		: [A-Z]+ ;
 fragment NUMBER		: [0-9] ;
 fragment ASCII         : [\u0000-\u007F];
 fragment ESCAPED_QUOTE : '\\"' ;
 fragment WHITESPACE	: ' ' ;
 
 BOOL_KW				: 'bool' ;
 DEF_KW					: 'def' ;
 ELSE_KW				: 'else' ;
 FOR_KW					: 'for' ;
 IF_KW					: 'if' ;
 INT_KW					: 'int' ;
 READ_KW				: 'read' ;
 RETURN_KW				: 'return' ;
 SKIP_KW				: 'skip' ;
 STOP_KW				: 'stop' ;
 STRING_KW				: 'string' ;
 VAR_KW					: 'var' ;
 WHILE_KW				: 'while' ;
 WRITE_KW				: 'write' ;
 
 OP_ARITMETICO 			: (PLUS | MINUS | TIMES | DIV | REMAINDER) ;
 PAREN_OPEN				: '(' ;
 PAREN_CLOSE			: ')' ;
 BRACKETS_OPEN			: '[' ;
 BRACKETS_CLOSE			: ']' ;
 CBRACES_OPEN			: '{' ;
 CBRACES_CLOSE			: '}' ;
 COMMA					: ',' ;
 COLON					: ':' ;
 SEMICOLON				: ';' ;
 PLUS					: '+' ;
 MINUS					: '-' ;
 TIMES					: '*' ;
 DIV					: '/' ;
 REMAINDER				: '%' ;
 EQUAL					: '==' ;
 NEQUAL					: '!=' ;
 GREATER				: '>' ;
 GREATER_OR_EQUAL		: '>=' ;
 OR						: '||' ;
 AND					: '&&' ;
 NOT					: '!' ;
 ATTRIB					: '=' ;
 ATTRIB_PLUS			: '+=' ;
 ATTRIB_MINUS			: '-=' ;
 ATTRIB_TIMES			: '*=' ;
 ATTRIB_DIV				: '/=' ;
 ATTRIB_PERCENT			: '%=' ;
 TERNARY				: '?' ;
 
 
 INTEGER				: NUMBER+ ;
 BOOLEAN				: (TRUE | FALSE) ;
 TRUE  					: 'true' ;
 FALSE 					: 'false' ;
 STRING					: '"' (LOWERCASE | UPPERCASE | ESCAPED_QUOTE | WHITESPACE | NUMBER)+ '"' ;
 COMMENT				: '//' ~[\r\n]* -> skip ;
 IGNORE 				: [ \t\r\n]+ -> skip ;
 IDENTIFIER				: ('_' | LOWERCASE | UPPERCASE) (('_' | LOWERCASE |UPPERCASE | NUMBER)+)? ;