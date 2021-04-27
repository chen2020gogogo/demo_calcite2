package csl.calcite.com.parser;


class SQLParserException(message: String?) : RuntimeException(message) {

    constructor(message: String?, exception: Exception?) : this(message)
}