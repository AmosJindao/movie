package db.bean.performance_schema;

import java.util.Date;

/* SELECT EVENT_NAME AS eventName, OBJECT_INSTANCE_BEGIN AS objectInstanceBegin, THREAD_ID AS threadId, SOCKET_ID AS socketId, IP AS ip, PORT AS port, STATE AS state FROM performance_schema.socket_instances */
/**
*/
public class SocketInstances{
/**Column{tableCatalog='def', tableSchema='performance_schema', tableName='socket_instances', columnName='EVENT_NAME', ordinalPosition=1, columnDefault='null', isNullable='NO', dataType='varchar', characterMaximumLength=128, characterOctetLength=384, numericPrecision=0, numericScale=0, datetimePrecision=0, characterSetName='utf8', collationName='utf8_general_ci', columnType='varchar(128)', columnKey='', extra='', privileges='select,insert,update,references', columnComment='', generationExpression=''}*/
private String eventName;

/**Column{tableCatalog='def', tableSchema='performance_schema', tableName='socket_instances', columnName='OBJECT_INSTANCE_BEGIN', ordinalPosition=2, columnDefault='null', isNullable='NO', dataType='bigint', characterMaximumLength=0, characterOctetLength=0, numericPrecision=20, numericScale=0, datetimePrecision=0, characterSetName='null', collationName='null', columnType='bigint(20) unsigned', columnKey='', extra='', privileges='select,insert,update,references', columnComment='', generationExpression=''}*/
private Long objectInstanceBegin;

/**Column{tableCatalog='def', tableSchema='performance_schema', tableName='socket_instances', columnName='THREAD_ID', ordinalPosition=3, columnDefault='null', isNullable='YES', dataType='bigint', characterMaximumLength=0, characterOctetLength=0, numericPrecision=20, numericScale=0, datetimePrecision=0, characterSetName='null', collationName='null', columnType='bigint(20) unsigned', columnKey='', extra='', privileges='select,insert,update,references', columnComment='', generationExpression=''}*/
private Long threadId;

/**Column{tableCatalog='def', tableSchema='performance_schema', tableName='socket_instances', columnName='SOCKET_ID', ordinalPosition=4, columnDefault='null', isNullable='NO', dataType='int', characterMaximumLength=0, characterOctetLength=0, numericPrecision=10, numericScale=0, datetimePrecision=0, characterSetName='null', collationName='null', columnType='int(11)', columnKey='', extra='', privileges='select,insert,update,references', columnComment='', generationExpression=''}*/
private Integer socketId;

/**Column{tableCatalog='def', tableSchema='performance_schema', tableName='socket_instances', columnName='IP', ordinalPosition=5, columnDefault='null', isNullable='NO', dataType='varchar', characterMaximumLength=64, characterOctetLength=192, numericPrecision=0, numericScale=0, datetimePrecision=0, characterSetName='utf8', collationName='utf8_general_ci', columnType='varchar(64)', columnKey='', extra='', privileges='select,insert,update,references', columnComment='', generationExpression=''}*/
private String ip;

/**Column{tableCatalog='def', tableSchema='performance_schema', tableName='socket_instances', columnName='PORT', ordinalPosition=6, columnDefault='null', isNullable='NO', dataType='int', characterMaximumLength=0, characterOctetLength=0, numericPrecision=10, numericScale=0, datetimePrecision=0, characterSetName='null', collationName='null', columnType='int(11)', columnKey='', extra='', privileges='select,insert,update,references', columnComment='', generationExpression=''}*/
private Integer port;

/**Column{tableCatalog='def', tableSchema='performance_schema', tableName='socket_instances', columnName='STATE', ordinalPosition=7, columnDefault='null', isNullable='NO', dataType='enum', characterMaximumLength=6, characterOctetLength=18, numericPrecision=0, numericScale=0, datetimePrecision=0, characterSetName='utf8', collationName='utf8_general_ci', columnType='enum('IDLE','ACTIVE')', columnKey='', extra='', privileges='select,insert,update,references', columnComment='', generationExpression=''}*/
private Date state;

public String getEventName(){
return eventName;
}

public Long getObjectInstanceBegin(){
return objectInstanceBegin;
}

public Long getThreadId(){
return threadId;
}

public Integer getSocketId(){
return socketId;
}

public String getIp(){
return ip;
}

public Integer getPort(){
return port;
}

public Date getState(){
return state;
}

}