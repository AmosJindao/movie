package db.bean.sys;

import java.util.Date;

/**VIEW
*/
public class StatementAnalysis{
/**Column{tableCatalog='def', tableSchema='sys', tableName='statement_analysis', columnName='query', ordinalPosition=1, columnDefault='null', isNullable='YES', dataType='longtext', characterMaximumLength=4294967295, characterOctetLength=4294967295, numericPrecision=0, numericScale=0, datetimePrecision=0, characterSetName='utf8', collationName='utf8_general_ci', columnType='longtext', columnKey='', extra='', privileges='select,insert,update,references', columnComment='', generationExpression=''}*/
private String query;

/**Column{tableCatalog='def', tableSchema='sys', tableName='statement_analysis', columnName='db', ordinalPosition=2, columnDefault='null', isNullable='YES', dataType='varchar', characterMaximumLength=64, characterOctetLength=192, numericPrecision=0, numericScale=0, datetimePrecision=0, characterSetName='utf8', collationName='utf8_general_ci', columnType='varchar(64)', columnKey='', extra='', privileges='select,insert,update,references', columnComment='', generationExpression=''}*/
private String db;

/**Column{tableCatalog='def', tableSchema='sys', tableName='statement_analysis', columnName='full_scan', ordinalPosition=3, columnDefault='', isNullable='NO', dataType='varchar', characterMaximumLength=1, characterOctetLength=3, numericPrecision=0, numericScale=0, datetimePrecision=0, characterSetName='utf8', collationName='utf8_general_ci', columnType='varchar(1)', columnKey='', extra='', privileges='select,insert,update,references', columnComment='', generationExpression=''}*/
private String fullScan;

/**Column{tableCatalog='def', tableSchema='sys', tableName='statement_analysis', columnName='exec_count', ordinalPosition=4, columnDefault='null', isNullable='NO', dataType='bigint', characterMaximumLength=0, characterOctetLength=0, numericPrecision=20, numericScale=0, datetimePrecision=0, characterSetName='null', collationName='null', columnType='bigint(20) unsigned', columnKey='', extra='', privileges='select,insert,update,references', columnComment='', generationExpression=''}*/
private Long execCount;

/**Column{tableCatalog='def', tableSchema='sys', tableName='statement_analysis', columnName='err_count', ordinalPosition=5, columnDefault='null', isNullable='NO', dataType='bigint', characterMaximumLength=0, characterOctetLength=0, numericPrecision=20, numericScale=0, datetimePrecision=0, characterSetName='null', collationName='null', columnType='bigint(20) unsigned', columnKey='', extra='', privileges='select,insert,update,references', columnComment='', generationExpression=''}*/
private Long errCount;

/**Column{tableCatalog='def', tableSchema='sys', tableName='statement_analysis', columnName='warn_count', ordinalPosition=6, columnDefault='null', isNullable='NO', dataType='bigint', characterMaximumLength=0, characterOctetLength=0, numericPrecision=20, numericScale=0, datetimePrecision=0, characterSetName='null', collationName='null', columnType='bigint(20) unsigned', columnKey='', extra='', privileges='select,insert,update,references', columnComment='', generationExpression=''}*/
private Long warnCount;

/**Column{tableCatalog='def', tableSchema='sys', tableName='statement_analysis', columnName='total_latency', ordinalPosition=7, columnDefault='null', isNullable='YES', dataType='text', characterMaximumLength=65535, characterOctetLength=65535, numericPrecision=0, numericScale=0, datetimePrecision=0, characterSetName='utf8', collationName='utf8_general_ci', columnType='text', columnKey='', extra='', privileges='select,insert,update,references', columnComment='', generationExpression=''}*/
private String totalLatency;

/**Column{tableCatalog='def', tableSchema='sys', tableName='statement_analysis', columnName='max_latency', ordinalPosition=8, columnDefault='null', isNullable='YES', dataType='text', characterMaximumLength=65535, characterOctetLength=65535, numericPrecision=0, numericScale=0, datetimePrecision=0, characterSetName='utf8', collationName='utf8_general_ci', columnType='text', columnKey='', extra='', privileges='select,insert,update,references', columnComment='', generationExpression=''}*/
private String maxLatency;

/**Column{tableCatalog='def', tableSchema='sys', tableName='statement_analysis', columnName='avg_latency', ordinalPosition=9, columnDefault='null', isNullable='YES', dataType='text', characterMaximumLength=65535, characterOctetLength=65535, numericPrecision=0, numericScale=0, datetimePrecision=0, characterSetName='utf8', collationName='utf8_general_ci', columnType='text', columnKey='', extra='', privileges='select,insert,update,references', columnComment='', generationExpression=''}*/
private String avgLatency;

/**Column{tableCatalog='def', tableSchema='sys', tableName='statement_analysis', columnName='lock_latency', ordinalPosition=10, columnDefault='null', isNullable='YES', dataType='text', characterMaximumLength=65535, characterOctetLength=65535, numericPrecision=0, numericScale=0, datetimePrecision=0, characterSetName='utf8', collationName='utf8_general_ci', columnType='text', columnKey='', extra='', privileges='select,insert,update,references', columnComment='', generationExpression=''}*/
private String lockLatency;

/**Column{tableCatalog='def', tableSchema='sys', tableName='statement_analysis', columnName='rows_sent', ordinalPosition=11, columnDefault='null', isNullable='NO', dataType='bigint', characterMaximumLength=0, characterOctetLength=0, numericPrecision=20, numericScale=0, datetimePrecision=0, characterSetName='null', collationName='null', columnType='bigint(20) unsigned', columnKey='', extra='', privileges='select,insert,update,references', columnComment='', generationExpression=''}*/
private Long rowsSent;

/**Column{tableCatalog='def', tableSchema='sys', tableName='statement_analysis', columnName='rows_sent_avg', ordinalPosition=12, columnDefault='0', isNullable='NO', dataType='decimal', characterMaximumLength=0, characterOctetLength=0, numericPrecision=21, numericScale=0, datetimePrecision=0, characterSetName='null', collationName='null', columnType='decimal(21,0)', columnKey='', extra='', privileges='select,insert,update,references', columnComment='', generationExpression=''}*/
private Double rowsSentAvg;

/**Column{tableCatalog='def', tableSchema='sys', tableName='statement_analysis', columnName='rows_examined', ordinalPosition=13, columnDefault='null', isNullable='NO', dataType='bigint', characterMaximumLength=0, characterOctetLength=0, numericPrecision=20, numericScale=0, datetimePrecision=0, characterSetName='null', collationName='null', columnType='bigint(20) unsigned', columnKey='', extra='', privileges='select,insert,update,references', columnComment='', generationExpression=''}*/
private Long rowsExamined;

/**Column{tableCatalog='def', tableSchema='sys', tableName='statement_analysis', columnName='rows_examined_avg', ordinalPosition=14, columnDefault='0', isNullable='NO', dataType='decimal', characterMaximumLength=0, characterOctetLength=0, numericPrecision=21, numericScale=0, datetimePrecision=0, characterSetName='null', collationName='null', columnType='decimal(21,0)', columnKey='', extra='', privileges='select,insert,update,references', columnComment='', generationExpression=''}*/
private Double rowsExaminedAvg;

/**Column{tableCatalog='def', tableSchema='sys', tableName='statement_analysis', columnName='rows_affected', ordinalPosition=15, columnDefault='null', isNullable='NO', dataType='bigint', characterMaximumLength=0, characterOctetLength=0, numericPrecision=20, numericScale=0, datetimePrecision=0, characterSetName='null', collationName='null', columnType='bigint(20) unsigned', columnKey='', extra='', privileges='select,insert,update,references', columnComment='', generationExpression=''}*/
private Long rowsAffected;

/**Column{tableCatalog='def', tableSchema='sys', tableName='statement_analysis', columnName='rows_affected_avg', ordinalPosition=16, columnDefault='0', isNullable='NO', dataType='decimal', characterMaximumLength=0, characterOctetLength=0, numericPrecision=21, numericScale=0, datetimePrecision=0, characterSetName='null', collationName='null', columnType='decimal(21,0)', columnKey='', extra='', privileges='select,insert,update,references', columnComment='', generationExpression=''}*/
private Double rowsAffectedAvg;

/**Column{tableCatalog='def', tableSchema='sys', tableName='statement_analysis', columnName='tmp_tables', ordinalPosition=17, columnDefault='null', isNullable='NO', dataType='bigint', characterMaximumLength=0, characterOctetLength=0, numericPrecision=20, numericScale=0, datetimePrecision=0, characterSetName='null', collationName='null', columnType='bigint(20) unsigned', columnKey='', extra='', privileges='select,insert,update,references', columnComment='', generationExpression=''}*/
private Long tmpTables;

/**Column{tableCatalog='def', tableSchema='sys', tableName='statement_analysis', columnName='tmp_disk_tables', ordinalPosition=18, columnDefault='null', isNullable='NO', dataType='bigint', characterMaximumLength=0, characterOctetLength=0, numericPrecision=20, numericScale=0, datetimePrecision=0, characterSetName='null', collationName='null', columnType='bigint(20) unsigned', columnKey='', extra='', privileges='select,insert,update,references', columnComment='', generationExpression=''}*/
private Long tmpDiskTables;

/**Column{tableCatalog='def', tableSchema='sys', tableName='statement_analysis', columnName='rows_sorted', ordinalPosition=19, columnDefault='null', isNullable='NO', dataType='bigint', characterMaximumLength=0, characterOctetLength=0, numericPrecision=20, numericScale=0, datetimePrecision=0, characterSetName='null', collationName='null', columnType='bigint(20) unsigned', columnKey='', extra='', privileges='select,insert,update,references', columnComment='', generationExpression=''}*/
private Long rowsSorted;

/**Column{tableCatalog='def', tableSchema='sys', tableName='statement_analysis', columnName='sort_merge_passes', ordinalPosition=20, columnDefault='null', isNullable='NO', dataType='bigint', characterMaximumLength=0, characterOctetLength=0, numericPrecision=20, numericScale=0, datetimePrecision=0, characterSetName='null', collationName='null', columnType='bigint(20) unsigned', columnKey='', extra='', privileges='select,insert,update,references', columnComment='', generationExpression=''}*/
private Long sortMergePasses;

/**Column{tableCatalog='def', tableSchema='sys', tableName='statement_analysis', columnName='digest', ordinalPosition=21, columnDefault='null', isNullable='YES', dataType='varchar', characterMaximumLength=32, characterOctetLength=96, numericPrecision=0, numericScale=0, datetimePrecision=0, characterSetName='utf8', collationName='utf8_general_ci', columnType='varchar(32)', columnKey='', extra='', privileges='select,insert,update,references', columnComment='', generationExpression=''}*/
private String digest;

/**Column{tableCatalog='def', tableSchema='sys', tableName='statement_analysis', columnName='first_seen', ordinalPosition=22, columnDefault='0000-00-00 00:00:00', isNullable='NO', dataType='timestamp', characterMaximumLength=0, characterOctetLength=0, numericPrecision=0, numericScale=0, datetimePrecision=0, characterSetName='null', collationName='null', columnType='timestamp', columnKey='', extra='', privileges='select,insert,update,references', columnComment='', generationExpression=''}*/
private Date firstSeen;

/**Column{tableCatalog='def', tableSchema='sys', tableName='statement_analysis', columnName='last_seen', ordinalPosition=23, columnDefault='0000-00-00 00:00:00', isNullable='NO', dataType='timestamp', characterMaximumLength=0, characterOctetLength=0, numericPrecision=0, numericScale=0, datetimePrecision=0, characterSetName='null', collationName='null', columnType='timestamp', columnKey='', extra='', privileges='select,insert,update,references', columnComment='', generationExpression=''}*/
private Date lastSeen;

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

public String getLockLatency(){
return lockLatency;
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

public Long getRowsAffected(){
return rowsAffected;
}

public Double getRowsAffectedAvg(){
return rowsAffectedAvg;
}

public Long getTmpTables(){
return tmpTables;
}

public Long getTmpDiskTables(){
return tmpDiskTables;
}

public Long getRowsSorted(){
return rowsSorted;
}

public Long getSortMergePasses(){
return sortMergePasses;
}

public String getDigest(){
return digest;
}

public Date getFirstSeen(){
return firstSeen;
}

public Date getLastSeen(){
return lastSeen;
}

}