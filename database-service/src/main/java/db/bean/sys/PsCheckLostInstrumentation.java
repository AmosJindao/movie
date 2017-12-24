package db.bean.sys;


/* SELECT variable_name AS variableName, variable_value AS variableValue FROM sys.ps_check_lost_instrumentation */
/**VIEW
*/
public class PsCheckLostInstrumentation{
/**Column{tableCatalog='def', tableSchema='sys', tableName='ps_check_lost_instrumentation', columnName='variable_name', ordinalPosition=1, columnDefault='null', isNullable='NO', dataType='varchar', characterMaximumLength=64, characterOctetLength=192, numericPrecision=0, numericScale=0, datetimePrecision=0, characterSetName='utf8', collationName='utf8_general_ci', columnType='varchar(64)', columnKey='', extra='', privileges='select,insert,update,references', columnComment='', generationExpression=''}*/
private String variableName;

/**Column{tableCatalog='def', tableSchema='sys', tableName='ps_check_lost_instrumentation', columnName='variable_value', ordinalPosition=2, columnDefault='null', isNullable='YES', dataType='varchar', characterMaximumLength=1024, characterOctetLength=3072, numericPrecision=0, numericScale=0, datetimePrecision=0, characterSetName='utf8', collationName='utf8_general_ci', columnType='varchar(1024)', columnKey='', extra='', privileges='select,insert,update,references', columnComment='', generationExpression=''}*/
private String variableValue;

public String getVariableName(){
return variableName;
}

public String getVariableValue(){
return variableValue;
}

}