package db.bean.mysql;


/* SELECT Time_zone_id AS timeZoneId, Transition_type_id AS transitionTypeId, Offset AS offset, Is_DST AS isDst, Abbreviation AS abbreviation FROM mysql.time_zone_transition_type */
/**Time zone transition types
*/
public class TimeZoneTransitionType{
/**Column{tableCatalog='def', tableSchema='mysql', tableName='time_zone_transition_type', columnName='Time_zone_id', ordinalPosition=1, columnDefault='null', isNullable='NO', dataType='int', characterMaximumLength=0, characterOctetLength=0, numericPrecision=10, numericScale=0, datetimePrecision=0, characterSetName='null', collationName='null', columnType='int(10) unsigned', columnKey='PRI', extra='', privileges='select,insert,update,references', columnComment='', generationExpression=''}*/
private Integer timeZoneId;

/**Column{tableCatalog='def', tableSchema='mysql', tableName='time_zone_transition_type', columnName='Transition_type_id', ordinalPosition=2, columnDefault='null', isNullable='NO', dataType='int', characterMaximumLength=0, characterOctetLength=0, numericPrecision=10, numericScale=0, datetimePrecision=0, characterSetName='null', collationName='null', columnType='int(10) unsigned', columnKey='PRI', extra='', privileges='select,insert,update,references', columnComment='', generationExpression=''}*/
private Integer transitionTypeId;

/**Column{tableCatalog='def', tableSchema='mysql', tableName='time_zone_transition_type', columnName='Offset', ordinalPosition=3, columnDefault='0', isNullable='NO', dataType='int', characterMaximumLength=0, characterOctetLength=0, numericPrecision=10, numericScale=0, datetimePrecision=0, characterSetName='null', collationName='null', columnType='int(11)', columnKey='', extra='', privileges='select,insert,update,references', columnComment='', generationExpression=''}*/
private Integer offset;

/**Column{tableCatalog='def', tableSchema='mysql', tableName='time_zone_transition_type', columnName='Is_DST', ordinalPosition=4, columnDefault='0', isNullable='NO', dataType='tinyint', characterMaximumLength=0, characterOctetLength=0, numericPrecision=3, numericScale=0, datetimePrecision=0, characterSetName='null', collationName='null', columnType='tinyint(3) unsigned', columnKey='', extra='', privileges='select,insert,update,references', columnComment='', generationExpression=''}*/
private Integer isDst;

/**Column{tableCatalog='def', tableSchema='mysql', tableName='time_zone_transition_type', columnName='Abbreviation', ordinalPosition=5, columnDefault='', isNullable='NO', dataType='char', characterMaximumLength=8, characterOctetLength=24, numericPrecision=0, numericScale=0, datetimePrecision=0, characterSetName='utf8', collationName='utf8_general_ci', columnType='char(8)', columnKey='', extra='', privileges='select,insert,update,references', columnComment='', generationExpression=''}*/
private String abbreviation;

public Integer getTimeZoneId(){
return timeZoneId;
}

public Integer getTransitionTypeId(){
return transitionTypeId;
}

public Integer getOffset(){
return offset;
}

public Integer getIsDst(){
return isDst;
}

public String getAbbreviation(){
return abbreviation;
}

}