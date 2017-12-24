package db.bean.mysql;

import java.util.Date;
import java.util.Set;

/* SELECT db AS db, name AS name, body AS body, definer AS definer, execute_at AS executeAt, interval_value AS intervalValue, interval_field AS intervalField, created AS created, modified AS modified, last_executed AS lastExecuted, starts AS starts, ends AS ends, status AS status, on_completion AS onCompletion, sql_mode AS sqlMode, comment AS comment, originator AS originator, time_zone AS timeZone, character_set_client AS characterSetClient, collation_connection AS collationConnection, db_collation AS dbCollation, body_utf8 AS bodyUtf8 FROM mysql.event */
/**Events
*/
public class Event{
/**Column{tableCatalog='def', tableSchema='mysql', tableName='event', columnName='db', ordinalPosition=1, columnDefault='', isNullable='NO', dataType='char', characterMaximumLength=64, characterOctetLength=192, numericPrecision=0, numericScale=0, datetimePrecision=0, characterSetName='utf8', collationName='utf8_bin', columnType='char(64)', columnKey='PRI', extra='', privileges='select,insert,update,references', columnComment='', generationExpression=''}*/
private String db;

/**Column{tableCatalog='def', tableSchema='mysql', tableName='event', columnName='name', ordinalPosition=2, columnDefault='', isNullable='NO', dataType='char', characterMaximumLength=64, characterOctetLength=192, numericPrecision=0, numericScale=0, datetimePrecision=0, characterSetName='utf8', collationName='utf8_general_ci', columnType='char(64)', columnKey='PRI', extra='', privileges='select,insert,update,references', columnComment='', generationExpression=''}*/
private String name;

/**Column{tableCatalog='def', tableSchema='mysql', tableName='event', columnName='body', ordinalPosition=3, columnDefault='null', isNullable='NO', dataType='longblob', characterMaximumLength=4294967295, characterOctetLength=4294967295, numericPrecision=0, numericScale=0, datetimePrecision=0, characterSetName='null', collationName='null', columnType='longblob', columnKey='', extra='', privileges='select,insert,update,references', columnComment='', generationExpression=''}*/
private String body;

/**Column{tableCatalog='def', tableSchema='mysql', tableName='event', columnName='definer', ordinalPosition=4, columnDefault='', isNullable='NO', dataType='char', characterMaximumLength=93, characterOctetLength=279, numericPrecision=0, numericScale=0, datetimePrecision=0, characterSetName='utf8', collationName='utf8_bin', columnType='char(93)', columnKey='', extra='', privileges='select,insert,update,references', columnComment='', generationExpression=''}*/
private String definer;

/**Column{tableCatalog='def', tableSchema='mysql', tableName='event', columnName='execute_at', ordinalPosition=5, columnDefault='null', isNullable='YES', dataType='datetime', characterMaximumLength=0, characterOctetLength=0, numericPrecision=0, numericScale=0, datetimePrecision=0, characterSetName='null', collationName='null', columnType='datetime', columnKey='', extra='', privileges='select,insert,update,references', columnComment='', generationExpression=''}*/
private Date executeAt;

/**Column{tableCatalog='def', tableSchema='mysql', tableName='event', columnName='interval_value', ordinalPosition=6, columnDefault='null', isNullable='YES', dataType='int', characterMaximumLength=0, characterOctetLength=0, numericPrecision=10, numericScale=0, datetimePrecision=0, characterSetName='null', collationName='null', columnType='int(11)', columnKey='', extra='', privileges='select,insert,update,references', columnComment='', generationExpression=''}*/
private Integer intervalValue;

/**Column{tableCatalog='def', tableSchema='mysql', tableName='event', columnName='interval_field', ordinalPosition=7, columnDefault='null', isNullable='YES', dataType='enum', characterMaximumLength=18, characterOctetLength=54, numericPrecision=0, numericScale=0, datetimePrecision=0, characterSetName='utf8', collationName='utf8_general_ci', columnType='enum('YEAR','QUARTER','MONTH','DAY','HOUR','MINUTE','WEEK','SECOND','MICROSECOND','YEAR_MONTH','DAY_HOUR','DAY_MINUTE','DAY_SECOND','HOUR_MINUTE','HOUR_SECOND','MINUTE_SECOND','DAY_MICROSECOND','HOUR_MICROSECOND','MINUTE_MICROSECOND','SECOND_MICROSECOND')', columnKey='', extra='', privileges='select,insert,update,references', columnComment='', generationExpression=''}*/
private Date intervalField;

/**Column{tableCatalog='def', tableSchema='mysql', tableName='event', columnName='created', ordinalPosition=8, columnDefault='CURRENT_TIMESTAMP', isNullable='NO', dataType='timestamp', characterMaximumLength=0, characterOctetLength=0, numericPrecision=0, numericScale=0, datetimePrecision=0, characterSetName='null', collationName='null', columnType='timestamp', columnKey='', extra='on update CURRENT_TIMESTAMP', privileges='select,insert,update,references', columnComment='', generationExpression=''}*/
private Date created;

/**Column{tableCatalog='def', tableSchema='mysql', tableName='event', columnName='modified', ordinalPosition=9, columnDefault='0000-00-00 00:00:00', isNullable='NO', dataType='timestamp', characterMaximumLength=0, characterOctetLength=0, numericPrecision=0, numericScale=0, datetimePrecision=0, characterSetName='null', collationName='null', columnType='timestamp', columnKey='', extra='', privileges='select,insert,update,references', columnComment='', generationExpression=''}*/
private Date modified;

/**Column{tableCatalog='def', tableSchema='mysql', tableName='event', columnName='last_executed', ordinalPosition=10, columnDefault='null', isNullable='YES', dataType='datetime', characterMaximumLength=0, characterOctetLength=0, numericPrecision=0, numericScale=0, datetimePrecision=0, characterSetName='null', collationName='null', columnType='datetime', columnKey='', extra='', privileges='select,insert,update,references', columnComment='', generationExpression=''}*/
private Date lastExecuted;

/**Column{tableCatalog='def', tableSchema='mysql', tableName='event', columnName='starts', ordinalPosition=11, columnDefault='null', isNullable='YES', dataType='datetime', characterMaximumLength=0, characterOctetLength=0, numericPrecision=0, numericScale=0, datetimePrecision=0, characterSetName='null', collationName='null', columnType='datetime', columnKey='', extra='', privileges='select,insert,update,references', columnComment='', generationExpression=''}*/
private Date starts;

/**Column{tableCatalog='def', tableSchema='mysql', tableName='event', columnName='ends', ordinalPosition=12, columnDefault='null', isNullable='YES', dataType='datetime', characterMaximumLength=0, characterOctetLength=0, numericPrecision=0, numericScale=0, datetimePrecision=0, characterSetName='null', collationName='null', columnType='datetime', columnKey='', extra='', privileges='select,insert,update,references', columnComment='', generationExpression=''}*/
private Date ends;

/**Column{tableCatalog='def', tableSchema='mysql', tableName='event', columnName='status', ordinalPosition=13, columnDefault='ENABLED', isNullable='NO', dataType='enum', characterMaximumLength=18, characterOctetLength=54, numericPrecision=0, numericScale=0, datetimePrecision=0, characterSetName='utf8', collationName='utf8_general_ci', columnType='enum('ENABLED','DISABLED','SLAVESIDE_DISABLED')', columnKey='', extra='', privileges='select,insert,update,references', columnComment='', generationExpression=''}*/
private Date status;

/**Column{tableCatalog='def', tableSchema='mysql', tableName='event', columnName='on_completion', ordinalPosition=14, columnDefault='DROP', isNullable='NO', dataType='enum', characterMaximumLength=8, characterOctetLength=24, numericPrecision=0, numericScale=0, datetimePrecision=0, characterSetName='utf8', collationName='utf8_general_ci', columnType='enum('DROP','PRESERVE')', columnKey='', extra='', privileges='select,insert,update,references', columnComment='', generationExpression=''}*/
private Date onCompletion;

/**Column{tableCatalog='def', tableSchema='mysql', tableName='event', columnName='sql_mode', ordinalPosition=15, columnDefault='', isNullable='NO', dataType='set', characterMaximumLength=478, characterOctetLength=1434, numericPrecision=0, numericScale=0, datetimePrecision=0, characterSetName='utf8', collationName='utf8_general_ci', columnType='set('REAL_AS_FLOAT','PIPES_AS_CONCAT','ANSI_QUOTES','IGNORE_SPACE','NOT_USED','ONLY_FULL_GROUP_BY','NO_UNSIGNED_SUBTRACTION','NO_DIR_IN_CREATE','POSTGRESQL','ORACLE','MSSQL','DB2','MAXDB','NO_KEY_OPTIONS','NO_TABLE_OPTIONS','NO_FIELD_OPTIONS','MYSQL323','MYSQL40','ANSI','NO_AUTO_VALUE_ON_ZERO','NO_BACKSLASH_ESCAPES','STRICT_TRANS_TABLES','STRICT_ALL_TABLES','NO_ZERO_IN_DATE','NO_ZERO_DATE','INVALID_DATES','ERROR_FOR_DIVISION_BY_ZERO','TRADITIONAL','NO_AUTO_CREATE_USER','HIGH_NOT_PRECEDENCE','NO_ENGINE_SUBSTITUTION','PAD_CHAR_TO_FULL_LENGTH')', columnKey='', extra='', privileges='select,insert,update,references', columnComment='', generationExpression=''}*/
private Set<String> sqlMode;

/**Column{tableCatalog='def', tableSchema='mysql', tableName='event', columnName='comment', ordinalPosition=16, columnDefault='', isNullable='NO', dataType='char', characterMaximumLength=64, characterOctetLength=192, numericPrecision=0, numericScale=0, datetimePrecision=0, characterSetName='utf8', collationName='utf8_bin', columnType='char(64)', columnKey='', extra='', privileges='select,insert,update,references', columnComment='', generationExpression=''}*/
private String comment;

/**Column{tableCatalog='def', tableSchema='mysql', tableName='event', columnName='originator', ordinalPosition=17, columnDefault='null', isNullable='NO', dataType='int', characterMaximumLength=0, characterOctetLength=0, numericPrecision=10, numericScale=0, datetimePrecision=0, characterSetName='null', collationName='null', columnType='int(10) unsigned', columnKey='', extra='', privileges='select,insert,update,references', columnComment='', generationExpression=''}*/
private Integer originator;

/**Column{tableCatalog='def', tableSchema='mysql', tableName='event', columnName='time_zone', ordinalPosition=18, columnDefault='SYSTEM', isNullable='NO', dataType='char', characterMaximumLength=64, characterOctetLength=64, numericPrecision=0, numericScale=0, datetimePrecision=0, characterSetName='latin1', collationName='latin1_swedish_ci', columnType='char(64)', columnKey='', extra='', privileges='select,insert,update,references', columnComment='', generationExpression=''}*/
private String timeZone;

/**Column{tableCatalog='def', tableSchema='mysql', tableName='event', columnName='character_set_client', ordinalPosition=19, columnDefault='null', isNullable='YES', dataType='char', characterMaximumLength=32, characterOctetLength=96, numericPrecision=0, numericScale=0, datetimePrecision=0, characterSetName='utf8', collationName='utf8_bin', columnType='char(32)', columnKey='', extra='', privileges='select,insert,update,references', columnComment='', generationExpression=''}*/
private String characterSetClient;

/**Column{tableCatalog='def', tableSchema='mysql', tableName='event', columnName='collation_connection', ordinalPosition=20, columnDefault='null', isNullable='YES', dataType='char', characterMaximumLength=32, characterOctetLength=96, numericPrecision=0, numericScale=0, datetimePrecision=0, characterSetName='utf8', collationName='utf8_bin', columnType='char(32)', columnKey='', extra='', privileges='select,insert,update,references', columnComment='', generationExpression=''}*/
private String collationConnection;

/**Column{tableCatalog='def', tableSchema='mysql', tableName='event', columnName='db_collation', ordinalPosition=21, columnDefault='null', isNullable='YES', dataType='char', characterMaximumLength=32, characterOctetLength=96, numericPrecision=0, numericScale=0, datetimePrecision=0, characterSetName='utf8', collationName='utf8_bin', columnType='char(32)', columnKey='', extra='', privileges='select,insert,update,references', columnComment='', generationExpression=''}*/
private String dbCollation;

/**Column{tableCatalog='def', tableSchema='mysql', tableName='event', columnName='body_utf8', ordinalPosition=22, columnDefault='null', isNullable='YES', dataType='longblob', characterMaximumLength=4294967295, characterOctetLength=4294967295, numericPrecision=0, numericScale=0, datetimePrecision=0, characterSetName='null', collationName='null', columnType='longblob', columnKey='', extra='', privileges='select,insert,update,references', columnComment='', generationExpression=''}*/
private String bodyUtf8;

public String getDb(){
return db;
}

public String getName(){
return name;
}

public String getBody(){
return body;
}

public String getDefiner(){
return definer;
}

public Date getExecuteAt(){
return executeAt;
}

public Integer getIntervalValue(){
return intervalValue;
}

public Date getIntervalField(){
return intervalField;
}

public Date getCreated(){
return created;
}

public Date getModified(){
return modified;
}

public Date getLastExecuted(){
return lastExecuted;
}

public Date getStarts(){
return starts;
}

public Date getEnds(){
return ends;
}

public Date getStatus(){
return status;
}

public Date getOnCompletion(){
return onCompletion;
}

public Set<String> getSqlMode(){
return sqlMode;
}

public String getComment(){
return comment;
}

public Integer getOriginator(){
return originator;
}

public String getTimeZone(){
return timeZone;
}

public String getCharacterSetClient(){
return characterSetClient;
}

public String getCollationConnection(){
return collationConnection;
}

public String getDbCollation(){
return dbCollation;
}

public String getBodyUtf8(){
return bodyUtf8;
}

}