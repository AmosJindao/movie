package db.bean.mysql;

import java.util.Date;

/**
*/
public class ServerCost{
/**Column{tableCatalog='def', tableSchema='mysql', tableName='server_cost', columnName='cost_name', ordinalPosition=1, columnDefault='null', isNullable='NO', dataType='varchar', characterMaximumLength=64, characterOctetLength=192, numericPrecision=0, numericScale=0, datetimePrecision=0, characterSetName='utf8', collationName='utf8_general_ci', columnType='varchar(64)', columnKey='PRI', extra='', privileges='select,insert,update,references', columnComment='', generationExpression=''}*/
private String costName;

/**Column{tableCatalog='def', tableSchema='mysql', tableName='server_cost', columnName='cost_value', ordinalPosition=2, columnDefault='null', isNullable='YES', dataType='float', characterMaximumLength=0, characterOctetLength=0, numericPrecision=12, numericScale=0, datetimePrecision=0, characterSetName='null', collationName='null', columnType='float', columnKey='', extra='', privileges='select,insert,update,references', columnComment='', generationExpression=''}*/
private Float costValue;

/**Column{tableCatalog='def', tableSchema='mysql', tableName='server_cost', columnName='last_update', ordinalPosition=3, columnDefault='CURRENT_TIMESTAMP', isNullable='NO', dataType='timestamp', characterMaximumLength=0, characterOctetLength=0, numericPrecision=0, numericScale=0, datetimePrecision=0, characterSetName='null', collationName='null', columnType='timestamp', columnKey='', extra='on update CURRENT_TIMESTAMP', privileges='select,insert,update,references', columnComment='', generationExpression=''}*/
private Date lastUpdate;

/**Column{tableCatalog='def', tableSchema='mysql', tableName='server_cost', columnName='comment', ordinalPosition=4, columnDefault='null', isNullable='YES', dataType='varchar', characterMaximumLength=1024, characterOctetLength=3072, numericPrecision=0, numericScale=0, datetimePrecision=0, characterSetName='utf8', collationName='utf8_general_ci', columnType='varchar(1024)', columnKey='', extra='', privileges='select,insert,update,references', columnComment='', generationExpression=''}*/
private String comment;

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