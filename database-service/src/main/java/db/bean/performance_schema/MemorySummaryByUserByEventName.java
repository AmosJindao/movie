package db.bean.performance_schema;


/* SELECT USER AS user, EVENT_NAME AS eventName, COUNT_ALLOC AS countAlloc, COUNT_FREE AS countFree, SUM_NUMBER_OF_BYTES_ALLOC AS sumNumberOfBytesAlloc, SUM_NUMBER_OF_BYTES_FREE AS sumNumberOfBytesFree, LOW_COUNT_USED AS lowCountUsed, CURRENT_COUNT_USED AS currentCountUsed, HIGH_COUNT_USED AS highCountUsed, LOW_NUMBER_OF_BYTES_USED AS lowNumberOfBytesUsed, CURRENT_NUMBER_OF_BYTES_USED AS currentNumberOfBytesUsed, HIGH_NUMBER_OF_BYTES_USED AS highNumberOfBytesUsed FROM performance_schema.memory_summary_by_user_by_event_name */
/**
*/
public class MemorySummaryByUserByEventName{
/**Column{tableCatalog='def', tableSchema='performance_schema', tableName='memory_summary_by_user_by_event_name', columnName='USER', ordinalPosition=1, columnDefault='null', isNullable='YES', dataType='char', characterMaximumLength=32, characterOctetLength=96, numericPrecision=0, numericScale=0, datetimePrecision=0, characterSetName='utf8', collationName='utf8_bin', columnType='char(32)', columnKey='', extra='', privileges='select,insert,update,references', columnComment='', generationExpression=''}*/
private String user;

/**Column{tableCatalog='def', tableSchema='performance_schema', tableName='memory_summary_by_user_by_event_name', columnName='EVENT_NAME', ordinalPosition=2, columnDefault='null', isNullable='NO', dataType='varchar', characterMaximumLength=128, characterOctetLength=384, numericPrecision=0, numericScale=0, datetimePrecision=0, characterSetName='utf8', collationName='utf8_general_ci', columnType='varchar(128)', columnKey='', extra='', privileges='select,insert,update,references', columnComment='', generationExpression=''}*/
private String eventName;

/**Column{tableCatalog='def', tableSchema='performance_schema', tableName='memory_summary_by_user_by_event_name', columnName='COUNT_ALLOC', ordinalPosition=3, columnDefault='null', isNullable='NO', dataType='bigint', characterMaximumLength=0, characterOctetLength=0, numericPrecision=20, numericScale=0, datetimePrecision=0, characterSetName='null', collationName='null', columnType='bigint(20) unsigned', columnKey='', extra='', privileges='select,insert,update,references', columnComment='', generationExpression=''}*/
private Long countAlloc;

/**Column{tableCatalog='def', tableSchema='performance_schema', tableName='memory_summary_by_user_by_event_name', columnName='COUNT_FREE', ordinalPosition=4, columnDefault='null', isNullable='NO', dataType='bigint', characterMaximumLength=0, characterOctetLength=0, numericPrecision=20, numericScale=0, datetimePrecision=0, characterSetName='null', collationName='null', columnType='bigint(20) unsigned', columnKey='', extra='', privileges='select,insert,update,references', columnComment='', generationExpression=''}*/
private Long countFree;

/**Column{tableCatalog='def', tableSchema='performance_schema', tableName='memory_summary_by_user_by_event_name', columnName='SUM_NUMBER_OF_BYTES_ALLOC', ordinalPosition=5, columnDefault='null', isNullable='NO', dataType='bigint', characterMaximumLength=0, characterOctetLength=0, numericPrecision=20, numericScale=0, datetimePrecision=0, characterSetName='null', collationName='null', columnType='bigint(20) unsigned', columnKey='', extra='', privileges='select,insert,update,references', columnComment='', generationExpression=''}*/
private Long sumNumberOfBytesAlloc;

/**Column{tableCatalog='def', tableSchema='performance_schema', tableName='memory_summary_by_user_by_event_name', columnName='SUM_NUMBER_OF_BYTES_FREE', ordinalPosition=6, columnDefault='null', isNullable='NO', dataType='bigint', characterMaximumLength=0, characterOctetLength=0, numericPrecision=20, numericScale=0, datetimePrecision=0, characterSetName='null', collationName='null', columnType='bigint(20) unsigned', columnKey='', extra='', privileges='select,insert,update,references', columnComment='', generationExpression=''}*/
private Long sumNumberOfBytesFree;

/**Column{tableCatalog='def', tableSchema='performance_schema', tableName='memory_summary_by_user_by_event_name', columnName='LOW_COUNT_USED', ordinalPosition=7, columnDefault='null', isNullable='NO', dataType='bigint', characterMaximumLength=0, characterOctetLength=0, numericPrecision=19, numericScale=0, datetimePrecision=0, characterSetName='null', collationName='null', columnType='bigint(20)', columnKey='', extra='', privileges='select,insert,update,references', columnComment='', generationExpression=''}*/
private Long lowCountUsed;

/**Column{tableCatalog='def', tableSchema='performance_schema', tableName='memory_summary_by_user_by_event_name', columnName='CURRENT_COUNT_USED', ordinalPosition=8, columnDefault='null', isNullable='NO', dataType='bigint', characterMaximumLength=0, characterOctetLength=0, numericPrecision=19, numericScale=0, datetimePrecision=0, characterSetName='null', collationName='null', columnType='bigint(20)', columnKey='', extra='', privileges='select,insert,update,references', columnComment='', generationExpression=''}*/
private Long currentCountUsed;

/**Column{tableCatalog='def', tableSchema='performance_schema', tableName='memory_summary_by_user_by_event_name', columnName='HIGH_COUNT_USED', ordinalPosition=9, columnDefault='null', isNullable='NO', dataType='bigint', characterMaximumLength=0, characterOctetLength=0, numericPrecision=19, numericScale=0, datetimePrecision=0, characterSetName='null', collationName='null', columnType='bigint(20)', columnKey='', extra='', privileges='select,insert,update,references', columnComment='', generationExpression=''}*/
private Long highCountUsed;

/**Column{tableCatalog='def', tableSchema='performance_schema', tableName='memory_summary_by_user_by_event_name', columnName='LOW_NUMBER_OF_BYTES_USED', ordinalPosition=10, columnDefault='null', isNullable='NO', dataType='bigint', characterMaximumLength=0, characterOctetLength=0, numericPrecision=19, numericScale=0, datetimePrecision=0, characterSetName='null', collationName='null', columnType='bigint(20)', columnKey='', extra='', privileges='select,insert,update,references', columnComment='', generationExpression=''}*/
private Long lowNumberOfBytesUsed;

/**Column{tableCatalog='def', tableSchema='performance_schema', tableName='memory_summary_by_user_by_event_name', columnName='CURRENT_NUMBER_OF_BYTES_USED', ordinalPosition=11, columnDefault='null', isNullable='NO', dataType='bigint', characterMaximumLength=0, characterOctetLength=0, numericPrecision=19, numericScale=0, datetimePrecision=0, characterSetName='null', collationName='null', columnType='bigint(20)', columnKey='', extra='', privileges='select,insert,update,references', columnComment='', generationExpression=''}*/
private Long currentNumberOfBytesUsed;

/**Column{tableCatalog='def', tableSchema='performance_schema', tableName='memory_summary_by_user_by_event_name', columnName='HIGH_NUMBER_OF_BYTES_USED', ordinalPosition=12, columnDefault='null', isNullable='NO', dataType='bigint', characterMaximumLength=0, characterOctetLength=0, numericPrecision=19, numericScale=0, datetimePrecision=0, characterSetName='null', collationName='null', columnType='bigint(20)', columnKey='', extra='', privileges='select,insert,update,references', columnComment='', generationExpression=''}*/
private Long highNumberOfBytesUsed;

public String getUser(){
return user;
}

public String getEventName(){
return eventName;
}

public Long getCountAlloc(){
return countAlloc;
}

public Long getCountFree(){
return countFree;
}

public Long getSumNumberOfBytesAlloc(){
return sumNumberOfBytesAlloc;
}

public Long getSumNumberOfBytesFree(){
return sumNumberOfBytesFree;
}

public Long getLowCountUsed(){
return lowCountUsed;
}

public Long getCurrentCountUsed(){
return currentCountUsed;
}

public Long getHighCountUsed(){
return highCountUsed;
}

public Long getLowNumberOfBytesUsed(){
return lowNumberOfBytesUsed;
}

public Long getCurrentNumberOfBytesUsed(){
return currentNumberOfBytesUsed;
}

public Long getHighNumberOfBytesUsed(){
return highNumberOfBytesUsed;
}

}