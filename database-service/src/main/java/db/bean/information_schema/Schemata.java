package db.bean.information_schema;


/* SELECT CATALOG_NAME AS catalogName, SCHEMA_NAME AS schemaName, DEFAULT_CHARACTER_SET_NAME AS defaultCharacterSetName, DEFAULT_COLLATION_NAME AS defaultCollationName, SQL_PATH AS sqlPath FROM information_schema.SCHEMATA */
/**
*/
public class Schemata{
/**Column{tableCatalog='def', tableSchema='information_schema', tableName='SCHEMATA', columnName='CATALOG_NAME', ordinalPosition=1, columnDefault='', isNullable='NO', dataType='varchar', characterMaximumLength=512, characterOctetLength=1536, numericPrecision=0, numericScale=0, datetimePrecision=0, characterSetName='utf8', collationName='utf8_general_ci', columnType='varchar(512)', columnKey='', extra='', privileges='select', columnComment='', generationExpression=''}*/
private String catalogName;

/**Column{tableCatalog='def', tableSchema='information_schema', tableName='SCHEMATA', columnName='SCHEMA_NAME', ordinalPosition=2, columnDefault='', isNullable='NO', dataType='varchar', characterMaximumLength=64, characterOctetLength=192, numericPrecision=0, numericScale=0, datetimePrecision=0, characterSetName='utf8', collationName='utf8_general_ci', columnType='varchar(64)', columnKey='', extra='', privileges='select', columnComment='', generationExpression=''}*/
private String schemaName;

/**Column{tableCatalog='def', tableSchema='information_schema', tableName='SCHEMATA', columnName='DEFAULT_CHARACTER_SET_NAME', ordinalPosition=3, columnDefault='', isNullable='NO', dataType='varchar', characterMaximumLength=32, characterOctetLength=96, numericPrecision=0, numericScale=0, datetimePrecision=0, characterSetName='utf8', collationName='utf8_general_ci', columnType='varchar(32)', columnKey='', extra='', privileges='select', columnComment='', generationExpression=''}*/
private String defaultCharacterSetName;

/**Column{tableCatalog='def', tableSchema='information_schema', tableName='SCHEMATA', columnName='DEFAULT_COLLATION_NAME', ordinalPosition=4, columnDefault='', isNullable='NO', dataType='varchar', characterMaximumLength=32, characterOctetLength=96, numericPrecision=0, numericScale=0, datetimePrecision=0, characterSetName='utf8', collationName='utf8_general_ci', columnType='varchar(32)', columnKey='', extra='', privileges='select', columnComment='', generationExpression=''}*/
private String defaultCollationName;

/**Column{tableCatalog='def', tableSchema='information_schema', tableName='SCHEMATA', columnName='SQL_PATH', ordinalPosition=5, columnDefault='null', isNullable='YES', dataType='varchar', characterMaximumLength=512, characterOctetLength=1536, numericPrecision=0, numericScale=0, datetimePrecision=0, characterSetName='utf8', collationName='utf8_general_ci', columnType='varchar(512)', columnKey='', extra='', privileges='select', columnComment='', generationExpression=''}*/
private String sqlPath;

public String getCatalogName(){
return catalogName;
}

public String getSchemaName(){
return schemaName;
}

public String getDefaultCharacterSetName(){
return defaultCharacterSetName;
}

public String getDefaultCollationName(){
return defaultCollationName;
}

public String getSqlPath(){
return sqlPath;
}

}