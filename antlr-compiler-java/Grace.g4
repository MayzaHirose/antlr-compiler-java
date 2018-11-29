grammar Grace;
/*
 * Parser Rules
 */
 
 start					: declaracao CBRACES_OPEN declaracao CBRACES_CLOSE ;
 declaracao				: (decVar | decSub) ;
 decVar					: VAR_KW listaSpecVars COLON tipo SEMICOLON ;
 listaSpecVars			: IDENTIFIER ;
 tipo					: (BOOL_KW | INT_KW | STRING_KW) ;
 decSub					: IDENTIFIER ;
 
 /*
 * Lexer Rules
 */
 
 fragment LOWERCASE		: [a-z]+ ;
 fragment UPPERCASE		: [A-Z]+ ;
 fragment NUMBER		: [0-9] ;
 fragment ASCII         : [\u0000-\u007F];
 fragment ESCAPED_QUOTE : '\\"';
 fragment WHITESPACE	: ' ';
 
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
 PERCENT				: '%' ;
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
 
 IDENTIFIER				: ('_' | LOWERCASE | UPPERCASE) ('_' | LOWERCASE |UPPERCASE | NUMBER)+ ;
 
 INTEGER				: NUMBER+ ;
 BOOLEAN				: ('true' | 'false') ;
 STRING					: '"' (LOWERCASE | UPPERCASE | ESCAPED_QUOTE | WHITESPACE | NUMBER | ASCII)+ '"' ;
 IGNORE 				: [ \t\r\n]+ -> skip ;
 COMMENT				: '//' (LOWERCASE | UPPERCASE | ESCAPED_QUOTE | WHITESPACE | NUMBER | ASCII)+ '\n' -> skip ;