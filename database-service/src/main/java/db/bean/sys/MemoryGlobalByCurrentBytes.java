package db.bean.sys;


/* SELECT event_name AS eventName, current_count AS currentCount, current_alloc AS currentAlloc, current_avg_alloc AS currentAvgAlloc, high_count AS highCount, high_alloc AS highAlloc, high_avg_alloc AS highAvgAlloc FROM sys.memory_global_by_current_bytes */
/**VIEW
*/
public class MemoryGlobalByCurrentBytes{
/**Column{tableCatalog='def', tableSchema='sys', tableName='memory_global_by_current_bytes', columnName='event_name', ordinalPosition=1, columnDefault='null', isNullable='NO', dataType='varchar', characterMaximumLength=128, characterOctetLength=384, numericPrecision=0, numericScale=0, datetimePrecision=0, characterSetName='utf8', collationName='utf8_general_ci', columnType='varchar(128)', columnKey='', extra='', privileges='select,insert,update,references', columnComment='', generationExpression=''}*/
private String eventName;

/**Column{tableCatalog='def', tableSchema='sys', tableName='memory_global_by_current_bytes', columnName='current_count', ordinalPosition=2, columnDefault='null', isNullable='NO', dataType='bigint', characterMaximumLength=0, characterOctetLength=0, numericPrecision=19, numericScale=0, datetimePrecision=0, characterSetName='null', collationName='null', columnType='bigint(20)', columnKey='', extra='', privileges='select,insert,update,references', columnComment='', generationExpression=''}*/
private Long currentCount;

/**Column{tableCatalog='def', tableSchema='sys', tableName='memory_global_by_current_bytes', columnName='current_alloc', ordinalPosition=3, columnDefault='null', isNullable='YES', dataType='text', characterMaximumLength=65535, characterOctetLength=65535, numericPrecision=0, numericScale=0, datetimePrecision=0, characterSetName='utf8', collationName='utf8_general_ci', columnType='text', columnKey='', extra='', privileges='select,insert,update,references', columnComment='', generationExpression=''}*/
private String currentAlloc;

/**Column{tableCatalog='def', tableSchema='sys', tableName='memory_global_by_current_bytes', columnName='current_avg_alloc', ordinalPosition=4, columnDefault='null', isNullable='YES', dataType='text', characterMaximumLength=65535, characterOctetLength=65535, numericPrecision=0, numericScale=0, datetimePrecision=0, characterSetName='utf8', collationName='utf8_general_ci', columnType='text', columnKey='', extra='', privileges='select,insert,update,references', columnComment='', generationExpression=''}*/
private String currentAvgAlloc;

/**Column{tableCatalog='def', tableSchema='sys', tableName='memory_global_by_current_bytes', columnName='high_count', ordinalPosition=5, columnDefault='null', isNullable='NO', dataType='bigint', characterMaximumLength=0, characterOctetLength=0, numericPrecision=19, numericScale=0, datetimePrecision=0, characterSetName='null', collationName='null', columnType='bigint(20)', columnKey='', extra='', privileges='select,insert,update,references', columnComment='', generationExpression=''}*/
private Long highCount;

/**Column{tableCatalog='def', tableSchema='sys', tableName='memory_global_by_current_bytes', columnName='high_alloc', ordinalPosition=6, columnDefault='null', isNullable='YES', dataType='text', characterMaximumLength=65535, characterOctetLength=65535, numericPrecision=0, numericScale=0, datetimePrecision=0, characterSetName='utf8', collationName='utf8_general_ci', columnType='text', columnKey='', extra='', privileges='select,insert,update,references', columnComment='', generationExpression=''}*/
private String highAlloc;

/**Column{tableCatalog='def', tableSchema='sys', tableName='memory_global_by_current_bytes', columnName='high_avg_alloc', ordinalPosition=7, columnDefault='null', isNullable='YES', dataType='text', characterMaximumLength=65535, characterOctetLength=65535, numericPrecision=0, numericScale=0, datetimePrecision=0, characterSetName='utf8', collationName='utf8_general_ci', columnType='text', columnKey='', extra='', privileges='select,insert,update,references', columnComment='', generationExpression=''}*/
private String highAvgAlloc;

public String getEventName(){
return eventName;
}

public Long getCurrentCount(){
return currentCount;
}

public String getCurrentAlloc(){
return currentAlloc;
}

public String getCurrentAvgAlloc(){
return currentAvgAlloc;
}

public Long getHighCount(){
return highCount;
}

public String getHighAlloc(){
return highAlloc;
}

public String getHighAvgAlloc(){
return highAvgAlloc;
}

}