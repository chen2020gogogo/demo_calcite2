- [Antlr中$channel = HIDDEN](https://blog.csdn.net/jazywoo123/article/details/7647775)
- channel =隐藏和选项
  ```
      COMMENT
        :   ( '//' ~[\r\n]* '\r'? '\n'
            | '/*' .*? '*/'
            ) -> channel(HIDDEN)
        ;
    ```
  - 这会将所有单行和多行注释添加到HIDDEN频道上。但是，如果您不对这些HIDDEN-token
    做任何事情，那么您也可以选择skip这些令牌，如下所示：
    ```
    COMMENT
    :   ( '//' ~[\r\n]* '\r'? '\n'
        | '/*' .*? '*/'
        ) -> skip
    ;
    ```
  - 注意，要告诉词法分析器或解析器匹配不贪心，您不再使用options {greedy=false;}，而是?像许多regex实现一样附加一个
  