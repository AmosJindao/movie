package db.bean.performance_schema;

import java.util.Date;

/* SELECT NAME AS name, TIMER_NAME AS timerName FROM performance_schema.setup_timers */
/**
*/
public class SetupTimers{
/**Column{tableCatalog='def', tableSchema='performance_schema', tableName='setup_timers', columnName='NAME', ordinalPosition=1, columnDefault='null', isNullable='NO', dataType='varchar', characterMaximumLength=64, characterOctetLength=192, numericPrecision=0, numericScale=0, datetimePrecision=0, characterSetName='utf8', collationName='utf8_general_ci', columnType='varchar(64)', columnKey='', extra='', privileges='select,insert,update,references', columnComment='', generationExpression=''}*/
private String name;

/**Column{tableCatalog='def', tableSchema='performance_schema', tableName='setup_timers', columnName='TIMER_NAME', ordinalPosition=2, columnDefault='null', isNullable='NO', dataType='enum', characterMaximumLength=11, characterOctetLength=33, numericPrecision=0, numericScale=0, datetimePrecision=0, characterSetName='utf8', collationName='utf8_general_ci', columnType='enum('CYCLE','NANOSECOND','MICROSECOND','MILLISECOND','TICK')', columnKey='', extra='', privileges='select,insert,update,references', columnComment='', generationExpression=''}*/
private Date timerName;

public String getName(){
return name;
}

public Date getTimerName(){
return timerName;
}

}