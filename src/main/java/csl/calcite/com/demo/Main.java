package csl.calcite.com.demo;

import java.io.FileInputStream;
import java.io.InputStream;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.tree.*;

public class Main {
    public static void run(String expr) throws Exception{

        //对每一个输入的字符串，构造一个 ANTLRStringStream 流 in
        ANTLRInputStream in = new ANTLRInputStream(expr);

        //用 in 构造词法分析器 lexer，词法分析的作用是产生记号
        CalExprLexer lexer = new CalExprLexer(in);

        //用词法分析器 lexer 构造一个记号流 tokens
        CommonTokenStream tokens = new CommonTokenStream(lexer);

        //再使用 tokens 构造语法分析器 parser,至此已经完成词法分析和语法分析的准备工作
        CalExprParser parser = new CalExprParser(tokens);

        //最终调用语法分析器的规则 prog，完成对表达式的验证
       CalExprParser.ProgContext tree= parser.prog();
        MyVisitor visitor = new MyVisitor();
        Integer result=visitor.visit(tree);
        System.out.println("result:"+result);
    }

    public static void main(String[] args) throws Exception{

        String[] testStr={
                "a=1",
                "b=1",
                "c=2+1",
                "d=1+2+3",
                "a=1\nb=1\ne=(a-b)+3",
                "a=3\nb=4\nf=a+(b*3)"
        };

        for (String s:testStr){
            run(s);
        }
    }
}
