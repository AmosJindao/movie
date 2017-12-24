package db.bean.mysql;

import java.util.Date;

/* SELECT start_time AS startTime, user_host AS userHost, query_time AS queryTime, lock_time AS lockTime, rows_sent AS rowsSent, rows_examined AS rowsExamined, db AS db, last_insert_id AS lastInsertId, insert_id AS insertId, server_id AS serverId, sql_text AS sqlText, thread_id AS threadId FROM mysql.slow_log */
/**Slow log
*/
public class SlowLog{
/**Column{tableCatalog='def', tableSchema='mysql', tableName='slow_log', columnName='start_time', ordinalPosition=1, columnDefault='CURRENT_TIMESTAMP(6)', isNullable='NO', dataType='timestamp', characterMaximumLength=0, characterOctetLength=0, numericPrecision=0, numericScale=0, datetimePrecision=6, characterSetName='null', collationName='null', columnType='timestamp(6)', columnKey='', extra='on update CURRENT_TIMESTAMP(6)', privileges='select,insert,update,references', columnComment='', generationExpression=''}*/
private Date startTime;

/**Column{tableCatalog='def', tableSchema='mysql', tableName='slow_log', columnName='user_host', ordinalPosition=2, columnDefault='null', isNullable='NO', dataType='mediumtext', characterMaximumLength=16777215, characterOctetLength=16777215, numericPrecision=0, numericScale=0, datetimePrecision=0, characterSetName='utf8', collationName='utf8_general_ci', columnType='mediumtext', columnKey='', extra='', privileges='select,insert,update,references', columnComment='', generationExpression=''}*/
private String userHost;

/**Column{tableCatalog='def', tableSchema='mysql', tableName='slow_log', columnName='query_time', ordinalPosition=3, columnDefault='null', isNullable='NO', dataType='time', characterMaximumLength=0, characterOctetLength=0, numericPrecision=0, numericScale=0, datetimePrecision=6, characterSetName='null', collationName='null', columnType='time(6)', columnKey='', extra='', privileges='select,insert,update,references', columnComment='', generationExpression=''}*/
private Date queryTime;

/**Column{tableCatalog='def', tableSchema='mysql', tableName='slow_log', columnName='lock_time', ordinalPosition=4, columnDefault='null', isNullable='NO', dataType='time', characterMaximumLength=0, characterOctetLength=0, numericPrecision=0, numericScale=0, datetimePrecision=6, characterSetName='null', collationName='null', columnType='time(6)', columnKey='', extra='', privileges='select,insert,update,references', columnComment='', generationExpression=''}*/
private Date lockTime;

/**Column{tableCatalog='def', tableSchema='mysql', tableName='slow_log', columnName='rows_sent', ordinalPosition=5, columnDefault='null', isNullable='NO', dataType='int', characterMaximumLength=0, characterOctetLength=0, numericPrecision=10, numericScale=0, datetimePrecision=0, characterSetName='null', collationName='null', columnType='int(11)', columnKey='', extra='', privileges='select,insert,update,references', columnComment='', generationExpression=''}*/
private Integer rowsSent;

/**Column{tableCatalog='def', tableSchema='mysql', tableName='slow_log', columnName='rows_examined', ordinalPosition=6, columnDefault='null', isNullable='NO', dataType='int', characterMaximumLength=0, characterOctetLength=0, numericPrecision=10, numericScale=0, datetimePrecision=0, characterSetName='null', collationName='null', columnType='int(11)', columnKey='', extra='', privileges='select,insert,update,references', columnComment='', generationExpression=''}*/
private Integer rowsExamined;

/**Column{tableCatalog='def', tableSchema='mysql', tableName='slow_log', columnName='db', ordinalPosition=7, columnDefault='null', isNullable='NO', dataType='varchar', characterMaximumLength=512, characterOctetLength=1536, numericPrecision=0, numericScale=0, datetimePrecision=0, characterSetName='utf8', collationName='utf8_general_ci', columnType='varchar(512)', columnKey='', extra='', privileges='select,insert,update,references', columnComment='', generationExpression=''}*/
private String db;

/**Column{tableCatalog='def', tableSchema='mysql', tableName='slow_log', columnName='last_insert_id', ordinalPosition=8, columnDefault='null', isNullable='NO', dataType='int', characterMaximumLength=0, characterOctetLength=0, numericPrecision=10, numericScale=0, datetimePrecision=0, characterSetName='null', collationName='null', columnType='int(11)', columnKey='', extra='', privileges='select,insert,update,references', columnComment='', generationExpression=''}*/
private Integer lastInsertId;

/**Column{tableCatalog='def', tableSchema='mysql', tableName='slow_log', columnName='insert_id', ordinalPosition=9, columnDefault='null', isNullable='NO', dataType='int', characterMaximumLength=0, characterOctetLength=0, numericPrecision=10, numericScale=0, datetimePrecision=0, characterSetName='null', collationName='null', columnType='int(11)', columnKey='', extra='', privileges='select,insert,update,references', columnComment='', generationExpression=''}*/
private Integer insertId;

/**Column{tableCatalog='def', tableSchema='mysql', tableName='slow_log', columnName='server_id', ordinalPosition=10, columnDefault='null', isNullable='NO', dataType='int', characterMaximumLength=0, characterOctetLength=0, numericPrecision=10, numericScale=0, datetimePrecision=0, characterSetName='null', collationName='null', columnType='int(10) unsigned', columnKey='', extra='', privileges='select,insert,update,references', columnComment='', generationExpression=''}*/
private Integer serverId;

/**Column{tableCatalog='def', tableSchema='mysql', tableName='slow_log', columnName='sql_text', ordinalPosition=11, columnDefault='null', isNullable='NO', dataType='mediumblob', characterMaximumLength=16777215, characterOctetLength=16777215, numericPrecision=0, numericScale=0, datetimePrecision=0, characterSetName='null', collationName='null', columnType='mediumblob', columnKey='', extra='', privileges='select,insert,update,references', columnComment='', generationExpression=''}*/
private String sqlText;

/**Column{tableCatalog='def', tableSchema='mysql', tableName='slow_log', columnName='thread_id', ordinalPosition=12, columnDefault='null', isNullable='NO', dataType='bigint', characterMaximumLength=0, characterOctetLength=0, numericPrecision=20, numericScale=0, datetimePrecision=0, characterSetName='null', collationName='null', columnType='bigint(21) unsigned', columnKey='', extra='', privileges='select,insert,update,references', columnComment='', generationExpression=''}*/
private Long threadId;

public Date getStartTime(){
return startTime;
}

public String getUserHost(){
return userHost;
}

public Date getQueryTime(){
return queryTime;
}

public Date getLockTime(){
return lockTime;
}

public Integer getRowsSent(){
return rowsSent;
}

public Integer getRowsExamined(){
return rowsExamined;
}

public String getDb(){
return db;
}

public Integer getLastInsertId(){
return lastInsertId;
}

public Integer getInsertId(){
return insertId;
}

public Integer getServerId(){
return serverId;
}

public String getSqlText(){
return sqlText;
}

public Long getThreadId(){
return threadId;
}

}