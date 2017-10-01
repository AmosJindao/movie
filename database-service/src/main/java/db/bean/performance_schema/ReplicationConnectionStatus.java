package db.bean.performance_schema;

import java.util.Date;

/**
*/
public class ReplicationConnectionStatus{
/**Column{tableCatalog='def', tableSchema='performance_schema', tableName='replication_connection_status', columnName='CHANNEL_NAME', ordinalPosition=1, columnDefault='null', isNullable='NO', dataType='char', characterMaximumLength=64, characterOctetLength=192, numericPrecision=0, numericScale=0, datetimePrecision=0, characterSetName='utf8', collationName='utf8_general_ci', columnType='char(64)', columnKey='', extra='', privileges='select,insert,update,references', columnComment='', generationExpression=''}*/
private String channelName;

/**Column{tableCatalog='def', tableSchema='performance_schema', tableName='replication_connection_status', columnName='GROUP_NAME', ordinalPosition=2, columnDefault='null', isNullable='NO', dataType='char', characterMaximumLength=36, characterOctetLength=108, numericPrecision=0, numericScale=0, datetimePrecision=0, characterSetName='utf8', collationName='utf8_bin', columnType='char(36)', columnKey='', extra='', privileges='select,insert,update,references', columnComment='', generationExpression=''}*/
private String groupName;

/**Column{tableCatalog='def', tableSchema='performance_schema', tableName='replication_connection_status', columnName='SOURCE_UUID', ordinalPosition=3, columnDefault='null', isNullable='NO', dataType='char', characterMaximumLength=36, characterOctetLength=108, numericPrecision=0, numericScale=0, datetimePrecision=0, characterSetName='utf8', collationName='utf8_bin', columnType='char(36)', columnKey='', extra='', privileges='select,insert,update,references', columnComment='', generationExpression=''}*/
private String sourceUuid;

/**Column{tableCatalog='def', tableSchema='performance_schema', tableName='replication_connection_status', columnName='THREAD_ID', ordinalPosition=4, columnDefault='null', isNullable='YES', dataType='bigint', characterMaximumLength=0, characterOctetLength=0, numericPrecision=20, numericScale=0, datetimePrecision=0, characterSetName='null', collationName='null', columnType='bigint(20) unsigned', columnKey='', extra='', privileges='select,insert,update,references', columnComment='', generationExpression=''}*/
private Long threadId;

/**Column{tableCatalog='def', tableSchema='performance_schema', tableName='replication_connection_status', columnName='SERVICE_STATE', ordinalPosition=5, columnDefault='null', isNullable='NO', dataType='enum', characterMaximumLength=10, characterOctetLength=30, numericPrecision=0, numericScale=0, datetimePrecision=0, characterSetName='utf8', collationName='utf8_general_ci', columnType='enum('ON','OFF','CONNECTING')', columnKey='', extra='', privileges='select,insert,update,references', columnComment='', generationExpression=''}*/
private Date serviceState;

/**Column{tableCatalog='def', tableSchema='performance_schema', tableName='replication_connection_status', columnName='COUNT_RECEIVED_HEARTBEATS', ordinalPosition=6, columnDefault='0', isNullable='NO', dataType='bigint', characterMaximumLength=0, characterOctetLength=0, numericPrecision=20, numericScale=0, datetimePrecision=0, characterSetName='null', collationName='null', columnType='bigint(20) unsigned', columnKey='', extra='', privileges='select,insert,update,references', columnComment='', generationExpression=''}*/
private Long countReceivedHeartbeats;

/**Column{tableCatalog='def', tableSchema='performance_schema', tableName='replication_connection_status', columnName='LAST_HEARTBEAT_TIMESTAMP', ordinalPosition=7, columnDefault='CURRENT_TIMESTAMP', isNullable='NO', dataType='timestamp', characterMaximumLength=0, characterOctetLength=0, numericPrecision=0, numericScale=0, datetimePrecision=0, characterSetName='null', collationName='null', columnType='timestamp', columnKey='', extra='on update CURRENT_TIMESTAMP', privileges='select,insert,update,references', columnComment='Shows when the most recent heartbeat signal was received.', generationExpression=''}*/
private Date lastHeartbeatTimestamp;

/**Column{tableCatalog='def', tableSchema='performance_schema', tableName='replication_connection_status', columnName='RECEIVED_TRANSACTION_SET', ordinalPosition=8, columnDefault='null', isNullable='NO', dataType='longtext', characterMaximumLength=4294967295, characterOctetLength=4294967295, numericPrecision=0, numericScale=0, datetimePrecision=0, characterSetName='utf8', collationName='utf8_general_ci', columnType='longtext', columnKey='', extra='', privileges='select,insert,update,references', columnComment='', generationExpression=''}*/
private String receivedTransactionSet;

/**Column{tableCatalog='def', tableSchema='performance_schema', tableName='replication_connection_status', columnName='LAST_ERROR_NUMBER', ordinalPosition=9, columnDefault='null', isNullable='NO', dataType='int', characterMaximumLength=0, characterOctetLength=0, numericPrecision=10, numericScale=0, datetimePrecision=0, characterSetName='null', collationName='null', columnType='int(11)', columnKey='', extra='', privileges='select,insert,update,references', columnComment='', generationExpression=''}*/
private Integer lastErrorNumber;

/**Column{tableCatalog='def', tableSchema='performance_schema', tableName='replication_connection_status', columnName='LAST_ERROR_MESSAGE', ordinalPosition=10, columnDefault='null', isNullable='NO', dataType='varchar', characterMaximumLength=1024, characterOctetLength=3072, numericPrecision=0, numericScale=0, datetimePrecision=0, characterSetName='utf8', collationName='utf8_general_ci', columnType='varchar(1024)', columnKey='', extra='', privileges='select,insert,update,references', columnComment='', generationExpression=''}*/
private String lastErrorMessage;

/**Column{tableCatalog='def', tableSchema='performance_schema', tableName='replication_connection_status', columnName='LAST_ERROR_TIMESTAMP', ordinalPosition=11, columnDefault='0000-00-00 00:00:00', isNullable='NO', dataType='timestamp', characterMaximumLength=0, characterOctetLength=0, numericPrecision=0, numericScale=0, datetimePrecision=0, characterSetName='null', collationName='null', columnType='timestamp', columnKey='', extra='', privileges='select,insert,update,references', columnComment='', generationExpression=''}*/
private Date lastErrorTimestamp;

public String getChannelName(){
return channelName;
}

public String getGroupName(){
return groupName;
}

public String getSourceUuid(){
return sourceUuid;
}

public Long getThreadId(){
return threadId;
}

public Date getServiceState(){
return serviceState;
}

public Long getCountReceivedHeartbeats(){
return countReceivedHeartbeats;
}

public Date getLastHeartbeatTimestamp(){
return lastHeartbeatTimestamp;
}

public String getReceivedTransactionSet(){
return receivedTransactionSet;
}

public Integer getLastErrorNumber(){
return lastErrorNumber;
}

public String getLastErrorMessage(){
return lastErrorMessage;
}

public Date getLastErrorTimestamp(){
return lastErrorTimestamp;
}

}