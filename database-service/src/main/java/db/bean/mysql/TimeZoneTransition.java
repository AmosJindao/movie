package db.bean.mysql;


/* SELECT Time_zone_id AS timeZoneId, Transition_time AS transitionTime, Transition_type_id AS transitionTypeId FROM mysql.time_zone_transition */
/**Time zone transitions
*/
public class TimeZoneTransition{
/**Column{tableCatalog='def', tableSchema='mysql', tableName='time_zone_transition', columnName='Time_zone_id', ordinalPosition=1, columnDefault='null', isNullable='NO', dataType='int', characterMaximumLength=0, characterOctetLength=0, numericPrecision=10, numericScale=0, datetimePrecision=0, characterSetName='null', collationName='null', columnType='int(10) unsigned', columnKey='PRI', extra='', privileges='select,insert,update,references', columnComment='', generationExpression=''}*/
private Integer timeZoneId;

/**Column{tableCatalog='def', tableSchema='mysql', tableName='time_zone_transition', columnName='Transition_time', ordinalPosition=2, columnDefault='null', isNullable='NO', dataType='bigint', characterMaximumLength=0, characterOctetLength=0, numericPrecision=19, numericScale=0, datetimePrecision=0, characterSetName='null', collationName='null', columnType='bigint(20)', columnKey='PRI', extra='', privileges='select,insert,update,references', columnComment='', generationExpression=''}*/
private Long transitionTime;

/**Column{tableCatalog='def', tableSchema='mysql', tableName='time_zone_transition', columnName='Transition_type_id', ordinalPosition=3, columnDefault='null', isNullable='NO', dataType='int', characterMaximumLength=0, characterOctetLength=0, numericPrecision=10, numericScale=0, datetimePrecision=0, characterSetName='null', collationName='null', columnType='int(10) unsigned', columnKey='', extra='', privileges='select,insert,update,references', columnComment='', generationExpression=''}*/
private Integer transitionTypeId;

public Integer getTimeZoneId(){
return timeZoneId;
}

public Long getTransitionTime(){
return transitionTime;
}

public Integer getTransitionTypeId(){
return transitionTypeId;
}

}