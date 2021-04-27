- 文件名必须是以.g4结尾
- 语法规则的设计遵循“自顶向下”的原则，即由宏观到具体

csvFile: hdr row+ ;
hdr : row ;
row : field (',' field)* '\r'? '\n' ;
field
: TEXT
| STRING
|
;

TEXT   : ~[,\n\r"]+ ;
STRING : '"' ('""'|~'"')* '"' ; // quote-quote is an escaped quote