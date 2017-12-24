package db.bean.performance_schema;


/* SELECT FILE_NAME AS fileName, EVENT_NAME AS eventName, OBJECT_INSTANCE_BEGIN AS objectInstanceBegin, COUNT_STAR AS countStar, SUM_TIMER_WAIT AS sumTimerWait, MIN_TIMER_WAIT AS minTimerWait, AVG_TIMER_WAIT AS avgTimerWait, MAX_TIMER_WAIT AS maxTimerWait, COUNT_READ AS countRead, SUM_TIMER_READ AS sumTimerRead, MIN_TIMER_READ AS minTimerRead, AVG_TIMER_READ AS avgTimerRead, MAX_TIMER_READ AS maxTimerRead, SUM_NUMBER_OF_BYTES_READ AS sumNumberOfBytesRead, COUNT_WRITE AS countWrite, SUM_TIMER_WRITE AS sumTimerWrite, MIN_TIMER_WRITE AS minTimerWrite, AVG_TIMER_WRITE AS avgTimerWrite, MAX_TIMER_WRITE AS maxTimerWrite, SUM_NUMBER_OF_BYTES_WRITE AS sumNumberOfBytesWrite, COUNT_MISC AS countMisc, SUM_TIMER_MISC AS sumTimerMisc, MIN_TIMER_MISC AS minTimerMisc, AVG_TIMER_MISC AS avgTimerMisc, MAX_TIMER_MISC AS maxTimerMisc FROM performance_schema.file_summary_by_instance */
/**
*/
public class FileSummaryByInstance{
/**Column{tableCatalog='def', tableSchema='performance_schema', tableName='file_summary_by_instance', columnName='FILE_NAME', ordinalPosition=1, columnDefault='null', isNullable='NO', dataType='varchar', characterMaximumLength=512, characterOctetLength=1536, numericPrecision=0, numericScale=0, datetimePrecision=0, characterSetName='utf8', collationName='utf8_general_ci', columnType='varchar(512)', columnKey='', extra='', privileges='select,insert,update,references', columnComment='', generationExpression=''}*/
private String fileName;

/**Column{tableCatalog='def', tableSchema='performance_schema', tableName='file_summary_by_instance', columnName='EVENT_NAME', ordinalPosition=2, columnDefault='null', isNullable='NO', dataType='varchar', characterMaximumLength=128, characterOctetLength=384, numericPrecision=0, numericScale=0, datetimePrecision=0, characterSetName='utf8', collationName='utf8_general_ci', columnType='varchar(128)', columnKey='', extra='', privileges='select,insert,update,references', columnComment='', generationExpression=''}*/
private String eventName;

/**Column{tableCatalog='def', tableSchema='performance_schema', tableName='file_summary_by_instance', columnName='OBJECT_INSTANCE_BEGIN', ordinalPosition=3, columnDefault='null', isNullable='NO', dataType='bigint', characterMaximumLength=0, characterOctetLength=0, numericPrecision=20, numericScale=0, datetimePrecision=0, characterSetName='null', collationName='null', columnType='bigint(20) unsigned', columnKey='', extra='', privileges='select,insert,update,references', columnComment='', generationExpression=''}*/
private Long objectInstanceBegin;

/**Column{tableCatalog='def', tableSchema='performance_schema', tableName='file_summary_by_instance', columnName='COUNT_STAR', ordinalPosition=4, columnDefault='null', isNullable='NO', dataType='bigint', characterMaximumLength=0, characterOctetLength=0, numericPrecision=20, numericScale=0, datetimePrecision=0, characterSetName='null', collationName='null', columnType='bigint(20) unsigned', columnKey='', extra='', privileges='select,insert,update,references', columnComment='', generationExpression=''}*/
private Long countStar;

/**Column{tableCatalog='def', tableSchema='performance_schema', tableName='file_summary_by_instance', columnName='SUM_TIMER_WAIT', ordinalPosition=5, columnDefault='null', isNullable='NO', dataType='bigint', characterMaximumLength=0, characterOctetLength=0, numericPrecision=20, numericScale=0, datetimePrecision=0, characterSetName='null', collationName='null', columnType='bigint(20) unsigned', columnKey='', extra='', privileges='select,insert,update,references', columnComment='', generationExpression=''}*/
private Long sumTimerWait;

/**Column{tableCatalog='def', tableSchema='performance_schema', tableName='file_summary_by_instance', columnName='MIN_TIMER_WAIT', ordinalPosition=6, columnDefault='null', isNullable='NO', dataType='bigint', characterMaximumLength=0, characterOctetLength=0, numericPrecision=20, numericScale=0, datetimePrecision=0, characterSetName='null', collationName='null', columnType='bigint(20) unsigned', columnKey='', extra='', privileges='select,insert,update,references', columnComment='', generationExpression=''}*/
private Long minTimerWait;

/**Column{tableCatalog='def', tableSchema='performance_schema', tableName='file_summary_by_instance', columnName='AVG_TIMER_WAIT', ordinalPosition=7, columnDefault='null', isNullable='NO', dataType='bigint', characterMaximumLength=0, characterOctetLength=0, numericPrecision=20, numericScale=0, datetimePrecision=0, characterSetName='null', collationName='null', columnType='bigint(20) unsigned', columnKey='', extra='', privileges='select,insert,update,references', columnComment='', generationExpression=''}*/
private Long avgTimerWait;

/**Column{tableCatalog='def', tableSchema='performance_schema', tableName='file_summary_by_instance', columnName='MAX_TIMER_WAIT', ordinalPosition=8, columnDefault='null', isNullable='NO', dataType='bigint', characterMaximumLength=0, characterOctetLength=0, numericPrecision=20, numericScale=0, datetimePrecision=0, characterSetName='null', collationName='null', columnType='bigint(20) unsigned', columnKey='', extra='', privileges='select,insert,update,references', columnComment='', generationExpression=''}*/
private Long maxTimerWait;

/**Column{tableCatalog='def', tableSchema='performance_schema', tableName='file_summary_by_instance', columnName='COUNT_READ', ordinalPosition=9, columnDefault='null', isNullable='NO', dataType='bigint', characterMaximumLength=0, characterOctetLength=0, numericPrecision=20, numericScale=0, datetimePrecision=0, characterSetName='null', collationName='null', columnType='bigint(20) unsigned', columnKey='', extra='', privileges='select,insert,update,references', columnComment='', generationExpression=''}*/
private Long countRead;

/**Column{tableCatalog='def', tableSchema='performance_schema', tableName='file_summary_by_instance', columnName='SUM_TIMER_READ', ordinalPosition=10, columnDefault='null', isNullable='NO', dataType='bigint', characterMaximumLength=0, characterOctetLength=0, numericPrecision=20, numericScale=0, datetimePrecision=0, characterSetName='null', collationName='null', columnType='bigint(20) unsigned', columnKey='', extra='', privileges='select,insert,update,references', columnComment='', generationExpression=''}*/
private Long sumTimerRead;

/**Column{tableCatalog='def', tableSchema='performance_schema', tableName='file_summary_by_instance', columnName='MIN_TIMER_READ', ordinalPosition=11, columnDefault='null', isNullable='NO', dataType='bigint', characterMaximumLength=0, characterOctetLength=0, numericPrecision=20, numericScale=0, datetimePrecision=0, characterSetName='null', collationName='null', columnType='bigint(20) unsigned', columnKey='', extra='', privileges='select,insert,update,references', columnComment='', generationExpression=''}*/
private Long minTimerRead;

/**Column{tableCatalog='def', tableSchema='performance_schema', tableName='file_summary_by_instance', columnName='AVG_TIMER_READ', ordinalPosition=12, columnDefault='null', isNullable='NO', dataType='bigint', characterMaximumLength=0, characterOctetLength=0, numericPrecision=20, numericScale=0, datetimePrecision=0, characterSetName='null', collationName='null', columnType='bigint(20) unsigned', columnKey='', extra='', privileges='select,insert,update,references', columnComment='', generationExpression=''}*/
private Long avgTimerRead;

/**Column{tableCatalog='def', tableSchema='performance_schema', tableName='file_summary_by_instance', columnName='MAX_TIMER_READ', ordinalPosition=13, columnDefault='null', isNullable='NO', dataType='bigint', characterMaximumLength=0, characterOctetLength=0, numericPrecision=20, numericScale=0, datetimePrecision=0, characterSetName='null', collationName='null', columnType='bigint(20) unsigned', columnKey='', extra='', privileges='select,insert,update,references', columnComment='', generationExpression=''}*/
private Long maxTimerRead;

/**Column{tableCatalog='def', tableSchema='performance_schema', tableName='file_summary_by_instance', columnName='SUM_NUMBER_OF_BYTES_READ', ordinalPosition=14, columnDefault='null', isNullable='NO', dataType='bigint', characterMaximumLength=0, characterOctetLength=0, numericPrecision=19, numericScale=0, datetimePrecision=0, characterSetName='null', collationName='null', columnType='bigint(20)', columnKey='', extra='', privileges='select,insert,update,references', columnComment='', generationExpression=''}*/
private Long sumNumberOfBytesRead;

/**Column{tableCatalog='def', tableSchema='performance_schema', tableName='file_summary_by_instance', columnName='COUNT_WRITE', ordinalPosition=15, columnDefault='null', isNullable='NO', dataType='bigint', characterMaximumLength=0, characterOctetLength=0, numericPrecision=20, numericScale=0, datetimePrecision=0, characterSetName='null', collationName='null', columnType='bigint(20) unsigned', columnKey='', extra='', privileges='select,insert,update,references', columnComment='', generationExpression=''}*/
private Long countWrite;

/**Column{tableCatalog='def', tableSchema='performance_schema', tableName='file_summary_by_instance', columnName='SUM_TIMER_WRITE', ordinalPosition=16, columnDefault='null', isNullable='NO', dataType='bigint', characterMaximumLength=0, characterOctetLength=0, numericPrecision=20, numericScale=0, datetimePrecision=0, characterSetName='null', collationName='null', columnType='bigint(20) unsigned', columnKey='', extra='', privileges='select,insert,update,references', columnComment='', generationExpression=''}*/
private Long sumTimerWrite;

/**Column{tableCatalog='def', tableSchema='performance_schema', tableName='file_summary_by_instance', columnName='MIN_TIMER_WRITE', ordinalPosition=17, columnDefault='null', isNullable='NO', dataType='bigint', characterMaximumLength=0, characterOctetLength=0, numericPrecision=20, numericScale=0, datetimePrecision=0, characterSetName='null', collationName='null', columnType='bigint(20) unsigned', columnKey='', extra='', privileges='select,insert,update,references', columnComment='', generationExpression=''}*/
private Long minTimerWrite;

/**Column{tableCatalog='def', tableSchema='performance_schema', tableName='file_summary_by_instance', columnName='AVG_TIMER_WRITE', ordinalPosition=18, columnDefault='null', isNullable='NO', dataType='bigint', characterMaximumLength=0, characterOctetLength=0, numericPrecision=20, numericScale=0, datetimePrecision=0, characterSetName='null', collationName='null', columnType='bigint(20) unsigned', columnKey='', extra='', privileges='select,insert,update,references', columnComment='', generationExpression=''}*/
private Long avgTimerWrite;

/**Column{tableCatalog='def', tableSchema='performance_schema', tableName='file_summary_by_instance', columnName='MAX_TIMER_WRITE', ordinalPosition=19, columnDefault='null', isNullable='NO', dataType='bigint', characterMaximumLength=0, characterOctetLength=0, numericPrecision=20, numericScale=0, datetimePrecision=0, characterSetName='null', collationName='null', columnType='bigint(20) unsigned', columnKey='', extra='', privileges='select,insert,update,references', columnComment='', generationExpression=''}*/
private Long maxTimerWrite;

/**Column{tableCatalog='def', tableSchema='performance_schema', tableName='file_summary_by_instance', columnName='SUM_NUMBER_OF_BYTES_WRITE', ordinalPosition=20, columnDefault='null', isNullable='NO', dataType='bigint', characterMaximumLength=0, characterOctetLength=0, numericPrecision=19, numericScale=0, datetimePrecision=0, characterSetName='null', collationName='null', columnType='bigint(20)', columnKey='', extra='', privileges='select,insert,update,references', columnComment='', generationExpression=''}*/
private Long sumNumberOfBytesWrite;

/**Column{tableCatalog='def', tableSchema='performance_schema', tableName='file_summary_by_instance', columnName='COUNT_MISC', ordinalPosition=21, columnDefault='null', isNullable='NO', dataType='bigint', characterMaximumLength=0, characterOctetLength=0, numericPrecision=20, numericScale=0, datetimePrecision=0, characterSetName='null', collationName='null', columnType='bigint(20) unsigned', columnKey='', extra='', privileges='select,insert,update,references', columnComment='', generationExpression=''}*/
private Long countMisc;

/**Column{tableCatalog='def', tableSchema='performance_schema', tableName='file_summary_by_instance', columnName='SUM_TIMER_MISC', ordinalPosition=22, columnDefault='null', isNullable='NO', dataType='bigint', characterMaximumLength=0, characterOctetLength=0, numericPrecision=20, numericScale=0, datetimePrecision=0, characterSetName='null', collationName='null', columnType='bigint(20) unsigned', columnKey='', extra='', privileges='select,insert,update,references', columnComment='', generationExpression=''}*/
private Long sumTimerMisc;

/**Column{tableCatalog='def', tableSchema='performance_schema', tableName='file_summary_by_instance', columnName='MIN_TIMER_MISC', ordinalPosition=23, columnDefault='null', isNullable='NO', dataType='bigint', characterMaximumLength=0, characterOctetLength=0, numericPrecision=20, numericScale=0, datetimePrecision=0, characterSetName='null', collationName='null', columnType='bigint(20) unsigned', columnKey='', extra='', privileges='select,insert,update,references', columnComment='', generationExpression=''}*/
private Long minTimerMisc;

/**Column{tableCatalog='def', tableSchema='performance_schema', tableName='file_summary_by_instance', columnName='AVG_TIMER_MISC', ordinalPosition=24, columnDefault='null', isNullable='NO', dataType='bigint', characterMaximumLength=0, characterOctetLength=0, numericPrecision=20, numericScale=0, datetimePrecision=0, characterSetName='null', collationName='null', columnType='bigint(20) unsigned', columnKey='', extra='', privileges='select,insert,update,references', columnComment='', generationExpression=''}*/
private Long avgTimerMisc;

/**Column{tableCatalog='def', tableSchema='performance_schema', tableName='file_summary_by_instance', columnName='MAX_TIMER_MISC', ordinalPosition=25, columnDefault='null', isNullable='NO', dataType='bigint', characterMaximumLength=0, characterOctetLength=0, numericPrecision=20, numericScale=0, datetimePrecision=0, characterSetName='null', collationName='null', columnType='bigint(20) unsigned', columnKey='', extra='', privileges='select,insert,update,references', columnComment='', generationExpression=''}*/
private Long maxTimerMisc;

public String getFileName(){
return fileName;
}

public String getEventName(){
return eventName;
}

public Long getObjectInstanceBegin(){
return objectInstanceBegin;
}

public Long getCountStar(){
return countStar;
}

public Long getSumTimerWait(){
return sumTimerWait;
}

public Long getMinTimerWait(){
return minTimerWait;
}

public Long getAvgTimerWait(){
return avgTimerWait;
}

public Long getMaxTimerWait(){
return maxTimerWait;
}

public Long getCountRead(){
return countRead;
}

public Long getSumTimerRead(){
return sumTimerRead;
}

public Long getMinTimerRead(){
return minTimerRead;
}

public Long getAvgTimerRead(){
return avgTimerRead;
}

public Long getMaxTimerRead(){
return maxTimerRead;
}

public Long getSumNumberOfBytesRead(){
return sumNumberOfBytesRead;
}

public Long getCountWrite(){
return countWrite;
}

public Long getSumTimerWrite(){
return sumTimerWrite;
}

public Long getMinTimerWrite(){
return minTimerWrite;
}

public Long getAvgTimerWrite(){
return avgTimerWrite;
}

public Long getMaxTimerWrite(){
return maxTimerWrite;
}

public Long getSumNumberOfBytesWrite(){
return sumNumberOfBytesWrite;
}

public Long getCountMisc(){
return countMisc;
}

public Long getSumTimerMisc(){
return sumTimerMisc;
}

public Long getMinTimerMisc(){
return minTimerMisc;
}

public Long getAvgTimerMisc(){
return avgTimerMisc;
}

public Long getMaxTimerMisc(){
return maxTimerMisc;
}

}