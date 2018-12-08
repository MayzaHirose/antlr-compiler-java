grammar Grace;
/*
 * Parser Rules
 */
 
 start					: declaracao+ ;
 declaracao				: (decVar | decSub) ;
 
 decVar					: VAR_KW listaSpecVars COLON (tipo | STRING_KW memoriaReservada) SEMICOLON ;
 listaSpecVars			: specVar ((COMMA specVar)+)? ;
 tipo					: (BOOL_KW | INT_KW | STRING_KW) ;
 specVar				: (specVarSimples | specVarSimplesIni | specVarArranjo | specVarArranjoIni) ;
 specVarSimples			: IDENTIFIER ;
 specVarSimplesIni		: IDENTIFIER ATTRIB (operacaoAritmetica | INTEGER | BOOLEAN | STRING) ;
 specVarArranjo			: IDENTIFIER memoriaReservada ;
 specVarArranjoIni		: IDENTIFIER memoriaReservada ATTRIB CBRACES_OPEN (INTEGER | BOOLEAN | STRING) ((COMMA (INTEGER | BOOLEAN | STRING))+)? CBRACES_CLOSE;
 operacaoAritmetica		: (INTEGER | IDENTIFIER) OP_ARITMETICO (INTEGER | IDENTIFIER) ((OP_ARITMETICO (INTEGER | IDENTIFIER))+)?;
 memoriaReservada		: BRACKETS_OPEN INTEGER? BRACKETS_CLOSE ;

 decSub					: (decProc | decFunc) ;
 
 decProc				: DEF_KW IDENTIFIER PAREN_OPEN listaParametros PAREN_CLOSE bloco ;
 decFunc				: DEF_KW IDENTIFIER PAREN_OPEN listaParametros PAREN_CLOSE COLON tipo bloco ;
 
 listaParametros		: specParam ((SEMICOLON specParam)+)? ;
 specParam				: param  ((COMMA param)+)? COLON tipo ;
 param					: (IDENTIFIER | IDENTIFIER BRACKETS_OPEN BRACKETS_CLOSE) ;
 bloco					: CBRACES_OPEN (declaracao+)? (comando+)? CBRACES_CLOSE ;
 comando				: (cmdSimples | cmdBloco) ;
 
 cmdSimples				: (cmdAtrib | cmdIf | cmdWhile | cmdFor);
 
 cmdAtrib				: atrib SEMICOLON ;
 atrib					: IDENTIFIER (ATTRIB | ATTRIB_PLUS | ATTRIB_MINUS | OP_ATRIBUICAO) expressao ;
 cmdIf					: IF_KW PAREN_OPEN expressao PAREN_CLOSE bloco (ELSE_KW bloco)? ;
 cmdWhile				: WHILE_KW PAREN_OPEN expressao PAREN_CLOSE bloco ;
 cmdFor					: FOR_KW PAREN_OPEN atribIni SEMICOLON expressao SEMICOLON atribPasso PAREN_CLOSE bloco ;
 atribIni				: IDENTIFIER ATTRIB INTEGER ;
 atribPasso				: IDENTIFIER (ATTRIB_PLUS | ATTRIB_MINUS) INTEGER ;
 
 cmdBloco				: AND ;
 
 expressao				: AND ;
 
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
 
 OP_ATRIBUICAO			: (ATTRIB_TIMES | ATTRIB_DIV | ATTRIB_REMAINDER) ;
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
 ATTRIB_PLUS			: '+=' ;
 ATTRIB_MINUS			: '-=' ;
 ATTRIB_TIMES			: '*=' ;
 ATTRIB_DIV				: '/=' ;
 ATTRIB_REMAINDER		: '%=' ;
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
 TERNARY				: '?' ;
 
 
 INTEGER				: NUMBER+ ;
 BOOLEAN				: (TRUE | FALSE) ;
 TRUE  					: 'true' ;
 FALSE 					: 'false' ;
 STRING					: '"' (LOWERCASE | UPPERCASE | ESCAPED_QUOTE | WHITESPACE | NUMBER)+ '"' ;
 COMMENT				: '//' ~[\r\n]+ -> skip ;
 IGNORE 				: [ \t\r\n]+ -> skip ;
 IDENTIFIER				: ('_' | LOWERCASE | UPPERCASE) (('_' | LOWERCASE |UPPERCASE | NUMBER)+)? ;
 
