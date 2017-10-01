package db.bean.performance_schema;


/**
*/
public class CondInstances{
/**Column{tableCatalog='def', tableSchema='performance_schema', tableName='cond_instances', columnName='NAME', ordinalPosition=1, columnDefault='null', isNullable='NO', dataType='varchar', characterMaximumLength=128, characterOctetLength=384, numericPrecision=0, numericScale=0, datetimePrecision=0, characterSetName='utf8', collationName='utf8_general_ci', columnType='varchar(128)', columnKey='', extra='', privileges='select,insert,update,references', columnComment='', generationExpression=''}*/
private String name;

/**Column{tableCatalog='def', tableSchema='performance_schema', tableName='cond_instances', columnName='OBJECT_INSTANCE_BEGIN', ordinalPosition=2, columnDefault='null', isNullable='NO', dataType='bigint', characterMaximumLength=0, characterOctetLength=0, numericPrecision=20, numericScale=0, datetimePrecision=0, characterSetName='null', collationName='null', columnType='bigint(20) unsigned', columnKey='', extra='', privileges='select,insert,update,references', columnComment='', generationExpression=''}*/
private Long objectInstanceBegin;

public String getName(){
return name;
}

public Long getObjectInstanceBegin(){
return objectInstanceBegin;
}

}