grammar CalExpr;


stat :expr NEWLINE        #printExpr
    |ID '=' expr NEWLINE  #assign
    |NEWLINE              #blank
    ;

expr : expr op=('+'|'-') expr   # AddSub
    | expr op=('*'|'/') expr    # MulDiv
    | ID                        # id
    | INT                       # int
    | '(' expr ')'              # parens
    ;

ID : [a-zA-Z]+ ;# 变量可以为大写小写字母的任意组合
INT : [0-9]+ ; # 运算数为整数的任意组合
NEWLINE : '\r' ? '\n'; # 匹配换行
WS : [ \t]+ -> skip; # 跳过空格和 \t

ADD : '+' ; #加法
SUB : '-' ; #减法
MUL : '*' ; #乘法
DIV : '/' ; #除法