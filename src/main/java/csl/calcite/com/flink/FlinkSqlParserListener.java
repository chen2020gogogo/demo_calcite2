package csl.calcite.com.flink;
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link FlinkSqlParser}.
 */
public interface FlinkSqlParserListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link FlinkSqlParser#program}.
	 * @param ctx the parse tree
	 */
	void enterProgram(FlinkSqlParser.ProgramContext ctx);
	/**
	 * Exit a parse tree produced by {@link FlinkSqlParser#program}.
	 * @param ctx the parse tree
	 */
	void exitProgram(FlinkSqlParser.ProgramContext ctx);
	/**
	 * Enter a parse tree produced by {@link FlinkSqlParser#statement}.
	 * @param ctx the parse tree
	 */
	void enterStatement(FlinkSqlParser.StatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link FlinkSqlParser#statement}.
	 * @param ctx the parse tree
	 */
	void exitStatement(FlinkSqlParser.StatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link FlinkSqlParser#sqlStatements}.
	 * @param ctx the parse tree
	 */
	void enterSqlStatements(FlinkSqlParser.SqlStatementsContext ctx);
	/**
	 * Exit a parse tree produced by {@link FlinkSqlParser#sqlStatements}.
	 * @param ctx the parse tree
	 */
	void exitSqlStatements(FlinkSqlParser.SqlStatementsContext ctx);
	/**
	 * Enter a parse tree produced by {@link FlinkSqlParser#sqlStatement}.
	 * @param ctx the parse tree
	 */
	void enterSqlStatement(FlinkSqlParser.SqlStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link FlinkSqlParser#sqlStatement}.
	 * @param ctx the parse tree
	 */
	void exitSqlStatement(FlinkSqlParser.SqlStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link FlinkSqlParser#emptyStatement}.
	 * @param ctx the parse tree
	 */
	void enterEmptyStatement(FlinkSqlParser.EmptyStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link FlinkSqlParser#emptyStatement}.
	 * @param ctx the parse tree
	 */
	void exitEmptyStatement(FlinkSqlParser.EmptyStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link FlinkSqlParser#ddlStatement}.
	 * @param ctx the parse tree
	 */
	void enterDdlStatement(FlinkSqlParser.DdlStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link FlinkSqlParser#ddlStatement}.
	 * @param ctx the parse tree
	 */
	void exitDdlStatement(FlinkSqlParser.DdlStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link FlinkSqlParser#dmlStatement}.
	 * @param ctx the parse tree
	 */
	void enterDmlStatement(FlinkSqlParser.DmlStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link FlinkSqlParser#dmlStatement}.
	 * @param ctx the parse tree
	 */
	void exitDmlStatement(FlinkSqlParser.DmlStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link FlinkSqlParser#describeStatement}.
	 * @param ctx the parse tree
	 */
	void enterDescribeStatement(FlinkSqlParser.DescribeStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link FlinkSqlParser#describeStatement}.
	 * @param ctx the parse tree
	 */
	void exitDescribeStatement(FlinkSqlParser.DescribeStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link FlinkSqlParser#explainStatement}.
	 * @param ctx the parse tree
	 */
	void enterExplainStatement(FlinkSqlParser.ExplainStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link FlinkSqlParser#explainStatement}.
	 * @param ctx the parse tree
	 */
	void exitExplainStatement(FlinkSqlParser.ExplainStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link FlinkSqlParser#useStatement}.
	 * @param ctx the parse tree
	 */
	void enterUseStatement(FlinkSqlParser.UseStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link FlinkSqlParser#useStatement}.
	 * @param ctx the parse tree
	 */
	void exitUseStatement(FlinkSqlParser.UseStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link FlinkSqlParser#showStatememt}.
	 * @param ctx the parse tree
	 */
	void enterShowStatememt(FlinkSqlParser.ShowStatememtContext ctx);
	/**
	 * Exit a parse tree produced by {@link FlinkSqlParser#showStatememt}.
	 * @param ctx the parse tree
	 */
	void exitShowStatememt(FlinkSqlParser.ShowStatememtContext ctx);
	/**
	 * Enter a parse tree produced by {@link FlinkSqlParser#createTable}.
	 * @param ctx the parse tree
	 */
	void enterCreateTable(FlinkSqlParser.CreateTableContext ctx);
	/**
	 * Exit a parse tree produced by {@link FlinkSqlParser#createTable}.
	 * @param ctx the parse tree
	 */
	void exitCreateTable(FlinkSqlParser.CreateTableContext ctx);
	/**
	 * Enter a parse tree produced by {@link FlinkSqlParser#columnOptionDefinition}.
	 * @param ctx the parse tree
	 */
	void enterColumnOptionDefinition(FlinkSqlParser.ColumnOptionDefinitionContext ctx);
	/**
	 * Exit a parse tree produced by {@link FlinkSqlParser#columnOptionDefinition}.
	 * @param ctx the parse tree
	 */
	void exitColumnOptionDefinition(FlinkSqlParser.ColumnOptionDefinitionContext ctx);
	/**
	 * Enter a parse tree produced by {@link FlinkSqlParser#columnName}.
	 * @param ctx the parse tree
	 */
	void enterColumnName(FlinkSqlParser.ColumnNameContext ctx);
	/**
	 * Exit a parse tree produced by {@link FlinkSqlParser#columnName}.
	 * @param ctx the parse tree
	 */
	void exitColumnName(FlinkSqlParser.ColumnNameContext ctx);
	/**
	 * Enter a parse tree produced by {@link FlinkSqlParser#columnNameList}.
	 * @param ctx the parse tree
	 */
	void enterColumnNameList(FlinkSqlParser.ColumnNameListContext ctx);
	/**
	 * Exit a parse tree produced by {@link FlinkSqlParser#columnNameList}.
	 * @param ctx the parse tree
	 */
	void exitColumnNameList(FlinkSqlParser.ColumnNameListContext ctx);
	/**
	 * Enter a parse tree produced by {@link FlinkSqlParser#columnType}.
	 * @param ctx the parse tree
	 */
	void enterColumnType(FlinkSqlParser.ColumnTypeContext ctx);
	/**
	 * Exit a parse tree produced by {@link FlinkSqlParser#columnType}.
	 * @param ctx the parse tree
	 */
	void exitColumnType(FlinkSqlParser.ColumnTypeContext ctx);
	/**
	 * Enter a parse tree produced by {@link FlinkSqlParser#lengthOneDimension}.
	 * @param ctx the parse tree
	 */
	void enterLengthOneDimension(FlinkSqlParser.LengthOneDimensionContext ctx);
	/**
	 * Exit a parse tree produced by {@link FlinkSqlParser#lengthOneDimension}.
	 * @param ctx the parse tree
	 */
	void exitLengthOneDimension(FlinkSqlParser.LengthOneDimensionContext ctx);
	/**
	 * Enter a parse tree produced by {@link FlinkSqlParser#commentSpec}.
	 * @param ctx the parse tree
	 */
	void enterCommentSpec(FlinkSqlParser.CommentSpecContext ctx);
	/**
	 * Exit a parse tree produced by {@link FlinkSqlParser#commentSpec}.
	 * @param ctx the parse tree
	 */
	void exitCommentSpec(FlinkSqlParser.CommentSpecContext ctx);
	/**
	 * Enter a parse tree produced by {@link FlinkSqlParser#watermarkDefinition}.
	 * @param ctx the parse tree
	 */
	void enterWatermarkDefinition(FlinkSqlParser.WatermarkDefinitionContext ctx);
	/**
	 * Exit a parse tree produced by {@link FlinkSqlParser#watermarkDefinition}.
	 * @param ctx the parse tree
	 */
	void exitWatermarkDefinition(FlinkSqlParser.WatermarkDefinitionContext ctx);
	/**
	 * Enter a parse tree produced by {@link FlinkSqlParser#tableConstraint}.
	 * @param ctx the parse tree
	 */
	void enterTableConstraint(FlinkSqlParser.TableConstraintContext ctx);
	/**
	 * Exit a parse tree produced by {@link FlinkSqlParser#tableConstraint}.
	 * @param ctx the parse tree
	 */
	void exitTableConstraint(FlinkSqlParser.TableConstraintContext ctx);
	/**
	 * Enter a parse tree produced by {@link FlinkSqlParser#selfDefinitionClause}.
	 * @param ctx the parse tree
	 */
	void enterSelfDefinitionClause(FlinkSqlParser.SelfDefinitionClauseContext ctx);
	/**
	 * Exit a parse tree produced by {@link FlinkSqlParser#selfDefinitionClause}.
	 * @param ctx the parse tree
	 */
	void exitSelfDefinitionClause(FlinkSqlParser.SelfDefinitionClauseContext ctx);
	/**
	 * Enter a parse tree produced by {@link FlinkSqlParser#partitionDefinition}.
	 * @param ctx the parse tree
	 */
	void enterPartitionDefinition(FlinkSqlParser.PartitionDefinitionContext ctx);
	/**
	 * Exit a parse tree produced by {@link FlinkSqlParser#partitionDefinition}.
	 * @param ctx the parse tree
	 */
	void exitPartitionDefinition(FlinkSqlParser.PartitionDefinitionContext ctx);
	/**
	 * Enter a parse tree produced by {@link FlinkSqlParser#transformList}.
	 * @param ctx the parse tree
	 */
	void enterTransformList(FlinkSqlParser.TransformListContext ctx);
	/**
	 * Exit a parse tree produced by {@link FlinkSqlParser#transformList}.
	 * @param ctx the parse tree
	 */
	void exitTransformList(FlinkSqlParser.TransformListContext ctx);
	/**
	 * Enter a parse tree produced by the {@code identityTransform}
	 * labeled alternative in {@link FlinkSqlParser#transform}.
	 * @param ctx the parse tree
	 */
	void enterIdentityTransform(FlinkSqlParser.IdentityTransformContext ctx);
	/**
	 * Exit a parse tree produced by the {@code identityTransform}
	 * labeled alternative in {@link FlinkSqlParser#transform}.
	 * @param ctx the parse tree
	 */
	void exitIdentityTransform(FlinkSqlParser.IdentityTransformContext ctx);
	/**
	 * Enter a parse tree produced by the {@code applyTransform}
	 * labeled alternative in {@link FlinkSqlParser#transform}.
	 * @param ctx the parse tree
	 */
	void enterApplyTransform(FlinkSqlParser.ApplyTransformContext ctx);
	/**
	 * Exit a parse tree produced by the {@code applyTransform}
	 * labeled alternative in {@link FlinkSqlParser#transform}.
	 * @param ctx the parse tree
	 */
	void exitApplyTransform(FlinkSqlParser.ApplyTransformContext ctx);
	/**
	 * Enter a parse tree produced by {@link FlinkSqlParser#transformArgument}.
	 * @param ctx the parse tree
	 */
	void enterTransformArgument(FlinkSqlParser.TransformArgumentContext ctx);
	/**
	 * Exit a parse tree produced by {@link FlinkSqlParser#transformArgument}.
	 * @param ctx the parse tree
	 */
	void exitTransformArgument(FlinkSqlParser.TransformArgumentContext ctx);
	/**
	 * Enter a parse tree produced by {@link FlinkSqlParser#likeDefinition}.
	 * @param ctx the parse tree
	 */
	void enterLikeDefinition(FlinkSqlParser.LikeDefinitionContext ctx);
	/**
	 * Exit a parse tree produced by {@link FlinkSqlParser#likeDefinition}.
	 * @param ctx the parse tree
	 */
	void exitLikeDefinition(FlinkSqlParser.LikeDefinitionContext ctx);
	/**
	 * Enter a parse tree produced by {@link FlinkSqlParser#likeOption}.
	 * @param ctx the parse tree
	 */
	void enterLikeOption(FlinkSqlParser.LikeOptionContext ctx);
	/**
	 * Exit a parse tree produced by {@link FlinkSqlParser#likeOption}.
	 * @param ctx the parse tree
	 */
	void exitLikeOption(FlinkSqlParser.LikeOptionContext ctx);
	/**
	 * Enter a parse tree produced by {@link FlinkSqlParser#createCatalog}.
	 * @param ctx the parse tree
	 */
	void enterCreateCatalog(FlinkSqlParser.CreateCatalogContext ctx);
	/**
	 * Exit a parse tree produced by {@link FlinkSqlParser#createCatalog}.
	 * @param ctx the parse tree
	 */
	void exitCreateCatalog(FlinkSqlParser.CreateCatalogContext ctx);
	/**
	 * Enter a parse tree produced by {@link FlinkSqlParser#createDatabase}.
	 * @param ctx the parse tree
	 */
	void enterCreateDatabase(FlinkSqlParser.CreateDatabaseContext ctx);
	/**
	 * Exit a parse tree produced by {@link FlinkSqlParser#createDatabase}.
	 * @param ctx the parse tree
	 */
	void exitCreateDatabase(FlinkSqlParser.CreateDatabaseContext ctx);
	/**
	 * Enter a parse tree produced by {@link FlinkSqlParser#createView}.
	 * @param ctx the parse tree
	 */
	void enterCreateView(FlinkSqlParser.CreateViewContext ctx);
	/**
	 * Exit a parse tree produced by {@link FlinkSqlParser#createView}.
	 * @param ctx the parse tree
	 */
	void exitCreateView(FlinkSqlParser.CreateViewContext ctx);
	/**
	 * Enter a parse tree produced by {@link FlinkSqlParser#createFunction}.
	 * @param ctx the parse tree
	 */
	void enterCreateFunction(FlinkSqlParser.CreateFunctionContext ctx);
	/**
	 * Exit a parse tree produced by {@link FlinkSqlParser#createFunction}.
	 * @param ctx the parse tree
	 */
	void exitCreateFunction(FlinkSqlParser.CreateFunctionContext ctx);
	/**
	 * Enter a parse tree produced by {@link FlinkSqlParser#alterTable}.
	 * @param ctx the parse tree
	 */
	void enterAlterTable(FlinkSqlParser.AlterTableContext ctx);
	/**
	 * Exit a parse tree produced by {@link FlinkSqlParser#alterTable}.
	 * @param ctx the parse tree
	 */
	void exitAlterTable(FlinkSqlParser.AlterTableContext ctx);
	/**
	 * Enter a parse tree produced by {@link FlinkSqlParser#renameDefinition}.
	 * @param ctx the parse tree
	 */
	void enterRenameDefinition(FlinkSqlParser.RenameDefinitionContext ctx);
	/**
	 * Exit a parse tree produced by {@link FlinkSqlParser#renameDefinition}.
	 * @param ctx the parse tree
	 */
	void exitRenameDefinition(FlinkSqlParser.RenameDefinitionContext ctx);
	/**
	 * Enter a parse tree produced by {@link FlinkSqlParser#setKeyValueDefinition}.
	 * @param ctx the parse tree
	 */
	void enterSetKeyValueDefinition(FlinkSqlParser.SetKeyValueDefinitionContext ctx);
	/**
	 * Exit a parse tree produced by {@link FlinkSqlParser#setKeyValueDefinition}.
	 * @param ctx the parse tree
	 */
	void exitSetKeyValueDefinition(FlinkSqlParser.SetKeyValueDefinitionContext ctx);
	/**
	 * Enter a parse tree produced by {@link FlinkSqlParser#alterDatabase}.
	 * @param ctx the parse tree
	 */
	void enterAlterDatabase(FlinkSqlParser.AlterDatabaseContext ctx);
	/**
	 * Exit a parse tree produced by {@link FlinkSqlParser#alterDatabase}.
	 * @param ctx the parse tree
	 */
	void exitAlterDatabase(FlinkSqlParser.AlterDatabaseContext ctx);
	/**
	 * Enter a parse tree produced by {@link FlinkSqlParser#alterFunction}.
	 * @param ctx the parse tree
	 */
	void enterAlterFunction(FlinkSqlParser.AlterFunctionContext ctx);
	/**
	 * Exit a parse tree produced by {@link FlinkSqlParser#alterFunction}.
	 * @param ctx the parse tree
	 */
	void exitAlterFunction(FlinkSqlParser.AlterFunctionContext ctx);
	/**
	 * Enter a parse tree produced by {@link FlinkSqlParser#dropTable}.
	 * @param ctx the parse tree
	 */
	void enterDropTable(FlinkSqlParser.DropTableContext ctx);
	/**
	 * Exit a parse tree produced by {@link FlinkSqlParser#dropTable}.
	 * @param ctx the parse tree
	 */
	void exitDropTable(FlinkSqlParser.DropTableContext ctx);
	/**
	 * Enter a parse tree produced by {@link FlinkSqlParser#dropDatabase}.
	 * @param ctx the parse tree
	 */
	void enterDropDatabase(FlinkSqlParser.DropDatabaseContext ctx);
	/**
	 * Exit a parse tree produced by {@link FlinkSqlParser#dropDatabase}.
	 * @param ctx the parse tree
	 */
	void exitDropDatabase(FlinkSqlParser.DropDatabaseContext ctx);
	/**
	 * Enter a parse tree produced by {@link FlinkSqlParser#dropView}.
	 * @param ctx the parse tree
	 */
	void enterDropView(FlinkSqlParser.DropViewContext ctx);
	/**
	 * Exit a parse tree produced by {@link FlinkSqlParser#dropView}.
	 * @param ctx the parse tree
	 */
	void exitDropView(FlinkSqlParser.DropViewContext ctx);
	/**
	 * Enter a parse tree produced by {@link FlinkSqlParser#dropFunction}.
	 * @param ctx the parse tree
	 */
	void enterDropFunction(FlinkSqlParser.DropFunctionContext ctx);
	/**
	 * Exit a parse tree produced by {@link FlinkSqlParser#dropFunction}.
	 * @param ctx the parse tree
	 */
	void exitDropFunction(FlinkSqlParser.DropFunctionContext ctx);
	/**
	 * Enter a parse tree produced by {@link FlinkSqlParser#insertStatement}.
	 * @param ctx the parse tree
	 */
	void enterInsertStatement(FlinkSqlParser.InsertStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link FlinkSqlParser#insertStatement}.
	 * @param ctx the parse tree
	 */
	void exitInsertStatement(FlinkSqlParser.InsertStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link FlinkSqlParser#insertPartitionDefinition}.
	 * @param ctx the parse tree
	 */
	void enterInsertPartitionDefinition(FlinkSqlParser.InsertPartitionDefinitionContext ctx);
	/**
	 * Exit a parse tree produced by {@link FlinkSqlParser#insertPartitionDefinition}.
	 * @param ctx the parse tree
	 */
	void exitInsertPartitionDefinition(FlinkSqlParser.InsertPartitionDefinitionContext ctx);
	/**
	 * Enter a parse tree produced by {@link FlinkSqlParser#valuesDefinition}.
	 * @param ctx the parse tree
	 */
	void enterValuesDefinition(FlinkSqlParser.ValuesDefinitionContext ctx);
	/**
	 * Exit a parse tree produced by {@link FlinkSqlParser#valuesDefinition}.
	 * @param ctx the parse tree
	 */
	void exitValuesDefinition(FlinkSqlParser.ValuesDefinitionContext ctx);
	/**
	 * Enter a parse tree produced by {@link FlinkSqlParser#valuesRowDefinition}.
	 * @param ctx the parse tree
	 */
	void enterValuesRowDefinition(FlinkSqlParser.ValuesRowDefinitionContext ctx);
	/**
	 * Exit a parse tree produced by {@link FlinkSqlParser#valuesRowDefinition}.
	 * @param ctx the parse tree
	 */
	void exitValuesRowDefinition(FlinkSqlParser.ValuesRowDefinitionContext ctx);
	/**
	 * Enter a parse tree produced by {@link FlinkSqlParser#queryStatement}.
	 * @param ctx the parse tree
	 */
	void enterQueryStatement(FlinkSqlParser.QueryStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link FlinkSqlParser#queryStatement}.
	 * @param ctx the parse tree
	 */
	void exitQueryStatement(FlinkSqlParser.QueryStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link FlinkSqlParser#valuesCaluse}.
	 * @param ctx the parse tree
	 */
	void enterValuesCaluse(FlinkSqlParser.ValuesCaluseContext ctx);
	/**
	 * Exit a parse tree produced by {@link FlinkSqlParser#valuesCaluse}.
	 * @param ctx the parse tree
	 */
	void exitValuesCaluse(FlinkSqlParser.ValuesCaluseContext ctx);
	/**
	 * Enter a parse tree produced by {@link FlinkSqlParser#selectStatement}.
	 * @param ctx the parse tree
	 */
	void enterSelectStatement(FlinkSqlParser.SelectStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link FlinkSqlParser#selectStatement}.
	 * @param ctx the parse tree
	 */
	void exitSelectStatement(FlinkSqlParser.SelectStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link FlinkSqlParser#selectClause}.
	 * @param ctx the parse tree
	 */
	void enterSelectClause(FlinkSqlParser.SelectClauseContext ctx);
	/**
	 * Exit a parse tree produced by {@link FlinkSqlParser#selectClause}.
	 * @param ctx the parse tree
	 */
	void exitSelectClause(FlinkSqlParser.SelectClauseContext ctx);
	/**
	 * Enter a parse tree produced by {@link FlinkSqlParser#projectItemDefinition}.
	 * @param ctx the parse tree
	 */
	void enterProjectItemDefinition(FlinkSqlParser.ProjectItemDefinitionContext ctx);
	/**
	 * Exit a parse tree produced by {@link FlinkSqlParser#projectItemDefinition}.
	 * @param ctx the parse tree
	 */
	void exitProjectItemDefinition(FlinkSqlParser.ProjectItemDefinitionContext ctx);
	/**
	 * Enter a parse tree produced by {@link FlinkSqlParser#fromClause}.
	 * @param ctx the parse tree
	 */
	void enterFromClause(FlinkSqlParser.FromClauseContext ctx);
	/**
	 * Exit a parse tree produced by {@link FlinkSqlParser#fromClause}.
	 * @param ctx the parse tree
	 */
	void exitFromClause(FlinkSqlParser.FromClauseContext ctx);
	/**
	 * Enter a parse tree produced by {@link FlinkSqlParser#tableExpression}.
	 * @param ctx the parse tree
	 */
	void enterTableExpression(FlinkSqlParser.TableExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link FlinkSqlParser#tableExpression}.
	 * @param ctx the parse tree
	 */
	void exitTableExpression(FlinkSqlParser.TableExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link FlinkSqlParser#tableReference}.
	 * @param ctx the parse tree
	 */
	void enterTableReference(FlinkSqlParser.TableReferenceContext ctx);
	/**
	 * Exit a parse tree produced by {@link FlinkSqlParser#tableReference}.
	 * @param ctx the parse tree
	 */
	void exitTableReference(FlinkSqlParser.TableReferenceContext ctx);
	/**
	 * Enter a parse tree produced by {@link FlinkSqlParser#tablePrimary}.
	 * @param ctx the parse tree
	 */
	void enterTablePrimary(FlinkSqlParser.TablePrimaryContext ctx);
	/**
	 * Exit a parse tree produced by {@link FlinkSqlParser#tablePrimary}.
	 * @param ctx the parse tree
	 */
	void exitTablePrimary(FlinkSqlParser.TablePrimaryContext ctx);
	/**
	 * Enter a parse tree produced by {@link FlinkSqlParser#joinCondition}.
	 * @param ctx the parse tree
	 */
	void enterJoinCondition(FlinkSqlParser.JoinConditionContext ctx);
	/**
	 * Exit a parse tree produced by {@link FlinkSqlParser#joinCondition}.
	 * @param ctx the parse tree
	 */
	void exitJoinCondition(FlinkSqlParser.JoinConditionContext ctx);
	/**
	 * Enter a parse tree produced by {@link FlinkSqlParser#whereClause}.
	 * @param ctx the parse tree
	 */
	void enterWhereClause(FlinkSqlParser.WhereClauseContext ctx);
	/**
	 * Exit a parse tree produced by {@link FlinkSqlParser#whereClause}.
	 * @param ctx the parse tree
	 */
	void exitWhereClause(FlinkSqlParser.WhereClauseContext ctx);
	/**
	 * Enter a parse tree produced by {@link FlinkSqlParser#groupByClause}.
	 * @param ctx the parse tree
	 */
	void enterGroupByClause(FlinkSqlParser.GroupByClauseContext ctx);
	/**
	 * Exit a parse tree produced by {@link FlinkSqlParser#groupByClause}.
	 * @param ctx the parse tree
	 */
	void exitGroupByClause(FlinkSqlParser.GroupByClauseContext ctx);
	/**
	 * Enter a parse tree produced by {@link FlinkSqlParser#groupItemDefinition}.
	 * @param ctx the parse tree
	 */
	void enterGroupItemDefinition(FlinkSqlParser.GroupItemDefinitionContext ctx);
	/**
	 * Exit a parse tree produced by {@link FlinkSqlParser#groupItemDefinition}.
	 * @param ctx the parse tree
	 */
	void exitGroupItemDefinition(FlinkSqlParser.GroupItemDefinitionContext ctx);
	/**
	 * Enter a parse tree produced by {@link FlinkSqlParser#havingClause}.
	 * @param ctx the parse tree
	 */
	void enterHavingClause(FlinkSqlParser.HavingClauseContext ctx);
	/**
	 * Exit a parse tree produced by {@link FlinkSqlParser#havingClause}.
	 * @param ctx the parse tree
	 */
	void exitHavingClause(FlinkSqlParser.HavingClauseContext ctx);
	/**
	 * Enter a parse tree produced by {@link FlinkSqlParser#orderByCaluse}.
	 * @param ctx the parse tree
	 */
	void enterOrderByCaluse(FlinkSqlParser.OrderByCaluseContext ctx);
	/**
	 * Exit a parse tree produced by {@link FlinkSqlParser#orderByCaluse}.
	 * @param ctx the parse tree
	 */
	void exitOrderByCaluse(FlinkSqlParser.OrderByCaluseContext ctx);
	/**
	 * Enter a parse tree produced by {@link FlinkSqlParser#orderItemDefition}.
	 * @param ctx the parse tree
	 */
	void enterOrderItemDefition(FlinkSqlParser.OrderItemDefitionContext ctx);
	/**
	 * Exit a parse tree produced by {@link FlinkSqlParser#orderItemDefition}.
	 * @param ctx the parse tree
	 */
	void exitOrderItemDefition(FlinkSqlParser.OrderItemDefitionContext ctx);
	/**
	 * Enter a parse tree produced by {@link FlinkSqlParser#limitClause}.
	 * @param ctx the parse tree
	 */
	void enterLimitClause(FlinkSqlParser.LimitClauseContext ctx);
	/**
	 * Exit a parse tree produced by {@link FlinkSqlParser#limitClause}.
	 * @param ctx the parse tree
	 */
	void exitLimitClause(FlinkSqlParser.LimitClauseContext ctx);
	/**
	 * Enter a parse tree produced by {@link FlinkSqlParser#windowClause}.
	 * @param ctx the parse tree
	 */
	void enterWindowClause(FlinkSqlParser.WindowClauseContext ctx);
	/**
	 * Exit a parse tree produced by {@link FlinkSqlParser#windowClause}.
	 * @param ctx the parse tree
	 */
	void exitWindowClause(FlinkSqlParser.WindowClauseContext ctx);
	/**
	 * Enter a parse tree produced by {@link FlinkSqlParser#namedWindow}.
	 * @param ctx the parse tree
	 */
	void enterNamedWindow(FlinkSqlParser.NamedWindowContext ctx);
	/**
	 * Exit a parse tree produced by {@link FlinkSqlParser#namedWindow}.
	 * @param ctx the parse tree
	 */
	void exitNamedWindow(FlinkSqlParser.NamedWindowContext ctx);
	/**
	 * Enter a parse tree produced by {@link FlinkSqlParser#windowSpec}.
	 * @param ctx the parse tree
	 */
	void enterWindowSpec(FlinkSqlParser.WindowSpecContext ctx);
	/**
	 * Exit a parse tree produced by {@link FlinkSqlParser#windowSpec}.
	 * @param ctx the parse tree
	 */
	void exitWindowSpec(FlinkSqlParser.WindowSpecContext ctx);
	/**
	 * Enter a parse tree produced by {@link FlinkSqlParser#sortItem}.
	 * @param ctx the parse tree
	 */
	void enterSortItem(FlinkSqlParser.SortItemContext ctx);
	/**
	 * Exit a parse tree produced by {@link FlinkSqlParser#sortItem}.
	 * @param ctx the parse tree
	 */
	void exitSortItem(FlinkSqlParser.SortItemContext ctx);
	/**
	 * Enter a parse tree produced by {@link FlinkSqlParser#windowFrame}.
	 * @param ctx the parse tree
	 */
	void enterWindowFrame(FlinkSqlParser.WindowFrameContext ctx);
	/**
	 * Exit a parse tree produced by {@link FlinkSqlParser#windowFrame}.
	 * @param ctx the parse tree
	 */
	void exitWindowFrame(FlinkSqlParser.WindowFrameContext ctx);
	/**
	 * Enter a parse tree produced by {@link FlinkSqlParser#frameBound}.
	 * @param ctx the parse tree
	 */
	void enterFrameBound(FlinkSqlParser.FrameBoundContext ctx);
	/**
	 * Exit a parse tree produced by {@link FlinkSqlParser#frameBound}.
	 * @param ctx the parse tree
	 */
	void exitFrameBound(FlinkSqlParser.FrameBoundContext ctx);
	/**
	 * Enter a parse tree produced by {@link FlinkSqlParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterExpression(FlinkSqlParser.ExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link FlinkSqlParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitExpression(FlinkSqlParser.ExpressionContext ctx);
	/**
	 * Enter a parse tree produced by the {@code logicalNot}
	 * labeled alternative in {@link FlinkSqlParser#booleanExpression}.
	 * @param ctx the parse tree
	 */
	void enterLogicalNot(FlinkSqlParser.LogicalNotContext ctx);
	/**
	 * Exit a parse tree produced by the {@code logicalNot}
	 * labeled alternative in {@link FlinkSqlParser#booleanExpression}.
	 * @param ctx the parse tree
	 */
	void exitLogicalNot(FlinkSqlParser.LogicalNotContext ctx);
	/**
	 * Enter a parse tree produced by the {@code predicated}
	 * labeled alternative in {@link FlinkSqlParser#booleanExpression}.
	 * @param ctx the parse tree
	 */
	void enterPredicated(FlinkSqlParser.PredicatedContext ctx);
	/**
	 * Exit a parse tree produced by the {@code predicated}
	 * labeled alternative in {@link FlinkSqlParser#booleanExpression}.
	 * @param ctx the parse tree
	 */
	void exitPredicated(FlinkSqlParser.PredicatedContext ctx);
	/**
	 * Enter a parse tree produced by the {@code exists}
	 * labeled alternative in {@link FlinkSqlParser#booleanExpression}.
	 * @param ctx the parse tree
	 */
	void enterExists(FlinkSqlParser.ExistsContext ctx);
	/**
	 * Exit a parse tree produced by the {@code exists}
	 * labeled alternative in {@link FlinkSqlParser#booleanExpression}.
	 * @param ctx the parse tree
	 */
	void exitExists(FlinkSqlParser.ExistsContext ctx);
	/**
	 * Enter a parse tree produced by the {@code logicalBinary}
	 * labeled alternative in {@link FlinkSqlParser#booleanExpression}.
	 * @param ctx the parse tree
	 */
	void enterLogicalBinary(FlinkSqlParser.LogicalBinaryContext ctx);
	/**
	 * Exit a parse tree produced by the {@code logicalBinary}
	 * labeled alternative in {@link FlinkSqlParser#booleanExpression}.
	 * @param ctx the parse tree
	 */
	void exitLogicalBinary(FlinkSqlParser.LogicalBinaryContext ctx);
	/**
	 * Enter a parse tree produced by {@link FlinkSqlParser#predicate}.
	 * @param ctx the parse tree
	 */
	void enterPredicate(FlinkSqlParser.PredicateContext ctx);
	/**
	 * Exit a parse tree produced by {@link FlinkSqlParser#predicate}.
	 * @param ctx the parse tree
	 */
	void exitPredicate(FlinkSqlParser.PredicateContext ctx);
	/**
	 * Enter a parse tree produced by the {@code valueExpressionDefault}
	 * labeled alternative in {@link FlinkSqlParser#valueExpression}.
	 * @param ctx the parse tree
	 */
	void enterValueExpressionDefault(FlinkSqlParser.ValueExpressionDefaultContext ctx);
	/**
	 * Exit a parse tree produced by the {@code valueExpressionDefault}
	 * labeled alternative in {@link FlinkSqlParser#valueExpression}.
	 * @param ctx the parse tree
	 */
	void exitValueExpressionDefault(FlinkSqlParser.ValueExpressionDefaultContext ctx);
	/**
	 * Enter a parse tree produced by the {@code comparison}
	 * labeled alternative in {@link FlinkSqlParser#valueExpression}.
	 * @param ctx the parse tree
	 */
	void enterComparison(FlinkSqlParser.ComparisonContext ctx);
	/**
	 * Exit a parse tree produced by the {@code comparison}
	 * labeled alternative in {@link FlinkSqlParser#valueExpression}.
	 * @param ctx the parse tree
	 */
	void exitComparison(FlinkSqlParser.ComparisonContext ctx);
	/**
	 * Enter a parse tree produced by the {@code arithmeticBinary}
	 * labeled alternative in {@link FlinkSqlParser#valueExpression}.
	 * @param ctx the parse tree
	 */
	void enterArithmeticBinary(FlinkSqlParser.ArithmeticBinaryContext ctx);
	/**
	 * Exit a parse tree produced by the {@code arithmeticBinary}
	 * labeled alternative in {@link FlinkSqlParser#valueExpression}.
	 * @param ctx the parse tree
	 */
	void exitArithmeticBinary(FlinkSqlParser.ArithmeticBinaryContext ctx);
	/**
	 * Enter a parse tree produced by the {@code arithmeticUnary}
	 * labeled alternative in {@link FlinkSqlParser#valueExpression}.
	 * @param ctx the parse tree
	 */
	void enterArithmeticUnary(FlinkSqlParser.ArithmeticUnaryContext ctx);
	/**
	 * Exit a parse tree produced by the {@code arithmeticUnary}
	 * labeled alternative in {@link FlinkSqlParser#valueExpression}.
	 * @param ctx the parse tree
	 */
	void exitArithmeticUnary(FlinkSqlParser.ArithmeticUnaryContext ctx);
	/**
	 * Enter a parse tree produced by the {@code dereference}
	 * labeled alternative in {@link FlinkSqlParser#primaryExpression}.
	 * @param ctx the parse tree
	 */
	void enterDereference(FlinkSqlParser.DereferenceContext ctx);
	/**
	 * Exit a parse tree produced by the {@code dereference}
	 * labeled alternative in {@link FlinkSqlParser#primaryExpression}.
	 * @param ctx the parse tree
	 */
	void exitDereference(FlinkSqlParser.DereferenceContext ctx);
	/**
	 * Enter a parse tree produced by the {@code simpleCase}
	 * labeled alternative in {@link FlinkSqlParser#primaryExpression}.
	 * @param ctx the parse tree
	 */
	void enterSimpleCase(FlinkSqlParser.SimpleCaseContext ctx);
	/**
	 * Exit a parse tree produced by the {@code simpleCase}
	 * labeled alternative in {@link FlinkSqlParser#primaryExpression}.
	 * @param ctx the parse tree
	 */
	void exitSimpleCase(FlinkSqlParser.SimpleCaseContext ctx);
	/**
	 * Enter a parse tree produced by the {@code columnReference}
	 * labeled alternative in {@link FlinkSqlParser#primaryExpression}.
	 * @param ctx the parse tree
	 */
	void enterColumnReference(FlinkSqlParser.ColumnReferenceContext ctx);
	/**
	 * Exit a parse tree produced by the {@code columnReference}
	 * labeled alternative in {@link FlinkSqlParser#primaryExpression}.
	 * @param ctx the parse tree
	 */
	void exitColumnReference(FlinkSqlParser.ColumnReferenceContext ctx);
	/**
	 * Enter a parse tree produced by the {@code last}
	 * labeled alternative in {@link FlinkSqlParser#primaryExpression}.
	 * @param ctx the parse tree
	 */
	void enterLast(FlinkSqlParser.LastContext ctx);
	/**
	 * Exit a parse tree produced by the {@code last}
	 * labeled alternative in {@link FlinkSqlParser#primaryExpression}.
	 * @param ctx the parse tree
	 */
	void exitLast(FlinkSqlParser.LastContext ctx);
	/**
	 * Enter a parse tree produced by the {@code star}
	 * labeled alternative in {@link FlinkSqlParser#primaryExpression}.
	 * @param ctx the parse tree
	 */
	void enterStar(FlinkSqlParser.StarContext ctx);
	/**
	 * Exit a parse tree produced by the {@code star}
	 * labeled alternative in {@link FlinkSqlParser#primaryExpression}.
	 * @param ctx the parse tree
	 */
	void exitStar(FlinkSqlParser.StarContext ctx);
	/**
	 * Enter a parse tree produced by the {@code subscript}
	 * labeled alternative in {@link FlinkSqlParser#primaryExpression}.
	 * @param ctx the parse tree
	 */
	void enterSubscript(FlinkSqlParser.SubscriptContext ctx);
	/**
	 * Exit a parse tree produced by the {@code subscript}
	 * labeled alternative in {@link FlinkSqlParser#primaryExpression}.
	 * @param ctx the parse tree
	 */
	void exitSubscript(FlinkSqlParser.SubscriptContext ctx);
	/**
	 * Enter a parse tree produced by the {@code subqueryExpression}
	 * labeled alternative in {@link FlinkSqlParser#primaryExpression}.
	 * @param ctx the parse tree
	 */
	void enterSubqueryExpression(FlinkSqlParser.SubqueryExpressionContext ctx);
	/**
	 * Exit a parse tree produced by the {@code subqueryExpression}
	 * labeled alternative in {@link FlinkSqlParser#primaryExpression}.
	 * @param ctx the parse tree
	 */
	void exitSubqueryExpression(FlinkSqlParser.SubqueryExpressionContext ctx);
	/**
	 * Enter a parse tree produced by the {@code cast}
	 * labeled alternative in {@link FlinkSqlParser#primaryExpression}.
	 * @param ctx the parse tree
	 */
	void enterCast(FlinkSqlParser.CastContext ctx);
	/**
	 * Exit a parse tree produced by the {@code cast}
	 * labeled alternative in {@link FlinkSqlParser#primaryExpression}.
	 * @param ctx the parse tree
	 */
	void exitCast(FlinkSqlParser.CastContext ctx);
	/**
	 * Enter a parse tree produced by the {@code constantDefault}
	 * labeled alternative in {@link FlinkSqlParser#primaryExpression}.
	 * @param ctx the parse tree
	 */
	void enterConstantDefault(FlinkSqlParser.ConstantDefaultContext ctx);
	/**
	 * Exit a parse tree produced by the {@code constantDefault}
	 * labeled alternative in {@link FlinkSqlParser#primaryExpression}.
	 * @param ctx the parse tree
	 */
	void exitConstantDefault(FlinkSqlParser.ConstantDefaultContext ctx);
	/**
	 * Enter a parse tree produced by the {@code parenthesizedExpression}
	 * labeled alternative in {@link FlinkSqlParser#primaryExpression}.
	 * @param ctx the parse tree
	 */
	void enterParenthesizedExpression(FlinkSqlParser.ParenthesizedExpressionContext ctx);
	/**
	 * Exit a parse tree produced by the {@code parenthesizedExpression}
	 * labeled alternative in {@link FlinkSqlParser#primaryExpression}.
	 * @param ctx the parse tree
	 */
	void exitParenthesizedExpression(FlinkSqlParser.ParenthesizedExpressionContext ctx);
	/**
	 * Enter a parse tree produced by the {@code functionCall}
	 * labeled alternative in {@link FlinkSqlParser#primaryExpression}.
	 * @param ctx the parse tree
	 */
	void enterFunctionCall(FlinkSqlParser.FunctionCallContext ctx);
	/**
	 * Exit a parse tree produced by the {@code functionCall}
	 * labeled alternative in {@link FlinkSqlParser#primaryExpression}.
	 * @param ctx the parse tree
	 */
	void exitFunctionCall(FlinkSqlParser.FunctionCallContext ctx);
	/**
	 * Enter a parse tree produced by the {@code searchedCase}
	 * labeled alternative in {@link FlinkSqlParser#primaryExpression}.
	 * @param ctx the parse tree
	 */
	void enterSearchedCase(FlinkSqlParser.SearchedCaseContext ctx);
	/**
	 * Exit a parse tree produced by the {@code searchedCase}
	 * labeled alternative in {@link FlinkSqlParser#primaryExpression}.
	 * @param ctx the parse tree
	 */
	void exitSearchedCase(FlinkSqlParser.SearchedCaseContext ctx);
	/**
	 * Enter a parse tree produced by the {@code position}
	 * labeled alternative in {@link FlinkSqlParser#primaryExpression}.
	 * @param ctx the parse tree
	 */
	void enterPosition(FlinkSqlParser.PositionContext ctx);
	/**
	 * Exit a parse tree produced by the {@code position}
	 * labeled alternative in {@link FlinkSqlParser#primaryExpression}.
	 * @param ctx the parse tree
	 */
	void exitPosition(FlinkSqlParser.PositionContext ctx);
	/**
	 * Enter a parse tree produced by the {@code first}
	 * labeled alternative in {@link FlinkSqlParser#primaryExpression}.
	 * @param ctx the parse tree
	 */
	void enterFirst(FlinkSqlParser.FirstContext ctx);
	/**
	 * Exit a parse tree produced by the {@code first}
	 * labeled alternative in {@link FlinkSqlParser#primaryExpression}.
	 * @param ctx the parse tree
	 */
	void exitFirst(FlinkSqlParser.FirstContext ctx);
	/**
	 * Enter a parse tree produced by {@link FlinkSqlParser#functionName}.
	 * @param ctx the parse tree
	 */
	void enterFunctionName(FlinkSqlParser.FunctionNameContext ctx);
	/**
	 * Exit a parse tree produced by {@link FlinkSqlParser#functionName}.
	 * @param ctx the parse tree
	 */
	void exitFunctionName(FlinkSqlParser.FunctionNameContext ctx);
	/**
	 * Enter a parse tree produced by {@link FlinkSqlParser#dereferenceDefinition}.
	 * @param ctx the parse tree
	 */
	void enterDereferenceDefinition(FlinkSqlParser.DereferenceDefinitionContext ctx);
	/**
	 * Exit a parse tree produced by {@link FlinkSqlParser#dereferenceDefinition}.
	 * @param ctx the parse tree
	 */
	void exitDereferenceDefinition(FlinkSqlParser.DereferenceDefinitionContext ctx);
	/**
	 * Enter a parse tree produced by {@link FlinkSqlParser#qualifiedName}.
	 * @param ctx the parse tree
	 */
	void enterQualifiedName(FlinkSqlParser.QualifiedNameContext ctx);
	/**
	 * Exit a parse tree produced by {@link FlinkSqlParser#qualifiedName}.
	 * @param ctx the parse tree
	 */
	void exitQualifiedName(FlinkSqlParser.QualifiedNameContext ctx);
	/**
	 * Enter a parse tree produced by {@link FlinkSqlParser#interval}.
	 * @param ctx the parse tree
	 */
	void enterInterval(FlinkSqlParser.IntervalContext ctx);
	/**
	 * Exit a parse tree produced by {@link FlinkSqlParser#interval}.
	 * @param ctx the parse tree
	 */
	void exitInterval(FlinkSqlParser.IntervalContext ctx);
	/**
	 * Enter a parse tree produced by {@link FlinkSqlParser#errorCapturingMultiUnitsInterval}.
	 * @param ctx the parse tree
	 */
	void enterErrorCapturingMultiUnitsInterval(FlinkSqlParser.ErrorCapturingMultiUnitsIntervalContext ctx);
	/**
	 * Exit a parse tree produced by {@link FlinkSqlParser#errorCapturingMultiUnitsInterval}.
	 * @param ctx the parse tree
	 */
	void exitErrorCapturingMultiUnitsInterval(FlinkSqlParser.ErrorCapturingMultiUnitsIntervalContext ctx);
	/**
	 * Enter a parse tree produced by {@link FlinkSqlParser#multiUnitsInterval}.
	 * @param ctx the parse tree
	 */
	void enterMultiUnitsInterval(FlinkSqlParser.MultiUnitsIntervalContext ctx);
	/**
	 * Exit a parse tree produced by {@link FlinkSqlParser#multiUnitsInterval}.
	 * @param ctx the parse tree
	 */
	void exitMultiUnitsInterval(FlinkSqlParser.MultiUnitsIntervalContext ctx);
	/**
	 * Enter a parse tree produced by {@link FlinkSqlParser#errorCapturingUnitToUnitInterval}.
	 * @param ctx the parse tree
	 */
	void enterErrorCapturingUnitToUnitInterval(FlinkSqlParser.ErrorCapturingUnitToUnitIntervalContext ctx);
	/**
	 * Exit a parse tree produced by {@link FlinkSqlParser#errorCapturingUnitToUnitInterval}.
	 * @param ctx the parse tree
	 */
	void exitErrorCapturingUnitToUnitInterval(FlinkSqlParser.ErrorCapturingUnitToUnitIntervalContext ctx);
	/**
	 * Enter a parse tree produced by {@link FlinkSqlParser#unitToUnitInterval}.
	 * @param ctx the parse tree
	 */
	void enterUnitToUnitInterval(FlinkSqlParser.UnitToUnitIntervalContext ctx);
	/**
	 * Exit a parse tree produced by {@link FlinkSqlParser#unitToUnitInterval}.
	 * @param ctx the parse tree
	 */
	void exitUnitToUnitInterval(FlinkSqlParser.UnitToUnitIntervalContext ctx);
	/**
	 * Enter a parse tree produced by {@link FlinkSqlParser#intervalValue}.
	 * @param ctx the parse tree
	 */
	void enterIntervalValue(FlinkSqlParser.IntervalValueContext ctx);
	/**
	 * Exit a parse tree produced by {@link FlinkSqlParser#intervalValue}.
	 * @param ctx the parse tree
	 */
	void exitIntervalValue(FlinkSqlParser.IntervalValueContext ctx);
	/**
	 * Enter a parse tree produced by {@link FlinkSqlParser#columnAlias}.
	 * @param ctx the parse tree
	 */
	void enterColumnAlias(FlinkSqlParser.ColumnAliasContext ctx);
	/**
	 * Exit a parse tree produced by {@link FlinkSqlParser#columnAlias}.
	 * @param ctx the parse tree
	 */
	void exitColumnAlias(FlinkSqlParser.ColumnAliasContext ctx);
	/**
	 * Enter a parse tree produced by {@link FlinkSqlParser#tableAlias}.
	 * @param ctx the parse tree
	 */
	void enterTableAlias(FlinkSqlParser.TableAliasContext ctx);
	/**
	 * Exit a parse tree produced by {@link FlinkSqlParser#tableAlias}.
	 * @param ctx the parse tree
	 */
	void exitTableAlias(FlinkSqlParser.TableAliasContext ctx);
	/**
	 * Enter a parse tree produced by {@link FlinkSqlParser#errorCapturingIdentifier}.
	 * @param ctx the parse tree
	 */
	void enterErrorCapturingIdentifier(FlinkSqlParser.ErrorCapturingIdentifierContext ctx);
	/**
	 * Exit a parse tree produced by {@link FlinkSqlParser#errorCapturingIdentifier}.
	 * @param ctx the parse tree
	 */
	void exitErrorCapturingIdentifier(FlinkSqlParser.ErrorCapturingIdentifierContext ctx);
	/**
	 * Enter a parse tree produced by the {@code errorIdent}
	 * labeled alternative in {@link FlinkSqlParser#errorCapturingIdentifierExtra}.
	 * @param ctx the parse tree
	 */
	void enterErrorIdent(FlinkSqlParser.ErrorIdentContext ctx);
	/**
	 * Exit a parse tree produced by the {@code errorIdent}
	 * labeled alternative in {@link FlinkSqlParser#errorCapturingIdentifierExtra}.
	 * @param ctx the parse tree
	 */
	void exitErrorIdent(FlinkSqlParser.ErrorIdentContext ctx);
	/**
	 * Enter a parse tree produced by the {@code realIdent}
	 * labeled alternative in {@link FlinkSqlParser#errorCapturingIdentifierExtra}.
	 * @param ctx the parse tree
	 */
	void enterRealIdent(FlinkSqlParser.RealIdentContext ctx);
	/**
	 * Exit a parse tree produced by the {@code realIdent}
	 * labeled alternative in {@link FlinkSqlParser#errorCapturingIdentifierExtra}.
	 * @param ctx the parse tree
	 */
	void exitRealIdent(FlinkSqlParser.RealIdentContext ctx);
	/**
	 * Enter a parse tree produced by {@link FlinkSqlParser#identifierList}.
	 * @param ctx the parse tree
	 */
	void enterIdentifierList(FlinkSqlParser.IdentifierListContext ctx);
	/**
	 * Exit a parse tree produced by {@link FlinkSqlParser#identifierList}.
	 * @param ctx the parse tree
	 */
	void exitIdentifierList(FlinkSqlParser.IdentifierListContext ctx);
	/**
	 * Enter a parse tree produced by {@link FlinkSqlParser#identifierSeq}.
	 * @param ctx the parse tree
	 */
	void enterIdentifierSeq(FlinkSqlParser.IdentifierSeqContext ctx);
	/**
	 * Exit a parse tree produced by {@link FlinkSqlParser#identifierSeq}.
	 * @param ctx the parse tree
	 */
	void exitIdentifierSeq(FlinkSqlParser.IdentifierSeqContext ctx);
	/**
	 * Enter a parse tree produced by {@link FlinkSqlParser#identifier}.
	 * @param ctx the parse tree
	 */
	void enterIdentifier(FlinkSqlParser.IdentifierContext ctx);
	/**
	 * Exit a parse tree produced by {@link FlinkSqlParser#identifier}.
	 * @param ctx the parse tree
	 */
	void exitIdentifier(FlinkSqlParser.IdentifierContext ctx);
	/**
	 * Enter a parse tree produced by the {@code unquotedIdentifierAlternative}
	 * labeled alternative in {@link FlinkSqlParser#strictIdentifier}.
	 * @param ctx the parse tree
	 */
	void enterUnquotedIdentifierAlternative(FlinkSqlParser.UnquotedIdentifierAlternativeContext ctx);
	/**
	 * Exit a parse tree produced by the {@code unquotedIdentifierAlternative}
	 * labeled alternative in {@link FlinkSqlParser#strictIdentifier}.
	 * @param ctx the parse tree
	 */
	void exitUnquotedIdentifierAlternative(FlinkSqlParser.UnquotedIdentifierAlternativeContext ctx);
	/**
	 * Enter a parse tree produced by the {@code quotedIdentifierAlternative}
	 * labeled alternative in {@link FlinkSqlParser#strictIdentifier}.
	 * @param ctx the parse tree
	 */
	void enterQuotedIdentifierAlternative(FlinkSqlParser.QuotedIdentifierAlternativeContext ctx);
	/**
	 * Exit a parse tree produced by the {@code quotedIdentifierAlternative}
	 * labeled alternative in {@link FlinkSqlParser#strictIdentifier}.
	 * @param ctx the parse tree
	 */
	void exitQuotedIdentifierAlternative(FlinkSqlParser.QuotedIdentifierAlternativeContext ctx);
	/**
	 * Enter a parse tree produced by the {@code ansiNonReservedKeywords}
	 * labeled alternative in {@link FlinkSqlParser#strictIdentifier}.
	 * @param ctx the parse tree
	 */
	void enterAnsiNonReservedKeywords(FlinkSqlParser.AnsiNonReservedKeywordsContext ctx);
	/**
	 * Exit a parse tree produced by the {@code ansiNonReservedKeywords}
	 * labeled alternative in {@link FlinkSqlParser#strictIdentifier}.
	 * @param ctx the parse tree
	 */
	void exitAnsiNonReservedKeywords(FlinkSqlParser.AnsiNonReservedKeywordsContext ctx);
	/**
	 * Enter a parse tree produced by the {@code nonReservedKeywords}
	 * labeled alternative in {@link FlinkSqlParser#strictIdentifier}.
	 * @param ctx the parse tree
	 */
	void enterNonReservedKeywords(FlinkSqlParser.NonReservedKeywordsContext ctx);
	/**
	 * Exit a parse tree produced by the {@code nonReservedKeywords}
	 * labeled alternative in {@link FlinkSqlParser#strictIdentifier}.
	 * @param ctx the parse tree
	 */
	void exitNonReservedKeywords(FlinkSqlParser.NonReservedKeywordsContext ctx);
	/**
	 * Enter a parse tree produced by {@link FlinkSqlParser#unquotedIdentifier}.
	 * @param ctx the parse tree
	 */
	void enterUnquotedIdentifier(FlinkSqlParser.UnquotedIdentifierContext ctx);
	/**
	 * Exit a parse tree produced by {@link FlinkSqlParser#unquotedIdentifier}.
	 * @param ctx the parse tree
	 */
	void exitUnquotedIdentifier(FlinkSqlParser.UnquotedIdentifierContext ctx);
	/**
	 * Enter a parse tree produced by {@link FlinkSqlParser#quotedIdentifier}.
	 * @param ctx the parse tree
	 */
	void enterQuotedIdentifier(FlinkSqlParser.QuotedIdentifierContext ctx);
	/**
	 * Exit a parse tree produced by {@link FlinkSqlParser#quotedIdentifier}.
	 * @param ctx the parse tree
	 */
	void exitQuotedIdentifier(FlinkSqlParser.QuotedIdentifierContext ctx);
	/**
	 * Enter a parse tree produced by {@link FlinkSqlParser#whenClause}.
	 * @param ctx the parse tree
	 */
	void enterWhenClause(FlinkSqlParser.WhenClauseContext ctx);
	/**
	 * Exit a parse tree produced by {@link FlinkSqlParser#whenClause}.
	 * @param ctx the parse tree
	 */
	void exitWhenClause(FlinkSqlParser.WhenClauseContext ctx);
	/**
	 * Enter a parse tree produced by {@link FlinkSqlParser#uidList}.
	 * @param ctx the parse tree
	 */
	void enterUidList(FlinkSqlParser.UidListContext ctx);
	/**
	 * Exit a parse tree produced by {@link FlinkSqlParser#uidList}.
	 * @param ctx the parse tree
	 */
	void exitUidList(FlinkSqlParser.UidListContext ctx);
	/**
	 * Enter a parse tree produced by {@link FlinkSqlParser#uid}.
	 * @param ctx the parse tree
	 */
	void enterUid(FlinkSqlParser.UidContext ctx);
	/**
	 * Exit a parse tree produced by {@link FlinkSqlParser#uid}.
	 * @param ctx the parse tree
	 */
	void exitUid(FlinkSqlParser.UidContext ctx);
	/**
	 * Enter a parse tree produced by {@link FlinkSqlParser#plusUid}.
	 * @param ctx the parse tree
	 */
	void enterPlusUid(FlinkSqlParser.PlusUidContext ctx);
	/**
	 * Exit a parse tree produced by {@link FlinkSqlParser#plusUid}.
	 * @param ctx the parse tree
	 */
	void exitPlusUid(FlinkSqlParser.PlusUidContext ctx);
	/**
	 * Enter a parse tree produced by {@link FlinkSqlParser#withOption}.
	 * @param ctx the parse tree
	 */
	void enterWithOption(FlinkSqlParser.WithOptionContext ctx);
	/**
	 * Exit a parse tree produced by {@link FlinkSqlParser#withOption}.
	 * @param ctx the parse tree
	 */
	void exitWithOption(FlinkSqlParser.WithOptionContext ctx);
	/**
	 * Enter a parse tree produced by {@link FlinkSqlParser#ifNotExists}.
	 * @param ctx the parse tree
	 */
	void enterIfNotExists(FlinkSqlParser.IfNotExistsContext ctx);
	/**
	 * Exit a parse tree produced by {@link FlinkSqlParser#ifNotExists}.
	 * @param ctx the parse tree
	 */
	void exitIfNotExists(FlinkSqlParser.IfNotExistsContext ctx);
	/**
	 * Enter a parse tree produced by {@link FlinkSqlParser#ifExists}.
	 * @param ctx the parse tree
	 */
	void enterIfExists(FlinkSqlParser.IfExistsContext ctx);
	/**
	 * Exit a parse tree produced by {@link FlinkSqlParser#ifExists}.
	 * @param ctx the parse tree
	 */
	void exitIfExists(FlinkSqlParser.IfExistsContext ctx);
	/**
	 * Enter a parse tree produced by {@link FlinkSqlParser#tablePropertyList}.
	 * @param ctx the parse tree
	 */
	void enterTablePropertyList(FlinkSqlParser.TablePropertyListContext ctx);
	/**
	 * Exit a parse tree produced by {@link FlinkSqlParser#tablePropertyList}.
	 * @param ctx the parse tree
	 */
	void exitTablePropertyList(FlinkSqlParser.TablePropertyListContext ctx);
	/**
	 * Enter a parse tree produced by {@link FlinkSqlParser#tableProperty}.
	 * @param ctx the parse tree
	 */
	void enterTableProperty(FlinkSqlParser.TablePropertyContext ctx);
	/**
	 * Exit a parse tree produced by {@link FlinkSqlParser#tableProperty}.
	 * @param ctx the parse tree
	 */
	void exitTableProperty(FlinkSqlParser.TablePropertyContext ctx);
	/**
	 * Enter a parse tree produced by {@link FlinkSqlParser#tablePropertyKey}.
	 * @param ctx the parse tree
	 */
	void enterTablePropertyKey(FlinkSqlParser.TablePropertyKeyContext ctx);
	/**
	 * Exit a parse tree produced by {@link FlinkSqlParser#tablePropertyKey}.
	 * @param ctx the parse tree
	 */
	void exitTablePropertyKey(FlinkSqlParser.TablePropertyKeyContext ctx);
	/**
	 * Enter a parse tree produced by {@link FlinkSqlParser#tablePropertyValue}.
	 * @param ctx the parse tree
	 */
	void enterTablePropertyValue(FlinkSqlParser.TablePropertyValueContext ctx);
	/**
	 * Exit a parse tree produced by {@link FlinkSqlParser#tablePropertyValue}.
	 * @param ctx the parse tree
	 */
	void exitTablePropertyValue(FlinkSqlParser.TablePropertyValueContext ctx);
	/**
	 * Enter a parse tree produced by {@link FlinkSqlParser#logicalOperator}.
	 * @param ctx the parse tree
	 */
	void enterLogicalOperator(FlinkSqlParser.LogicalOperatorContext ctx);
	/**
	 * Exit a parse tree produced by {@link FlinkSqlParser#logicalOperator}.
	 * @param ctx the parse tree
	 */
	void exitLogicalOperator(FlinkSqlParser.LogicalOperatorContext ctx);
	/**
	 * Enter a parse tree produced by {@link FlinkSqlParser#comparisonOperator}.
	 * @param ctx the parse tree
	 */
	void enterComparisonOperator(FlinkSqlParser.ComparisonOperatorContext ctx);
	/**
	 * Exit a parse tree produced by {@link FlinkSqlParser#comparisonOperator}.
	 * @param ctx the parse tree
	 */
	void exitComparisonOperator(FlinkSqlParser.ComparisonOperatorContext ctx);
	/**
	 * Enter a parse tree produced by {@link FlinkSqlParser#bitOperator}.
	 * @param ctx the parse tree
	 */
	void enterBitOperator(FlinkSqlParser.BitOperatorContext ctx);
	/**
	 * Exit a parse tree produced by {@link FlinkSqlParser#bitOperator}.
	 * @param ctx the parse tree
	 */
	void exitBitOperator(FlinkSqlParser.BitOperatorContext ctx);
	/**
	 * Enter a parse tree produced by {@link FlinkSqlParser#mathOperator}.
	 * @param ctx the parse tree
	 */
	void enterMathOperator(FlinkSqlParser.MathOperatorContext ctx);
	/**
	 * Exit a parse tree produced by {@link FlinkSqlParser#mathOperator}.
	 * @param ctx the parse tree
	 */
	void exitMathOperator(FlinkSqlParser.MathOperatorContext ctx);
	/**
	 * Enter a parse tree produced by {@link FlinkSqlParser#unaryOperator}.
	 * @param ctx the parse tree
	 */
	void enterUnaryOperator(FlinkSqlParser.UnaryOperatorContext ctx);
	/**
	 * Exit a parse tree produced by {@link FlinkSqlParser#unaryOperator}.
	 * @param ctx the parse tree
	 */
	void exitUnaryOperator(FlinkSqlParser.UnaryOperatorContext ctx);
	/**
	 * Enter a parse tree produced by {@link FlinkSqlParser#fullColumnName}.
	 * @param ctx the parse tree
	 */
	void enterFullColumnName(FlinkSqlParser.FullColumnNameContext ctx);
	/**
	 * Exit a parse tree produced by {@link FlinkSqlParser#fullColumnName}.
	 * @param ctx the parse tree
	 */
	void exitFullColumnName(FlinkSqlParser.FullColumnNameContext ctx);
	/**
	 * Enter a parse tree produced by {@link FlinkSqlParser#constant}.
	 * @param ctx the parse tree
	 */
	void enterConstant(FlinkSqlParser.ConstantContext ctx);
	/**
	 * Exit a parse tree produced by {@link FlinkSqlParser#constant}.
	 * @param ctx the parse tree
	 */
	void exitConstant(FlinkSqlParser.ConstantContext ctx);
	/**
	 * Enter a parse tree produced by {@link FlinkSqlParser#stringLiteral}.
	 * @param ctx the parse tree
	 */
	void enterStringLiteral(FlinkSqlParser.StringLiteralContext ctx);
	/**
	 * Exit a parse tree produced by {@link FlinkSqlParser#stringLiteral}.
	 * @param ctx the parse tree
	 */
	void exitStringLiteral(FlinkSqlParser.StringLiteralContext ctx);
	/**
	 * Enter a parse tree produced by {@link FlinkSqlParser#decimalLiteral}.
	 * @param ctx the parse tree
	 */
	void enterDecimalLiteral(FlinkSqlParser.DecimalLiteralContext ctx);
	/**
	 * Exit a parse tree produced by {@link FlinkSqlParser#decimalLiteral}.
	 * @param ctx the parse tree
	 */
	void exitDecimalLiteral(FlinkSqlParser.DecimalLiteralContext ctx);
	/**
	 * Enter a parse tree produced by {@link FlinkSqlParser#booleanLiteral}.
	 * @param ctx the parse tree
	 */
	void enterBooleanLiteral(FlinkSqlParser.BooleanLiteralContext ctx);
	/**
	 * Exit a parse tree produced by {@link FlinkSqlParser#booleanLiteral}.
	 * @param ctx the parse tree
	 */
	void exitBooleanLiteral(FlinkSqlParser.BooleanLiteralContext ctx);
	/**
	 * Enter a parse tree produced by {@link FlinkSqlParser#setQuantifier}.
	 * @param ctx the parse tree
	 */
	void enterSetQuantifier(FlinkSqlParser.SetQuantifierContext ctx);
	/**
	 * Exit a parse tree produced by {@link FlinkSqlParser#setQuantifier}.
	 * @param ctx the parse tree
	 */
	void exitSetQuantifier(FlinkSqlParser.SetQuantifierContext ctx);
	/**
	 * Enter a parse tree produced by {@link FlinkSqlParser#ansiNonReserved}.
	 * @param ctx the parse tree
	 */
	void enterAnsiNonReserved(FlinkSqlParser.AnsiNonReservedContext ctx);
	/**
	 * Exit a parse tree produced by {@link FlinkSqlParser#ansiNonReserved}.
	 * @param ctx the parse tree
	 */
	void exitAnsiNonReserved(FlinkSqlParser.AnsiNonReservedContext ctx);
	/**
	 * Enter a parse tree produced by {@link FlinkSqlParser#strictNonReserved}.
	 * @param ctx the parse tree
	 */
	void enterStrictNonReserved(FlinkSqlParser.StrictNonReservedContext ctx);
	/**
	 * Exit a parse tree produced by {@link FlinkSqlParser#strictNonReserved}.
	 * @param ctx the parse tree
	 */
	void exitStrictNonReserved(FlinkSqlParser.StrictNonReservedContext ctx);
	/**
	 * Enter a parse tree produced by {@link FlinkSqlParser#nonReserved}.
	 * @param ctx the parse tree
	 */
	void enterNonReserved(FlinkSqlParser.NonReservedContext ctx);
	/**
	 * Exit a parse tree produced by {@link FlinkSqlParser#nonReserved}.
	 * @param ctx the parse tree
	 */
	void exitNonReserved(FlinkSqlParser.NonReservedContext ctx);
}