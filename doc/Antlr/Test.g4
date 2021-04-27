grammar Test;
ID: [a-zA-Z0-9]+;
WS:  [ ] + ->skip;
testAll:test1 |test2|test3|test21;
test1:ID;
test2:ID ID;
test21:ID ID;
test3:ID ID ID;
test4:test1+;