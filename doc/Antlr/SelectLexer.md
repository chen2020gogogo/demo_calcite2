lexer grammar SelectLexer;
SELECT: [Ss] [Ee] [Ll] [Ee] [Cc] [Tt];
FROM: [Ff] [Rr] [Oo] [Mm];
WHERE: [Ww] [Hh] [Ee] [Rr] [Ee];
LEFT: [Ll][Ee][Ff][Tt];
RIGHT: [Rr][Ii][Gg][Hh][Tt];
INNER: [Ii][Nn][Nn][Ee][Rr];
JOIN: [Jj] [Oo] [Ii] [Nn];
ON : [Oo][Nn];
BETWEEN: [Bb] [Ee] [Ee] [Rr] [Ee];
AND: [Aa] [Nn] [Dd];
OR:[Oo][Rr];
GROUP: [Gg] [Rr] [Oo] [Uu] [Pp];
BY:[Bb] [Yy];
ORDER: [Oo] [Rr] [Dd] [Ee] [Rr];
ASC:[Aa][Ss][Cc];
DESC:[Dd][Ee][Ss][Cc];
IN: [Ii][Nn];
ID: [a-zA-Z0-9]+;
WS:  [ ] + ->skip;

它定义了
大小写不敏感的从SELECT到IN的关键字规则
以及标识符规则ID，
标识符规则放在最后。
WS规则表示遇到空格、制表符、换行符跳过。
输入字符中任何字符，在词法分析器中都要找到对应的规则，否则会提示失败。
如果去掉WS规则，对于包含空格的SQL将会得到以下的错误提示。

