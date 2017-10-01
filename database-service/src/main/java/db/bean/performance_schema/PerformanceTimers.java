package db.bean.performance_schema;

import java.util.Date;

/**
*/
public class PerformanceTimers{
/**Column{tableCatalog='def', tableSchema='performance_schema', tableName='performance_timers', columnName='TIMER_NAME', ordinalPosition=1, columnDefault='null', isNullable='NO', dataType='enum', characterMaximumLength=11, characterOctetLength=33, numericPrecision=0, numericScale=0, datetimePrecision=0, characterSetName='utf8', collationName='utf8_general_ci', columnType='enum('CYCLE','NANOSECOND','MICROSECOND','MILLISECOND','TICK')', columnKey='', extra='', privileges='select,insert,update,references', columnComment='', generationExpression=''}*/
private Date timerName;

/**Column{tableCatalog='def', tableSchema='performance_schema', tableName='performance_timers', columnName='TIMER_FREQUENCY', ordinalPosition=2, columnDefault='null', isNullable='YES', dataType='bigint', characterMaximumLength=0, characterOctetLength=0, numericPrecision=19, numericScale=0, datetimePrecision=0, characterSetName='null', collationName='null', columnType='bigint(20)', columnKey='', extra='', privileges='select,insert,update,references', columnComment='', generationExpression=''}*/
private Long timerFrequency;

/**Column{tableCatalog='def', tableSchema='performance_schema', tableName='performance_timers', columnName='TIMER_RESOLUTION', ordinalPosition=3, columnDefault='null', isNullable='YES', dataType='bigint', characterMaximumLength=0, characterOctetLength=0, numericPrecision=19, numericScale=0, datetimePrecision=0, characterSetName='null', collationName='null', columnType='bigint(20)', columnKey='', extra='', privileges='select,insert,update,references', columnComment='', generationExpression=''}*/
private Long timerResolution;

/**Column{tableCatalog='def', tableSchema='performance_schema', tableName='performance_timers', columnName='TIMER_OVERHEAD', ordinalPosition=4, columnDefault='null', isNullable='YES', dataType='bigint', characterMaximumLength=0, characterOctetLength=0, numericPrecision=19, numericScale=0, datetimePrecision=0, characterSetName='null', collationName='null', columnType='bigint(20)', columnKey='', extra='', privileges='select,insert,update,references', columnComment='', generationExpression=''}*/
private Long timerOverhead;

public Date getTimerName(){
return timerName;
}

public Long getTimerFrequency(){
return timerFrequency;
}

public Long getTimerResolution(){
return timerResolution;
}

public Long getTimerOverhead(){
return timerOverhead;
}

}