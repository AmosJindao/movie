package db.bean.sys;

import java.util.Date;

/**VIEW
*/
public class X$statementsWithFullTableScans{
/**Column{tableCatalog='def', tableSchema='sys', tableName='x$statements_with_full_table_scans', columnName='query', ordinalPosition=1, columnDefault='null', isNullable='YES', dataType='longtext', characterMaximumLength=4294967295, characterOctetLength=4294967295, numericPrecision=0, numericScale=0, datetimePrecision=0, characterSetName='utf8', collationName='utf8_general_ci', columnType='longtext', columnKey='', extra='', privileges='select,insert,update,references', columnComment='', generationExpression=''}*/
private String query;

/**Column{tableCatalog='def', tableSchema='sys', tableName='x$statements_with_full_table_scans', columnName='db', ordinalPosition=2, columnDefault='null', isNullable='YES', dataType='varchar', characterMaximumLength=64, characterOctetLength=192, numericPrecision=0, numericScale=0, datetimePrecision=0, characterSetName='utf8', collationName='utf8_general_ci', columnType='varchar(64)', columnKey='', extra='', privileges='select,insert,update,references', columnComment='', generationExpression=''}*/
private String db;

/**Column{tableCatalog='def', tableSchema='sys', tableName='x$statements_with_full_table_scans', columnName='exec_count', ordinalPosition=3, columnDefault='null', isNullable='NO', dataType='bigint', characterMaximumLength=0, characterOctetLength=0, numericPrecision=20, numericScale=0, datetimePrecision=0, characterSetName='null', collationName='null', columnType='bigint(20) unsigned', columnKey='', extra='', privileges='select,insert,update,references', columnComment='', generationExpression=''}*/
private Long execCount;

/**Column{tableCatalog='def', tableSchema='sys', tableName='x$statements_with_full_table_scans', columnName='total_latency', ordinalPosition=4, columnDefault='null', isNullable='NO', dataType='bigint', characterMaximumLength=0, characterOctetLength=0, numericPrecision=20, numericScale=0, datetimePrecision=0, characterSetName='null', collationName='null', columnType='bigint(20) unsigned', columnKey='', extra='', privileges='select,insert,update,references', columnComment='', generationExpression=''}*/
private Long totalLatency;

/**Column{tableCatalog='def', tableSchema='sys', tableName='x$statements_with_full_table_scans', columnName='no_index_used_count', ordinalPosition=5, columnDefault='null', isNullable='NO', dataType='bigint', characterMaximumLength=0, characterOctetLength=0, numericPrecision=20, numericScale=0, datetimePrecision=0, characterSetName='null', collationName='null', columnType='bigint(20) unsigned', columnKey='', extra='', privileges='select,insert,update,references', columnComment='', generationExpression=''}*/
private Long noIndexUsedCount;

/**Column{tableCatalog='def', tableSchema='sys', tableName='x$statements_with_full_table_scans', columnName='no_good_index_used_count', ordinalPosition=6, columnDefault='null', isNullable='NO', dataType='bigint', characterMaximumLength=0, characterOctetLength=0, numericPrecision=20, numericScale=0, datetimePrecision=0, characterSetName='null', collationName='null', columnType='bigint(20) unsigned', columnKey='', extra='', privileges='select,insert,update,references', columnComment='', generationExpression=''}*/
private Long noGoodIndexUsedCount;

/**Column{tableCatalog='def', tableSchema='sys', tableName='x$statements_with_full_table_scans', columnName='no_index_used_pct', ordinalPosition=7, columnDefault='0', isNullable='NO', dataType='decimal', characterMaximumLength=0, characterOctetLength=0, numericPrecision=24, numericScale=0, datetimePrecision=0, characterSetName='null', collationName='null', columnType='decimal(24,0)', columnKey='', extra='', privileges='select,insert,update,references', columnComment='', generationExpression=''}*/
private Double noIndexUsedPct;

/**Column{tableCatalog='def', tableSchema='sys', tableName='x$statements_with_full_table_scans', columnName='rows_sent', ordinalPosition=8, columnDefault='null', isNullable='NO', dataType='bigint', characterMaximumLength=0, characterOctetLength=0, numericPrecision=20, numericScale=0, datetimePrecision=0, characterSetName='null', collationName='null', columnType='bigint(20) unsigned', columnKey='', extra='', privileges='select,insert,update,references', columnComment='', generationExpression=''}*/
private Long rowsSent;

/**Column{tableCatalog='def', tableSchema='sys', tableName='x$statements_with_full_table_scans', columnName='rows_examined', ordinalPosition=9, columnDefault='null', isNullable='NO', dataType='bigint', characterMaximumLength=0, characterOctetLength=0, numericPrecision=20, numericScale=0, datetimePrecision=0, characterSetName='null', collationName='null', columnType='bigint(20) unsigned', columnKey='', extra='', privileges='select,insert,update,references', columnComment='', generationExpression=''}*/
private Long rowsExamined;

/**Column{tableCatalog='def', tableSchema='sys', tableName='x$statements_with_full_table_scans', columnName='rows_sent_avg', ordinalPosition=10, columnDefault='null', isNullable='YES', dataType='decimal', characterMaximumLength=0, characterOctetLength=0, numericPrecision=21, numericScale=0, datetimePrecision=0, characterSetName='null', collationName='null', columnType='decimal(21,0) unsigned', columnKey='', extra='', privileges='select,insert,update,references', columnComment='', generationExpression=''}*/
private Double rowsSentAvg;

/**Column{tableCatalog='def', tableSchema='sys', tableName='x$statements_with_full_table_scans', columnName='rows_examined_avg', ordinalPosition=11, columnDefault='null', isNullable='YES', dataType='decimal', characterMaximumLength=0, characterOctetLength=0, numericPrecision=21, numericScale=0, datetimePrecision=0, characterSetName='null', collationName='null', columnType='decimal(21,0) unsigned', columnKey='', extra='', privileges='select,insert,update,references', columnComment='', generationExpression=''}*/
private Double rowsExaminedAvg;

/**Column{tableCatalog='def', tableSchema='sys', tableName='x$statements_with_full_table_scans', columnName='first_seen', ordinalPosition=12, columnDefault='0000-00-00 00:00:00', isNullable='NO', dataType='timestamp', characterMaximumLength=0, characterOctetLength=0, numericPrecision=0, numericScale=0, datetimePrecision=0, characterSetName='null', collationName='null', columnType='timestamp', columnKey='', extra='', privileges='select,insert,update,references', columnComment='', generationExpression=''}*/
private Date firstSeen;

/**Column{tableCatalog='def', tableSchema='sys', tableName='x$statements_with_full_table_scans', columnName='last_seen', ordinalPosition=13, columnDefault='0000-00-00 00:00:00', isNullable='NO', dataType='timestamp', characterMaximumLength=0, characterOctetLength=0, numericPrecision=0, numericScale=0, datetimePrecision=0, characterSetName='null', collationName='null', columnType='timestamp', columnKey='', extra='', privileges='select,insert,update,references', columnComment='', generationExpression=''}*/
private Date lastSeen;

/**Column{tableCatalog='def', tableSchema='sys', tableName='x$statements_with_full_table_scans', columnName='digest', ordinalPosition=14, columnDefault='null', isNullable='YES', dataType='varchar', characterMaximumLength=32, characterOctetLength=96, numericPrecision=0, numericScale=0, datetimePrecision=0, characterSetName='utf8', collationName='utf8_general_ci', columnType='varchar(32)', columnKey='', extra='', privileges='select,insert,update,references', columnComment='', generationExpression=''}*/
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

public Long getTotalLatency(){
return totalLatency;
}

public Long getNoIndexUsedCount(){
return noIndexUsedCount;
}

public Long getNoGoodIndexUsedCount(){
return noGoodIndexUsedCount;
}

public Double getNoIndexUsedPct(){
return noIndexUsedPct;
}

public Long getRowsSent(){
return rowsSent;
}

public Long getRowsExamined(){
return rowsExamined;
}

public Double getRowsSentAvg(){
return rowsSentAvg;
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