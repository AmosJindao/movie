package db.bean.sys;


/* SELECT user AS user, event_name AS eventName, total AS total, latency AS latency, max_latency AS maxLatency FROM sys.user_summary_by_file_io_type */
/**VIEW
*/
public class UserSummaryByFileIoType{
/**Column{tableCatalog='def', tableSchema='sys', tableName='user_summary_by_file_io_type', columnName='user', ordinalPosition=1, columnDefault='null', isNullable='YES', dataType='varchar', characterMaximumLength=32, characterOctetLength=96, numericPrecision=0, numericScale=0, datetimePrecision=0, characterSetName='utf8', collationName='utf8_bin', columnType='varchar(32)', columnKey='', extra='', privileges='select,insert,update,references', columnComment='', generationExpression=''}*/
private String user;

/**Column{tableCatalog='def', tableSchema='sys', tableName='user_summary_by_file_io_type', columnName='event_name', ordinalPosition=2, columnDefault='null', isNullable='NO', dataType='varchar', characterMaximumLength=128, characterOctetLength=384, numericPrecision=0, numericScale=0, datetimePrecision=0, characterSetName='utf8', collationName='utf8_general_ci', columnType='varchar(128)', columnKey='', extra='', privileges='select,insert,update,references', columnComment='', generationExpression=''}*/
private String eventName;

/**Column{tableCatalog='def', tableSchema='sys', tableName='user_summary_by_file_io_type', columnName='total', ordinalPosition=3, columnDefault='null', isNullable='NO', dataType='bigint', characterMaximumLength=0, characterOctetLength=0, numericPrecision=20, numericScale=0, datetimePrecision=0, characterSetName='null', collationName='null', columnType='bigint(20) unsigned', columnKey='', extra='', privileges='select,insert,update,references', columnComment='', generationExpression=''}*/
private Long total;

/**Column{tableCatalog='def', tableSchema='sys', tableName='user_summary_by_file_io_type', columnName='latency', ordinalPosition=4, columnDefault='null', isNullable='YES', dataType='text', characterMaximumLength=65535, characterOctetLength=65535, numericPrecision=0, numericScale=0, datetimePrecision=0, characterSetName='utf8', collationName='utf8_general_ci', columnType='text', columnKey='', extra='', privileges='select,insert,update,references', columnComment='', generationExpression=''}*/
private String latency;

/**Column{tableCatalog='def', tableSchema='sys', tableName='user_summary_by_file_io_type', columnName='max_latency', ordinalPosition=5, columnDefault='null', isNullable='YES', dataType='text', characterMaximumLength=65535, characterOctetLength=65535, numericPrecision=0, numericScale=0, datetimePrecision=0, characterSetName='utf8', collationName='utf8_general_ci', columnType='text', columnKey='', extra='', privileges='select,insert,update,references', columnComment='', generationExpression=''}*/
private String maxLatency;

public String getUser(){
return user;
}

public String getEventName(){
return eventName;
}

public Long getTotal(){
return total;
}

public String getLatency(){
return latency;
}

public String getMaxLatency(){
return maxLatency;
}

}