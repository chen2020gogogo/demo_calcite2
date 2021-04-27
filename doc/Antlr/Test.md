grammar Test;
ID: [a-zA-Z0-9]+;
WS:  [ ] + ->skip;
testAll:test1 |test2|test3|test21;
test1:ID;
test2:ID ID;
test21:ID ID;
test3:ID ID ID;
test4:test1+;

ANTLR的语法解析用于定义组成语句的短语规则。语法规则由各个数据库厂商提供，因此，在SQL解析时，只需要将它们转换为ANTLR的语法规则即可。需要注意的是，SQL表达式的规则定义十分复杂。不仅包括常见的数学表达式和布尔表达式，还包括函数调用以及各数据库的私有日期表达式、Window函数、Case语句等。


ANTLR同样采用状态转换表的方式检查词法单元是否满足语法规则。语法分析器调用词法分析器获取词法单元并其检查是否符合规则。当遇到多个选项分支时，则采用贪婪匹配原则，优先走完最长路径的分支。如果分支中有多个规则满足条件，按顺序匹配。

当输入的参数为“a1 a2 a3”时，使用test3分支，而并未使用(test1 a1) (test1 a2) (test1 a3)或(test2 a1 a2) (test1 a3)这种匹配模式；

当输入的参数为“a1 a2”时，虽然test21规则也能够匹配，但前面有test2规则匹配，因此使用test2规则；

当输入的参数为“a1 a2 #”，由于无法匹配‘#’，因此提示错误。