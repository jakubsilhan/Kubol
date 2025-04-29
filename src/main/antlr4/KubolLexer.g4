lexer grammar KubolLexer;

IS : 'IS' ;
ADD : 'ADD' ;
MULTIPLY : 'MULTIPLY' ;
DETERMINE : 'DETERMINE' ;
END_DETERMINE : 'END_DETERMINE' ;
EQUAL : 'EQUAL' ;
LESSER : 'LESSER' ;
GREATER : 'GREATER' ;
NONEQUAL : 'NONEQUAL' ;
THRU : 'THRU' ;
END_THRU : 'END_THRU' ;
IMAGINE : 'IMAGINE' ;

L_BRACK : '(' ;
R_BRACK : ')' ;
SEP : ';' ;

INT : '-'? ('0' | [1-9][0-9]*) ;
ID: [a-zA-Z_][a-zA-Z_0-9]* ;
WS: [ \t\n\r\f]+ -> skip ;