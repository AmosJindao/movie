package db.bean.sys;


/* SELECT event_name AS eventName, total AS total, total_latency AS totalLatency, avg_latency AS avgLatency, max_latency AS maxLatency, read_latency AS readLatency, write_latency AS writeLatency, misc_latency AS miscLatency, count_read AS countRead, total_read AS totalRead, avg_read AS avgRead, count_write AS countWrite, total_written AS totalWritten, avg_written AS avgWritten FROM sys.x$io_global_by_wait_by_latency */
/**VIEW
*/
public class X$ioGlobalByWaitByLatency{
/**Column{tableCatalog='def', tableSchema='sys', tableName='x$io_global_by_wait_by_latency', columnName='event_name', ordinalPosition=1, columnDefault='null', isNullable='YES', dataType='varchar', characterMaximumLength=128, characterOctetLength=384, numericPrecision=0, numericScale=0, datetimePrecision=0, characterSetName='utf8', collationName='utf8_general_ci', columnType='varchar(128)', columnKey='', extra='', privileges='select,insert,update,references', columnComment='', generationExpression=''}*/
private String eventName;

/**Column{tableCatalog='def', tableSchema='sys', tableName='x$io_global_by_wait_by_latency', columnName='total', ordinalPosition=2, columnDefault='null', isNullable='NO', dataType='bigint', characterMaximumLength=0, characterOctetLength=0, numericPrecision=20, numericScale=0, datetimePrecision=0, characterSetName='null', collationName='null', columnType='bigint(20) unsigned', columnKey='', extra='', privileges='select,insert,update,references', columnComment='', generationExpression=''}*/
private Long total;

/**Column{tableCatalog='def', tableSchema='sys', tableName='x$io_global_by_wait_by_latency', columnName='total_latency', ordinalPosition=3, columnDefault='null', isNullable='NO', dataType='bigint', characterMaximumLength=0, characterOctetLength=0, numericPrecision=20, numericScale=0, datetimePrecision=0, characterSetName='null', collationName='null', columnType='bigint(20) unsigned', columnKey='', extra='', privileges='select,insert,update,references', columnComment='', generationExpression=''}*/
private Long totalLatency;

/**Column{tableCatalog='def', tableSchema='sys', tableName='x$io_global_by_wait_by_latency', columnName='avg_latency', ordinalPosition=4, columnDefault='null', isNullable='NO', dataType='bigint', characterMaximumLength=0, characterOctetLength=0, numericPrecision=20, numericScale=0, datetimePrecision=0, characterSetName='null', collationName='null', columnType='bigint(20) unsigned', columnKey='', extra='', privileges='select,insert,update,references', columnComment='', generationExpression=''}*/
private Long avgLatency;

/**Column{tableCatalog='def', tableSchema='sys', tableName='x$io_global_by_wait_by_latency', columnName='max_latency', ordinalPosition=5, columnDefault='null', isNullable='NO', dataType='bigint', characterMaximumLength=0, characterOctetLength=0, numericPrecision=20, numericScale=0, datetimePrecision=0, characterSetName='null', collationName='null', columnType='bigint(20) unsigned', columnKey='', extra='', privileges='select,insert,update,references', columnComment='', generationExpression=''}*/
private Long maxLatency;

/**Column{tableCatalog='def', tableSchema='sys', tableName='x$io_global_by_wait_by_latency', columnName='read_latency', ordinalPosition=6, columnDefault='null', isNullable='NO', dataType='bigint', characterMaximumLength=0, characterOctetLength=0, numericPrecision=20, numericScale=0, datetimePrecision=0, characterSetName='null', collationName='null', columnType='bigint(20) unsigned', columnKey='', extra='', privileges='select,insert,update,references', columnComment='', generationExpression=''}*/
private Long readLatency;

/**Column{tableCatalog='def', tableSchema='sys', tableName='x$io_global_by_wait_by_latency', columnName='write_latency', ordinalPosition=7, columnDefault='null', isNullable='NO', dataType='bigint', characterMaximumLength=0, characterOctetLength=0, numericPrecision=20, numericScale=0, datetimePrecision=0, characterSetName='null', collationName='null', columnType='bigint(20) unsigned', columnKey='', extra='', privileges='select,insert,update,references', columnComment='', generationExpression=''}*/
private Long writeLatency;

/**Column{tableCatalog='def', tableSchema='sys', tableName='x$io_global_by_wait_by_latency', columnName='misc_latency', ordinalPosition=8, columnDefault='null', isNullable='NO', dataType='bigint', characterMaximumLength=0, characterOctetLength=0, numericPrecision=20, numericScale=0, datetimePrecision=0, characterSetName='null', collationName='null', columnType='bigint(20) unsigned', columnKey='', extra='', privileges='select,insert,update,references', columnComment='', generationExpression=''}*/
private Long miscLatency;

/**Column{tableCatalog='def', tableSchema='sys', tableName='x$io_global_by_wait_by_latency', columnName='count_read', ordinalPosition=9, columnDefault='null', isNullable='NO', dataType='bigint', characterMaximumLength=0, characterOctetLength=0, numericPrecision=20, numericScale=0, datetimePrecision=0, characterSetName='null', collationName='null', columnType='bigint(20) unsigned', columnKey='', extra='', privileges='select,insert,update,references', columnComment='', generationExpression=''}*/
private Long countRead;

/**Column{tableCatalog='def', tableSchema='sys', tableName='x$io_global_by_wait_by_latency', columnName='total_read', ordinalPosition=10, columnDefault='null', isNullable='NO', dataType='bigint', characterMaximumLength=0, characterOctetLength=0, numericPrecision=19, numericScale=0, datetimePrecision=0, characterSetName='null', collationName='null', columnType='bigint(20)', columnKey='', extra='', privileges='select,insert,update,references', columnComment='', generationExpression=''}*/
private Long totalRead;

/**Column{tableCatalog='def', tableSchema='sys', tableName='x$io_global_by_wait_by_latency', columnName='avg_read', ordinalPosition=11, columnDefault='0.0000', isNullable='NO', dataType='decimal', characterMaximumLength=0, characterOctetLength=0, numericPrecision=23, numericScale=4, datetimePrecision=0, characterSetName='null', collationName='null', columnType='decimal(23,4)', columnKey='', extra='', privileges='select,insert,update,references', columnComment='', generationExpression=''}*/
private Double avgRead;

/**Column{tableCatalog='def', tableSchema='sys', tableName='x$io_global_by_wait_by_latency', columnName='count_write', ordinalPosition=12, columnDefault='null', isNullable='NO', dataType='bigint', characterMaximumLength=0, characterOctetLength=0, numericPrecision=20, numericScale=0, datetimePrecision=0, characterSetName='null', collationName='null', columnType='bigint(20) unsigned', columnKey='', extra='', privileges='select,insert,update,references', columnComment='', generationExpression=''}*/
private Long countWrite;

/**Column{tableCatalog='def', tableSchema='sys', tableName='x$io_global_by_wait_by_latency', columnName='total_written', ordinalPosition=13, columnDefault='null', isNullable='NO', dataType='bigint', characterMaximumLength=0, characterOctetLength=0, numericPrecision=19, numericScale=0, datetimePrecision=0, characterSetName='null', collationName='null', columnType='bigint(20)', columnKey='', extra='', privileges='select,insert,update,references', columnComment='', generationExpression=''}*/
private Long totalWritten;

/**Column{tableCatalog='def', tableSchema='sys', tableName='x$io_global_by_wait_by_latency', columnName='avg_written', ordinalPosition=14, columnDefault='0.0000', isNullable='NO', dataType='decimal', characterMaximumLength=0, characterOctetLength=0, numericPrecision=23, numericScale=4, datetimePrecision=0, characterSetName='null', collationName='null', columnType='decimal(23,4)', columnKey='', extra='', privileges='select,insert,update,references', columnComment='', generationExpression=''}*/
private Double avgWritten;

public String getEventName(){
return eventName;
}

public Long getTotal(){
return total;
}

public Long getTotalLatency(){
return totalLatency;
}

public Long getAvgLatency(){
return avgLatency;
}

public Long getMaxLatency(){
return maxLatency;
}

public Long getReadLatency(){
return readLatency;
}

public Long getWriteLatency(){
return writeLatency;
}

public Long getMiscLatency(){
return miscLatency;
}

public Long getCountRead(){
return countRead;
}

public Long getTotalRead(){
return totalRead;
}

public Double getAvgRead(){
return avgRead;
}

public Long getCountWrite(){
return countWrite;
}

public Long getTotalWritten(){
return totalWritten;
}

public Double getAvgWritten(){
return avgWritten;
}

}