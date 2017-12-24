package db.bean.performance_schema;


/* SELECT NAME AS name, OBJECT_INSTANCE_BEGIN AS objectInstanceBegin, LOCKED_BY_THREAD_ID AS lockedByThreadId FROM performance_schema.mutex_instances */
/**
*/
public class MutexInstances{
/**Column{tableCatalog='def', tableSchema='performance_schema', tableName='mutex_instances', columnName='NAME', ordinalPosition=1, columnDefault='null', isNullable='NO', dataType='varchar', characterMaximumLength=128, characterOctetLength=384, numericPrecision=0, numericScale=0, datetimePrecision=0, characterSetName='utf8', collationName='utf8_general_ci', columnType='varchar(128)', columnKey='', extra='', privileges='select,insert,update,references', columnComment='', generationExpression=''}*/
private String name;

/**Column{tableCatalog='def', tableSchema='performance_schema', tableName='mutex_instances', columnName='OBJECT_INSTANCE_BEGIN', ordinalPosition=2, columnDefault='null', isNullable='NO', dataType='bigint', characterMaximumLength=0, characterOctetLength=0, numericPrecision=20, numericScale=0, datetimePrecision=0, characterSetName='null', collationName='null', columnType='bigint(20) unsigned', columnKey='', extra='', privileges='select,insert,update,references', columnComment='', generationExpression=''}*/
private Long objectInstanceBegin;

/**Column{tableCatalog='def', tableSchema='performance_schema', tableName='mutex_instances', columnName='LOCKED_BY_THREAD_ID', ordinalPosition=3, columnDefault='null', isNullable='YES', dataType='bigint', characterMaximumLength=0, characterOctetLength=0, numericPrecision=20, numericScale=0, datetimePrecision=0, characterSetName='null', collationName='null', columnType='bigint(20) unsigned', columnKey='', extra='', privileges='select,insert,update,references', columnComment='', generationExpression=''}*/
private Long lockedByThreadId;

public String getName(){
return name;
}

public Long getObjectInstanceBegin(){
return objectInstanceBegin;
}

public Long getLockedByThreadId(){
return lockedByThreadId;
}

}