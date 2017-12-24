package db.bean.sys;

import java.util.Date;

/* SELECT query AS query, db AS db, full_scan AS fullScan, exec_count AS execCount, err_count AS errCount, warn_count AS warnCount, total_latency AS totalLatency, max_latency AS maxLatency, avg_latency AS avgLatency, rows_sent AS rowsSent, rows_sent_avg AS rowsSentAvg, rows_examined AS rowsExamined, rows_examined_avg AS rowsExaminedAvg, first_seen AS firstSeen, last_seen AS lastSeen, digest AS digest FROM sys.statements_with_runtimes_in_95th_percentile */
/**VIEW
*/
public class StatementsWithRuntimesIn95thPercentile{
/**Column{tableCatalog='def', tableSchema='sys', tableName='statements_with_runtimes_in_95th_percentile', columnName='query', ordinalPosition=1, columnDefault='null', isNullable='YES', dataType='longtext', characterMaximumLength=4294967295, characterOctetLength=4294967295, numericPrecision=0, numericScale=0, datetimePrecision=0, characterSetName='utf8', collationName='utf8_general_ci', columnType='longtext', columnKey='', extra='', privileges='select,insert,update,references', columnComment='', generationExpression=''}*/
private String query;

/**Column{tableCatalog='def', tableSchema='sys', tableName='statements_with_runtimes_in_95th_percentile', columnName='db', ordinalPosition=2, columnDefault='null', isNullable='YES', dataType='varchar', characterMaximumLength=64, characterOctetLength=192, numericPrecision=0, numericScale=0, datetimePrecision=0, characterSetName='utf8', collationName='utf8_general_ci', columnType='varchar(64)', columnKey='', extra='', privileges='select,insert,update,references', columnComment='', generationExpression=''}*/
private String db;

/**Column{tableCatalog='def', tableSchema='sys', tableName='statements_with_runtimes_in_95th_percentile', columnName='full_scan', ordinalPosition=3, columnDefault='', isNullable='NO', dataType='varchar', characterMaximumLength=1, characterOctetLength=3, numericPrecision=0, numericScale=0, datetimePrecision=0, characterSetName='utf8', collationName='utf8_general_ci', columnType='varchar(1)', columnKey='', extra='', privileges='select,insert,update,references', columnComment='', generationExpression=''}*/
private String fullScan;

/**Column{tableCatalog='def', tableSchema='sys', tableName='statements_with_runtimes_in_95th_percentile', columnName='exec_count', ordinalPosition=4, columnDefault='null', isNullable='NO', dataType='bigint', characterMaximumLength=0, characterOctetLength=0, numericPrecision=20, numericScale=0, datetimePrecision=0, characterSetName='null', collationName='null', columnType='bigint(20) unsigned', columnKey='', extra='', privileges='select,insert,update,references', columnComment='', generationExpression=''}*/
private Long execCount;

/**Column{tableCatalog='def', tableSchema='sys', tableName='statements_with_runtimes_in_95th_percentile', columnName='err_count', ordinalPosition=5, columnDefault='null', isNullable='NO', dataType='bigint', characterMaximumLength=0, characterOctetLength=0, numericPrecision=20, numericScale=0, datetimePrecision=0, characterSetName='null', collationName='null', columnType='bigint(20) unsigned', columnKey='', extra='', privileges='select,insert,update,references', columnComment='', generationExpression=''}*/
private Long errCount;

/**Column{tableCatalog='def', tableSchema='sys', tableName='statements_with_runtimes_in_95th_percentile', columnName='warn_count', ordinalPosition=6, columnDefault='null', isNullable='NO', dataType='bigint', characterMaximumLength=0, characterOctetLength=0, numericPrecision=20, numericScale=0, datetimePrecision=0, characterSetName='null', collationName='null', columnType='bigint(20) unsigned', columnKey='', extra='', privileges='select,insert,update,references', columnComment='', generationExpression=''}*/
private Long warnCount;

/**Column{tableCatalog='def', tableSchema='sys', tableName='statements_with_runtimes_in_95th_percentile', columnName='total_latency', ordinalPosition=7, columnDefault='null', isNullable='YES', dataType='text', characterMaximumLength=65535, characterOctetLength=65535, numericPrecision=0, numericScale=0, datetimePrecision=0, characterSetName='utf8', collationName='utf8_general_ci', columnType='text', columnKey='', extra='', privileges='select,insert,update,references', columnComment='', generationExpression=''}*/
private String totalLatency;

/**Column{tableCatalog='def', tableSchema='sys', tableName='statements_with_runtimes_in_95th_percentile', columnName='max_latency', ordinalPosition=8, columnDefault='null', isNullable='YES', dataType='text', characterMaximumLength=65535, characterOctetLength=65535, numericPrecision=0, numericScale=0, datetimePrecision=0, characterSetName='utf8', collationName='utf8_general_ci', columnType='text', columnKey='', extra='', privileges='select,insert,update,references', columnComment='', generationExpression=''}*/
private String maxLatency;

/**Column{tableCatalog='def', tableSchema='sys', tableName='statements_with_runtimes_in_95th_percentile', columnName='avg_latency', ordinalPosition=9, columnDefault='null', isNullable='YES', dataType='text', characterMaximumLength=65535, characterOctetLength=65535, numericPrecision=0, numericScale=0, datetimePrecision=0, characterSetName='utf8', collationName='utf8_general_ci', columnType='text', columnKey='', extra='', privileges='select,insert,update,references', columnComment='', generationExpression=''}*/
private String avgLatency;

/**Column{tableCatalog='def', tableSchema='sys', tableName='statements_with_runtimes_in_95th_percentile', columnName='rows_sent', ordinalPosition=10, columnDefault='null', isNullable='NO', dataType='bigint', characterMaximumLength=0, characterOctetLength=0, numericPrecision=20, numericScale=0, datetimePrecision=0, characterSetName='null', collationName='null', columnType='bigint(20) unsigned', columnKey='', extra='', privileges='select,insert,update,references', columnComment='', generationExpression=''}*/
private Long rowsSent;

/**Column{tableCatalog='def', tableSchema='sys', tableName='statements_with_runtimes_in_95th_percentile', columnName='rows_sent_avg', ordinalPosition=11, columnDefault='0', isNullable='NO', dataType='decimal', characterMaximumLength=0, characterOctetLength=0, numericPrecision=21, numericScale=0, datetimePrecision=0, characterSetName='null', collationName='null', columnType='decimal(21,0)', columnKey='', extra='', privileges='select,insert,update,references', columnComment='', generationExpression=''}*/
private Double rowsSentAvg;

/**Column{tableCatalog='def', tableSchema='sys', tableName='statements_with_runtimes_in_95th_percentile', columnName='rows_examined', ordinalPosition=12, columnDefault='null', isNullable='NO', dataType='bigint', characterMaximumLength=0, characterOctetLength=0, numericPrecision=20, numericScale=0, datetimePrecision=0, characterSetName='null', collationName='null', columnType='bigint(20) unsigned', columnKey='', extra='', privileges='select,insert,update,references', columnComment='', generationExpression=''}*/
private Long rowsExamined;

/**Column{tableCatalog='def', tableSchema='sys', tableName='statements_with_runtimes_in_95th_percentile', columnName='rows_examined_avg', ordinalPosition=13, columnDefault='0', isNullable='NO', dataType='decimal', characterMaximumLength=0, characterOctetLength=0, numericPrecision=21, numericScale=0, datetimePrecision=0, characterSetName='null', collationName='null', columnType='decimal(21,0)', columnKey='', extra='', privileges='select,insert,update,references', columnComment='', generationExpression=''}*/
private Double rowsExaminedAvg;

/**Column{tableCatalog='def', tableSchema='sys', tableName='statements_with_runtimes_in_95th_percentile', columnName='first_seen', ordinalPosition=14, columnDefault='0000-00-00 00:00:00', isNullable='NO', dataType='timestamp', characterMaximumLength=0, characterOctetLength=0, numericPrecision=0, numericScale=0, datetimePrecision=0, characterSetName='null', collationName='null', columnType='timestamp', columnKey='', extra='', privileges='select,insert,update,references', columnComment='', generationExpression=''}*/
private Date firstSeen;

/**Column{tableCatalog='def', tableSchema='sys', tableName='statements_with_runtimes_in_95th_percentile', columnName='last_seen', ordinalPosition=15, columnDefault='0000-00-00 00:00:00', isNullable='NO', dataType='timestamp', characterMaximumLength=0, characterOctetLength=0, numericPrecision=0, numericScale=0, datetimePrecision=0, characterSetName='null', collationName='null', columnType='timestamp', columnKey='', extra='', privileges='select,insert,update,references', columnComment='', generationExpression=''}*/
private Date lastSeen;

/**Column{tableCatalog='def', tableSchema='sys', tableName='statements_with_runtimes_in_95th_percentile', columnName='digest', ordinalPosition=16, columnDefault='null', isNullable='YES', dataType='varchar', characterMaximumLength=32, characterOctetLength=96, numericPrecision=0, numericScale=0, datetimePrecision=0, characterSetName='utf8', collationName='utf8_general_ci', columnType='varchar(32)', columnKey='', extra='', privileges='select,insert,update,references', columnComment='', generationExpression=''}*/
private String digest;

public String getQuery(){
return query;
}

public String getDb(){
return db;
}

public String getFullScan(){
return fullScan;
}

public Long getExecCount(){
return execCount;
}

public Long getErrCount(){
return errCount;
}

public Long getWarnCount(){
return warnCount;
}

public String getTotalLatency(){
return totalLatency;
}

public String getMaxLatency(){
return maxLatency;
}

public String getAvgLatency(){
return avgLatency;
}

public Long getRowsSent(){
return rowsSent;
}

public Double getRowsSentAvg(){
return rowsSentAvg;
}

public Long getRowsExamined(){
return rowsExamined;
}

public Double getRowsExaminedAvg(){
return rowsExaminedAvg;
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