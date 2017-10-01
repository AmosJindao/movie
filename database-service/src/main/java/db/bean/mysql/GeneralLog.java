package db.bean.mysql;

import java.util.Date;

/**General log
*/
public class GeneralLog{
/**Column{tableCatalog='def', tableSchema='mysql', tableName='general_log', columnName='event_time', ordinalPosition=1, columnDefault='CURRENT_TIMESTAMP(6)', isNullable='NO', dataType='timestamp', characterMaximumLength=0, characterOctetLength=0, numericPrecision=0, numericScale=0, datetimePrecision=6, characterSetName='null', collationName='null', columnType='timestamp(6)', columnKey='', extra='on update CURRENT_TIMESTAMP(6)', privileges='select,insert,update,references', columnComment='', generationExpression=''}*/
private Date eventTime;

/**Column{tableCatalog='def', tableSchema='mysql', tableName='general_log', columnName='user_host', ordinalPosition=2, columnDefault='null', isNullable='NO', dataType='mediumtext', characterMaximumLength=16777215, characterOctetLength=16777215, numericPrecision=0, numericScale=0, datetimePrecision=0, characterSetName='utf8', collationName='utf8_general_ci', columnType='mediumtext', columnKey='', extra='', privileges='select,insert,update,references', columnComment='', generationExpression=''}*/
private String userHost;

/**Column{tableCatalog='def', tableSchema='mysql', tableName='general_log', columnName='thread_id', ordinalPosition=3, columnDefault='null', isNullable='NO', dataType='bigint', characterMaximumLength=0, characterOctetLength=0, numericPrecision=20, numericScale=0, datetimePrecision=0, characterSetName='null', collationName='null', columnType='bigint(21) unsigned', columnKey='', extra='', privileges='select,insert,update,references', columnComment='', generationExpression=''}*/
private Long threadId;

/**Column{tableCatalog='def', tableSchema='mysql', tableName='general_log', columnName='server_id', ordinalPosition=4, columnDefault='null', isNullable='NO', dataType='int', characterMaximumLength=0, characterOctetLength=0, numericPrecision=10, numericScale=0, datetimePrecision=0, characterSetName='null', collationName='null', columnType='int(10) unsigned', columnKey='', extra='', privileges='select,insert,update,references', columnComment='', generationExpression=''}*/
private Integer serverId;

/**Column{tableCatalog='def', tableSchema='mysql', tableName='general_log', columnName='command_type', ordinalPosition=5, columnDefault='null', isNullable='NO', dataType='varchar', characterMaximumLength=64, characterOctetLength=192, numericPrecision=0, numericScale=0, datetimePrecision=0, characterSetName='utf8', collationName='utf8_general_ci', columnType='varchar(64)', columnKey='', extra='', privileges='select,insert,update,references', columnComment='', generationExpression=''}*/
private String commandType;

/**Column{tableCatalog='def', tableSchema='mysql', tableName='general_log', columnName='argument', ordinalPosition=6, columnDefault='null', isNullable='NO', dataType='mediumblob', characterMaximumLength=16777215, characterOctetLength=16777215, numericPrecision=0, numericScale=0, datetimePrecision=0, characterSetName='null', collationName='null', columnType='mediumblob', columnKey='', extra='', privileges='select,insert,update,references', columnComment='', generationExpression=''}*/
private String argument;

public Date getEventTime(){
return eventTime;
}

public String getUserHost(){
return userHost;
}

public Long getThreadId(){
return threadId;
}

public Integer getServerId(){
return serverId;
}

public String getCommandType(){
return commandType;
}

public String getArgument(){
return argument;
}

}