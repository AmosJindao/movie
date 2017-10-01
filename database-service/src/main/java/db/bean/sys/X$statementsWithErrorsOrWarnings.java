package db.bean.sys;

import java.util.Date;

/**VIEW
*/
public class X$statementsWithErrorsOrWarnings{
/**Column{tableCatalog='def', tableSchema='sys', tableName='x$statements_with_errors_or_warnings', columnName='query', ordinalPosition=1, columnDefault='null', isNullable='YES', dataType='longtext', characterMaximumLength=4294967295, characterOctetLength=4294967295, numericPrecision=0, numericScale=0, datetimePrecision=0, characterSetName='utf8', collationName='utf8_general_ci', columnType='longtext', columnKey='', extra='', privileges='select,insert,update,references', columnComment='', generationExpression=''}*/
private String query;

/**Column{tableCatalog='def', tableSchema='sys', tableName='x$statements_with_errors_or_warnings', columnName='db', ordinalPosition=2, columnDefault='null', isNullable='YES', dataType='varchar', characterMaximumLength=64, characterOctetLength=192, numericPrecision=0, numericScale=0, datetimePrecision=0, characterSetName='utf8', collationName='utf8_general_ci', columnType='varchar(64)', columnKey='', extra='', privileges='select,insert,update,references', columnComment='', generationExpression=''}*/
private String db;

/**Column{tableCatalog='def', tableSchema='sys', tableName='x$statements_with_errors_or_warnings', columnName='exec_count', ordinalPosition=3, columnDefault='null', isNullable='NO', dataType='bigint', characterMaximumLength=0, characterOctetLength=0, numericPrecision=20, numericScale=0, datetimePrecision=0, characterSetName='null', collationName='null', columnType='bigint(20) unsigned', columnKey='', extra='', privileges='select,insert,update,references', columnComment='', generationExpression=''}*/
private Long execCount;

/**Column{tableCatalog='def', tableSchema='sys', tableName='x$statements_with_errors_or_warnings', columnName='errors', ordinalPosition=4, columnDefault='null', isNullable='NO', dataType='bigint', characterMaximumLength=0, characterOctetLength=0, numericPrecision=20, numericScale=0, datetimePrecision=0, characterSetName='null', collationName='null', columnType='bigint(20) unsigned', columnKey='', extra='', privileges='select,insert,update,references', columnComment='', generationExpression=''}*/
private Long errors;

/**Column{tableCatalog='def', tableSchema='sys', tableName='x$statements_with_errors_or_warnings', columnName='error_pct', ordinalPosition=5, columnDefault='0.0000', isNullable='NO', dataType='decimal', characterMaximumLength=0, characterOctetLength=0, numericPrecision=27, numericScale=4, datetimePrecision=0, characterSetName='null', collationName='null', columnType='decimal(27,4)', columnKey='', extra='', privileges='select,insert,update,references', columnComment='', generationExpression=''}*/
private Double errorPct;

/**Column{tableCatalog='def', tableSchema='sys', tableName='x$statements_with_errors_or_warnings', columnName='warnings', ordinalPosition=6, columnDefault='null', isNullable='NO', dataType='bigint', characterMaximumLength=0, characterOctetLength=0, numericPrecision=20, numericScale=0, datetimePrecision=0, characterSetName='null', collationName='null', columnType='bigint(20) unsigned', columnKey='', extra='', privileges='select,insert,update,references', columnComment='', generationExpression=''}*/
private Long warnings;

/**Column{tableCatalog='def', tableSchema='sys', tableName='x$statements_with_errors_or_warnings', columnName='warning_pct', ordinalPosition=7, columnDefault='0.0000', isNullable='NO', dataType='decimal', characterMaximumLength=0, characterOctetLength=0, numericPrecision=27, numericScale=4, datetimePrecision=0, characterSetName='null', collationName='null', columnType='decimal(27,4)', columnKey='', extra='', privileges='select,insert,update,references', columnComment='', generationExpression=''}*/
private Double warningPct;

/**Column{tableCatalog='def', tableSchema='sys', tableName='x$statements_with_errors_or_warnings', columnName='first_seen', ordinalPosition=8, columnDefault='0000-00-00 00:00:00', isNullable='NO', dataType='timestamp', characterMaximumLength=0, characterOctetLength=0, numericPrecision=0, numericScale=0, datetimePrecision=0, characterSetName='null', collationName='null', columnType='timestamp', columnKey='', extra='', privileges='select,insert,update,references', columnComment='', generationExpression=''}*/
private Date firstSeen;

/**Column{tableCatalog='def', tableSchema='sys', tableName='x$statements_with_errors_or_warnings', columnName='last_seen', ordinalPosition=9, columnDefault='0000-00-00 00:00:00', isNullable='NO', dataType='timestamp', characterMaximumLength=0, characterOctetLength=0, numericPrecision=0, numericScale=0, datetimePrecision=0, characterSetName='null', collationName='null', columnType='timestamp', columnKey='', extra='', privileges='select,insert,update,references', columnComment='', generationExpression=''}*/
private Date lastSeen;

/**Column{tableCatalog='def', tableSchema='sys', tableName='x$statements_with_errors_or_warnings', columnName='digest', ordinalPosition=10, columnDefault='null', isNullable='YES', dataType='varchar', characterMaximumLength=32, characterOctetLength=96, numericPrecision=0, numericScale=0, datetimePrecision=0, characterSetName='utf8', collationName='utf8_general_ci', columnType='varchar(32)', columnKey='', extra='', privileges='select,insert,update,references', columnComment='', generationExpression=''}*/
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

public Long getErrors(){
return errors;
}

public Double getErrorPct(){
return errorPct;
}

public Long getWarnings(){
return warnings;
}

public Double getWarningPct(){
return warningPct;
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