package db.bean.sys;


/* SELECT object_schema AS objectSchema, object_name AS objectName, index_name AS indexName FROM sys.schema_unused_indexes */
/**VIEW
*/
public class SchemaUnusedIndexes{
/**Column{tableCatalog='def', tableSchema='sys', tableName='schema_unused_indexes', columnName='object_schema', ordinalPosition=1, columnDefault='null', isNullable='YES', dataType='varchar', characterMaximumLength=64, characterOctetLength=192, numericPrecision=0, numericScale=0, datetimePrecision=0, characterSetName='utf8', collationName='utf8_general_ci', columnType='varchar(64)', columnKey='', extra='', privileges='select,insert,update,references', columnComment='', generationExpression=''}*/
private String objectSchema;

/**Column{tableCatalog='def', tableSchema='sys', tableName='schema_unused_indexes', columnName='object_name', ordinalPosition=2, columnDefault='null', isNullable='YES', dataType='varchar', characterMaximumLength=64, characterOctetLength=192, numericPrecision=0, numericScale=0, datetimePrecision=0, characterSetName='utf8', collationName='utf8_general_ci', columnType='varchar(64)', columnKey='', extra='', privileges='select,insert,update,references', columnComment='', generationExpression=''}*/
private String objectName;

/**Column{tableCatalog='def', tableSchema='sys', tableName='schema_unused_indexes', columnName='index_name', ordinalPosition=3, columnDefault='null', isNullable='YES', dataType='varchar', characterMaximumLength=64, characterOctetLength=192, numericPrecision=0, numericScale=0, datetimePrecision=0, characterSetName='utf8', collationName='utf8_general_ci', columnType='varchar(64)', columnKey='', extra='', privileges='select,insert,update,references', columnComment='', generationExpression=''}*/
private String indexName;

public String getObjectSchema(){
return objectSchema;
}

public String getObjectName(){
return objectName;
}

public String getIndexName(){
return indexName;
}

}