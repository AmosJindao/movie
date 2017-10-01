package db.bean.mysql;


/**Relay Log Information
*/
public class SlaveRelayLogInfo{
/**Column{tableCatalog='def', tableSchema='mysql', tableName='slave_relay_log_info', columnName='Number_of_lines', ordinalPosition=1, columnDefault='null', isNullable='NO', dataType='int', characterMaximumLength=0, characterOctetLength=0, numericPrecision=10, numericScale=0, datetimePrecision=0, characterSetName='null', collationName='null', columnType='int(10) unsigned', columnKey='', extra='', privileges='select,insert,update,references', columnComment='Number of lines in the file or rows in the table. Used to version table definitions.', generationExpression=''}*/
private Integer numberOfLines;

/**Column{tableCatalog='def', tableSchema='mysql', tableName='slave_relay_log_info', columnName='Relay_log_name', ordinalPosition=2, columnDefault='null', isNullable='NO', dataType='text', characterMaximumLength=65535, characterOctetLength=65535, numericPrecision=0, numericScale=0, datetimePrecision=0, characterSetName='utf8', collationName='utf8_bin', columnType='text', columnKey='', extra='', privileges='select,insert,update,references', columnComment='The name of the current relay log file.', generationExpression=''}*/
private String relayLogName;

/**Column{tableCatalog='def', tableSchema='mysql', tableName='slave_relay_log_info', columnName='Relay_log_pos', ordinalPosition=3, columnDefault='null', isNullable='NO', dataType='bigint', characterMaximumLength=0, characterOctetLength=0, numericPrecision=20, numericScale=0, datetimePrecision=0, characterSetName='null', collationName='null', columnType='bigint(20) unsigned', columnKey='', extra='', privileges='select,insert,update,references', columnComment='The relay log position of the last executed event.', generationExpression=''}*/
private Long relayLogPos;

/**Column{tableCatalog='def', tableSchema='mysql', tableName='slave_relay_log_info', columnName='Master_log_name', ordinalPosition=4, columnDefault='null', isNullable='NO', dataType='text', characterMaximumLength=65535, characterOctetLength=65535, numericPrecision=0, numericScale=0, datetimePrecision=0, characterSetName='utf8', collationName='utf8_bin', columnType='text', columnKey='', extra='', privileges='select,insert,update,references', columnComment='The name of the master binary log file from which the events in the relay log file were read.', generationExpression=''}*/
private String masterLogName;

/**Column{tableCatalog='def', tableSchema='mysql', tableName='slave_relay_log_info', columnName='Master_log_pos', ordinalPosition=5, columnDefault='null', isNullable='NO', dataType='bigint', characterMaximumLength=0, characterOctetLength=0, numericPrecision=20, numericScale=0, datetimePrecision=0, characterSetName='null', collationName='null', columnType='bigint(20) unsigned', columnKey='', extra='', privileges='select,insert,update,references', columnComment='The master log position of the last executed event.', generationExpression=''}*/
private Long masterLogPos;

/**Column{tableCatalog='def', tableSchema='mysql', tableName='slave_relay_log_info', columnName='Sql_delay', ordinalPosition=6, columnDefault='null', isNullable='NO', dataType='int', characterMaximumLength=0, characterOctetLength=0, numericPrecision=10, numericScale=0, datetimePrecision=0, characterSetName='null', collationName='null', columnType='int(11)', columnKey='', extra='', privileges='select,insert,update,references', columnComment='The number of seconds that the slave must lag behind the master.', generationExpression=''}*/
private Integer sqlDelay;

/**Column{tableCatalog='def', tableSchema='mysql', tableName='slave_relay_log_info', columnName='Number_of_workers', ordinalPosition=7, columnDefault='null', isNullable='NO', dataType='int', characterMaximumLength=0, characterOctetLength=0, numericPrecision=10, numericScale=0, datetimePrecision=0, characterSetName='null', collationName='null', columnType='int(10) unsigned', columnKey='', extra='', privileges='select,insert,update,references', columnComment='', generationExpression=''}*/
private Integer numberOfWorkers;

/**Column{tableCatalog='def', tableSchema='mysql', tableName='slave_relay_log_info', columnName='Id', ordinalPosition=8, columnDefault='null', isNullable='NO', dataType='int', characterMaximumLength=0, characterOctetLength=0, numericPrecision=10, numericScale=0, datetimePrecision=0, characterSetName='null', collationName='null', columnType='int(10) unsigned', columnKey='', extra='', privileges='select,insert,update,references', columnComment='Internal Id that uniquely identifies this record.', generationExpression=''}*/
private Integer id;

/**Column{tableCatalog='def', tableSchema='mysql', tableName='slave_relay_log_info', columnName='Channel_name', ordinalPosition=9, columnDefault='null', isNullable='NO', dataType='char', characterMaximumLength=64, characterOctetLength=192, numericPrecision=0, numericScale=0, datetimePrecision=0, characterSetName='utf8', collationName='utf8_general_ci', columnType='char(64)', columnKey='PRI', extra='', privileges='select,insert,update,references', columnComment='The channel on which the slave is connected to a source. Used in Multisource Replication', generationExpression=''}*/
private String channelName;

public Integer getNumberOfLines(){
return numberOfLines;
}

public String getRelayLogName(){
return relayLogName;
}

public Long getRelayLogPos(){
return relayLogPos;
}

public String getMasterLogName(){
return masterLogName;
}

public Long getMasterLogPos(){
return masterLogPos;
}

public Integer getSqlDelay(){
return sqlDelay;
}

public Integer getNumberOfWorkers(){
return numberOfWorkers;
}

public Integer getId(){
return id;
}

public String getChannelName(){
return channelName;
}

}