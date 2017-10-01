package db.bean.information_schema;


/**
*/
public class Columns{
/**Column{tableCatalog='def', tableSchema='information_schema', tableName='COLUMNS', columnName='TABLE_CATALOG', ordinalPosition=1, columnDefault='', isNullable='NO', dataType='varchar', characterMaximumLength=512, characterOctetLength=1536, numericPrecision=0, numericScale=0, datetimePrecision=0, characterSetName='utf8', collationName='utf8_general_ci', columnType='varchar(512)', columnKey='', extra='', privileges='select', columnComment='', generationExpression=''}*/
private String tableCatalog;

/**Column{tableCatalog='def', tableSchema='information_schema', tableName='COLUMNS', columnName='TABLE_SCHEMA', ordinalPosition=2, columnDefault='', isNullable='NO', dataType='varchar', characterMaximumLength=64, characterOctetLength=192, numericPrecision=0, numericScale=0, datetimePrecision=0, characterSetName='utf8', collationName='utf8_general_ci', columnType='varchar(64)', columnKey='', extra='', privileges='select', columnComment='', generationExpression=''}*/
private String tableSchema;

/**Column{tableCatalog='def', tableSchema='information_schema', tableName='COLUMNS', columnName='TABLE_NAME', ordinalPosition=3, columnDefault='', isNullable='NO', dataType='varchar', characterMaximumLength=64, characterOctetLength=192, numericPrecision=0, numericScale=0, datetimePrecision=0, characterSetName='utf8', collationName='utf8_general_ci', columnType='varchar(64)', columnKey='', extra='', privileges='select', columnComment='', generationExpression=''}*/
private String tableName;

/**Column{tableCatalog='def', tableSchema='information_schema', tableName='COLUMNS', columnName='COLUMN_NAME', ordinalPosition=4, columnDefault='', isNullable='NO', dataType='varchar', characterMaximumLength=64, characterOctetLength=192, numericPrecision=0, numericScale=0, datetimePrecision=0, characterSetName='utf8', collationName='utf8_general_ci', columnType='varchar(64)', columnKey='', extra='', privileges='select', columnComment='', generationExpression=''}*/
private String columnName;

/**Column{tableCatalog='def', tableSchema='information_schema', tableName='COLUMNS', columnName='ORDINAL_POSITION', ordinalPosition=5, columnDefault='0', isNullable='NO', dataType='bigint', characterMaximumLength=0, characterOctetLength=0, numericPrecision=20, numericScale=0, datetimePrecision=0, characterSetName='null', collationName='null', columnType='bigint(21) unsigned', columnKey='', extra='', privileges='select', columnComment='', generationExpression=''}*/
private Long ordinalPosition;

/**Column{tableCatalog='def', tableSchema='information_schema', tableName='COLUMNS', columnName='COLUMN_DEFAULT', ordinalPosition=6, columnDefault='null', isNullable='YES', dataType='longtext', characterMaximumLength=4294967295, characterOctetLength=4294967295, numericPrecision=0, numericScale=0, datetimePrecision=0, characterSetName='utf8', collationName='utf8_general_ci', columnType='longtext', columnKey='', extra='', privileges='select', columnComment='', generationExpression=''}*/
private String columnDefault;

/**Column{tableCatalog='def', tableSchema='information_schema', tableName='COLUMNS', columnName='IS_NULLABLE', ordinalPosition=7, columnDefault='', isNullable='NO', dataType='varchar', characterMaximumLength=3, characterOctetLength=9, numericPrecision=0, numericScale=0, datetimePrecision=0, characterSetName='utf8', collationName='utf8_general_ci', columnType='varchar(3)', columnKey='', extra='', privileges='select', columnComment='', generationExpression=''}*/
private String isNullable;

/**Column{tableCatalog='def', tableSchema='information_schema', tableName='COLUMNS', columnName='DATA_TYPE', ordinalPosition=8, columnDefault='', isNullable='NO', dataType='varchar', characterMaximumLength=64, characterOctetLength=192, numericPrecision=0, numericScale=0, datetimePrecision=0, characterSetName='utf8', collationName='utf8_general_ci', columnType='varchar(64)', columnKey='', extra='', privileges='select', columnComment='', generationExpression=''}*/
private String dataType;

/**Column{tableCatalog='def', tableSchema='information_schema', tableName='COLUMNS', columnName='CHARACTER_MAXIMUM_LENGTH', ordinalPosition=9, columnDefault='null', isNullable='YES', dataType='bigint', characterMaximumLength=0, characterOctetLength=0, numericPrecision=20, numericScale=0, datetimePrecision=0, characterSetName='null', collationName='null', columnType='bigint(21) unsigned', columnKey='', extra='', privileges='select', columnComment='', generationExpression=''}*/
private Long characterMaximumLength;

/**Column{tableCatalog='def', tableSchema='information_schema', tableName='COLUMNS', columnName='CHARACTER_OCTET_LENGTH', ordinalPosition=10, columnDefault='null', isNullable='YES', dataType='bigint', characterMaximumLength=0, characterOctetLength=0, numericPrecision=20, numericScale=0, datetimePrecision=0, characterSetName='null', collationName='null', columnType='bigint(21) unsigned', columnKey='', extra='', privileges='select', columnComment='', generationExpression=''}*/
private Long characterOctetLength;

/**Column{tableCatalog='def', tableSchema='information_schema', tableName='COLUMNS', columnName='NUMERIC_PRECISION', ordinalPosition=11, columnDefault='null', isNullable='YES', dataType='bigint', characterMaximumLength=0, characterOctetLength=0, numericPrecision=20, numericScale=0, datetimePrecision=0, characterSetName='null', collationName='null', columnType='bigint(21) unsigned', columnKey='', extra='', privileges='select', columnComment='', generationExpression=''}*/
private Long numericPrecision;

/**Column{tableCatalog='def', tableSchema='information_schema', tableName='COLUMNS', columnName='NUMERIC_SCALE', ordinalPosition=12, columnDefault='null', isNullable='YES', dataType='bigint', characterMaximumLength=0, characterOctetLength=0, numericPrecision=20, numericScale=0, datetimePrecision=0, characterSetName='null', collationName='null', columnType='bigint(21) unsigned', columnKey='', extra='', privileges='select', columnComment='', generationExpression=''}*/
private Long numericScale;

/**Column{tableCatalog='def', tableSchema='information_schema', tableName='COLUMNS', columnName='DATETIME_PRECISION', ordinalPosition=13, columnDefault='null', isNullable='YES', dataType='bigint', characterMaximumLength=0, characterOctetLength=0, numericPrecision=20, numericScale=0, datetimePrecision=0, characterSetName='null', collationName='null', columnType='bigint(21) unsigned', columnKey='', extra='', privileges='select', columnComment='', generationExpression=''}*/
private Long datetimePrecision;

/**Column{tableCatalog='def', tableSchema='information_schema', tableName='COLUMNS', columnName='CHARACTER_SET_NAME', ordinalPosition=14, columnDefault='null', isNullable='YES', dataType='varchar', characterMaximumLength=32, characterOctetLength=96, numericPrecision=0, numericScale=0, datetimePrecision=0, characterSetName='utf8', collationName='utf8_general_ci', columnType='varchar(32)', columnKey='', extra='', privileges='select', columnComment='', generationExpression=''}*/
private String characterSetName;

/**Column{tableCatalog='def', tableSchema='information_schema', tableName='COLUMNS', columnName='COLLATION_NAME', ordinalPosition=15, columnDefault='null', isNullable='YES', dataType='varchar', characterMaximumLength=32, characterOctetLength=96, numericPrecision=0, numericScale=0, datetimePrecision=0, characterSetName='utf8', collationName='utf8_general_ci', columnType='varchar(32)', columnKey='', extra='', privileges='select', columnComment='', generationExpression=''}*/
private String collationName;

/**Column{tableCatalog='def', tableSchema='information_schema', tableName='COLUMNS', columnName='COLUMN_TYPE', ordinalPosition=16, columnDefault='null', isNullable='NO', dataType='longtext', characterMaximumLength=4294967295, characterOctetLength=4294967295, numericPrecision=0, numericScale=0, datetimePrecision=0, characterSetName='utf8', collationName='utf8_general_ci', columnType='longtext', columnKey='', extra='', privileges='select', columnComment='', generationExpression=''}*/
private String columnType;

/**Column{tableCatalog='def', tableSchema='information_schema', tableName='COLUMNS', columnName='COLUMN_KEY', ordinalPosition=17, columnDefault='', isNullable='NO', dataType='varchar', characterMaximumLength=3, characterOctetLength=9, numericPrecision=0, numericScale=0, datetimePrecision=0, characterSetName='utf8', collationName='utf8_general_ci', columnType='varchar(3)', columnKey='', extra='', privileges='select', columnComment='', generationExpression=''}*/
private String columnKey;

/**Column{tableCatalog='def', tableSchema='information_schema', tableName='COLUMNS', columnName='EXTRA', ordinalPosition=18, columnDefault='', isNullable='NO', dataType='varchar', characterMaximumLength=30, characterOctetLength=90, numericPrecision=0, numericScale=0, datetimePrecision=0, characterSetName='utf8', collationName='utf8_general_ci', columnType='varchar(30)', columnKey='', extra='', privileges='select', columnComment='', generationExpression=''}*/
private String extra;

/**Column{tableCatalog='def', tableSchema='information_schema', tableName='COLUMNS', columnName='PRIVILEGES', ordinalPosition=19, columnDefault='', isNullable='NO', dataType='varchar', characterMaximumLength=80, characterOctetLength=240, numericPrecision=0, numericScale=0, datetimePrecision=0, characterSetName='utf8', collationName='utf8_general_ci', columnType='varchar(80)', columnKey='', extra='', privileges='select', columnComment='', generationExpression=''}*/
private String privileges;

/**Column{tableCatalog='def', tableSchema='information_schema', tableName='COLUMNS', columnName='COLUMN_COMMENT', ordinalPosition=20, columnDefault='', isNullable='NO', dataType='varchar', characterMaximumLength=1024, characterOctetLength=3072, numericPrecision=0, numericScale=0, datetimePrecision=0, characterSetName='utf8', collationName='utf8_general_ci', columnType='varchar(1024)', columnKey='', extra='', privileges='select', columnComment='', generationExpression=''}*/
private String columnComment;

/**Column{tableCatalog='def', tableSchema='information_schema', tableName='COLUMNS', columnName='GENERATION_EXPRESSION', ordinalPosition=21, columnDefault='null', isNullable='NO', dataType='longtext', characterMaximumLength=4294967295, characterOctetLength=4294967295, numericPrecision=0, numericScale=0, datetimePrecision=0, characterSetName='utf8', collationName='utf8_general_ci', columnType='longtext', columnKey='', extra='', privileges='select', columnComment='', generationExpression=''}*/
private String generationExpression;

public String getTableCatalog(){
return tableCatalog;
}

public String getTableSchema(){
return tableSchema;
}

public String getTableName(){
return tableName;
}

public String getColumnName(){
return columnName;
}

public Long getOrdinalPosition(){
return ordinalPosition;
}

public String getColumnDefault(){
return columnDefault;
}

public String getIsNullable(){
return isNullable;
}

public String getDataType(){
return dataType;
}

public Long getCharacterMaximumLength(){
return characterMaximumLength;
}

public Long getCharacterOctetLength(){
return characterOctetLength;
}

public Long getNumericPrecision(){
return numericPrecision;
}

public Long getNumericScale(){
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

public String getColumnType(){
return columnType;
}

public String getColumnKey(){
return columnKey;
}

public String getExtra(){
return extra;
}

public String getPrivileges(){
return privileges;
}

public String getColumnComment(){
return columnComment;
}

public String getGenerationExpression(){
return generationExpression;
}

}