package db.bean.information_schema;


/* SELECT TABLESPACE_NAME AS tablespaceName, ENGINE AS engine, TABLESPACE_TYPE AS tablespaceType, LOGFILE_GROUP_NAME AS logfileGroupName, EXTENT_SIZE AS extentSize, AUTOEXTEND_SIZE AS autoextendSize, MAXIMUM_SIZE AS maximumSize, NODEGROUP_ID AS nodegroupId, TABLESPACE_COMMENT AS tablespaceComment FROM information_schema.TABLESPACES */
/**
*/
public class Tablespaces{
/**Column{tableCatalog='def', tableSchema='information_schema', tableName='TABLESPACES', columnName='TABLESPACE_NAME', ordinalPosition=1, columnDefault='', isNullable='NO', dataType='varchar', characterMaximumLength=64, characterOctetLength=192, numericPrecision=0, numericScale=0, datetimePrecision=0, characterSetName='utf8', collationName='utf8_general_ci', columnType='varchar(64)', columnKey='', extra='', privileges='select', columnComment='', generationExpression=''}*/
private String tablespaceName;

/**Column{tableCatalog='def', tableSchema='information_schema', tableName='TABLESPACES', columnName='ENGINE', ordinalPosition=2, columnDefault='', isNullable='NO', dataType='varchar', characterMaximumLength=64, characterOctetLength=192, numericPrecision=0, numericScale=0, datetimePrecision=0, characterSetName='utf8', collationName='utf8_general_ci', columnType='varchar(64)', columnKey='', extra='', privileges='select', columnComment='', generationExpression=''}*/
private String engine;

/**Column{tableCatalog='def', tableSchema='information_schema', tableName='TABLESPACES', columnName='TABLESPACE_TYPE', ordinalPosition=3, columnDefault='null', isNullable='YES', dataType='varchar', characterMaximumLength=64, characterOctetLength=192, numericPrecision=0, numericScale=0, datetimePrecision=0, characterSetName='utf8', collationName='utf8_general_ci', columnType='varchar(64)', columnKey='', extra='', privileges='select', columnComment='', generationExpression=''}*/
private String tablespaceType;

/**Column{tableCatalog='def', tableSchema='information_schema', tableName='TABLESPACES', columnName='LOGFILE_GROUP_NAME', ordinalPosition=4, columnDefault='null', isNullable='YES', dataType='varchar', characterMaximumLength=64, characterOctetLength=192, numericPrecision=0, numericScale=0, datetimePrecision=0, characterSetName='utf8', collationName='utf8_general_ci', columnType='varchar(64)', columnKey='', extra='', privileges='select', columnComment='', generationExpression=''}*/
private String logfileGroupName;

/**Column{tableCatalog='def', tableSchema='information_schema', tableName='TABLESPACES', columnName='EXTENT_SIZE', ordinalPosition=5, columnDefault='null', isNullable='YES', dataType='bigint', characterMaximumLength=0, characterOctetLength=0, numericPrecision=20, numericScale=0, datetimePrecision=0, characterSetName='null', collationName='null', columnType='bigint(21) unsigned', columnKey='', extra='', privileges='select', columnComment='', generationExpression=''}*/
private Long extentSize;

/**Column{tableCatalog='def', tableSchema='information_schema', tableName='TABLESPACES', columnName='AUTOEXTEND_SIZE', ordinalPosition=6, columnDefault='null', isNullable='YES', dataType='bigint', characterMaximumLength=0, characterOctetLength=0, numericPrecision=20, numericScale=0, datetimePrecision=0, characterSetName='null', collationName='null', columnType='bigint(21) unsigned', columnKey='', extra='', privileges='select', columnComment='', generationExpression=''}*/
private Long autoextendSize;

/**Column{tableCatalog='def', tableSchema='information_schema', tableName='TABLESPACES', columnName='MAXIMUM_SIZE', ordinalPosition=7, columnDefault='null', isNullable='YES', dataType='bigint', characterMaximumLength=0, characterOctetLength=0, numericPrecision=20, numericScale=0, datetimePrecision=0, characterSetName='null', collationName='null', columnType='bigint(21) unsigned', columnKey='', extra='', privileges='select', columnComment='', generationExpression=''}*/
private Long maximumSize;

/**Column{tableCatalog='def', tableSchema='information_schema', tableName='TABLESPACES', columnName='NODEGROUP_ID', ordinalPosition=8, columnDefault='null', isNullable='YES', dataType='bigint', characterMaximumLength=0, characterOctetLength=0, numericPrecision=20, numericScale=0, datetimePrecision=0, characterSetName='null', collationName='null', columnType='bigint(21) unsigned', columnKey='', extra='', privileges='select', columnComment='', generationExpression=''}*/
private Long nodegroupId;

/**Column{tableCatalog='def', tableSchema='information_schema', tableName='TABLESPACES', columnName='TABLESPACE_COMMENT', ordinalPosition=9, columnDefault='null', isNullable='YES', dataType='varchar', characterMaximumLength=2048, characterOctetLength=6144, numericPrecision=0, numericScale=0, datetimePrecision=0, characterSetName='utf8', collationName='utf8_general_ci', columnType='varchar(2048)', columnKey='', extra='', privileges='select', columnComment='', generationExpression=''}*/
private String tablespaceComment;

public String getTablespaceName(){
return tablespaceName;
}

public String getEngine(){
return engine;
}

public String getTablespaceType(){
return tablespaceType;
}

public String getLogfileGroupName(){
return logfileGroupName;
}

public Long getExtentSize(){
return extentSize;
}

public Long getAutoextendSize(){
return autoextendSize;
}

public Long getMaximumSize(){
return maximumSize;
}

public Long getNodegroupId(){
return nodegroupId;
}

public String getTablespaceComment(){
return tablespaceComment;
}

}