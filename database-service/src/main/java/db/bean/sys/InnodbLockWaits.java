package db.bean.sys;

import java.util.Date;

/**VIEW
*/
public class InnodbLockWaits{
/**Column{tableCatalog='def', tableSchema='sys', tableName='innodb_lock_waits', columnName='wait_started', ordinalPosition=1, columnDefault='null', isNullable='YES', dataType='datetime', characterMaximumLength=0, characterOctetLength=0, numericPrecision=0, numericScale=0, datetimePrecision=0, characterSetName='null', collationName='null', columnType='datetime', columnKey='', extra='', privileges='select,insert,update,references', columnComment='', generationExpression=''}*/
private Date waitStarted;

/**Column{tableCatalog='def', tableSchema='sys', tableName='innodb_lock_waits', columnName='wait_age', ordinalPosition=2, columnDefault='null', isNullable='YES', dataType='time', characterMaximumLength=0, characterOctetLength=0, numericPrecision=0, numericScale=0, datetimePrecision=0, characterSetName='null', collationName='null', columnType='time', columnKey='', extra='', privileges='select,insert,update,references', columnComment='', generationExpression=''}*/
private Date waitAge;

/**Column{tableCatalog='def', tableSchema='sys', tableName='innodb_lock_waits', columnName='wait_age_secs', ordinalPosition=3, columnDefault='null', isNullable='YES', dataType='bigint', characterMaximumLength=0, characterOctetLength=0, numericPrecision=19, numericScale=0, datetimePrecision=0, characterSetName='null', collationName='null', columnType='bigint(21)', columnKey='', extra='', privileges='select,insert,update,references', columnComment='', generationExpression=''}*/
private Long waitAgeSecs;

/**Column{tableCatalog='def', tableSchema='sys', tableName='innodb_lock_waits', columnName='locked_table', ordinalPosition=4, columnDefault='', isNullable='NO', dataType='varchar', characterMaximumLength=1024, characterOctetLength=3072, numericPrecision=0, numericScale=0, datetimePrecision=0, characterSetName='utf8', collationName='utf8_general_ci', columnType='varchar(1024)', columnKey='', extra='', privileges='select,insert,update,references', columnComment='', generationExpression=''}*/
private String lockedTable;

/**Column{tableCatalog='def', tableSchema='sys', tableName='innodb_lock_waits', columnName='locked_index', ordinalPosition=5, columnDefault='null', isNullable='YES', dataType='varchar', characterMaximumLength=1024, characterOctetLength=3072, numericPrecision=0, numericScale=0, datetimePrecision=0, characterSetName='utf8', collationName='utf8_general_ci', columnType='varchar(1024)', columnKey='', extra='', privileges='select,insert,update,references', columnComment='', generationExpression=''}*/
private String lockedIndex;

/**Column{tableCatalog='def', tableSchema='sys', tableName='innodb_lock_waits', columnName='locked_type', ordinalPosition=6, columnDefault='', isNullable='NO', dataType='varchar', characterMaximumLength=32, characterOctetLength=96, numericPrecision=0, numericScale=0, datetimePrecision=0, characterSetName='utf8', collationName='utf8_general_ci', columnType='varchar(32)', columnKey='', extra='', privileges='select,insert,update,references', columnComment='', generationExpression=''}*/
private String lockedType;

/**Column{tableCatalog='def', tableSchema='sys', tableName='innodb_lock_waits', columnName='waiting_trx_id', ordinalPosition=7, columnDefault='', isNullable='NO', dataType='varchar', characterMaximumLength=18, characterOctetLength=54, numericPrecision=0, numericScale=0, datetimePrecision=0, characterSetName='utf8', collationName='utf8_general_ci', columnType='varchar(18)', columnKey='', extra='', privileges='select,insert,update,references', columnComment='', generationExpression=''}*/
private String waitingTrxId;

/**Column{tableCatalog='def', tableSchema='sys', tableName='innodb_lock_waits', columnName='waiting_trx_started', ordinalPosition=8, columnDefault='0000-00-00 00:00:00', isNullable='NO', dataType='datetime', characterMaximumLength=0, characterOctetLength=0, numericPrecision=0, numericScale=0, datetimePrecision=0, characterSetName='null', collationName='null', columnType='datetime', columnKey='', extra='', privileges='select,insert,update,references', columnComment='', generationExpression=''}*/
private Date waitingTrxStarted;

/**Column{tableCatalog='def', tableSchema='sys', tableName='innodb_lock_waits', columnName='waiting_trx_age', ordinalPosition=9, columnDefault='null', isNullable='YES', dataType='time', characterMaximumLength=0, characterOctetLength=0, numericPrecision=0, numericScale=0, datetimePrecision=0, characterSetName='null', collationName='null', columnType='time', columnKey='', extra='', privileges='select,insert,update,references', columnComment='', generationExpression=''}*/
private Date waitingTrxAge;

/**Column{tableCatalog='def', tableSchema='sys', tableName='innodb_lock_waits', columnName='waiting_trx_rows_locked', ordinalPosition=10, columnDefault='0', isNullable='NO', dataType='bigint', characterMaximumLength=0, characterOctetLength=0, numericPrecision=20, numericScale=0, datetimePrecision=0, characterSetName='null', collationName='null', columnType='bigint(21) unsigned', columnKey='', extra='', privileges='select,insert,update,references', columnComment='', generationExpression=''}*/
private Long waitingTrxRowsLocked;

/**Column{tableCatalog='def', tableSchema='sys', tableName='innodb_lock_waits', columnName='waiting_trx_rows_modified', ordinalPosition=11, columnDefault='0', isNullable='NO', dataType='bigint', characterMaximumLength=0, characterOctetLength=0, numericPrecision=20, numericScale=0, datetimePrecision=0, characterSetName='null', collationName='null', columnType='bigint(21) unsigned', columnKey='', extra='', privileges='select,insert,update,references', columnComment='', generationExpression=''}*/
private Long waitingTrxRowsModified;

/**Column{tableCatalog='def', tableSchema='sys', tableName='innodb_lock_waits', columnName='waiting_pid', ordinalPosition=12, columnDefault='0', isNullable='NO', dataType='bigint', characterMaximumLength=0, characterOctetLength=0, numericPrecision=20, numericScale=0, datetimePrecision=0, characterSetName='null', collationName='null', columnType='bigint(21) unsigned', columnKey='', extra='', privileges='select,insert,update,references', columnComment='', generationExpression=''}*/
private Long waitingPid;

/**Column{tableCatalog='def', tableSchema='sys', tableName='innodb_lock_waits', columnName='waiting_query', ordinalPosition=13, columnDefault='null', isNullable='YES', dataType='longtext', characterMaximumLength=4294967295, characterOctetLength=4294967295, numericPrecision=0, numericScale=0, datetimePrecision=0, characterSetName='utf8', collationName='utf8_general_ci', columnType='longtext', columnKey='', extra='', privileges='select,insert,update,references', columnComment='', generationExpression=''}*/
private String waitingQuery;

/**Column{tableCatalog='def', tableSchema='sys', tableName='innodb_lock_waits', columnName='waiting_lock_id', ordinalPosition=14, columnDefault='', isNullable='NO', dataType='varchar', characterMaximumLength=81, characterOctetLength=243, numericPrecision=0, numericScale=0, datetimePrecision=0, characterSetName='utf8', collationName='utf8_general_ci', columnType='varchar(81)', columnKey='', extra='', privileges='select,insert,update,references', columnComment='', generationExpression=''}*/
private String waitingLockId;

/**Column{tableCatalog='def', tableSchema='sys', tableName='innodb_lock_waits', columnName='waiting_lock_mode', ordinalPosition=15, columnDefault='', isNullable='NO', dataType='varchar', characterMaximumLength=32, characterOctetLength=96, numericPrecision=0, numericScale=0, datetimePrecision=0, characterSetName='utf8', collationName='utf8_general_ci', columnType='varchar(32)', columnKey='', extra='', privileges='select,insert,update,references', columnComment='', generationExpression=''}*/
private String waitingLockMode;

/**Column{tableCatalog='def', tableSchema='sys', tableName='innodb_lock_waits', columnName='blocking_trx_id', ordinalPosition=16, columnDefault='', isNullable='NO', dataType='varchar', characterMaximumLength=18, characterOctetLength=54, numericPrecision=0, numericScale=0, datetimePrecision=0, characterSetName='utf8', collationName='utf8_general_ci', columnType='varchar(18)', columnKey='', extra='', privileges='select,insert,update,references', columnComment='', generationExpression=''}*/
private String blockingTrxId;

/**Column{tableCatalog='def', tableSchema='sys', tableName='innodb_lock_waits', columnName='blocking_pid', ordinalPosition=17, columnDefault='0', isNullable='NO', dataType='bigint', characterMaximumLength=0, characterOctetLength=0, numericPrecision=20, numericScale=0, datetimePrecision=0, characterSetName='null', collationName='null', columnType='bigint(21) unsigned', columnKey='', extra='', privileges='select,insert,update,references', columnComment='', generationExpression=''}*/
private Long blockingPid;

/**Column{tableCatalog='def', tableSchema='sys', tableName='innodb_lock_waits', columnName='blocking_query', ordinalPosition=18, columnDefault='null', isNullable='YES', dataType='longtext', characterMaximumLength=4294967295, characterOctetLength=4294967295, numericPrecision=0, numericScale=0, datetimePrecision=0, characterSetName='utf8', collationName='utf8_general_ci', columnType='longtext', columnKey='', extra='', privileges='select,insert,update,references', columnComment='', generationExpression=''}*/
private String blockingQuery;

/**Column{tableCatalog='def', tableSchema='sys', tableName='innodb_lock_waits', columnName='blocking_lock_id', ordinalPosition=19, columnDefault='', isNullable='NO', dataType='varchar', characterMaximumLength=81, characterOctetLength=243, numericPrecision=0, numericScale=0, datetimePrecision=0, characterSetName='utf8', collationName='utf8_general_ci', columnType='varchar(81)', columnKey='', extra='', privileges='select,insert,update,references', columnComment='', generationExpression=''}*/
private String blockingLockId;

/**Column{tableCatalog='def', tableSchema='sys', tableName='innodb_lock_waits', columnName='blocking_lock_mode', ordinalPosition=20, columnDefault='', isNullable='NO', dataType='varchar', characterMaximumLength=32, characterOctetLength=96, numericPrecision=0, numericScale=0, datetimePrecision=0, characterSetName='utf8', collationName='utf8_general_ci', columnType='varchar(32)', columnKey='', extra='', privileges='select,insert,update,references', columnComment='', generationExpression=''}*/
private String blockingLockMode;

/**Column{tableCatalog='def', tableSchema='sys', tableName='innodb_lock_waits', columnName='blocking_trx_started', ordinalPosition=21, columnDefault='0000-00-00 00:00:00', isNullable='NO', dataType='datetime', characterMaximumLength=0, characterOctetLength=0, numericPrecision=0, numericScale=0, datetimePrecision=0, characterSetName='null', collationName='null', columnType='datetime', columnKey='', extra='', privileges='select,insert,update,references', columnComment='', generationExpression=''}*/
private Date blockingTrxStarted;

/**Column{tableCatalog='def', tableSchema='sys', tableName='innodb_lock_waits', columnName='blocking_trx_age', ordinalPosition=22, columnDefault='null', isNullable='YES', dataType='time', characterMaximumLength=0, characterOctetLength=0, numericPrecision=0, numericScale=0, datetimePrecision=0, characterSetName='null', collationName='null', columnType='time', columnKey='', extra='', privileges='select,insert,update,references', columnComment='', generationExpression=''}*/
private Date blockingTrxAge;

/**Column{tableCatalog='def', tableSchema='sys', tableName='innodb_lock_waits', columnName='blocking_trx_rows_locked', ordinalPosition=23, columnDefault='0', isNullable='NO', dataType='bigint', characterMaximumLength=0, characterOctetLength=0, numericPrecision=20, numericScale=0, datetimePrecision=0, characterSetName='null', collationName='null', columnType='bigint(21) unsigned', columnKey='', extra='', privileges='select,insert,update,references', columnComment='', generationExpression=''}*/
private Long blockingTrxRowsLocked;

/**Column{tableCatalog='def', tableSchema='sys', tableName='innodb_lock_waits', columnName='blocking_trx_rows_modified', ordinalPosition=24, columnDefault='0', isNullable='NO', dataType='bigint', characterMaximumLength=0, characterOctetLength=0, numericPrecision=20, numericScale=0, datetimePrecision=0, characterSetName='null', collationName='null', columnType='bigint(21) unsigned', columnKey='', extra='', privileges='select,insert,update,references', columnComment='', generationExpression=''}*/
private Long blockingTrxRowsModified;

/**Column{tableCatalog='def', tableSchema='sys', tableName='innodb_lock_waits', columnName='sql_kill_blocking_query', ordinalPosition=25, columnDefault='null', isNullable='YES', dataType='varchar', characterMaximumLength=32, characterOctetLength=96, numericPrecision=0, numericScale=0, datetimePrecision=0, characterSetName='utf8', collationName='utf8_general_ci', columnType='varchar(32)', columnKey='', extra='', privileges='select,insert,update,references', columnComment='', generationExpression=''}*/
private String sqlKillBlockingQuery;

/**Column{tableCatalog='def', tableSchema='sys', tableName='innodb_lock_waits', columnName='sql_kill_blocking_connection', ordinalPosition=26, columnDefault='null', isNullable='YES', dataType='varchar', characterMaximumLength=26, characterOctetLength=78, numericPrecision=0, numericScale=0, datetimePrecision=0, characterSetName='utf8', collationName='utf8_general_ci', columnType='varchar(26)', columnKey='', extra='', privileges='select,insert,update,references', columnComment='', generationExpression=''}*/
private String sqlKillBlockingConnection;

public Date getWaitStarted(){
return waitStarted;
}

public Date getWaitAge(){
return waitAge;
}

public Long getWaitAgeSecs(){
return waitAgeSecs;
}

public String getLockedTable(){
return lockedTable;
}

public String getLockedIndex(){
return lockedIndex;
}

public String getLockedType(){
return lockedType;
}

public String getWaitingTrxId(){
return waitingTrxId;
}

public Date getWaitingTrxStarted(){
return waitingTrxStarted;
}

public Date getWaitingTrxAge(){
return waitingTrxAge;
}

public Long getWaitingTrxRowsLocked(){
return waitingTrxRowsLocked;
}

public Long getWaitingTrxRowsModified(){
return waitingTrxRowsModified;
}

public Long getWaitingPid(){
return waitingPid;
}

public String getWaitingQuery(){
return waitingQuery;
}

public String getWaitingLockId(){
return waitingLockId;
}

public String getWaitingLockMode(){
return waitingLockMode;
}

public String getBlockingTrxId(){
return blockingTrxId;
}

public Long getBlockingPid(){
return blockingPid;
}

public String getBlockingQuery(){
return blockingQuery;
}

public String getBlockingLockId(){
return blockingLockId;
}

public String getBlockingLockMode(){
return blockingLockMode;
}

public Date getBlockingTrxStarted(){
return blockingTrxStarted;
}

public Date getBlockingTrxAge(){
return blockingTrxAge;
}

public Long getBlockingTrxRowsLocked(){
return blockingTrxRowsLocked;
}

public Long getBlockingTrxRowsModified(){
return blockingTrxRowsModified;
}

public String getSqlKillBlockingQuery(){
return sqlKillBlockingQuery;
}

public String getSqlKillBlockingConnection(){
return sqlKillBlockingConnection;
}

}