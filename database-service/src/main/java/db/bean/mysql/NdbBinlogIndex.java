package db.bean.mysql;


/* SELECT Position AS position, File AS file, epoch AS epoch, inserts AS inserts, updates AS updates, deletes AS deletes, schemaops AS schemaops, orig_server_id AS origServerId, orig_epoch AS origEpoch, gci AS gci, next_position AS nextPosition, next_file AS nextFile FROM mysql.ndb_binlog_index */
/**
*/
public class NdbBinlogIndex{
/**Column{tableCatalog='def', tableSchema='mysql', tableName='ndb_binlog_index', columnName='Position', ordinalPosition=1, columnDefault='null', isNullable='NO', dataType='bigint', characterMaximumLength=0, characterOctetLength=0, numericPrecision=20, numericScale=0, datetimePrecision=0, characterSetName='null', collationName='null', columnType='bigint(20) unsigned', columnKey='', extra='', privileges='select,insert,update,references', columnComment='', generationExpression=''}*/
private Long position;

/**Column{tableCatalog='def', tableSchema='mysql', tableName='ndb_binlog_index', columnName='File', ordinalPosition=2, columnDefault='null', isNullable='NO', dataType='varchar', characterMaximumLength=255, characterOctetLength=255, numericPrecision=0, numericScale=0, datetimePrecision=0, characterSetName='latin1', collationName='latin1_swedish_ci', columnType='varchar(255)', columnKey='', extra='', privileges='select,insert,update,references', columnComment='', generationExpression=''}*/
private String file;

/**Column{tableCatalog='def', tableSchema='mysql', tableName='ndb_binlog_index', columnName='epoch', ordinalPosition=3, columnDefault='null', isNullable='NO', dataType='bigint', characterMaximumLength=0, characterOctetLength=0, numericPrecision=20, numericScale=0, datetimePrecision=0, characterSetName='null', collationName='null', columnType='bigint(20) unsigned', columnKey='PRI', extra='', privileges='select,insert,update,references', columnComment='', generationExpression=''}*/
private Long epoch;

/**Column{tableCatalog='def', tableSchema='mysql', tableName='ndb_binlog_index', columnName='inserts', ordinalPosition=4, columnDefault='null', isNullable='NO', dataType='int', characterMaximumLength=0, characterOctetLength=0, numericPrecision=10, numericScale=0, datetimePrecision=0, characterSetName='null', collationName='null', columnType='int(10) unsigned', columnKey='', extra='', privileges='select,insert,update,references', columnComment='', generationExpression=''}*/
private Integer inserts;

/**Column{tableCatalog='def', tableSchema='mysql', tableName='ndb_binlog_index', columnName='updates', ordinalPosition=5, columnDefault='null', isNullable='NO', dataType='int', characterMaximumLength=0, characterOctetLength=0, numericPrecision=10, numericScale=0, datetimePrecision=0, characterSetName='null', collationName='null', columnType='int(10) unsigned', columnKey='', extra='', privileges='select,insert,update,references', columnComment='', generationExpression=''}*/
private Integer updates;

/**Column{tableCatalog='def', tableSchema='mysql', tableName='ndb_binlog_index', columnName='deletes', ordinalPosition=6, columnDefault='null', isNullable='NO', dataType='int', characterMaximumLength=0, characterOctetLength=0, numericPrecision=10, numericScale=0, datetimePrecision=0, characterSetName='null', collationName='null', columnType='int(10) unsigned', columnKey='', extra='', privileges='select,insert,update,references', columnComment='', generationExpression=''}*/
private Integer deletes;

/**Column{tableCatalog='def', tableSchema='mysql', tableName='ndb_binlog_index', columnName='schemaops', ordinalPosition=7, columnDefault='null', isNullable='NO', dataType='int', characterMaximumLength=0, characterOctetLength=0, numericPrecision=10, numericScale=0, datetimePrecision=0, characterSetName='null', collationName='null', columnType='int(10) unsigned', columnKey='', extra='', privileges='select,insert,update,references', columnComment='', generationExpression=''}*/
private Integer schemaops;

/**Column{tableCatalog='def', tableSchema='mysql', tableName='ndb_binlog_index', columnName='orig_server_id', ordinalPosition=8, columnDefault='null', isNullable='NO', dataType='int', characterMaximumLength=0, characterOctetLength=0, numericPrecision=10, numericScale=0, datetimePrecision=0, characterSetName='null', collationName='null', columnType='int(10) unsigned', columnKey='PRI', extra='', privileges='select,insert,update,references', columnComment='', generationExpression=''}*/
private Integer origServerId;

/**Column{tableCatalog='def', tableSchema='mysql', tableName='ndb_binlog_index', columnName='orig_epoch', ordinalPosition=9, columnDefault='null', isNullable='NO', dataType='bigint', characterMaximumLength=0, characterOctetLength=0, numericPrecision=20, numericScale=0, datetimePrecision=0, characterSetName='null', collationName='null', columnType='bigint(20) unsigned', columnKey='PRI', extra='', privileges='select,insert,update,references', columnComment='', generationExpression=''}*/
private Long origEpoch;

/**Column{tableCatalog='def', tableSchema='mysql', tableName='ndb_binlog_index', columnName='gci', ordinalPosition=10, columnDefault='null', isNullable='NO', dataType='int', characterMaximumLength=0, characterOctetLength=0, numericPrecision=10, numericScale=0, datetimePrecision=0, characterSetName='null', collationName='null', columnType='int(10) unsigned', columnKey='', extra='', privileges='select,insert,update,references', columnComment='', generationExpression=''}*/
private Integer gci;

/**Column{tableCatalog='def', tableSchema='mysql', tableName='ndb_binlog_index', columnName='next_position', ordinalPosition=11, columnDefault='null', isNullable='NO', dataType='bigint', characterMaximumLength=0, characterOctetLength=0, numericPrecision=20, numericScale=0, datetimePrecision=0, characterSetName='null', collationName='null', columnType='bigint(20) unsigned', columnKey='', extra='', privileges='select,insert,update,references', columnComment='', generationExpression=''}*/
private Long nextPosition;

/**Column{tableCatalog='def', tableSchema='mysql', tableName='ndb_binlog_index', columnName='next_file', ordinalPosition=12, columnDefault='null', isNullable='NO', dataType='varchar', characterMaximumLength=255, characterOctetLength=255, numericPrecision=0, numericScale=0, datetimePrecision=0, characterSetName='latin1', collationName='latin1_swedish_ci', columnType='varchar(255)', columnKey='', extra='', privileges='select,insert,update,references', columnComment='', generationExpression=''}*/
private String nextFile;

public Long getPosition(){
return position;
}

public String getFile(){
return file;
}

public Long getEpoch(){
return epoch;
}

public Integer getInserts(){
return inserts;
}

public Integer getUpdates(){
return updates;
}

public Integer getDeletes(){
return deletes;
}

public Integer getSchemaops(){
return schemaops;
}

public Integer getOrigServerId(){
return origServerId;
}

public Long getOrigEpoch(){
return origEpoch;
}

public Integer getGci(){
return gci;
}

public Long getNextPosition(){
return nextPosition;
}

public String getNextFile(){
return nextFile;
}

}