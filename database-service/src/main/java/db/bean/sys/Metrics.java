package db.bean.sys;


/* SELECT Variable_name AS variableName, Variable_value AS variableValue, Type AS type, Enabled AS enabled FROM sys.metrics */
/**VIEW
*/
public class Metrics{
/**Column{tableCatalog='def', tableSchema='sys', tableName='metrics', columnName='Variable_name', ordinalPosition=1, columnDefault='null', isNullable='YES', dataType='varchar', characterMaximumLength=193, characterOctetLength=579, numericPrecision=0, numericScale=0, datetimePrecision=0, characterSetName='utf8', collationName='utf8_general_ci', columnType='varchar(193)', columnKey='', extra='', privileges='select,insert,update,references', columnComment='', generationExpression=''}*/
private String variableName;

/**Column{tableCatalog='def', tableSchema='sys', tableName='metrics', columnName='Variable_value', ordinalPosition=2, columnDefault='null', isNullable='YES', dataType='text', characterMaximumLength=65535, characterOctetLength=65535, numericPrecision=0, numericScale=0, datetimePrecision=0, characterSetName='utf8', collationName='utf8_general_ci', columnType='text', columnKey='', extra='', privileges='select,insert,update,references', columnComment='', generationExpression=''}*/
private String variableValue;

/**Column{tableCatalog='def', tableSchema='sys', tableName='metrics', columnName='Type', ordinalPosition=3, columnDefault='null', isNullable='YES', dataType='varchar', characterMaximumLength=210, characterOctetLength=630, numericPrecision=0, numericScale=0, datetimePrecision=0, characterSetName='utf8', collationName='utf8_general_ci', columnType='varchar(210)', columnKey='', extra='', privileges='select,insert,update,references', columnComment='', generationExpression=''}*/
private String type;

/**Column{tableCatalog='def', tableSchema='sys', tableName='metrics', columnName='Enabled', ordinalPosition=4, columnDefault='', isNullable='NO', dataType='varchar', characterMaximumLength=7, characterOctetLength=21, numericPrecision=0, numericScale=0, datetimePrecision=0, characterSetName='utf8', collationName='utf8_general_ci', columnType='varchar(7)', columnKey='', extra='', privileges='select,insert,update,references', columnComment='', generationExpression=''}*/
private String enabled;

public String getVariableName(){
return variableName;
}

public String getVariableValue(){
return variableValue;
}

public String getType(){
return type;
}

public String getEnabled(){
return enabled;
}

}