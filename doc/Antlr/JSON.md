下面通过分析一下大家常用的json的语法来加强理解。

json
: value
;
obj
: '{' pair (',' pair)* '}'
| '{' '}'
;
pair
: STRING ':' value
;
arr
: '[' value (',' value)* ']'
| '[' ']'
;
value
: STRING
| NUMBER
| obj
| arr
| 'true'
| 'false'
| 'null'
;
上面是json格式最核心的语法定义，回顾一下，这里其实用到了前面说的全部四种模式，下面一一讲解。

json
: value
;
这里其实是定义了一个json的基础，json基础规则就由一个value规则组成。

value
: STRING
| NUMBER
| obj
| arr
| 'true'
| 'false'
| 'null'
;
然后这里定义了value的规则， 可以看到这里用到了选择模式。 
json的value可以是字符串，数字，true，false，null， 
这四个其实是传统定义json格式“值”部分能够使用的基本类型。然后除了基本类型，value还可以是obj和arr

arr
: '[' value (',' value)* ']'
| '[' ']'
;
arr这个规则其实就是一个json数组，它由多个value通过，
分割的数组，或者是一个空数组。 这里用到了间接嵌套模式。 
统通过这个规则，json的某一个值可以是另一组json格式 。

obj
: '{' pair (',' pair)* '}'
| '{' '}'
;
pair
: STRING ':' value
;
obj是由一个json对象，它由多个pair通过，分割。
或者可以是一个空的{}。
然后其中的pair则是一个最基础的key-val的格式，这也是json最基础的语法。
可以看出一点json定义中key必须是字符串。


这里其实就是json最核心的一些定义，
大家可以回想一下json格式的规则是不是就是这样的。
然后再加上一下针对不同格式的正则要求，
就完成了json的ANTLR语法定义。
下面附带了完整的文件，有兴趣可以自己结合之前的分享，读一下这文件。





