package db.bean.sys;


/* SELECT table_schema AS tableSchema, table_name AS tableName, redundant_index_name AS redundantIndexName, redundant_index_columns AS redundantIndexColumns, redundant_index_non_unique AS redundantIndexNonUnique, dominant_index_name AS dominantIndexName, dominant_index_columns AS dominantIndexColumns, dominant_index_non_unique AS dominantIndexNonUnique, subpart_exists AS subpartExists, sql_drop_index AS sqlDropIndex FROM sys.schema_redundant_indexes */
/**VIEW
*/
public class SchemaRedundantIndexes{
/**Column{tableCatalog='def', tableSchema='sys', tableName='schema_redundant_indexes', columnName='table_schema', ordinalPosition=1, columnDefault='', isNullable='NO', dataType='varchar', characterMaximumLength=64, characterOctetLength=192, numericPrecision=0, numericScale=0, datetimePrecision=0, characterSetName='utf8', collationName='utf8_general_ci', columnType='varchar(64)', columnKey='', extra='', privileges='select,insert,update,references', columnComment='', generationExpression=''}*/
private String tableSchema;

/**Column{tableCatalog='def', tableSchema='sys', tableName='schema_redundant_indexes', columnName='table_name', ordinalPosition=2, columnDefault='', isNullable='NO', dataType='varchar', characterMaximumLength=64, characterOctetLength=192, numericPrecision=0, numericScale=0, datetimePrecision=0, characterSetName='utf8', collationName='utf8_general_ci', columnType='varchar(64)', columnKey='', extra='', privileges='select,insert,update,references', columnComment='', generationExpression=''}*/
private String tableName;

/**Column{tableCatalog='def', tableSchema='sys', tableName='schema_redundant_indexes', columnName='redundant_index_name', ordinalPosition=3, columnDefault='', isNullable='NO', dataType='varchar', characterMaximumLength=64, characterOctetLength=192, numericPrecision=0, numericScale=0, datetimePrecision=0, characterSetName='utf8', collationName='utf8_general_ci', columnType='varchar(64)', columnKey='', extra='', privileges='select,insert,update,references', columnComment='', generationExpression=''}*/
private String redundantIndexName;

/**Column{tableCatalog='def', tableSchema='sys', tableName='schema_redundant_indexes', columnName='redundant_index_columns', ordinalPosition=4, columnDefault='null', isNullable='YES', dataType='text', characterMaximumLength=65535, characterOctetLength=65535, numericPrecision=0, numericScale=0, datetimePrecision=0, characterSetName='utf8', collationName='utf8_general_ci', columnType='text', columnKey='', extra='', privileges='select,insert,update,references', columnComment='', generationExpression=''}*/
private String redundantIndexColumns;

/**Column{tableCatalog='def', tableSchema='sys', tableName='schema_redundant_indexes', columnName='redundant_index_non_unique', ordinalPosition=5, columnDefault='null', isNullable='YES', dataType='bigint', characterMaximumLength=0, characterOctetLength=0, numericPrecision=19, numericScale=0, datetimePrecision=0, characterSetName='null', collationName='null', columnType='bigint(1)', columnKey='', extra='', privileges='select,insert,update,references', columnComment='', generationExpression=''}*/
private Long redundantIndexNonUnique;

/**Column{tableCatalog='def', tableSchema='sys', tableName='schema_redundant_indexes', columnName='dominant_index_name', ordinalPosition=6, columnDefault='', isNullable='NO', dataType='varchar', characterMaximumLength=64, characterOctetLength=192, numericPrecision=0, numericScale=0, datetimePrecision=0, characterSetName='utf8', collationName='utf8_general_ci', columnType='varchar(64)', columnKey='', extra='', privileges='select,insert,update,references', columnComment='', generationExpression=''}*/
private String dominantIndexName;

/**Column{tableCatalog='def', tableSchema='sys', tableName='schema_redundant_indexes', columnName='dominant_index_columns', ordinalPosition=7, columnDefault='null', isNullable='YES', dataType='text', characterMaximumLength=65535, characterOctetLength=65535, numericPrecision=0, numericScale=0, datetimePrecision=0, characterSetName='utf8', collationName='utf8_general_ci', columnType='text', columnKey='', extra='', privileges='select,insert,update,references', columnComment='', generationExpression=''}*/
private String dominantIndexColumns;

/**Column{tableCatalog='def', tableSchema='sys', tableName='schema_redundant_indexes', columnName='dominant_index_non_unique', ordinalPosition=8, columnDefault='null', isNullable='YES', dataType='bigint', characterMaximumLength=0, characterOctetLength=0, numericPrecision=19, numericScale=0, datetimePrecision=0, characterSetName='null', collationName='null', columnType='bigint(1)', columnKey='', extra='', privileges='select,insert,update,references', columnComment='', generationExpression=''}*/
private Long dominantIndexNonUnique;

/**Column{tableCatalog='def', tableSchema='sys', tableName='schema_redundant_indexes', columnName='subpart_exists', ordinalPosition=9, columnDefault='0', isNullable='NO', dataType='int', characterMaximumLength=0, characterOctetLength=0, numericPrecision=10, numericScale=0, datetimePrecision=0, characterSetName='null', collationName='null', columnType='int(1)', columnKey='', extra='', privileges='select,insert,update,references', columnComment='', generationExpression=''}*/
private Integer subpartExists;

/**Column{tableCatalog='def', tableSchema='sys', tableName='schema_redundant_indexes', columnName='sql_drop_index', ordinalPosition=10, columnDefault='null', isNullable='YES', dataType='varchar', characterMaximumLength=223, characterOctetLength=669, numericPrecision=0, numericScale=0, datetimePrecision=0, characterSetName='utf8', collationName='utf8_general_ci', columnType='varchar(223)', columnKey='', extra='', privileges='select,insert,update,references', columnComment='', generationExpression=''}*/
private String sqlDropIndex;

public String getTableSchema(){
return tableSchema;
}

public String getTableName(){
return tableName;
}

public String getRedundantIndexName(){
return redundantIndexName;
}

public String getRedundantIndexColumns(){
return redundantIndexColumns;
}

public Long getRedundantIndexNonUnique(){
return redundantIndexNonUnique;
}

public String getDominantIndexName(){
return dominantIndexName;
}

public String getDominantIndexColumns(){
return dominantIndexColumns;
}

public Long getDominantIndexNonUnique(){
return dominantIndexNonUnique;
}

public Integer getSubpartExists(){
return subpartExists;
}

public String getSqlDropIndex(){
return sqlDropIndex;
}

}