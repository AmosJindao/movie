package db.bean.performance_schema;

import java.util.Date;

/**
*/
public class Threads{
/**Column{tableCatalog='def', tableSchema='performance_schema', tableName='threads', columnName='THREAD_ID', ordinalPosition=1, columnDefault='null', isNullable='NO', dataType='bigint', characterMaximumLength=0, characterOctetLength=0, numericPrecision=20, numericScale=0, datetimePrecision=0, characterSetName='null', collationName='null', columnType='bigint(20) unsigned', columnKey='', extra='', privileges='select,insert,update,references', columnComment='', generationExpression=''}*/
private Long threadId;

/**Column{tableCatalog='def', tableSchema='performance_schema', tableName='threads', columnName='NAME', ordinalPosition=2, columnDefault='null', isNullable='NO', dataType='varchar', characterMaximumLength=128, characterOctetLength=384, numericPrecision=0, numericScale=0, datetimePrecision=0, characterSetName='utf8', collationName='utf8_general_ci', columnType='varchar(128)', columnKey='', extra='', privileges='select,insert,update,references', columnComment='', generationExpression=''}*/
private String name;

/**Column{tableCatalog='def', tableSchema='performance_schema', tableName='threads', columnName='TYPE', ordinalPosition=3, columnDefault='null', isNullable='NO', dataType='varchar', characterMaximumLength=10, characterOctetLength=30, numericPrecision=0, numericScale=0, datetimePrecision=0, characterSetName='utf8', collationName='utf8_general_ci', columnType='varchar(10)', columnKey='', extra='', privileges='select,insert,update,references', columnComment='', generationExpression=''}*/
private String type;

/**Column{tableCatalog='def', tableSchema='performance_schema', tableName='threads', columnName='PROCESSLIST_ID', ordinalPosition=4, columnDefault='null', isNullable='YES', dataType='bigint', characterMaximumLength=0, characterOctetLength=0, numericPrecision=20, numericScale=0, datetimePrecision=0, characterSetName='null', collationName='null', columnType='bigint(20) unsigned', columnKey='', extra='', privileges='select,insert,update,references', columnComment='', generationExpression=''}*/
private Long processlistId;

/**Column{tableCatalog='def', tableSchema='performance_schema', tableName='threads', columnName='PROCESSLIST_USER', ordinalPosition=5, columnDefault='null', isNullable='YES', dataType='varchar', characterMaximumLength=32, characterOctetLength=96, numericPrecision=0, numericScale=0, datetimePrecision=0, characterSetName='utf8', collationName='utf8_general_ci', columnType='varchar(32)', columnKey='', extra='', privileges='select,insert,update,references', columnComment='', generationExpression=''}*/
private String processlistUser;

/**Column{tableCatalog='def', tableSchema='performance_schema', tableName='threads', columnName='PROCESSLIST_HOST', ordinalPosition=6, columnDefault='null', isNullable='YES', dataType='varchar', characterMaximumLength=60, characterOctetLength=180, numericPrecision=0, numericScale=0, datetimePrecision=0, characterSetName='utf8', collationName='utf8_general_ci', columnType='varchar(60)', columnKey='', extra='', privileges='select,insert,update,references', columnComment='', generationExpression=''}*/
private String processlistHost;

/**Column{tableCatalog='def', tableSchema='performance_schema', tableName='threads', columnName='PROCESSLIST_DB', ordinalPosition=7, columnDefault='null', isNullable='YES', dataType='varchar', characterMaximumLength=64, characterOctetLength=192, numericPrecision=0, numericScale=0, datetimePrecision=0, characterSetName='utf8', collationName='utf8_general_ci', columnType='varchar(64)', columnKey='', extra='', privileges='select,insert,update,references', columnComment='', generationExpression=''}*/
private String processlistDb;

/**Column{tableCatalog='def', tableSchema='performance_schema', tableName='threads', columnName='PROCESSLIST_COMMAND', ordinalPosition=8, columnDefault='null', isNullable='YES', dataType='varchar', characterMaximumLength=16, characterOctetLength=48, numericPrecision=0, numericScale=0, datetimePrecision=0, characterSetName='utf8', collationName='utf8_general_ci', columnType='varchar(16)', columnKey='', extra='', privileges='select,insert,update,references', columnComment='', generationExpression=''}*/
private String processlistCommand;

/**Column{tableCatalog='def', tableSchema='performance_schema', tableName='threads', columnName='PROCESSLIST_TIME', ordinalPosition=9, columnDefault='null', isNullable='YES', dataType='bigint', characterMaximumLength=0, characterOctetLength=0, numericPrecision=19, numericScale=0, datetimePrecision=0, characterSetName='null', collationName='null', columnType='bigint(20)', columnKey='', extra='', privileges='select,insert,update,references', columnComment='', generationExpression=''}*/
private Long processlistTime;

/**Column{tableCatalog='def', tableSchema='performance_schema', tableName='threads', columnName='PROCESSLIST_STATE', ordinalPosition=10, columnDefault='null', isNullable='YES', dataType='varchar', characterMaximumLength=64, characterOctetLength=192, numericPrecision=0, numericScale=0, datetimePrecision=0, characterSetName='utf8', collationName='utf8_general_ci', columnType='varchar(64)', columnKey='', extra='', privileges='select,insert,update,references', columnComment='', generationExpression=''}*/
private String processlistState;

/**Column{tableCatalog='def', tableSchema='performance_schema', tableName='threads', columnName='PROCESSLIST_INFO', ordinalPosition=11, columnDefault='null', isNullable='YES', dataType='longtext', characterMaximumLength=4294967295, characterOctetLength=4294967295, numericPrecision=0, numericScale=0, datetimePrecision=0, characterSetName='utf8', collationName='utf8_general_ci', columnType='longtext', columnKey='', extra='', privileges='select,insert,update,references', columnComment='', generationExpression=''}*/
private String processlistInfo;

/**Column{tableCatalog='def', tableSchema='performance_schema', tableName='threads', columnName='PARENT_THREAD_ID', ordinalPosition=12, columnDefault='null', isNullable='YES', dataType='bigint', characterMaximumLength=0, characterOctetLength=0, numericPrecision=20, numericScale=0, datetimePrecision=0, characterSetName='null', collationName='null', columnType='bigint(20) unsigned', columnKey='', extra='', privileges='select,insert,update,references', columnComment='', generationExpression=''}*/
private Long parentThreadId;

/**Column{tableCatalog='def', tableSchema='performance_schema', tableName='threads', columnName='ROLE', ordinalPosition=13, columnDefault='null', isNullable='YES', dataType='varchar', characterMaximumLength=64, characterOctetLength=192, numericPrecision=0, numericScale=0, datetimePrecision=0, characterSetName='utf8', collationName='utf8_general_ci', columnType='varchar(64)', columnKey='', extra='', privileges='select,insert,update,references', columnComment='', generationExpression=''}*/
private String role;

/**Column{tableCatalog='def', tableSchema='performance_schema', tableName='threads', columnName='INSTRUMENTED', ordinalPosition=14, columnDefault='null', isNullable='NO', dataType='enum', characterMaximumLength=3, characterOctetLength=9, numericPrecision=0, numericScale=0, datetimePrecision=0, characterSetName='utf8', collationName='utf8_general_ci', columnType='enum('YES','NO')', columnKey='', extra='', privileges='select,insert,update,references', columnComment='', generationExpression=''}*/
private Date instrumented;

/**Column{tableCatalog='def', tableSchema='performance_schema', tableName='threads', columnName='HISTORY', ordinalPosition=15, columnDefault='null', isNullable='NO', dataType='enum', characterMaximumLength=3, characterOctetLength=9, numericPrecision=0, numericScale=0, datetimePrecision=0, characterSetName='utf8', collationName='utf8_general_ci', columnType='enum('YES','NO')', columnKey='', extra='', privileges='select,insert,update,references', columnComment='', generationExpression=''}*/
private Date history;

/**Column{tableCatalog='def', tableSchema='performance_schema', tableName='threads', columnName='CONNECTION_TYPE', ordinalPosition=16, columnDefault='null', isNullable='YES', dataType='varchar', characterMaximumLength=16, characterOctetLength=48, numericPrecision=0, numericScale=0, datetimePrecision=0, characterSetName='utf8', collationName='utf8_general_ci', columnType='varchar(16)', columnKey='', extra='', privileges='select,insert,update,references', columnComment='', generationExpression=''}*/
private String connectionType;

/**Column{tableCatalog='def', tableSchema='performance_schema', tableName='threads', columnName='THREAD_OS_ID', ordinalPosition=17, columnDefault='null', isNullable='YES', dataType='bigint', characterMaximumLength=0, characterOctetLength=0, numericPrecision=20, numericScale=0, datetimePrecision=0, characterSetName='null', collationName='null', columnType='bigint(20) unsigned', columnKey='', extra='', privileges='select,insert,update,references', columnComment='', generationExpression=''}*/
private Long threadOsId;

public Long getThreadId(){
return threadId;
}

public String getName(){
return name;
}

public String getType(){
return type;
}

public Long getProcesslistId(){
return processlistId;
}

public String getProcesslistUser(){
return processlistUser;
}

public String getProcesslistHost(){
return processlistHost;
}

public String getProcesslistDb(){
return processlistDb;
}

public String getProcesslistCommand(){
return processlistCommand;
}

public Long getProcesslistTime(){
return processlistTime;
}

public String getProcesslistState(){
return processlistState;
}

public String getProcesslistInfo(){
return processlistInfo;
}

public Long getParentThreadId(){
return parentThreadId;
}

public String getRole(){
return role;
}

public Date getInstrumented(){
return instrumented;
}

public Date getHistory(){
return history;
}

public String getConnectionType(){
return connectionType;
}

public Long getThreadOsId(){
return threadOsId;
}

}