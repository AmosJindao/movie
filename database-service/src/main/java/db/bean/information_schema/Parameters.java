package db.bean.information_schema;


/* SELECT SPECIFIC_CATALOG AS specificCatalog, SPECIFIC_SCHEMA AS specificSchema, SPECIFIC_NAME AS specificName, ORDINAL_POSITION AS ordinalPosition, PARAMETER_MODE AS parameterMode, PARAMETER_NAME AS parameterName, DATA_TYPE AS dataType, CHARACTER_MAXIMUM_LENGTH AS characterMaximumLength, CHARACTER_OCTET_LENGTH AS characterOctetLength, NUMERIC_PRECISION AS numericPrecision, NUMERIC_SCALE AS numericScale, DATETIME_PRECISION AS datetimePrecision, CHARACTER_SET_NAME AS characterSetName, COLLATION_NAME AS collationName, DTD_IDENTIFIER AS dtdIdentifier, ROUTINE_TYPE AS routineType FROM information_schema.PARAMETERS */
/**
*/
public class Parameters{
/**Column{tableCatalog='def', tableSchema='information_schema', tableName='PARAMETERS', columnName='SPECIFIC_CATALOG', ordinalPosition=1, columnDefault='', isNullable='NO', dataType='varchar', characterMaximumLength=512, characterOctetLength=1536, numericPrecision=0, numericScale=0, datetimePrecision=0, characterSetName='utf8', collationName='utf8_general_ci', columnType='varchar(512)', columnKey='', extra='', privileges='select', columnComment='', generationExpression=''}*/
private String specificCatalog;

/**Column{tableCatalog='def', tableSchema='information_schema', tableName='PARAMETERS', columnName='SPECIFIC_SCHEMA', ordinalPosition=2, columnDefault='', isNullable='NO', dataType='varchar', characterMaximumLength=64, characterOctetLength=192, numericPrecision=0, numericScale=0, datetimePrecision=0, characterSetName='utf8', collationName='utf8_general_ci', columnType='varchar(64)', columnKey='', extra='', privileges='select', columnComment='', generationExpression=''}*/
private String specificSchema;

/**Column{tableCatalog='def', tableSchema='information_schema', tableName='PARAMETERS', columnName='SPECIFIC_NAME', ordinalPosition=3, columnDefault='', isNullable='NO', dataType='varchar', characterMaximumLength=64, characterOctetLength=192, numericPrecision=0, numericScale=0, datetimePrecision=0, characterSetName='utf8', collationName='utf8_general_ci', columnType='varchar(64)', columnKey='', extra='', privileges='select', columnComment='', generationExpression=''}*/
private String specificName;

/**Column{tableCatalog='def', tableSchema='information_schema', tableName='PARAMETERS', columnName='ORDINAL_POSITION', ordinalPosition=4, columnDefault='0', isNullable='NO', dataType='int', characterMaximumLength=0, characterOctetLength=0, numericPrecision=10, numericScale=0, datetimePrecision=0, characterSetName='null', collationName='null', columnType='int(21)', columnKey='', extra='', privileges='select', columnComment='', generationExpression=''}*/
private Integer ordinalPosition;

/**Column{tableCatalog='def', tableSchema='information_schema', tableName='PARAMETERS', columnName='PARAMETER_MODE', ordinalPosition=5, columnDefault='null', isNullable='YES', dataType='varchar', characterMaximumLength=5, characterOctetLength=15, numericPrecision=0, numericScale=0, datetimePrecision=0, characterSetName='utf8', collationName='utf8_general_ci', columnType='varchar(5)', columnKey='', extra='', privileges='select', columnComment='', generationExpression=''}*/
private String parameterMode;

/**Column{tableCatalog='def', tableSchema='information_schema', tableName='PARAMETERS', columnName='PARAMETER_NAME', ordinalPosition=6, columnDefault='null', isNullable='YES', dataType='varchar', characterMaximumLength=64, characterOctetLength=192, numericPrecision=0, numericScale=0, datetimePrecision=0, characterSetName='utf8', collationName='utf8_general_ci', columnType='varchar(64)', columnKey='', extra='', privileges='select', columnComment='', generationExpression=''}*/
private String parameterName;

/**Column{tableCatalog='def', tableSchema='information_schema', tableName='PARAMETERS', columnName='DATA_TYPE', ordinalPosition=7, columnDefault='', isNullable='NO', dataType='varchar', characterMaximumLength=64, characterOctetLength=192, numericPrecision=0, numericScale=0, datetimePrecision=0, characterSetName='utf8', collationName='utf8_general_ci', columnType='varchar(64)', columnKey='', extra='', privileges='select', columnComment='', generationExpression=''}*/
private String dataType;

/**Column{tableCatalog='def', tableSchema='information_schema', tableName='PARAMETERS', columnName='CHARACTER_MAXIMUM_LENGTH', ordinalPosition=8, columnDefault='null', isNullable='YES', dataType='int', characterMaximumLength=0, characterOctetLength=0, numericPrecision=10, numericScale=0, datetimePrecision=0, characterSetName='null', collationName='null', columnType='int(21)', columnKey='', extra='', privileges='select', columnComment='', generationExpression=''}*/
private Integer characterMaximumLength;

/**Column{tableCatalog='def', tableSchema='information_schema', tableName='PARAMETERS', columnName='CHARACTER_OCTET_LENGTH', ordinalPosition=9, columnDefault='null', isNullable='YES', dataType='int', characterMaximumLength=0, characterOctetLength=0, numericPrecision=10, numericScale=0, datetimePrecision=0, characterSetName='null', collationName='null', columnType='int(21)', columnKey='', extra='', privileges='select', columnComment='', generationExpression=''}*/
private Integer characterOctetLength;

/**Column{tableCatalog='def', tableSchema='information_schema', tableName='PARAMETERS', columnName='NUMERIC_PRECISION', ordinalPosition=10, columnDefault='null', isNullable='YES', dataType='bigint', characterMaximumLength=0, characterOctetLength=0, numericPrecision=20, numericScale=0, datetimePrecision=0, characterSetName='null', collationName='null', columnType='bigint(21) unsigned', columnKey='', extra='', privileges='select', columnComment='', generationExpression=''}*/
private Long numericPrecision;

/**Column{tableCatalog='def', tableSchema='information_schema', tableName='PARAMETERS', columnName='NUMERIC_SCALE', ordinalPosition=11, columnDefault='null', isNullable='YES', dataType='int', characterMaximumLength=0, characterOctetLength=0, numericPrecision=10, numericScale=0, datetimePrecision=0, characterSetName='null', collationName='null', columnType='int(21)', columnKey='', extra='', privileges='select', columnComment='', generationExpression=''}*/
private Integer numericScale;

/**Column{tableCatalog='def', tableSchema='information_schema', tableName='PARAMETERS', columnName='DATETIME_PRECISION', ordinalPosition=12, columnDefault='null', isNullable='YES', dataType='bigint', characterMaximumLength=0, characterOctetLength=0, numericPrecision=20, numericScale=0, datetimePrecision=0, characterSetName='null', collationName='null', columnType='bigint(21) unsigned', columnKey='', extra='', privileges='select', columnComment='', generationExpression=''}*/
private Long datetimePrecision;

/**Column{tableCatalog='def', tableSchema='information_schema', tableName='PARAMETERS', columnName='CHARACTER_SET_NAME', ordinalPosition=13, columnDefault='null', isNullable='YES', dataType='varchar', characterMaximumLength=64, characterOctetLength=192, numericPrecision=0, numericScale=0, datetimePrecision=0, characterSetName='utf8', collationName='utf8_general_ci', columnType='varchar(64)', columnKey='', extra='', privileges='select', columnComment='', generationExpression=''}*/
private String characterSetName;

/**Column{tableCatalog='def', tableSchema='information_schema', tableName='PARAMETERS', columnName='COLLATION_NAME', ordinalPosition=14, columnDefault='null', isNullable='YES', dataType='varchar', characterMaximumLength=64, characterOctetLength=192, numericPrecision=0, numericScale=0, datetimePrecision=0, characterSetName='utf8', collationName='utf8_general_ci', columnType='varchar(64)', columnKey='', extra='', privileges='select', columnComment='', generationExpression=''}*/
private String collationName;

/**Column{tableCatalog='def', tableSchema='information_schema', tableName='PARAMETERS', columnName='DTD_IDENTIFIER', ordinalPosition=15, columnDefault='null', isNullable='NO', dataType='longtext', characterMaximumLength=4294967295, characterOctetLength=4294967295, numericPrecision=0, numericScale=0, datetimePrecision=0, characterSetName='utf8', collationName='utf8_general_ci', columnType='longtext', columnKey='', extra='', privileges='select', columnComment='', generationExpression=''}*/
private String dtdIdentifier;

/**Column{tableCatalog='def', tableSchema='information_schema', tableName='PARAMETERS', columnName='ROUTINE_TYPE', ordinalPosition=16, columnDefault='', isNullable='NO', dataType='varchar', characterMaximumLength=9, characterOctetLength=27, numericPrecision=0, numericScale=0, datetimePrecision=0, characterSetName='utf8', collationName='utf8_general_ci', columnType='varchar(9)', columnKey='', extra='', privileges='select', columnComment='', generationExpression=''}*/
private String routineType;

public String getSpecificCatalog(){
return specificCatalog;
}

public String getSpecificSchema(){
return specificSchema;
}

public String getSpecificName(){
return specificName;
}

public Integer getOrdinalPosition(){
return ordinalPosition;
}

public String getParameterMode(){
return parameterMode;
}

public String getParameterName(){
return parameterName;
}

public String getDataType(){
return dataType;
}

public Integer getCharacterMaximumLength(){
return characterMaximumLength;
}

public Integer getCharacterOctetLength(){
return characterOctetLength;
}

public Long getNumericPrecision(){
return numericPrecision;
}

public Integer getNumericScale(){
return numericScale;
}

public Long getDatetimePrecision(){
return datetimePrecision;
}

public String getCharacterSetName(){
return characterSetName;
}

public String getCollationName(){
return collationName;
}

public String getDtdIdentifier(){
return dtdIdentifier;
}

public String getRoutineType(){
return routineType;
}

}