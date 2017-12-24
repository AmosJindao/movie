package db.bean.sys;


/* SELECT event_name AS eventName, current_count AS currentCount, current_alloc AS currentAlloc, current_avg_alloc AS currentAvgAlloc, high_count AS highCount, high_alloc AS highAlloc, high_avg_alloc AS highAvgAlloc FROM sys.x$memory_global_by_current_bytes */
/**VIEW
*/
public class X$memoryGlobalByCurrentBytes{
/**Column{tableCatalog='def', tableSchema='sys', tableName='x$memory_global_by_current_bytes', columnName='event_name', ordinalPosition=1, columnDefault='null', isNullable='NO', dataType='varchar', characterMaximumLength=128, characterOctetLength=384, numericPrecision=0, numericScale=0, datetimePrecision=0, characterSetName='utf8', collationName='utf8_general_ci', columnType='varchar(128)', columnKey='', extra='', privileges='select,insert,update,references', columnComment='', generationExpression=''}*/
private String eventName;

/**Column{tableCatalog='def', tableSchema='sys', tableName='x$memory_global_by_current_bytes', columnName='current_count', ordinalPosition=2, columnDefault='null', isNullable='NO', dataType='bigint', characterMaximumLength=0, characterOctetLength=0, numericPrecision=19, numericScale=0, datetimePrecision=0, characterSetName='null', collationName='null', columnType='bigint(20)', columnKey='', extra='', privileges='select,insert,update,references', columnComment='', generationExpression=''}*/
private Long currentCount;

/**Column{tableCatalog='def', tableSchema='sys', tableName='x$memory_global_by_current_bytes', columnName='current_alloc', ordinalPosition=3, columnDefault='null', isNullable='NO', dataType='bigint', characterMaximumLength=0, characterOctetLength=0, numericPrecision=19, numericScale=0, datetimePrecision=0, characterSetName='null', collationName='null', columnType='bigint(20)', columnKey='', extra='', privileges='select,insert,update,references', columnComment='', generationExpression=''}*/
private Long currentAlloc;

/**Column{tableCatalog='def', tableSchema='sys', tableName='x$memory_global_by_current_bytes', columnName='current_avg_alloc', ordinalPosition=4, columnDefault='0.0000', isNullable='NO', dataType='decimal', characterMaximumLength=0, characterOctetLength=0, numericPrecision=23, numericScale=4, datetimePrecision=0, characterSetName='null', collationName='null', columnType='decimal(23,4)', columnKey='', extra='', privileges='select,insert,update,references', columnComment='', generationExpression=''}*/
private Double currentAvgAlloc;

/**Column{tableCatalog='def', tableSchema='sys', tableName='x$memory_global_by_current_bytes', columnName='high_count', ordinalPosition=5, columnDefault='null', isNullable='NO', dataType='bigint', characterMaximumLength=0, characterOctetLength=0, numericPrecision=19, numericScale=0, datetimePrecision=0, characterSetName='null', collationName='null', columnType='bigint(20)', columnKey='', extra='', privileges='select,insert,update,references', columnComment='', generationExpression=''}*/
private Long highCount;

/**Column{tableCatalog='def', tableSchema='sys', tableName='x$memory_global_by_current_bytes', columnName='high_alloc', ordinalPosition=6, columnDefault='null', isNullable='NO', dataType='bigint', characterMaximumLength=0, characterOctetLength=0, numericPrecision=19, numericScale=0, datetimePrecision=0, characterSetName='null', collationName='null', columnType='bigint(20)', columnKey='', extra='', privileges='select,insert,update,references', columnComment='', generationExpression=''}*/
private Long highAlloc;

/**Column{tableCatalog='def', tableSchema='sys', tableName='x$memory_global_by_current_bytes', columnName='high_avg_alloc', ordinalPosition=7, columnDefault='0.0000', isNullable='NO', dataType='decimal', characterMaximumLength=0, characterOctetLength=0, numericPrecision=23, numericScale=4, datetimePrecision=0, characterSetName='null', collationName='null', columnType='decimal(23,4)', columnKey='', extra='', privileges='select,insert,update,references', columnComment='', generationExpression=''}*/
private Double highAvgAlloc;

public String getEventName(){
return eventName;
}

public Long getCurrentCount(){
return currentCount;
}

public Long getCurrentAlloc(){
return currentAlloc;
}

public Double getCurrentAvgAlloc(){
return currentAvgAlloc;
}

public Long getHighCount(){
return highCount;
}

public Long getHighAlloc(){
return highAlloc;
}

public Double getHighAvgAlloc(){
return highAvgAlloc;
}

}