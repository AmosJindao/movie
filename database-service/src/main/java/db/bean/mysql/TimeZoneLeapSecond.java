package db.bean.mysql;


/**Leap seconds information for time zones
*/
public class TimeZoneLeapSecond{
/**Column{tableCatalog='def', tableSchema='mysql', tableName='time_zone_leap_second', columnName='Transition_time', ordinalPosition=1, columnDefault='null', isNullable='NO', dataType='bigint', characterMaximumLength=0, characterOctetLength=0, numericPrecision=19, numericScale=0, datetimePrecision=0, characterSetName='null', collationName='null', columnType='bigint(20)', columnKey='PRI', extra='', privileges='select,insert,update,references', columnComment='', generationExpression=''}*/
private Long transitionTime;

/**Column{tableCatalog='def', tableSchema='mysql', tableName='time_zone_leap_second', columnName='Correction', ordinalPosition=2, columnDefault='null', isNullable='NO', dataType='int', characterMaximumLength=0, characterOctetLength=0, numericPrecision=10, numericScale=0, datetimePrecision=0, characterSetName='null', collationName='null', columnType='int(11)', columnKey='', extra='', privileges='select,insert,update,references', columnComment='', generationExpression=''}*/
private Integer correction;

public Long getTransitionTime(){
return transitionTime;
}

public Integer getCorrection(){
return correction;
}

}