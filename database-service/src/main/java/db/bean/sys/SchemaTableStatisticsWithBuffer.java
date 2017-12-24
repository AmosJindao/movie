package db.bean.sys;


/* SELECT table_schema AS tableSchema, table_name AS tableName, rows_fetched AS rowsFetched, fetch_latency AS fetchLatency, rows_inserted AS rowsInserted, insert_latency AS insertLatency, rows_updated AS rowsUpdated, update_latency AS updateLatency, rows_deleted AS rowsDeleted, delete_latency AS deleteLatency, io_read_requests AS ioReadRequests, io_read AS ioRead, io_read_latency AS ioReadLatency, io_write_requests AS ioWriteRequests, io_write AS ioWrite, io_write_latency AS ioWriteLatency, io_misc_requests AS ioMiscRequests, io_misc_latency AS ioMiscLatency, innodb_buffer_allocated AS innodbBufferAllocated, innodb_buffer_data AS innodbBufferData, innodb_buffer_free AS innodbBufferFree, innodb_buffer_pages AS innodbBufferPages, innodb_buffer_pages_hashed AS innodbBufferPagesHashed, innodb_buffer_pages_old AS innodbBufferPagesOld, innodb_buffer_rows_cached AS innodbBufferRowsCached FROM sys.schema_table_statistics_with_buffer */
/**VIEW
*/
public class SchemaTableStatisticsWithBuffer{
/**Column{tableCatalog='def', tableSchema='sys', tableName='schema_table_statistics_with_buffer', columnName='table_schema', ordinalPosition=1, columnDefault='null', isNullable='YES', dataType='varchar', characterMaximumLength=64, characterOctetLength=192, numericPrecision=0, numericScale=0, datetimePrecision=0, characterSetName='utf8', collationName='utf8_general_ci', columnType='varchar(64)', columnKey='', extra='', privileges='select,insert,update,references', columnComment='', generationExpression=''}*/
private String tableSchema;

/**Column{tableCatalog='def', tableSchema='sys', tableName='schema_table_statistics_with_buffer', columnName='table_name', ordinalPosition=2, columnDefault='null', isNullable='YES', dataType='varchar', characterMaximumLength=64, characterOctetLength=192, numericPrecision=0, numericScale=0, datetimePrecision=0, characterSetName='utf8', collationName='utf8_general_ci', columnType='varchar(64)', columnKey='', extra='', privileges='select,insert,update,references', columnComment='', generationExpression=''}*/
private String tableName;

/**Column{tableCatalog='def', tableSchema='sys', tableName='schema_table_statistics_with_buffer', columnName='rows_fetched', ordinalPosition=3, columnDefault='null', isNullable='NO', dataType='bigint', characterMaximumLength=0, characterOctetLength=0, numericPrecision=20, numericScale=0, datetimePrecision=0, characterSetName='null', collationName='null', columnType='bigint(20) unsigned', columnKey='', extra='', privileges='select,insert,update,references', columnComment='', generationExpression=''}*/
private Long rowsFetched;

/**Column{tableCatalog='def', tableSchema='sys', tableName='schema_table_statistics_with_buffer', columnName='fetch_latency', ordinalPosition=4, columnDefault='null', isNullable='YES', dataType='text', characterMaximumLength=65535, characterOctetLength=65535, numericPrecision=0, numericScale=0, datetimePrecision=0, characterSetName='utf8', collationName='utf8_general_ci', columnType='text', columnKey='', extra='', privileges='select,insert,update,references', columnComment='', generationExpression=''}*/
private String fetchLatency;

/**Column{tableCatalog='def', tableSchema='sys', tableName='schema_table_statistics_with_buffer', columnName='rows_inserted', ordinalPosition=5, columnDefault='null', isNullable='NO', dataType='bigint', characterMaximumLength=0, characterOctetLength=0, numericPrecision=20, numericScale=0, datetimePrecision=0, characterSetName='null', collationName='null', columnType='bigint(20) unsigned', columnKey='', extra='', privileges='select,insert,update,references', columnComment='', generationExpression=''}*/
private Long rowsInserted;

/**Column{tableCatalog='def', tableSchema='sys', tableName='schema_table_statistics_with_buffer', columnName='insert_latency', ordinalPosition=6, columnDefault='null', isNullable='YES', dataType='text', characterMaximumLength=65535, characterOctetLength=65535, numericPrecision=0, numericScale=0, datetimePrecision=0, characterSetName='utf8', collationName='utf8_general_ci', columnType='text', columnKey='', extra='', privileges='select,insert,update,references', columnComment='', generationExpression=''}*/
private String insertLatency;

/**Column{tableCatalog='def', tableSchema='sys', tableName='schema_table_statistics_with_buffer', columnName='rows_updated', ordinalPosition=7, columnDefault='null', isNullable='NO', dataType='bigint', characterMaximumLength=0, characterOctetLength=0, numericPrecision=20, numericScale=0, datetimePrecision=0, characterSetName='null', collationName='null', columnType='bigint(20) unsigned', columnKey='', extra='', privileges='select,insert,update,references', columnComment='', generationExpression=''}*/
private Long rowsUpdated;

/**Column{tableCatalog='def', tableSchema='sys', tableName='schema_table_statistics_with_buffer', columnName='update_latency', ordinalPosition=8, columnDefault='null', isNullable='YES', dataType='text', characterMaximumLength=65535, characterOctetLength=65535, numericPrecision=0, numericScale=0, datetimePrecision=0, characterSetName='utf8', collationName='utf8_general_ci', columnType='text', columnKey='', extra='', privileges='select,insert,update,references', columnComment='', generationExpression=''}*/
private String updateLatency;

/**Column{tableCatalog='def', tableSchema='sys', tableName='schema_table_statistics_with_buffer', columnName='rows_deleted', ordinalPosition=9, columnDefault='null', isNullable='NO', dataType='bigint', characterMaximumLength=0, characterOctetLength=0, numericPrecision=20, numericScale=0, datetimePrecision=0, characterSetName='null', collationName='null', columnType='bigint(20) unsigned', columnKey='', extra='', privileges='select,insert,update,references', columnComment='', generationExpression=''}*/
private Long rowsDeleted;

/**Column{tableCatalog='def', tableSchema='sys', tableName='schema_table_statistics_with_buffer', columnName='delete_latency', ordinalPosition=10, columnDefault='null', isNullable='YES', dataType='text', characterMaximumLength=65535, characterOctetLength=65535, numericPrecision=0, numericScale=0, datetimePrecision=0, characterSetName='utf8', collationName='utf8_general_ci', columnType='text', columnKey='', extra='', privileges='select,insert,update,references', columnComment='', generationExpression=''}*/
private String deleteLatency;

/**Column{tableCatalog='def', tableSchema='sys', tableName='schema_table_statistics_with_buffer', columnName='io_read_requests', ordinalPosition=11, columnDefault='null', isNullable='YES', dataType='decimal', characterMaximumLength=0, characterOctetLength=0, numericPrecision=42, numericScale=0, datetimePrecision=0, characterSetName='null', collationName='null', columnType='decimal(42,0)', columnKey='', extra='', privileges='select,insert,update,references', columnComment='', generationExpression=''}*/
private Double ioReadRequests;

/**Column{tableCatalog='def', tableSchema='sys', tableName='schema_table_statistics_with_buffer', columnName='io_read', ordinalPosition=12, columnDefault='null', isNullable='YES', dataType='text', characterMaximumLength=65535, characterOctetLength=65535, numericPrecision=0, numericScale=0, datetimePrecision=0, characterSetName='utf8', collationName='utf8_general_ci', columnType='text', columnKey='', extra='', privileges='select,insert,update,references', columnComment='', generationExpression=''}*/
private String ioRead;

/**Column{tableCatalog='def', tableSchema='sys', tableName='schema_table_statistics_with_buffer', columnName='io_read_latency', ordinalPosition=13, columnDefault='null', isNullable='YES', dataType='text', characterMaximumLength=65535, characterOctetLength=65535, numericPrecision=0, numericScale=0, datetimePrecision=0, characterSetName='utf8', collationName='utf8_general_ci', columnType='text', columnKey='', extra='', privileges='select,insert,update,references', columnComment='', generationExpression=''}*/
private String ioReadLatency;

/**Column{tableCatalog='def', tableSchema='sys', tableName='schema_table_statistics_with_buffer', columnName='io_write_requests', ordinalPosition=14, columnDefault='null', isNullable='YES', dataType='decimal', characterMaximumLength=0, characterOctetLength=0, numericPrecision=42, numericScale=0, datetimePrecision=0, characterSetName='null', collationName='null', columnType='decimal(42,0)', columnKey='', extra='', privileges='select,insert,update,references', columnComment='', generationExpression=''}*/
private Double ioWriteRequests;

/**Column{tableCatalog='def', tableSchema='sys', tableName='schema_table_statistics_with_buffer', columnName='io_write', ordinalPosition=15, columnDefault='null', isNullable='YES', dataType='text', characterMaximumLength=65535, characterOctetLength=65535, numericPrecision=0, numericScale=0, datetimePrecision=0, characterSetName='utf8', collationName='utf8_general_ci', columnType='text', columnKey='', extra='', privileges='select,insert,update,references', columnComment='', generationExpression=''}*/
private String ioWrite;

/**Column{tableCatalog='def', tableSchema='sys', tableName='schema_table_statistics_with_buffer', columnName='io_write_latency', ordinalPosition=16, columnDefault='null', isNullable='YES', dataType='text', characterMaximumLength=65535, characterOctetLength=65535, numericPrecision=0, numericScale=0, datetimePrecision=0, characterSetName='utf8', collationName='utf8_general_ci', columnType='text', columnKey='', extra='', privileges='select,insert,update,references', columnComment='', generationExpression=''}*/
private String ioWriteLatency;

/**Column{tableCatalog='def', tableSchema='sys', tableName='schema_table_statistics_with_buffer', columnName='io_misc_requests', ordinalPosition=17, columnDefault='null', isNullable='YES', dataType='decimal', characterMaximumLength=0, characterOctetLength=0, numericPrecision=42, numericScale=0, datetimePrecision=0, characterSetName='null', collationName='null', columnType='decimal(42,0)', columnKey='', extra='', privileges='select,insert,update,references', columnComment='', generationExpression=''}*/
private Double ioMiscRequests;

/**Column{tableCatalog='def', tableSchema='sys', tableName='schema_table_statistics_with_buffer', columnName='io_misc_latency', ordinalPosition=18, columnDefault='null', isNullable='YES', dataType='text', characterMaximumLength=65535, characterOctetLength=65535, numericPrecision=0, numericScale=0, datetimePrecision=0, characterSetName='utf8', collationName='utf8_general_ci', columnType='text', columnKey='', extra='', privileges='select,insert,update,references', columnComment='', generationExpression=''}*/
private String ioMiscLatency;

/**Column{tableCatalog='def', tableSchema='sys', tableName='schema_table_statistics_with_buffer', columnName='innodb_buffer_allocated', ordinalPosition=19, columnDefault='null', isNullable='YES', dataType='text', characterMaximumLength=65535, characterOctetLength=65535, numericPrecision=0, numericScale=0, datetimePrecision=0, characterSetName='utf8', collationName='utf8_general_ci', columnType='text', columnKey='', extra='', privileges='select,insert,update,references', columnComment='', generationExpression=''}*/
private String innodbBufferAllocated;

/**Column{tableCatalog='def', tableSchema='sys', tableName='schema_table_statistics_with_buffer', columnName='innodb_buffer_data', ordinalPosition=20, columnDefault='null', isNullable='YES', dataType='text', characterMaximumLength=65535, characterOctetLength=65535, numericPrecision=0, numericScale=0, datetimePrecision=0, characterSetName='utf8', collationName='utf8_general_ci', columnType='text', columnKey='', extra='', privileges='select,insert,update,references', columnComment='', generationExpression=''}*/
private String innodbBufferData;

/**Column{tableCatalog='def', tableSchema='sys', tableName='schema_table_statistics_with_buffer', columnName='innodb_buffer_free', ordinalPosition=21, columnDefault='null', isNullable='YES', dataType='text', characterMaximumLength=65535, characterOctetLength=65535, numericPrecision=0, numericScale=0, datetimePrecision=0, characterSetName='utf8', collationName='utf8_general_ci', columnType='text', columnKey='', extra='', privileges='select,insert,update,references', columnComment='', generationExpression=''}*/
private String innodbBufferFree;

/**Column{tableCatalog='def', tableSchema='sys', tableName='schema_table_statistics_with_buffer', columnName='innodb_buffer_pages', ordinalPosition=22, columnDefault='0', isNullable='YES', dataType='bigint', characterMaximumLength=0, characterOctetLength=0, numericPrecision=19, numericScale=0, datetimePrecision=0, characterSetName='null', collationName='null', columnType='bigint(21)', columnKey='', extra='', privileges='select,insert,update,references', columnComment='', generationExpression=''}*/
private Long innodbBufferPages;

/**Column{tableCatalog='def', tableSchema='sys', tableName='schema_table_statistics_with_buffer', columnName='innodb_buffer_pages_hashed', ordinalPosition=23, columnDefault='0', isNullable='YES', dataType='bigint', characterMaximumLength=0, characterOctetLength=0, numericPrecision=19, numericScale=0, datetimePrecision=0, characterSetName='null', collationName='null', columnType='bigint(21)', columnKey='', extra='', privileges='select,insert,update,references', columnComment='', generationExpression=''}*/
private Long innodbBufferPagesHashed;

/**Column{tableCatalog='def', tableSchema='sys', tableName='schema_table_statistics_with_buffer', columnName='innodb_buffer_pages_old', ordinalPosition=24, columnDefault='0', isNullable='YES', dataType='bigint', characterMaximumLength=0, characterOctetLength=0, numericPrecision=19, numericScale=0, datetimePrecision=0, characterSetName='null', collationName='null', columnType='bigint(21)', columnKey='', extra='', privileges='select,insert,update,references', columnComment='', generationExpression=''}*/
private Long innodbBufferPagesOld;

/**Column{tableCatalog='def', tableSchema='sys', tableName='schema_table_statistics_with_buffer', columnName='innodb_buffer_rows_cached', ordinalPosition=25, columnDefault='0', isNullable='YES', dataType='decimal', characterMaximumLength=0, characterOctetLength=0, numericPrecision=44, numericScale=0, datetimePrecision=0, characterSetName='null', collationName='null', columnType='decimal(44,0)', columnKey='', extra='', privileges='select,insert,update,references', columnComment='', generationExpression=''}*/
private Double innodbBufferRowsCached;

public String getTableSchema(){
return tableSchema;
}

public String getTableName(){
return tableName;
}

public Long getRowsFetched(){
return rowsFetched;
}

public String getFetchLatency(){
return fetchLatency;
}

public Long getRowsInserted(){
return rowsInserted;
}

public String getInsertLatency(){
return insertLatency;
}

public Long getRowsUpdated(){
return rowsUpdated;
}

public String getUpdateLatency(){
return updateLatency;
}

public Long getRowsDeleted(){
return rowsDeleted;
}

public String getDeleteLatency(){
return deleteLatency;
}

public Double getIoReadRequests(){
return ioReadRequests;
}

public String getIoRead(){
return ioRead;
}

public String getIoReadLatency(){
return ioReadLatency;
}

public Double getIoWriteRequests(){
return ioWriteRequests;
}

public String getIoWrite(){
return ioWrite;
}

public String getIoWriteLatency(){
return ioWriteLatency;
}

public Double getIoMiscRequests(){
return ioMiscRequests;
}

public String getIoMiscLatency(){
return ioMiscLatency;
}

public String getInnodbBufferAllocated(){
return innodbBufferAllocated;
}

public String getInnodbBufferData(){
return innodbBufferData;
}

public String getInnodbBufferFree(){
return innodbBufferFree;
}

public Long getInnodbBufferPages(){
return innodbBufferPages;
}

public Long getInnodbBufferPagesHashed(){
return innodbBufferPagesHashed;
}

public Long getInnodbBufferPagesOld(){
return innodbBufferPagesOld;
}

public Double getInnodbBufferRowsCached(){
return innodbBufferRowsCached;
}

}