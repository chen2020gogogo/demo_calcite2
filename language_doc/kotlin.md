Kotlin 是一种在 Java 虚拟机上运行的静态类型编程语言，被称之为 Android 世界的Swift，由 JetBrains 设计开发并开源。

Kotlin 可以编译成Java字节码，也可以编译成 JavaScript，方便在没有 JVM 的设备上运行。

在Google I/O 2017中，Google 宣布 Kotlin 成为 Android 官方开发语言。

- 为什么选择 Kotlin？
   - 简洁: 大大减少样板代码的数量。
   - 安全: 避免空指针异常等整个类的错误。
   - 互操作性: 充分利用 JVM、Android 和浏览器的现有库。
   - 工具友好: 可用任何 Java IDE 或者使用命令行构建。

- scala 与 Kotlin 区别

  首先，将两门语言对比，个人觉得还是因为两门语言的语法比较像，让人有对比的欲望，
  - 相同
    - 两者都有现代化的语法
    - 都有多范式的编程能力
    - 很多语言上的设计有相似之处、并且都可以在JVM平台上运行，可以和Java互相配合的语言
  - 不相同
    - 从语言角度来说，Scala无疑是要比Kotlin强大和复杂的，Kotlin的功能可以说Scala都是直接或间接地提供了的，但反过来Kotlin缺少Scala的很多特性。可以说Kotlin是一个经过精挑细选，筛掉了部分功能的Scala。也可以说是一个填了无数大坑，经过精心强化版的Java。
    - 从语法设计角度来讲，个人比较欣赏Scala的“万物皆表达式”的思想
    - 从设计角度来说，Scala虽然顶着多范式编程的大旗，但是无疑她就是一门非常偏FP的语言，如果是把她当成换了语法的Java来写，那肯定会写出风格诡异，可读性很差的代码来，至少从我的实践来看
    - Kotlin的一大亮点就是语法层面强制Nullable
    - Scala非常致命的一个缺陷就是兼容性实在不敢恭维，一个寿命有十多年的语言，而且还是运行在JVM上的语言居然到现在都有大版本升级二进制互相不兼容的问题，使用第三方库还要考虑下对方是什么版本的？支不支持我的版本？这个版本在目前这个项目能不能用？拿源码升级的话我能不能跨版本编译过去等蛋疼的问题。
    - Scala更像是C++：拥有各种复杂的特性、无比强大的扩展性、十分陡峭的学习曲线；Kotlin更像是C#：限制了一些可能滥用的特性，提供了高糖的语法、人性化的API、多范式编程、填了很多开发中实际容易遇到的坑，而且拥有Scala不可比拟的兼容性。