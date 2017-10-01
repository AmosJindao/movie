package db.bean.performance_schema;

import java.util.Date;

/**
*/
public class EventsStatementsSummaryByProgram{
/**Column{tableCatalog='def', tableSchema='performance_schema', tableName='events_statements_summary_by_program', columnName='OBJECT_TYPE', ordinalPosition=1, columnDefault='null', isNullable='YES', dataType='enum', characterMaximumLength=9, characterOctetLength=27, numericPrecision=0, numericScale=0, datetimePrecision=0, characterSetName='utf8', collationName='utf8_general_ci', columnType='enum('EVENT','FUNCTION','PROCEDURE','TABLE','TRIGGER')', columnKey='', extra='', privileges='select,insert,update,references', columnComment='', generationExpression=''}*/
private Date objectType;

/**Column{tableCatalog='def', tableSchema='performance_schema', tableName='events_statements_summary_by_program', columnName='OBJECT_SCHEMA', ordinalPosition=2, columnDefault='null', isNullable='NO', dataType='varchar', characterMaximumLength=64, characterOctetLength=192, numericPrecision=0, numericScale=0, datetimePrecision=0, characterSetName='utf8', collationName='utf8_general_ci', columnType='varchar(64)', columnKey='', extra='', privileges='select,insert,update,references', columnComment='', generationExpression=''}*/
private String objectSchema;

/**Column{tableCatalog='def', tableSchema='performance_schema', tableName='events_statements_summary_by_program', columnName='OBJECT_NAME', ordinalPosition=3, columnDefault='null', isNullable='NO', dataType='varchar', characterMaximumLength=64, characterOctetLength=192, numericPrecision=0, numericScale=0, datetimePrecision=0, characterSetName='utf8', collationName='utf8_general_ci', columnType='varchar(64)', columnKey='', extra='', privileges='select,insert,update,references', columnComment='', generationExpression=''}*/
private String objectName;

/**Column{tableCatalog='def', tableSchema='performance_schema', tableName='events_statements_summary_by_program', columnName='COUNT_STAR', ordinalPosition=4, columnDefault='null', isNullable='NO', dataType='bigint', characterMaximumLength=0, characterOctetLength=0, numericPrecision=20, numericScale=0, datetimePrecision=0, characterSetName='null', collationName='null', columnType='bigint(20) unsigned', columnKey='', extra='', privileges='select,insert,update,references', columnComment='', generationExpression=''}*/
private Long countStar;

/**Column{tableCatalog='def', tableSchema='performance_schema', tableName='events_statements_summary_by_program', columnName='SUM_TIMER_WAIT', ordinalPosition=5, columnDefault='null', isNullable='NO', dataType='bigint', characterMaximumLength=0, characterOctetLength=0, numericPrecision=20, numericScale=0, datetimePrecision=0, characterSetName='null', collationName='null', columnType='bigint(20) unsigned', columnKey='', extra='', privileges='select,insert,update,references', columnComment='', generationExpression=''}*/
private Long sumTimerWait;

/**Column{tableCatalog='def', tableSchema='performance_schema', tableName='events_statements_summary_by_program', columnName='MIN_TIMER_WAIT', ordinalPosition=6, columnDefault='null', isNullable='NO', dataType='bigint', characterMaximumLength=0, characterOctetLength=0, numericPrecision=20, numericScale=0, datetimePrecision=0, characterSetName='null', collationName='null', columnType='bigint(20) unsigned', columnKey='', extra='', privileges='select,insert,update,references', columnComment='', generationExpression=''}*/
private Long minTimerWait;

/**Column{tableCatalog='def', tableSchema='performance_schema', tableName='events_statements_summary_by_program', columnName='AVG_TIMER_WAIT', ordinalPosition=7, columnDefault='null', isNullable='NO', dataType='bigint', characterMaximumLength=0, characterOctetLength=0, numericPrecision=20, numericScale=0, datetimePrecision=0, characterSetName='null', collationName='null', columnType='bigint(20) unsigned', columnKey='', extra='', privileges='select,insert,update,references', columnComment='', generationExpression=''}*/
private Long avgTimerWait;

/**Column{tableCatalog='def', tableSchema='performance_schema', tableName='events_statements_summary_by_program', columnName='MAX_TIMER_WAIT', ordinalPosition=8, columnDefault='null', isNullable='NO', dataType='bigint', characterMaximumLength=0, characterOctetLength=0, numericPrecision=20, numericScale=0, datetimePrecision=0, characterSetName='null', collationName='null', columnType='bigint(20) unsigned', columnKey='', extra='', privileges='select,insert,update,references', columnComment='', generationExpression=''}*/
private Long maxTimerWait;

/**Column{tableCatalog='def', tableSchema='performance_schema', tableName='events_statements_summary_by_program', columnName='COUNT_STATEMENTS', ordinalPosition=9, columnDefault='null', isNullable='NO', dataType='bigint', characterMaximumLength=0, characterOctetLength=0, numericPrecision=20, numericScale=0, datetimePrecision=0, characterSetName='null', collationName='null', columnType='bigint(20) unsigned', columnKey='', extra='', privileges='select,insert,update,references', columnComment='', generationExpression=''}*/
private Long countStatements;

/**Column{tableCatalog='def', tableSchema='performance_schema', tableName='events_statements_summary_by_program', columnName='SUM_STATEMENTS_WAIT', ordinalPosition=10, columnDefault='null', isNullable='NO', dataType='bigint', characterMaximumLength=0, characterOctetLength=0, numericPrecision=20, numericScale=0, datetimePrecision=0, characterSetName='null', collationName='null', columnType='bigint(20) unsigned', columnKey='', extra='', privileges='select,insert,update,references', columnComment='', generationExpression=''}*/
private Long sumStatementsWait;

/**Column{tableCatalog='def', tableSchema='performance_schema', tableName='events_statements_summary_by_program', columnName='MIN_STATEMENTS_WAIT', ordinalPosition=11, columnDefault='null', isNullable='NO', dataType='bigint', characterMaximumLength=0, characterOctetLength=0, numericPrecision=20, numericScale=0, datetimePrecision=0, characterSetName='null', collationName='null', columnType='bigint(20) unsigned', columnKey='', extra='', privileges='select,insert,update,references', columnComment='', generationExpression=''}*/
private Long minStatementsWait;

/**Column{tableCatalog='def', tableSchema='performance_schema', tableName='events_statements_summary_by_program', columnName='AVG_STATEMENTS_WAIT', ordinalPosition=12, columnDefault='null', isNullable='NO', dataType='bigint', characterMaximumLength=0, characterOctetLength=0, numericPrecision=20, numericScale=0, datetimePrecision=0, characterSetName='null', collationName='null', columnType='bigint(20) unsigned', columnKey='', extra='', privileges='select,insert,update,references', columnComment='', generationExpression=''}*/
private Long avgStatementsWait;

/**Column{tableCatalog='def', tableSchema='performance_schema', tableName='events_statements_summary_by_program', columnName='MAX_STATEMENTS_WAIT', ordinalPosition=13, columnDefault='null', isNullable='NO', dataType='bigint', characterMaximumLength=0, characterOctetLength=0, numericPrecision=20, numericScale=0, datetimePrecision=0, characterSetName='null', collationName='null', columnType='bigint(20) unsigned', columnKey='', extra='', privileges='select,insert,update,references', columnComment='', generationExpression=''}*/
private Long maxStatementsWait;

/**Column{tableCatalog='def', tableSchema='performance_schema', tableName='events_statements_summary_by_program', columnName='SUM_LOCK_TIME', ordinalPosition=14, columnDefault='null', isNullable='NO', dataType='bigint', characterMaximumLength=0, characterOctetLength=0, numericPrecision=20, numericScale=0, datetimePrecision=0, characterSetName='null', collationName='null', columnType='bigint(20) unsigned', columnKey='', extra='', privileges='select,insert,update,references', columnComment='', generationExpression=''}*/
private Long sumLockTime;

/**Column{tableCatalog='def', tableSchema='performance_schema', tableName='events_statements_summary_by_program', columnName='SUM_ERRORS', ordinalPosition=15, columnDefault='null', isNullable='NO', dataType='bigint', characterMaximumLength=0, characterOctetLength=0, numericPrecision=20, numericScale=0, datetimePrecision=0, characterSetName='null', collationName='null', columnType='bigint(20) unsigned', columnKey='', extra='', privileges='select,insert,update,references', columnComment='', generationExpression=''}*/
private Long sumErrors;

/**Column{tableCatalog='def', tableSchema='performance_schema', tableName='events_statements_summary_by_program', columnName='SUM_WARNINGS', ordinalPosition=16, columnDefault='null', isNullable='NO', dataType='bigint', characterMaximumLength=0, characterOctetLength=0, numericPrecision=20, numericScale=0, datetimePrecision=0, characterSetName='null', collationName='null', columnType='bigint(20) unsigned', columnKey='', extra='', privileges='select,insert,update,references', columnComment='', generationExpression=''}*/
private Long sumWarnings;

/**Column{tableCatalog='def', tableSchema='performance_schema', tableName='events_statements_summary_by_program', columnName='SUM_ROWS_AFFECTED', ordinalPosition=17, columnDefault='null', isNullable='NO', dataType='bigint', characterMaximumLength=0, characterOctetLength=0, numericPrecision=20, numericScale=0, datetimePrecision=0, characterSetName='null', collationName='null', columnType='bigint(20) unsigned', columnKey='', extra='', privileges='select,insert,update,references', columnComment='', generationExpression=''}*/
private Long sumRowsAffected;

/**Column{tableCatalog='def', tableSchema='performance_schema', tableName='events_statements_summary_by_program', columnName='SUM_ROWS_SENT', ordinalPosition=18, columnDefault='null', isNullable='NO', dataType='bigint', characterMaximumLength=0, characterOctetLength=0, numericPrecision=20, numericScale=0, datetimePrecision=0, characterSetName='null', collationName='null', columnType='bigint(20) unsigned', columnKey='', extra='', privileges='select,insert,update,references', columnComment='', generationExpression=''}*/
private Long sumRowsSent;

/**Column{tableCatalog='def', tableSchema='performance_schema', tableName='events_statements_summary_by_program', columnName='SUM_ROWS_EXAMINED', ordinalPosition=19, columnDefault='null', isNullable='NO', dataType='bigint', characterMaximumLength=0, characterOctetLength=0, numericPrecision=20, numericScale=0, datetimePrecision=0, characterSetName='null', collationName='null', columnType='bigint(20) unsigned', columnKey='', extra='', privileges='select,insert,update,references', columnComment='', generationExpression=''}*/
private Long sumRowsExamined;

/**Column{tableCatalog='def', tableSchema='performance_schema', tableName='events_statements_summary_by_program', columnName='SUM_CREATED_TMP_DISK_TABLES', ordinalPosition=20, columnDefault='null', isNullable='NO', dataType='bigint', characterMaximumLength=0, characterOctetLength=0, numericPrecision=20, numericScale=0, datetimePrecision=0, characterSetName='null', collationName='null', columnType='bigint(20) unsigned', columnKey='', extra='', privileges='select,insert,update,references', columnComment='', generationExpression=''}*/
private Long sumCreatedTmpDiskTables;

/**Column{tableCatalog='def', tableSchema='performance_schema', tableName='events_statements_summary_by_program', columnName='SUM_CREATED_TMP_TABLES', ordinalPosition=21, columnDefault='null', isNullable='NO', dataType='bigint', characterMaximumLength=0, characterOctetLength=0, numericPrecision=20, numericScale=0, datetimePrecision=0, characterSetName='null', collationName='null', columnType='bigint(20) unsigned', columnKey='', extra='', privileges='select,insert,update,references', columnComment='', generationExpression=''}*/
private Long sumCreatedTmpTables;

/**Column{tableCatalog='def', tableSchema='performance_schema', tableName='events_statements_summary_by_program', columnName='SUM_SELECT_FULL_JOIN', ordinalPosition=22, columnDefault='null', isNullable='NO', dataType='bigint', characterMaximumLength=0, characterOctetLength=0, numericPrecision=20, numericScale=0, datetimePrecision=0, characterSetName='null', collationName='null', columnType='bigint(20) unsigned', columnKey='', extra='', privileges='select,insert,update,references', columnComment='', generationExpression=''}*/
private Long sumSelectFullJoin;

/**Column{tableCatalog='def', tableSchema='performance_schema', tableName='events_statements_summary_by_program', columnName='SUM_SELECT_FULL_RANGE_JOIN', ordinalPosition=23, columnDefault='null', isNullable='NO', dataType='bigint', characterMaximumLength=0, characterOctetLength=0, numericPrecision=20, numericScale=0, datetimePrecision=0, characterSetName='null', collationName='null', columnType='bigint(20) unsigned', columnKey='', extra='', privileges='select,insert,update,references', columnComment='', generationExpression=''}*/
private Long sumSelectFullRangeJoin;

/**Column{tableCatalog='def', tableSchema='performance_schema', tableName='events_statements_summary_by_program', columnName='SUM_SELECT_RANGE', ordinalPosition=24, columnDefault='null', isNullable='NO', dataType='bigint', characterMaximumLength=0, characterOctetLength=0, numericPrecision=20, numericScale=0, datetimePrecision=0, characterSetName='null', collationName='null', columnType='bigint(20) unsigned', columnKey='', extra='', privileges='select,insert,update,references', columnComment='', generationExpression=''}*/
private Long sumSelectRange;

/**Column{tableCatalog='def', tableSchema='performance_schema', tableName='events_statements_summary_by_program', columnName='SUM_SELECT_RANGE_CHECK', ordinalPosition=25, columnDefault='null', isNullable='NO', dataType='bigint', characterMaximumLength=0, characterOctetLength=0, numericPrecision=20, numericScale=0, datetimePrecision=0, characterSetName='null', collationName='null', columnType='bigint(20) unsigned', columnKey='', extra='', privileges='select,insert,update,references', columnComment='', generationExpression=''}*/
private Long sumSelectRangeCheck;

/**Column{tableCatalog='def', tableSchema='performance_schema', tableName='events_statements_summary_by_program', columnName='SUM_SELECT_SCAN', ordinalPosition=26, columnDefault='null', isNullable='NO', dataType='bigint', characterMaximumLength=0, characterOctetLength=0, numericPrecision=20, numericScale=0, datetimePrecision=0, characterSetName='null', collationName='null', columnType='bigint(20) unsigned', columnKey='', extra='', privileges='select,insert,update,references', columnComment='', generationExpression=''}*/
private Long sumSelectScan;

/**Column{tableCatalog='def', tableSchema='performance_schema', tableName='events_statements_summary_by_program', columnName='SUM_SORT_MERGE_PASSES', ordinalPosition=27, columnDefault='null', isNullable='NO', dataType='bigint', characterMaximumLength=0, characterOctetLength=0, numericPrecision=20, numericScale=0, datetimePrecision=0, characterSetName='null', collationName='null', columnType='bigint(20) unsigned', columnKey='', extra='', privileges='select,insert,update,references', columnComment='', generationExpression=''}*/
private Long sumSortMergePasses;

/**Column{tableCatalog='def', tableSchema='performance_schema', tableName='events_statements_summary_by_program', columnName='SUM_SORT_RANGE', ordinalPosition=28, columnDefault='null', isNullable='NO', dataType='bigint', characterMaximumLength=0, characterOctetLength=0, numericPrecision=20, numericScale=0, datetimePrecision=0, characterSetName='null', collationName='null', columnType='bigint(20) unsigned', columnKey='', extra='', privileges='select,insert,update,references', columnComment='', generationExpression=''}*/
private Long sumSortRange;

/**Column{tableCatalog='def', tableSchema='performance_schema', tableName='events_statements_summary_by_program', columnName='SUM_SORT_ROWS', ordinalPosition=29, columnDefault='null', isNullable='NO', dataType='bigint', characterMaximumLength=0, characterOctetLength=0, numericPrecision=20, numericScale=0, datetimePrecision=0, characterSetName='null', collationName='null', columnType='bigint(20) unsigned', columnKey='', extra='', privileges='select,insert,update,references', columnComment='', generationExpression=''}*/
private Long sumSortRows;

/**Column{tableCatalog='def', tableSchema='performance_schema', tableName='events_statements_summary_by_program', columnName='SUM_SORT_SCAN', ordinalPosition=30, columnDefault='null', isNullable='NO', dataType='bigint', characterMaximumLength=0, characterOctetLength=0, numericPrecision=20, numericScale=0, datetimePrecision=0, characterSetName='null', collationName='null', columnType='bigint(20) unsigned', columnKey='', extra='', privileges='select,insert,update,references', columnComment='', generationExpression=''}*/
private Long sumSortScan;

/**Column{tableCatalog='def', tableSchema='performance_schema', tableName='events_statements_summary_by_program', columnName='SUM_NO_INDEX_USED', ordinalPosition=31, columnDefault='null', isNullable='NO', dataType='bigint', characterMaximumLength=0, characterOctetLength=0, numericPrecision=20, numericScale=0, datetimePrecision=0, characterSetName='null', collationName='null', columnType='bigint(20) unsigned', columnKey='', extra='', privileges='select,insert,update,references', columnComment='', generationExpression=''}*/
private Long sumNoIndexUsed;

/**Column{tableCatalog='def', tableSchema='performance_schema', tableName='events_statements_summary_by_program', columnName='SUM_NO_GOOD_INDEX_USED', ordinalPosition=32, columnDefault='null', isNullable='NO', dataType='bigint', characterMaximumLength=0, characterOctetLength=0, numericPrecision=20, numericScale=0, datetimePrecision=0, characterSetName='null', collationName='null', columnType='bigint(20) unsigned', columnKey='', extra='', privileges='select,insert,update,references', columnComment='', generationExpression=''}*/
private Long sumNoGoodIndexUsed;

public Date getObjectType(){
return objectType;
}

public String getObjectSchema(){
return objectSchema;
}

public String getObjectName(){
return objectName;
}

public Long getCountStar(){
return countStar;
}

public Long getSumTimerWait(){
return sumTimerWait;
}

public Long getMinTimerWait(){
return minTimerWait;
}

public Long getAvgTimerWait(){
return avgTimerWait;
}

public Long getMaxTimerWait(){
return maxTimerWait;
}

public Long getCountStatements(){
return countStatements;
}

public Long getSumStatementsWait(){
return sumStatementsWait;
}

public Long getMinStatementsWait(){
return minStatementsWait;
}

public Long getAvgStatementsWait(){
return avgStatementsWait;
}

public Long getMaxStatementsWait(){
return maxStatementsWait;
}

public Long getSumLockTime(){
return sumLockTime;
}

public Long getSumErrors(){
return sumErrors;
}

public Long getSumWarnings(){
return sumWarnings;
}

public Long getSumRowsAffected(){
return sumRowsAffected;
}

public Long getSumRowsSent(){
return sumRowsSent;
}

public Long getSumRowsExamined(){
return sumRowsExamined;
}

public Long getSumCreatedTmpDiskTables(){
return sumCreatedTmpDiskTables;
}

public Long getSumCreatedTmpTables(){
return sumCreatedTmpTables;
}

public Long getSumSelectFullJoin(){
return sumSelectFullJoin;
}

public Long getSumSelectFullRangeJoin(){
return sumSelectFullRangeJoin;
}

public Long getSumSelectRange(){
return sumSelectRange;
}

public Long getSumSelectRangeCheck(){
return sumSelectRangeCheck;
}

public Long getSumSelectScan(){
return sumSelectScan;
}

public Long getSumSortMergePasses(){
return sumSortMergePasses;
}

public Long getSumSortRange(){
return sumSortRange;
}

public Long getSumSortRows(){
return sumSortRows;
}

public Long getSumSortScan(){
return sumSortScan;
}

public Long getSumNoIndexUsed(){
return sumNoIndexUsed;
}

public Long getSumNoGoodIndexUsed(){
return sumNoGoodIndexUsed;
}

}