package db.bean.performance_schema;

import java.util.Date;

/* SELECT THREAD_ID AS threadId, EVENT_ID AS eventId, END_EVENT_ID AS endEventId, EVENT_NAME AS eventName, SOURCE AS source, TIMER_START AS timerStart, TIMER_END AS timerEnd, TIMER_WAIT AS timerWait, WORK_COMPLETED AS workCompleted, WORK_ESTIMATED AS workEstimated, NESTING_EVENT_ID AS nestingEventId, NESTING_EVENT_TYPE AS nestingEventType FROM performance_schema.events_stages_history_long */
/**
*/
public class EventsStagesHistoryLong{
/**Column{tableCatalog='def', tableSchema='performance_schema', tableName='events_stages_history_long', columnName='THREAD_ID', ordinalPosition=1, columnDefault='null', isNullable='NO', dataType='bigint', characterMaximumLength=0, characterOctetLength=0, numericPrecision=20, numericScale=0, datetimePrecision=0, characterSetName='null', collationName='null', columnType='bigint(20) unsigned', columnKey='', extra='', privileges='select,insert,update,references', columnComment='', generationExpression=''}*/
private Long threadId;

/**Column{tableCatalog='def', tableSchema='performance_schema', tableName='events_stages_history_long', columnName='EVENT_ID', ordinalPosition=2, columnDefault='null', isNullable='NO', dataType='bigint', characterMaximumLength=0, characterOctetLength=0, numericPrecision=20, numericScale=0, datetimePrecision=0, characterSetName='null', collationName='null', columnType='bigint(20) unsigned', columnKey='', extra='', privileges='select,insert,update,references', columnComment='', generationExpression=''}*/
private Long eventId;

/**Column{tableCatalog='def', tableSchema='performance_schema', tableName='events_stages_history_long', columnName='END_EVENT_ID', ordinalPosition=3, columnDefault='null', isNullable='YES', dataType='bigint', characterMaximumLength=0, characterOctetLength=0, numericPrecision=20, numericScale=0, datetimePrecision=0, characterSetName='null', collationName='null', columnType='bigint(20) unsigned', columnKey='', extra='', privileges='select,insert,update,references', columnComment='', generationExpression=''}*/
private Long endEventId;

/**Column{tableCatalog='def', tableSchema='performance_schema', tableName='events_stages_history_long', columnName='EVENT_NAME', ordinalPosition=4, columnDefault='null', isNullable='NO', dataType='varchar', characterMaximumLength=128, characterOctetLength=384, numericPrecision=0, numericScale=0, datetimePrecision=0, characterSetName='utf8', collationName='utf8_general_ci', columnType='varchar(128)', columnKey='', extra='', privileges='select,insert,update,references', columnComment='', generationExpression=''}*/
private String eventName;

/**Column{tableCatalog='def', tableSchema='performance_schema', tableName='events_stages_history_long', columnName='SOURCE', ordinalPosition=5, columnDefault='null', isNullable='YES', dataType='varchar', characterMaximumLength=64, characterOctetLength=192, numericPrecision=0, numericScale=0, datetimePrecision=0, characterSetName='utf8', collationName='utf8_general_ci', columnType='varchar(64)', columnKey='', extra='', privileges='select,insert,update,references', columnComment='', generationExpression=''}*/
private String source;

/**Column{tableCatalog='def', tableSchema='performance_schema', tableName='events_stages_history_long', columnName='TIMER_START', ordinalPosition=6, columnDefault='null', isNullable='YES', dataType='bigint', characterMaximumLength=0, characterOctetLength=0, numericPrecision=20, numericScale=0, datetimePrecision=0, characterSetName='null', collationName='null', columnType='bigint(20) unsigned', columnKey='', extra='', privileges='select,insert,update,references', columnComment='', generationExpression=''}*/
private Long timerStart;

/**Column{tableCatalog='def', tableSchema='performance_schema', tableName='events_stages_history_long', columnName='TIMER_END', ordinalPosition=7, columnDefault='null', isNullable='YES', dataType='bigint', characterMaximumLength=0, characterOctetLength=0, numericPrecision=20, numericScale=0, datetimePrecision=0, characterSetName='null', collationName='null', columnType='bigint(20) unsigned', columnKey='', extra='', privileges='select,insert,update,references', columnComment='', generationExpression=''}*/
private Long timerEnd;

/**Column{tableCatalog='def', tableSchema='performance_schema', tableName='events_stages_history_long', columnName='TIMER_WAIT', ordinalPosition=8, columnDefault='null', isNullable='YES', dataType='bigint', characterMaximumLength=0, characterOctetLength=0, numericPrecision=20, numericScale=0, datetimePrecision=0, characterSetName='null', collationName='null', columnType='bigint(20) unsigned', columnKey='', extra='', privileges='select,insert,update,references', columnComment='', generationExpression=''}*/
private Long timerWait;

/**Column{tableCatalog='def', tableSchema='performance_schema', tableName='events_stages_history_long', columnName='WORK_COMPLETED', ordinalPosition=9, columnDefault='null', isNullable='YES', dataType='bigint', characterMaximumLength=0, characterOctetLength=0, numericPrecision=20, numericScale=0, datetimePrecision=0, characterSetName='null', collationName='null', columnType='bigint(20) unsigned', columnKey='', extra='', privileges='select,insert,update,references', columnComment='', generationExpression=''}*/
private Long workCompleted;

/**Column{tableCatalog='def', tableSchema='performance_schema', tableName='events_stages_history_long', columnName='WORK_ESTIMATED', ordinalPosition=10, columnDefault='null', isNullable='YES', dataType='bigint', characterMaximumLength=0, characterOctetLength=0, numericPrecision=20, numericScale=0, datetimePrecision=0, characterSetName='null', collationName='null', columnType='bigint(20) unsigned', columnKey='', extra='', privileges='select,insert,update,references', columnComment='', generationExpression=''}*/
private Long workEstimated;

/**Column{tableCatalog='def', tableSchema='performance_schema', tableName='events_stages_history_long', columnName='NESTING_EVENT_ID', ordinalPosition=11, columnDefault='null', isNullable='YES', dataType='bigint', characterMaximumLength=0, characterOctetLength=0, numericPrecision=20, numericScale=0, datetimePrecision=0, characterSetName='null', collationName='null', columnType='bigint(20) unsigned', columnKey='', extra='', privileges='select,insert,update,references', columnComment='', generationExpression=''}*/
private Long nestingEventId;

/**Column{tableCatalog='def', tableSchema='performance_schema', tableName='events_stages_history_long', columnName='NESTING_EVENT_TYPE', ordinalPosition=12, columnDefault='null', isNullable='YES', dataType='enum', characterMaximumLength=11, characterOctetLength=33, numericPrecision=0, numericScale=0, datetimePrecision=0, characterSetName='utf8', collationName='utf8_general_ci', columnType='enum('TRANSACTION','STATEMENT','STAGE','WAIT')', columnKey='', extra='', privileges='select,insert,update,references', columnComment='', generationExpression=''}*/
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

public Long getWorkCompleted(){
return workCompleted;
}

public Long getWorkEstimated(){
return workEstimated;
}

public Long getNestingEventId(){
return nestingEventId;
}

public Date getNestingEventType(){
return nestingEventType;
}

}