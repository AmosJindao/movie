package db.bean.performance_schema;


/* SELECT VARIABLE_NAME AS variableName, VARIABLE_VALUE AS variableValue FROM performance_schema.global_variables */
/**
*/
public class GlobalVariables{
/**Column{tableCatalog='def', tableSchema='performance_schema', tableName='global_variables', columnName='VARIABLE_NAME', ordinalPosition=1, columnDefault='null', isNullable='NO', dataType='varchar', characterMaximumLength=64, characterOctetLength=192, numericPrecision=0, numericScale=0, datetimePrecision=0, characterSetName='utf8', collationName='utf8_general_ci', columnType='varchar(64)', columnKey='', extra='', privileges='select,insert,update,references', columnComment='', generationExpression=''}*/
private String variableName;

/**Column{tableCatalog='def', tableSchema='performance_schema', tableName='global_variables', columnName='VARIABLE_VALUE', ordinalPosition=2, columnDefault='null', isNullable='YES', dataType='varchar', characterMaximumLength=1024, characterOctetLength=3072, numericPrecision=0, numericScale=0, datetimePrecision=0, characterSetName='utf8', collationName='utf8_general_ci', columnType='varchar(1024)', columnKey='', extra='', privileges='select,insert,update,references', columnComment='', generationExpression=''}*/
private String variableValue;

public String getVariableName(){
return variableName;
}

public String getVariableValue(){
return variableValue;
}

}