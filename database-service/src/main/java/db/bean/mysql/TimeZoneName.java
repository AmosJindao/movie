package db.bean.mysql;


/**Time zone names
*/
public class TimeZoneName{
/**Column{tableCatalog='def', tableSchema='mysql', tableName='time_zone_name', columnName='Name', ordinalPosition=1, columnDefault='null', isNullable='NO', dataType='char', characterMaximumLength=64, characterOctetLength=192, numericPrecision=0, numericScale=0, datetimePrecision=0, characterSetName='utf8', collationName='utf8_general_ci', columnType='char(64)', columnKey='PRI', extra='', privileges='select,insert,update,references', columnComment='', generationExpression=''}*/
private String name;

/**Column{tableCatalog='def', tableSchema='mysql', tableName='time_zone_name', columnName='Time_zone_id', ordinalPosition=2, columnDefault='null', isNullable='NO', dataType='int', characterMaximumLength=0, characterOctetLength=0, numericPrecision=10, numericScale=0, datetimePrecision=0, characterSetName='null', collationName='null', columnType='int(10) unsigned', columnKey='', extra='', privileges='select,insert,update,references', columnComment='', generationExpression=''}*/
private Integer timeZoneId;

public String getName(){
return name;
}

public Integer getTimeZoneId(){
return timeZoneId;
}

}