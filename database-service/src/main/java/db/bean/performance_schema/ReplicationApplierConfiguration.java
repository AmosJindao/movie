package db.bean.performance_schema;


/**
*/
public class ReplicationApplierConfiguration{
/**Column{tableCatalog='def', tableSchema='performance_schema', tableName='replication_applier_configuration', columnName='CHANNEL_NAME', ordinalPosition=1, columnDefault='null', isNullable='NO', dataType='char', characterMaximumLength=64, characterOctetLength=192, numericPrecision=0, numericScale=0, datetimePrecision=0, characterSetName='utf8', collationName='utf8_general_ci', columnType='char(64)', columnKey='', extra='', privileges='select,insert,update,references', columnComment='', generationExpression=''}*/
private String channelName;

/**Column{tableCatalog='def', tableSchema='performance_schema', tableName='replication_applier_configuration', columnName='DESIRED_DELAY', ordinalPosition=2, columnDefault='null', isNullable='NO', dataType='int', characterMaximumLength=0, characterOctetLength=0, numericPrecision=10, numericScale=0, datetimePrecision=0, characterSetName='null', collationName='null', columnType='int(11)', columnKey='', extra='', privileges='select,insert,update,references', columnComment='', generationExpression=''}*/
private Integer desiredDelay;

public String getChannelName(){
return channelName;
}

public Integer getDesiredDelay(){
return desiredDelay;
}

}