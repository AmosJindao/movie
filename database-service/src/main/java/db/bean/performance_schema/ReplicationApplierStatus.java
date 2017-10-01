package db.bean.performance_schema;

import java.util.Date;

/**
*/
public class ReplicationApplierStatus{
/**Column{tableCatalog='def', tableSchema='performance_schema', tableName='replication_applier_status', columnName='CHANNEL_NAME', ordinalPosition=1, columnDefault='null', isNullable='NO', dataType='char', characterMaximumLength=64, characterOctetLength=192, numericPrecision=0, numericScale=0, datetimePrecision=0, characterSetName='utf8', collationName='utf8_general_ci', columnType='char(64)', columnKey='', extra='', privileges='select,insert,update,references', columnComment='', generationExpression=''}*/
private String channelName;

/**Column{tableCatalog='def', tableSchema='performance_schema', tableName='replication_applier_status', columnName='SERVICE_STATE', ordinalPosition=2, columnDefault='null', isNullable='NO', dataType='enum', characterMaximumLength=3, characterOctetLength=9, numericPrecision=0, numericScale=0, datetimePrecision=0, characterSetName='utf8', collationName='utf8_general_ci', columnType='enum('ON','OFF')', columnKey='', extra='', privileges='select,insert,update,references', columnComment='', generationExpression=''}*/
private Date serviceState;

/**Column{tableCatalog='def', tableSchema='performance_schema', tableName='replication_applier_status', columnName='REMAINING_DELAY', ordinalPosition=3, columnDefault='null', isNullable='YES', dataType='int', characterMaximumLength=0, characterOctetLength=0, numericPrecision=10, numericScale=0, datetimePrecision=0, characterSetName='null', collationName='null', columnType='int(10) unsigned', columnKey='', extra='', privileges='select,insert,update,references', columnComment='', generationExpression=''}*/
private Integer remainingDelay;

/**Column{tableCatalog='def', tableSchema='performance_schema', tableName='replication_applier_status', columnName='COUNT_TRANSACTIONS_RETRIES', ordinalPosition=4, columnDefault='null', isNullable='NO', dataType='bigint', characterMaximumLength=0, characterOctetLength=0, numericPrecision=20, numericScale=0, datetimePrecision=0, characterSetName='null', collationName='null', columnType='bigint(20) unsigned', columnKey='', extra='', privileges='select,insert,update,references', columnComment='', generationExpression=''}*/
private Long countTransactionsRetries;

public String getChannelName(){
return channelName;
}

public Date getServiceState(){
return serviceState;
}

public Integer getRemainingDelay(){
return remainingDelay;
}

public Long getCountTransactionsRetries(){
return countTransactionsRetries;
}

}