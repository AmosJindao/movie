package db.bean.performance_schema;


/**
*/
public class EventsStatementsSummaryByUserByEventName{
/**Column{tableCatalog='def', tableSchema='performance_schema', tableName='events_statements_summary_by_user_by_event_name', columnName='USER', ordinalPosition=1, columnDefault='null', isNullable='YES', dataType='char', characterMaximumLength=32, characterOctetLength=96, numericPrecision=0, numericScale=0, datetimePrecision=0, characterSetName='utf8', collationName='utf8_bin', columnType='char(32)', columnKey='', extra='', privileges='select,insert,update,references', columnComment='', generationExpression=''}*/
private String user;

/**Column{tableCatalog='def', tableSchema='performance_schema', tableName='events_statements_summary_by_user_by_event_name', columnName='EVENT_NAME', ordinalPosition=2, columnDefault='null', isNullable='NO', dataType='varchar', characterMaximumLength=128, characterOctetLength=384, numericPrecision=0, numericScale=0, datetimePrecision=0, characterSetName='utf8', collationName='utf8_general_ci', columnType='varchar(128)', columnKey='', extra='', privileges='select,insert,update,references', columnComment='', generationExpression=''}*/
private String eventName;

/**Column{tableCatalog='def', tableSchema='performance_schema', tableName='events_statements_summary_by_user_by_event_name', columnName='COUNT_STAR', ordinalPosition=3, columnDefault='null', isNullable='NO', dataType='bigint', characterMaximumLength=0, characterOctetLength=0, numericPrecision=20, numericScale=0, datetimePrecision=0, characterSetName='null', collationName='null', columnType='bigint(20) unsigned', columnKey='', extra='', privileges='select,insert,update,references', columnComment='', generationExpression=''}*/
private Long countStar;

/**Column{tableCatalog='def', tableSchema='performance_schema', tableName='events_statements_summary_by_user_by_event_name', columnName='SUM_TIMER_WAIT', ordinalPosition=4, columnDefault='null', isNullable='NO', dataType='bigint', characterMaximumLength=0, characterOctetLength=0, numericPrecision=20, numericScale=0, datetimePrecision=0, characterSetName='null', collationName='null', columnType='bigint(20) unsigned', columnKey='', extra='', privileges='select,insert,update,references', columnComment='', generationExpression=''}*/
private Long sumTimerWait;

/**Column{tableCatalog='def', tableSchema='performance_schema', tableName='events_statements_summary_by_user_by_event_name', columnName='MIN_TIMER_WAIT', ordinalPosition=5, columnDefault='null', isNullable='NO', dataType='bigint', characterMaximumLength=0, characterOctetLength=0, numericPrecision=20, numericScale=0, datetimePrecision=0, characterSetName='null', collationName='null', columnType='bigint(20) unsigned', columnKey='', extra='', privileges='select,insert,update,references', columnComment='', generationExpression=''}*/
private Long minTimerWait;

/**Column{tableCatalog='def', tableSchema='performance_schema', tableName='events_statements_summary_by_user_by_event_name', columnName='AVG_TIMER_WAIT', ordinalPosition=6, columnDefault='null', isNullable='NO', dataType='bigint', characterMaximumLength=0, characterOctetLength=0, numericPrecision=20, numericScale=0, datetimePrecision=0, characterSetName='null', collationName='null', columnType='bigint(20) unsigned', columnKey='', extra='', privileges='select,insert,update,references', columnComment='', generationExpression=''}*/
private Long avgTimerWait;

/**Column{tableCatalog='def', tableSchema='performance_schema', tableName='events_statements_summary_by_user_by_event_name', columnName='MAX_TIMER_WAIT', ordinalPosition=7, columnDefault='null', isNullable='NO', dataType='bigint', characterMaximumLength=0, characterOctetLength=0, numericPrecision=20, numericScale=0, datetimePrecision=0, characterSetName='null', collationName='null', columnType='bigint(20) unsigned', columnKey='', extra='', privileges='select,insert,update,references', columnComment='', generationExpression=''}*/
private Long maxTimerWait;

/**Column{tableCatalog='def', tableSchema='performance_schema', tableName='events_statements_summary_by_user_by_event_name', columnName='SUM_LOCK_TIME', ordinalPosition=8, columnDefault='null', isNullable='NO', dataType='bigint', characterMaximumLength=0, characterOctetLength=0, numericPrecision=20, numericScale=0, datetimePrecision=0, characterSetName='null', collationName='null', columnType='bigint(20) unsigned', columnKey='', extra='', privileges='select,insert,update,references', columnComment='', generationExpression=''}*/
private Long sumLockTime;

/**Column{tableCatalog='def', tableSchema='performance_schema', tableName='events_statements_summary_by_user_by_event_name', columnName='SUM_ERRORS', ordinalPosition=9, columnDefault='null', isNullable='NO', dataType='bigint', characterMaximumLength=0, characterOctetLength=0, numericPrecision=20, numericScale=0, datetimePrecision=0, characterSetName='null', collationName='null', columnType='bigint(20) unsigned', columnKey='', extra='', privileges='select,insert,update,references', columnComment='', generationExpression=''}*/
private Long sumErrors;

/**Column{tableCatalog='def', tableSchema='performance_schema', tableName='events_statements_summary_by_user_by_event_name', columnName='SUM_WARNINGS', ordinalPosition=10, columnDefault='null', isNullable='NO', dataType='bigint', characterMaximumLength=0, characterOctetLength=0, numericPrecision=20, numericScale=0, datetimePrecision=0, characterSetName='null', collationName='null', columnType='bigint(20) unsigned', columnKey='', extra='', privileges='select,insert,update,references', columnComment='', generationExpression=''}*/
private Long sumWarnings;

/**Column{tableCatalog='def', tableSchema='performance_schema', tableName='events_statements_summary_by_user_by_event_name', columnName='SUM_ROWS_AFFECTED', ordinalPosition=11, columnDefault='null', isNullable='NO', dataType='bigint', characterMaximumLength=0, characterOctetLength=0, numericPrecision=20, numericScale=0, datetimePrecision=0, characterSetName='null', collationName='null', columnType='bigint(20) unsigned', columnKey='', extra='', privileges='select,insert,update,references', columnComment='', generationExpression=''}*/
private Long sumRowsAffected;

/**Column{tableCatalog='def', tableSchema='performance_schema', tableName='events_statements_summary_by_user_by_event_name', columnName='SUM_ROWS_SENT', ordinalPosition=12, columnDefault='null', isNullable='NO', dataType='bigint', characterMaximumLength=0, characterOctetLength=0, numericPrecision=20, numericScale=0, datetimePrecision=0, characterSetName='null', collationName='null', columnType='bigint(20) unsigned', columnKey='', extra='', privileges='select,insert,update,references', columnComment='', generationExpression=''}*/
private Long sumRowsSent;

/**Column{tableCatalog='def', tableSchema='performance_schema', tableName='events_statements_summary_by_user_by_event_name', columnName='SUM_ROWS_EXAMINED', ordinalPosition=13, columnDefault='null', isNullable='NO', dataType='bigint', characterMaximumLength=0, characterOctetLength=0, numericPrecision=20, numericScale=0, datetimePrecision=0, characterSetName='null', collationName='null', columnType='bigint(20) unsigned', columnKey='', extra='', privileges='select,insert,update,references', columnComment='', generationExpression=''}*/
private Long sumRowsExamined;

/**Column{tableCatalog='def', tableSchema='performance_schema', tableName='events_statements_summary_by_user_by_event_name', columnName='SUM_CREATED_TMP_DISK_TABLES', ordinalPosition=14, columnDefault='null', isNullable='NO', dataType='bigint', characterMaximumLength=0, characterOctetLength=0, numericPrecision=20, numericScale=0, datetimePrecision=0, characterSetName='null', collationName='null', columnType='bigint(20) unsigned', columnKey='', extra='', privileges='select,insert,update,references', columnComment='', generationExpression=''}*/
private Long sumCreatedTmpDiskTables;

/**Column{tableCatalog='def', tableSchema='performance_schema', tableName='events_statements_summary_by_user_by_event_name', columnName='SUM_CREATED_TMP_TABLES', ordinalPosition=15, columnDefault='null', isNullable='NO', dataType='bigint', characterMaximumLength=0, characterOctetLength=0, numericPrecision=20, numericScale=0, datetimePrecision=0, characterSetName='null', collationName='null', columnType='bigint(20) unsigned', columnKey='', extra='', privileges='select,insert,update,references', columnComment='', generationExpression=''}*/
private Long sumCreatedTmpTables;

/**Column{tableCatalog='def', tableSchema='performance_schema', tableName='events_statements_summary_by_user_by_event_name', columnName='SUM_SELECT_FULL_JOIN', ordinalPosition=16, columnDefault='null', isNullable='NO', dataType='bigint', characterMaximumLength=0, characterOctetLength=0, numericPrecision=20, numericScale=0, datetimePrecision=0, characterSetName='null', collationName='null', columnType='bigint(20) unsigned', columnKey='', extra='', privileges='select,insert,update,references', columnComment='', generationExpression=''}*/
private Long sumSelectFullJoin;

/**Column{tableCatalog='def', tableSchema='performance_schema', tableName='events_statements_summary_by_user_by_event_name', columnName='SUM_SELECT_FULL_RANGE_JOIN', ordinalPosition=17, columnDefault='null', isNullable='NO', dataType='bigint', characterMaximumLength=0, characterOctetLength=0, numericPrecision=20, numericScale=0, datetimePrecision=0, characterSetName='null', collationName='null', columnType='bigint(20) unsigned', columnKey='', extra='', privileges='select,insert,update,references', columnComment='', generationExpression=''}*/
private Long sumSelectFullRangeJoin;

/**Column{tableCatalog='def', tableSchema='performance_schema', tableName='events_statements_summary_by_user_by_event_name', columnName='SUM_SELECT_RANGE', ordinalPosition=18, columnDefault='null', isNullable='NO', dataType='bigint', characterMaximumLength=0, characterOctetLength=0, numericPrecision=20, numericScale=0, datetimePrecision=0, characterSetName='null', collationName='null', columnType='bigint(20) unsigned', columnKey='', extra='', privileges='select,insert,update,references', columnComment='', generationExpression=''}*/
private Long sumSelectRange;

/**Column{tableCatalog='def', tableSchema='performance_schema', tableName='events_statements_summary_by_user_by_event_name', columnName='SUM_SELECT_RANGE_CHECK', ordinalPosition=19, columnDefault='null', isNullable='NO', dataType='bigint', characterMaximumLength=0, characterOctetLength=0, numericPrecision=20, numericScale=0, datetimePrecision=0, characterSetName='null', collationName='null', columnType='bigint(20) unsigned', columnKey='', extra='', privileges='select,insert,update,references', columnComment='', generationExpression=''}*/
private Long sumSelectRangeCheck;

/**Column{tableCatalog='def', tableSchema='performance_schema', tableName='events_statements_summary_by_user_by_event_name', columnName='SUM_SELECT_SCAN', ordinalPosition=20, columnDefault='null', isNullable='NO', dataType='bigint', characterMaximumLength=0, characterOctetLength=0, numericPrecision=20, numericScale=0, datetimePrecision=0, characterSetName='null', collationName='null', columnType='bigint(20) unsigned', columnKey='', extra='', privileges='select,insert,update,references', columnComment='', generationExpression=''}*/
private Long sumSelectScan;

/**Column{tableCatalog='def', tableSchema='performance_schema', tableName='events_statements_summary_by_user_by_event_name', columnName='SUM_SORT_MERGE_PASSES', ordinalPosition=21, columnDefault='null', isNullable='NO', dataType='bigint', characterMaximumLength=0, characterOctetLength=0, numericPrecision=20, numericScale=0, datetimePrecision=0, characterSetName='null', collationName='null', columnType='bigint(20) unsigned', columnKey='', extra='', privileges='select,insert,update,references', columnComment='', generationExpression=''}*/
private Long sumSortMergePasses;

/**Column{tableCatalog='def', tableSchema='performance_schema', tableName='events_statements_summary_by_user_by_event_name', columnName='SUM_SORT_RANGE', ordinalPosition=22, columnDefault='null', isNullable='NO', dataType='bigint', characterMaximumLength=0, characterOctetLength=0, numericPrecision=20, numericScale=0, datetimePrecision=0, characterSetName='null', collationName='null', columnType='bigint(20) unsigned', columnKey='', extra='', privileges='select,insert,update,references', columnComment='', generationExpression=''}*/
private Long sumSortRange;

/**Column{tableCatalog='def', tableSchema='performance_schema', tableName='events_statements_summary_by_user_by_event_name', columnName='SUM_SORT_ROWS', ordinalPosition=23, columnDefault='null', isNullable='NO', dataType='bigint', characterMaximumLength=0, characterOctetLength=0, numericPrecision=20, numericScale=0, datetimePrecision=0, characterSetName='null', collationName='null', columnType='bigint(20) unsigned', columnKey='', extra='', privileges='select,insert,update,references', columnComment='', generationExpression=''}*/
private Long sumSortRows;

/**Column{tableCatalog='def', tableSchema='performance_schema', tableName='events_statements_summary_by_user_by_event_name', columnName='SUM_SORT_SCAN', ordinalPosition=24, columnDefault='null', isNullable='NO', dataType='bigint', characterMaximumLength=0, characterOctetLength=0, numericPrecision=20, numericScale=0, datetimePrecision=0, characterSetName='null', collationName='null', columnType='bigint(20) unsigned', columnKey='', extra='', privileges='select,insert,update,references', columnComment='', generationExpression=''}*/
private Long sumSortScan;

/**Column{tableCatalog='def', tableSchema='performance_schema', tableName='events_statements_summary_by_user_by_event_name', columnName='SUM_NO_INDEX_USED', ordinalPosition=25, columnDefault='null', isNullable='NO', dataType='bigint', characterMaximumLength=0, characterOctetLength=0, numericPrecision=20, numericScale=0, datetimePrecision=0, characterSetName='null', collationName='null', columnType='bigint(20) unsigned', columnKey='', extra='', privileges='select,insert,update,references', columnComment='', generationExpression=''}*/
private Long sumNoIndexUsed;

/**Column{tableCatalog='def', tableSchema='performance_schema', tableName='events_statements_summary_by_user_by_event_name', columnName='SUM_NO_GOOD_INDEX_USED', ordinalPosition=26, columnDefault='null', isNullable='NO', dataType='bigint', characterMaximumLength=0, characterOctetLength=0, numericPrecision=20, numericScale=0, datetimePrecision=0, characterSetName='null', collationName='null', columnType='bigint(20) unsigned', columnKey='', extra='', privileges='select,insert,update,references', columnComment='', generationExpression=''}*/
private Long sumNoGoodIndexUsed;

public String getUser(){
return user;
}

public String getEventName(){
return eventName;
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

}