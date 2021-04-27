package csl.calcite.com.spark;

import csl.calcite.com.parser.StatementData
import csl.calcite.com.parser.StatementType
import csl.calcite.com.sparkg4.SparkSqlBaseLexer
import csl.calcite.com.sparkg4.SparkSqlBaseParser
import csl.calcite.com.util.ParseErrorListener
import csl.calcite.com.util.ParseException
import csl.calcite.com.util.PostProcessor
import csl.calcite.com.util.UpperCaseCharStream
import org.antlr.v4.runtime.CharStreams
import org.antlr.v4.runtime.CommonTokenStream
import org.antlr.v4.runtime.atn.PredictionMode
import org.antlr.v4.runtime.misc.ParseCancellationException
import org.apache.commons.lang3.StringUtils

object SparkStreamSQLHelper {

    @JvmStatic fun checkSupportedSQL(statementType: StatementType): Boolean {
        return when (statementType) {
            StatementType.CREATE_TABLE,
            StatementType.SET,
            StatementType.INSERT_SELECT
            -> true
            else -> false
        }
    }

    @JvmStatic fun getStatementData(command: String) : ArrayList<StatementData> {
        val trimCmd = StringUtils.trim(command)

        val charStream = UpperCaseCharStream(CharStreams.fromString(trimCmd))
        val lexer = SparkSqlBaseLexer(charStream)
        lexer.removeErrorListeners()
        lexer.addErrorListener(ParseErrorListener())

        val tokenStream = CommonTokenStream(lexer)
        val parser = SparkSqlBaseParser(tokenStream)
        parser.addParseListener(PostProcessor())
        parser.removeErrorListeners()
        parser.addErrorListener(ParseErrorListener())
        parser.interpreter.predictionMode = PredictionMode.SLL

        val sqlVisitor = SparkStreamSQLAntlr4Visitor()
        sqlVisitor.setCommand(trimCmd)
        try {
            try {
                // first, try parsing with potentially faster SLL mode
                sqlVisitor.visit(parser.singleStatement())
                return sqlVisitor.getTableDatas()
            }
            catch (e: ParseCancellationException) {
                tokenStream.seek(0) // rewind input stream
                parser.reset()

                // Try Again.
                parser.interpreter.predictionMode = PredictionMode.LL
                sqlVisitor.visit(parser.singleStatement())
                return sqlVisitor.getTableDatas()
            }
        } catch (e: ParseException) {
            if(StringUtils.isNotBlank(e.command)) {
                throw e;
            } else {
                throw e.withCommand(trimCmd)
            }
        }
    }
}
