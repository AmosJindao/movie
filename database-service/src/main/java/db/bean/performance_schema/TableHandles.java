package db.bean.performance_schema;


/* SELECT OBJECT_TYPE AS objectType, OBJECT_SCHEMA AS objectSchema, OBJECT_NAME AS objectName, OBJECT_INSTANCE_BEGIN AS objectInstanceBegin, OWNER_THREAD_ID AS ownerThreadId, OWNER_EVENT_ID AS ownerEventId, INTERNAL_LOCK AS internalLock, EXTERNAL_LOCK AS externalLock FROM performance_schema.table_handles */
/**
*/
public class TableHandles{
/**Column{tableCatalog='def', tableSchema='performance_schema', tableName='table_handles', columnName='OBJECT_TYPE', ordinalPosition=1, columnDefault='null', isNullable='NO', dataType='varchar', characterMaximumLength=64, characterOctetLength=192, numericPrecision=0, numericScale=0, datetimePrecision=0, characterSetName='utf8', collationName='utf8_general_ci', columnType='varchar(64)', columnKey='', extra='', privileges='select,insert,update,references', columnComment='', generationExpression=''}*/
private String objectType;

/**Column{tableCatalog='def', tableSchema='performance_schema', tableName='table_handles', columnName='OBJECT_SCHEMA', ordinalPosition=2, columnDefault='null', isNullable='NO', dataType='varchar', characterMaximumLength=64, characterOctetLength=192, numericPrecision=0, numericScale=0, datetimePrecision=0, characterSetName='utf8', collationName='utf8_general_ci', columnType='varchar(64)', columnKey='', extra='', privileges='select,insert,update,references', columnComment='', generationExpression=''}*/
private String objectSchema;

/**Column{tableCatalog='def', tableSchema='performance_schema', tableName='table_handles', columnName='OBJECT_NAME', ordinalPosition=3, columnDefault='null', isNullable='NO', dataType='varchar', characterMaximumLength=64, characterOctetLength=192, numericPrecision=0, numericScale=0, datetimePrecision=0, characterSetName='utf8', collationName='utf8_general_ci', columnType='varchar(64)', columnKey='', extra='', privileges='select,insert,update,references', columnComment='', generationExpression=''}*/
private String objectName;

/**Column{tableCatalog='def', tableSchema='performance_schema', tableName='table_handles', columnName='OBJECT_INSTANCE_BEGIN', ordinalPosition=4, columnDefault='null', isNullable='NO', dataType='bigint', characterMaximumLength=0, characterOctetLength=0, numericPrecision=20, numericScale=0, datetimePrecision=0, characterSetName='null', collationName='null', columnType='bigint(20) unsigned', columnKey='', extra='', privileges='select,insert,update,references', columnComment='', generationExpression=''}*/
private Long objectInstanceBegin;

/**Column{tableCatalog='def', tableSchema='performance_schema', tableName='table_handles', columnName='OWNER_THREAD_ID', ordinalPosition=5, columnDefault='null', isNullable='YES', dataType='bigint', characterMaximumLength=0, characterOctetLength=0, numericPrecision=20, numericScale=0, datetimePrecision=0, characterSetName='null', collationName='null', columnType='bigint(20) unsigned', columnKey='', extra='', privileges='select,insert,update,references', columnComment='', generationExpression=''}*/
private Long ownerThreadId;

/**Column{tableCatalog='def', tableSchema='performance_schema', tableName='table_handles', columnName='OWNER_EVENT_ID', ordinalPosition=6, columnDefault='null', isNullable='YES', dataType='bigint', characterMaximumLength=0, characterOctetLength=0, numericPrecision=20, numericScale=0, datetimePrecision=0, characterSetName='null', collationName='null', columnType='bigint(20) unsigned', columnKey='', extra='', privileges='select,insert,update,references', columnComment='', generationExpression=''}*/
private Long ownerEventId;

/**Column{tableCatalog='def', tableSchema='performance_schema', tableName='table_handles', columnName='INTERNAL_LOCK', ordinalPosition=7, columnDefault='null', isNullable='YES', dataType='varchar', characterMaximumLength=64, characterOctetLength=192, numericPrecision=0, numericScale=0, datetimePrecision=0, characterSetName='utf8', collationName='utf8_general_ci', columnType='varchar(64)', columnKey='', extra='', privileges='select,insert,update,references', columnComment='', generationExpression=''}*/
private String internalLock;

/**Column{tableCatalog='def', tableSchema='performance_schema', tableName='table_handles', columnName='EXTERNAL_LOCK', ordinalPosition=8, columnDefault='null', isNullable='YES', dataType='varchar', characterMaximumLength=64, characterOctetLength=192, numericPrecision=0, numericScale=0, datetimePrecision=0, characterSetName='utf8', collationName='utf8_general_ci', columnType='varchar(64)', columnKey='', extra='', privileges='select,insert,update,references', columnComment='', generationExpression=''}*/
private String externalLock;

public String getObjectType(){
return objectType;
}

public String getObjectSchema(){
return objectSchema;
}

public String getObjectName(){
return objectName;
}

public Long getObjectInstanceBegin(){
return objectInstanceBegin;
}

public Long getOwnerThreadId(){
return ownerThreadId;
}

public Long getOwnerEventId(){
return ownerEventId;
}

public String getInternalLock(){
return internalLock;
}

public String getExternalLock(){
return externalLock;
}

}