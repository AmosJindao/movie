package db.bean.sys;


/**VIEW
*/
public class X$schemaFlattenedKeys{
/**Column{tableCatalog='def', tableSchema='sys', tableName='x$schema_flattened_keys', columnName='table_schema', ordinalPosition=1, columnDefault='', isNullable='NO', dataType='varchar', characterMaximumLength=64, characterOctetLength=192, numericPrecision=0, numericScale=0, datetimePrecision=0, characterSetName='utf8', collationName='utf8_general_ci', columnType='varchar(64)', columnKey='', extra='', privileges='select,insert,update,references', columnComment='', generationExpression=''}*/
private String tableSchema;

/**Column{tableCatalog='def', tableSchema='sys', tableName='x$schema_flattened_keys', columnName='table_name', ordinalPosition=2, columnDefault='', isNullable='NO', dataType='varchar', characterMaximumLength=64, characterOctetLength=192, numericPrecision=0, numericScale=0, datetimePrecision=0, characterSetName='utf8', collationName='utf8_general_ci', columnType='varchar(64)', columnKey='', extra='', privileges='select,insert,update,references', columnComment='', generationExpression=''}*/
private String tableName;

/**Column{tableCatalog='def', tableSchema='sys', tableName='x$schema_flattened_keys', columnName='index_name', ordinalPosition=3, columnDefault='', isNullable='NO', dataType='varchar', characterMaximumLength=64, characterOctetLength=192, numericPrecision=0, numericScale=0, datetimePrecision=0, characterSetName='utf8', collationName='utf8_general_ci', columnType='varchar(64)', columnKey='', extra='', privileges='select,insert,update,references', columnComment='', generationExpression=''}*/
private String indexName;

/**Column{tableCatalog='def', tableSchema='sys', tableName='x$schema_flattened_keys', columnName='non_unique', ordinalPosition=4, columnDefault='null', isNullable='YES', dataType='bigint', characterMaximumLength=0, characterOctetLength=0, numericPrecision=19, numericScale=0, datetimePrecision=0, characterSetName='null', collationName='null', columnType='bigint(1)', columnKey='', extra='', privileges='select,insert,update,references', columnComment='', generationExpression=''}*/
private Long nonUnique;

/**Column{tableCatalog='def', tableSchema='sys', tableName='x$schema_flattened_keys', columnName='subpart_exists', ordinalPosition=5, columnDefault='null', isNullable='YES', dataType='bigint', characterMaximumLength=0, characterOctetLength=0, numericPrecision=19, numericScale=0, datetimePrecision=0, characterSetName='null', collationName='null', columnType='bigint(1)', columnKey='', extra='', privileges='select,insert,update,references', columnComment='', generationExpression=''}*/
private Long subpartExists;

/**Column{tableCatalog='def', tableSchema='sys', tableName='x$schema_flattened_keys', columnName='index_columns', ordinalPosition=6, columnDefault='null', isNullable='YES', dataType='text', characterMaximumLength=65535, characterOctetLength=65535, numericPrecision=0, numericScale=0, datetimePrecision=0, characterSetName='utf8', collationName='utf8_general_ci', columnType='text', columnKey='', extra='', privileges='select,insert,update,references', columnComment='', generationExpression=''}*/
private String indexColumns;

public String getTableSchema(){
return tableSchema;
}

public String getTableName(){
return tableName;
}

public String getIndexName(){
return indexName;
}

public Long getNonUnique(){
return nonUnique;
}

public Long getSubpartExists(){
return subpartExists;
}

public String getIndexColumns(){
return indexColumns;
}

}