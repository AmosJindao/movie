package db.bean.sys;

import java.util.Date;

/**VIEW
*/
public class X$session{
/**Column{tableCatalog='def', tableSchema='sys', tableName='x$session', columnName='thd_id', ordinalPosition=1, columnDefault='null', isNullable='NO', dataType='bigint', characterMaximumLength=0, characterOctetLength=0, numericPrecision=20, numericScale=0, datetimePrecision=0, characterSetName='null', collationName='null', columnType='bigint(20) unsigned', columnKey='', extra='', privileges='select,insert,update,references', columnComment='', generationExpression=''}*/
private Long thdId;

/**Column{tableCatalog='def', tableSchema='sys', tableName='x$session', columnName='conn_id', ordinalPosition=2, columnDefault='null', isNullable='YES', dataType='bigint', characterMaximumLength=0, characterOctetLength=0, numericPrecision=20, numericScale=0, datetimePrecision=0, characterSetName='null', collationName='null', columnType='bigint(20) unsigned', columnKey='', extra='', privileges='select,insert,update,references', columnComment='', generationExpression=''}*/
private Long connId;

/**Column{tableCatalog='def', tableSchema='sys', tableName='x$session', columnName='user', ordinalPosition=3, columnDefault='null', isNullable='YES', dataType='varchar', characterMaximumLength=128, characterOctetLength=384, numericPrecision=0, numericScale=0, datetimePrecision=0, characterSetName='utf8', collationName='utf8_general_ci', columnType='varchar(128)', columnKey='', extra='', privileges='select,insert,update,references', columnComment='', generationExpression=''}*/
private String user;

/**Column{tableCatalog='def', tableSchema='sys', tableName='x$session', columnName='db', ordinalPosition=4, columnDefault='null', isNullable='YES', dataType='varchar', characterMaximumLength=64, characterOctetLength=192, numericPrecision=0, numericScale=0, datetimePrecision=0, characterSetName='utf8', collationName='utf8_general_ci', columnType='varchar(64)', columnKey='', extra='', privileges='select,insert,update,references', columnComment='', generationExpression=''}*/
private String db;

/**Column{tableCatalog='def', tableSchema='sys', tableName='x$session', columnName='command', ordinalPosition=5, columnDefault='null', isNullable='YES', dataType='varchar', characterMaximumLength=16, characterOctetLength=48, numericPrecision=0, numericScale=0, datetimePrecision=0, characterSetName='utf8', collationName='utf8_general_ci', columnType='varchar(16)', columnKey='', extra='', privileges='select,insert,update,references', columnComment='', generationExpression=''}*/
private String command;

/**Column{tableCatalog='def', tableSchema='sys', tableName='x$session', columnName='state', ordinalPosition=6, columnDefault='null', isNullable='YES', dataType='varchar', characterMaximumLength=64, characterOctetLength=192, numericPrecision=0, numericScale=0, datetimePrecision=0, characterSetName='utf8', collationName='utf8_general_ci', columnType='varchar(64)', columnKey='', extra='', privileges='select,insert,update,references', columnComment='', generationExpression=''}*/
private String state;

/**Column{tableCatalog='def', tableSchema='sys', tableName='x$session', columnName='time', ordinalPosition=7, columnDefault='null', isNullable='YES', dataType='bigint', characterMaximumLength=0, characterOctetLength=0, numericPrecision=19, numericScale=0, datetimePrecision=0, characterSetName='null', collationName='null', columnType='bigint(20)', columnKey='', extra='', privileges='select,insert,update,references', columnComment='', generationExpression=''}*/
private Long time;

/**Column{tableCatalog='def', tableSchema='sys', tableName='x$session', columnName='current_statement', ordinalPosition=8, columnDefault='null', isNullable='YES', dataType='longtext', characterMaximumLength=4294967295, characterOctetLength=4294967295, numericPrecision=0, numericScale=0, datetimePrecision=0, characterSetName='utf8', collationName='utf8_general_ci', columnType='longtext', columnKey='', extra='', privileges='select,insert,update,references', columnComment='', generationExpression=''}*/
private String currentStatement;

/**Column{tableCatalog='def', tableSchema='sys', tableName='x$session', columnName='statement_latency', ordinalPosition=9, columnDefault='null', isNullable='YES', dataType='bigint', characterMaximumLength=0, characterOctetLength=0, numericPrecision=20, numericScale=0, datetimePrecision=0, characterSetName='null', collationName='null', columnType='bigint(20) unsigned', columnKey='', extra='', privileges='select,insert,update,references', columnComment='', generationExpression=''}*/
private Long statementLatency;

/**Column{tableCatalog='def', tableSchema='sys', tableName='x$session', columnName='progress', ordinalPosition=10, columnDefault='null', isNullable='YES', dataType='decimal', characterMaximumLength=0, characterOctetLength=0, numericPrecision=26, numericScale=2, datetimePrecision=0, characterSetName='null', collationName='null', columnType='decimal(26,2)', columnKey='', extra='', privileges='select,insert,update,references', columnComment='', generationExpression=''}*/
private Double progress;

/**Column{tableCatalog='def', tableSchema='sys', tableName='x$session', columnName='lock_latency', ordinalPosition=11, columnDefault='null', isNullable='YES', dataType='bigint', characterMaximumLength=0, characterOctetLength=0, numericPrecision=20, numericScale=0, datetimePrecision=0, characterSetName='null', collationName='null', columnType='bigint(20) unsigned', columnKey='', extra='', privileges='select,insert,update,references', columnComment='', generationExpression=''}*/
private Long lockLatency;

/**Column{tableCatalog='def', tableSchema='sys', tableName='x$session', columnName='rows_examined', ordinalPosition=12, columnDefault='null', isNullable='YES', dataType='bigint', characterMaximumLength=0, characterOctetLength=0, numericPrecision=20, numericScale=0, datetimePrecision=0, characterSetName='null', collationName='null', columnType='bigint(20) unsigned', columnKey='', extra='', privileges='select,insert,update,references', columnComment='', generationExpression=''}*/
private Long rowsExamined;

/**Column{tableCatalog='def', tableSchema='sys', tableName='x$session', columnName='rows_sent', ordinalPosition=13, columnDefault='null', isNullable='YES', dataType='bigint', characterMaximumLength=0, characterOctetLength=0, numericPrecision=20, numericScale=0, datetimePrecision=0, characterSetName='null', collationName='null', columnType='bigint(20) unsigned', columnKey='', extra='', privileges='select,insert,update,references', columnComment='', generationExpression=''}*/
private Long rowsSent;

/**Column{tableCatalog='def', tableSchema='sys', tableName='x$session', columnName='rows_affected', ordinalPosition=14, columnDefault='null', isNullable='YES', dataType='bigint', characterMaximumLength=0, characterOctetLength=0, numericPrecision=20, numericScale=0, datetimePrecision=0, characterSetName='null', collationName='null', columnType='bigint(20) unsigned', columnKey='', extra='', privileges='select,insert,update,references', columnComment='', generationExpression=''}*/
private Long rowsAffected;

/**Column{tableCatalog='def', tableSchema='sys', tableName='x$session', columnName='tmp_tables', ordinalPosition=15, columnDefault='null', isNullable='YES', dataType='bigint', characterMaximumLength=0, characterOctetLength=0, numericPrecision=20, numericScale=0, datetimePrecision=0, characterSetName='null', collationName='null', columnType='bigint(20) unsigned', columnKey='', extra='', privileges='select,insert,update,references', columnComment='', generationExpression=''}*/
private Long tmpTables;

/**Column{tableCatalog='def', tableSchema='sys', tableName='x$session', columnName='tmp_disk_tables', ordinalPosition=16, columnDefault='null', isNullable='YES', dataType='bigint', characterMaximumLength=0, characterOctetLength=0, numericPrecision=20, numericScale=0, datetimePrecision=0, characterSetName='null', collationName='null', columnType='bigint(20) unsigned', columnKey='', extra='', privileges='select,insert,update,references', columnComment='', generationExpression=''}*/
private Long tmpDiskTables;

/**Column{tableCatalog='def', tableSchema='sys', tableName='x$session', columnName='full_scan', ordinalPosition=17, columnDefault='', isNullable='NO', dataType='varchar', characterMaximumLength=3, characterOctetLength=9, numericPrecision=0, numericScale=0, datetimePrecision=0, characterSetName='utf8', collationName='utf8_general_ci', columnType='varchar(3)', columnKey='', extra='', privileges='select,insert,update,references', columnComment='', generationExpression=''}*/
private String fullScan;

/**Column{tableCatalog='def', tableSchema='sys', tableName='x$session', columnName='last_statement', ordinalPosition=18, columnDefault='null', isNullable='YES', dataType='longtext', characterMaximumLength=4294967295, characterOctetLength=4294967295, numericPrecision=0, numericScale=0, datetimePrecision=0, characterSetName='utf8', collationName='utf8_general_ci', columnType='longtext', columnKey='', extra='', privileges='select,insert,update,references', columnComment='', generationExpression=''}*/
private String lastStatement;

/**Column{tableCatalog='def', tableSchema='sys', tableName='x$session', columnName='last_statement_latency', ordinalPosition=19, columnDefault='null', isNullable='YES', dataType='bigint', characterMaximumLength=0, characterOctetLength=0, numericPrecision=20, numericScale=0, datetimePrecision=0, characterSetName='null', collationName='null', columnType='bigint(20) unsigned', columnKey='', extra='', privileges='select,insert,update,references', columnComment='', generationExpression=''}*/
private Long lastStatementLatency;

/**Column{tableCatalog='def', tableSchema='sys', tableName='x$session', columnName='current_memory', ordinalPosition=20, columnDefault='null', isNullable='YES', dataType='decimal', characterMaximumLength=0, characterOctetLength=0, numericPrecision=41, numericScale=0, datetimePrecision=0, characterSetName='null', collationName='null', columnType='decimal(41,0)', columnKey='', extra='', privileges='select,insert,update,references', columnComment='', generationExpression=''}*/
private Double currentMemory;

/**Column{tableCatalog='def', tableSchema='sys', tableName='x$session', columnName='last_wait', ordinalPosition=21, columnDefault='null', isNullable='YES', dataType='varchar', characterMaximumLength=128, characterOctetLength=384, numericPrecision=0, numericScale=0, datetimePrecision=0, characterSetName='utf8', collationName='utf8_general_ci', columnType='varchar(128)', columnKey='', extra='', privileges='select,insert,update,references', columnComment='', generationExpression=''}*/
private String lastWait;

/**Column{tableCatalog='def', tableSchema='sys', tableName='x$session', columnName='last_wait_latency', ordinalPosition=22, columnDefault='null', isNullable='YES', dataType='varchar', characterMaximumLength=20, characterOctetLength=60, numericPrecision=0, numericScale=0, datetimePrecision=0, characterSetName='utf8', collationName='utf8_general_ci', columnType='varchar(20)', columnKey='', extra='', privileges='select,insert,update,references', columnComment='', generationExpression=''}*/
private String lastWaitLatency;

/**Column{tableCatalog='def', tableSchema='sys', tableName='x$session', columnName='source', ordinalPosition=23, columnDefault='null', isNullable='YES', dataType='varchar', characterMaximumLength=64, characterOctetLength=192, numericPrecision=0, numericScale=0, datetimePrecision=0, characterSetName='utf8', collationName='utf8_general_ci', columnType='varchar(64)', columnKey='', extra='', privileges='select,insert,update,references', columnComment='', generationExpression=''}*/
private String source;

/**Column{tableCatalog='def', tableSchema='sys', tableName='x$session', columnName='trx_latency', ordinalPosition=24, columnDefault='null', isNullable='YES', dataType='bigint', characterMaximumLength=0, characterOctetLength=0, numericPrecision=20, numericScale=0, datetimePrecision=0, characterSetName='null', collationName='null', columnType='bigint(20) unsigned', columnKey='', extra='', privileges='select,insert,update,references', columnComment='', generationExpression=''}*/
private Long trxLatency;

/**Column{tableCatalog='def', tableSchema='sys', tableName='x$session', columnName='trx_state', ordinalPosition=25, columnDefault='null', isNullable='YES', dataType='enum', characterMaximumLength=11, characterOctetLength=33, numericPrecision=0, numericScale=0, datetimePrecision=0, characterSetName='utf8', collationName='utf8_general_ci', columnType='enum('ACTIVE','COMMITTED','ROLLED BACK')', columnKey='', extra='', privileges='select,insert,update,references', columnComment='', generationExpression=''}*/
private Date trxState;

/**Column{tableCatalog='def', tableSchema='sys', tableName='x$session', columnName='trx_autocommit', ordinalPosition=26, columnDefault='null', isNullable='YES', dataType='enum', characterMaximumLength=3, characterOctetLength=9, numericPrecision=0, numericScale=0, datetimePrecision=0, characterSetName='utf8', collationName='utf8_general_ci', columnType='enum('YES','NO')', columnKey='', extra='', privileges='select,insert,update,references', columnComment='', generationExpression=''}*/
private Date trxAutocommit;

/**Column{tableCatalog='def', tableSchema='sys', tableName='x$session', columnName='pid', ordinalPosition=27, columnDefault='null', isNullable='YES', dataType='varchar', characterMaximumLength=1024, characterOctetLength=3072, numericPrecision=0, numericScale=0, datetimePrecision=0, characterSetName='utf8', collationName='utf8_bin', columnType='varchar(1024)', columnKey='', extra='', privileges='select,insert,update,references', columnComment='', generationExpression=''}*/
private String pid;

/**Column{tableCatalog='def', tableSchema='sys', tableName='x$session', columnName='program_name', ordinalPosition=28, columnDefault='null', isNullable='YES', dataType='varchar', characterMaximumLength=1024, characterOctetLength=3072, numericPrecision=0, numericScale=0, datetimePrecision=0, characterSetName='utf8', collationName='utf8_bin', columnType='varchar(1024)', columnKey='', extra='', privileges='select,insert,update,references', columnComment='', generationExpression=''}*/
private String programName;

public Long getThdId(){
return thdId;
}

public Long getConnId(){
return connId;
}

public String getUser(){
return user;
}

public String getDb(){
return db;
}

public String getCommand(){
return command;
}

public String getState(){
return state;
}

public Long getTime(){
return time;
}

public String getCurrentStatement(){
return currentStatement;
}

public Long getStatementLatency(){
return statementLatency;
}

public Double getProgress(){
return progress;
}

public Long getLockLatency(){
return lockLatency;
}

public Long getRowsExamined(){
return rowsExamined;
}

public Long getRowsSent(){
return rowsSent;
}

public Long getRowsAffected(){
return rowsAffected;
}

public Long getTmpTables(){
return tmpTables;
}

public Long getTmpDiskTables(){
return tmpDiskTables;
}

public String getFullScan(){
return fullScan;
}

public String getLastStatement(){
return lastStatement;
}

public Long getLastStatementLatency(){
return lastStatementLatency;
}

public Double getCurrentMemory(){
return currentMemory;
}

public String getLastWait(){
return lastWait;
}

public String getLastWaitLatency(){
return lastWaitLatency;
}

public String getSource(){
return source;
}

public Long getTrxLatency(){
return trxLatency;
}

public Date getTrxState(){
return trxState;
}

public Date getTrxAutocommit(){
return trxAutocommit;
}

public String getPid(){
return pid;
}

public String getProgramName(){
return programName;
}

}