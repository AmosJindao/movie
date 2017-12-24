package db.bean.performance_schema;

import java.util.Date;

/* SELECT SCHEMA_NAME AS schemaName, DIGEST AS digest, DIGEST_TEXT AS digestText, COUNT_STAR AS countStar, SUM_TIMER_WAIT AS sumTimerWait, MIN_TIMER_WAIT AS minTimerWait, AVG_TIMER_WAIT AS avgTimerWait, MAX_TIMER_WAIT AS maxTimerWait, SUM_LOCK_TIME AS sumLockTime, SUM_ERRORS AS sumErrors, SUM_WARNINGS AS sumWarnings, SUM_ROWS_AFFECTED AS sumRowsAffected, SUM_ROWS_SENT AS sumRowsSent, SUM_ROWS_EXAMINED AS sumRowsExamined, SUM_CREATED_TMP_DISK_TABLES AS sumCreatedTmpDiskTables, SUM_CREATED_TMP_TABLES AS sumCreatedTmpTables, SUM_SELECT_FULL_JOIN AS sumSelectFullJoin, SUM_SELECT_FULL_RANGE_JOIN AS sumSelectFullRangeJoin, SUM_SELECT_RANGE AS sumSelectRange, SUM_SELECT_RANGE_CHECK AS sumSelectRangeCheck, SUM_SELECT_SCAN AS sumSelectScan, SUM_SORT_MERGE_PASSES AS sumSortMergePasses, SUM_SORT_RANGE AS sumSortRange, SUM_SORT_ROWS AS sumSortRows, SUM_SORT_SCAN AS sumSortScan, SUM_NO_INDEX_USED AS sumNoIndexUsed, SUM_NO_GOOD_INDEX_USED AS sumNoGoodIndexUsed, FIRST_SEEN AS firstSeen, LAST_SEEN AS lastSeen FROM performance_schema.events_statements_summary_by_digest */
/**
*/
public class EventsStatementsSummaryByDigest{
/**Column{tableCatalog='def', tableSchema='performance_schema', tableName='events_statements_summary_by_digest', columnName='SCHEMA_NAME', ordinalPosition=1, columnDefault='null', isNullable='YES', dataType='varchar', characterMaximumLength=64, characterOctetLength=192, numericPrecision=0, numericScale=0, datetimePrecision=0, characterSetName='utf8', collationName='utf8_general_ci', columnType='varchar(64)', columnKey='', extra='', privileges='select,insert,update,references', columnComment='', generationExpression=''}*/
private String schemaName;

/**Column{tableCatalog='def', tableSchema='performance_schema', tableName='events_statements_summary_by_digest', columnName='DIGEST', ordinalPosition=2, columnDefault='null', isNullable='YES', dataType='varchar', characterMaximumLength=32, characterOctetLength=96, numericPrecision=0, numericScale=0, datetimePrecision=0, characterSetName='utf8', collationName='utf8_general_ci', columnType='varchar(32)', columnKey='', extra='', privileges='select,insert,update,references', columnComment='', generationExpression=''}*/
private String digest;

/**Column{tableCatalog='def', tableSchema='performance_schema', tableName='events_statements_summary_by_digest', columnName='DIGEST_TEXT', ordinalPosition=3, columnDefault='null', isNullable='YES', dataType='longtext', characterMaximumLength=4294967295, characterOctetLength=4294967295, numericPrecision=0, numericScale=0, datetimePrecision=0, characterSetName='utf8', collationName='utf8_general_ci', columnType='longtext', columnKey='', extra='', privileges='select,insert,update,references', columnComment='', generationExpression=''}*/
private String digestText;

/**Column{tableCatalog='def', tableSchema='performance_schema', tableName='events_statements_summary_by_digest', columnName='COUNT_STAR', ordinalPosition=4, columnDefault='null', isNullable='NO', dataType='bigint', characterMaximumLength=0, characterOctetLength=0, numericPrecision=20, numericScale=0, datetimePrecision=0, characterSetName='null', collationName='null', columnType='bigint(20) unsigned', columnKey='', extra='', privileges='select,insert,update,references', columnComment='', generationExpression=''}*/
private Long countStar;

/**Column{tableCatalog='def', tableSchema='performance_schema', tableName='events_statements_summary_by_digest', columnName='SUM_TIMER_WAIT', ordinalPosition=5, columnDefault='null', isNullable='NO', dataType='bigint', characterMaximumLength=0, characterOctetLength=0, numericPrecision=20, numericScale=0, datetimePrecision=0, characterSetName='null', collationName='null', columnType='bigint(20) unsigned', columnKey='', extra='', privileges='select,insert,update,references', columnComment='', generationExpression=''}*/
private Long sumTimerWait;

/**Column{tableCatalog='def', tableSchema='performance_schema', tableName='events_statements_summary_by_digest', columnName='MIN_TIMER_WAIT', ordinalPosition=6, columnDefault='null', isNullable='NO', dataType='bigint', characterMaximumLength=0, characterOctetLength=0, numericPrecision=20, numericScale=0, datetimePrecision=0, characterSetName='null', collationName='null', columnType='bigint(20) unsigned', columnKey='', extra='', privileges='select,insert,update,references', columnComment='', generationExpression=''}*/
private Long minTimerWait;

/**Column{tableCatalog='def', tableSchema='performance_schema', tableName='events_statements_summary_by_digest', columnName='AVG_TIMER_WAIT', ordinalPosition=7, columnDefault='null', isNullable='NO', dataType='bigint', characterMaximumLength=0, characterOctetLength=0, numericPrecision=20, numericScale=0, datetimePrecision=0, characterSetName='null', collationName='null', columnType='bigint(20) unsigned', columnKey='', extra='', privileges='select,insert,update,references', columnComment='', generationExpression=''}*/
private Long avgTimerWait;

/**Column{tableCatalog='def', tableSchema='performance_schema', tableName='events_statements_summary_by_digest', columnName='MAX_TIMER_WAIT', ordinalPosition=8, columnDefault='null', isNullable='NO', dataType='bigint', characterMaximumLength=0, characterOctetLength=0, numericPrecision=20, numericScale=0, datetimePrecision=0, characterSetName='null', collationName='null', columnType='bigint(20) unsigned', columnKey='', extra='', privileges='select,insert,update,references', columnComment='', generationExpression=''}*/
private Long maxTimerWait;

/**Column{tableCatalog='def', tableSchema='performance_schema', tableName='events_statements_summary_by_digest', columnName='SUM_LOCK_TIME', ordinalPosition=9, columnDefault='null', isNullable='NO', dataType='bigint', characterMaximumLength=0, characterOctetLength=0, numericPrecision=20, numericScale=0, datetimePrecision=0, characterSetName='null', collationName='null', columnType='bigint(20) unsigned', columnKey='', extra='', privileges='select,insert,update,references', columnComment='', generationExpression=''}*/
private Long sumLockTime;

/**Column{tableCatalog='def', tableSchema='performance_schema', tableName='events_statements_summary_by_digest', columnName='SUM_ERRORS', ordinalPosition=10, columnDefault='null', isNullable='NO', dataType='bigint', characterMaximumLength=0, characterOctetLength=0, numericPrecision=20, numericScale=0, datetimePrecision=0, characterSetName='null', collationName='null', columnType='bigint(20) unsigned', columnKey='', extra='', privileges='select,insert,update,references', columnComment='', generationExpression=''}*/
private Long sumErrors;

/**Column{tableCatalog='def', tableSchema='performance_schema', tableName='events_statements_summary_by_digest', columnName='SUM_WARNINGS', ordinalPosition=11, columnDefault='null', isNullable='NO', dataType='bigint', characterMaximumLength=0, characterOctetLength=0, numericPrecision=20, numericScale=0, datetimePrecision=0, characterSetName='null', collationName='null', columnType='bigint(20) unsigned', columnKey='', extra='', privileges='select,insert,update,references', columnComment='', generationExpression=''}*/
private Long sumWarnings;

/**Column{tableCatalog='def', tableSchema='performance_schema', tableName='events_statements_summary_by_digest', columnName='SUM_ROWS_AFFECTED', ordinalPosition=12, columnDefault='null', isNullable='NO', dataType='bigint', characterMaximumLength=0, characterOctetLength=0, numericPrecision=20, numericScale=0, datetimePrecision=0, characterSetName='null', collationName='null', columnType='bigint(20) unsigned', columnKey='', extra='', privileges='select,insert,update,references', columnComment='', generationExpression=''}*/
private Long sumRowsAffected;

/**Column{tableCatalog='def', tableSchema='performance_schema', tableName='events_statements_summary_by_digest', columnName='SUM_ROWS_SENT', ordinalPosition=13, columnDefault='null', isNullable='NO', dataType='bigint', characterMaximumLength=0, characterOctetLength=0, numericPrecision=20, numericScale=0, datetimePrecision=0, characterSetName='null', collationName='null', columnType='bigint(20) unsigned', columnKey='', extra='', privileges='select,insert,update,references', columnComment='', generationExpression=''}*/
private Long sumRowsSent;

/**Column{tableCatalog='def', tableSchema='performance_schema', tableName='events_statements_summary_by_digest', columnName='SUM_ROWS_EXAMINED', ordinalPosition=14, columnDefault='null', isNullable='NO', dataType='bigint', characterMaximumLength=0, characterOctetLength=0, numericPrecision=20, numericScale=0, datetimePrecision=0, characterSetName='null', collationName='null', columnType='bigint(20) unsigned', columnKey='', extra='', privileges='select,insert,update,references', columnComment='', generationExpression=''}*/
private Long sumRowsExamined;

/**Column{tableCatalog='def', tableSchema='performance_schema', tableName='events_statements_summary_by_digest', columnName='SUM_CREATED_TMP_DISK_TABLES', ordinalPosition=15, columnDefault='null', isNullable='NO', dataType='bigint', characterMaximumLength=0, characterOctetLength=0, numericPrecision=20, numericScale=0, datetimePrecision=0, characterSetName='null', collationName='null', columnType='bigint(20) unsigned', columnKey='', extra='', privileges='select,insert,update,references', columnComment='', generationExpression=''}*/
private Long sumCreatedTmpDiskTables;

/**Column{tableCatalog='def', tableSchema='performance_schema', tableName='events_statements_summary_by_digest', columnName='SUM_CREATED_TMP_TABLES', ordinalPosition=16, columnDefault='null', isNullable='NO', dataType='bigint', characterMaximumLength=0, characterOctetLength=0, numericPrecision=20, numericScale=0, datetimePrecision=0, characterSetName='null', collationName='null', columnType='bigint(20) unsigned', columnKey='', extra='', privileges='select,insert,update,references', columnComment='', generationExpression=''}*/
private Long sumCreatedTmpTables;

/**Column{tableCatalog='def', tableSchema='performance_schema', tableName='events_statements_summary_by_digest', columnName='SUM_SELECT_FULL_JOIN', ordinalPosition=17, columnDefault='null', isNullable='NO', dataType='bigint', characterMaximumLength=0, characterOctetLength=0, numericPrecision=20, numericScale=0, datetimePrecision=0, characterSetName='null', collationName='null', columnType='bigint(20) unsigned', columnKey='', extra='', privileges='select,insert,update,references', columnComment='', generationExpression=''}*/
private Long sumSelectFullJoin;

/**Column{tableCatalog='def', tableSchema='performance_schema', tableName='events_statements_summary_by_digest', columnName='SUM_SELECT_FULL_RANGE_JOIN', ordinalPosition=18, columnDefault='null', isNullable='NO', dataType='bigint', characterMaximumLength=0, characterOctetLength=0, numericPrecision=20, numericScale=0, datetimePrecision=0, characterSetName='null', collationName='null', columnType='bigint(20) unsigned', columnKey='', extra='', privileges='select,insert,update,references', columnComment='', generationExpression=''}*/
private Long sumSelectFullRangeJoin;

/**Column{tableCatalog='def', tableSchema='performance_schema', tableName='events_statements_summary_by_digest', columnName='SUM_SELECT_RANGE', ordinalPosition=19, columnDefault='null', isNullable='NO', dataType='bigint', characterMaximumLength=0, characterOctetLength=0, numericPrecision=20, numericScale=0, datetimePrecision=0, characterSetName='null', collationName='null', columnType='bigint(20) unsigned', columnKey='', extra='', privileges='select,insert,update,references', columnComment='', generationExpression=''}*/
private Long sumSelectRange;

/**Column{tableCatalog='def', tableSchema='performance_schema', tableName='events_statements_summary_by_digest', columnName='SUM_SELECT_RANGE_CHECK', ordinalPosition=20, columnDefault='null', isNullable='NO', dataType='bigint', characterMaximumLength=0, characterOctetLength=0, numericPrecision=20, numericScale=0, datetimePrecision=0, characterSetName='null', collationName='null', columnType='bigint(20) unsigned', columnKey='', extra='', privileges='select,insert,update,references', columnComment='', generationExpression=''}*/
private Long sumSelectRangeCheck;

/**Column{tableCatalog='def', tableSchema='performance_schema', tableName='events_statements_summary_by_digest', columnName='SUM_SELECT_SCAN', ordinalPosition=21, columnDefault='null', isNullable='NO', dataType='bigint', characterMaximumLength=0, characterOctetLength=0, numericPrecision=20, numericScale=0, datetimePrecision=0, characterSetName='null', collationName='null', columnType='bigint(20) unsigned', columnKey='', extra='', privileges='select,insert,update,references', columnComment='', generationExpression=''}*/
private Long sumSelectScan;

/**Column{tableCatalog='def', tableSchema='performance_schema', tableName='events_statements_summary_by_digest', columnName='SUM_SORT_MERGE_PASSES', ordinalPosition=22, columnDefault='null', isNullable='NO', dataType='bigint', characterMaximumLength=0, characterOctetLength=0, numericPrecision=20, numericScale=0, datetimePrecision=0, characterSetName='null', collationName='null', columnType='bigint(20) unsigned', columnKey='', extra='', privileges='select,insert,update,references', columnComment='', generationExpression=''}*/
private Long sumSortMergePasses;

/**Column{tableCatalog='def', tableSchema='performance_schema', tableName='events_statements_summary_by_digest', columnName='SUM_SORT_RANGE', ordinalPosition=23, columnDefault='null', isNullable='NO', dataType='bigint', characterMaximumLength=0, characterOctetLength=0, numericPrecision=20, numericScale=0, datetimePrecision=0, characterSetName='null', collationName='null', columnType='bigint(20) unsigned', columnKey='', extra='', privileges='select,insert,update,references', columnComment='', generationExpression=''}*/
private Long sumSortRange;

/**Column{tableCatalog='def', tableSchema='performance_schema', tableName='events_statements_summary_by_digest', columnName='SUM_SORT_ROWS', ordinalPosition=24, columnDefault='null', isNullable='NO', dataType='bigint', characterMaximumLength=0, characterOctetLength=0, numericPrecision=20, numericScale=0, datetimePrecision=0, characterSetName='null', collationName='null', columnType='bigint(20) unsigned', columnKey='', extra='', privileges='select,insert,update,references', columnComment='', generationExpression=''}*/
private Long sumSortRows;

/**Column{tableCatalog='def', tableSchema='performance_schema', tableName='events_statements_summary_by_digest', columnName='SUM_SORT_SCAN', ordinalPosition=25, columnDefault='null', isNullable='NO', dataType='bigint', characterMaximumLength=0, characterOctetLength=0, numericPrecision=20, numericScale=0, datetimePrecision=0, characterSetName='null', collationName='null', columnType='bigint(20) unsigned', columnKey='', extra='', privileges='select,insert,update,references', columnComment='', generationExpression=''}*/
private Long sumSortScan;

/**Column{tableCatalog='def', tableSchema='performance_schema', tableName='events_statements_summary_by_digest', columnName='SUM_NO_INDEX_USED', ordinalPosition=26, columnDefault='null', isNullable='NO', dataType='bigint', characterMaximumLength=0, characterOctetLength=0, numericPrecision=20, numericScale=0, datetimePrecision=0, characterSetName='null', collationName='null', columnType='bigint(20) unsigned', columnKey='', extra='', privileges='select,insert,update,references', columnComment='', generationExpression=''}*/
private Long sumNoIndexUsed;

/**Column{tableCatalog='def', tableSchema='performance_schema', tableName='events_statements_summary_by_digest', columnName='SUM_NO_GOOD_INDEX_USED', ordinalPosition=27, columnDefault='null', isNullable='NO', dataType='bigint', characterMaximumLength=0, characterOctetLength=0, numericPrecision=20, numericScale=0, datetimePrecision=0, characterSetName='null', collationName='null', columnType='bigint(20) unsigned', columnKey='', extra='', privileges='select,insert,update,references', columnComment='', generationExpression=''}*/
private Long sumNoGoodIndexUsed;

/**Column{tableCatalog='def', tableSchema='performance_schema', tableName='events_statements_summary_by_digest', columnName='FIRST_SEEN', ordinalPosition=28, columnDefault='0000-00-00 00:00:00', isNullable='NO', dataType='timestamp', characterMaximumLength=0, characterOctetLength=0, numericPrecision=0, numericScale=0, datetimePrecision=0, characterSetName='null', collationName='null', columnType='timestamp', columnKey='', extra='', privileges='select,insert,update,references', columnComment='', generationExpression=''}*/
private Date firstSeen;

/**Column{tableCatalog='def', tableSchema='performance_schema', tableName='events_statements_summary_by_digest', columnName='LAST_SEEN', ordinalPosition=29, columnDefault='0000-00-00 00:00:00', isNullable='NO', dataType='timestamp', characterMaximumLength=0, characterOctetLength=0, numericPrecision=0, numericScale=0, datetimePrecision=0, characterSetName='null', collationName='null', columnType='timestamp', columnKey='', extra='', privileges='select,insert,update,references', columnComment='', generationExpression=''}*/
private Date lastSeen;

public String getSchemaName(){
return schemaName;
}

public String getDigest(){
return digest;
}

public String getDigestText(){
return digestText;
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

public Date getFirstSeen(){
return firstSeen;
}

public Date getLastSeen(){
return lastSeen;
}

}