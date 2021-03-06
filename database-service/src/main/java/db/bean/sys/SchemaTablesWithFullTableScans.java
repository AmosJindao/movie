package db.bean.sys;


/* SELECT object_schema AS objectSchema, object_name AS objectName, rows_full_scanned AS rowsFullScanned, latency AS latency FROM sys.schema_tables_with_full_table_scans */
/**VIEW
*/
public class SchemaTablesWithFullTableScans{
/**Column{tableCatalog='def', tableSchema='sys', tableName='schema_tables_with_full_table_scans', columnName='object_schema', ordinalPosition=1, columnDefault='null', isNullable='YES', dataType='varchar', characterMaximumLength=64, characterOctetLength=192, numericPrecision=0, numericScale=0, datetimePrecision=0, characterSetName='utf8', collationName='utf8_general_ci', columnType='varchar(64)', columnKey='', extra='', privileges='select,insert,update,references', columnComment='', generationExpression=''}*/
private String objectSchema;

/**Column{tableCatalog='def', tableSchema='sys', tableName='schema_tables_with_full_table_scans', columnName='object_name', ordinalPosition=2, columnDefault='null', isNullable='YES', dataType='varchar', characterMaximumLength=64, characterOctetLength=192, numericPrecision=0, numericScale=0, datetimePrecision=0, characterSetName='utf8', collationName='utf8_general_ci', columnType='varchar(64)', columnKey='', extra='', privileges='select,insert,update,references', columnComment='', generationExpression=''}*/
private String objectName;

/**Column{tableCatalog='def', tableSchema='sys', tableName='schema_tables_with_full_table_scans', columnName='rows_full_scanned', ordinalPosition=3, columnDefault='null', isNullable='NO', dataType='bigint', characterMaximumLength=0, characterOctetLength=0, numericPrecision=20, numericScale=0, datetimePrecision=0, characterSetName='null', collationName='null', columnType='bigint(20) unsigned', columnKey='', extra='', privileges='select,insert,update,references', columnComment='', generationExpression=''}*/
private Long rowsFullScanned;

/**Column{tableCatalog='def', tableSchema='sys', tableName='schema_tables_with_full_table_scans', columnName='latency', ordinalPosition=4, columnDefault='null', isNullable='YES', dataType='text', characterMaximumLength=65535, characterOctetLength=65535, numericPrecision=0, numericScale=0, datetimePrecision=0, characterSetName='utf8', collationName='utf8_general_ci', columnType='text', columnKey='', extra='', privileges='select,insert,update,references', columnComment='', generationExpression=''}*/
private String latency;

public String getObjectSchema(){
return objectSchema;
}

public String getObjectName(){
return objectName;
}

public Long getRowsFullScanned(){
return rowsFullScanned;
}

public String getLatency(){
return latency;
}

}