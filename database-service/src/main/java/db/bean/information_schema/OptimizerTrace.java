package db.bean.information_schema;


/**
*/
public class OptimizerTrace{
/**Column{tableCatalog='def', tableSchema='information_schema', tableName='OPTIMIZER_TRACE', columnName='QUERY', ordinalPosition=1, columnDefault='null', isNullable='NO', dataType='longtext', characterMaximumLength=4294967295, characterOctetLength=4294967295, numericPrecision=0, numericScale=0, datetimePrecision=0, characterSetName='utf8', collationName='utf8_general_ci', columnType='longtext', columnKey='', extra='', privileges='select', columnComment='', generationExpression=''}*/
private String query;

/**Column{tableCatalog='def', tableSchema='information_schema', tableName='OPTIMIZER_TRACE', columnName='TRACE', ordinalPosition=2, columnDefault='null', isNullable='NO', dataType='longtext', characterMaximumLength=4294967295, characterOctetLength=4294967295, numericPrecision=0, numericScale=0, datetimePrecision=0, characterSetName='utf8', collationName='utf8_general_ci', columnType='longtext', columnKey='', extra='', privileges='select', columnComment='', generationExpression=''}*/
private String trace;

/**Column{tableCatalog='def', tableSchema='information_schema', tableName='OPTIMIZER_TRACE', columnName='MISSING_BYTES_BEYOND_MAX_MEM_SIZE', ordinalPosition=3, columnDefault='0', isNullable='NO', dataType='int', characterMaximumLength=0, characterOctetLength=0, numericPrecision=10, numericScale=0, datetimePrecision=0, characterSetName='null', collationName='null', columnType='int(20)', columnKey='', extra='', privileges='select', columnComment='', generationExpression=''}*/
private Integer missingBytesBeyondMaxMemSize;

/**Column{tableCatalog='def', tableSchema='information_schema', tableName='OPTIMIZER_TRACE', columnName='INSUFFICIENT_PRIVILEGES', ordinalPosition=4, columnDefault='0', isNullable='NO', dataType='tinyint', characterMaximumLength=0, characterOctetLength=0, numericPrecision=3, numericScale=0, datetimePrecision=0, characterSetName='null', collationName='null', columnType='tinyint(1)', columnKey='', extra='', privileges='select', columnComment='', generationExpression=''}*/
private Integer insufficientPrivileges;

public String getQuery(){
return query;
}

public String getTrace(){
return trace;
}

public Integer getMissingBytesBeyondMaxMemSize(){
return missingBytesBeyondMaxMemSize;
}

public Integer getInsufficientPrivileges(){
return insufficientPrivileges;
}

}