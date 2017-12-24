package db.bean.sys;


/* SELECT thread_id AS threadId, user AS user, current_count_used AS currentCountUsed, current_allocated AS currentAllocated, current_avg_alloc AS currentAvgAlloc, current_max_alloc AS currentMaxAlloc, total_allocated AS totalAllocated FROM sys.memory_by_thread_by_current_bytes */
/**VIEW
*/
public class MemoryByThreadByCurrentBytes{
/**Column{tableCatalog='def', tableSchema='sys', tableName='memory_by_thread_by_current_bytes', columnName='thread_id', ordinalPosition=1, columnDefault='null', isNullable='NO', dataType='bigint', characterMaximumLength=0, characterOctetLength=0, numericPrecision=20, numericScale=0, datetimePrecision=0, characterSetName='null', collationName='null', columnType='bigint(20) unsigned', columnKey='', extra='', privileges='select,insert,update,references', columnComment='', generationExpression=''}*/
private Long threadId;

/**Column{tableCatalog='def', tableSchema='sys', tableName='memory_by_thread_by_current_bytes', columnName='user', ordinalPosition=2, columnDefault='null', isNullable='YES', dataType='varchar', characterMaximumLength=128, characterOctetLength=384, numericPrecision=0, numericScale=0, datetimePrecision=0, characterSetName='utf8', collationName='utf8_general_ci', columnType='varchar(128)', columnKey='', extra='', privileges='select,insert,update,references', columnComment='', generationExpression=''}*/
private String user;

/**Column{tableCatalog='def', tableSchema='sys', tableName='memory_by_thread_by_current_bytes', columnName='current_count_used', ordinalPosition=3, columnDefault='null', isNullable='YES', dataType='decimal', characterMaximumLength=0, characterOctetLength=0, numericPrecision=41, numericScale=0, datetimePrecision=0, characterSetName='null', collationName='null', columnType='decimal(41,0)', columnKey='', extra='', privileges='select,insert,update,references', columnComment='', generationExpression=''}*/
private Double currentCountUsed;

/**Column{tableCatalog='def', tableSchema='sys', tableName='memory_by_thread_by_current_bytes', columnName='current_allocated', ordinalPosition=4, columnDefault='null', isNullable='YES', dataType='text', characterMaximumLength=65535, characterOctetLength=65535, numericPrecision=0, numericScale=0, datetimePrecision=0, characterSetName='utf8', collationName='utf8_general_ci', columnType='text', columnKey='', extra='', privileges='select,insert,update,references', columnComment='', generationExpression=''}*/
private String currentAllocated;

/**Column{tableCatalog='def', tableSchema='sys', tableName='memory_by_thread_by_current_bytes', columnName='current_avg_alloc', ordinalPosition=5, columnDefault='null', isNullable='YES', dataType='text', characterMaximumLength=65535, characterOctetLength=65535, numericPrecision=0, numericScale=0, datetimePrecision=0, characterSetName='utf8', collationName='utf8_general_ci', columnType='text', columnKey='', extra='', privileges='select,insert,update,references', columnComment='', generationExpression=''}*/
private String currentAvgAlloc;

/**Column{tableCatalog='def', tableSchema='sys', tableName='memory_by_thread_by_current_bytes', columnName='current_max_alloc', ordinalPosition=6, columnDefault='null', isNullable='YES', dataType='text', characterMaximumLength=65535, characterOctetLength=65535, numericPrecision=0, numericScale=0, datetimePrecision=0, characterSetName='utf8', collationName='utf8_general_ci', columnType='text', columnKey='', extra='', privileges='select,insert,update,references', columnComment='', generationExpression=''}*/
private String currentMaxAlloc;

/**Column{tableCatalog='def', tableSchema='sys', tableName='memory_by_thread_by_current_bytes', columnName='total_allocated', ordinalPosition=7, columnDefault='null', isNullable='YES', dataType='text', characterMaximumLength=65535, characterOctetLength=65535, numericPrecision=0, numericScale=0, datetimePrecision=0, characterSetName='utf8', collationName='utf8_general_ci', columnType='text', columnKey='', extra='', privileges='select,insert,update,references', columnComment='', generationExpression=''}*/
private String totalAllocated;

public Long getThreadId(){
return threadId;
}

public String getUser(){
return user;
}

public Double getCurrentCountUsed(){
return currentCountUsed;
}

public String getCurrentAllocated(){
return currentAllocated;
}

public String getCurrentAvgAlloc(){
return currentAvgAlloc;
}

public String getCurrentMaxAlloc(){
return currentMaxAlloc;
}

public String getTotalAllocated(){
return totalAllocated;
}

}