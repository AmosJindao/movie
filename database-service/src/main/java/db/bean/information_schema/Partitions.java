package db.bean.information_schema;

import java.util.Date;

/**
*/
public class Partitions{
/**Column{tableCatalog='def', tableSchema='information_schema', tableName='PARTITIONS', columnName='TABLE_CATALOG', ordinalPosition=1, columnDefault='', isNullable='NO', dataType='varchar', characterMaximumLength=512, characterOctetLength=1536, numericPrecision=0, numericScale=0, datetimePrecision=0, characterSetName='utf8', collationName='utf8_general_ci', columnType='varchar(512)', columnKey='', extra='', privileges='select', columnComment='', generationExpression=''}*/
private String tableCatalog;

/**Column{tableCatalog='def', tableSchema='information_schema', tableName='PARTITIONS', columnName='TABLE_SCHEMA', ordinalPosition=2, columnDefault='', isNullable='NO', dataType='varchar', characterMaximumLength=64, characterOctetLength=192, numericPrecision=0, numericScale=0, datetimePrecision=0, characterSetName='utf8', collationName='utf8_general_ci', columnType='varchar(64)', columnKey='', extra='', privileges='select', columnComment='', generationExpression=''}*/
private String tableSchema;

/**Column{tableCatalog='def', tableSchema='information_schema', tableName='PARTITIONS', columnName='TABLE_NAME', ordinalPosition=3, columnDefault='', isNullable='NO', dataType='varchar', characterMaximumLength=64, characterOctetLength=192, numericPrecision=0, numericScale=0, datetimePrecision=0, characterSetName='utf8', collationName='utf8_general_ci', columnType='varchar(64)', columnKey='', extra='', privileges='select', columnComment='', generationExpression=''}*/
private String tableName;

/**Column{tableCatalog='def', tableSchema='information_schema', tableName='PARTITIONS', columnName='PARTITION_NAME', ordinalPosition=4, columnDefault='null', isNullable='YES', dataType='varchar', characterMaximumLength=64, characterOctetLength=192, numericPrecision=0, numericScale=0, datetimePrecision=0, characterSetName='utf8', collationName='utf8_general_ci', columnType='varchar(64)', columnKey='', extra='', privileges='select', columnComment='', generationExpression=''}*/
private String partitionName;

/**Column{tableCatalog='def', tableSchema='information_schema', tableName='PARTITIONS', columnName='SUBPARTITION_NAME', ordinalPosition=5, columnDefault='null', isNullable='YES', dataType='varchar', characterMaximumLength=64, characterOctetLength=192, numericPrecision=0, numericScale=0, datetimePrecision=0, characterSetName='utf8', collationName='utf8_general_ci', columnType='varchar(64)', columnKey='', extra='', privileges='select', columnComment='', generationExpression=''}*/
private String subpartitionName;

/**Column{tableCatalog='def', tableSchema='information_schema', tableName='PARTITIONS', columnName='PARTITION_ORDINAL_POSITION', ordinalPosition=6, columnDefault='null', isNullable='YES', dataType='bigint', characterMaximumLength=0, characterOctetLength=0, numericPrecision=20, numericScale=0, datetimePrecision=0, characterSetName='null', collationName='null', columnType='bigint(21) unsigned', columnKey='', extra='', privileges='select', columnComment='', generationExpression=''}*/
private Long partitionOrdinalPosition;

/**Column{tableCatalog='def', tableSchema='information_schema', tableName='PARTITIONS', columnName='SUBPARTITION_ORDINAL_POSITION', ordinalPosition=7, columnDefault='null', isNullable='YES', dataType='bigint', characterMaximumLength=0, characterOctetLength=0, numericPrecision=20, numericScale=0, datetimePrecision=0, characterSetName='null', collationName='null', columnType='bigint(21) unsigned', columnKey='', extra='', privileges='select', columnComment='', generationExpression=''}*/
private Long subpartitionOrdinalPosition;

/**Column{tableCatalog='def', tableSchema='information_schema', tableName='PARTITIONS', columnName='PARTITION_METHOD', ordinalPosition=8, columnDefault='null', isNullable='YES', dataType='varchar', characterMaximumLength=18, characterOctetLength=54, numericPrecision=0, numericScale=0, datetimePrecision=0, characterSetName='utf8', collationName='utf8_general_ci', columnType='varchar(18)', columnKey='', extra='', privileges='select', columnComment='', generationExpression=''}*/
private String partitionMethod;

/**Column{tableCatalog='def', tableSchema='information_schema', tableName='PARTITIONS', columnName='SUBPARTITION_METHOD', ordinalPosition=9, columnDefault='null', isNullable='YES', dataType='varchar', characterMaximumLength=12, characterOctetLength=36, numericPrecision=0, numericScale=0, datetimePrecision=0, characterSetName='utf8', collationName='utf8_general_ci', columnType='varchar(12)', columnKey='', extra='', privileges='select', columnComment='', generationExpression=''}*/
private String subpartitionMethod;

/**Column{tableCatalog='def', tableSchema='information_schema', tableName='PARTITIONS', columnName='PARTITION_EXPRESSION', ordinalPosition=10, columnDefault='null', isNullable='YES', dataType='longtext', characterMaximumLength=4294967295, characterOctetLength=4294967295, numericPrecision=0, numericScale=0, datetimePrecision=0, characterSetName='utf8', collationName='utf8_general_ci', columnType='longtext', columnKey='', extra='', privileges='select', columnComment='', generationExpression=''}*/
private String partitionExpression;

/**Column{tableCatalog='def', tableSchema='information_schema', tableName='PARTITIONS', columnName='SUBPARTITION_EXPRESSION', ordinalPosition=11, columnDefault='null', isNullable='YES', dataType='longtext', characterMaximumLength=4294967295, characterOctetLength=4294967295, numericPrecision=0, numericScale=0, datetimePrecision=0, characterSetName='utf8', collationName='utf8_general_ci', columnType='longtext', columnKey='', extra='', privileges='select', columnComment='', generationExpression=''}*/
private String subpartitionExpression;

/**Column{tableCatalog='def', tableSchema='information_schema', tableName='PARTITIONS', columnName='PARTITION_DESCRIPTION', ordinalPosition=12, columnDefault='null', isNullable='YES', dataType='longtext', characterMaximumLength=4294967295, characterOctetLength=4294967295, numericPrecision=0, numericScale=0, datetimePrecision=0, characterSetName='utf8', collationName='utf8_general_ci', columnType='longtext', columnKey='', extra='', privileges='select', columnComment='', generationExpression=''}*/
private String partitionDescription;

/**Column{tableCatalog='def', tableSchema='information_schema', tableName='PARTITIONS', columnName='TABLE_ROWS', ordinalPosition=13, columnDefault='0', isNullable='NO', dataType='bigint', characterMaximumLength=0, characterOctetLength=0, numericPrecision=20, numericScale=0, datetimePrecision=0, characterSetName='null', collationName='null', columnType='bigint(21) unsigned', columnKey='', extra='', privileges='select', columnComment='', generationExpression=''}*/
private Long tableRows;

/**Column{tableCatalog='def', tableSchema='information_schema', tableName='PARTITIONS', columnName='AVG_ROW_LENGTH', ordinalPosition=14, columnDefault='0', isNullable='NO', dataType='bigint', characterMaximumLength=0, characterOctetLength=0, numericPrecision=20, numericScale=0, datetimePrecision=0, characterSetName='null', collationName='null', columnType='bigint(21) unsigned', columnKey='', extra='', privileges='select', columnComment='', generationExpression=''}*/
private Long avgRowLength;

/**Column{tableCatalog='def', tableSchema='information_schema', tableName='PARTITIONS', columnName='DATA_LENGTH', ordinalPosition=15, columnDefault='0', isNullable='NO', dataType='bigint', characterMaximumLength=0, characterOctetLength=0, numericPrecision=20, numericScale=0, datetimePrecision=0, characterSetName='null', collationName='null', columnType='bigint(21) unsigned', columnKey='', extra='', privileges='select', columnComment='', generationExpression=''}*/
private Long dataLength;

/**Column{tableCatalog='def', tableSchema='information_schema', tableName='PARTITIONS', columnName='MAX_DATA_LENGTH', ordinalPosition=16, columnDefault='null', isNullable='YES', dataType='bigint', characterMaximumLength=0, characterOctetLength=0, numericPrecision=20, numericScale=0, datetimePrecision=0, characterSetName='null', collationName='null', columnType='bigint(21) unsigned', columnKey='', extra='', privileges='select', columnComment='', generationExpression=''}*/
private Long maxDataLength;

/**Column{tableCatalog='def', tableSchema='information_schema', tableName='PARTITIONS', columnName='INDEX_LENGTH', ordinalPosition=17, columnDefault='0', isNullable='NO', dataType='bigint', characterMaximumLength=0, characterOctetLength=0, numericPrecision=20, numericScale=0, datetimePrecision=0, characterSetName='null', collationName='null', columnType='bigint(21) unsigned', columnKey='', extra='', privileges='select', columnComment='', generationExpression=''}*/
private Long indexLength;

/**Column{tableCatalog='def', tableSchema='information_schema', tableName='PARTITIONS', columnName='DATA_FREE', ordinalPosition=18, columnDefault='0', isNullable='NO', dataType='bigint', characterMaximumLength=0, characterOctetLength=0, numericPrecision=20, numericScale=0, datetimePrecision=0, characterSetName='null', collationName='null', columnType='bigint(21) unsigned', columnKey='', extra='', privileges='select', columnComment='', generationExpression=''}*/
private Long dataFree;

/**Column{tableCatalog='def', tableSchema='information_schema', tableName='PARTITIONS', columnName='CREATE_TIME', ordinalPosition=19, columnDefault='null', isNullable='YES', dataType='datetime', characterMaximumLength=0, characterOctetLength=0, numericPrecision=0, numericScale=0, datetimePrecision=0, characterSetName='null', collationName='null', columnType='datetime', columnKey='', extra='', privileges='select', columnComment='', generationExpression=''}*/
private Date createTime;

/**Column{tableCatalog='def', tableSchema='information_schema', tableName='PARTITIONS', columnName='UPDATE_TIME', ordinalPosition=20, columnDefault='null', isNullable='YES', dataType='datetime', characterMaximumLength=0, characterOctetLength=0, numericPrecision=0, numericScale=0, datetimePrecision=0, characterSetName='null', collationName='null', columnType='datetime', columnKey='', extra='', privileges='select', columnComment='', generationExpression=''}*/
private Date updateTime;

/**Column{tableCatalog='def', tableSchema='information_schema', tableName='PARTITIONS', columnName='CHECK_TIME', ordinalPosition=21, columnDefault='null', isNullable='YES', dataType='datetime', characterMaximumLength=0, characterOctetLength=0, numericPrecision=0, numericScale=0, datetimePrecision=0, characterSetName='null', collationName='null', columnType='datetime', columnKey='', extra='', privileges='select', columnComment='', generationExpression=''}*/
private Date checkTime;

/**Column{tableCatalog='def', tableSchema='information_schema', tableName='PARTITIONS', columnName='CHECKSUM', ordinalPosition=22, columnDefault='null', isNullable='YES', dataType='bigint', characterMaximumLength=0, characterOctetLength=0, numericPrecision=20, numericScale=0, datetimePrecision=0, characterSetName='null', collationName='null', columnType='bigint(21) unsigned', columnKey='', extra='', privileges='select', columnComment='', generationExpression=''}*/
private Long checksum;

/**Column{tableCatalog='def', tableSchema='information_schema', tableName='PARTITIONS', columnName='PARTITION_COMMENT', ordinalPosition=23, columnDefault='', isNullable='NO', dataType='varchar', characterMaximumLength=80, characterOctetLength=240, numericPrecision=0, numericScale=0, datetimePrecision=0, characterSetName='utf8', collationName='utf8_general_ci', columnType='varchar(80)', columnKey='', extra='', privileges='select', columnComment='', generationExpression=''}*/
private String partitionComment;

/**Column{tableCatalog='def', tableSchema='information_schema', tableName='PARTITIONS', columnName='NODEGROUP', ordinalPosition=24, columnDefault='', isNullable='NO', dataType='varchar', characterMaximumLength=12, characterOctetLength=36, numericPrecision=0, numericScale=0, datetimePrecision=0, characterSetName='utf8', collationName='utf8_general_ci', columnType='varchar(12)', columnKey='', extra='', privileges='select', columnComment='', generationExpression=''}*/
private String nodegroup;

/**Column{tableCatalog='def', tableSchema='information_schema', tableName='PARTITIONS', columnName='TABLESPACE_NAME', ordinalPosition=25, columnDefault='null', isNullable='YES', dataType='varchar', characterMaximumLength=64, characterOctetLength=192, numericPrecision=0, numericScale=0, datetimePrecision=0, characterSetName='utf8', collationName='utf8_general_ci', columnType='varchar(64)', columnKey='', extra='', privileges='select', columnComment='', generationExpression=''}*/
private String tablespaceName;

public String getTableCatalog(){
return tableCatalog;
}

public String getTableSchema(){
return tableSchema;
}

public String getTableName(){
return tableName;
}

public String getPartitionName(){
return partitionName;
}

public String getSubpartitionName(){
return subpartitionName;
}

public Long getPartitionOrdinalPosition(){
return partitionOrdinalPosition;
}

public Long getSubpartitionOrdinalPosition(){
return subpartitionOrdinalPosition;
}

public String getPartitionMethod(){
return partitionMethod;
}

public String getSubpartitionMethod(){
return subpartitionMethod;
}

public String getPartitionExpression(){
return partitionExpression;
}

public String getSubpartitionExpression(){
return subpartitionExpression;
}

public String getPartitionDescription(){
return partitionDescription;
}

public Long getTableRows(){
return tableRows;
}

public Long getAvgRowLength(){
return avgRowLength;
}

public Long getDataLength(){
return dataLength;
}

public Long getMaxDataLength(){
return maxDataLength;
}

public Long getIndexLength(){
return indexLength;
}

public Long getDataFree(){
return dataFree;
}

public Date getCreateTime(){
return createTime;
}

public Date getUpdateTime(){
return updateTime;
}

public Date getCheckTime(){
return checkTime;
}

public Long getChecksum(){
return checksum;
}

public String getPartitionComment(){
return partitionComment;
}

public String getNodegroup(){
return nodegroup;
}

public String getTablespaceName(){
return tablespaceName;
}

}