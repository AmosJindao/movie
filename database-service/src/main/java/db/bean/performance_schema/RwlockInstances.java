package db.bean.performance_schema;


/**
*/
public class RwlockInstances{
/**Column{tableCatalog='def', tableSchema='performance_schema', tableName='rwlock_instances', columnName='NAME', ordinalPosition=1, columnDefault='null', isNullable='NO', dataType='varchar', characterMaximumLength=128, characterOctetLength=384, numericPrecision=0, numericScale=0, datetimePrecision=0, characterSetName='utf8', collationName='utf8_general_ci', columnType='varchar(128)', columnKey='', extra='', privileges='select,insert,update,references', columnComment='', generationExpression=''}*/
private String name;

/**Column{tableCatalog='def', tableSchema='performance_schema', tableName='rwlock_instances', columnName='OBJECT_INSTANCE_BEGIN', ordinalPosition=2, columnDefault='null', isNullable='NO', dataType='bigint', characterMaximumLength=0, characterOctetLength=0, numericPrecision=20, numericScale=0, datetimePrecision=0, characterSetName='null', collationName='null', columnType='bigint(20) unsigned', columnKey='', extra='', privileges='select,insert,update,references', columnComment='', generationExpression=''}*/
private Long objectInstanceBegin;

/**Column{tableCatalog='def', tableSchema='performance_schema', tableName='rwlock_instances', columnName='WRITE_LOCKED_BY_THREAD_ID', ordinalPosition=3, columnDefault='null', isNullable='YES', dataType='bigint', characterMaximumLength=0, characterOctetLength=0, numericPrecision=20, numericScale=0, datetimePrecision=0, characterSetName='null', collationName='null', columnType='bigint(20) unsigned', columnKey='', extra='', privileges='select,insert,update,references', columnComment='', generationExpression=''}*/
private Long writeLockedByThreadId;

/**Column{tableCatalog='def', tableSchema='performance_schema', tableName='rwlock_instances', columnName='READ_LOCKED_BY_COUNT', ordinalPosition=4, columnDefault='null', isNullable='NO', dataType='int', characterMaximumLength=0, characterOctetLength=0, numericPrecision=10, numericScale=0, datetimePrecision=0, characterSetName='null', collationName='null', columnType='int(10) unsigned', columnKey='', extra='', privileges='select,insert,update,references', columnComment='', generationExpression=''}*/
private Integer readLockedByCount;

public String getName(){
return name;
}

public Long getObjectInstanceBegin(){
return objectInstanceBegin;
}

public Long getWriteLockedByThreadId(){
return writeLockedByThreadId;
}

public Integer getReadLockedByCount(){
return readLockedByCount;
}

}