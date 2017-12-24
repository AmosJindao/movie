package db.bean.sys;

import java.util.Date;

/* SELECT query AS query, db AS db, exec_count AS execCount, total_latency AS totalLatency, memory_tmp_tables AS memoryTmpTables, disk_tmp_tables AS diskTmpTables, avg_tmp_tables_per_query AS avgTmpTablesPerQuery, tmp_tables_to_disk_pct AS tmpTablesToDiskPct, first_seen AS firstSeen, last_seen AS lastSeen, digest AS digest FROM sys.statements_with_temp_tables */
/**VIEW
*/
public class StatementsWithTempTables{
/**Column{tableCatalog='def', tableSchema='sys', tableName='statements_with_temp_tables', columnName='query', ordinalPosition=1, columnDefault='null', isNullable='YES', dataType='longtext', characterMaximumLength=4294967295, characterOctetLength=4294967295, numericPrecision=0, numericScale=0, datetimePrecision=0, characterSetName='utf8', collationName='utf8_general_ci', columnType='longtext', columnKey='', extra='', privileges='select,insert,update,references', columnComment='', generationExpression=''}*/
private String query;

/**Column{tableCatalog='def', tableSchema='sys', tableName='statements_with_temp_tables', columnName='db', ordinalPosition=2, columnDefault='null', isNullable='YES', dataType='varchar', characterMaximumLength=64, characterOctetLength=192, numericPrecision=0, numericScale=0, datetimePrecision=0, characterSetName='utf8', collationName='utf8_general_ci', columnType='varchar(64)', columnKey='', extra='', privileges='select,insert,update,references', columnComment='', generationExpression=''}*/
private String db;

/**Column{tableCatalog='def', tableSchema='sys', tableName='statements_with_temp_tables', columnName='exec_count', ordinalPosition=3, columnDefault='null', isNullable='NO', dataType='bigint', characterMaximumLength=0, characterOctetLength=0, numericPrecision=20, numericScale=0, datetimePrecision=0, characterSetName='null', collationName='null', columnType='bigint(20) unsigned', columnKey='', extra='', privileges='select,insert,update,references', columnComment='', generationExpression=''}*/
private Long execCount;

/**Column{tableCatalog='def', tableSchema='sys', tableName='statements_with_temp_tables', columnName='total_latency', ordinalPosition=4, columnDefault='null', isNullable='YES', dataType='text', characterMaximumLength=65535, characterOctetLength=65535, numericPrecision=0, numericScale=0, datetimePrecision=0, characterSetName='utf8', collationName='utf8_general_ci', columnType='text', columnKey='', extra='', privileges='select,insert,update,references', columnComment='', generationExpression=''}*/
private String totalLatency;

/**Column{tableCatalog='def', tableSchema='sys', tableName='statements_with_temp_tables', columnName='memory_tmp_tables', ordinalPosition=5, columnDefault='null', isNullable='NO', dataType='bigint', characterMaximumLength=0, characterOctetLength=0, numericPrecision=20, numericScale=0, datetimePrecision=0, characterSetName='null', collationName='null', columnType='bigint(20) unsigned', columnKey='', extra='', privileges='select,insert,update,references', columnComment='', generationExpression=''}*/
private Long memoryTmpTables;

/**Column{tableCatalog='def', tableSchema='sys', tableName='statements_with_temp_tables', columnName='disk_tmp_tables', ordinalPosition=6, columnDefault='null', isNullable='NO', dataType='bigint', characterMaximumLength=0, characterOctetLength=0, numericPrecision=20, numericScale=0, datetimePrecision=0, characterSetName='null', collationName='null', columnType='bigint(20) unsigned', columnKey='', extra='', privileges='select,insert,update,references', columnComment='', generationExpression=''}*/
private Long diskTmpTables;

/**Column{tableCatalog='def', tableSchema='sys', tableName='statements_with_temp_tables', columnName='avg_tmp_tables_per_query', ordinalPosition=7, columnDefault='0', isNullable='NO', dataType='decimal', characterMaximumLength=0, characterOctetLength=0, numericPrecision=21, numericScale=0, datetimePrecision=0, characterSetName='null', collationName='null', columnType='decimal(21,0)', columnKey='', extra='', privileges='select,insert,update,references', columnComment='', generationExpression=''}*/
private Double avgTmpTablesPerQuery;

/**Column{tableCatalog='def', tableSchema='sys', tableName='statements_with_temp_tables', columnName='tmp_tables_to_disk_pct', ordinalPosition=8, columnDefault='0', isNullable='NO', dataType='decimal', characterMaximumLength=0, characterOctetLength=0, numericPrecision=24, numericScale=0, datetimePrecision=0, characterSetName='null', collationName='null', columnType='decimal(24,0)', columnKey='', extra='', privileges='select,insert,update,references', columnComment='', generationExpression=''}*/
private Double tmpTablesToDiskPct;

/**Column{tableCatalog='def', tableSchema='sys', tableName='statements_with_temp_tables', columnName='first_seen', ordinalPosition=9, columnDefault='0000-00-00 00:00:00', isNullable='NO', dataType='timestamp', characterMaximumLength=0, characterOctetLength=0, numericPrecision=0, numericScale=0, datetimePrecision=0, characterSetName='null', collationName='null', columnType='timestamp', columnKey='', extra='', privileges='select,insert,update,references', columnComment='', generationExpression=''}*/
private Date firstSeen;

/**Column{tableCatalog='def', tableSchema='sys', tableName='statements_with_temp_tables', columnName='last_seen', ordinalPosition=10, columnDefault='0000-00-00 00:00:00', isNullable='NO', dataType='timestamp', characterMaximumLength=0, characterOctetLength=0, numericPrecision=0, numericScale=0, datetimePrecision=0, characterSetName='null', collationName='null', columnType='timestamp', columnKey='', extra='', privileges='select,insert,update,references', columnComment='', generationExpression=''}*/
private Date lastSeen;

/**Column{tableCatalog='def', tableSchema='sys', tableName='statements_with_temp_tables', columnName='digest', ordinalPosition=11, columnDefault='null', isNullable='YES', dataType='varchar', characterMaximumLength=32, characterOctetLength=96, numericPrecision=0, numericScale=0, datetimePrecision=0, characterSetName='utf8', collationName='utf8_general_ci', columnType='varchar(32)', columnKey='', extra='', privileges='select,insert,update,references', columnComment='', generationExpression=''}*/
private String digest;

public String getQuery(){
return query;
}

public String getDb(){
return db;
}

public Long getExecCount(){
return execCount;
}

public String getTotalLatency(){
return totalLatency;
}

public Long getMemoryTmpTables(){
return memoryTmpTables;
}

public Long getDiskTmpTables(){
return diskTmpTables;
}

public Double getAvgTmpTablesPerQuery(){
return avgTmpTablesPerQuery;
}

public Double getTmpTablesToDiskPct(){
return tmpTablesToDiskPct;
}

public Date getFirstSeen(){
return firstSeen;
}

public Date getLastSeen(){
return lastSeen;
}

public String getDigest(){
return digest;
}

}