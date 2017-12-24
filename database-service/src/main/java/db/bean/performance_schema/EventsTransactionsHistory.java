package db.bean.performance_schema;

import java.util.Date;

/* SELECT THREAD_ID AS threadId, EVENT_ID AS eventId, END_EVENT_ID AS endEventId, EVENT_NAME AS eventName, STATE AS state, TRX_ID AS trxId, GTID AS gtid, XID_FORMAT_ID AS xidFormatId, XID_GTRID AS xidGtrid, XID_BQUAL AS xidBqual, XA_STATE AS xaState, SOURCE AS source, TIMER_START AS timerStart, TIMER_END AS timerEnd, TIMER_WAIT AS timerWait, ACCESS_MODE AS accessMode, ISOLATION_LEVEL AS isolationLevel, AUTOCOMMIT AS autocommit, NUMBER_OF_SAVEPOINTS AS numberOfSavepoints, NUMBER_OF_ROLLBACK_TO_SAVEPOINT AS numberOfRollbackToSavepoint, NUMBER_OF_RELEASE_SAVEPOINT AS numberOfReleaseSavepoint, OBJECT_INSTANCE_BEGIN AS objectInstanceBegin, NESTING_EVENT_ID AS nestingEventId, NESTING_EVENT_TYPE AS nestingEventType FROM performance_schema.events_transactions_history */
/**
*/
public class EventsTransactionsHistory{
/**Column{tableCatalog='def', tableSchema='performance_schema', tableName='events_transactions_history', columnName='THREAD_ID', ordinalPosition=1, columnDefault='null', isNullable='NO', dataType='bigint', characterMaximumLength=0, characterOctetLength=0, numericPrecision=20, numericScale=0, datetimePrecision=0, characterSetName='null', collationName='null', columnType='bigint(20) unsigned', columnKey='', extra='', privileges='select,insert,update,references', columnComment='', generationExpression=''}*/
private Long threadId;

/**Column{tableCatalog='def', tableSchema='performance_schema', tableName='events_transactions_history', columnName='EVENT_ID', ordinalPosition=2, columnDefault='null', isNullable='NO', dataType='bigint', characterMaximumLength=0, characterOctetLength=0, numericPrecision=20, numericScale=0, datetimePrecision=0, characterSetName='null', collationName='null', columnType='bigint(20) unsigned', columnKey='', extra='', privileges='select,insert,update,references', columnComment='', generationExpression=''}*/
private Long eventId;

/**Column{tableCatalog='def', tableSchema='performance_schema', tableName='events_transactions_history', columnName='END_EVENT_ID', ordinalPosition=3, columnDefault='null', isNullable='YES', dataType='bigint', characterMaximumLength=0, characterOctetLength=0, numericPrecision=20, numericScale=0, datetimePrecision=0, characterSetName='null', collationName='null', columnType='bigint(20) unsigned', columnKey='', extra='', privileges='select,insert,update,references', columnComment='', generationExpression=''}*/
private Long endEventId;

/**Column{tableCatalog='def', tableSchema='performance_schema', tableName='events_transactions_history', columnName='EVENT_NAME', ordinalPosition=4, columnDefault='null', isNullable='NO', dataType='varchar', characterMaximumLength=128, characterOctetLength=384, numericPrecision=0, numericScale=0, datetimePrecision=0, characterSetName='utf8', collationName='utf8_general_ci', columnType='varchar(128)', columnKey='', extra='', privileges='select,insert,update,references', columnComment='', generationExpression=''}*/
private String eventName;

/**Column{tableCatalog='def', tableSchema='performance_schema', tableName='events_transactions_history', columnName='STATE', ordinalPosition=5, columnDefault='null', isNullable='YES', dataType='enum', characterMaximumLength=11, characterOctetLength=33, numericPrecision=0, numericScale=0, datetimePrecision=0, characterSetName='utf8', collationName='utf8_general_ci', columnType='enum('ACTIVE','COMMITTED','ROLLED BACK')', columnKey='', extra='', privileges='select,insert,update,references', columnComment='', generationExpression=''}*/
private Date state;

/**Column{tableCatalog='def', tableSchema='performance_schema', tableName='events_transactions_history', columnName='TRX_ID', ordinalPosition=6, columnDefault='null', isNullable='YES', dataType='bigint', characterMaximumLength=0, characterOctetLength=0, numericPrecision=20, numericScale=0, datetimePrecision=0, characterSetName='null', collationName='null', columnType='bigint(20) unsigned', columnKey='', extra='', privileges='select,insert,update,references', columnComment='', generationExpression=''}*/
private Long trxId;

/**Column{tableCatalog='def', tableSchema='performance_schema', tableName='events_transactions_history', columnName='GTID', ordinalPosition=7, columnDefault='null', isNullable='YES', dataType='varchar', characterMaximumLength=64, characterOctetLength=192, numericPrecision=0, numericScale=0, datetimePrecision=0, characterSetName='utf8', collationName='utf8_general_ci', columnType='varchar(64)', columnKey='', extra='', privileges='select,insert,update,references', columnComment='', generationExpression=''}*/
private String gtid;

/**Column{tableCatalog='def', tableSchema='performance_schema', tableName='events_transactions_history', columnName='XID_FORMAT_ID', ordinalPosition=8, columnDefault='null', isNullable='YES', dataType='int', characterMaximumLength=0, characterOctetLength=0, numericPrecision=10, numericScale=0, datetimePrecision=0, characterSetName='null', collationName='null', columnType='int(11)', columnKey='', extra='', privileges='select,insert,update,references', columnComment='', generationExpression=''}*/
private Integer xidFormatId;

/**Column{tableCatalog='def', tableSchema='performance_schema', tableName='events_transactions_history', columnName='XID_GTRID', ordinalPosition=9, columnDefault='null', isNullable='YES', dataType='varchar', characterMaximumLength=130, characterOctetLength=390, numericPrecision=0, numericScale=0, datetimePrecision=0, characterSetName='utf8', collationName='utf8_general_ci', columnType='varchar(130)', columnKey='', extra='', privileges='select,insert,update,references', columnComment='', generationExpression=''}*/
private String xidGtrid;

/**Column{tableCatalog='def', tableSchema='performance_schema', tableName='events_transactions_history', columnName='XID_BQUAL', ordinalPosition=10, columnDefault='null', isNullable='YES', dataType='varchar', characterMaximumLength=130, characterOctetLength=390, numericPrecision=0, numericScale=0, datetimePrecision=0, characterSetName='utf8', collationName='utf8_general_ci', columnType='varchar(130)', columnKey='', extra='', privileges='select,insert,update,references', columnComment='', generationExpression=''}*/
private String xidBqual;

/**Column{tableCatalog='def', tableSchema='performance_schema', tableName='events_transactions_history', columnName='XA_STATE', ordinalPosition=11, columnDefault='null', isNullable='YES', dataType='varchar', characterMaximumLength=64, characterOctetLength=192, numericPrecision=0, numericScale=0, datetimePrecision=0, characterSetName='utf8', collationName='utf8_general_ci', columnType='varchar(64)', columnKey='', extra='', privileges='select,insert,update,references', columnComment='', generationExpression=''}*/
private String xaState;

/**Column{tableCatalog='def', tableSchema='performance_schema', tableName='events_transactions_history', columnName='SOURCE', ordinalPosition=12, columnDefault='null', isNullable='YES', dataType='varchar', characterMaximumLength=64, characterOctetLength=192, numericPrecision=0, numericScale=0, datetimePrecision=0, characterSetName='utf8', collationName='utf8_general_ci', columnType='varchar(64)', columnKey='', extra='', privileges='select,insert,update,references', columnComment='', generationExpression=''}*/
private String source;

/**Column{tableCatalog='def', tableSchema='performance_schema', tableName='events_transactions_history', columnName='TIMER_START', ordinalPosition=13, columnDefault='null', isNullable='YES', dataType='bigint', characterMaximumLength=0, characterOctetLength=0, numericPrecision=20, numericScale=0, datetimePrecision=0, characterSetName='null', collationName='null', columnType='bigint(20) unsigned', columnKey='', extra='', privileges='select,insert,update,references', columnComment='', generationExpression=''}*/
private Long timerStart;

/**Column{tableCatalog='def', tableSchema='performance_schema', tableName='events_transactions_history', columnName='TIMER_END', ordinalPosition=14, columnDefault='null', isNullable='YES', dataType='bigint', characterMaximumLength=0, characterOctetLength=0, numericPrecision=20, numericScale=0, datetimePrecision=0, characterSetName='null', collationName='null', columnType='bigint(20) unsigned', columnKey='', extra='', privileges='select,insert,update,references', columnComment='', generationExpression=''}*/
private Long timerEnd;

/**Column{tableCatalog='def', tableSchema='performance_schema', tableName='events_transactions_history', columnName='TIMER_WAIT', ordinalPosition=15, columnDefault='null', isNullable='YES', dataType='bigint', characterMaximumLength=0, characterOctetLength=0, numericPrecision=20, numericScale=0, datetimePrecision=0, characterSetName='null', collationName='null', columnType='bigint(20) unsigned', columnKey='', extra='', privileges='select,insert,update,references', columnComment='', generationExpression=''}*/
private Long timerWait;

/**Column{tableCatalog='def', tableSchema='performance_schema', tableName='events_transactions_history', columnName='ACCESS_MODE', ordinalPosition=16, columnDefault='null', isNullable='YES', dataType='enum', characterMaximumLength=10, characterOctetLength=30, numericPrecision=0, numericScale=0, datetimePrecision=0, characterSetName='utf8', collationName='utf8_general_ci', columnType='enum('READ ONLY','READ WRITE')', columnKey='', extra='', privileges='select,insert,update,references', columnComment='', generationExpression=''}*/
private Date accessMode;

/**Column{tableCatalog='def', tableSchema='performance_schema', tableName='events_transactions_history', columnName='ISOLATION_LEVEL', ordinalPosition=17, columnDefault='null', isNullable='YES', dataType='varchar', characterMaximumLength=64, characterOctetLength=192, numericPrecision=0, numericScale=0, datetimePrecision=0, characterSetName='utf8', collationName='utf8_general_ci', columnType='varchar(64)', columnKey='', extra='', privileges='select,insert,update,references', columnComment='', generationExpression=''}*/
private String isolationLevel;

/**Column{tableCatalog='def', tableSchema='performance_schema', tableName='events_transactions_history', columnName='AUTOCOMMIT', ordinalPosition=18, columnDefault='null', isNullable='NO', dataType='enum', characterMaximumLength=3, characterOctetLength=9, numericPrecision=0, numericScale=0, datetimePrecision=0, characterSetName='utf8', collationName='utf8_general_ci', columnType='enum('YES','NO')', columnKey='', extra='', privileges='select,insert,update,references', columnComment='', generationExpression=''}*/
private Date autocommit;

/**Column{tableCatalog='def', tableSchema='performance_schema', tableName='events_transactions_history', columnName='NUMBER_OF_SAVEPOINTS', ordinalPosition=19, columnDefault='null', isNullable='YES', dataType='bigint', characterMaximumLength=0, characterOctetLength=0, numericPrecision=20, numericScale=0, datetimePrecision=0, characterSetName='null', collationName='null', columnType='bigint(20) unsigned', columnKey='', extra='', privileges='select,insert,update,references', columnComment='', generationExpression=''}*/
private Long numberOfSavepoints;

/**Column{tableCatalog='def', tableSchema='performance_schema', tableName='events_transactions_history', columnName='NUMBER_OF_ROLLBACK_TO_SAVEPOINT', ordinalPosition=20, columnDefault='null', isNullable='YES', dataType='bigint', characterMaximumLength=0, characterOctetLength=0, numericPrecision=20, numericScale=0, datetimePrecision=0, characterSetName='null', collationName='null', columnType='bigint(20) unsigned', columnKey='', extra='', privileges='select,insert,update,references', columnComment='', generationExpression=''}*/
private Long numberOfRollbackToSavepoint;

/**Column{tableCatalog='def', tableSchema='performance_schema', tableName='events_transactions_history', columnName='NUMBER_OF_RELEASE_SAVEPOINT', ordinalPosition=21, columnDefault='null', isNullable='YES', dataType='bigint', characterMaximumLength=0, characterOctetLength=0, numericPrecision=20, numericScale=0, datetimePrecision=0, characterSetName='null', collationName='null', columnType='bigint(20) unsigned', columnKey='', extra='', privileges='select,insert,update,references', columnComment='', generationExpression=''}*/
private Long numberOfReleaseSavepoint;

/**Column{tableCatalog='def', tableSchema='performance_schema', tableName='events_transactions_history', columnName='OBJECT_INSTANCE_BEGIN', ordinalPosition=22, columnDefault='null', isNullable='YES', dataType='bigint', characterMaximumLength=0, characterOctetLength=0, numericPrecision=20, numericScale=0, datetimePrecision=0, characterSetName='null', collationName='null', columnType='bigint(20) unsigned', columnKey='', extra='', privileges='select,insert,update,references', columnComment='', generationExpression=''}*/
private Long objectInstanceBegin;

/**Column{tableCatalog='def', tableSchema='performance_schema', tableName='events_transactions_history', columnName='NESTING_EVENT_ID', ordinalPosition=23, columnDefault='null', isNullable='YES', dataType='bigint', characterMaximumLength=0, characterOctetLength=0, numericPrecision=20, numericScale=0, datetimePrecision=0, characterSetName='null', collationName='null', columnType='bigint(20) unsigned', columnKey='', extra='', privileges='select,insert,update,references', columnComment='', generationExpression=''}*/
private Long nestingEventId;

/**Column{tableCatalog='def', tableSchema='performance_schema', tableName='events_transactions_history', columnName='NESTING_EVENT_TYPE', ordinalPosition=24, columnDefault='null', isNullable='YES', dataType='enum', characterMaximumLength=11, characterOctetLength=33, numericPrecision=0, numericScale=0, datetimePrecision=0, characterSetName='utf8', collationName='utf8_general_ci', columnType='enum('TRANSACTION','STATEMENT','STAGE','WAIT')', columnKey='', extra='', privileges='select,insert,update,references', columnComment='', generationExpression=''}*/
private Date nestingEventType;

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

public Date getState(){
return state;
}

public Long getTrxId(){
return trxId;
}

public String getGtid(){
return gtid;
}

public Integer getXidFormatId(){
return xidFormatId;
}

public String getXidGtrid(){
return xidGtrid;
}

public String getXidBqual(){
return xidBqual;
}

public String getXaState(){
return xaState;
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

public Date getAccessMode(){
return accessMode;
}

public String getIsolationLevel(){
return isolationLevel;
}

public Date getAutocommit(){
return autocommit;
}

public Long getNumberOfSavepoints(){
return numberOfSavepoints;
}

public Long getNumberOfRollbackToSavepoint(){
return numberOfRollbackToSavepoint;
}

public Long getNumberOfReleaseSavepoint(){
return numberOfReleaseSavepoint;
}

public Long getObjectInstanceBegin(){
return objectInstanceBegin;
}

public Long getNestingEventId(){
return nestingEventId;
}

public Date getNestingEventType(){
return nestingEventType;
}

}