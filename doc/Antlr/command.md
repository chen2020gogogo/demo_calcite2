```
grammar Demo;

//parser
prog:stat
;
stat:expr|NEWLINE
;

expr:multExpr(('+'|'-')multExpr)*
;
multExpr:atom(('*'|'/')atom)*
;
atom:'('expr')'
    |INT
    |ID
;

//lexer
ID:('a'..'z'|'A'..'Z')+;
INT:'0'..'9'+;
NEWLINE:'\r'?'\n';
WS:(' '|'\t'|'\n'|'\r')+{skip();};
```
运行ANTLR
右键Demo.g4，选择Configure ANTLR，配置output路径。


右键Demo.g4，选择Generate ANTLR Recognizer。可以看到生成结果结果。
其中Demo.tokens为文法中用到的各种符号做了数字化编号，我们可以不关注这个文件。DemoLexer是Antlr生成的词法分析器，DemoParser是Antlr 生成的语法分析器。


调用分析器。新建一个Main.java。
