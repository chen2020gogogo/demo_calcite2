
参考链接 

[calcite简单入门](https://blog.gavinzh.com/2019/06/29/calcite-learn/)
[深入浅出Calcite与SQL CBO（Cost-Based Optimizer）优化](https://www.cnblogs.com/listenfwind/p/13192259.html)
[calcite-demo](https://github.com/shezhiming/calcite-demo)

Apache Calcite 是一款开源的动态数据管理框架，它提供了标准的 SQL 语言、多种查询优化和连接各种数据源的能力，

- 包含
  - SQL解析
  - SQL校验
  - 两种优化
    - RBO优化
    - 基于成本模型的优化，即CBO（Cost Based Optimizatio）
  - 自定义RelNode，自定义Cost信息，自定义rule

- 不包括
  - 数据存储 
  - 处理数据的算法
  - 存储元数据的存储库。

### maven引入
```
<!--calcite核心包-->
<dependency>
    <groupId>org.apache.calcite</groupId>
    <artifactId>calcite-core</artifactId>
    <version>1.19.0</version>
</dependency>
<!--项目用-->
<dependency>
    <groupId>com.alibaba</groupId>
    <artifactId>fastjson</artifactId>
    <version>1.2.54</version>
</dependency>
<!--项目用-->
<dependency>
    <groupId>com.google.guava</groupId>
    <artifactId>guava</artifactId>
    <version>16.0.1</version>
</dependency>
```
### 开发流程
calcite中，引入一个数据库通常是通过注册一个SchemaFactory接口实现类来实现。SchemaFactory中只有一个方法，就是生成Schema。Schema最重要的功能是获取所有Table。Table有两个功能，一个是获取所有字段的类型，另一个是得到Enumerable迭代器用来读取数据。

### 配置信息
如果将你的数据源引入calcite，一般情况下是使用一个配置文件，以下是配置文件的demo。
```
{
  "version": "1.0",
  "defaultSchema": "TEST",
  "schemas": [
    {
      "name": "TEST",
      "type": "custom",
      "factory": "org.apache.calcite.adapter.jdbc.JdbcSchema$Factory",
      "operand": {
        "jdbcUrl": "jdbc:mysql://127.0.0.1:3306/test?useUnicode=true&characterEncoding=UTF-8",
        "jdbcDriver":"com.mysql.cj.jdbc.Driver",
        "jdbcUser":"test",
        "jdbcPassword":"test"
      }
    }
  ]
}
```
### CSV表demo
这里我们先生成一个CSV文件，后边的操作就是通过在calcite中调用SQL访问CSV中的数据
- model.json
```
{
  "version": "1.0",
  "defaultSchema": "TEST_CSV",
  "schemas": [
    {
      "name": "TEST_CSV",
      "type": "custom",
      "factory": "com.calcite.csv.CsvSchemaFactory",
      "operand": {
        "dataFile": "TEST01.csv"
      }
    }
  ]
}
```
- TEST01.csv
```
ID:VARCHAR,NAME1:VARCHAR,NAME2:VARCHAR
0,first,second
1,hello,world
```

### 类
- CsvSchemaFactory 类
- CsvSchema类
- CsvTable类
- CsvEnumerator类
- Client Main方法调用

### 表之间关联
使用SQL查询CSV文件中的数据。接下来，我们再定义一种内存数据源，主要作用是演示两种数据源间的关联查询。
- MemSchemaFactory类
- MemSchema类
- MemTable类
- MemEnumerator类
- 文件
    - model.json
    - Main方法调用 Client2
    


### 结论

calcite对于没有高并发、低延时的多数据源间数据有着天然的优势。但需要注意的是，如果一个表中数据量特别大，大到读取速度很慢或内存无法容纳，那么务必在操作该表数据时加入尽可能多的筛选条件，如果自定义实现LogicalTableScan，最好也是实现FilterableTable，从而减少calcite在内存中操作数据行的量。