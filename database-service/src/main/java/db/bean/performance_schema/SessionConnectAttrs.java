package db.bean.performance_schema;


/* SELECT PROCESSLIST_ID AS processlistId, ATTR_NAME AS attrName, ATTR_VALUE AS attrValue, ORDINAL_POSITION AS ordinalPosition FROM performance_schema.session_connect_attrs */
/**
*/
public class SessionConnectAttrs{
/**Column{tableCatalog='def', tableSchema='performance_schema', tableName='session_connect_attrs', columnName='PROCESSLIST_ID', ordinalPosition=1, columnDefault='null', isNullable='NO', dataType='int', characterMaximumLength=0, characterOctetLength=0, numericPrecision=10, numericScale=0, datetimePrecision=0, characterSetName='null', collationName='null', columnType='int(11)', columnKey='', extra='', privileges='select,insert,update,references', columnComment='', generationExpression=''}*/
private Integer processlistId;

/**Column{tableCatalog='def', tableSchema='performance_schema', tableName='session_connect_attrs', columnName='ATTR_NAME', ordinalPosition=2, columnDefault='null', isNullable='NO', dataType='varchar', characterMaximumLength=32, characterOctetLength=96, numericPrecision=0, numericScale=0, datetimePrecision=0, characterSetName='utf8', collationName='utf8_bin', columnType='varchar(32)', columnKey='', extra='', privileges='select,insert,update,references', columnComment='', generationExpression=''}*/
private String attrName;

/**Column{tableCatalog='def', tableSchema='performance_schema', tableName='session_connect_attrs', columnName='ATTR_VALUE', ordinalPosition=3, columnDefault='null', isNullable='YES', dataType='varchar', characterMaximumLength=1024, characterOctetLength=3072, numericPrecision=0, numericScale=0, datetimePrecision=0, characterSetName='utf8', collationName='utf8_bin', columnType='varchar(1024)', columnKey='', extra='', privileges='select,insert,update,references', columnComment='', generationExpression=''}*/
private String attrValue;

/**Column{tableCatalog='def', tableSchema='performance_schema', tableName='session_connect_attrs', columnName='ORDINAL_POSITION', ordinalPosition=4, columnDefault='null', isNullable='YES', dataType='int', characterMaximumLength=0, characterOctetLength=0, numericPrecision=10, numericScale=0, datetimePrecision=0, characterSetName='null', collationName='null', columnType='int(11)', columnKey='', extra='', privileges='select,insert,update,references', columnComment='', generationExpression=''}*/
private Integer ordinalPosition;

public Integer getProcesslistId(){
return processlistId;
}

public String getAttrName(){
return attrName;
}

public String getAttrValue(){
return attrValue;
}

public Integer getOrdinalPosition(){
return ordinalPosition;
}

}