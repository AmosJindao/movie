package db.bean.performance_schema;

import java.util.Date;

/* SELECT THREAD_ID AS threadId, EVENT_ID AS eventId, END_EVENT_ID AS endEventId, EVENT_NAME AS eventName, SOURCE AS source, TIMER_START AS timerStart, TIMER_END AS timerEnd, TIMER_WAIT AS timerWait, LOCK_TIME AS lockTime, SQL_TEXT AS sqlText, DIGEST AS digest, DIGEST_TEXT AS digestText, CURRENT_SCHEMA AS currentSchema, OBJECT_TYPE AS objectType, OBJECT_SCHEMA AS objectSchema, OBJECT_NAME AS objectName, OBJECT_INSTANCE_BEGIN AS objectInstanceBegin, MYSQL_ERRNO AS mysqlErrno, RETURNED_SQLSTATE AS returnedSqlstate, MESSAGE_TEXT AS messageText, ERRORS AS errors, WARNINGS AS warnings, ROWS_AFFECTED AS rowsAffected, ROWS_SENT AS rowsSent, ROWS_EXAMINED AS rowsExamined, CREATED_TMP_DISK_TABLES AS createdTmpDiskTables, CREATED_TMP_TABLES AS createdTmpTables, SELECT_FULL_JOIN AS selectFullJoin, SELECT_FULL_RANGE_JOIN AS selectFullRangeJoin, SELECT_RANGE AS selectRange, SELECT_RANGE_CHECK AS selectRangeCheck, SELECT_SCAN AS selectScan, SORT_MERGE_PASSES AS sortMergePasses, SORT_RANGE AS sortRange, SORT_ROWS AS sortRows, SORT_SCAN AS sortScan, NO_INDEX_USED AS noIndexUsed, NO_GOOD_INDEX_USED AS noGoodIndexUsed, NESTING_EVENT_ID AS nestingEventId, NESTING_EVENT_TYPE AS nestingEventType, NESTING_EVENT_LEVEL AS nestingEventLevel FROM performance_schema.events_statements_current */
/**
*/
public class EventsStatementsCurrent{
/**Column{tableCatalog='def', tableSchema='performance_schema', tableName='events_statements_current', columnName='THREAD_ID', ordinalPosition=1, columnDefault='null', isNullable='NO', dataType='bigint', characterMaximumLength=0, characterOctetLength=0, numericPrecision=20, numericScale=0, datetimePrecision=0, characterSetName='null', collationName='null', columnType='bigint(20) unsigned', columnKey='', extra='', privileges='select,insert,update,references', columnComment='', generationExpression=''}*/
private Long threadId;

/**Column{tableCatalog='def', tableSchema='performance_schema', tableName='events_statements_current', columnName='EVENT_ID', ordinalPosition=2, columnDefault='null', isNullable='NO', dataType='bigint', characterMaximumLength=0, characterOctetLength=0, numericPrecision=20, numericScale=0, datetimePrecision=0, characterSetName='null', collationName='null', columnType='bigint(20) unsigned', columnKey='', extra='', privileges='select,insert,update,references', columnComment='', generationExpression=''}*/
private Long eventId;

/**Column{tableCatalog='def', tableSchema='performance_schema', tableName='events_statements_current', columnName='END_EVENT_ID', ordinalPosition=3, columnDefault='null', isNullable='YES', dataType='bigint', characterMaximumLength=0, characterOctetLength=0, numericPrecision=20, numericScale=0, datetimePrecision=0, characterSetName='null', collationName='null', columnType='bigint(20) unsigned', columnKey='', extra='', privileges='select,insert,update,references', columnComment='', generationExpression=''}*/
private Long endEventId;

/**Column{tableCatalog='def', tableSchema='performance_schema', tableName='events_statements_current', columnName='EVENT_NAME', ordinalPosition=4, columnDefault='null', isNullable='NO', dataType='varchar', characterMaximumLength=128, characterOctetLength=384, numericPrecision=0, numericScale=0, datetimePrecision=0, characterSetName='utf8', collationName='utf8_general_ci', columnType='varchar(128)', columnKey='', extra='', privileges='select,insert,update,references', columnComment='', generationExpression=''}*/
private String eventName;

/**Column{tableCatalog='def', tableSchema='performance_schema', tableName='events_statements_current', columnName='SOURCE', ordinalPosition=5, columnDefault='null', isNullable='YES', dataType='varchar', characterMaximumLength=64, characterOctetLength=192, numericPrecision=0, numericScale=0, datetimePrecision=0, characterSetName='utf8', collationName='utf8_general_ci', columnType='varchar(64)', columnKey='', extra='', privileges='select,insert,update,references', columnComment='', generationExpression=''}*/
private String source;

/**Column{tableCatalog='def', tableSchema='performance_schema', tableName='events_statements_current', columnName='TIMER_START', ordinalPosition=6, columnDefault='null', isNullable='YES', dataType='bigint', characterMaximumLength=0, characterOctetLength=0, numericPrecision=20, numericScale=0, datetimePrecision=0, characterSetName='null', collationName='null', columnType='bigint(20) unsigned', columnKey='', extra='', privileges='select,insert,update,references', columnComment='', generationExpression=''}*/
private Long timerStart;

/**Column{tableCatalog='def', tableSchema='performance_schema', tableName='events_statements_current', columnName='TIMER_END', ordinalPosition=7, columnDefault='null', isNullable='YES', dataType='bigint', characterMaximumLength=0, characterOctetLength=0, numericPrecision=20, numericScale=0, datetimePrecision=0, characterSetName='null', collationName='null', columnType='bigint(20) unsigned', columnKey='', extra='', privileges='select,insert,update,references', columnComment='', generationExpression=''}*/
private Long timerEnd;

/**Column{tableCatalog='def', tableSchema='performance_schema', tableName='events_statements_current', columnName='TIMER_WAIT', ordinalPosition=8, columnDefault='null', isNullable='YES', dataType='bigint', characterMaximumLength=0, characterOctetLength=0, numericPrecision=20, numericScale=0, datetimePrecision=0, characterSetName='null', collationName='null', columnType='bigint(20) unsigned', columnKey='', extra='', privileges='select,insert,update,references', columnComment='', generationExpression=''}*/
private Long timerWait;

/**Column{tableCatalog='def', tableSchema='performance_schema', tableName='events_statements_current', columnName='LOCK_TIME', ordinalPosition=9, columnDefault='null', isNullable='NO', dataType='bigint', characterMaximumLength=0, characterOctetLength=0, numericPrecision=20, numericScale=0, datetimePrecision=0, characterSetName='null', collationName='null', columnType='bigint(20) unsigned', columnKey='', extra='', privileges='select,insert,update,references', columnComment='', generationExpression=''}*/
private Long lockTime;

/**Column{tableCatalog='def', tableSchema='performance_schema', tableName='events_statements_current', columnName='SQL_TEXT', ordinalPosition=10, columnDefault='null', isNullable='YES', dataType='longtext', characterMaximumLength=4294967295, characterOctetLength=4294967295, numericPrecision=0, numericScale=0, datetimePrecision=0, characterSetName='utf8', collationName='utf8_general_ci', columnType='longtext', columnKey='', extra='', privileges='select,insert,update,references', columnComment='', generationExpression=''}*/
private String sqlText;

/**Column{tableCatalog='def', tableSchema='performance_schema', tableName='events_statements_current', columnName='DIGEST', ordinalPosition=11, columnDefault='null', isNullable='YES', dataType='varchar', characterMaximumLength=32, characterOctetLength=96, numericPrecision=0, numericScale=0, datetimePrecision=0, characterSetName='utf8', collationName='utf8_general_ci', columnType='varchar(32)', columnKey='', extra='', privileges='select,insert,update,references', columnComment='', generationExpression=''}*/
private String digest;

/**Column{tableCatalog='def', tableSchema='performance_schema', tableName='events_statements_current', columnName='DIGEST_TEXT', ordinalPosition=12, columnDefault='null', isNullable='YES', dataType='longtext', characterMaximumLength=4294967295, characterOctetLength=4294967295, numericPrecision=0, numericScale=0, datetimePrecision=0, characterSetName='utf8', collationName='utf8_general_ci', columnType='longtext', columnKey='', extra='', privileges='select,insert,update,references', columnComment='', generationExpression=''}*/
private String digestText;

/**Column{tableCatalog='def', tableSchema='performance_schema', tableName='events_statements_current', columnName='CURRENT_SCHEMA', ordinalPosition=13, columnDefault='null', isNullable='YES', dataType='varchar', characterMaximumLength=64, characterOctetLength=192, numericPrecision=0, numericScale=0, datetimePrecision=0, characterSetName='utf8', collationName='utf8_general_ci', columnType='varchar(64)', columnKey='', extra='', privileges='select,insert,update,references', columnComment='', generationExpression=''}*/
private String currentSchema;

/**Column{tableCatalog='def', tableSchema='performance_schema', tableName='events_statements_current', columnName='OBJECT_TYPE', ordinalPosition=14, columnDefault='null', isNullable='YES', dataType='varchar', characterMaximumLength=64, characterOctetLength=192, numericPrecision=0, numericScale=0, datetimePrecision=0, characterSetName='utf8', collationName='utf8_general_ci', columnType='varchar(64)', columnKey='', extra='', privileges='select,insert,update,references', columnComment='', generationExpression=''}*/
private String objectType;

/**Column{tableCatalog='def', tableSchema='performance_schema', tableName='events_statements_current', columnName='OBJECT_SCHEMA', ordinalPosition=15, columnDefault='null', isNullable='YES', dataType='varchar', characterMaximumLength=64, characterOctetLength=192, numericPrecision=0, numericScale=0, datetimePrecision=0, characterSetName='utf8', collationName='utf8_general_ci', columnType='varchar(64)', columnKey='', extra='', privileges='select,insert,update,references', columnComment='', generationExpression=''}*/
private String objectSchema;

/**Column{tableCatalog='def', tableSchema='performance_schema', tableName='events_statements_current', columnName='OBJECT_NAME', ordinalPosition=16, columnDefault='null', isNullable='YES', dataType='varchar', characterMaximumLength=64, characterOctetLength=192, numericPrecision=0, numericScale=0, datetimePrecision=0, characterSetName='utf8', collationName='utf8_general_ci', columnType='varchar(64)', columnKey='', extra='', privileges='select,insert,update,references', columnComment='', generationExpression=''}*/
private String objectName;

/**Column{tableCatalog='def', tableSchema='performance_schema', tableName='events_statements_current', columnName='OBJECT_INSTANCE_BEGIN', ordinalPosition=17, columnDefault='null', isNullable='YES', dataType='bigint', characterMaximumLength=0, characterOctetLength=0, numericPrecision=20, numericScale=0, datetimePrecision=0, characterSetName='null', collationName='null', columnType='bigint(20) unsigned', columnKey='', extra='', privileges='select,insert,update,references', columnComment='', generationExpression=''}*/
private Long objectInstanceBegin;

/**Column{tableCatalog='def', tableSchema='performance_schema', tableName='events_statements_current', columnName='MYSQL_ERRNO', ordinalPosition=18, columnDefault='null', isNullable='YES', dataType='int', characterMaximumLength=0, characterOctetLength=0, numericPrecision=10, numericScale=0, datetimePrecision=0, characterSetName='null', collationName='null', columnType='int(11)', columnKey='', extra='', privileges='select,insert,update,references', columnComment='', generationExpression=''}*/
private Integer mysqlErrno;

/**Column{tableCatalog='def', tableSchema='performance_schema', tableName='events_statements_current', columnName='RETURNED_SQLSTATE', ordinalPosition=19, columnDefault='null', isNullable='YES', dataType='varchar', characterMaximumLength=5, characterOctetLength=15, numericPrecision=0, numericScale=0, datetimePrecision=0, characterSetName='utf8', collationName='utf8_general_ci', columnType='varchar(5)', columnKey='', extra='', privileges='select,insert,update,references', columnComment='', generationExpression=''}*/
private String returnedSqlstate;

/**Column{tableCatalog='def', tableSchema='performance_schema', tableName='events_statements_current', columnName='MESSAGE_TEXT', ordinalPosition=20, columnDefault='null', isNullable='YES', dataType='varchar', characterMaximumLength=128, characterOctetLength=384, numericPrecision=0, numericScale=0, datetimePrecision=0, characterSetName='utf8', collationName='utf8_general_ci', columnType='varchar(128)', columnKey='', extra='', privileges='select,insert,update,references', columnComment='', generationExpression=''}*/
private String messageText;

/**Column{tableCatalog='def', tableSchema='performance_schema', tableName='events_statements_current', columnName='ERRORS', ordinalPosition=21, columnDefault='null', isNullable='NO', dataType='bigint', characterMaximumLength=0, characterOctetLength=0, numericPrecision=20, numericScale=0, datetimePrecision=0, characterSetName='null', collationName='null', columnType='bigint(20) unsigned', columnKey='', extra='', privileges='select,insert,update,references', columnComment='', generationExpression=''}*/
private Long errors;

/**Column{tableCatalog='def', tableSchema='performance_schema', tableName='events_statements_current', columnName='WARNINGS', ordinalPosition=22, columnDefault='null', isNullable='NO', dataType='bigint', characterMaximumLength=0, characterOctetLength=0, numericPrecision=20, numericScale=0, datetimePrecision=0, characterSetName='null', collationName='null', columnType='bigint(20) unsigned', columnKey='', extra='', privileges='select,insert,update,references', columnComment='', generationExpression=''}*/
private Long warnings;

/**Column{tableCatalog='def', tableSchema='performance_schema', tableName='events_statements_current', columnName='ROWS_AFFECTED', ordinalPosition=23, columnDefault='null', isNullable='NO', dataType='bigint', characterMaximumLength=0, characterOctetLength=0, numericPrecision=20, numericScale=0, datetimePrecision=0, characterSetName='null', collationName='null', columnType='bigint(20) unsigned', columnKey='', extra='', privileges='select,insert,update,references', columnComment='', generationExpression=''}*/
private Long rowsAffected;

/**Column{tableCatalog='def', tableSchema='performance_schema', tableName='events_statements_current', columnName='ROWS_SENT', ordinalPosition=24, columnDefault='null', isNullable='NO', dataType='bigint', characterMaximumLength=0, characterOctetLength=0, numericPrecision=20, numericScale=0, datetimePrecision=0, characterSetName='null', collationName='null', columnType='bigint(20) unsigned', columnKey='', extra='', privileges='select,insert,update,references', columnComment='', generationExpression=''}*/
private Long rowsSent;

/**Column{tableCatalog='def', tableSchema='performance_schema', tableName='events_statements_current', columnName='ROWS_EXAMINED', ordinalPosition=25, columnDefault='null', isNullable='NO', dataType='bigint', characterMaximumLength=0, characterOctetLength=0, numericPrecision=20, numericScale=0, datetimePrecision=0, characterSetName='null', collationName='null', columnType='bigint(20) unsigned', columnKey='', extra='', privileges='select,insert,update,references', columnComment='', generationExpression=''}*/
private Long rowsExamined;

/**Column{tableCatalog='def', tableSchema='performance_schema', tableName='events_statements_current', columnName='CREATED_TMP_DISK_TABLES', ordinalPosition=26, columnDefault='null', isNullable='NO', dataType='bigint', characterMaximumLength=0, characterOctetLength=0, numericPrecision=20, numericScale=0, datetimePrecision=0, characterSetName='null', collationName='null', columnType='bigint(20) unsigned', columnKey='', extra='', privileges='select,insert,update,references', columnComment='', generationExpression=''}*/
private Long createdTmpDiskTables;

/**Column{tableCatalog='def', tableSchema='performance_schema', tableName='events_statements_current', columnName='CREATED_TMP_TABLES', ordinalPosition=27, columnDefault='null', isNullable='NO', dataType='bigint', characterMaximumLength=0, characterOctetLength=0, numericPrecision=20, numericScale=0, datetimePrecision=0, characterSetName='null', collationName='null', columnType='bigint(20) unsigned', columnKey='', extra='', privileges='select,insert,update,references', columnComment='', generationExpression=''}*/
private Long createdTmpTables;

/**Column{tableCatalog='def', tableSchema='performance_schema', tableName='events_statements_current', columnName='SELECT_FULL_JOIN', ordinalPosition=28, columnDefault='null', isNullable='NO', dataType='bigint', characterMaximumLength=0, characterOctetLength=0, numericPrecision=20, numericScale=0, datetimePrecision=0, characterSetName='null', collationName='null', columnType='bigint(20) unsigned', columnKey='', extra='', privileges='select,insert,update,references', columnComment='', generationExpression=''}*/
private Long selectFullJoin;

/**Column{tableCatalog='def', tableSchema='performance_schema', tableName='events_statements_current', columnName='SELECT_FULL_RANGE_JOIN', ordinalPosition=29, columnDefault='null', isNullable='NO', dataType='bigint', characterMaximumLength=0, characterOctetLength=0, numericPrecision=20, numericScale=0, datetimePrecision=0, characterSetName='null', collationName='null', columnType='bigint(20) unsigned', columnKey='', extra='', privileges='select,insert,update,references', columnComment='', generationExpression=''}*/
private Long selectFullRangeJoin;

/**Column{tableCatalog='def', tableSchema='performance_schema', tableName='events_statements_current', columnName='SELECT_RANGE', ordinalPosition=30, columnDefault='null', isNullable='NO', dataType='bigint', characterMaximumLength=0, characterOctetLength=0, numericPrecision=20, numericScale=0, datetimePrecision=0, characterSetName='null', collationName='null', columnType='bigint(20) unsigned', columnKey='', extra='', privileges='select,insert,update,references', columnComment='', generationExpression=''}*/
private Long selectRange;

/**Column{tableCatalog='def', tableSchema='performance_schema', tableName='events_statements_current', columnName='SELECT_RANGE_CHECK', ordinalPosition=31, columnDefault='null', isNullable='NO', dataType='bigint', characterMaximumLength=0, characterOctetLength=0, numericPrecision=20, numericScale=0, datetimePrecision=0, characterSetName='null', collationName='null', columnType='bigint(20) unsigned', columnKey='', extra='', privileges='select,insert,update,references', columnComment='', generationExpression=''}*/
private Long selectRangeCheck;

/**Column{tableCatalog='def', tableSchema='performance_schema', tableName='events_statements_current', columnName='SELECT_SCAN', ordinalPosition=32, columnDefault='null', isNullable='NO', dataType='bigint', characterMaximumLength=0, characterOctetLength=0, numericPrecision=20, numericScale=0, datetimePrecision=0, characterSetName='null', collationName='null', columnType='bigint(20) unsigned', columnKey='', extra='', privileges='select,insert,update,references', columnComment='', generationExpression=''}*/
private Long selectScan;

/**Column{tableCatalog='def', tableSchema='performance_schema', tableName='events_statements_current', columnName='SORT_MERGE_PASSES', ordinalPosition=33, columnDefault='null', isNullable='NO', dataType='bigint', characterMaximumLength=0, characterOctetLength=0, numericPrecision=20, numericScale=0, datetimePrecision=0, characterSetName='null', collationName='null', columnType='bigint(20) unsigned', columnKey='', extra='', privileges='select,insert,update,references', columnComment='', generationExpression=''}*/
private Long sortMergePasses;

/**Column{tableCatalog='def', tableSchema='performance_schema', tableName='events_statements_current', columnName='SORT_RANGE', ordinalPosition=34, columnDefault='null', isNullable='NO', dataType='bigint', characterMaximumLength=0, characterOctetLength=0, numericPrecision=20, numericScale=0, datetimePrecision=0, characterSetName='null', collationName='null', columnType='bigint(20) unsigned', columnKey='', extra='', privileges='select,insert,update,references', columnComment='', generationExpression=''}*/
private Long sortRange;

/**Column{tableCatalog='def', tableSchema='performance_schema', tableName='events_statements_current', columnName='SORT_ROWS', ordinalPosition=35, columnDefault='null', isNullable='NO', dataType='bigint', characterMaximumLength=0, characterOctetLength=0, numericPrecision=20, numericScale=0, datetimePrecision=0, characterSetName='null', collationName='null', columnType='bigint(20) unsigned', columnKey='', extra='', privileges='select,insert,update,references', columnComment='', generationExpression=''}*/
private Long sortRows;

/**Column{tableCatalog='def', tableSchema='performance_schema', tableName='events_statements_current', columnName='SORT_SCAN', ordinalPosition=36, columnDefault='null', isNullable='NO', dataType='bigint', characterMaximumLength=0, characterOctetLength=0, numericPrecision=20, numericScale=0, datetimePrecision=0, characterSetName='null', collationName='null', columnType='bigint(20) unsigned', columnKey='', extra='', privileges='select,insert,update,references', columnComment='', generationExpression=''}*/
private Long sortScan;

/**Column{tableCatalog='def', tableSchema='performance_schema', tableName='events_statements_current', columnName='NO_INDEX_USED', ordinalPosition=37, columnDefault='null', isNullable='NO', dataType='bigint', characterMaximumLength=0, characterOctetLength=0, numericPrecision=20, numericScale=0, datetimePrecision=0, characterSetName='null', collationName='null', columnType='bigint(20) unsigned', columnKey='', extra='', privileges='select,insert,update,references', columnComment='', generationExpression=''}*/
private Long noIndexUsed;

/**Column{tableCatalog='def', tableSchema='performance_schema', tableName='events_statements_current', columnName='NO_GOOD_INDEX_USED', ordinalPosition=38, columnDefault='null', isNullable='NO', dataType='bigint', characterMaximumLength=0, characterOctetLength=0, numericPrecision=20, numericScale=0, datetimePrecision=0, characterSetName='null', collationName='null', columnType='bigint(20) unsigned', columnKey='', extra='', privileges='select,insert,update,references', columnComment='', generationExpression=''}*/
private Long noGoodIndexUsed;

/**Column{tableCatalog='def', tableSchema='performance_schema', tableName='events_statements_current', columnName='NESTING_EVENT_ID', ordinalPosition=39, columnDefault='null', isNullable='YES', dataType='bigint', characterMaximumLength=0, characterOctetLength=0, numericPrecision=20, numericScale=0, datetimePrecision=0, characterSetName='null', collationName='null', columnType='bigint(20) unsigned', columnKey='', extra='', privileges='select,insert,update,references', columnComment='', generationExpression=''}*/
private Long nestingEventId;

/**Column{tableCatalog='def', tableSchema='performance_schema', tableName='events_statements_current', columnName='NESTING_EVENT_TYPE', ordinalPosition=40, columnDefault='null', isNullable='YES', dataType='enum', characterMaximumLength=11, characterOctetLength=33, numericPrecision=0, numericScale=0, datetimePrecision=0, characterSetName='utf8', collationName='utf8_general_ci', columnType='enum('TRANSACTION','STATEMENT','STAGE','WAIT')', columnKey='', extra='', privileges='select,insert,update,references', columnComment='', generationExpression=''}*/
private Date nestingEventType;

/**Column{tableCatalog='def', tableSchema='performance_schema', tableName='events_statements_current', columnName='NESTING_EVENT_LEVEL', ordinalPosition=41, columnDefault='null', isNullable='YES', dataType='int', characterMaximumLength=0, characterOctetLength=0, numericPrecision=10, numericScale=0, datetimePrecision=0, characterSetName='null', collationName='null', columnType='int(11)', columnKey='', extra='', privileges='select,insert,update,references', columnComment='', generationExpression=''}*/
private Integer nestingEventLevel;

public Long getThreadId(){
return threadId;
}

public Long getEventId(){
return eventId;
}

public Long getEndEventId(){
return endEventId;
}

public String getEventName(){
return eventName;
}

public String getSource(){
return source;
}

public Long getTimerStart(){
return timerStart;
}

public Long getTimerEnd(){
return timerEnd;
}

public Long getTimerWait(){
return timerWait;
}

public Long getLockTime(){
return lockTime;
}

public String getSqlText(){
return sqlText;
}

public String getDigest(){
return digest;
}

public String getDigestText(){
return digestText;
}

public String getCurrentSchema(){
return currentSchema;
}

public String getObjectType(){
return objectType;
}

public String getObjectSchema(){
return objectSchema;
}

public String getObjectName(){
return objectName;
}

public Long getObjectInstanceBegin(){
return objectInstanceBegin;
}

public Integer getMysqlErrno(){
return mysqlErrno;
}

public String getReturnedSqlstate(){
return returnedSqlstate;
}

public String getMessageText(){
return messageText;
}

public Long getErrors(){
return errors;
}

public Long getWarnings(){
return warnings;
}

public Long getRowsAffected(){
return rowsAffected;
}

public Long getRowsSent(){
return rowsSent;
}

public Long getRowsExamined(){
return rowsExamined;
}

public Long getCreatedTmpDiskTables(){
return createdTmpDiskTables;
}

public Long getCreatedTmpTables(){
return createdTmpTables;
}

public Long getSelectFullJoin(){
return selectFullJoin;
}

public Long getSelectFullRangeJoin(){
return selectFullRangeJoin;
}

public Long getSelectRange(){
return selectRange;
}

public Long getSelectRangeCheck(){
return selectRangeCheck;
}

public Long getSelectScan(){
return selectScan;
}

public Long getSortMergePasses(){
return sortMergePasses;
}

public Long getSortRange(){
return sortRange;
}

public Long getSortRows(){
return sortRows;
}

public Long getSortScan(){
return sortScan;
}

public Long getNoIndexUsed(){
return noIndexUsed;
}

public Long getNoGoodIndexUsed(){
return noGoodIndexUsed;
}

public Long getNestingEventId(){
return nestingEventId;
}

public Date getNestingEventType(){
return nestingEventType;
}

public Integer getNestingEventLevel(){
return nestingEventLevel;
}

}