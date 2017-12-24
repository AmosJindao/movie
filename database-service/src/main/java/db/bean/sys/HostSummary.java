package db.bean.sys;


/* SELECT host AS host, statements AS statements, statement_latency AS statementLatency, statement_avg_latency AS statementAvgLatency, table_scans AS tableScans, file_ios AS fileIos, file_io_latency AS fileIoLatency, current_connections AS currentConnections, total_connections AS totalConnections, unique_users AS uniqueUsers, current_memory AS currentMemory, total_memory_allocated AS totalMemoryAllocated FROM sys.host_summary */
/**VIEW
*/
public class HostSummary{
/**Column{tableCatalog='def', tableSchema='sys', tableName='host_summary', columnName='host', ordinalPosition=1, columnDefault='null', isNullable='YES', dataType='varchar', characterMaximumLength=60, characterOctetLength=180, numericPrecision=0, numericScale=0, datetimePrecision=0, characterSetName='utf8', collationName='utf8_bin', columnType='varchar(60)', columnKey='', extra='', privileges='select,insert,update,references', columnComment='', generationExpression=''}*/
private String host;

/**Column{tableCatalog='def', tableSchema='sys', tableName='host_summary', columnName='statements', ordinalPosition=2, columnDefault='null', isNullable='YES', dataType='decimal', characterMaximumLength=0, characterOctetLength=0, numericPrecision=64, numericScale=0, datetimePrecision=0, characterSetName='null', collationName='null', columnType='decimal(64,0)', columnKey='', extra='', privileges='select,insert,update,references', columnComment='', generationExpression=''}*/
private Double statements;

/**Column{tableCatalog='def', tableSchema='sys', tableName='host_summary', columnName='statement_latency', ordinalPosition=3, columnDefault='null', isNullable='YES', dataType='text', characterMaximumLength=65535, characterOctetLength=65535, numericPrecision=0, numericScale=0, datetimePrecision=0, characterSetName='utf8', collationName='utf8_general_ci', columnType='text', columnKey='', extra='', privileges='select,insert,update,references', columnComment='', generationExpression=''}*/
private String statementLatency;

/**Column{tableCatalog='def', tableSchema='sys', tableName='host_summary', columnName='statement_avg_latency', ordinalPosition=4, columnDefault='null', isNullable='YES', dataType='text', characterMaximumLength=65535, characterOctetLength=65535, numericPrecision=0, numericScale=0, datetimePrecision=0, characterSetName='utf8', collationName='utf8_general_ci', columnType='text', columnKey='', extra='', privileges='select,insert,update,references', columnComment='', generationExpression=''}*/
private String statementAvgLatency;

/**Column{tableCatalog='def', tableSchema='sys', tableName='host_summary', columnName='table_scans', ordinalPosition=5, columnDefault='null', isNullable='YES', dataType='decimal', characterMaximumLength=0, characterOctetLength=0, numericPrecision=65, numericScale=0, datetimePrecision=0, characterSetName='null', collationName='null', columnType='decimal(65,0)', columnKey='', extra='', privileges='select,insert,update,references', columnComment='', generationExpression=''}*/
private Double tableScans;

/**Column{tableCatalog='def', tableSchema='sys', tableName='host_summary', columnName='file_ios', ordinalPosition=6, columnDefault='null', isNullable='YES', dataType='decimal', characterMaximumLength=0, characterOctetLength=0, numericPrecision=64, numericScale=0, datetimePrecision=0, characterSetName='null', collationName='null', columnType='decimal(64,0)', columnKey='', extra='', privileges='select,insert,update,references', columnComment='', generationExpression=''}*/
private Double fileIos;

/**Column{tableCatalog='def', tableSchema='sys', tableName='host_summary', columnName='file_io_latency', ordinalPosition=7, columnDefault='null', isNullable='YES', dataType='text', characterMaximumLength=65535, characterOctetLength=65535, numericPrecision=0, numericScale=0, datetimePrecision=0, characterSetName='utf8', collationName='utf8_general_ci', columnType='text', columnKey='', extra='', privileges='select,insert,update,references', columnComment='', generationExpression=''}*/
private String fileIoLatency;

/**Column{tableCatalog='def', tableSchema='sys', tableName='host_summary', columnName='current_connections', ordinalPosition=8, columnDefault='null', isNullable='YES', dataType='decimal', characterMaximumLength=0, characterOctetLength=0, numericPrecision=41, numericScale=0, datetimePrecision=0, characterSetName='null', collationName='null', columnType='decimal(41,0)', columnKey='', extra='', privileges='select,insert,update,references', columnComment='', generationExpression=''}*/
private Double currentConnections;

/**Column{tableCatalog='def', tableSchema='sys', tableName='host_summary', columnName='total_connections', ordinalPosition=9, columnDefault='null', isNullable='YES', dataType='decimal', characterMaximumLength=0, characterOctetLength=0, numericPrecision=41, numericScale=0, datetimePrecision=0, characterSetName='null', collationName='null', columnType='decimal(41,0)', columnKey='', extra='', privileges='select,insert,update,references', columnComment='', generationExpression=''}*/
private Double totalConnections;

/**Column{tableCatalog='def', tableSchema='sys', tableName='host_summary', columnName='unique_users', ordinalPosition=10, columnDefault='0', isNullable='NO', dataType='bigint', characterMaximumLength=0, characterOctetLength=0, numericPrecision=19, numericScale=0, datetimePrecision=0, characterSetName='null', collationName='null', columnType='bigint(21)', columnKey='', extra='', privileges='select,insert,update,references', columnComment='', generationExpression=''}*/
private Long uniqueUsers;

/**Column{tableCatalog='def', tableSchema='sys', tableName='host_summary', columnName='current_memory', ordinalPosition=11, columnDefault='null', isNullable='YES', dataType='text', characterMaximumLength=65535, characterOctetLength=65535, numericPrecision=0, numericScale=0, datetimePrecision=0, characterSetName='utf8', collationName='utf8_general_ci', columnType='text', columnKey='', extra='', privileges='select,insert,update,references', columnComment='', generationExpression=''}*/
private String currentMemory;

/**Column{tableCatalog='def', tableSchema='sys', tableName='host_summary', columnName='total_memory_allocated', ordinalPosition=12, columnDefault='null', isNullable='YES', dataType='text', characterMaximumLength=65535, characterOctetLength=65535, numericPrecision=0, numericScale=0, datetimePrecision=0, characterSetName='utf8', collationName='utf8_general_ci', columnType='text', columnKey='', extra='', privileges='select,insert,update,references', columnComment='', generationExpression=''}*/
private String totalMemoryAllocated;

public String getHost(){
return host;
}

public Double getStatements(){
return statements;
}

public String getStatementLatency(){
return statementLatency;
}

public String getStatementAvgLatency(){
return statementAvgLatency;
}

public Double getTableScans(){
return tableScans;
}

public Double getFileIos(){
return fileIos;
}

public String getFileIoLatency(){
return fileIoLatency;
}

public Double getCurrentConnections(){
return currentConnections;
}

public Double getTotalConnections(){
return totalConnections;
}

public Long getUniqueUsers(){
return uniqueUsers;
}

public String getCurrentMemory(){
return currentMemory;
}

public String getTotalMemoryAllocated(){
return totalMemoryAllocated;
}

}