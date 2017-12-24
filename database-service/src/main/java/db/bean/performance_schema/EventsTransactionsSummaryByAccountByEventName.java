package db.bean.performance_schema;


/* SELECT USER AS user, HOST AS host, EVENT_NAME AS eventName, COUNT_STAR AS countStar, SUM_TIMER_WAIT AS sumTimerWait, MIN_TIMER_WAIT AS minTimerWait, AVG_TIMER_WAIT AS avgTimerWait, MAX_TIMER_WAIT AS maxTimerWait, COUNT_READ_WRITE AS countReadWrite, SUM_TIMER_READ_WRITE AS sumTimerReadWrite, MIN_TIMER_READ_WRITE AS minTimerReadWrite, AVG_TIMER_READ_WRITE AS avgTimerReadWrite, MAX_TIMER_READ_WRITE AS maxTimerReadWrite, COUNT_READ_ONLY AS countReadOnly, SUM_TIMER_READ_ONLY AS sumTimerReadOnly, MIN_TIMER_READ_ONLY AS minTimerReadOnly, AVG_TIMER_READ_ONLY AS avgTimerReadOnly, MAX_TIMER_READ_ONLY AS maxTimerReadOnly FROM performance_schema.events_transactions_summary_by_account_by_event_name */
/**
*/
public class EventsTransactionsSummaryByAccountByEventName{
/**Column{tableCatalog='def', tableSchema='performance_schema', tableName='events_transactions_summary_by_account_by_event_name', columnName='USER', ordinalPosition=1, columnDefault='null', isNullable='YES', dataType='char', characterMaximumLength=32, characterOctetLength=96, numericPrecision=0, numericScale=0, datetimePrecision=0, characterSetName='utf8', collationName='utf8_bin', columnType='char(32)', columnKey='', extra='', privileges='select,insert,update,references', columnComment='', generationExpression=''}*/
private String user;

/**Column{tableCatalog='def', tableSchema='performance_schema', tableName='events_transactions_summary_by_account_by_event_name', columnName='HOST', ordinalPosition=2, columnDefault='null', isNullable='YES', dataType='char', characterMaximumLength=60, characterOctetLength=180, numericPrecision=0, numericScale=0, datetimePrecision=0, characterSetName='utf8', collationName='utf8_bin', columnType='char(60)', columnKey='', extra='', privileges='select,insert,update,references', columnComment='', generationExpression=''}*/
private String host;

/**Column{tableCatalog='def', tableSchema='performance_schema', tableName='events_transactions_summary_by_account_by_event_name', columnName='EVENT_NAME', ordinalPosition=3, columnDefault='null', isNullable='NO', dataType='varchar', characterMaximumLength=128, characterOctetLength=384, numericPrecision=0, numericScale=0, datetimePrecision=0, characterSetName='utf8', collationName='utf8_general_ci', columnType='varchar(128)', columnKey='', extra='', privileges='select,insert,update,references', columnComment='', generationExpression=''}*/
private String eventName;

/**Column{tableCatalog='def', tableSchema='performance_schema', tableName='events_transactions_summary_by_account_by_event_name', columnName='COUNT_STAR', ordinalPosition=4, columnDefault='null', isNullable='NO', dataType='bigint', characterMaximumLength=0, characterOctetLength=0, numericPrecision=20, numericScale=0, datetimePrecision=0, characterSetName='null', collationName='null', columnType='bigint(20) unsigned', columnKey='', extra='', privileges='select,insert,update,references', columnComment='', generationExpression=''}*/
private Long countStar;

/**Column{tableCatalog='def', tableSchema='performance_schema', tableName='events_transactions_summary_by_account_by_event_name', columnName='SUM_TIMER_WAIT', ordinalPosition=5, columnDefault='null', isNullable='NO', dataType='bigint', characterMaximumLength=0, characterOctetLength=0, numericPrecision=20, numericScale=0, datetimePrecision=0, characterSetName='null', collationName='null', columnType='bigint(20) unsigned', columnKey='', extra='', privileges='select,insert,update,references', columnComment='', generationExpression=''}*/
private Long sumTimerWait;

/**Column{tableCatalog='def', tableSchema='performance_schema', tableName='events_transactions_summary_by_account_by_event_name', columnName='MIN_TIMER_WAIT', ordinalPosition=6, columnDefault='null', isNullable='NO', dataType='bigint', characterMaximumLength=0, characterOctetLength=0, numericPrecision=20, numericScale=0, datetimePrecision=0, characterSetName='null', collationName='null', columnType='bigint(20) unsigned', columnKey='', extra='', privileges='select,insert,update,references', columnComment='', generationExpression=''}*/
private Long minTimerWait;

/**Column{tableCatalog='def', tableSchema='performance_schema', tableName='events_transactions_summary_by_account_by_event_name', columnName='AVG_TIMER_WAIT', ordinalPosition=7, columnDefault='null', isNullable='NO', dataType='bigint', characterMaximumLength=0, characterOctetLength=0, numericPrecision=20, numericScale=0, datetimePrecision=0, characterSetName='null', collationName='null', columnType='bigint(20) unsigned', columnKey='', extra='', privileges='select,insert,update,references', columnComment='', generationExpression=''}*/
private Long avgTimerWait;

/**Column{tableCatalog='def', tableSchema='performance_schema', tableName='events_transactions_summary_by_account_by_event_name', columnName='MAX_TIMER_WAIT', ordinalPosition=8, columnDefault='null', isNullable='NO', dataType='bigint', characterMaximumLength=0, characterOctetLength=0, numericPrecision=20, numericScale=0, datetimePrecision=0, characterSetName='null', collationName='null', columnType='bigint(20) unsigned', columnKey='', extra='', privileges='select,insert,update,references', columnComment='', generationExpression=''}*/
private Long maxTimerWait;

/**Column{tableCatalog='def', tableSchema='performance_schema', tableName='events_transactions_summary_by_account_by_event_name', columnName='COUNT_READ_WRITE', ordinalPosition=9, columnDefault='null', isNullable='NO', dataType='bigint', characterMaximumLength=0, characterOctetLength=0, numericPrecision=20, numericScale=0, datetimePrecision=0, characterSetName='null', collationName='null', columnType='bigint(20) unsigned', columnKey='', extra='', privileges='select,insert,update,references', columnComment='', generationExpression=''}*/
private Long countReadWrite;

/**Column{tableCatalog='def', tableSchema='performance_schema', tableName='events_transactions_summary_by_account_by_event_name', columnName='SUM_TIMER_READ_WRITE', ordinalPosition=10, columnDefault='null', isNullable='NO', dataType='bigint', characterMaximumLength=0, characterOctetLength=0, numericPrecision=20, numericScale=0, datetimePrecision=0, characterSetName='null', collationName='null', columnType='bigint(20) unsigned', columnKey='', extra='', privileges='select,insert,update,references', columnComment='', generationExpression=''}*/
private Long sumTimerReadWrite;

/**Column{tableCatalog='def', tableSchema='performance_schema', tableName='events_transactions_summary_by_account_by_event_name', columnName='MIN_TIMER_READ_WRITE', ordinalPosition=11, columnDefault='null', isNullable='NO', dataType='bigint', characterMaximumLength=0, characterOctetLength=0, numericPrecision=20, numericScale=0, datetimePrecision=0, characterSetName='null', collationName='null', columnType='bigint(20) unsigned', columnKey='', extra='', privileges='select,insert,update,references', columnComment='', generationExpression=''}*/
private Long minTimerReadWrite;

/**Column{tableCatalog='def', tableSchema='performance_schema', tableName='events_transactions_summary_by_account_by_event_name', columnName='AVG_TIMER_READ_WRITE', ordinalPosition=12, columnDefault='null', isNullable='NO', dataType='bigint', characterMaximumLength=0, characterOctetLength=0, numericPrecision=20, numericScale=0, datetimePrecision=0, characterSetName='null', collationName='null', columnType='bigint(20) unsigned', columnKey='', extra='', privileges='select,insert,update,references', columnComment='', generationExpression=''}*/
private Long avgTimerReadWrite;

/**Column{tableCatalog='def', tableSchema='performance_schema', tableName='events_transactions_summary_by_account_by_event_name', columnName='MAX_TIMER_READ_WRITE', ordinalPosition=13, columnDefault='null', isNullable='NO', dataType='bigint', characterMaximumLength=0, characterOctetLength=0, numericPrecision=20, numericScale=0, datetimePrecision=0, characterSetName='null', collationName='null', columnType='bigint(20) unsigned', columnKey='', extra='', privileges='select,insert,update,references', columnComment='', generationExpression=''}*/
private Long maxTimerReadWrite;

/**Column{tableCatalog='def', tableSchema='performance_schema', tableName='events_transactions_summary_by_account_by_event_name', columnName='COUNT_READ_ONLY', ordinalPosition=14, columnDefault='null', isNullable='NO', dataType='bigint', characterMaximumLength=0, characterOctetLength=0, numericPrecision=20, numericScale=0, datetimePrecision=0, characterSetName='null', collationName='null', columnType='bigint(20) unsigned', columnKey='', extra='', privileges='select,insert,update,references', columnComment='', generationExpression=''}*/
private Long countReadOnly;

/**Column{tableCatalog='def', tableSchema='performance_schema', tableName='events_transactions_summary_by_account_by_event_name', columnName='SUM_TIMER_READ_ONLY', ordinalPosition=15, columnDefault='null', isNullable='NO', dataType='bigint', characterMaximumLength=0, characterOctetLength=0, numericPrecision=20, numericScale=0, datetimePrecision=0, characterSetName='null', collationName='null', columnType='bigint(20) unsigned', columnKey='', extra='', privileges='select,insert,update,references', columnComment='', generationExpression=''}*/
private Long sumTimerReadOnly;

/**Column{tableCatalog='def', tableSchema='performance_schema', tableName='events_transactions_summary_by_account_by_event_name', columnName='MIN_TIMER_READ_ONLY', ordinalPosition=16, columnDefault='null', isNullable='NO', dataType='bigint', characterMaximumLength=0, characterOctetLength=0, numericPrecision=20, numericScale=0, datetimePrecision=0, characterSetName='null', collationName='null', columnType='bigint(20) unsigned', columnKey='', extra='', privileges='select,insert,update,references', columnComment='', generationExpression=''}*/
private Long minTimerReadOnly;

/**Column{tableCatalog='def', tableSchema='performance_schema', tableName='events_transactions_summary_by_account_by_event_name', columnName='AVG_TIMER_READ_ONLY', ordinalPosition=17, columnDefault='null', isNullable='NO', dataType='bigint', characterMaximumLength=0, characterOctetLength=0, numericPrecision=20, numericScale=0, datetimePrecision=0, characterSetName='null', collationName='null', columnType='bigint(20) unsigned', columnKey='', extra='', privileges='select,insert,update,references', columnComment='', generationExpression=''}*/
private Long avgTimerReadOnly;

/**Column{tableCatalog='def', tableSchema='performance_schema', tableName='events_transactions_summary_by_account_by_event_name', columnName='MAX_TIMER_READ_ONLY', ordinalPosition=18, columnDefault='null', isNullable='NO', dataType='bigint', characterMaximumLength=0, characterOctetLength=0, numericPrecision=20, numericScale=0, datetimePrecision=0, characterSetName='null', collationName='null', columnType='bigint(20) unsigned', columnKey='', extra='', privileges='select,insert,update,references', columnComment='', generationExpression=''}*/
private Long maxTimerReadOnly;

public String getUser(){
return user;
}

public String getHost(){
return host;
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

public Long getCountReadWrite(){
return countReadWrite;
}

public Long getSumTimerReadWrite(){
return sumTimerReadWrite;
}

public Long getMinTimerReadWrite(){
return minTimerReadWrite;
}

public Long getAvgTimerReadWrite(){
return avgTimerReadWrite;
}

public Long getMaxTimerReadWrite(){
return maxTimerReadWrite;
}

public Long getCountReadOnly(){
return countReadOnly;
}

public Long getSumTimerReadOnly(){
return sumTimerReadOnly;
}

public Long getMinTimerReadOnly(){
return minTimerReadOnly;
}

public Long getAvgTimerReadOnly(){
return avgTimerReadOnly;
}

public Long getMaxTimerReadOnly(){
return maxTimerReadOnly;
}

}