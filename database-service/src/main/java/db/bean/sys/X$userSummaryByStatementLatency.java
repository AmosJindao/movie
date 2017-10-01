package db.bean.sys;


/**VIEW
*/
public class X$userSummaryByStatementLatency{
/**Column{tableCatalog='def', tableSchema='sys', tableName='x$user_summary_by_statement_latency', columnName='user', ordinalPosition=1, columnDefault='null', isNullable='YES', dataType='varchar', characterMaximumLength=32, characterOctetLength=96, numericPrecision=0, numericScale=0, datetimePrecision=0, characterSetName='utf8', collationName='utf8_bin', columnType='varchar(32)', columnKey='', extra='', privileges='select,insert,update,references', columnComment='', generationExpression=''}*/
private String user;

/**Column{tableCatalog='def', tableSchema='sys', tableName='x$user_summary_by_statement_latency', columnName='total', ordinalPosition=2, columnDefault='null', isNullable='YES', dataType='decimal', characterMaximumLength=0, characterOctetLength=0, numericPrecision=42, numericScale=0, datetimePrecision=0, characterSetName='null', collationName='null', columnType='decimal(42,0)', columnKey='', extra='', privileges='select,insert,update,references', columnComment='', generationExpression=''}*/
private Double total;

/**Column{tableCatalog='def', tableSchema='sys', tableName='x$user_summary_by_statement_latency', columnName='total_latency', ordinalPosition=3, columnDefault='null', isNullable='YES', dataType='decimal', characterMaximumLength=0, characterOctetLength=0, numericPrecision=42, numericScale=0, datetimePrecision=0, characterSetName='null', collationName='null', columnType='decimal(42,0)', columnKey='', extra='', privileges='select,insert,update,references', columnComment='', generationExpression=''}*/
private Double totalLatency;

/**Column{tableCatalog='def', tableSchema='sys', tableName='x$user_summary_by_statement_latency', columnName='max_latency', ordinalPosition=4, columnDefault='null', isNullable='YES', dataType='decimal', characterMaximumLength=0, characterOctetLength=0, numericPrecision=42, numericScale=0, datetimePrecision=0, characterSetName='null', collationName='null', columnType='decimal(42,0)', columnKey='', extra='', privileges='select,insert,update,references', columnComment='', generationExpression=''}*/
private Double maxLatency;

/**Column{tableCatalog='def', tableSchema='sys', tableName='x$user_summary_by_statement_latency', columnName='lock_latency', ordinalPosition=5, columnDefault='null', isNullable='YES', dataType='decimal', characterMaximumLength=0, characterOctetLength=0, numericPrecision=42, numericScale=0, datetimePrecision=0, characterSetName='null', collationName='null', columnType='decimal(42,0)', columnKey='', extra='', privileges='select,insert,update,references', columnComment='', generationExpression=''}*/
private Double lockLatency;

/**Column{tableCatalog='def', tableSchema='sys', tableName='x$user_summary_by_statement_latency', columnName='rows_sent', ordinalPosition=6, columnDefault='null', isNullable='YES', dataType='decimal', characterMaximumLength=0, characterOctetLength=0, numericPrecision=42, numericScale=0, datetimePrecision=0, characterSetName='null', collationName='null', columnType='decimal(42,0)', columnKey='', extra='', privileges='select,insert,update,references', columnComment='', generationExpression=''}*/
private Double rowsSent;

/**Column{tableCatalog='def', tableSchema='sys', tableName='x$user_summary_by_statement_latency', columnName='rows_examined', ordinalPosition=7, columnDefault='null', isNullable='YES', dataType='decimal', characterMaximumLength=0, characterOctetLength=0, numericPrecision=42, numericScale=0, datetimePrecision=0, characterSetName='null', collationName='null', columnType='decimal(42,0)', columnKey='', extra='', privileges='select,insert,update,references', columnComment='', generationExpression=''}*/
private Double rowsExamined;

/**Column{tableCatalog='def', tableSchema='sys', tableName='x$user_summary_by_statement_latency', columnName='rows_affected', ordinalPosition=8, columnDefault='null', isNullable='YES', dataType='decimal', characterMaximumLength=0, characterOctetLength=0, numericPrecision=42, numericScale=0, datetimePrecision=0, characterSetName='null', collationName='null', columnType='decimal(42,0)', columnKey='', extra='', privileges='select,insert,update,references', columnComment='', generationExpression=''}*/
private Double rowsAffected;

/**Column{tableCatalog='def', tableSchema='sys', tableName='x$user_summary_by_statement_latency', columnName='full_scans', ordinalPosition=9, columnDefault='null', isNullable='YES', dataType='decimal', characterMaximumLength=0, characterOctetLength=0, numericPrecision=43, numericScale=0, datetimePrecision=0, characterSetName='null', collationName='null', columnType='decimal(43,0)', columnKey='', extra='', privileges='select,insert,update,references', columnComment='', generationExpression=''}*/
private Double fullScans;

public String getUser(){
return user;
}

public Double getTotal(){
return total;
}

public Double getTotalLatency(){
return totalLatency;
}

public Double getMaxLatency(){
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