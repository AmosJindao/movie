package db.bean.mysql;

import java.util.Date;

/* SELECT engine_name AS engineName, device_type AS deviceType, cost_name AS costName, cost_value AS costValue, last_update AS lastUpdate, comment AS comment FROM mysql.engine_cost */
/**
*/
public class EngineCost{
/**Column{tableCatalog='def', tableSchema='mysql', tableName='engine_cost', columnName='engine_name', ordinalPosition=1, columnDefault='null', isNullable='NO', dataType='varchar', characterMaximumLength=64, characterOctetLength=192, numericPrecision=0, numericScale=0, datetimePrecision=0, characterSetName='utf8', collationName='utf8_general_ci', columnType='varchar(64)', columnKey='PRI', extra='', privileges='select,insert,update,references', columnComment='', generationExpression=''}*/
private String engineName;

/**Column{tableCatalog='def', tableSchema='mysql', tableName='engine_cost', columnName='device_type', ordinalPosition=2, columnDefault='null', isNullable='NO', dataType='int', characterMaximumLength=0, characterOctetLength=0, numericPrecision=10, numericScale=0, datetimePrecision=0, characterSetName='null', collationName='null', columnType='int(11)', columnKey='PRI', extra='', privileges='select,insert,update,references', columnComment='', generationExpression=''}*/
private Integer deviceType;

/**Column{tableCatalog='def', tableSchema='mysql', tableName='engine_cost', columnName='cost_name', ordinalPosition=3, columnDefault='null', isNullable='NO', dataType='varchar', characterMaximumLength=64, characterOctetLength=192, numericPrecision=0, numericScale=0, datetimePrecision=0, characterSetName='utf8', collationName='utf8_general_ci', columnType='varchar(64)', columnKey='PRI', extra='', privileges='select,insert,update,references', columnComment='', generationExpression=''}*/
private String costName;

/**Column{tableCatalog='def', tableSchema='mysql', tableName='engine_cost', columnName='cost_value', ordinalPosition=4, columnDefault='null', isNullable='YES', dataType='float', characterMaximumLength=0, characterOctetLength=0, numericPrecision=12, numericScale=0, datetimePrecision=0, characterSetName='null', collationName='null', columnType='float', columnKey='', extra='', privileges='select,insert,update,references', columnComment='', generationExpression=''}*/
private Float costValue;

/**Column{tableCatalog='def', tableSchema='mysql', tableName='engine_cost', columnName='last_update', ordinalPosition=5, columnDefault='CURRENT_TIMESTAMP', isNullable='NO', dataType='timestamp', characterMaximumLength=0, characterOctetLength=0, numericPrecision=0, numericScale=0, datetimePrecision=0, characterSetName='null', collationName='null', columnType='timestamp', columnKey='', extra='on update CURRENT_TIMESTAMP', privileges='select,insert,update,references', columnComment='', generationExpression=''}*/
private Date lastUpdate;

/**Column{tableCatalog='def', tableSchema='mysql', tableName='engine_cost', columnName='comment', ordinalPosition=6, columnDefault='null', isNullable='YES', dataType='varchar', characterMaximumLength=1024, characterOctetLength=3072, numericPrecision=0, numericScale=0, datetimePrecision=0, characterSetName='utf8', collationName='utf8_general_ci', columnType='varchar(1024)', columnKey='', extra='', privileges='select,insert,update,references', columnComment='', generationExpression=''}*/
private String comment;

public String getEngineName(){
return engineName;
}

public Integer getDeviceType(){
return deviceType;
}

public String getCostName(){
return costName;
}

public Float getCostValue(){
return costValue;
}

public Date getLastUpdate(){
return lastUpdate;
}

public String getComment(){
return comment;
}

}