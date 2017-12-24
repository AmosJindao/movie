package db.bean.performance_schema;


/* SELECT OBJECT_TYPE AS objectType, OBJECT_SCHEMA AS objectSchema, OBJECT_NAME AS objectName, COUNT_STAR AS countStar, SUM_TIMER_WAIT AS sumTimerWait, MIN_TIMER_WAIT AS minTimerWait, AVG_TIMER_WAIT AS avgTimerWait, MAX_TIMER_WAIT AS maxTimerWait, COUNT_READ AS countRead, SUM_TIMER_READ AS sumTimerRead, MIN_TIMER_READ AS minTimerRead, AVG_TIMER_READ AS avgTimerRead, MAX_TIMER_READ AS maxTimerRead, COUNT_WRITE AS countWrite, SUM_TIMER_WRITE AS sumTimerWrite, MIN_TIMER_WRITE AS minTimerWrite, AVG_TIMER_WRITE AS avgTimerWrite, MAX_TIMER_WRITE AS maxTimerWrite, COUNT_READ_NORMAL AS countReadNormal, SUM_TIMER_READ_NORMAL AS sumTimerReadNormal, MIN_TIMER_READ_NORMAL AS minTimerReadNormal, AVG_TIMER_READ_NORMAL AS avgTimerReadNormal, MAX_TIMER_READ_NORMAL AS maxTimerReadNormal, COUNT_READ_WITH_SHARED_LOCKS AS countReadWithSharedLocks, SUM_TIMER_READ_WITH_SHARED_LOCKS AS sumTimerReadWithSharedLocks, MIN_TIMER_READ_WITH_SHARED_LOCKS AS minTimerReadWithSharedLocks, AVG_TIMER_READ_WITH_SHARED_LOCKS AS avgTimerReadWithSharedLocks, MAX_TIMER_READ_WITH_SHARED_LOCKS AS maxTimerReadWithSharedLocks, COUNT_READ_HIGH_PRIORITY AS countReadHighPriority, SUM_TIMER_READ_HIGH_PRIORITY AS sumTimerReadHighPriority, MIN_TIMER_READ_HIGH_PRIORITY AS minTimerReadHighPriority, AVG_TIMER_READ_HIGH_PRIORITY AS avgTimerReadHighPriority, MAX_TIMER_READ_HIGH_PRIORITY AS maxTimerReadHighPriority, COUNT_READ_NO_INSERT AS countReadNoInsert, SUM_TIMER_READ_NO_INSERT AS sumTimerReadNoInsert, MIN_TIMER_READ_NO_INSERT AS minTimerReadNoInsert, AVG_TIMER_READ_NO_INSERT AS avgTimerReadNoInsert, MAX_TIMER_READ_NO_INSERT AS maxTimerReadNoInsert, COUNT_READ_EXTERNAL AS countReadExternal, SUM_TIMER_READ_EXTERNAL AS sumTimerReadExternal, MIN_TIMER_READ_EXTERNAL AS minTimerReadExternal, AVG_TIMER_READ_EXTERNAL AS avgTimerReadExternal, MAX_TIMER_READ_EXTERNAL AS maxTimerReadExternal, COUNT_WRITE_ALLOW_WRITE AS countWriteAllowWrite, SUM_TIMER_WRITE_ALLOW_WRITE AS sumTimerWriteAllowWrite, MIN_TIMER_WRITE_ALLOW_WRITE AS minTimerWriteAllowWrite, AVG_TIMER_WRITE_ALLOW_WRITE AS avgTimerWriteAllowWrite, MAX_TIMER_WRITE_ALLOW_WRITE AS maxTimerWriteAllowWrite, COUNT_WRITE_CONCURRENT_INSERT AS countWriteConcurrentInsert, SUM_TIMER_WRITE_CONCURRENT_INSERT AS sumTimerWriteConcurrentInsert, MIN_TIMER_WRITE_CONCURRENT_INSERT AS minTimerWriteConcurrentInsert, AVG_TIMER_WRITE_CONCURRENT_INSERT AS avgTimerWriteConcurrentInsert, MAX_TIMER_WRITE_CONCURRENT_INSERT AS maxTimerWriteConcurrentInsert, COUNT_WRITE_LOW_PRIORITY AS countWriteLowPriority, SUM_TIMER_WRITE_LOW_PRIORITY AS sumTimerWriteLowPriority, MIN_TIMER_WRITE_LOW_PRIORITY AS minTimerWriteLowPriority, AVG_TIMER_WRITE_LOW_PRIORITY AS avgTimerWriteLowPriority, MAX_TIMER_WRITE_LOW_PRIORITY AS maxTimerWriteLowPriority, COUNT_WRITE_NORMAL AS countWriteNormal, SUM_TIMER_WRITE_NORMAL AS sumTimerWriteNormal, MIN_TIMER_WRITE_NORMAL AS minTimerWriteNormal, AVG_TIMER_WRITE_NORMAL AS avgTimerWriteNormal, MAX_TIMER_WRITE_NORMAL AS maxTimerWriteNormal, COUNT_WRITE_EXTERNAL AS countWriteExternal, SUM_TIMER_WRITE_EXTERNAL AS sumTimerWriteExternal, MIN_TIMER_WRITE_EXTERNAL AS minTimerWriteExternal, AVG_TIMER_WRITE_EXTERNAL AS avgTimerWriteExternal, MAX_TIMER_WRITE_EXTERNAL AS maxTimerWriteExternal FROM performance_schema.table_lock_waits_summary_by_table */
/**
*/
public class TableLockWaitsSummaryByTable{
/**Column{tableCatalog='def', tableSchema='performance_schema', tableName='table_lock_waits_summary_by_table', columnName='OBJECT_TYPE', ordinalPosition=1, columnDefault='null', isNullable='YES', dataType='varchar', characterMaximumLength=64, characterOctetLength=192, numericPrecision=0, numericScale=0, datetimePrecision=0, characterSetName='utf8', collationName='utf8_general_ci', columnType='varchar(64)', columnKey='', extra='', privileges='select,insert,update,references', columnComment='', generationExpression=''}*/
private String objectType;

/**Column{tableCatalog='def', tableSchema='performance_schema', tableName='table_lock_waits_summary_by_table', columnName='OBJECT_SCHEMA', ordinalPosition=2, columnDefault='null', isNullable='YES', dataType='varchar', characterMaximumLength=64, characterOctetLength=192, numericPrecision=0, numericScale=0, datetimePrecision=0, characterSetName='utf8', collationName='utf8_general_ci', columnType='varchar(64)', columnKey='', extra='', privileges='select,insert,update,references', columnComment='', generationExpression=''}*/
private String objectSchema;

/**Column{tableCatalog='def', tableSchema='performance_schema', tableName='table_lock_waits_summary_by_table', columnName='OBJECT_NAME', ordinalPosition=3, columnDefault='null', isNullable='YES', dataType='varchar', characterMaximumLength=64, characterOctetLength=192, numericPrecision=0, numericScale=0, datetimePrecision=0, characterSetName='utf8', collationName='utf8_general_ci', columnType='varchar(64)', columnKey='', extra='', privileges='select,insert,update,references', columnComment='', generationExpression=''}*/
private String objectName;

/**Column{tableCatalog='def', tableSchema='performance_schema', tableName='table_lock_waits_summary_by_table', columnName='COUNT_STAR', ordinalPosition=4, columnDefault='null', isNullable='NO', dataType='bigint', characterMaximumLength=0, characterOctetLength=0, numericPrecision=20, numericScale=0, datetimePrecision=0, characterSetName='null', collationName='null', columnType='bigint(20) unsigned', columnKey='', extra='', privileges='select,insert,update,references', columnComment='', generationExpression=''}*/
private Long countStar;

/**Column{tableCatalog='def', tableSchema='performance_schema', tableName='table_lock_waits_summary_by_table', columnName='SUM_TIMER_WAIT', ordinalPosition=5, columnDefault='null', isNullable='NO', dataType='bigint', characterMaximumLength=0, characterOctetLength=0, numericPrecision=20, numericScale=0, datetimePrecision=0, characterSetName='null', collationName='null', columnType='bigint(20) unsigned', columnKey='', extra='', privileges='select,insert,update,references', columnComment='', generationExpression=''}*/
private Long sumTimerWait;

/**Column{tableCatalog='def', tableSchema='performance_schema', tableName='table_lock_waits_summary_by_table', columnName='MIN_TIMER_WAIT', ordinalPosition=6, columnDefault='null', isNullable='NO', dataType='bigint', characterMaximumLength=0, characterOctetLength=0, numericPrecision=20, numericScale=0, datetimePrecision=0, characterSetName='null', collationName='null', columnType='bigint(20) unsigned', columnKey='', extra='', privileges='select,insert,update,references', columnComment='', generationExpression=''}*/
private Long minTimerWait;

/**Column{tableCatalog='def', tableSchema='performance_schema', tableName='table_lock_waits_summary_by_table', columnName='AVG_TIMER_WAIT', ordinalPosition=7, columnDefault='null', isNullable='NO', dataType='bigint', characterMaximumLength=0, characterOctetLength=0, numericPrecision=20, numericScale=0, datetimePrecision=0, characterSetName='null', collationName='null', columnType='bigint(20) unsigned', columnKey='', extra='', privileges='select,insert,update,references', columnComment='', generationExpression=''}*/
private Long avgTimerWait;

/**Column{tableCatalog='def', tableSchema='performance_schema', tableName='table_lock_waits_summary_by_table', columnName='MAX_TIMER_WAIT', ordinalPosition=8, columnDefault='null', isNullable='NO', dataType='bigint', characterMaximumLength=0, characterOctetLength=0, numericPrecision=20, numericScale=0, datetimePrecision=0, characterSetName='null', collationName='null', columnType='bigint(20) unsigned', columnKey='', extra='', privileges='select,insert,update,references', columnComment='', generationExpression=''}*/
private Long maxTimerWait;

/**Column{tableCatalog='def', tableSchema='performance_schema', tableName='table_lock_waits_summary_by_table', columnName='COUNT_READ', ordinalPosition=9, columnDefault='null', isNullable='NO', dataType='bigint', characterMaximumLength=0, characterOctetLength=0, numericPrecision=20, numericScale=0, datetimePrecision=0, characterSetName='null', collationName='null', columnType='bigint(20) unsigned', columnKey='', extra='', privileges='select,insert,update,references', columnComment='', generationExpression=''}*/
private Long countRead;

/**Column{tableCatalog='def', tableSchema='performance_schema', tableName='table_lock_waits_summary_by_table', columnName='SUM_TIMER_READ', ordinalPosition=10, columnDefault='null', isNullable='NO', dataType='bigint', characterMaximumLength=0, characterOctetLength=0, numericPrecision=20, numericScale=0, datetimePrecision=0, characterSetName='null', collationName='null', columnType='bigint(20) unsigned', columnKey='', extra='', privileges='select,insert,update,references', columnComment='', generationExpression=''}*/
private Long sumTimerRead;

/**Column{tableCatalog='def', tableSchema='performance_schema', tableName='table_lock_waits_summary_by_table', columnName='MIN_TIMER_READ', ordinalPosition=11, columnDefault='null', isNullable='NO', dataType='bigint', characterMaximumLength=0, characterOctetLength=0, numericPrecision=20, numericScale=0, datetimePrecision=0, characterSetName='null', collationName='null', columnType='bigint(20) unsigned', columnKey='', extra='', privileges='select,insert,update,references', columnComment='', generationExpression=''}*/
private Long minTimerRead;

/**Column{tableCatalog='def', tableSchema='performance_schema', tableName='table_lock_waits_summary_by_table', columnName='AVG_TIMER_READ', ordinalPosition=12, columnDefault='null', isNullable='NO', dataType='bigint', characterMaximumLength=0, characterOctetLength=0, numericPrecision=20, numericScale=0, datetimePrecision=0, characterSetName='null', collationName='null', columnType='bigint(20) unsigned', columnKey='', extra='', privileges='select,insert,update,references', columnComment='', generationExpression=''}*/
private Long avgTimerRead;

/**Column{tableCatalog='def', tableSchema='performance_schema', tableName='table_lock_waits_summary_by_table', columnName='MAX_TIMER_READ', ordinalPosition=13, columnDefault='null', isNullable='NO', dataType='bigint', characterMaximumLength=0, characterOctetLength=0, numericPrecision=20, numericScale=0, datetimePrecision=0, characterSetName='null', collationName='null', columnType='bigint(20) unsigned', columnKey='', extra='', privileges='select,insert,update,references', columnComment='', generationExpression=''}*/
private Long maxTimerRead;

/**Column{tableCatalog='def', tableSchema='performance_schema', tableName='table_lock_waits_summary_by_table', columnName='COUNT_WRITE', ordinalPosition=14, columnDefault='null', isNullable='NO', dataType='bigint', characterMaximumLength=0, characterOctetLength=0, numericPrecision=20, numericScale=0, datetimePrecision=0, characterSetName='null', collationName='null', columnType='bigint(20) unsigned', columnKey='', extra='', privileges='select,insert,update,references', columnComment='', generationExpression=''}*/
private Long countWrite;

/**Column{tableCatalog='def', tableSchema='performance_schema', tableName='table_lock_waits_summary_by_table', columnName='SUM_TIMER_WRITE', ordinalPosition=15, columnDefault='null', isNullable='NO', dataType='bigint', characterMaximumLength=0, characterOctetLength=0, numericPrecision=20, numericScale=0, datetimePrecision=0, characterSetName='null', collationName='null', columnType='bigint(20) unsigned', columnKey='', extra='', privileges='select,insert,update,references', columnComment='', generationExpression=''}*/
private Long sumTimerWrite;

/**Column{tableCatalog='def', tableSchema='performance_schema', tableName='table_lock_waits_summary_by_table', columnName='MIN_TIMER_WRITE', ordinalPosition=16, columnDefault='null', isNullable='NO', dataType='bigint', characterMaximumLength=0, characterOctetLength=0, numericPrecision=20, numericScale=0, datetimePrecision=0, characterSetName='null', collationName='null', columnType='bigint(20) unsigned', columnKey='', extra='', privileges='select,insert,update,references', columnComment='', generationExpression=''}*/
private Long minTimerWrite;

/**Column{tableCatalog='def', tableSchema='performance_schema', tableName='table_lock_waits_summary_by_table', columnName='AVG_TIMER_WRITE', ordinalPosition=17, columnDefault='null', isNullable='NO', dataType='bigint', characterMaximumLength=0, characterOctetLength=0, numericPrecision=20, numericScale=0, datetimePrecision=0, characterSetName='null', collationName='null', columnType='bigint(20) unsigned', columnKey='', extra='', privileges='select,insert,update,references', columnComment='', generationExpression=''}*/
private Long avgTimerWrite;

/**Column{tableCatalog='def', tableSchema='performance_schema', tableName='table_lock_waits_summary_by_table', columnName='MAX_TIMER_WRITE', ordinalPosition=18, columnDefault='null', isNullable='NO', dataType='bigint', characterMaximumLength=0, characterOctetLength=0, numericPrecision=20, numericScale=0, datetimePrecision=0, characterSetName='null', collationName='null', columnType='bigint(20) unsigned', columnKey='', extra='', privileges='select,insert,update,references', columnComment='', generationExpression=''}*/
private Long maxTimerWrite;

/**Column{tableCatalog='def', tableSchema='performance_schema', tableName='table_lock_waits_summary_by_table', columnName='COUNT_READ_NORMAL', ordinalPosition=19, columnDefault='null', isNullable='NO', dataType='bigint', characterMaximumLength=0, characterOctetLength=0, numericPrecision=20, numericScale=0, datetimePrecision=0, characterSetName='null', collationName='null', columnType='bigint(20) unsigned', columnKey='', extra='', privileges='select,insert,update,references', columnComment='', generationExpression=''}*/
private Long countReadNormal;

/**Column{tableCatalog='def', tableSchema='performance_schema', tableName='table_lock_waits_summary_by_table', columnName='SUM_TIMER_READ_NORMAL', ordinalPosition=20, columnDefault='null', isNullable='NO', dataType='bigint', characterMaximumLength=0, characterOctetLength=0, numericPrecision=20, numericScale=0, datetimePrecision=0, characterSetName='null', collationName='null', columnType='bigint(20) unsigned', columnKey='', extra='', privileges='select,insert,update,references', columnComment='', generationExpression=''}*/
private Long sumTimerReadNormal;

/**Column{tableCatalog='def', tableSchema='performance_schema', tableName='table_lock_waits_summary_by_table', columnName='MIN_TIMER_READ_NORMAL', ordinalPosition=21, columnDefault='null', isNullable='NO', dataType='bigint', characterMaximumLength=0, characterOctetLength=0, numericPrecision=20, numericScale=0, datetimePrecision=0, characterSetName='null', collationName='null', columnType='bigint(20) unsigned', columnKey='', extra='', privileges='select,insert,update,references', columnComment='', generationExpression=''}*/
private Long minTimerReadNormal;

/**Column{tableCatalog='def', tableSchema='performance_schema', tableName='table_lock_waits_summary_by_table', columnName='AVG_TIMER_READ_NORMAL', ordinalPosition=22, columnDefault='null', isNullable='NO', dataType='bigint', characterMaximumLength=0, characterOctetLength=0, numericPrecision=20, numericScale=0, datetimePrecision=0, characterSetName='null', collationName='null', columnType='bigint(20) unsigned', columnKey='', extra='', privileges='select,insert,update,references', columnComment='', generationExpression=''}*/
private Long avgTimerReadNormal;

/**Column{tableCatalog='def', tableSchema='performance_schema', tableName='table_lock_waits_summary_by_table', columnName='MAX_TIMER_READ_NORMAL', ordinalPosition=23, columnDefault='null', isNullable='NO', dataType='bigint', characterMaximumLength=0, characterOctetLength=0, numericPrecision=20, numericScale=0, datetimePrecision=0, characterSetName='null', collationName='null', columnType='bigint(20) unsigned', columnKey='', extra='', privileges='select,insert,update,references', columnComment='', generationExpression=''}*/
private Long maxTimerReadNormal;

/**Column{tableCatalog='def', tableSchema='performance_schema', tableName='table_lock_waits_summary_by_table', columnName='COUNT_READ_WITH_SHARED_LOCKS', ordinalPosition=24, columnDefault='null', isNullable='NO', dataType='bigint', characterMaximumLength=0, characterOctetLength=0, numericPrecision=20, numericScale=0, datetimePrecision=0, characterSetName='null', collationName='null', columnType='bigint(20) unsigned', columnKey='', extra='', privileges='select,insert,update,references', columnComment='', generationExpression=''}*/
private Long countReadWithSharedLocks;

/**Column{tableCatalog='def', tableSchema='performance_schema', tableName='table_lock_waits_summary_by_table', columnName='SUM_TIMER_READ_WITH_SHARED_LOCKS', ordinalPosition=25, columnDefault='null', isNullable='NO', dataType='bigint', characterMaximumLength=0, characterOctetLength=0, numericPrecision=20, numericScale=0, datetimePrecision=0, characterSetName='null', collationName='null', columnType='bigint(20) unsigned', columnKey='', extra='', privileges='select,insert,update,references', columnComment='', generationExpression=''}*/
private Long sumTimerReadWithSharedLocks;

/**Column{tableCatalog='def', tableSchema='performance_schema', tableName='table_lock_waits_summary_by_table', columnName='MIN_TIMER_READ_WITH_SHARED_LOCKS', ordinalPosition=26, columnDefault='null', isNullable='NO', dataType='bigint', characterMaximumLength=0, characterOctetLength=0, numericPrecision=20, numericScale=0, datetimePrecision=0, characterSetName='null', collationName='null', columnType='bigint(20) unsigned', columnKey='', extra='', privileges='select,insert,update,references', columnComment='', generationExpression=''}*/
private Long minTimerReadWithSharedLocks;

/**Column{tableCatalog='def', tableSchema='performance_schema', tableName='table_lock_waits_summary_by_table', columnName='AVG_TIMER_READ_WITH_SHARED_LOCKS', ordinalPosition=27, columnDefault='null', isNullable='NO', dataType='bigint', characterMaximumLength=0, characterOctetLength=0, numericPrecision=20, numericScale=0, datetimePrecision=0, characterSetName='null', collationName='null', columnType='bigint(20) unsigned', columnKey='', extra='', privileges='select,insert,update,references', columnComment='', generationExpression=''}*/
private Long avgTimerReadWithSharedLocks;

/**Column{tableCatalog='def', tableSchema='performance_schema', tableName='table_lock_waits_summary_by_table', columnName='MAX_TIMER_READ_WITH_SHARED_LOCKS', ordinalPosition=28, columnDefault='null', isNullable='NO', dataType='bigint', characterMaximumLength=0, characterOctetLength=0, numericPrecision=20, numericScale=0, datetimePrecision=0, characterSetName='null', collationName='null', columnType='bigint(20) unsigned', columnKey='', extra='', privileges='select,insert,update,references', columnComment='', generationExpression=''}*/
private Long maxTimerReadWithSharedLocks;

/**Column{tableCatalog='def', tableSchema='performance_schema', tableName='table_lock_waits_summary_by_table', columnName='COUNT_READ_HIGH_PRIORITY', ordinalPosition=29, columnDefault='null', isNullable='NO', dataType='bigint', characterMaximumLength=0, characterOctetLength=0, numericPrecision=20, numericScale=0, datetimePrecision=0, characterSetName='null', collationName='null', columnType='bigint(20) unsigned', columnKey='', extra='', privileges='select,insert,update,references', columnComment='', generationExpression=''}*/
private Long countReadHighPriority;

/**Column{tableCatalog='def', tableSchema='performance_schema', tableName='table_lock_waits_summary_by_table', columnName='SUM_TIMER_READ_HIGH_PRIORITY', ordinalPosition=30, columnDefault='null', isNullable='NO', dataType='bigint', characterMaximumLength=0, characterOctetLength=0, numericPrecision=20, numericScale=0, datetimePrecision=0, characterSetName='null', collationName='null', columnType='bigint(20) unsigned', columnKey='', extra='', privileges='select,insert,update,references', columnComment='', generationExpression=''}*/
private Long sumTimerReadHighPriority;

/**Column{tableCatalog='def', tableSchema='performance_schema', tableName='table_lock_waits_summary_by_table', columnName='MIN_TIMER_READ_HIGH_PRIORITY', ordinalPosition=31, columnDefault='null', isNullable='NO', dataType='bigint', characterMaximumLength=0, characterOctetLength=0, numericPrecision=20, numericScale=0, datetimePrecision=0, characterSetName='null', collationName='null', columnType='bigint(20) unsigned', columnKey='', extra='', privileges='select,insert,update,references', columnComment='', generationExpression=''}*/
private Long minTimerReadHighPriority;

/**Column{tableCatalog='def', tableSchema='performance_schema', tableName='table_lock_waits_summary_by_table', columnName='AVG_TIMER_READ_HIGH_PRIORITY', ordinalPosition=32, columnDefault='null', isNullable='NO', dataType='bigint', characterMaximumLength=0, characterOctetLength=0, numericPrecision=20, numericScale=0, datetimePrecision=0, characterSetName='null', collationName='null', columnType='bigint(20) unsigned', columnKey='', extra='', privileges='select,insert,update,references', columnComment='', generationExpression=''}*/
private Long avgTimerReadHighPriority;

/**Column{tableCatalog='def', tableSchema='performance_schema', tableName='table_lock_waits_summary_by_table', columnName='MAX_TIMER_READ_HIGH_PRIORITY', ordinalPosition=33, columnDefault='null', isNullable='NO', dataType='bigint', characterMaximumLength=0, characterOctetLength=0, numericPrecision=20, numericScale=0, datetimePrecision=0, characterSetName='null', collationName='null', columnType='bigint(20) unsigned', columnKey='', extra='', privileges='select,insert,update,references', columnComment='', generationExpression=''}*/
private Long maxTimerReadHighPriority;

/**Column{tableCatalog='def', tableSchema='performance_schema', tableName='table_lock_waits_summary_by_table', columnName='COUNT_READ_NO_INSERT', ordinalPosition=34, columnDefault='null', isNullable='NO', dataType='bigint', characterMaximumLength=0, characterOctetLength=0, numericPrecision=20, numericScale=0, datetimePrecision=0, characterSetName='null', collationName='null', columnType='bigint(20) unsigned', columnKey='', extra='', privileges='select,insert,update,references', columnComment='', generationExpression=''}*/
private Long countReadNoInsert;

/**Column{tableCatalog='def', tableSchema='performance_schema', tableName='table_lock_waits_summary_by_table', columnName='SUM_TIMER_READ_NO_INSERT', ordinalPosition=35, columnDefault='null', isNullable='NO', dataType='bigint', characterMaximumLength=0, characterOctetLength=0, numericPrecision=20, numericScale=0, datetimePrecision=0, characterSetName='null', collationName='null', columnType='bigint(20) unsigned', columnKey='', extra='', privileges='select,insert,update,references', columnComment='', generationExpression=''}*/
private Long sumTimerReadNoInsert;

/**Column{tableCatalog='def', tableSchema='performance_schema', tableName='table_lock_waits_summary_by_table', columnName='MIN_TIMER_READ_NO_INSERT', ordinalPosition=36, columnDefault='null', isNullable='NO', dataType='bigint', characterMaximumLength=0, characterOctetLength=0, numericPrecision=20, numericScale=0, datetimePrecision=0, characterSetName='null', collationName='null', columnType='bigint(20) unsigned', columnKey='', extra='', privileges='select,insert,update,references', columnComment='', generationExpression=''}*/
private Long minTimerReadNoInsert;

/**Column{tableCatalog='def', tableSchema='performance_schema', tableName='table_lock_waits_summary_by_table', columnName='AVG_TIMER_READ_NO_INSERT', ordinalPosition=37, columnDefault='null', isNullable='NO', dataType='bigint', characterMaximumLength=0, characterOctetLength=0, numericPrecision=20, numericScale=0, datetimePrecision=0, characterSetName='null', collationName='null', columnType='bigint(20) unsigned', columnKey='', extra='', privileges='select,insert,update,references', columnComment='', generationExpression=''}*/
private Long avgTimerReadNoInsert;

/**Column{tableCatalog='def', tableSchema='performance_schema', tableName='table_lock_waits_summary_by_table', columnName='MAX_TIMER_READ_NO_INSERT', ordinalPosition=38, columnDefault='null', isNullable='NO', dataType='bigint', characterMaximumLength=0, characterOctetLength=0, numericPrecision=20, numericScale=0, datetimePrecision=0, characterSetName='null', collationName='null', columnType='bigint(20) unsigned', columnKey='', extra='', privileges='select,insert,update,references', columnComment='', generationExpression=''}*/
private Long maxTimerReadNoInsert;

/**Column{tableCatalog='def', tableSchema='performance_schema', tableName='table_lock_waits_summary_by_table', columnName='COUNT_READ_EXTERNAL', ordinalPosition=39, columnDefault='null', isNullable='NO', dataType='bigint', characterMaximumLength=0, characterOctetLength=0, numericPrecision=20, numericScale=0, datetimePrecision=0, characterSetName='null', collationName='null', columnType='bigint(20) unsigned', columnKey='', extra='', privileges='select,insert,update,references', columnComment='', generationExpression=''}*/
private Long countReadExternal;

/**Column{tableCatalog='def', tableSchema='performance_schema', tableName='table_lock_waits_summary_by_table', columnName='SUM_TIMER_READ_EXTERNAL', ordinalPosition=40, columnDefault='null', isNullable='NO', dataType='bigint', characterMaximumLength=0, characterOctetLength=0, numericPrecision=20, numericScale=0, datetimePrecision=0, characterSetName='null', collationName='null', columnType='bigint(20) unsigned', columnKey='', extra='', privileges='select,insert,update,references', columnComment='', generationExpression=''}*/
private Long sumTimerReadExternal;

/**Column{tableCatalog='def', tableSchema='performance_schema', tableName='table_lock_waits_summary_by_table', columnName='MIN_TIMER_READ_EXTERNAL', ordinalPosition=41, columnDefault='null', isNullable='NO', dataType='bigint', characterMaximumLength=0, characterOctetLength=0, numericPrecision=20, numericScale=0, datetimePrecision=0, characterSetName='null', collationName='null', columnType='bigint(20) unsigned', columnKey='', extra='', privileges='select,insert,update,references', columnComment='', generationExpression=''}*/
private Long minTimerReadExternal;

/**Column{tableCatalog='def', tableSchema='performance_schema', tableName='table_lock_waits_summary_by_table', columnName='AVG_TIMER_READ_EXTERNAL', ordinalPosition=42, columnDefault='null', isNullable='NO', dataType='bigint', characterMaximumLength=0, characterOctetLength=0, numericPrecision=20, numericScale=0, datetimePrecision=0, characterSetName='null', collationName='null', columnType='bigint(20) unsigned', columnKey='', extra='', privileges='select,insert,update,references', columnComment='', generationExpression=''}*/
private Long avgTimerReadExternal;

/**Column{tableCatalog='def', tableSchema='performance_schema', tableName='table_lock_waits_summary_by_table', columnName='MAX_TIMER_READ_EXTERNAL', ordinalPosition=43, columnDefault='null', isNullable='NO', dataType='bigint', characterMaximumLength=0, characterOctetLength=0, numericPrecision=20, numericScale=0, datetimePrecision=0, characterSetName='null', collationName='null', columnType='bigint(20) unsigned', columnKey='', extra='', privileges='select,insert,update,references', columnComment='', generationExpression=''}*/
private Long maxTimerReadExternal;

/**Column{tableCatalog='def', tableSchema='performance_schema', tableName='table_lock_waits_summary_by_table', columnName='COUNT_WRITE_ALLOW_WRITE', ordinalPosition=44, columnDefault='null', isNullable='NO', dataType='bigint', characterMaximumLength=0, characterOctetLength=0, numericPrecision=20, numericScale=0, datetimePrecision=0, characterSetName='null', collationName='null', columnType='bigint(20) unsigned', columnKey='', extra='', privileges='select,insert,update,references', columnComment='', generationExpression=''}*/
private Long countWriteAllowWrite;

/**Column{tableCatalog='def', tableSchema='performance_schema', tableName='table_lock_waits_summary_by_table', columnName='SUM_TIMER_WRITE_ALLOW_WRITE', ordinalPosition=45, columnDefault='null', isNullable='NO', dataType='bigint', characterMaximumLength=0, characterOctetLength=0, numericPrecision=20, numericScale=0, datetimePrecision=0, characterSetName='null', collationName='null', columnType='bigint(20) unsigned', columnKey='', extra='', privileges='select,insert,update,references', columnComment='', generationExpression=''}*/
private Long sumTimerWriteAllowWrite;

/**Column{tableCatalog='def', tableSchema='performance_schema', tableName='table_lock_waits_summary_by_table', columnName='MIN_TIMER_WRITE_ALLOW_WRITE', ordinalPosition=46, columnDefault='null', isNullable='NO', dataType='bigint', characterMaximumLength=0, characterOctetLength=0, numericPrecision=20, numericScale=0, datetimePrecision=0, characterSetName='null', collationName='null', columnType='bigint(20) unsigned', columnKey='', extra='', privileges='select,insert,update,references', columnComment='', generationExpression=''}*/
private Long minTimerWriteAllowWrite;

/**Column{tableCatalog='def', tableSchema='performance_schema', tableName='table_lock_waits_summary_by_table', columnName='AVG_TIMER_WRITE_ALLOW_WRITE', ordinalPosition=47, columnDefault='null', isNullable='NO', dataType='bigint', characterMaximumLength=0, characterOctetLength=0, numericPrecision=20, numericScale=0, datetimePrecision=0, characterSetName='null', collationName='null', columnType='bigint(20) unsigned', columnKey='', extra='', privileges='select,insert,update,references', columnComment='', generationExpression=''}*/
private Long avgTimerWriteAllowWrite;

/**Column{tableCatalog='def', tableSchema='performance_schema', tableName='table_lock_waits_summary_by_table', columnName='MAX_TIMER_WRITE_ALLOW_WRITE', ordinalPosition=48, columnDefault='null', isNullable='NO', dataType='bigint', characterMaximumLength=0, characterOctetLength=0, numericPrecision=20, numericScale=0, datetimePrecision=0, characterSetName='null', collationName='null', columnType='bigint(20) unsigned', columnKey='', extra='', privileges='select,insert,update,references', columnComment='', generationExpression=''}*/
private Long maxTimerWriteAllowWrite;

/**Column{tableCatalog='def', tableSchema='performance_schema', tableName='table_lock_waits_summary_by_table', columnName='COUNT_WRITE_CONCURRENT_INSERT', ordinalPosition=49, columnDefault='null', isNullable='NO', dataType='bigint', characterMaximumLength=0, characterOctetLength=0, numericPrecision=20, numericScale=0, datetimePrecision=0, characterSetName='null', collationName='null', columnType='bigint(20) unsigned', columnKey='', extra='', privileges='select,insert,update,references', columnComment='', generationExpression=''}*/
private Long countWriteConcurrentInsert;

/**Column{tableCatalog='def', tableSchema='performance_schema', tableName='table_lock_waits_summary_by_table', columnName='SUM_TIMER_WRITE_CONCURRENT_INSERT', ordinalPosition=50, columnDefault='null', isNullable='NO', dataType='bigint', characterMaximumLength=0, characterOctetLength=0, numericPrecision=20, numericScale=0, datetimePrecision=0, characterSetName='null', collationName='null', columnType='bigint(20) unsigned', columnKey='', extra='', privileges='select,insert,update,references', columnComment='', generationExpression=''}*/
private Long sumTimerWriteConcurrentInsert;

/**Column{tableCatalog='def', tableSchema='performance_schema', tableName='table_lock_waits_summary_by_table', columnName='MIN_TIMER_WRITE_CONCURRENT_INSERT', ordinalPosition=51, columnDefault='null', isNullable='NO', dataType='bigint', characterMaximumLength=0, characterOctetLength=0, numericPrecision=20, numericScale=0, datetimePrecision=0, characterSetName='null', collationName='null', columnType='bigint(20) unsigned', columnKey='', extra='', privileges='select,insert,update,references', columnComment='', generationExpression=''}*/
private Long minTimerWriteConcurrentInsert;

/**Column{tableCatalog='def', tableSchema='performance_schema', tableName='table_lock_waits_summary_by_table', columnName='AVG_TIMER_WRITE_CONCURRENT_INSERT', ordinalPosition=52, columnDefault='null', isNullable='NO', dataType='bigint', characterMaximumLength=0, characterOctetLength=0, numericPrecision=20, numericScale=0, datetimePrecision=0, characterSetName='null', collationName='null', columnType='bigint(20) unsigned', columnKey='', extra='', privileges='select,insert,update,references', columnComment='', generationExpression=''}*/
private Long avgTimerWriteConcurrentInsert;

/**Column{tableCatalog='def', tableSchema='performance_schema', tableName='table_lock_waits_summary_by_table', columnName='MAX_TIMER_WRITE_CONCURRENT_INSERT', ordinalPosition=53, columnDefault='null', isNullable='NO', dataType='bigint', characterMaximumLength=0, characterOctetLength=0, numericPrecision=20, numericScale=0, datetimePrecision=0, characterSetName='null', collationName='null', columnType='bigint(20) unsigned', columnKey='', extra='', privileges='select,insert,update,references', columnComment='', generationExpression=''}*/
private Long maxTimerWriteConcurrentInsert;

/**Column{tableCatalog='def', tableSchema='performance_schema', tableName='table_lock_waits_summary_by_table', columnName='COUNT_WRITE_LOW_PRIORITY', ordinalPosition=54, columnDefault='null', isNullable='NO', dataType='bigint', characterMaximumLength=0, characterOctetLength=0, numericPrecision=20, numericScale=0, datetimePrecision=0, characterSetName='null', collationName='null', columnType='bigint(20) unsigned', columnKey='', extra='', privileges='select,insert,update,references', columnComment='', generationExpression=''}*/
private Long countWriteLowPriority;

/**Column{tableCatalog='def', tableSchema='performance_schema', tableName='table_lock_waits_summary_by_table', columnName='SUM_TIMER_WRITE_LOW_PRIORITY', ordinalPosition=55, columnDefault='null', isNullable='NO', dataType='bigint', characterMaximumLength=0, characterOctetLength=0, numericPrecision=20, numericScale=0, datetimePrecision=0, characterSetName='null', collationName='null', columnType='bigint(20) unsigned', columnKey='', extra='', privileges='select,insert,update,references', columnComment='', generationExpression=''}*/
private Long sumTimerWriteLowPriority;

/**Column{tableCatalog='def', tableSchema='performance_schema', tableName='table_lock_waits_summary_by_table', columnName='MIN_TIMER_WRITE_LOW_PRIORITY', ordinalPosition=56, columnDefault='null', isNullable='NO', dataType='bigint', characterMaximumLength=0, characterOctetLength=0, numericPrecision=20, numericScale=0, datetimePrecision=0, characterSetName='null', collationName='null', columnType='bigint(20) unsigned', columnKey='', extra='', privileges='select,insert,update,references', columnComment='', generationExpression=''}*/
private Long minTimerWriteLowPriority;

/**Column{tableCatalog='def', tableSchema='performance_schema', tableName='table_lock_waits_summary_by_table', columnName='AVG_TIMER_WRITE_LOW_PRIORITY', ordinalPosition=57, columnDefault='null', isNullable='NO', dataType='bigint', characterMaximumLength=0, characterOctetLength=0, numericPrecision=20, numericScale=0, datetimePrecision=0, characterSetName='null', collationName='null', columnType='bigint(20) unsigned', columnKey='', extra='', privileges='select,insert,update,references', columnComment='', generationExpression=''}*/
private Long avgTimerWriteLowPriority;

/**Column{tableCatalog='def', tableSchema='performance_schema', tableName='table_lock_waits_summary_by_table', columnName='MAX_TIMER_WRITE_LOW_PRIORITY', ordinalPosition=58, columnDefault='null', isNullable='NO', dataType='bigint', characterMaximumLength=0, characterOctetLength=0, numericPrecision=20, numericScale=0, datetimePrecision=0, characterSetName='null', collationName='null', columnType='bigint(20) unsigned', columnKey='', extra='', privileges='select,insert,update,references', columnComment='', generationExpression=''}*/
private Long maxTimerWriteLowPriority;

/**Column{tableCatalog='def', tableSchema='performance_schema', tableName='table_lock_waits_summary_by_table', columnName='COUNT_WRITE_NORMAL', ordinalPosition=59, columnDefault='null', isNullable='NO', dataType='bigint', characterMaximumLength=0, characterOctetLength=0, numericPrecision=20, numericScale=0, datetimePrecision=0, characterSetName='null', collationName='null', columnType='bigint(20) unsigned', columnKey='', extra='', privileges='select,insert,update,references', columnComment='', generationExpression=''}*/
private Long countWriteNormal;

/**Column{tableCatalog='def', tableSchema='performance_schema', tableName='table_lock_waits_summary_by_table', columnName='SUM_TIMER_WRITE_NORMAL', ordinalPosition=60, columnDefault='null', isNullable='NO', dataType='bigint', characterMaximumLength=0, characterOctetLength=0, numericPrecision=20, numericScale=0, datetimePrecision=0, characterSetName='null', collationName='null', columnType='bigint(20) unsigned', columnKey='', extra='', privileges='select,insert,update,references', columnComment='', generationExpression=''}*/
private Long sumTimerWriteNormal;

/**Column{tableCatalog='def', tableSchema='performance_schema', tableName='table_lock_waits_summary_by_table', columnName='MIN_TIMER_WRITE_NORMAL', ordinalPosition=61, columnDefault='null', isNullable='NO', dataType='bigint', characterMaximumLength=0, characterOctetLength=0, numericPrecision=20, numericScale=0, datetimePrecision=0, characterSetName='null', collationName='null', columnType='bigint(20) unsigned', columnKey='', extra='', privileges='select,insert,update,references', columnComment='', generationExpression=''}*/
private Long minTimerWriteNormal;

/**Column{tableCatalog='def', tableSchema='performance_schema', tableName='table_lock_waits_summary_by_table', columnName='AVG_TIMER_WRITE_NORMAL', ordinalPosition=62, columnDefault='null', isNullable='NO', dataType='bigint', characterMaximumLength=0, characterOctetLength=0, numericPrecision=20, numericScale=0, datetimePrecision=0, characterSetName='null', collationName='null', columnType='bigint(20) unsigned', columnKey='', extra='', privileges='select,insert,update,references', columnComment='', generationExpression=''}*/
private Long avgTimerWriteNormal;

/**Column{tableCatalog='def', tableSchema='performance_schema', tableName='table_lock_waits_summary_by_table', columnName='MAX_TIMER_WRITE_NORMAL', ordinalPosition=63, columnDefault='null', isNullable='NO', dataType='bigint', characterMaximumLength=0, characterOctetLength=0, numericPrecision=20, numericScale=0, datetimePrecision=0, characterSetName='null', collationName='null', columnType='bigint(20) unsigned', columnKey='', extra='', privileges='select,insert,update,references', columnComment='', generationExpression=''}*/
private Long maxTimerWriteNormal;

/**Column{tableCatalog='def', tableSchema='performance_schema', tableName='table_lock_waits_summary_by_table', columnName='COUNT_WRITE_EXTERNAL', ordinalPosition=64, columnDefault='null', isNullable='NO', dataType='bigint', characterMaximumLength=0, characterOctetLength=0, numericPrecision=20, numericScale=0, datetimePrecision=0, characterSetName='null', collationName='null', columnType='bigint(20) unsigned', columnKey='', extra='', privileges='select,insert,update,references', columnComment='', generationExpression=''}*/
private Long countWriteExternal;

/**Column{tableCatalog='def', tableSchema='performance_schema', tableName='table_lock_waits_summary_by_table', columnName='SUM_TIMER_WRITE_EXTERNAL', ordinalPosition=65, columnDefault='null', isNullable='NO', dataType='bigint', characterMaximumLength=0, characterOctetLength=0, numericPrecision=20, numericScale=0, datetimePrecision=0, characterSetName='null', collationName='null', columnType='bigint(20) unsigned', columnKey='', extra='', privileges='select,insert,update,references', columnComment='', generationExpression=''}*/
private Long sumTimerWriteExternal;

/**Column{tableCatalog='def', tableSchema='performance_schema', tableName='table_lock_waits_summary_by_table', columnName='MIN_TIMER_WRITE_EXTERNAL', ordinalPosition=66, columnDefault='null', isNullable='NO', dataType='bigint', characterMaximumLength=0, characterOctetLength=0, numericPrecision=20, numericScale=0, datetimePrecision=0, characterSetName='null', collationName='null', columnType='bigint(20) unsigned', columnKey='', extra='', privileges='select,insert,update,references', columnComment='', generationExpression=''}*/
private Long minTimerWriteExternal;

/**Column{tableCatalog='def', tableSchema='performance_schema', tableName='table_lock_waits_summary_by_table', columnName='AVG_TIMER_WRITE_EXTERNAL', ordinalPosition=67, columnDefault='null', isNullable='NO', dataType='bigint', characterMaximumLength=0, characterOctetLength=0, numericPrecision=20, numericScale=0, datetimePrecision=0, characterSetName='null', collationName='null', columnType='bigint(20) unsigned', columnKey='', extra='', privileges='select,insert,update,references', columnComment='', generationExpression=''}*/
private Long avgTimerWriteExternal;

/**Column{tableCatalog='def', tableSchema='performance_schema', tableName='table_lock_waits_summary_by_table', columnName='MAX_TIMER_WRITE_EXTERNAL', ordinalPosition=68, columnDefault='null', isNullable='NO', dataType='bigint', characterMaximumLength=0, characterOctetLength=0, numericPrecision=20, numericScale=0, datetimePrecision=0, characterSetName='null', collationName='null', columnType='bigint(20) unsigned', columnKey='', extra='', privileges='select,insert,update,references', columnComment='', generationExpression=''}*/
private Long maxTimerWriteExternal;

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

public Long getCountReadNormal(){
return countReadNormal;
}

public Long getSumTimerReadNormal(){
return sumTimerReadNormal;
}

public Long getMinTimerReadNormal(){
return minTimerReadNormal;
}

public Long getAvgTimerReadNormal(){
return avgTimerReadNormal;
}

public Long getMaxTimerReadNormal(){
return maxTimerReadNormal;
}

public Long getCountReadWithSharedLocks(){
return countReadWithSharedLocks;
}

public Long getSumTimerReadWithSharedLocks(){
return sumTimerReadWithSharedLocks;
}

public Long getMinTimerReadWithSharedLocks(){
return minTimerReadWithSharedLocks;
}

public Long getAvgTimerReadWithSharedLocks(){
return avgTimerReadWithSharedLocks;
}

public Long getMaxTimerReadWithSharedLocks(){
return maxTimerReadWithSharedLocks;
}

public Long getCountReadHighPriority(){
return countReadHighPriority;
}

public Long getSumTimerReadHighPriority(){
return sumTimerReadHighPriority;
}

public Long getMinTimerReadHighPriority(){
return minTimerReadHighPriority;
}

public Long getAvgTimerReadHighPriority(){
return avgTimerReadHighPriority;
}

public Long getMaxTimerReadHighPriority(){
return maxTimerReadHighPriority;
}

public Long getCountReadNoInsert(){
return countReadNoInsert;
}

public Long getSumTimerReadNoInsert(){
return sumTimerReadNoInsert;
}

public Long getMinTimerReadNoInsert(){
return minTimerReadNoInsert;
}

public Long getAvgTimerReadNoInsert(){
return avgTimerReadNoInsert;
}

public Long getMaxTimerReadNoInsert(){
return maxTimerReadNoInsert;
}

public Long getCountReadExternal(){
return countReadExternal;
}

public Long getSumTimerReadExternal(){
return sumTimerReadExternal;
}

public Long getMinTimerReadExternal(){
return minTimerReadExternal;
}

public Long getAvgTimerReadExternal(){
return avgTimerReadExternal;
}

public Long getMaxTimerReadExternal(){
return maxTimerReadExternal;
}

public Long getCountWriteAllowWrite(){
return countWriteAllowWrite;
}

public Long getSumTimerWriteAllowWrite(){
return sumTimerWriteAllowWrite;
}

public Long getMinTimerWriteAllowWrite(){
return minTimerWriteAllowWrite;
}

public Long getAvgTimerWriteAllowWrite(){
return avgTimerWriteAllowWrite;
}

public Long getMaxTimerWriteAllowWrite(){
return maxTimerWriteAllowWrite;
}

public Long getCountWriteConcurrentInsert(){
return countWriteConcurrentInsert;
}

public Long getSumTimerWriteConcurrentInsert(){
return sumTimerWriteConcurrentInsert;
}

public Long getMinTimerWriteConcurrentInsert(){
return minTimerWriteConcurrentInsert;
}

public Long getAvgTimerWriteConcurrentInsert(){
return avgTimerWriteConcurrentInsert;
}

public Long getMaxTimerWriteConcurrentInsert(){
return maxTimerWriteConcurrentInsert;
}

public Long getCountWriteLowPriority(){
return countWriteLowPriority;
}

public Long getSumTimerWriteLowPriority(){
return sumTimerWriteLowPriority;
}

public Long getMinTimerWriteLowPriority(){
return minTimerWriteLowPriority;
}

public Long getAvgTimerWriteLowPriority(){
return avgTimerWriteLowPriority;
}

public Long getMaxTimerWriteLowPriority(){
return maxTimerWriteLowPriority;
}

public Long getCountWriteNormal(){
return countWriteNormal;
}

public Long getSumTimerWriteNormal(){
return sumTimerWriteNormal;
}

public Long getMinTimerWriteNormal(){
return minTimerWriteNormal;
}

public Long getAvgTimerWriteNormal(){
return avgTimerWriteNormal;
}

public Long getMaxTimerWriteNormal(){
return maxTimerWriteNormal;
}

public Long getCountWriteExternal(){
return countWriteExternal;
}

public Long getSumTimerWriteExternal(){
return sumTimerWriteExternal;
}

public Long getMinTimerWriteExternal(){
return minTimerWriteExternal;
}

public Long getAvgTimerWriteExternal(){
return avgTimerWriteExternal;
}

public Long getMaxTimerWriteExternal(){
return maxTimerWriteExternal;
}

}