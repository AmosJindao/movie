package db.bean.sys;


/**VIEW
*/
public class X$schemaTableStatistics{
/**Column{tableCatalog='def', tableSchema='sys', tableName='x$schema_table_statistics', columnName='table_schema', ordinalPosition=1, columnDefault='null', isNullable='YES', dataType='varchar', characterMaximumLength=64, characterOctetLength=192, numericPrecision=0, numericScale=0, datetimePrecision=0, characterSetName='utf8', collationName='utf8_general_ci', columnType='varchar(64)', columnKey='', extra='', privileges='select,insert,update,references', columnComment='', generationExpression=''}*/
private String tableSchema;

/**Column{tableCatalog='def', tableSchema='sys', tableName='x$schema_table_statistics', columnName='table_name', ordinalPosition=2, columnDefault='null', isNullable='YES', dataType='varchar', characterMaximumLength=64, characterOctetLength=192, numericPrecision=0, numericScale=0, datetimePrecision=0, characterSetName='utf8', collationName='utf8_general_ci', columnType='varchar(64)', columnKey='', extra='', privileges='select,insert,update,references', columnComment='', generationExpression=''}*/
private String tableName;

/**Column{tableCatalog='def', tableSchema='sys', tableName='x$schema_table_statistics', columnName='total_latency', ordinalPosition=3, columnDefault='null', isNullable='NO', dataType='bigint', characterMaximumLength=0, characterOctetLength=0, numericPrecision=20, numericScale=0, datetimePrecision=0, characterSetName='null', collationName='null', columnType='bigint(20) unsigned', columnKey='', extra='', privileges='select,insert,update,references', columnComment='', generationExpression=''}*/
private Long totalLatency;

/**Column{tableCatalog='def', tableSchema='sys', tableName='x$schema_table_statistics', columnName='rows_fetched', ordinalPosition=4, columnDefault='null', isNullable='NO', dataType='bigint', characterMaximumLength=0, characterOctetLength=0, numericPrecision=20, numericScale=0, datetimePrecision=0, characterSetName='null', collationName='null', columnType='bigint(20) unsigned', columnKey='', extra='', privileges='select,insert,update,references', columnComment='', generationExpression=''}*/
private Long rowsFetched;

/**Column{tableCatalog='def', tableSchema='sys', tableName='x$schema_table_statistics', columnName='fetch_latency', ordinalPosition=5, columnDefault='null', isNullable='NO', dataType='bigint', characterMaximumLength=0, characterOctetLength=0, numericPrecision=20, numericScale=0, datetimePrecision=0, characterSetName='null', collationName='null', columnType='bigint(20) unsigned', columnKey='', extra='', privileges='select,insert,update,references', columnComment='', generationExpression=''}*/
private Long fetchLatency;

/**Column{tableCatalog='def', tableSchema='sys', tableName='x$schema_table_statistics', columnName='rows_inserted', ordinalPosition=6, columnDefault='null', isNullable='NO', dataType='bigint', characterMaximumLength=0, characterOctetLength=0, numericPrecision=20, numericScale=0, datetimePrecision=0, characterSetName='null', collationName='null', columnType='bigint(20) unsigned', columnKey='', extra='', privileges='select,insert,update,references', columnComment='', generationExpression=''}*/
private Long rowsInserted;

/**Column{tableCatalog='def', tableSchema='sys', tableName='x$schema_table_statistics', columnName='insert_latency', ordinalPosition=7, columnDefault='null', isNullable='NO', dataType='bigint', characterMaximumLength=0, characterOctetLength=0, numericPrecision=20, numericScale=0, datetimePrecision=0, characterSetName='null', collationName='null', columnType='bigint(20) unsigned', columnKey='', extra='', privileges='select,insert,update,references', columnComment='', generationExpression=''}*/
private Long insertLatency;

/**Column{tableCatalog='def', tableSchema='sys', tableName='x$schema_table_statistics', columnName='rows_updated', ordinalPosition=8, columnDefault='null', isNullable='NO', dataType='bigint', characterMaximumLength=0, characterOctetLength=0, numericPrecision=20, numericScale=0, datetimePrecision=0, characterSetName='null', collationName='null', columnType='bigint(20) unsigned', columnKey='', extra='', privileges='select,insert,update,references', columnComment='', generationExpression=''}*/
private Long rowsUpdated;

/**Column{tableCatalog='def', tableSchema='sys', tableName='x$schema_table_statistics', columnName='update_latency', ordinalPosition=9, columnDefault='null', isNullable='NO', dataType='bigint', characterMaximumLength=0, characterOctetLength=0, numericPrecision=20, numericScale=0, datetimePrecision=0, characterSetName='null', collationName='null', columnType='bigint(20) unsigned', columnKey='', extra='', privileges='select,insert,update,references', columnComment='', generationExpression=''}*/
private Long updateLatency;

/**Column{tableCatalog='def', tableSchema='sys', tableName='x$schema_table_statistics', columnName='rows_deleted', ordinalPosition=10, columnDefault='null', isNullable='NO', dataType='bigint', characterMaximumLength=0, characterOctetLength=0, numericPrecision=20, numericScale=0, datetimePrecision=0, characterSetName='null', collationName='null', columnType='bigint(20) unsigned', columnKey='', extra='', privileges='select,insert,update,references', columnComment='', generationExpression=''}*/
private Long rowsDeleted;

/**Column{tableCatalog='def', tableSchema='sys', tableName='x$schema_table_statistics', columnName='delete_latency', ordinalPosition=11, columnDefault='null', isNullable='NO', dataType='bigint', characterMaximumLength=0, characterOctetLength=0, numericPrecision=20, numericScale=0, datetimePrecision=0, characterSetName='null', collationName='null', columnType='bigint(20) unsigned', columnKey='', extra='', privileges='select,insert,update,references', columnComment='', generationExpression=''}*/
private Long deleteLatency;

/**Column{tableCatalog='def', tableSchema='sys', tableName='x$schema_table_statistics', columnName='io_read_requests', ordinalPosition=12, columnDefault='null', isNullable='YES', dataType='decimal', characterMaximumLength=0, characterOctetLength=0, numericPrecision=42, numericScale=0, datetimePrecision=0, characterSetName='null', collationName='null', columnType='decimal(42,0)', columnKey='', extra='', privileges='select,insert,update,references', columnComment='', generationExpression=''}*/
private Double ioReadRequests;

/**Column{tableCatalog='def', tableSchema='sys', tableName='x$schema_table_statistics', columnName='io_read', ordinalPosition=13, columnDefault='null', isNullable='YES', dataType='decimal', characterMaximumLength=0, characterOctetLength=0, numericPrecision=41, numericScale=0, datetimePrecision=0, characterSetName='null', collationName='null', columnType='decimal(41,0)', columnKey='', extra='', privileges='select,insert,update,references', columnComment='', generationExpression=''}*/
private Double ioRead;

/**Column{tableCatalog='def', tableSchema='sys', tableName='x$schema_table_statistics', columnName='io_read_latency', ordinalPosition=14, columnDefault='null', isNullable='YES', dataType='decimal', characterMaximumLength=0, characterOctetLength=0, numericPrecision=42, numericScale=0, datetimePrecision=0, characterSetName='null', collationName='null', columnType='decimal(42,0)', columnKey='', extra='', privileges='select,insert,update,references', columnComment='', generationExpression=''}*/
private Double ioReadLatency;

/**Column{tableCatalog='def', tableSchema='sys', tableName='x$schema_table_statistics', columnName='io_write_requests', ordinalPosition=15, columnDefault='null', isNullable='YES', dataType='decimal', characterMaximumLength=0, characterOctetLength=0, numericPrecision=42, numericScale=0, datetimePrecision=0, characterSetName='null', collationName='null', columnType='decimal(42,0)', columnKey='', extra='', privileges='select,insert,update,references', columnComment='', generationExpression=''}*/
private Double ioWriteRequests;

/**Column{tableCatalog='def', tableSchema='sys', tableName='x$schema_table_statistics', columnName='io_write', ordinalPosition=16, columnDefault='null', isNullable='YES', dataType='decimal', characterMaximumLength=0, characterOctetLength=0, numericPrecision=41, numericScale=0, datetimePrecision=0, characterSetName='null', collationName='null', columnType='decimal(41,0)', columnKey='', extra='', privileges='select,insert,update,references', columnComment='', generationExpression=''}*/
private Double ioWrite;

/**Column{tableCatalog='def', tableSchema='sys', tableName='x$schema_table_statistics', columnName='io_write_latency', ordinalPosition=17, columnDefault='null', isNullable='YES', dataType='decimal', characterMaximumLength=0, characterOctetLength=0, numericPrecision=42, numericScale=0, datetimePrecision=0, characterSetName='null', collationName='null', columnType='decimal(42,0)', columnKey='', extra='', privileges='select,insert,update,references', columnComment='', generationExpression=''}*/
private Double ioWriteLatency;

/**Column{tableCatalog='def', tableSchema='sys', tableName='x$schema_table_statistics', columnName='io_misc_requests', ordinalPosition=18, columnDefault='null', isNullable='YES', dataType='decimal', characterMaximumLength=0, characterOctetLength=0, numericPrecision=42, numericScale=0, datetimePrecision=0, characterSetName='null', collationName='null', columnType='decimal(42,0)', columnKey='', extra='', privileges='select,insert,update,references', columnComment='', generationExpression=''}*/
private Double ioMiscRequests;

/**Column{tableCatalog='def', tableSchema='sys', tableName='x$schema_table_statistics', columnName='io_misc_latency', ordinalPosition=19, columnDefault='null', isNullable='YES', dataType='decimal', characterMaximumLength=0, characterOctetLength=0, numericPrecision=42, numericScale=0, datetimePrecision=0, characterSetName='null', collationName='null', columnType='decimal(42,0)', columnKey='', extra='', privileges='select,insert,update,references', columnComment='', generationExpression=''}*/
private Double ioMiscLatency;

public String getTableSchema(){
return tableSchema;
}

public String getTableName(){
return tableName;
}

public Long getTotalLatency(){
return totalLatency;
}

public Long getRowsFetched(){
return rowsFetched;
}

public Long getFetchLatency(){
return fetchLatency;
}

public Long getRowsInserted(){
return rowsInserted;
}

public Long getInsertLatency(){
return insertLatency;
}

public Long getRowsUpdated(){
return rowsUpdated;
}

public Long getUpdateLatency(){
return updateLatency;
}

public Long getRowsDeleted(){
return rowsDeleted;
}

public Long getDeleteLatency(){
return deleteLatency;
}

public Double getIoReadRequests(){
return ioReadRequests;
}

public Double getIoRead(){
return ioRead;
}

public Double getIoReadLatency(){
return ioReadLatency;
}

public Double getIoWriteRequests(){
return ioWriteRequests;
}

public Double getIoWrite(){
return ioWrite;
}

public Double getIoWriteLatency(){
return ioWriteLatency;
}

public Double getIoMiscRequests(){
return ioMiscRequests;
}

public Double getIoMiscLatency(){
return ioMiscLatency;
}

}