package db.bean.sys;


/* SELECT object_schema AS objectSchema, object_name AS objectName, waiting_thread_id AS waitingThreadId, waiting_pid AS waitingPid, waiting_account AS waitingAccount, waiting_lock_type AS waitingLockType, waiting_lock_duration AS waitingLockDuration, waiting_query AS waitingQuery, waiting_query_secs AS waitingQuerySecs, waiting_query_rows_affected AS waitingQueryRowsAffected, waiting_query_rows_examined AS waitingQueryRowsExamined, blocking_thread_id AS blockingThreadId, blocking_pid AS blockingPid, blocking_account AS blockingAccount, blocking_lock_type AS blockingLockType, blocking_lock_duration AS blockingLockDuration, sql_kill_blocking_query AS sqlKillBlockingQuery, sql_kill_blocking_connection AS sqlKillBlockingConnection FROM sys.x$schema_table_lock_waits */
/**VIEW
*/
public class X$schemaTableLockWaits{
/**Column{tableCatalog='def', tableSchema='sys', tableName='x$schema_table_lock_waits', columnName='object_schema', ordinalPosition=1, columnDefault='null', isNullable='YES', dataType='varchar', characterMaximumLength=64, characterOctetLength=192, numericPrecision=0, numericScale=0, datetimePrecision=0, characterSetName='utf8', collationName='utf8_general_ci', columnType='varchar(64)', columnKey='', extra='', privileges='select,insert,update,references', columnComment='', generationExpression=''}*/
private String objectSchema;

/**Column{tableCatalog='def', tableSchema='sys', tableName='x$schema_table_lock_waits', columnName='object_name', ordinalPosition=2, columnDefault='null', isNullable='YES', dataType='varchar', characterMaximumLength=64, characterOctetLength=192, numericPrecision=0, numericScale=0, datetimePrecision=0, characterSetName='utf8', collationName='utf8_general_ci', columnType='varchar(64)', columnKey='', extra='', privileges='select,insert,update,references', columnComment='', generationExpression=''}*/
private String objectName;

/**Column{tableCatalog='def', tableSchema='sys', tableName='x$schema_table_lock_waits', columnName='waiting_thread_id', ordinalPosition=3, columnDefault='null', isNullable='NO', dataType='bigint', characterMaximumLength=0, characterOctetLength=0, numericPrecision=20, numericScale=0, datetimePrecision=0, characterSetName='null', collationName='null', columnType='bigint(20) unsigned', columnKey='', extra='', privileges='select,insert,update,references', columnComment='', generationExpression=''}*/
private Long waitingThreadId;

/**Column{tableCatalog='def', tableSchema='sys', tableName='x$schema_table_lock_waits', columnName='waiting_pid', ordinalPosition=4, columnDefault='null', isNullable='YES', dataType='bigint', characterMaximumLength=0, characterOctetLength=0, numericPrecision=20, numericScale=0, datetimePrecision=0, characterSetName='null', collationName='null', columnType='bigint(20) unsigned', columnKey='', extra='', privileges='select,insert,update,references', columnComment='', generationExpression=''}*/
private Long waitingPid;

/**Column{tableCatalog='def', tableSchema='sys', tableName='x$schema_table_lock_waits', columnName='waiting_account', ordinalPosition=5, columnDefault='null', isNullable='YES', dataType='text', characterMaximumLength=65535, characterOctetLength=65535, numericPrecision=0, numericScale=0, datetimePrecision=0, characterSetName='utf8', collationName='utf8_general_ci', columnType='text', columnKey='', extra='', privileges='select,insert,update,references', columnComment='', generationExpression=''}*/
private String waitingAccount;

/**Column{tableCatalog='def', tableSchema='sys', tableName='x$schema_table_lock_waits', columnName='waiting_lock_type', ordinalPosition=6, columnDefault='null', isNullable='NO', dataType='varchar', characterMaximumLength=32, characterOctetLength=96, numericPrecision=0, numericScale=0, datetimePrecision=0, characterSetName='utf8', collationName='utf8_general_ci', columnType='varchar(32)', columnKey='', extra='', privileges='select,insert,update,references', columnComment='', generationExpression=''}*/
private String waitingLockType;

/**Column{tableCatalog='def', tableSchema='sys', tableName='x$schema_table_lock_waits', columnName='waiting_lock_duration', ordinalPosition=7, columnDefault='null', isNullable='NO', dataType='varchar', characterMaximumLength=32, characterOctetLength=96, numericPrecision=0, numericScale=0, datetimePrecision=0, characterSetName='utf8', collationName='utf8_general_ci', columnType='varchar(32)', columnKey='', extra='', privileges='select,insert,update,references', columnComment='', generationExpression=''}*/
private String waitingLockDuration;

/**Column{tableCatalog='def', tableSchema='sys', tableName='x$schema_table_lock_waits', columnName='waiting_query', ordinalPosition=8, columnDefault='null', isNullable='YES', dataType='longtext', characterMaximumLength=4294967295, characterOctetLength=4294967295, numericPrecision=0, numericScale=0, datetimePrecision=0, characterSetName='utf8', collationName='utf8_general_ci', columnType='longtext', columnKey='', extra='', privileges='select,insert,update,references', columnComment='', generationExpression=''}*/
private String waitingQuery;

/**Column{tableCatalog='def', tableSchema='sys', tableName='x$schema_table_lock_waits', columnName='waiting_query_secs', ordinalPosition=9, columnDefault='null', isNullable='YES', dataType='bigint', characterMaximumLength=0, characterOctetLength=0, numericPrecision=19, numericScale=0, datetimePrecision=0, characterSetName='null', collationName='null', columnType='bigint(20)', columnKey='', extra='', privileges='select,insert,update,references', columnComment='', generationExpression=''}*/
private Long waitingQuerySecs;

/**Column{tableCatalog='def', tableSchema='sys', tableName='x$schema_table_lock_waits', columnName='waiting_query_rows_affected', ordinalPosition=10, columnDefault='null', isNullable='YES', dataType='bigint', characterMaximumLength=0, characterOctetLength=0, numericPrecision=20, numericScale=0, datetimePrecision=0, characterSetName='null', collationName='null', columnType='bigint(20) unsigned', columnKey='', extra='', privileges='select,insert,update,references', columnComment='', generationExpression=''}*/
private Long waitingQueryRowsAffected;

/**Column{tableCatalog='def', tableSchema='sys', tableName='x$schema_table_lock_waits', columnName='waiting_query_rows_examined', ordinalPosition=11, columnDefault='null', isNullable='YES', dataType='bigint', characterMaximumLength=0, characterOctetLength=0, numericPrecision=20, numericScale=0, datetimePrecision=0, characterSetName='null', collationName='null', columnType='bigint(20) unsigned', columnKey='', extra='', privileges='select,insert,update,references', columnComment='', generationExpression=''}*/
private Long waitingQueryRowsExamined;

/**Column{tableCatalog='def', tableSchema='sys', tableName='x$schema_table_lock_waits', columnName='blocking_thread_id', ordinalPosition=12, columnDefault='null', isNullable='NO', dataType='bigint', characterMaximumLength=0, characterOctetLength=0, numericPrecision=20, numericScale=0, datetimePrecision=0, characterSetName='null', collationName='null', columnType='bigint(20) unsigned', columnKey='', extra='', privileges='select,insert,update,references', columnComment='', generationExpression=''}*/
private Long blockingThreadId;

/**Column{tableCatalog='def', tableSchema='sys', tableName='x$schema_table_lock_waits', columnName='blocking_pid', ordinalPosition=13, columnDefault='null', isNullable='YES', dataType='bigint', characterMaximumLength=0, characterOctetLength=0, numericPrecision=20, numericScale=0, datetimePrecision=0, characterSetName='null', collationName='null', columnType='bigint(20) unsigned', columnKey='', extra='', privileges='select,insert,update,references', columnComment='', generationExpression=''}*/
private Long blockingPid;

/**Column{tableCatalog='def', tableSchema='sys', tableName='x$schema_table_lock_waits', columnName='blocking_account', ordinalPosition=14, columnDefault='null', isNullable='YES', dataType='text', characterMaximumLength=65535, characterOctetLength=65535, numericPrecision=0, numericScale=0, datetimePrecision=0, characterSetName='utf8', collationName='utf8_general_ci', columnType='text', columnKey='', extra='', privileges='select,insert,update,references', columnComment='', generationExpression=''}*/
private String blockingAccount;

/**Column{tableCatalog='def', tableSchema='sys', tableName='x$schema_table_lock_waits', columnName='blocking_lock_type', ordinalPosition=15, columnDefault='null', isNullable='NO', dataType='varchar', characterMaximumLength=32, characterOctetLength=96, numericPrecision=0, numericScale=0, datetimePrecision=0, characterSetName='utf8', collationName='utf8_general_ci', columnType='varchar(32)', columnKey='', extra='', privileges='select,insert,update,references', columnComment='', generationExpression=''}*/
private String blockingLockType;

/**Column{tableCatalog='def', tableSchema='sys', tableName='x$schema_table_lock_waits', columnName='blocking_lock_duration', ordinalPosition=16, columnDefault='null', isNullable='NO', dataType='varchar', characterMaximumLength=32, characterOctetLength=96, numericPrecision=0, numericScale=0, datetimePrecision=0, characterSetName='utf8', collationName='utf8_general_ci', columnType='varchar(32)', columnKey='', extra='', privileges='select,insert,update,references', columnComment='', generationExpression=''}*/
private String blockingLockDuration;

/**Column{tableCatalog='def', tableSchema='sys', tableName='x$schema_table_lock_waits', columnName='sql_kill_blocking_query', ordinalPosition=17, columnDefault='null', isNullable='YES', dataType='varchar', characterMaximumLength=31, characterOctetLength=93, numericPrecision=0, numericScale=0, datetimePrecision=0, characterSetName='utf8', collationName='utf8_general_ci', columnType='varchar(31)', columnKey='', extra='', privileges='select,insert,update,references', columnComment='', generationExpression=''}*/
private String sqlKillBlockingQuery;

/**Column{tableCatalog='def', tableSchema='sys', tableName='x$schema_table_lock_waits', columnName='sql_kill_blocking_connection', ordinalPosition=18, columnDefault='null', isNullable='YES', dataType='varchar', characterMaximumLength=25, characterOctetLength=75, numericPrecision=0, numericScale=0, datetimePrecision=0, characterSetName='utf8', collationName='utf8_general_ci', columnType='varchar(25)', columnKey='', extra='', privileges='select,insert,update,references', columnComment='', generationExpression=''}*/
private String sqlKillBlockingConnection;

public String getObjectSchema(){
return objectSchema;
}

public String getObjectName(){
return objectName;
}

public Long getWaitingThreadId(){
return waitingThreadId;
}

public Long getWaitingPid(){
return waitingPid;
}

public String getWaitingAccount(){
return waitingAccount;
}

public String getWaitingLockType(){
return waitingLockType;
}

public String getWaitingLockDuration(){
return waitingLockDuration;
}

public String getWaitingQuery(){
return waitingQuery;
}

public Long getWaitingQuerySecs(){
return waitingQuerySecs;
}

public Long getWaitingQueryRowsAffected(){
return waitingQueryRowsAffected;
}

public Long getWaitingQueryRowsExamined(){
return waitingQueryRowsExamined;
}

public Long getBlockingThreadId(){
return blockingThreadId;
}

public Long getBlockingPid(){
return blockingPid;
}

public String getBlockingAccount(){
return blockingAccount;
}

public String getBlockingLockType(){
return blockingLockType;
}

public String getBlockingLockDuration(){
return blockingLockDuration;
}

public String getSqlKillBlockingQuery(){
return sqlKillBlockingQuery;
}

public String getSqlKillBlockingConnection(){
return sqlKillBlockingConnection;
}

}