package db.bean.sys;


/* SELECT user AS user, total AS total, total_latency AS totalLatency, min_latency AS minLatency, avg_latency AS avgLatency, max_latency AS maxLatency, thread_id AS threadId, processlist_id AS processlistId FROM sys.x$io_by_thread_by_latency */
/**VIEW
*/
public class X$ioByThreadByLatency{
/**Column{tableCatalog='def', tableSchema='sys', tableName='x$io_by_thread_by_latency', columnName='user', ordinalPosition=1, columnDefault='null', isNullable='YES', dataType='varchar', characterMaximumLength=128, characterOctetLength=384, numericPrecision=0, numericScale=0, datetimePrecision=0, characterSetName='utf8', collationName='utf8_general_ci', columnType='varchar(128)', columnKey='', extra='', privileges='select,insert,update,references', columnComment='', generationExpression=''}*/
private String user;

/**Column{tableCatalog='def', tableSchema='sys', tableName='x$io_by_thread_by_latency', columnName='total', ordinalPosition=2, columnDefault='null', isNullable='YES', dataType='decimal', characterMaximumLength=0, characterOctetLength=0, numericPrecision=42, numericScale=0, datetimePrecision=0, characterSetName='null', collationName='null', columnType='decimal(42,0)', columnKey='', extra='', privileges='select,insert,update,references', columnComment='', generationExpression=''}*/
private Double total;

/**Column{tableCatalog='def', tableSchema='sys', tableName='x$io_by_thread_by_latency', columnName='total_latency', ordinalPosition=3, columnDefault='null', isNullable='YES', dataType='decimal', characterMaximumLength=0, characterOctetLength=0, numericPrecision=42, numericScale=0, datetimePrecision=0, characterSetName='null', collationName='null', columnType='decimal(42,0)', columnKey='', extra='', privileges='select,insert,update,references', columnComment='', generationExpression=''}*/
private Double totalLatency;

/**Column{tableCatalog='def', tableSchema='sys', tableName='x$io_by_thread_by_latency', columnName='min_latency', ordinalPosition=4, columnDefault='null', isNullable='YES', dataType='bigint', characterMaximumLength=0, characterOctetLength=0, numericPrecision=20, numericScale=0, datetimePrecision=0, characterSetName='null', collationName='null', columnType='bigint(20) unsigned', columnKey='', extra='', privileges='select,insert,update,references', columnComment='', generationExpression=''}*/
private Long minLatency;

/**Column{tableCatalog='def', tableSchema='sys', tableName='x$io_by_thread_by_latency', columnName='avg_latency', ordinalPosition=5, columnDefault='null', isNullable='YES', dataType='decimal', characterMaximumLength=0, characterOctetLength=0, numericPrecision=24, numericScale=4, datetimePrecision=0, characterSetName='null', collationName='null', columnType='decimal(24,4)', columnKey='', extra='', privileges='select,insert,update,references', columnComment='', generationExpression=''}*/
private Double avgLatency;

/**Column{tableCatalog='def', tableSchema='sys', tableName='x$io_by_thread_by_latency', columnName='max_latency', ordinalPosition=6, columnDefault='null', isNullable='YES', dataType='bigint', characterMaximumLength=0, characterOctetLength=0, numericPrecision=20, numericScale=0, datetimePrecision=0, characterSetName='null', collationName='null', columnType='bigint(20) unsigned', columnKey='', extra='', privileges='select,insert,update,references', columnComment='', generationExpression=''}*/
private Long maxLatency;

/**Column{tableCatalog='def', tableSchema='sys', tableName='x$io_by_thread_by_latency', columnName='thread_id', ordinalPosition=7, columnDefault='null', isNullable='NO', dataType='bigint', characterMaximumLength=0, characterOctetLength=0, numericPrecision=20, numericScale=0, datetimePrecision=0, characterSetName='null', collationName='null', columnType='bigint(20) unsigned', columnKey='', extra='', privileges='select,insert,update,references', columnComment='', generationExpression=''}*/
private Long threadId;

/**Column{tableCatalog='def', tableSchema='sys', tableName='x$io_by_thread_by_latency', columnName='processlist_id', ordinalPosition=8, columnDefault='null', isNullable='YES', dataType='bigint', characterMaximumLength=0, characterOctetLength=0, numericPrecision=20, numericScale=0, datetimePrecision=0, characterSetName='null', collationName='null', columnType='bigint(20) unsigned', columnKey='', extra='', privileges='select,insert,update,references', columnComment='', generationExpression=''}*/
private Long processlistId;

public String getUser(){
return user;
}

public Double getTotal(){
return total;
}

public Double getTotalLatency(){
return totalLatency;
}

public Long getMinLatency(){
return minLatency;
}

public Double getAvgLatency(){
return avgLatency;
}

public Long getMaxLatency(){
return maxLatency;
}

public Long getThreadId(){
return threadId;
}

public Long getProcesslistId(){
return processlistId;
}

}