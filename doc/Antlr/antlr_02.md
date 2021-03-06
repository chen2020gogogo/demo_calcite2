- 主要应用场景
  - 1.定制特定领域语言（DSL)
    - 类似hibernate中的HQL，用DSL来定义要执行操作的高层语法，这种语法接近人可理解的语言，由DSL到计算机语言的翻译则通过ANTLR来做，可在ANTLR的结构语言中定义DSL命令具体要执行何种操作。 
  - 2.文本解析 可利用ANTLR解析JSON，HTML，XML，EDIFACT，或自定义的报文格式。解析出来的信息需要做什么处理也可以在结构文件中定义。 
  - 3.数学计算 加减乘除，线性方程，几何运算，微积分等等
- 遍历模式
- 1、Listener (观察者模式，通过结点监听，触发处理方法)
  - 程序员不需要显示定义遍历语法树的顺序，实现简单
  - 缺点，不能显示控制遍历语法树的顺序
  - 动作代码与文法产生式解耦，利于文法产生式的重用
  - 没有返回值，需要使用map、栈等结构在节点间传值
- Visitor (访问者模式，主动遍历)
  - 程序员可以显示定义遍历语法树的顺序
  - 不需要与antlr遍历类ParseTreeWalker一起使用，直接对tree操作
  - 动作代码与文法产生式解耦，利于文法产生式的重用
  - visitor方法可以直接返回值，返回值的类型必须一致，不需要使用map这种节点间传值方式，效率高
  