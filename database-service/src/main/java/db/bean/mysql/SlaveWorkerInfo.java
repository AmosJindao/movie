package db.bean.mysql;


/* SELECT Id AS id, Relay_log_name AS relayLogName, Relay_log_pos AS relayLogPos, Master_log_name AS masterLogName, Master_log_pos AS masterLogPos, Checkpoint_relay_log_name AS checkpointRelayLogName, Checkpoint_relay_log_pos AS checkpointRelayLogPos, Checkpoint_master_log_name AS checkpointMasterLogName, Checkpoint_master_log_pos AS checkpointMasterLogPos, Checkpoint_seqno AS checkpointSeqno, Checkpoint_group_size AS checkpointGroupSize, Checkpoint_group_bitmap AS checkpointGroupBitmap, Channel_name AS channelName FROM mysql.slave_worker_info */
/**Worker Information
*/
public class SlaveWorkerInfo{
/**Column{tableCatalog='def', tableSchema='mysql', tableName='slave_worker_info', columnName='Id', ordinalPosition=1, columnDefault='null', isNullable='NO', dataType='int', characterMaximumLength=0, characterOctetLength=0, numericPrecision=10, numericScale=0, datetimePrecision=0, characterSetName='null', collationName='null', columnType='int(10) unsigned', columnKey='PRI', extra='', privileges='select,insert,update,references', columnComment='', generationExpression=''}*/
private Integer id;

/**Column{tableCatalog='def', tableSchema='mysql', tableName='slave_worker_info', columnName='Relay_log_name', ordinalPosition=2, columnDefault='null', isNullable='NO', dataType='text', characterMaximumLength=65535, characterOctetLength=65535, numericPrecision=0, numericScale=0, datetimePrecision=0, characterSetName='utf8', collationName='utf8_bin', columnType='text', columnKey='', extra='', privileges='select,insert,update,references', columnComment='', generationExpression=''}*/
private String relayLogName;

/**Column{tableCatalog='def', tableSchema='mysql', tableName='slave_worker_info', columnName='Relay_log_pos', ordinalPosition=3, columnDefault='null', isNullable='NO', dataType='bigint', characterMaximumLength=0, characterOctetLength=0, numericPrecision=20, numericScale=0, datetimePrecision=0, characterSetName='null', collationName='null', columnType='bigint(20) unsigned', columnKey='', extra='', privileges='select,insert,update,references', columnComment='', generationExpression=''}*/
private Long relayLogPos;

/**Column{tableCatalog='def', tableSchema='mysql', tableName='slave_worker_info', columnName='Master_log_name', ordinalPosition=4, columnDefault='null', isNullable='NO', dataType='text', characterMaximumLength=65535, characterOctetLength=65535, numericPrecision=0, numericScale=0, datetimePrecision=0, characterSetName='utf8', collationName='utf8_bin', columnType='text', columnKey='', extra='', privileges='select,insert,update,references', columnComment='', generationExpression=''}*/
private String masterLogName;

/**Column{tableCatalog='def', tableSchema='mysql', tableName='slave_worker_info', columnName='Master_log_pos', ordinalPosition=5, columnDefault='null', isNullable='NO', dataType='bigint', characterMaximumLength=0, characterOctetLength=0, numericPrecision=20, numericScale=0, datetimePrecision=0, characterSetName='null', collationName='null', columnType='bigint(20) unsigned', columnKey='', extra='', privileges='select,insert,update,references', columnComment='', generationExpression=''}*/
private Long masterLogPos;

/**Column{tableCatalog='def', tableSchema='mysql', tableName='slave_worker_info', columnName='Checkpoint_relay_log_name', ordinalPosition=6, columnDefault='null', isNullable='NO', dataType='text', characterMaximumLength=65535, characterOctetLength=65535, numericPrecision=0, numericScale=0, datetimePrecision=0, characterSetName='utf8', collationName='utf8_bin', columnType='text', columnKey='', extra='', privileges='select,insert,update,references', columnComment='', generationExpression=''}*/
private String checkpointRelayLogName;

/**Column{tableCatalog='def', tableSchema='mysql', tableName='slave_worker_info', columnName='Checkpoint_relay_log_pos', ordinalPosition=7, columnDefault='null', isNullable='NO', dataType='bigint', characterMaximumLength=0, characterOctetLength=0, numericPrecision=20, numericScale=0, datetimePrecision=0, characterSetName='null', collationName='null', columnType='bigint(20) unsigned', columnKey='', extra='', privileges='select,insert,update,references', columnComment='', generationExpression=''}*/
private Long checkpointRelayLogPos;

/**Column{tableCatalog='def', tableSchema='mysql', tableName='slave_worker_info', columnName='Checkpoint_master_log_name', ordinalPosition=8, columnDefault='null', isNullable='NO', dataType='text', characterMaximumLength=65535, characterOctetLength=65535, numericPrecision=0, numericScale=0, datetimePrecision=0, characterSetName='utf8', collationName='utf8_bin', columnType='text', columnKey='', extra='', privileges='select,insert,update,references', columnComment='', generationExpression=''}*/
private String checkpointMasterLogName;

/**Column{tableCatalog='def', tableSchema='mysql', tableName='slave_worker_info', columnName='Checkpoint_master_log_pos', ordinalPosition=9, columnDefault='null', isNullable='NO', dataType='bigint', characterMaximumLength=0, characterOctetLength=0, numericPrecision=20, numericScale=0, datetimePrecision=0, characterSetName='null', collationName='null', columnType='bigint(20) unsigned', columnKey='', extra='', privileges='select,insert,update,references', columnComment='', generationExpression=''}*/
private Long checkpointMasterLogPos;

/**Column{tableCatalog='def', tableSchema='mysql', tableName='slave_worker_info', columnName='Checkpoint_seqno', ordinalPosition=10, columnDefault='null', isNullable='NO', dataType='int', characterMaximumLength=0, characterOctetLength=0, numericPrecision=10, numericScale=0, datetimePrecision=0, characterSetName='null', collationName='null', columnType='int(10) unsigned', columnKey='', extra='', privileges='select,insert,update,references', columnComment='', generationExpression=''}*/
private Integer checkpointSeqno;

/**Column{tableCatalog='def', tableSchema='mysql', tableName='slave_worker_info', columnName='Checkpoint_group_size', ordinalPosition=11, columnDefault='null', isNullable='NO', dataType='int', characterMaximumLength=0, characterOctetLength=0, numericPrecision=10, numericScale=0, datetimePrecision=0, characterSetName='null', collationName='null', columnType='int(10) unsigned', columnKey='', extra='', privileges='select,insert,update,references', columnComment='', generationExpression=''}*/
private Integer checkpointGroupSize;

/**Column{tableCatalog='def', tableSchema='mysql', tableName='slave_worker_info', columnName='Checkpoint_group_bitmap', ordinalPosition=12, columnDefault='null', isNullable='NO', dataType='blob', characterMaximumLength=65535, characterOctetLength=65535, numericPrecision=0, numericScale=0, datetimePrecision=0, characterSetName='null', collationName='null', columnType='blob', columnKey='', extra='', privileges='select,insert,update,references', columnComment='', generationExpression=''}*/
private String checkpointGroupBitmap;

/**Column{tableCatalog='def', tableSchema='mysql', tableName='slave_worker_info', columnName='Channel_name', ordinalPosition=13, columnDefault='null', isNullable='NO', dataType='char', characterMaximumLength=64, characterOctetLength=192, numericPrecision=0, numericScale=0, datetimePrecision=0, characterSetName='utf8', collationName='utf8_general_ci', columnType='char(64)', columnKey='PRI', extra='', privileges='select,insert,update,references', columnComment='The channel on which the slave is connected to a source. Used in Multisource Replication', generationExpression=''}*/
private String channelName;

public Integer getId(){
return id;
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

public String getCheckpointRelayLogName(){
return checkpointRelayLogName;
}

public Long getCheckpointRelayLogPos(){
return checkpointRelayLogPos;
}

public String getCheckpointMasterLogName(){
return checkpointMasterLogName;
}

public Long getCheckpointMasterLogPos(){
return checkpointMasterLogPos;
}

public Integer getCheckpointSeqno(){
return checkpointSeqno;
}

public Integer getCheckpointGroupSize(){
return checkpointGroupSize;
}

public String getCheckpointGroupBitmap(){
return checkpointGroupBitmap;
}

public String getChannelName(){
return channelName;
}

}