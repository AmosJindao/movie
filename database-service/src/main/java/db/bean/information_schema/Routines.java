package db.bean.information_schema;

import java.util.Date;

/**
*/
public class Routines{
/**Column{tableCatalog='def', tableSchema='information_schema', tableName='ROUTINES', columnName='SPECIFIC_NAME', ordinalPosition=1, columnDefault='', isNullable='NO', dataType='varchar', characterMaximumLength=64, characterOctetLength=192, numericPrecision=0, numericScale=0, datetimePrecision=0, characterSetName='utf8', collationName='utf8_general_ci', columnType='varchar(64)', columnKey='', extra='', privileges='select', columnComment='', generationExpression=''}*/
private String specificName;

/**Column{tableCatalog='def', tableSchema='information_schema', tableName='ROUTINES', columnName='ROUTINE_CATALOG', ordinalPosition=2, columnDefault='', isNullable='NO', dataType='varchar', characterMaximumLength=512, characterOctetLength=1536, numericPrecision=0, numericScale=0, datetimePrecision=0, characterSetName='utf8', collationName='utf8_general_ci', columnType='varchar(512)', columnKey='', extra='', privileges='select', columnComment='', generationExpression=''}*/
private String routineCatalog;

/**Column{tableCatalog='def', tableSchema='information_schema', tableName='ROUTINES', columnName='ROUTINE_SCHEMA', ordinalPosition=3, columnDefault='', isNullable='NO', dataType='varchar', characterMaximumLength=64, characterOctetLength=192, numericPrecision=0, numericScale=0, datetimePrecision=0, characterSetName='utf8', collationName='utf8_general_ci', columnType='varchar(64)', columnKey='', extra='', privileges='select', columnComment='', generationExpression=''}*/
private String routineSchema;

/**Column{tableCatalog='def', tableSchema='information_schema', tableName='ROUTINES', columnName='ROUTINE_NAME', ordinalPosition=4, columnDefault='', isNullable='NO', dataType='varchar', characterMaximumLength=64, characterOctetLength=192, numericPrecision=0, numericScale=0, datetimePrecision=0, characterSetName='utf8', collationName='utf8_general_ci', columnType='varchar(64)', columnKey='', extra='', privileges='select', columnComment='', generationExpression=''}*/
private String routineName;

/**Column{tableCatalog='def', tableSchema='information_schema', tableName='ROUTINES', columnName='ROUTINE_TYPE', ordinalPosition=5, columnDefault='', isNullable='NO', dataType='varchar', characterMaximumLength=9, characterOctetLength=27, numericPrecision=0, numericScale=0, datetimePrecision=0, characterSetName='utf8', collationName='utf8_general_ci', columnType='varchar(9)', columnKey='', extra='', privileges='select', columnComment='', generationExpression=''}*/
private String routineType;

/**Column{tableCatalog='def', tableSchema='information_schema', tableName='ROUTINES', columnName='DATA_TYPE', ordinalPosition=6, columnDefault='', isNullable='NO', dataType='varchar', characterMaximumLength=64, characterOctetLength=192, numericPrecision=0, numericScale=0, datetimePrecision=0, characterSetName='utf8', collationName='utf8_general_ci', columnType='varchar(64)', columnKey='', extra='', privileges='select', columnComment='', generationExpression=''}*/
private String dataType;

/**Column{tableCatalog='def', tableSchema='information_schema', tableName='ROUTINES', columnName='CHARACTER_MAXIMUM_LENGTH', ordinalPosition=7, columnDefault='null', isNullable='YES', dataType='int', characterMaximumLength=0, characterOctetLength=0, numericPrecision=10, numericScale=0, datetimePrecision=0, characterSetName='null', collationName='null', columnType='int(21)', columnKey='', extra='', privileges='select', columnComment='', generationExpression=''}*/
private Integer characterMaximumLength;

/**Column{tableCatalog='def', tableSchema='information_schema', tableName='ROUTINES', columnName='CHARACTER_OCTET_LENGTH', ordinalPosition=8, columnDefault='null', isNullable='YES', dataType='int', characterMaximumLength=0, characterOctetLength=0, numericPrecision=10, numericScale=0, datetimePrecision=0, characterSetName='null', collationName='null', columnType='int(21)', columnKey='', extra='', privileges='select', columnComment='', generationExpression=''}*/
private Integer characterOctetLength;

/**Column{tableCatalog='def', tableSchema='information_schema', tableName='ROUTINES', columnName='NUMERIC_PRECISION', ordinalPosition=9, columnDefault='null', isNullable='YES', dataType='bigint', characterMaximumLength=0, characterOctetLength=0, numericPrecision=20, numericScale=0, datetimePrecision=0, characterSetName='null', collationName='null', columnType='bigint(21) unsigned', columnKey='', extra='', privileges='select', columnComment='', generationExpression=''}*/
private Long numericPrecision;

/**Column{tableCatalog='def', tableSchema='information_schema', tableName='ROUTINES', columnName='NUMERIC_SCALE', ordinalPosition=10, columnDefault='null', isNullable='YES', dataType='int', characterMaximumLength=0, characterOctetLength=0, numericPrecision=10, numericScale=0, datetimePrecision=0, characterSetName='null', collationName='null', columnType='int(21)', columnKey='', extra='', privileges='select', columnComment='', generationExpression=''}*/
private Integer numericScale;

/**Column{tableCatalog='def', tableSchema='information_schema', tableName='ROUTINES', columnName='DATETIME_PRECISION', ordinalPosition=11, columnDefault='null', isNullable='YES', dataType='bigint', characterMaximumLength=0, characterOctetLength=0, numericPrecision=20, numericScale=0, datetimePrecision=0, characterSetName='null', collationName='null', columnType='bigint(21) unsigned', columnKey='', extra='', privileges='select', columnComment='', generationExpression=''}*/
private Long datetimePrecision;

/**Column{tableCatalog='def', tableSchema='information_schema', tableName='ROUTINES', columnName='CHARACTER_SET_NAME', ordinalPosition=12, columnDefault='null', isNullable='YES', dataType='varchar', characterMaximumLength=64, characterOctetLength=192, numericPrecision=0, numericScale=0, datetimePrecision=0, characterSetName='utf8', collationName='utf8_general_ci', columnType='varchar(64)', columnKey='', extra='', privileges='select', columnComment='', generationExpression=''}*/
private String characterSetName;

/**Column{tableCatalog='def', tableSchema='information_schema', tableName='ROUTINES', columnName='COLLATION_NAME', ordinalPosition=13, columnDefault='null', isNullable='YES', dataType='varchar', characterMaximumLength=64, characterOctetLength=192, numericPrecision=0, numericScale=0, datetimePrecision=0, characterSetName='utf8', collationName='utf8_general_ci', columnType='varchar(64)', columnKey='', extra='', privileges='select', columnComment='', generationExpression=''}*/
private String collationName;

/**Column{tableCatalog='def', tableSchema='information_schema', tableName='ROUTINES', columnName='DTD_IDENTIFIER', ordinalPosition=14, columnDefault='null', isNullable='YES', dataType='longtext', characterMaximumLength=4294967295, characterOctetLength=4294967295, numericPrecision=0, numericScale=0, datetimePrecision=0, characterSetName='utf8', collationName='utf8_general_ci', columnType='longtext', columnKey='', extra='', privileges='select', columnComment='', generationExpression=''}*/
private String dtdIdentifier;

/**Column{tableCatalog='def', tableSchema='information_schema', tableName='ROUTINES', columnName='ROUTINE_BODY', ordinalPosition=15, columnDefault='', isNullable='NO', dataType='varchar', characterMaximumLength=8, characterOctetLength=24, numericPrecision=0, numericScale=0, datetimePrecision=0, characterSetName='utf8', collationName='utf8_general_ci', columnType='varchar(8)', columnKey='', extra='', privileges='select', columnComment='', generationExpression=''}*/
private String routineBody;

/**Column{tableCatalog='def', tableSchema='information_schema', tableName='ROUTINES', columnName='ROUTINE_DEFINITION', ordinalPosition=16, columnDefault='null', isNullable='YES', dataType='longtext', characterMaximumLength=4294967295, characterOctetLength=4294967295, numericPrecision=0, numericScale=0, datetimePrecision=0, characterSetName='utf8', collationName='utf8_general_ci', columnType='longtext', columnKey='', extra='', privileges='select', columnComment='', generationExpression=''}*/
private String routineDefinition;

/**Column{tableCatalog='def', tableSchema='information_schema', tableName='ROUTINES', columnName='EXTERNAL_NAME', ordinalPosition=17, columnDefault='null', isNullable='YES', dataType='varchar', characterMaximumLength=64, characterOctetLength=192, numericPrecision=0, numericScale=0, datetimePrecision=0, characterSetName='utf8', collationName='utf8_general_ci', columnType='varchar(64)', columnKey='', extra='', privileges='select', columnComment='', generationExpression=''}*/
private String externalName;

/**Column{tableCatalog='def', tableSchema='information_schema', tableName='ROUTINES', columnName='EXTERNAL_LANGUAGE', ordinalPosition=18, columnDefault='null', isNullable='YES', dataType='varchar', characterMaximumLength=64, characterOctetLength=192, numericPrecision=0, numericScale=0, datetimePrecision=0, characterSetName='utf8', collationName='utf8_general_ci', columnType='varchar(64)', columnKey='', extra='', privileges='select', columnComment='', generationExpression=''}*/
private String externalLanguage;

/**Column{tableCatalog='def', tableSchema='information_schema', tableName='ROUTINES', columnName='PARAMETER_STYLE', ordinalPosition=19, columnDefault='', isNullable='NO', dataType='varchar', characterMaximumLength=8, characterOctetLength=24, numericPrecision=0, numericScale=0, datetimePrecision=0, characterSetName='utf8', collationName='utf8_general_ci', columnType='varchar(8)', columnKey='', extra='', privileges='select', columnComment='', generationExpression=''}*/
private String parameterStyle;

/**Column{tableCatalog='def', tableSchema='information_schema', tableName='ROUTINES', columnName='IS_DETERMINISTIC', ordinalPosition=20, columnDefault='', isNullable='NO', dataType='varchar', characterMaximumLength=3, characterOctetLength=9, numericPrecision=0, numericScale=0, datetimePrecision=0, characterSetName='utf8', collationName='utf8_general_ci', columnType='varchar(3)', columnKey='', extra='', privileges='select', columnComment='', generationExpression=''}*/
private String isDeterministic;

/**Column{tableCatalog='def', tableSchema='information_schema', tableName='ROUTINES', columnName='SQL_DATA_ACCESS', ordinalPosition=21, columnDefault='', isNullable='NO', dataType='varchar', characterMaximumLength=64, characterOctetLength=192, numericPrecision=0, numericScale=0, datetimePrecision=0, characterSetName='utf8', collationName='utf8_general_ci', columnType='varchar(64)', columnKey='', extra='', privileges='select', columnComment='', generationExpression=''}*/
private String sqlDataAccess;

/**Column{tableCatalog='def', tableSchema='information_schema', tableName='ROUTINES', columnName='SQL_PATH', ordinalPosition=22, columnDefault='null', isNullable='YES', dataType='varchar', characterMaximumLength=64, characterOctetLength=192, numericPrecision=0, numericScale=0, datetimePrecision=0, characterSetName='utf8', collationName='utf8_general_ci', columnType='varchar(64)', columnKey='', extra='', privileges='select', columnComment='', generationExpression=''}*/
private String sqlPath;

/**Column{tableCatalog='def', tableSchema='information_schema', tableName='ROUTINES', columnName='SECURITY_TYPE', ordinalPosition=23, columnDefault='', isNullable='NO', dataType='varchar', characterMaximumLength=7, characterOctetLength=21, numericPrecision=0, numericScale=0, datetimePrecision=0, characterSetName='utf8', collationName='utf8_general_ci', columnType='varchar(7)', columnKey='', extra='', privileges='select', columnComment='', generationExpression=''}*/
private String securityType;

/**Column{tableCatalog='def', tableSchema='information_schema', tableName='ROUTINES', columnName='CREATED', ordinalPosition=24, columnDefault='0000-00-00 00:00:00', isNullable='NO', dataType='datetime', characterMaximumLength=0, characterOctetLength=0, numericPrecision=0, numericScale=0, datetimePrecision=0, characterSetName='null', collationName='null', columnType='datetime', columnKey='', extra='', privileges='select', columnComment='', generationExpression=''}*/
private Date created;

/**Column{tableCatalog='def', tableSchema='information_schema', tableName='ROUTINES', columnName='LAST_ALTERED', ordinalPosition=25, columnDefault='0000-00-00 00:00:00', isNullable='NO', dataType='datetime', characterMaximumLength=0, characterOctetLength=0, numericPrecision=0, numericScale=0, datetimePrecision=0, characterSetName='null', collationName='null', columnType='datetime', columnKey='', extra='', privileges='select', columnComment='', generationExpression=''}*/
private Date lastAltered;

/**Column{tableCatalog='def', tableSchema='information_schema', tableName='ROUTINES', columnName='SQL_MODE', ordinalPosition=26, columnDefault='', isNullable='NO', dataType='varchar', characterMaximumLength=8192, characterOctetLength=24576, numericPrecision=0, numericScale=0, datetimePrecision=0, characterSetName='utf8', collationName='utf8_general_ci', columnType='varchar(8192)', columnKey='', extra='', privileges='select', columnComment='', generationExpression=''}*/
private String sqlMode;

/**Column{tableCatalog='def', tableSchema='information_schema', tableName='ROUTINES', columnName='ROUTINE_COMMENT', ordinalPosition=27, columnDefault='null', isNullable='NO', dataType='longtext', characterMaximumLength=4294967295, characterOctetLength=4294967295, numericPrecision=0, numericScale=0, datetimePrecision=0, characterSetName='utf8', collationName='utf8_general_ci', columnType='longtext', columnKey='', extra='', privileges='select', columnComment='', generationExpression=''}*/
private String routineComment;

/**Column{tableCatalog='def', tableSchema='information_schema', tableName='ROUTINES', columnName='DEFINER', ordinalPosition=28, columnDefault='', isNullable='NO', dataType='varchar', characterMaximumLength=93, characterOctetLength=279, numericPrecision=0, numericScale=0, datetimePrecision=0, characterSetName='utf8', collationName='utf8_general_ci', columnType='varchar(93)', columnKey='', extra='', privileges='select', columnComment='', generationExpression=''}*/
private String definer;

/**Column{tableCatalog='def', tableSchema='information_schema', tableName='ROUTINES', columnName='CHARACTER_SET_CLIENT', ordinalPosition=29, columnDefault='', isNullable='NO', dataType='varchar', characterMaximumLength=32, characterOctetLength=96, numericPrecision=0, numericScale=0, datetimePrecision=0, characterSetName='utf8', collationName='utf8_general_ci', columnType='varchar(32)', columnKey='', extra='', privileges='select', columnComment='', generationExpression=''}*/
private String characterSetClient;

/**Column{tableCatalog='def', tableSchema='information_schema', tableName='ROUTINES', columnName='COLLATION_CONNECTION', ordinalPosition=30, columnDefault='', isNullable='NO', dataType='varchar', characterMaximumLength=32, characterOctetLength=96, numericPrecision=0, numericScale=0, datetimePrecision=0, characterSetName='utf8', collationName='utf8_general_ci', columnType='varchar(32)', columnKey='', extra='', privileges='select', columnComment='', generationExpression=''}*/
private String collationConnection;

/**Column{tableCatalog='def', tableSchema='information_schema', tableName='ROUTINES', columnName='DATABASE_COLLATION', ordinalPosition=31, columnDefault='', isNullable='NO', dataType='varchar', characterMaximumLength=32, characterOctetLength=96, numericPrecision=0, numericScale=0, datetimePrecision=0, characterSetName='utf8', collationName='utf8_general_ci', columnType='varchar(32)', columnKey='', extra='', privileges='select', columnComment='', generationExpression=''}*/
private String databaseCollation;

public String getSpecificName(){
return specificName;
}

public String getRoutineCatalog(){
return routineCatalog;
}

public String getRoutineSchema(){
return routineSchema;
}

public String getRoutineName(){
return routineName;
}

public String getRoutineType(){
return routineType;
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

public String getRoutineBody(){
return routineBody;
}

public String getRoutineDefinition(){
return routineDefinition;
}

public String getExternalName(){
return externalName;
}

public String getExternalLanguage(){
return externalLanguage;
}

public String getParameterStyle(){
return parameterStyle;
}

public String getIsDeterministic(){
return isDeterministic;
}

public String getSqlDataAccess(){
return sqlDataAccess;
}

public String getSqlPath(){
return sqlPath;
}

public String getSecurityType(){
return securityType;
}

public Date getCreated(){
return created;
}

public Date getLastAltered(){
return lastAltered;
}

public String getSqlMode(){
return sqlMode;
}

public String getRoutineComment(){
return routineComment;
}

public String getDefiner(){
return definer;
}

public String getCharacterSetClient(){
return characterSetClient;
}

public String getCollationConnection(){
return collationConnection;
}

public String getDatabaseCollation(){
return databaseCollation;
}

}