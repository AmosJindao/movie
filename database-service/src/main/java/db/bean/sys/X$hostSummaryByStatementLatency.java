package db.bean.sys;


/* SELECT host AS host, total AS total, total_latency AS totalLatency, max_latency AS maxLatency, lock_latency AS lockLatency, rows_sent AS rowsSent, rows_examined AS rowsExamined, rows_affected AS rowsAffected, full_scans AS fullScans FROM sys.x$host_summary_by_statement_latency */
/**VIEW
*/
public class X$hostSummaryByStatementLatency{
/**Column{tableCatalog='def', tableSchema='sys', tableName='x$host_summary_by_statement_latency', columnName='host', ordinalPosition=1, columnDefault='null', isNullable='YES', dataType='varchar', characterMaximumLength=60, characterOctetLength=180, numericPrecision=0, numericScale=0, datetimePrecision=0, characterSetName='utf8', collationName='utf8_bin', columnType='varchar(60)', columnKey='', extra='', privileges='select,insert,update,references', columnComment='', generationExpression=''}*/
private String host;

/**Column{tableCatalog='def', tableSchema='sys', tableName='x$host_summary_by_statement_latency', columnName='total', ordinalPosition=2, columnDefault='null', isNullable='YES', dataType='decimal', characterMaximumLength=0, characterOctetLength=0, numericPrecision=42, numericScale=0, datetimePrecision=0, characterSetName='null', collationName='null', columnType='decimal(42,0)', columnKey='', extra='', privileges='select,insert,update,references', columnComment='', generationExpression=''}*/
private Double total;

/**Column{tableCatalog='def', tableSchema='sys', tableName='x$host_summary_by_statement_latency', columnName='total_latency', ordinalPosition=3, columnDefault='null', isNullable='YES', dataType='decimal', characterMaximumLength=0, characterOctetLength=0, numericPrecision=42, numericScale=0, datetimePrecision=0, characterSetName='null', collationName='null', columnType='decimal(42,0)', columnKey='', extra='', privileges='select,insert,update,references', columnComment='', generationExpression=''}*/
private Double totalLatency;

/**Column{tableCatalog='def', tableSchema='sys', tableName='x$host_summary_by_statement_latency', columnName='max_latency', ordinalPosition=4, columnDefault='null', isNullable='YES', dataType='bigint', characterMaximumLength=0, characterOctetLength=0, numericPrecision=20, numericScale=0, datetimePrecision=0, characterSetName='null', collationName='null', columnType='bigint(20) unsigned', columnKey='', extra='', privileges='select,insert,update,references', columnComment='', generationExpression=''}*/
private Long maxLatency;

/**Column{tableCatalog='def', tableSchema='sys', tableName='x$host_summary_by_statement_latency', columnName='lock_latency', ordinalPosition=5, columnDefault='null', isNullable='YES', dataType='decimal', characterMaximumLength=0, characterOctetLength=0, numericPrecision=42, numericScale=0, datetimePrecision=0, characterSetName='null', collationName='null', columnType='decimal(42,0)', columnKey='', extra='', privileges='select,insert,update,references', columnComment='', generationExpression=''}*/
private Double lockLatency;

/**Column{tableCatalog='def', tableSchema='sys', tableName='x$host_summary_by_statement_latency', columnName='rows_sent', ordinalPosition=6, columnDefault='null', isNullable='YES', dataType='decimal', characterMaximumLength=0, characterOctetLength=0, numericPrecision=42, numericScale=0, datetimePrecision=0, characterSetName='null', collationName='null', columnType='decimal(42,0)', columnKey='', extra='', privileges='select,insert,update,references', columnComment='', generationExpression=''}*/
private Double rowsSent;

/**Column{tableCatalog='def', tableSchema='sys', tableName='x$host_summary_by_statement_latency', columnName='rows_examined', ordinalPosition=7, columnDefault='null', isNullable='YES', dataType='decimal', characterMaximumLength=0, characterOctetLength=0, numericPrecision=42, numericScale=0, datetimePrecision=0, characterSetName='null', collationName='null', columnType='decimal(42,0)', columnKey='', extra='', privileges='select,insert,update,references', columnComment='', generationExpression=''}*/
private Double rowsExamined;

/**Column{tableCatalog='def', tableSchema='sys', tableName='x$host_summary_by_statement_latency', columnName='rows_affected', ordinalPosition=8, columnDefault='null', isNullable='YES', dataType='decimal', characterMaximumLength=0, characterOctetLength=0, numericPrecision=42, numericScale=0, datetimePrecision=0, characterSetName='null', collationName='null', columnType='decimal(42,0)', columnKey='', extra='', privileges='select,insert,update,references', columnComment='', generationExpression=''}*/
private Double rowsAffected;

/**Column{tableCatalog='def', tableSchema='sys', tableName='x$host_summary_by_statement_latency', columnName='full_scans', ordinalPosition=9, columnDefault='null', isNullable='YES', dataType='decimal', characterMaximumLength=0, characterOctetLength=0, numericPrecision=43, numericScale=0, datetimePrecision=0, characterSetName='null', collationName='null', columnType='decimal(43,0)', columnKey='', extra='', privileges='select,insert,update,references', columnComment='', generationExpression=''}*/
private Double fullScans;

public String getHost(){
return host;
}

public Double getTotal(){
return total;
}

public Double getTotalLatency(){
return totalLatency;
}

public Long getMaxLatency(){
return maxLatency;
}

public Double getLockLatency(){
return lockLatency;
}

public Double getRowsSent(){
return rowsSent;
}

public Double getRowsExamined(){
return rowsExamined;
}

public Double getRowsAffected(){
return rowsAffected;
}

public Double getFullScans(){
return fullScans;
}

}