package db.bean.performance_schema;

import java.util.Date;

/**
*/
public class ReplicationApplierStatusByWorker{
/**Column{tableCatalog='def', tableSchema='performance_schema', tableName='replication_applier_status_by_worker', columnName='CHANNEL_NAME', ordinalPosition=1, columnDefault='null', isNullable='NO', dataType='char', characterMaximumLength=64, characterOctetLength=192, numericPrecision=0, numericScale=0, datetimePrecision=0, characterSetName='utf8', collationName='utf8_general_ci', columnType='char(64)', columnKey='', extra='', privileges='select,insert,update,references', columnComment='', generationExpression=''}*/
private String channelName;

/**Column{tableCatalog='def', tableSchema='performance_schema', tableName='replication_applier_status_by_worker', columnName='WORKER_ID', ordinalPosition=2, columnDefault='null', isNullable='NO', dataType='bigint', characterMaximumLength=0, characterOctetLength=0, numericPrecision=20, numericScale=0, datetimePrecision=0, characterSetName='null', collationName='null', columnType='bigint(20) unsigned', columnKey='', extra='', privileges='select,insert,update,references', columnComment='', generationExpression=''}*/
private Long workerId;

/**Column{tableCatalog='def', tableSchema='performance_schema', tableName='replication_applier_status_by_worker', columnName='THREAD_ID', ordinalPosition=3, columnDefault='null', isNullable='YES', dataType='bigint', characterMaximumLength=0, characterOctetLength=0, numericPrecision=20, numericScale=0, datetimePrecision=0, characterSetName='null', collationName='null', columnType='bigint(20) unsigned', columnKey='', extra='', privileges='select,insert,update,references', columnComment='', generationExpression=''}*/
private Long threadId;

/**Column{tableCatalog='def', tableSchema='performance_schema', tableName='replication_applier_status_by_worker', columnName='SERVICE_STATE', ordinalPosition=4, columnDefault='null', isNullable='NO', dataType='enum', characterMaximumLength=3, characterOctetLength=9, numericPrecision=0, numericScale=0, datetimePrecision=0, characterSetName='utf8', collationName='utf8_general_ci', columnType='enum('ON','OFF')', columnKey='', extra='', privileges='select,insert,update,references', columnComment='', generationExpression=''}*/
private Date serviceState;

/**Column{tableCatalog='def', tableSchema='performance_schema', tableName='replication_applier_status_by_worker', columnName='LAST_SEEN_TRANSACTION', ordinalPosition=5, columnDefault='null', isNullable='NO', dataType='char', characterMaximumLength=57, characterOctetLength=171, numericPrecision=0, numericScale=0, datetimePrecision=0, characterSetName='utf8', collationName='utf8_general_ci', columnType='char(57)', columnKey='', extra='', privileges='select,insert,update,references', columnComment='', generationExpression=''}*/
private String lastSeenTransaction;

/**Column{tableCatalog='def', tableSchema='performance_schema', tableName='replication_applier_status_by_worker', columnName='LAST_ERROR_NUMBER', ordinalPosition=6, columnDefault='null', isNullable='NO', dataType='int', characterMaximumLength=0, characterOctetLength=0, numericPrecision=10, numericScale=0, datetimePrecision=0, characterSetName='null', collationName='null', columnType='int(11)', columnKey='', extra='', privileges='select,insert,update,references', columnComment='', generationExpression=''}*/
private Integer lastErrorNumber;

/**Column{tableCatalog='def', tableSchema='performance_schema', tableName='replication_applier_status_by_worker', columnName='LAST_ERROR_MESSAGE', ordinalPosition=7, columnDefault='null', isNullable='NO', dataType='varchar', characterMaximumLength=1024, characterOctetLength=3072, numericPrecision=0, numericScale=0, datetimePrecision=0, characterSetName='utf8', collationName='utf8_general_ci', columnType='varchar(1024)', columnKey='', extra='', privileges='select,insert,update,references', columnComment='', generationExpression=''}*/
private String lastErrorMessage;

/**Column{tableCatalog='def', tableSchema='performance_schema', tableName='replication_applier_status_by_worker', columnName='LAST_ERROR_TIMESTAMP', ordinalPosition=8, columnDefault='CURRENT_TIMESTAMP', isNullable='NO', dataType='timestamp', characterMaximumLength=0, characterOctetLength=0, numericPrecision=0, numericScale=0, datetimePrecision=0, characterSetName='null', collationName='null', columnType='timestamp', columnKey='', extra='on update CURRENT_TIMESTAMP', privileges='select,insert,update,references', columnComment='', generationExpression=''}*/
private Date lastErrorTimestamp;

public String getChannelName(){
return channelName;
}

public Long getWorkerId(){
return workerId;
}

public Long getThreadId(){
return threadId;
}

public Date getServiceState(){
return serviceState;
}

public String getLastSeenTransaction(){
return lastSeenTransaction;
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