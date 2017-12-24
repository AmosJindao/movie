package db.bean.sys;


/* SELECT table_schema AS tableSchema, table_name AS tableName, column_name AS columnName, data_type AS dataType, column_type AS columnType, is_signed AS isSigned, is_unsigned AS isUnsigned, max_value AS maxValue, auto_increment AS autoIncrement, auto_increment_ratio AS autoIncrementRatio FROM sys.schema_auto_increment_columns */
/**VIEW
*/
public class SchemaAutoIncrementColumns{
/**Column{tableCatalog='def', tableSchema='sys', tableName='schema_auto_increment_columns', columnName='table_schema', ordinalPosition=1, columnDefault='', isNullable='NO', dataType='varchar', characterMaximumLength=64, characterOctetLength=192, numericPrecision=0, numericScale=0, datetimePrecision=0, characterSetName='utf8', collationName='utf8_general_ci', columnType='varchar(64)', columnKey='', extra='', privileges='select,insert,update,references', columnComment='', generationExpression=''}*/
private String tableSchema;

/**Column{tableCatalog='def', tableSchema='sys', tableName='schema_auto_increment_columns', columnName='table_name', ordinalPosition=2, columnDefault='', isNullable='NO', dataType='varchar', characterMaximumLength=64, characterOctetLength=192, numericPrecision=0, numericScale=0, datetimePrecision=0, characterSetName='utf8', collationName='utf8_general_ci', columnType='varchar(64)', columnKey='', extra='', privileges='select,insert,update,references', columnComment='', generationExpression=''}*/
private String tableName;

/**Column{tableCatalog='def', tableSchema='sys', tableName='schema_auto_increment_columns', columnName='column_name', ordinalPosition=3, columnDefault='', isNullable='NO', dataType='varchar', characterMaximumLength=64, characterOctetLength=192, numericPrecision=0, numericScale=0, datetimePrecision=0, characterSetName='utf8', collationName='utf8_general_ci', columnType='varchar(64)', columnKey='', extra='', privileges='select,insert,update,references', columnComment='', generationExpression=''}*/
private String columnName;

/**Column{tableCatalog='def', tableSchema='sys', tableName='schema_auto_increment_columns', columnName='data_type', ordinalPosition=4, columnDefault='', isNullable='NO', dataType='varchar', characterMaximumLength=64, characterOctetLength=192, numericPrecision=0, numericScale=0, datetimePrecision=0, characterSetName='utf8', collationName='utf8_general_ci', columnType='varchar(64)', columnKey='', extra='', privileges='select,insert,update,references', columnComment='', generationExpression=''}*/
private String dataType;

/**Column{tableCatalog='def', tableSchema='sys', tableName='schema_auto_increment_columns', columnName='column_type', ordinalPosition=5, columnDefault='null', isNullable='NO', dataType='longtext', characterMaximumLength=4294967295, characterOctetLength=4294967295, numericPrecision=0, numericScale=0, datetimePrecision=0, characterSetName='utf8', collationName='utf8_general_ci', columnType='longtext', columnKey='', extra='', privileges='select,insert,update,references', columnComment='', generationExpression=''}*/
private String columnType;

/**Column{tableCatalog='def', tableSchema='sys', tableName='schema_auto_increment_columns', columnName='is_signed', ordinalPosition=6, columnDefault='0', isNullable='NO', dataType='int', characterMaximumLength=0, characterOctetLength=0, numericPrecision=10, numericScale=0, datetimePrecision=0, characterSetName='null', collationName='null', columnType='int(1)', columnKey='', extra='', privileges='select,insert,update,references', columnComment='', generationExpression=''}*/
private Integer isSigned;

/**Column{tableCatalog='def', tableSchema='sys', tableName='schema_auto_increment_columns', columnName='is_unsigned', ordinalPosition=7, columnDefault='0', isNullable='NO', dataType='int', characterMaximumLength=0, characterOctetLength=0, numericPrecision=10, numericScale=0, datetimePrecision=0, characterSetName='null', collationName='null', columnType='int(1)', columnKey='', extra='', privileges='select,insert,update,references', columnComment='', generationExpression=''}*/
private Integer isUnsigned;

/**Column{tableCatalog='def', tableSchema='sys', tableName='schema_auto_increment_columns', columnName='max_value', ordinalPosition=8, columnDefault='null', isNullable='YES', dataType='bigint', characterMaximumLength=0, characterOctetLength=0, numericPrecision=20, numericScale=0, datetimePrecision=0, characterSetName='null', collationName='null', columnType='bigint(21) unsigned', columnKey='', extra='', privileges='select,insert,update,references', columnComment='', generationExpression=''}*/
private Long maxValue;

/**Column{tableCatalog='def', tableSchema='sys', tableName='schema_auto_increment_columns', columnName='auto_increment', ordinalPosition=9, columnDefault='null', isNullable='YES', dataType='bigint', characterMaximumLength=0, characterOctetLength=0, numericPrecision=20, numericScale=0, datetimePrecision=0, characterSetName='null', collationName='null', columnType='bigint(21) unsigned', columnKey='', extra='', privileges='select,insert,update,references', columnComment='', generationExpression=''}*/
private Long autoIncrement;

/**Column{tableCatalog='def', tableSchema='sys', tableName='schema_auto_increment_columns', columnName='auto_increment_ratio', ordinalPosition=10, columnDefault='null', isNullable='YES', dataType='decimal', characterMaximumLength=0, characterOctetLength=0, numericPrecision=25, numericScale=4, datetimePrecision=0, characterSetName='null', collationName='null', columnType='decimal(25,4) unsigned', columnKey='', extra='', privileges='select,insert,update,references', columnComment='', generationExpression=''}*/
private Double autoIncrementRatio;

public String getTableSchema(){
return tableSchema;
}

public String getTableName(){
return tableName;
}

public String getColumnName(){
return columnName;
}

public String getDataType(){
return dataType;
}

public String getColumnType(){
return columnType;
}

public Integer getIsSigned(){
return isSigned;
}

public Integer getIsUnsigned(){
return isUnsigned;
}

public Long getMaxValue(){
return maxValue;
}

public Long getAutoIncrement(){
return autoIncrement;
}

public Double getAutoIncrementRatio(){
return autoIncrementRatio;
}

}