package db.bean.mysql;

import java.util.Date;

/* SELECT Time_zone_id AS timeZoneId, Use_leap_seconds AS useLeapSeconds FROM mysql.time_zone */
/**Time zones
*/
public class TimeZone{
/**Column{tableCatalog='def', tableSchema='mysql', tableName='time_zone', columnName='Time_zone_id', ordinalPosition=1, columnDefault='null', isNullable='NO', dataType='int', characterMaximumLength=0, characterOctetLength=0, numericPrecision=10, numericScale=0, datetimePrecision=0, characterSetName='null', collationName='null', columnType='int(10) unsigned', columnKey='PRI', extra='auto_increment', privileges='select,insert,update,references', columnComment='', generationExpression=''}*/
private Integer timeZoneId;

/**Column{tableCatalog='def', tableSchema='mysql', tableName='time_zone', columnName='Use_leap_seconds', ordinalPosition=2, columnDefault='N', isNullable='NO', dataType='enum', characterMaximumLength=1, characterOctetLength=3, numericPrecision=0, numericScale=0, datetimePrecision=0, characterSetName='utf8', collationName='utf8_general_ci', columnType='enum('Y','N')', columnKey='', extra='', privileges='select,insert,update,references', columnComment='', generationExpression=''}*/
private Date useLeapSeconds;

public Integer getTimeZoneId(){
return timeZoneId;
}

public Date getUseLeapSeconds(){
return useLeapSeconds;
}

}