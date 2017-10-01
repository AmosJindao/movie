package db.bean.information_schema;


/**
*/
public class Views{
/**Column{tableCatalog='def', tableSchema='information_schema', tableName='VIEWS', columnName='TABLE_CATALOG', ordinalPosition=1, columnDefault='', isNullable='NO', dataType='varchar', characterMaximumLength=512, characterOctetLength=1536, numericPrecision=0, numericScale=0, datetimePrecision=0, characterSetName='utf8', collationName='utf8_general_ci', columnType='varchar(512)', columnKey='', extra='', privileges='select', columnComment='', generationExpression=''}*/
private String tableCatalog;

/**Column{tableCatalog='def', tableSchema='information_schema', tableName='VIEWS', columnName='TABLE_SCHEMA', ordinalPosition=2, columnDefault='', isNullable='NO', dataType='varchar', characterMaximumLength=64, characterOctetLength=192, numericPrecision=0, numericScale=0, datetimePrecision=0, characterSetName='utf8', collationName='utf8_general_ci', columnType='varchar(64)', columnKey='', extra='', privileges='select', columnComment='', generationExpression=''}*/
private String tableSchema;

/**Column{tableCatalog='def', tableSchema='information_schema', tableName='VIEWS', columnName='TABLE_NAME', ordinalPosition=3, columnDefault='', isNullable='NO', dataType='varchar', characterMaximumLength=64, characterOctetLength=192, numericPrecision=0, numericScale=0, datetimePrecision=0, characterSetName='utf8', collationName='utf8_general_ci', columnType='varchar(64)', columnKey='', extra='', privileges='select', columnComment='', generationExpression=''}*/
private String tableName;

/**Column{tableCatalog='def', tableSchema='information_schema', tableName='VIEWS', columnName='VIEW_DEFINITION', ordinalPosition=4, columnDefault='null', isNullable='NO', dataType='longtext', characterMaximumLength=4294967295, characterOctetLength=4294967295, numericPrecision=0, numericScale=0, datetimePrecision=0, characterSetName='utf8', collationName='utf8_general_ci', columnType='longtext', columnKey='', extra='', privileges='select', columnComment='', generationExpression=''}*/
private String viewDefinition;

/**Column{tableCatalog='def', tableSchema='information_schema', tableName='VIEWS', columnName='CHECK_OPTION', ordinalPosition=5, columnDefault='', isNullable='NO', dataType='varchar', characterMaximumLength=8, characterOctetLength=24, numericPrecision=0, numericScale=0, datetimePrecision=0, characterSetName='utf8', collationName='utf8_general_ci', columnType='varchar(8)', columnKey='', extra='', privileges='select', columnComment='', generationExpression=''}*/
private String checkOption;

/**Column{tableCatalog='def', tableSchema='information_schema', tableName='VIEWS', columnName='IS_UPDATABLE', ordinalPosition=6, columnDefault='', isNullable='NO', dataType='varchar', characterMaximumLength=3, characterOctetLength=9, numericPrecision=0, numericScale=0, datetimePrecision=0, characterSetName='utf8', collationName='utf8_general_ci', columnType='varchar(3)', columnKey='', extra='', privileges='select', columnComment='', generationExpression=''}*/
private String isUpdatable;

/**Column{tableCatalog='def', tableSchema='information_schema', tableName='VIEWS', columnName='DEFINER', ordinalPosition=7, columnDefault='', isNullable='NO', dataType='varchar', characterMaximumLength=93, characterOctetLength=279, numericPrecision=0, numericScale=0, datetimePrecision=0, characterSetName='utf8', collationName='utf8_general_ci', columnType='varchar(93)', columnKey='', extra='', privileges='select', columnComment='', generationExpression=''}*/
private String definer;

/**Column{tableCatalog='def', tableSchema='information_schema', tableName='VIEWS', columnName='SECURITY_TYPE', ordinalPosition=8, columnDefault='', isNullable='NO', dataType='varchar', characterMaximumLength=7, characterOctetLength=21, numericPrecision=0, numericScale=0, datetimePrecision=0, characterSetName='utf8', collationName='utf8_general_ci', columnType='varchar(7)', columnKey='', extra='', privileges='select', columnComment='', generationExpression=''}*/
private String securityType;

/**Column{tableCatalog='def', tableSchema='information_schema', tableName='VIEWS', columnName='CHARACTER_SET_CLIENT', ordinalPosition=9, columnDefault='', isNullable='NO', dataType='varchar', characterMaximumLength=32, characterOctetLength=96, numericPrecision=0, numericScale=0, datetimePrecision=0, characterSetName='utf8', collationName='utf8_general_ci', columnType='varchar(32)', columnKey='', extra='', privileges='select', columnComment='', generationExpression=''}*/
private String characterSetClient;

/**Column{tableCatalog='def', tableSchema='information_schema', tableName='VIEWS', columnName='COLLATION_CONNECTION', ordinalPosition=10, columnDefault='', isNullable='NO', dataType='varchar', characterMaximumLength=32, characterOctetLength=96, numericPrecision=0, numericScale=0, datetimePrecision=0, characterSetName='utf8', collationName='utf8_general_ci', columnType='varchar(32)', columnKey='', extra='', privileges='select', columnComment='', generationExpression=''}*/
private String collationConnection;

public String getTableCatalog(){
return tableCatalog;
}

public String getTableSchema(){
return tableSchema;
}

public String getTableName(){
return tableName;
}

public String getViewDefinition(){
return viewDefinition;
}

public String getCheckOption(){
return checkOption;
}

public String getIsUpdatable(){
return isUpdatable;
}

public String getDefiner(){
return definer;
}

public String getSecurityType(){
return securityType;
}

public String getCharacterSetClient(){
return characterSetClient;
}

public String getCollationConnection(){
return collationConnection;
}

}