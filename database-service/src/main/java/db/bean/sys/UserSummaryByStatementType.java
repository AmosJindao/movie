package db.bean.sys;


/**VIEW
*/
public class UserSummaryByStatementType{
/**Column{tableCatalog='def', tableSchema='sys', tableName='user_summary_by_statement_type', columnName='user', ordinalPosition=1, columnDefault='null', isNullable='YES', dataType='varchar', characterMaximumLength=32, characterOctetLength=96, numericPrecision=0, numericScale=0, datetimePrecision=0, characterSetName='utf8', collationName='utf8_bin', columnType='varchar(32)', columnKey='', extra='', privileges='select,insert,update,references', columnComment='', generationExpression=''}*/
private String user;

/**Column{tableCatalog='def', tableSchema='sys', tableName='user_summary_by_statement_type', columnName='statement', ordinalPosition=2, columnDefault='null', isNullable='YES', dataType='varchar', characterMaximumLength=128, characterOctetLength=384, numericPrecision=0, numericScale=0, datetimePrecision=0, characterSetName='utf8', collationName='utf8_general_ci', columnType='varchar(128)', columnKey='', extra='', privileges='select,insert,update,references', columnComment='', generationExpression=''}*/
private String statement;

/**Column{tableCatalog='def', tableSchema='sys', tableName='user_summary_by_statement_type', columnName='total', ordinalPosition=3, columnDefault='null', isNullable='NO', dataType='bigint', characterMaximumLength=0, characterOctetLength=0, numericPrecision=20, numericScale=0, datetimePrecision=0, characterSetName='null', collationName='null', columnType='bigint(20) unsigned', columnKey='', extra='', privileges='select,insert,update,references', columnComment='', generationExpression=''}*/
private Long total;

/**Column{tableCatalog='def', tableSchema='sys', tableName='user_summary_by_statement_type', columnName='total_latency', ordinalPosition=4, columnDefault='null', isNullable='YES', dataType='text', characterMaximumLength=65535, characterOctetLength=65535, numericPrecision=0, numericScale=0, datetimePrecision=0, characterSetName='utf8', collationName='utf8_general_ci', columnType='text', columnKey='', extra='', privileges='select,insert,update,references', columnComment='', generationExpression=''}*/
private String totalLatency;

/**Column{tableCatalog='def', tableSchema='sys', tableName='user_summary_by_statement_type', columnName='max_latency', ordinalPosition=5, columnDefault='null', isNullable='YES', dataType='text', characterMaximumLength=65535, characterOctetLength=65535, numericPrecision=0, numericScale=0, datetimePrecision=0, characterSetName='utf8', collationName='utf8_general_ci', columnType='text', columnKey='', extra='', privileges='select,insert,update,references', columnComment='', generationExpression=''}*/
private String maxLatency;

/**Column{tableCatalog='def', tableSchema='sys', tableName='user_summary_by_statement_type', columnName='lock_latency', ordinalPosition=6, columnDefault='null', isNullable='YES', dataType='text', characterMaximumLength=65535, characterOctetLength=65535, numericPrecision=0, numericScale=0, datetimePrecision=0, characterSetName='utf8', collationName='utf8_general_ci', columnType='text', columnKey='', extra='', privileges='select,insert,update,references', columnComment='', generationExpression=''}*/
private String lockLatency;

/**Column{tableCatalog='def', tableSchema='sys', tableName='user_summary_by_statement_type', columnName='rows_sent', ordinalPosition=7, columnDefault='null', isNullable='NO', dataType='bigint', characterMaximumLength=0, characterOctetLength=0, numericPrecision=20, numericScale=0, datetimePrecision=0, characterSetName='null', collationName='null', columnType='bigint(20) unsigned', columnKey='', extra='', privileges='select,insert,update,references', columnComment='', generationExpression=''}*/
private Long rowsSent;

/**Column{tableCatalog='def', tableSchema='sys', tableName='user_summary_by_statement_type', columnName='rows_examined', ordinalPosition=8, columnDefault='null', isNullable='NO', dataType='bigint', characterMaximumLength=0, characterOctetLength=0, numericPrecision=20, numericScale=0, datetimePrecision=0, characterSetName='null', collationName='null', columnType='bigint(20) unsigned', columnKey='', extra='', privileges='select,insert,update,references', columnComment='', generationExpression=''}*/
private Long rowsExamined;

/**Column{tableCatalog='def', tableSchema='sys', tableName='user_summary_by_statement_type', columnName='rows_affected', ordinalPosition=9, columnDefault='null', isNullable='NO', dataType='bigint', characterMaximumLength=0, characterOctetLength=0, numericPrecision=20, numericScale=0, datetimePrecision=0, characterSetName='null', collationName='null', columnType='bigint(20) unsigned', columnKey='', extra='', privileges='select,insert,update,references', columnComment='', generationExpression=''}*/
private Long rowsAffected;

/**Column{tableCatalog='def', tableSchema='sys', tableName='user_summary_by_statement_type', columnName='full_scans', ordinalPosition=10, columnDefault='0', isNullable='NO', dataType='bigint', characterMaximumLength=0, characterOctetLength=0, numericPrecision=20, numericScale=0, datetimePrecision=0, characterSetName='null', collationName='null', columnType='bigint(21) unsigned', columnKey='', extra='', privileges='select,insert,update,references', columnComment='', generationExpression=''}*/
private Long fullScans;

public String getUser(){
return user;
}

public String getStatement(){
return statement;
}

public Long getTotal(){
return total;
}

public String getTotalLatency(){
return totalLatency;
}

public String getMaxLatency(){
return maxLatency;
}

public String getLockLatency(){
return lockLatency;
}

public Long getRowsSent(){
return rowsSent;
}

public Long getRowsExamined(){
return rowsExamined;
}

public Long getRowsAffected(){
return rowsAffected;
}

public Long getFullScans(){
return fullScans;
}

}