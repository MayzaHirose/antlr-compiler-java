grammar Grace;
/*
 * Parser Rules
 */
 
 start					: 'Mayza' STRING COMENTARIOS ;
 
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
 
 INTEGER				: NUMBER+ ;
 BOOLEAN				: ('true' | 'false') ;
 STRING					: '"' (LOWERCASE | UPPERCASE | ESCAPED_QUOTE | WHITESPACE | NUMBER | ASCII)+ '"' ;
 IGNORAR 				: [ \t\r\n]+ -> skip ;
 COMENTARIOS			: '//' (LOWERCASE | UPPERCASE | ESCAPED_QUOTE | WHITESPACE | NUMBER | ASCII)+ '\n' -> skip ;