package db.bean.performance_schema;

import java.util.Date;

/* SELECT THREAD_ID AS threadId, EVENT_ID AS eventId, END_EVENT_ID AS endEventId, EVENT_NAME AS eventName, SOURCE AS source, TIMER_START AS timerStart, TIMER_END AS timerEnd, TIMER_WAIT AS timerWait, SPINS AS spins, OBJECT_SCHEMA AS objectSchema, OBJECT_NAME AS objectName, INDEX_NAME AS indexName, OBJECT_TYPE AS objectType, OBJECT_INSTANCE_BEGIN AS objectInstanceBegin, NESTING_EVENT_ID AS nestingEventId, NESTING_EVENT_TYPE AS nestingEventType, OPERATION AS operation, NUMBER_OF_BYTES AS numberOfBytes, FLAGS AS flags FROM performance_schema.events_waits_history */
/**
*/
public class EventsWaitsHistory{
/**Column{tableCatalog='def', tableSchema='performance_schema', tableName='events_waits_history', columnName='THREAD_ID', ordinalPosition=1, columnDefault='null', isNullable='NO', dataType='bigint', characterMaximumLength=0, characterOctetLength=0, numericPrecision=20, numericScale=0, datetimePrecision=0, characterSetName='null', collationName='null', columnType='bigint(20) unsigned', columnKey='', extra='', privileges='select,insert,update,references', columnComment='', generationExpression=''}*/
private Long threadId;

/**Column{tableCatalog='def', tableSchema='performance_schema', tableName='events_waits_history', columnName='EVENT_ID', ordinalPosition=2, columnDefault='null', isNullable='NO', dataType='bigint', characterMaximumLength=0, characterOctetLength=0, numericPrecision=20, numericScale=0, datetimePrecision=0, characterSetName='null', collationName='null', columnType='bigint(20) unsigned', columnKey='', extra='', privileges='select,insert,update,references', columnComment='', generationExpression=''}*/
private Long eventId;

/**Column{tableCatalog='def', tableSchema='performance_schema', tableName='events_waits_history', columnName='END_EVENT_ID', ordinalPosition=3, columnDefault='null', isNullable='YES', dataType='bigint', characterMaximumLength=0, characterOctetLength=0, numericPrecision=20, numericScale=0, datetimePrecision=0, characterSetName='null', collationName='null', columnType='bigint(20) unsigned', columnKey='', extra='', privileges='select,insert,update,references', columnComment='', generationExpression=''}*/
private Long endEventId;

/**Column{tableCatalog='def', tableSchema='performance_schema', tableName='events_waits_history', columnName='EVENT_NAME', ordinalPosition=4, columnDefault='null', isNullable='NO', dataType='varchar', characterMaximumLength=128, characterOctetLength=384, numericPrecision=0, numericScale=0, datetimePrecision=0, characterSetName='utf8', collationName='utf8_general_ci', columnType='varchar(128)', columnKey='', extra='', privileges='select,insert,update,references', columnComment='', generationExpression=''}*/
private String eventName;

/**Column{tableCatalog='def', tableSchema='performance_schema', tableName='events_waits_history', columnName='SOURCE', ordinalPosition=5, columnDefault='null', isNullable='YES', dataType='varchar', characterMaximumLength=64, characterOctetLength=192, numericPrecision=0, numericScale=0, datetimePrecision=0, characterSetName='utf8', collationName='utf8_general_ci', columnType='varchar(64)', columnKey='', extra='', privileges='select,insert,update,references', columnComment='', generationExpression=''}*/
private String source;

/**Column{tableCatalog='def', tableSchema='performance_schema', tableName='events_waits_history', columnName='TIMER_START', ordinalPosition=6, columnDefault='null', isNullable='YES', dataType='bigint', characterMaximumLength=0, characterOctetLength=0, numericPrecision=20, numericScale=0, datetimePrecision=0, characterSetName='null', collationName='null', columnType='bigint(20) unsigned', columnKey='', extra='', privileges='select,insert,update,references', columnComment='', generationExpression=''}*/
private Long timerStart;

/**Column{tableCatalog='def', tableSchema='performance_schema', tableName='events_waits_history', columnName='TIMER_END', ordinalPosition=7, columnDefault='null', isNullable='YES', dataType='bigint', characterMaximumLength=0, characterOctetLength=0, numericPrecision=20, numericScale=0, datetimePrecision=0, characterSetName='null', collationName='null', columnType='bigint(20) unsigned', columnKey='', extra='', privileges='select,insert,update,references', columnComment='', generationExpression=''}*/
private Long timerEnd;

/**Column{tableCatalog='def', tableSchema='performance_schema', tableName='events_waits_history', columnName='TIMER_WAIT', ordinalPosition=8, columnDefault='null', isNullable='YES', dataType='bigint', characterMaximumLength=0, characterOctetLength=0, numericPrecision=20, numericScale=0, datetimePrecision=0, characterSetName='null', collationName='null', columnType='bigint(20) unsigned', columnKey='', extra='', privileges='select,insert,update,references', columnComment='', generationExpression=''}*/
private Long timerWait;

/**Column{tableCatalog='def', tableSchema='performance_schema', tableName='events_waits_history', columnName='SPINS', ordinalPosition=9, columnDefault='null', isNullable='YES', dataType='int', characterMaximumLength=0, characterOctetLength=0, numericPrecision=10, numericScale=0, datetimePrecision=0, characterSetName='null', collationName='null', columnType='int(10) unsigned', columnKey='', extra='', privileges='select,insert,update,references', columnComment='', generationExpression=''}*/
private Integer spins;

/**Column{tableCatalog='def', tableSchema='performance_schema', tableName='events_waits_history', columnName='OBJECT_SCHEMA', ordinalPosition=10, columnDefault='null', isNullable='YES', dataType='varchar', characterMaximumLength=64, characterOctetLength=192, numericPrecision=0, numericScale=0, datetimePrecision=0, characterSetName='utf8', collationName='utf8_general_ci', columnType='varchar(64)', columnKey='', extra='', privileges='select,insert,update,references', columnComment='', generationExpression=''}*/
private String objectSchema;

/**Column{tableCatalog='def', tableSchema='performance_schema', tableName='events_waits_history', columnName='OBJECT_NAME', ordinalPosition=11, columnDefault='null', isNullable='YES', dataType='varchar', characterMaximumLength=512, characterOctetLength=1536, numericPrecision=0, numericScale=0, datetimePrecision=0, characterSetName='utf8', collationName='utf8_general_ci', columnType='varchar(512)', columnKey='', extra='', privileges='select,insert,update,references', columnComment='', generationExpression=''}*/
private String objectName;

/**Column{tableCatalog='def', tableSchema='performance_schema', tableName='events_waits_history', columnName='INDEX_NAME', ordinalPosition=12, columnDefault='null', isNullable='YES', dataType='varchar', characterMaximumLength=64, characterOctetLength=192, numericPrecision=0, numericScale=0, datetimePrecision=0, characterSetName='utf8', collationName='utf8_general_ci', columnType='varchar(64)', columnKey='', extra='', privileges='select,insert,update,references', columnComment='', generationExpression=''}*/
private String indexName;

/**Column{tableCatalog='def', tableSchema='performance_schema', tableName='events_waits_history', columnName='OBJECT_TYPE', ordinalPosition=13, columnDefault='null', isNullable='YES', dataType='varchar', characterMaximumLength=64, characterOctetLength=192, numericPrecision=0, numericScale=0, datetimePrecision=0, characterSetName='utf8', collationName='utf8_general_ci', columnType='varchar(64)', columnKey='', extra='', privileges='select,insert,update,references', columnComment='', generationExpression=''}*/
private String objectType;

/**Column{tableCatalog='def', tableSchema='performance_schema', tableName='events_waits_history', columnName='OBJECT_INSTANCE_BEGIN', ordinalPosition=14, columnDefault='null', isNullable='NO', dataType='bigint', characterMaximumLength=0, characterOctetLength=0, numericPrecision=20, numericScale=0, datetimePrecision=0, characterSetName='null', collationName='null', columnType='bigint(20) unsigned', columnKey='', extra='', privileges='select,insert,update,references', columnComment='', generationExpression=''}*/
private Long objectInstanceBegin;

/**Column{tableCatalog='def', tableSchema='performance_schema', tableName='events_waits_history', columnName='NESTING_EVENT_ID', ordinalPosition=15, columnDefault='null', isNullable='YES', dataType='bigint', characterMaximumLength=0, characterOctetLength=0, numericPrecision=20, numericScale=0, datetimePrecision=0, characterSetName='null', collationName='null', columnType='bigint(20) unsigned', columnKey='', extra='', privileges='select,insert,update,references', columnComment='', generationExpression=''}*/
private Long nestingEventId;

/**Column{tableCatalog='def', tableSchema='performance_schema', tableName='events_waits_history', columnName='NESTING_EVENT_TYPE', ordinalPosition=16, columnDefault='null', isNullable='YES', dataType='enum', characterMaximumLength=11, characterOctetLength=33, numericPrecision=0, numericScale=0, datetimePrecision=0, characterSetName='utf8', collationName='utf8_general_ci', columnType='enum('TRANSACTION','STATEMENT','STAGE','WAIT')', columnKey='', extra='', privileges='select,insert,update,references', columnComment='', generationExpression=''}*/
private Date nestingEventType;

/**Column{tableCatalog='def', tableSchema='performance_schema', tableName='events_waits_history', columnName='OPERATION', ordinalPosition=17, columnDefault='null', isNullable='NO', dataType='varchar', characterMaximumLength=32, characterOctetLength=96, numericPrecision=0, numericScale=0, datetimePrecision=0, characterSetName='utf8', collationName='utf8_general_ci', columnType='varchar(32)', columnKey='', extra='', privileges='select,insert,update,references', columnComment='', generationExpression=''}*/
private String operation;

/**Column{tableCatalog='def', tableSchema='performance_schema', tableName='events_waits_history', columnName='NUMBER_OF_BYTES', ordinalPosition=18, columnDefault='null', isNullable='YES', dataType='bigint', characterMaximumLength=0, characterOctetLength=0, numericPrecision=19, numericScale=0, datetimePrecision=0, characterSetName='null', collationName='null', columnType='bigint(20)', columnKey='', extra='', privileges='select,insert,update,references', columnComment='', generationExpression=''}*/
private Long numberOfBytes;

/**Column{tableCatalog='def', tableSchema='performance_schema', tableName='events_waits_history', columnName='FLAGS', ordinalPosition=19, columnDefault='null', isNullable='YES', dataType='int', characterMaximumLength=0, characterOctetLength=0, numericPrecision=10, numericScale=0, datetimePrecision=0, characterSetName='null', collationName='null', columnType='int(10) unsigned', columnKey='', extra='', privileges='select,insert,update,references', columnComment='', generationExpression=''}*/
private Integer flags;

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

public Integer getSpins(){
return spins;
}

public String getObjectSchema(){
return objectSchema;
}

public String getObjectName(){
return objectName;
}

public String getIndexName(){
return indexName;
}

public String getObjectType(){
return objectType;
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

public String getOperation(){
return operation;
}

public Long getNumberOfBytes(){
return numberOfBytes;
}

public Integer getFlags(){
return flags;
}

}