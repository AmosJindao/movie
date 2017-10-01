package db.bean.information_schema;

import java.util.Date;

/**
*/
public class InnodbTrx{
/**Column{tableCatalog='def', tableSchema='information_schema', tableName='INNODB_TRX', columnName='trx_id', ordinalPosition=1, columnDefault='', isNullable='NO', dataType='varchar', characterMaximumLength=18, characterOctetLength=54, numericPrecision=0, numericScale=0, datetimePrecision=0, characterSetName='utf8', collationName='utf8_general_ci', columnType='varchar(18)', columnKey='', extra='', privileges='select', columnComment='', generationExpression=''}*/
private String trxId;

/**Column{tableCatalog='def', tableSchema='information_schema', tableName='INNODB_TRX', columnName='trx_state', ordinalPosition=2, columnDefault='', isNullable='NO', dataType='varchar', characterMaximumLength=13, characterOctetLength=39, numericPrecision=0, numericScale=0, datetimePrecision=0, characterSetName='utf8', collationName='utf8_general_ci', columnType='varchar(13)', columnKey='', extra='', privileges='select', columnComment='', generationExpression=''}*/
private String trxState;

/**Column{tableCatalog='def', tableSchema='information_schema', tableName='INNODB_TRX', columnName='trx_started', ordinalPosition=3, columnDefault='0000-00-00 00:00:00', isNullable='NO', dataType='datetime', characterMaximumLength=0, characterOctetLength=0, numericPrecision=0, numericScale=0, datetimePrecision=0, characterSetName='null', collationName='null', columnType='datetime', columnKey='', extra='', privileges='select', columnComment='', generationExpression=''}*/
private Date trxStarted;

/**Column{tableCatalog='def', tableSchema='information_schema', tableName='INNODB_TRX', columnName='trx_requested_lock_id', ordinalPosition=4, columnDefault='null', isNullable='YES', dataType='varchar', characterMaximumLength=81, characterOctetLength=243, numericPrecision=0, numericScale=0, datetimePrecision=0, characterSetName='utf8', collationName='utf8_general_ci', columnType='varchar(81)', columnKey='', extra='', privileges='select', columnComment='', generationExpression=''}*/
private String trxRequestedLockId;

/**Column{tableCatalog='def', tableSchema='information_schema', tableName='INNODB_TRX', columnName='trx_wait_started', ordinalPosition=5, columnDefault='null', isNullable='YES', dataType='datetime', characterMaximumLength=0, characterOctetLength=0, numericPrecision=0, numericScale=0, datetimePrecision=0, characterSetName='null', collationName='null', columnType='datetime', columnKey='', extra='', privileges='select', columnComment='', generationExpression=''}*/
private Date trxWaitStarted;

/**Column{tableCatalog='def', tableSchema='information_schema', tableName='INNODB_TRX', columnName='trx_weight', ordinalPosition=6, columnDefault='0', isNullable='NO', dataType='bigint', characterMaximumLength=0, characterOctetLength=0, numericPrecision=20, numericScale=0, datetimePrecision=0, characterSetName='null', collationName='null', columnType='bigint(21) unsigned', columnKey='', extra='', privileges='select', columnComment='', generationExpression=''}*/
private Long trxWeight;

/**Column{tableCatalog='def', tableSchema='information_schema', tableName='INNODB_TRX', columnName='trx_mysql_thread_id', ordinalPosition=7, columnDefault='0', isNullable='NO', dataType='bigint', characterMaximumLength=0, characterOctetLength=0, numericPrecision=20, numericScale=0, datetimePrecision=0, characterSetName='null', collationName='null', columnType='bigint(21) unsigned', columnKey='', extra='', privileges='select', columnComment='', generationExpression=''}*/
private Long trxMysqlThreadId;

/**Column{tableCatalog='def', tableSchema='information_schema', tableName='INNODB_TRX', columnName='trx_query', ordinalPosition=8, columnDefault='null', isNullable='YES', dataType='varchar', characterMaximumLength=1024, characterOctetLength=3072, numericPrecision=0, numericScale=0, datetimePrecision=0, characterSetName='utf8', collationName='utf8_general_ci', columnType='varchar(1024)', columnKey='', extra='', privileges='select', columnComment='', generationExpression=''}*/
private String trxQuery;

/**Column{tableCatalog='def', tableSchema='information_schema', tableName='INNODB_TRX', columnName='trx_operation_state', ordinalPosition=9, columnDefault='null', isNullable='YES', dataType='varchar', characterMaximumLength=64, characterOctetLength=192, numericPrecision=0, numericScale=0, datetimePrecision=0, characterSetName='utf8', collationName='utf8_general_ci', columnType='varchar(64)', columnKey='', extra='', privileges='select', columnComment='', generationExpression=''}*/
private String trxOperationState;

/**Column{tableCatalog='def', tableSchema='information_schema', tableName='INNODB_TRX', columnName='trx_tables_in_use', ordinalPosition=10, columnDefault='0', isNullable='NO', dataType='bigint', characterMaximumLength=0, characterOctetLength=0, numericPrecision=20, numericScale=0, datetimePrecision=0, characterSetName='null', collationName='null', columnType='bigint(21) unsigned', columnKey='', extra='', privileges='select', columnComment='', generationExpression=''}*/
private Long trxTablesInUse;

/**Column{tableCatalog='def', tableSchema='information_schema', tableName='INNODB_TRX', columnName='trx_tables_locked', ordinalPosition=11, columnDefault='0', isNullable='NO', dataType='bigint', characterMaximumLength=0, characterOctetLength=0, numericPrecision=20, numericScale=0, datetimePrecision=0, characterSetName='null', collationName='null', columnType='bigint(21) unsigned', columnKey='', extra='', privileges='select', columnComment='', generationExpression=''}*/
private Long trxTablesLocked;

/**Column{tableCatalog='def', tableSchema='information_schema', tableName='INNODB_TRX', columnName='trx_lock_structs', ordinalPosition=12, columnDefault='0', isNullable='NO', dataType='bigint', characterMaximumLength=0, characterOctetLength=0, numericPrecision=20, numericScale=0, datetimePrecision=0, characterSetName='null', collationName='null', columnType='bigint(21) unsigned', columnKey='', extra='', privileges='select', columnComment='', generationExpression=''}*/
private Long trxLockStructs;

/**Column{tableCatalog='def', tableSchema='information_schema', tableName='INNODB_TRX', columnName='trx_lock_memory_bytes', ordinalPosition=13, columnDefault='0', isNullable='NO', dataType='bigint', characterMaximumLength=0, characterOctetLength=0, numericPrecision=20, numericScale=0, datetimePrecision=0, characterSetName='null', collationName='null', columnType='bigint(21) unsigned', columnKey='', extra='', privileges='select', columnComment='', generationExpression=''}*/
private Long trxLockMemoryBytes;

/**Column{tableCatalog='def', tableSchema='information_schema', tableName='INNODB_TRX', columnName='trx_rows_locked', ordinalPosition=14, columnDefault='0', isNullable='NO', dataType='bigint', characterMaximumLength=0, characterOctetLength=0, numericPrecision=20, numericScale=0, datetimePrecision=0, characterSetName='null', collationName='null', columnType='bigint(21) unsigned', columnKey='', extra='', privileges='select', columnComment='', generationExpression=''}*/
private Long trxRowsLocked;

/**Column{tableCatalog='def', tableSchema='information_schema', tableName='INNODB_TRX', columnName='trx_rows_modified', ordinalPosition=15, columnDefault='0', isNullable='NO', dataType='bigint', characterMaximumLength=0, characterOctetLength=0, numericPrecision=20, numericScale=0, datetimePrecision=0, characterSetName='null', collationName='null', columnType='bigint(21) unsigned', columnKey='', extra='', privileges='select', columnComment='', generationExpression=''}*/
private Long trxRowsModified;

/**Column{tableCatalog='def', tableSchema='information_schema', tableName='INNODB_TRX', columnName='trx_concurrency_tickets', ordinalPosition=16, columnDefault='0', isNullable='NO', dataType='bigint', characterMaximumLength=0, characterOctetLength=0, numericPrecision=20, numericScale=0, datetimePrecision=0, characterSetName='null', collationName='null', columnType='bigint(21) unsigned', columnKey='', extra='', privileges='select', columnComment='', generationExpression=''}*/
private Long trxConcurrencyTickets;

/**Column{tableCatalog='def', tableSchema='information_schema', tableName='INNODB_TRX', columnName='trx_isolation_level', ordinalPosition=17, columnDefault='', isNullable='NO', dataType='varchar', characterMaximumLength=16, characterOctetLength=48, numericPrecision=0, numericScale=0, datetimePrecision=0, characterSetName='utf8', collationName='utf8_general_ci', columnType='varchar(16)', columnKey='', extra='', privileges='select', columnComment='', generationExpression=''}*/
private String trxIsolationLevel;

/**Column{tableCatalog='def', tableSchema='information_schema', tableName='INNODB_TRX', columnName='trx_unique_checks', ordinalPosition=18, columnDefault='0', isNullable='NO', dataType='int', characterMaximumLength=0, characterOctetLength=0, numericPrecision=10, numericScale=0, datetimePrecision=0, characterSetName='null', collationName='null', columnType='int(1)', columnKey='', extra='', privileges='select', columnComment='', generationExpression=''}*/
private Integer trxUniqueChecks;

/**Column{tableCatalog='def', tableSchema='information_schema', tableName='INNODB_TRX', columnName='trx_foreign_key_checks', ordinalPosition=19, columnDefault='0', isNullable='NO', dataType='int', characterMaximumLength=0, characterOctetLength=0, numericPrecision=10, numericScale=0, datetimePrecision=0, characterSetName='null', collationName='null', columnType='int(1)', columnKey='', extra='', privileges='select', columnComment='', generationExpression=''}*/
private Integer trxForeignKeyChecks;

/**Column{tableCatalog='def', tableSchema='information_schema', tableName='INNODB_TRX', columnName='trx_last_foreign_key_error', ordinalPosition=20, columnDefault='null', isNullable='YES', dataType='varchar', characterMaximumLength=256, characterOctetLength=768, numericPrecision=0, numericScale=0, datetimePrecision=0, characterSetName='utf8', collationName='utf8_general_ci', columnType='varchar(256)', columnKey='', extra='', privileges='select', columnComment='', generationExpression=''}*/
private String trxLastForeignKeyError;

/**Column{tableCatalog='def', tableSchema='information_schema', tableName='INNODB_TRX', columnName='trx_adaptive_hash_latched', ordinalPosition=21, columnDefault='0', isNullable='NO', dataType='int', characterMaximumLength=0, characterOctetLength=0, numericPrecision=10, numericScale=0, datetimePrecision=0, characterSetName='null', collationName='null', columnType='int(1)', columnKey='', extra='', privileges='select', columnComment='', generationExpression=''}*/
private Integer trxAdaptiveHashLatched;

/**Column{tableCatalog='def', tableSchema='information_schema', tableName='INNODB_TRX', columnName='trx_adaptive_hash_timeout', ordinalPosition=22, columnDefault='0', isNullable='NO', dataType='bigint', characterMaximumLength=0, characterOctetLength=0, numericPrecision=20, numericScale=0, datetimePrecision=0, characterSetName='null', collationName='null', columnType='bigint(21) unsigned', columnKey='', extra='', privileges='select', columnComment='', generationExpression=''}*/
private Long trxAdaptiveHashTimeout;

/**Column{tableCatalog='def', tableSchema='information_schema', tableName='INNODB_TRX', columnName='trx_is_read_only', ordinalPosition=23, columnDefault='0', isNullable='NO', dataType='int', characterMaximumLength=0, characterOctetLength=0, numericPrecision=10, numericScale=0, datetimePrecision=0, characterSetName='null', collationName='null', columnType='int(1)', columnKey='', extra='', privileges='select', columnComment='', generationExpression=''}*/
private Integer trxIsReadOnly;

/**Column{tableCatalog='def', tableSchema='information_schema', tableName='INNODB_TRX', columnName='trx_autocommit_non_locking', ordinalPosition=24, columnDefault='0', isNullable='NO', dataType='int', characterMaximumLength=0, characterOctetLength=0, numericPrecision=10, numericScale=0, datetimePrecision=0, characterSetName='null', collationName='null', columnType='int(1)', columnKey='', extra='', privileges='select', columnComment='', generationExpression=''}*/
private Integer trxAutocommitNonLocking;

public String getTrxId(){
return trxId;
}

public String getTrxState(){
return trxState;
}

public Date getTrxStarted(){
return trxStarted;
}

public String getTrxRequestedLockId(){
return trxRequestedLockId;
}

public Date getTrxWaitStarted(){
return trxWaitStarted;
}

public Long getTrxWeight(){
return trxWeight;
}

public Long getTrxMysqlThreadId(){
return trxMysqlThreadId;
}

public String getTrxQuery(){
return trxQuery;
}

public String getTrxOperationState(){
return trxOperationState;
}

public Long getTrxTablesInUse(){
return trxTablesInUse;
}

public Long getTrxTablesLocked(){
return trxTablesLocked;
}

public Long getTrxLockStructs(){
return trxLockStructs;
}

public Long getTrxLockMemoryBytes(){
return trxLockMemoryBytes;
}

public Long getTrxRowsLocked(){
return trxRowsLocked;
}

public Long getTrxRowsModified(){
return trxRowsModified;
}

public Long getTrxConcurrencyTickets(){
return trxConcurrencyTickets;
}

public String getTrxIsolationLevel(){
return trxIsolationLevel;
}

public Integer getTrxUniqueChecks(){
return trxUniqueChecks;
}

public Integer getTrxForeignKeyChecks(){
return trxForeignKeyChecks;
}

public String getTrxLastForeignKeyError(){
return trxLastForeignKeyError;
}

public Integer getTrxAdaptiveHashLatched(){
return trxAdaptiveHashLatched;
}

public Long getTrxAdaptiveHashTimeout(){
return trxAdaptiveHashTimeout;
}

public Integer getTrxIsReadOnly(){
return trxIsReadOnly;
}

public Integer getTrxAutocommitNonLocking(){
return trxAutocommitNonLocking;
}

}