lexer grammar HelloLexer;
HI : 'H' 'i'
ID : [a-z]+;
WS : [\t\n\r\s]+ -> skip;