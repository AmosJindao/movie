package db.bean.performance_schema;


/* SELECT THREAD_ID AS threadId, VARIABLE_NAME AS variableName, VARIABLE_VALUE AS variableValue FROM performance_schema.status_by_thread */
/**
*/
public class StatusByThread{
/**Column{tableCatalog='def', tableSchema='performance_schema', tableName='status_by_thread', columnName='THREAD_ID', ordinalPosition=1, columnDefault='null', isNullable='NO', dataType='bigint', characterMaximumLength=0, characterOctetLength=0, numericPrecision=20, numericScale=0, datetimePrecision=0, characterSetName='null', collationName='null', columnType='bigint(20) unsigned', columnKey='', extra='', privileges='select,insert,update,references', columnComment='', generationExpression=''}*/
private Long threadId;

/**Column{tableCatalog='def', tableSchema='performance_schema', tableName='status_by_thread', columnName='VARIABLE_NAME', ordinalPosition=2, columnDefault='null', isNullable='NO', dataType='varchar', characterMaximumLength=64, characterOctetLength=192, numericPrecision=0, numericScale=0, datetimePrecision=0, characterSetName='utf8', collationName='utf8_general_ci', columnType='varchar(64)', columnKey='', extra='', privileges='select,insert,update,references', columnComment='', generationExpression=''}*/
private String variableName;

/**Column{tableCatalog='def', tableSchema='performance_schema', tableName='status_by_thread', columnName='VARIABLE_VALUE', ordinalPosition=3, columnDefault='null', isNullable='YES', dataType='varchar', characterMaximumLength=1024, characterOctetLength=3072, numericPrecision=0, numericScale=0, datetimePrecision=0, characterSetName='utf8', collationName='utf8_general_ci', columnType='varchar(1024)', columnKey='', extra='', privileges='select,insert,update,references', columnComment='', generationExpression=''}*/
private String variableValue;

public Long getThreadId(){
return threadId;
}

public String getVariableName(){
return variableName;
}

public String getVariableValue(){
return variableValue;
}

}