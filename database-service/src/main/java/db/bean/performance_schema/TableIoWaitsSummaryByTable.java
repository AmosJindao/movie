package db.bean.performance_schema;


/**
*/
public class TableIoWaitsSummaryByTable{
/**Column{tableCatalog='def', tableSchema='performance_schema', tableName='table_io_waits_summary_by_table', columnName='OBJECT_TYPE', ordinalPosition=1, columnDefault='null', isNullable='YES', dataType='varchar', characterMaximumLength=64, characterOctetLength=192, numericPrecision=0, numericScale=0, datetimePrecision=0, characterSetName='utf8', collationName='utf8_general_ci', columnType='varchar(64)', columnKey='', extra='', privileges='select,insert,update,references', columnComment='', generationExpression=''}*/
private String objectType;

/**Column{tableCatalog='def', tableSchema='performance_schema', tableName='table_io_waits_summary_by_table', columnName='OBJECT_SCHEMA', ordinalPosition=2, columnDefault='null', isNullable='YES', dataType='varchar', characterMaximumLength=64, characterOctetLength=192, numericPrecision=0, numericScale=0, datetimePrecision=0, characterSetName='utf8', collationName='utf8_general_ci', columnType='varchar(64)', columnKey='', extra='', privileges='select,insert,update,references', columnComment='', generationExpression=''}*/
private String objectSchema;

/**Column{tableCatalog='def', tableSchema='performance_schema', tableName='table_io_waits_summary_by_table', columnName='OBJECT_NAME', ordinalPosition=3, columnDefault='null', isNullable='YES', dataType='varchar', characterMaximumLength=64, characterOctetLength=192, numericPrecision=0, numericScale=0, datetimePrecision=0, characterSetName='utf8', collationName='utf8_general_ci', columnType='varchar(64)', columnKey='', extra='', privileges='select,insert,update,references', columnComment='', generationExpression=''}*/
private String objectName;

/**Column{tableCatalog='def', tableSchema='performance_schema', tableName='table_io_waits_summary_by_table', columnName='COUNT_STAR', ordinalPosition=4, columnDefault='null', isNullable='NO', dataType='bigint', characterMaximumLength=0, characterOctetLength=0, numericPrecision=20, numericScale=0, datetimePrecision=0, characterSetName='null', collationName='null', columnType='bigint(20) unsigned', columnKey='', extra='', privileges='select,insert,update,references', columnComment='', generationExpression=''}*/
private Long countStar;

/**Column{tableCatalog='def', tableSchema='performance_schema', tableName='table_io_waits_summary_by_table', columnName='SUM_TIMER_WAIT', ordinalPosition=5, columnDefault='null', isNullable='NO', dataType='bigint', characterMaximumLength=0, characterOctetLength=0, numericPrecision=20, numericScale=0, datetimePrecision=0, characterSetName='null', collationName='null', columnType='bigint(20) unsigned', columnKey='', extra='', privileges='select,insert,update,references', columnComment='', generationExpression=''}*/
private Long sumTimerWait;

/**Column{tableCatalog='def', tableSchema='performance_schema', tableName='table_io_waits_summary_by_table', columnName='MIN_TIMER_WAIT', ordinalPosition=6, columnDefault='null', isNullable='NO', dataType='bigint', characterMaximumLength=0, characterOctetLength=0, numericPrecision=20, numericScale=0, datetimePrecision=0, characterSetName='null', collationName='null', columnType='bigint(20) unsigned', columnKey='', extra='', privileges='select,insert,update,references', columnComment='', generationExpression=''}*/
private Long minTimerWait;

/**Column{tableCatalog='def', tableSchema='performance_schema', tableName='table_io_waits_summary_by_table', columnName='AVG_TIMER_WAIT', ordinalPosition=7, columnDefault='null', isNullable='NO', dataType='bigint', characterMaximumLength=0, characterOctetLength=0, numericPrecision=20, numericScale=0, datetimePrecision=0, characterSetName='null', collationName='null', columnType='bigint(20) unsigned', columnKey='', extra='', privileges='select,insert,update,references', columnComment='', generationExpression=''}*/
private Long avgTimerWait;

/**Column{tableCatalog='def', tableSchema='performance_schema', tableName='table_io_waits_summary_by_table', columnName='MAX_TIMER_WAIT', ordinalPosition=8, columnDefault='null', isNullable='NO', dataType='bigint', characterMaximumLength=0, characterOctetLength=0, numericPrecision=20, numericScale=0, datetimePrecision=0, characterSetName='null', collationName='null', columnType='bigint(20) unsigned', columnKey='', extra='', privileges='select,insert,update,references', columnComment='', generationExpression=''}*/
private Long maxTimerWait;

/**Column{tableCatalog='def', tableSchema='performance_schema', tableName='table_io_waits_summary_by_table', columnName='COUNT_READ', ordinalPosition=9, columnDefault='null', isNullable='NO', dataType='bigint', characterMaximumLength=0, characterOctetLength=0, numericPrecision=20, numericScale=0, datetimePrecision=0, characterSetName='null', collationName='null', columnType='bigint(20) unsigned', columnKey='', extra='', privileges='select,insert,update,references', columnComment='', generationExpression=''}*/
private Long countRead;

/**Column{tableCatalog='def', tableSchema='performance_schema', tableName='table_io_waits_summary_by_table', columnName='SUM_TIMER_READ', ordinalPosition=10, columnDefault='null', isNullable='NO', dataType='bigint', characterMaximumLength=0, characterOctetLength=0, numericPrecision=20, numericScale=0, datetimePrecision=0, characterSetName='null', collationName='null', columnType='bigint(20) unsigned', columnKey='', extra='', privileges='select,insert,update,references', columnComment='', generationExpression=''}*/
private Long sumTimerRead;

/**Column{tableCatalog='def', tableSchema='performance_schema', tableName='table_io_waits_summary_by_table', columnName='MIN_TIMER_READ', ordinalPosition=11, columnDefault='null', isNullable='NO', dataType='bigint', characterMaximumLength=0, characterOctetLength=0, numericPrecision=20, numericScale=0, datetimePrecision=0, characterSetName='null', collationName='null', columnType='bigint(20) unsigned', columnKey='', extra='', privileges='select,insert,update,references', columnComment='', generationExpression=''}*/
private Long minTimerRead;

/**Column{tableCatalog='def', tableSchema='performance_schema', tableName='table_io_waits_summary_by_table', columnName='AVG_TIMER_READ', ordinalPosition=12, columnDefault='null', isNullable='NO', dataType='bigint', characterMaximumLength=0, characterOctetLength=0, numericPrecision=20, numericScale=0, datetimePrecision=0, characterSetName='null', collationName='null', columnType='bigint(20) unsigned', columnKey='', extra='', privileges='select,insert,update,references', columnComment='', generationExpression=''}*/
private Long avgTimerRead;

/**Column{tableCatalog='def', tableSchema='performance_schema', tableName='table_io_waits_summary_by_table', columnName='MAX_TIMER_READ', ordinalPosition=13, columnDefault='null', isNullable='NO', dataType='bigint', characterMaximumLength=0, characterOctetLength=0, numericPrecision=20, numericScale=0, datetimePrecision=0, characterSetName='null', collationName='null', columnType='bigint(20) unsigned', columnKey='', extra='', privileges='select,insert,update,references', columnComment='', generationExpression=''}*/
private Long maxTimerRead;

/**Column{tableCatalog='def', tableSchema='performance_schema', tableName='table_io_waits_summary_by_table', columnName='COUNT_WRITE', ordinalPosition=14, columnDefault='null', isNullable='NO', dataType='bigint', characterMaximumLength=0, characterOctetLength=0, numericPrecision=20, numericScale=0, datetimePrecision=0, characterSetName='null', collationName='null', columnType='bigint(20) unsigned', columnKey='', extra='', privileges='select,insert,update,references', columnComment='', generationExpression=''}*/
private Long countWrite;

/**Column{tableCatalog='def', tableSchema='performance_schema', tableName='table_io_waits_summary_by_table', columnName='SUM_TIMER_WRITE', ordinalPosition=15, columnDefault='null', isNullable='NO', dataType='bigint', characterMaximumLength=0, characterOctetLength=0, numericPrecision=20, numericScale=0, datetimePrecision=0, characterSetName='null', collationName='null', columnType='bigint(20) unsigned', columnKey='', extra='', privileges='select,insert,update,references', columnComment='', generationExpression=''}*/
private Long sumTimerWrite;

/**Column{tableCatalog='def', tableSchema='performance_schema', tableName='table_io_waits_summary_by_table', columnName='MIN_TIMER_WRITE', ordinalPosition=16, columnDefault='null', isNullable='NO', dataType='bigint', characterMaximumLength=0, characterOctetLength=0, numericPrecision=20, numericScale=0, datetimePrecision=0, characterSetName='null', collationName='null', columnType='bigint(20) unsigned', columnKey='', extra='', privileges='select,insert,update,references', columnComment='', generationExpression=''}*/
private Long minTimerWrite;

/**Column{tableCatalog='def', tableSchema='performance_schema', tableName='table_io_waits_summary_by_table', columnName='AVG_TIMER_WRITE', ordinalPosition=17, columnDefault='null', isNullable='NO', dataType='bigint', characterMaximumLength=0, characterOctetLength=0, numericPrecision=20, numericScale=0, datetimePrecision=0, characterSetName='null', collationName='null', columnType='bigint(20) unsigned', columnKey='', extra='', privileges='select,insert,update,references', columnComment='', generationExpression=''}*/
private Long avgTimerWrite;

/**Column{tableCatalog='def', tableSchema='performance_schema', tableName='table_io_waits_summary_by_table', columnName='MAX_TIMER_WRITE', ordinalPosition=18, columnDefault='null', isNullable='NO', dataType='bigint', characterMaximumLength=0, characterOctetLength=0, numericPrecision=20, numericScale=0, datetimePrecision=0, characterSetName='null', collationName='null', columnType='bigint(20) unsigned', columnKey='', extra='', privileges='select,insert,update,references', columnComment='', generationExpression=''}*/
private Long maxTimerWrite;

/**Column{tableCatalog='def', tableSchema='performance_schema', tableName='table_io_waits_summary_by_table', columnName='COUNT_FETCH', ordinalPosition=19, columnDefault='null', isNullable='NO', dataType='bigint', characterMaximumLength=0, characterOctetLength=0, numericPrecision=20, numericScale=0, datetimePrecision=0, characterSetName='null', collationName='null', columnType='bigint(20) unsigned', columnKey='', extra='', privileges='select,insert,update,references', columnComment='', generationExpression=''}*/
private Long countFetch;

/**Column{tableCatalog='def', tableSchema='performance_schema', tableName='table_io_waits_summary_by_table', columnName='SUM_TIMER_FETCH', ordinalPosition=20, columnDefault='null', isNullable='NO', dataType='bigint', characterMaximumLength=0, characterOctetLength=0, numericPrecision=20, numericScale=0, datetimePrecision=0, characterSetName='null', collationName='null', columnType='bigint(20) unsigned', columnKey='', extra='', privileges='select,insert,update,references', columnComment='', generationExpression=''}*/
private Long sumTimerFetch;

/**Column{tableCatalog='def', tableSchema='performance_schema', tableName='table_io_waits_summary_by_table', columnName='MIN_TIMER_FETCH', ordinalPosition=21, columnDefault='null', isNullable='NO', dataType='bigint', characterMaximumLength=0, characterOctetLength=0, numericPrecision=20, numericScale=0, datetimePrecision=0, characterSetName='null', collationName='null', columnType='bigint(20) unsigned', columnKey='', extra='', privileges='select,insert,update,references', columnComment='', generationExpression=''}*/
private Long minTimerFetch;

/**Column{tableCatalog='def', tableSchema='performance_schema', tableName='table_io_waits_summary_by_table', columnName='AVG_TIMER_FETCH', ordinalPosition=22, columnDefault='null', isNullable='NO', dataType='bigint', characterMaximumLength=0, characterOctetLength=0, numericPrecision=20, numericScale=0, datetimePrecision=0, characterSetName='null', collationName='null', columnType='bigint(20) unsigned', columnKey='', extra='', privileges='select,insert,update,references', columnComment='', generationExpression=''}*/
private Long avgTimerFetch;

/**Column{tableCatalog='def', tableSchema='performance_schema', tableName='table_io_waits_summary_by_table', columnName='MAX_TIMER_FETCH', ordinalPosition=23, columnDefault='null', isNullable='NO', dataType='bigint', characterMaximumLength=0, characterOctetLength=0, numericPrecision=20, numericScale=0, datetimePrecision=0, characterSetName='null', collationName='null', columnType='bigint(20) unsigned', columnKey='', extra='', privileges='select,insert,update,references', columnComment='', generationExpression=''}*/
private Long maxTimerFetch;

/**Column{tableCatalog='def', tableSchema='performance_schema', tableName='table_io_waits_summary_by_table', columnName='COUNT_INSERT', ordinalPosition=24, columnDefault='null', isNullable='NO', dataType='bigint', characterMaximumLength=0, characterOctetLength=0, numericPrecision=20, numericScale=0, datetimePrecision=0, characterSetName='null', collationName='null', columnType='bigint(20) unsigned', columnKey='', extra='', privileges='select,insert,update,references', columnComment='', generationExpression=''}*/
private Long countInsert;

/**Column{tableCatalog='def', tableSchema='performance_schema', tableName='table_io_waits_summary_by_table', columnName='SUM_TIMER_INSERT', ordinalPosition=25, columnDefault='null', isNullable='NO', dataType='bigint', characterMaximumLength=0, characterOctetLength=0, numericPrecision=20, numericScale=0, datetimePrecision=0, characterSetName='null', collationName='null', columnType='bigint(20) unsigned', columnKey='', extra='', privileges='select,insert,update,references', columnComment='', generationExpression=''}*/
private Long sumTimerInsert;

/**Column{tableCatalog='def', tableSchema='performance_schema', tableName='table_io_waits_summary_by_table', columnName='MIN_TIMER_INSERT', ordinalPosition=26, columnDefault='null', isNullable='NO', dataType='bigint', characterMaximumLength=0, characterOctetLength=0, numericPrecision=20, numericScale=0, datetimePrecision=0, characterSetName='null', collationName='null', columnType='bigint(20) unsigned', columnKey='', extra='', privileges='select,insert,update,references', columnComment='', generationExpression=''}*/
private Long minTimerInsert;

/**Column{tableCatalog='def', tableSchema='performance_schema', tableName='table_io_waits_summary_by_table', columnName='AVG_TIMER_INSERT', ordinalPosition=27, columnDefault='null', isNullable='NO', dataType='bigint', characterMaximumLength=0, characterOctetLength=0, numericPrecision=20, numericScale=0, datetimePrecision=0, characterSetName='null', collationName='null', columnType='bigint(20) unsigned', columnKey='', extra='', privileges='select,insert,update,references', columnComment='', generationExpression=''}*/
private Long avgTimerInsert;

/**Column{tableCatalog='def', tableSchema='performance_schema', tableName='table_io_waits_summary_by_table', columnName='MAX_TIMER_INSERT', ordinalPosition=28, columnDefault='null', isNullable='NO', dataType='bigint', characterMaximumLength=0, characterOctetLength=0, numericPrecision=20, numericScale=0, datetimePrecision=0, characterSetName='null', collationName='null', columnType='bigint(20) unsigned', columnKey='', extra='', privileges='select,insert,update,references', columnComment='', generationExpression=''}*/
private Long maxTimerInsert;

/**Column{tableCatalog='def', tableSchema='performance_schema', tableName='table_io_waits_summary_by_table', columnName='COUNT_UPDATE', ordinalPosition=29, columnDefault='null', isNullable='NO', dataType='bigint', characterMaximumLength=0, characterOctetLength=0, numericPrecision=20, numericScale=0, datetimePrecision=0, characterSetName='null', collationName='null', columnType='bigint(20) unsigned', columnKey='', extra='', privileges='select,insert,update,references', columnComment='', generationExpression=''}*/
private Long countUpdate;

/**Column{tableCatalog='def', tableSchema='performance_schema', tableName='table_io_waits_summary_by_table', columnName='SUM_TIMER_UPDATE', ordinalPosition=30, columnDefault='null', isNullable='NO', dataType='bigint', characterMaximumLength=0, characterOctetLength=0, numericPrecision=20, numericScale=0, datetimePrecision=0, characterSetName='null', collationName='null', columnType='bigint(20) unsigned', columnKey='', extra='', privileges='select,insert,update,references', columnComment='', generationExpression=''}*/
private Long sumTimerUpdate;

/**Column{tableCatalog='def', tableSchema='performance_schema', tableName='table_io_waits_summary_by_table', columnName='MIN_TIMER_UPDATE', ordinalPosition=31, columnDefault='null', isNullable='NO', dataType='bigint', characterMaximumLength=0, characterOctetLength=0, numericPrecision=20, numericScale=0, datetimePrecision=0, characterSetName='null', collationName='null', columnType='bigint(20) unsigned', columnKey='', extra='', privileges='select,insert,update,references', columnComment='', generationExpression=''}*/
private Long minTimerUpdate;

/**Column{tableCatalog='def', tableSchema='performance_schema', tableName='table_io_waits_summary_by_table', columnName='AVG_TIMER_UPDATE', ordinalPosition=32, columnDefault='null', isNullable='NO', dataType='bigint', characterMaximumLength=0, characterOctetLength=0, numericPrecision=20, numericScale=0, datetimePrecision=0, characterSetName='null', collationName='null', columnType='bigint(20) unsigned', columnKey='', extra='', privileges='select,insert,update,references', columnComment='', generationExpression=''}*/
private Long avgTimerUpdate;

/**Column{tableCatalog='def', tableSchema='performance_schema', tableName='table_io_waits_summary_by_table', columnName='MAX_TIMER_UPDATE', ordinalPosition=33, columnDefault='null', isNullable='NO', dataType='bigint', characterMaximumLength=0, characterOctetLength=0, numericPrecision=20, numericScale=0, datetimePrecision=0, characterSetName='null', collationName='null', columnType='bigint(20) unsigned', columnKey='', extra='', privileges='select,insert,update,references', columnComment='', generationExpression=''}*/
private Long maxTimerUpdate;

/**Column{tableCatalog='def', tableSchema='performance_schema', tableName='table_io_waits_summary_by_table', columnName='COUNT_DELETE', ordinalPosition=34, columnDefault='null', isNullable='NO', dataType='bigint', characterMaximumLength=0, characterOctetLength=0, numericPrecision=20, numericScale=0, datetimePrecision=0, characterSetName='null', collationName='null', columnType='bigint(20) unsigned', columnKey='', extra='', privileges='select,insert,update,references', columnComment='', generationExpression=''}*/
private Long countDelete;

/**Column{tableCatalog='def', tableSchema='performance_schema', tableName='table_io_waits_summary_by_table', columnName='SUM_TIMER_DELETE', ordinalPosition=35, columnDefault='null', isNullable='NO', dataType='bigint', characterMaximumLength=0, characterOctetLength=0, numericPrecision=20, numericScale=0, datetimePrecision=0, characterSetName='null', collationName='null', columnType='bigint(20) unsigned', columnKey='', extra='', privileges='select,insert,update,references', columnComment='', generationExpression=''}*/
private Long sumTimerDelete;

/**Column{tableCatalog='def', tableSchema='performance_schema', tableName='table_io_waits_summary_by_table', columnName='MIN_TIMER_DELETE', ordinalPosition=36, columnDefault='null', isNullable='NO', dataType='bigint', characterMaximumLength=0, characterOctetLength=0, numericPrecision=20, numericScale=0, datetimePrecision=0, characterSetName='null', collationName='null', columnType='bigint(20) unsigned', columnKey='', extra='', privileges='select,insert,update,references', columnComment='', generationExpression=''}*/
private Long minTimerDelete;

/**Column{tableCatalog='def', tableSchema='performance_schema', tableName='table_io_waits_summary_by_table', columnName='AVG_TIMER_DELETE', ordinalPosition=37, columnDefault='null', isNullable='NO', dataType='bigint', characterMaximumLength=0, characterOctetLength=0, numericPrecision=20, numericScale=0, datetimePrecision=0, characterSetName='null', collationName='null', columnType='bigint(20) unsigned', columnKey='', extra='', privileges='select,insert,update,references', columnComment='', generationExpression=''}*/
private Long avgTimerDelete;

/**Column{tableCatalog='def', tableSchema='performance_schema', tableName='table_io_waits_summary_by_table', columnName='MAX_TIMER_DELETE', ordinalPosition=38, columnDefault='null', isNullable='NO', dataType='bigint', characterMaximumLength=0, characterOctetLength=0, numericPrecision=20, numericScale=0, datetimePrecision=0, characterSetName='null', collationName='null', columnType='bigint(20) unsigned', columnKey='', extra='', privileges='select,insert,update,references', columnComment='', generationExpression=''}*/
private Long maxTimerDelete;

public String getObjectType(){
return objectType;
}

public String getObjectSchema(){
return objectSchema;
}

public String getObjectName(){
return objectName;
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

public Long getCountFetch(){
return countFetch;
}

public Long getSumTimerFetch(){
return sumTimerFetch;
}

public Long getMinTimerFetch(){
return minTimerFetch;
}

public Long getAvgTimerFetch(){
return avgTimerFetch;
}

public Long getMaxTimerFetch(){
return maxTimerFetch;
}

public Long getCountInsert(){
return countInsert;
}

public Long getSumTimerInsert(){
return sumTimerInsert;
}

public Long getMinTimerInsert(){
return minTimerInsert;
}

public Long getAvgTimerInsert(){
return avgTimerInsert;
}

public Long getMaxTimerInsert(){
return maxTimerInsert;
}

public Long getCountUpdate(){
return countUpdate;
}

public Long getSumTimerUpdate(){
return sumTimerUpdate;
}

public Long getMinTimerUpdate(){
return minTimerUpdate;
}

public Long getAvgTimerUpdate(){
return avgTimerUpdate;
}

public Long getMaxTimerUpdate(){
return maxTimerUpdate;
}

public Long getCountDelete(){
return countDelete;
}

public Long getSumTimerDelete(){
return sumTimerDelete;
}

public Long getMinTimerDelete(){
return minTimerDelete;
}

public Long getAvgTimerDelete(){
return avgTimerDelete;
}

public Long getMaxTimerDelete(){
return maxTimerDelete;
}

}