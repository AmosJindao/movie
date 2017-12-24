package db.bean.information_schema;

import java.util.Date;

/* SELECT FILE_ID AS fileId, FILE_NAME AS fileName, FILE_TYPE AS fileType, TABLESPACE_NAME AS tablespaceName, TABLE_CATALOG AS tableCatalog, TABLE_SCHEMA AS tableSchema, TABLE_NAME AS tableName, LOGFILE_GROUP_NAME AS logfileGroupName, LOGFILE_GROUP_NUMBER AS logfileGroupNumber, ENGINE AS engine, FULLTEXT_KEYS AS fulltextKeys, DELETED_ROWS AS deletedRows, UPDATE_COUNT AS updateCount, FREE_EXTENTS AS freeExtents, TOTAL_EXTENTS AS totalExtents, EXTENT_SIZE AS extentSize, INITIAL_SIZE AS initialSize, MAXIMUM_SIZE AS maximumSize, AUTOEXTEND_SIZE AS autoextendSize, CREATION_TIME AS creationTime, LAST_UPDATE_TIME AS lastUpdateTime, LAST_ACCESS_TIME AS lastAccessTime, RECOVER_TIME AS recoverTime, TRANSACTION_COUNTER AS transactionCounter, VERSION AS version, ROW_FORMAT AS rowFormat, TABLE_ROWS AS tableRows, AVG_ROW_LENGTH AS avgRowLength, DATA_LENGTH AS dataLength, MAX_DATA_LENGTH AS maxDataLength, INDEX_LENGTH AS indexLength, DATA_FREE AS dataFree, CREATE_TIME AS createTime, UPDATE_TIME AS updateTime, CHECK_TIME AS checkTime, CHECKSUM AS checksum, STATUS AS status, EXTRA AS extra FROM information_schema.FILES */
/**
*/
public class Files{
/**Column{tableCatalog='def', tableSchema='information_schema', tableName='FILES', columnName='FILE_ID', ordinalPosition=1, columnDefault='0', isNullable='NO', dataType='bigint', characterMaximumLength=0, characterOctetLength=0, numericPrecision=19, numericScale=0, datetimePrecision=0, characterSetName='null', collationName='null', columnType='bigint(4)', columnKey='', extra='', privileges='select', columnComment='', generationExpression=''}*/
private Long fileId;

/**Column{tableCatalog='def', tableSchema='information_schema', tableName='FILES', columnName='FILE_NAME', ordinalPosition=2, columnDefault='null', isNullable='YES', dataType='varchar', characterMaximumLength=4000, characterOctetLength=12000, numericPrecision=0, numericScale=0, datetimePrecision=0, characterSetName='utf8', collationName='utf8_general_ci', columnType='varchar(4000)', columnKey='', extra='', privileges='select', columnComment='', generationExpression=''}*/
private String fileName;

/**Column{tableCatalog='def', tableSchema='information_schema', tableName='FILES', columnName='FILE_TYPE', ordinalPosition=3, columnDefault='', isNullable='NO', dataType='varchar', characterMaximumLength=20, characterOctetLength=60, numericPrecision=0, numericScale=0, datetimePrecision=0, characterSetName='utf8', collationName='utf8_general_ci', columnType='varchar(20)', columnKey='', extra='', privileges='select', columnComment='', generationExpression=''}*/
private String fileType;

/**Column{tableCatalog='def', tableSchema='information_schema', tableName='FILES', columnName='TABLESPACE_NAME', ordinalPosition=4, columnDefault='null', isNullable='YES', dataType='varchar', characterMaximumLength=64, characterOctetLength=192, numericPrecision=0, numericScale=0, datetimePrecision=0, characterSetName='utf8', collationName='utf8_general_ci', columnType='varchar(64)', columnKey='', extra='', privileges='select', columnComment='', generationExpression=''}*/
private String tablespaceName;

/**Column{tableCatalog='def', tableSchema='information_schema', tableName='FILES', columnName='TABLE_CATALOG', ordinalPosition=5, columnDefault='', isNullable='NO', dataType='varchar', characterMaximumLength=64, characterOctetLength=192, numericPrecision=0, numericScale=0, datetimePrecision=0, characterSetName='utf8', collationName='utf8_general_ci', columnType='varchar(64)', columnKey='', extra='', privileges='select', columnComment='', generationExpression=''}*/
private String tableCatalog;

/**Column{tableCatalog='def', tableSchema='information_schema', tableName='FILES', columnName='TABLE_SCHEMA', ordinalPosition=6, columnDefault='null', isNullable='YES', dataType='varchar', characterMaximumLength=64, characterOctetLength=192, numericPrecision=0, numericScale=0, datetimePrecision=0, characterSetName='utf8', collationName='utf8_general_ci', columnType='varchar(64)', columnKey='', extra='', privileges='select', columnComment='', generationExpression=''}*/
private String tableSchema;

/**Column{tableCatalog='def', tableSchema='information_schema', tableName='FILES', columnName='TABLE_NAME', ordinalPosition=7, columnDefault='null', isNullable='YES', dataType='varchar', characterMaximumLength=64, characterOctetLength=192, numericPrecision=0, numericScale=0, datetimePrecision=0, characterSetName='utf8', collationName='utf8_general_ci', columnType='varchar(64)', columnKey='', extra='', privileges='select', columnComment='', generationExpression=''}*/
private String tableName;

/**Column{tableCatalog='def', tableSchema='information_schema', tableName='FILES', columnName='LOGFILE_GROUP_NAME', ordinalPosition=8, columnDefault='null', isNullable='YES', dataType='varchar', characterMaximumLength=64, characterOctetLength=192, numericPrecision=0, numericScale=0, datetimePrecision=0, characterSetName='utf8', collationName='utf8_general_ci', columnType='varchar(64)', columnKey='', extra='', privileges='select', columnComment='', generationExpression=''}*/
private String logfileGroupName;

/**Column{tableCatalog='def', tableSchema='information_schema', tableName='FILES', columnName='LOGFILE_GROUP_NUMBER', ordinalPosition=9, columnDefault='null', isNullable='YES', dataType='bigint', characterMaximumLength=0, characterOctetLength=0, numericPrecision=19, numericScale=0, datetimePrecision=0, characterSetName='null', collationName='null', columnType='bigint(4)', columnKey='', extra='', privileges='select', columnComment='', generationExpression=''}*/
private Long logfileGroupNumber;

/**Column{tableCatalog='def', tableSchema='information_schema', tableName='FILES', columnName='ENGINE', ordinalPosition=10, columnDefault='', isNullable='NO', dataType='varchar', characterMaximumLength=64, characterOctetLength=192, numericPrecision=0, numericScale=0, datetimePrecision=0, characterSetName='utf8', collationName='utf8_general_ci', columnType='varchar(64)', columnKey='', extra='', privileges='select', columnComment='', generationExpression=''}*/
private String engine;

/**Column{tableCatalog='def', tableSchema='information_schema', tableName='FILES', columnName='FULLTEXT_KEYS', ordinalPosition=11, columnDefault='null', isNullable='YES', dataType='varchar', characterMaximumLength=64, characterOctetLength=192, numericPrecision=0, numericScale=0, datetimePrecision=0, characterSetName='utf8', collationName='utf8_general_ci', columnType='varchar(64)', columnKey='', extra='', privileges='select', columnComment='', generationExpression=''}*/
private String fulltextKeys;

/**Column{tableCatalog='def', tableSchema='information_schema', tableName='FILES', columnName='DELETED_ROWS', ordinalPosition=12, columnDefault='null', isNullable='YES', dataType='bigint', characterMaximumLength=0, characterOctetLength=0, numericPrecision=19, numericScale=0, datetimePrecision=0, characterSetName='null', collationName='null', columnType='bigint(4)', columnKey='', extra='', privileges='select', columnComment='', generationExpression=''}*/
private Long deletedRows;

/**Column{tableCatalog='def', tableSchema='information_schema', tableName='FILES', columnName='UPDATE_COUNT', ordinalPosition=13, columnDefault='null', isNullable='YES', dataType='bigint', characterMaximumLength=0, characterOctetLength=0, numericPrecision=19, numericScale=0, datetimePrecision=0, characterSetName='null', collationName='null', columnType='bigint(4)', columnKey='', extra='', privileges='select', columnComment='', generationExpression=''}*/
private Long updateCount;

/**Column{tableCatalog='def', tableSchema='information_schema', tableName='FILES', columnName='FREE_EXTENTS', ordinalPosition=14, columnDefault='null', isNullable='YES', dataType='bigint', characterMaximumLength=0, characterOctetLength=0, numericPrecision=19, numericScale=0, datetimePrecision=0, characterSetName='null', collationName='null', columnType='bigint(4)', columnKey='', extra='', privileges='select', columnComment='', generationExpression=''}*/
private Long freeExtents;

/**Column{tableCatalog='def', tableSchema='information_schema', tableName='FILES', columnName='TOTAL_EXTENTS', ordinalPosition=15, columnDefault='null', isNullable='YES', dataType='bigint', characterMaximumLength=0, characterOctetLength=0, numericPrecision=19, numericScale=0, datetimePrecision=0, characterSetName='null', collationName='null', columnType='bigint(4)', columnKey='', extra='', privileges='select', columnComment='', generationExpression=''}*/
private Long totalExtents;

/**Column{tableCatalog='def', tableSchema='information_schema', tableName='FILES', columnName='EXTENT_SIZE', ordinalPosition=16, columnDefault='0', isNullable='NO', dataType='bigint', characterMaximumLength=0, characterOctetLength=0, numericPrecision=19, numericScale=0, datetimePrecision=0, characterSetName='null', collationName='null', columnType='bigint(4)', columnKey='', extra='', privileges='select', columnComment='', generationExpression=''}*/
private Long extentSize;

/**Column{tableCatalog='def', tableSchema='information_schema', tableName='FILES', columnName='INITIAL_SIZE', ordinalPosition=17, columnDefault='null', isNullable='YES', dataType='bigint', characterMaximumLength=0, characterOctetLength=0, numericPrecision=20, numericScale=0, datetimePrecision=0, characterSetName='null', collationName='null', columnType='bigint(21) unsigned', columnKey='', extra='', privileges='select', columnComment='', generationExpression=''}*/
private Long initialSize;

/**Column{tableCatalog='def', tableSchema='information_schema', tableName='FILES', columnName='MAXIMUM_SIZE', ordinalPosition=18, columnDefault='null', isNullable='YES', dataType='bigint', characterMaximumLength=0, characterOctetLength=0, numericPrecision=20, numericScale=0, datetimePrecision=0, characterSetName='null', collationName='null', columnType='bigint(21) unsigned', columnKey='', extra='', privileges='select', columnComment='', generationExpression=''}*/
private Long maximumSize;

/**Column{tableCatalog='def', tableSchema='information_schema', tableName='FILES', columnName='AUTOEXTEND_SIZE', ordinalPosition=19, columnDefault='null', isNullable='YES', dataType='bigint', characterMaximumLength=0, characterOctetLength=0, numericPrecision=20, numericScale=0, datetimePrecision=0, characterSetName='null', collationName='null', columnType='bigint(21) unsigned', columnKey='', extra='', privileges='select', columnComment='', generationExpression=''}*/
private Long autoextendSize;

/**Column{tableCatalog='def', tableSchema='information_schema', tableName='FILES', columnName='CREATION_TIME', ordinalPosition=20, columnDefault='null', isNullable='YES', dataType='datetime', characterMaximumLength=0, characterOctetLength=0, numericPrecision=0, numericScale=0, datetimePrecision=0, characterSetName='null', collationName='null', columnType='datetime', columnKey='', extra='', privileges='select', columnComment='', generationExpression=''}*/
private Date creationTime;

/**Column{tableCatalog='def', tableSchema='information_schema', tableName='FILES', columnName='LAST_UPDATE_TIME', ordinalPosition=21, columnDefault='null', isNullable='YES', dataType='datetime', characterMaximumLength=0, characterOctetLength=0, numericPrecision=0, numericScale=0, datetimePrecision=0, characterSetName='null', collationName='null', columnType='datetime', columnKey='', extra='', privileges='select', columnComment='', generationExpression=''}*/
private Date lastUpdateTime;

/**Column{tableCatalog='def', tableSchema='information_schema', tableName='FILES', columnName='LAST_ACCESS_TIME', ordinalPosition=22, columnDefault='null', isNullable='YES', dataType='datetime', characterMaximumLength=0, characterOctetLength=0, numericPrecision=0, numericScale=0, datetimePrecision=0, characterSetName='null', collationName='null', columnType='datetime', columnKey='', extra='', privileges='select', columnComment='', generationExpression=''}*/
private Date lastAccessTime;

/**Column{tableCatalog='def', tableSchema='information_schema', tableName='FILES', columnName='RECOVER_TIME', ordinalPosition=23, columnDefault='null', isNullable='YES', dataType='bigint', characterMaximumLength=0, characterOctetLength=0, numericPrecision=19, numericScale=0, datetimePrecision=0, characterSetName='null', collationName='null', columnType='bigint(4)', columnKey='', extra='', privileges='select', columnComment='', generationExpression=''}*/
private Long recoverTime;

/**Column{tableCatalog='def', tableSchema='information_schema', tableName='FILES', columnName='TRANSACTION_COUNTER', ordinalPosition=24, columnDefault='null', isNullable='YES', dataType='bigint', characterMaximumLength=0, characterOctetLength=0, numericPrecision=19, numericScale=0, datetimePrecision=0, characterSetName='null', collationName='null', columnType='bigint(4)', columnKey='', extra='', privileges='select', columnComment='', generationExpression=''}*/
private Long transactionCounter;

/**Column{tableCatalog='def', tableSchema='information_schema', tableName='FILES', columnName='VERSION', ordinalPosition=25, columnDefault='null', isNullable='YES', dataType='bigint', characterMaximumLength=0, characterOctetLength=0, numericPrecision=20, numericScale=0, datetimePrecision=0, characterSetName='null', collationName='null', columnType='bigint(21) unsigned', columnKey='', extra='', privileges='select', columnComment='', generationExpression=''}*/
private Long version;

/**Column{tableCatalog='def', tableSchema='information_schema', tableName='FILES', columnName='ROW_FORMAT', ordinalPosition=26, columnDefault='null', isNullable='YES', dataType='varchar', characterMaximumLength=10, characterOctetLength=30, numericPrecision=0, numericScale=0, datetimePrecision=0, characterSetName='utf8', collationName='utf8_general_ci', columnType='varchar(10)', columnKey='', extra='', privileges='select', columnComment='', generationExpression=''}*/
private String rowFormat;

/**Column{tableCatalog='def', tableSchema='information_schema', tableName='FILES', columnName='TABLE_ROWS', ordinalPosition=27, columnDefault='null', isNullable='YES', dataType='bigint', characterMaximumLength=0, characterOctetLength=0, numericPrecision=20, numericScale=0, datetimePrecision=0, characterSetName='null', collationName='null', columnType='bigint(21) unsigned', columnKey='', extra='', privileges='select', columnComment='', generationExpression=''}*/
private Long tableRows;

/**Column{tableCatalog='def', tableSchema='information_schema', tableName='FILES', columnName='AVG_ROW_LENGTH', ordinalPosition=28, columnDefault='null', isNullable='YES', dataType='bigint', characterMaximumLength=0, characterOctetLength=0, numericPrecision=20, numericScale=0, datetimePrecision=0, characterSetName='null', collationName='null', columnType='bigint(21) unsigned', columnKey='', extra='', privileges='select', columnComment='', generationExpression=''}*/
private Long avgRowLength;

/**Column{tableCatalog='def', tableSchema='information_schema', tableName='FILES', columnName='DATA_LENGTH', ordinalPosition=29, columnDefault='null', isNullable='YES', dataType='bigint', characterMaximumLength=0, characterOctetLength=0, numericPrecision=20, numericScale=0, datetimePrecision=0, characterSetName='null', collationName='null', columnType='bigint(21) unsigned', columnKey='', extra='', privileges='select', columnComment='', generationExpression=''}*/
private Long dataLength;

/**Column{tableCatalog='def', tableSchema='information_schema', tableName='FILES', columnName='MAX_DATA_LENGTH', ordinalPosition=30, columnDefault='null', isNullable='YES', dataType='bigint', characterMaximumLength=0, characterOctetLength=0, numericPrecision=20, numericScale=0, datetimePrecision=0, characterSetName='null', collationName='null', columnType='bigint(21) unsigned', columnKey='', extra='', privileges='select', columnComment='', generationExpression=''}*/
private Long maxDataLength;

/**Column{tableCatalog='def', tableSchema='information_schema', tableName='FILES', columnName='INDEX_LENGTH', ordinalPosition=31, columnDefault='null', isNullable='YES', dataType='bigint', characterMaximumLength=0, characterOctetLength=0, numericPrecision=20, numericScale=0, datetimePrecision=0, characterSetName='null', collationName='null', columnType='bigint(21) unsigned', columnKey='', extra='', privileges='select', columnComment='', generationExpression=''}*/
private Long indexLength;

/**Column{tableCatalog='def', tableSchema='information_schema', tableName='FILES', columnName='DATA_FREE', ordinalPosition=32, columnDefault='null', isNullable='YES', dataType='bigint', characterMaximumLength=0, characterOctetLength=0, numericPrecision=20, numericScale=0, datetimePrecision=0, characterSetName='null', collationName='null', columnType='bigint(21) unsigned', columnKey='', extra='', privileges='select', columnComment='', generationExpression=''}*/
private Long dataFree;

/**Column{tableCatalog='def', tableSchema='information_schema', tableName='FILES', columnName='CREATE_TIME', ordinalPosition=33, columnDefault='null', isNullable='YES', dataType='datetime', characterMaximumLength=0, characterOctetLength=0, numericPrecision=0, numericScale=0, datetimePrecision=0, characterSetName='null', collationName='null', columnType='datetime', columnKey='', extra='', privileges='select', columnComment='', generationExpression=''}*/
private Date createTime;

/**Column{tableCatalog='def', tableSchema='information_schema', tableName='FILES', columnName='UPDATE_TIME', ordinalPosition=34, columnDefault='null', isNullable='YES', dataType='datetime', characterMaximumLength=0, characterOctetLength=0, numericPrecision=0, numericScale=0, datetimePrecision=0, characterSetName='null', collationName='null', columnType='datetime', columnKey='', extra='', privileges='select', columnComment='', generationExpression=''}*/
private Date updateTime;

/**Column{tableCatalog='def', tableSchema='information_schema', tableName='FILES', columnName='CHECK_TIME', ordinalPosition=35, columnDefault='null', isNullable='YES', dataType='datetime', characterMaximumLength=0, characterOctetLength=0, numericPrecision=0, numericScale=0, datetimePrecision=0, characterSetName='null', collationName='null', columnType='datetime', columnKey='', extra='', privileges='select', columnComment='', generationExpression=''}*/
private Date checkTime;

/**Column{tableCatalog='def', tableSchema='information_schema', tableName='FILES', columnName='CHECKSUM', ordinalPosition=36, columnDefault='null', isNullable='YES', dataType='bigint', characterMaximumLength=0, characterOctetLength=0, numericPrecision=20, numericScale=0, datetimePrecision=0, characterSetName='null', collationName='null', columnType='bigint(21) unsigned', columnKey='', extra='', privileges='select', columnComment='', generationExpression=''}*/
private Long checksum;

/**Column{tableCatalog='def', tableSchema='information_schema', tableName='FILES', columnName='STATUS', ordinalPosition=37, columnDefault='', isNullable='NO', dataType='varchar', characterMaximumLength=20, characterOctetLength=60, numericPrecision=0, numericScale=0, datetimePrecision=0, characterSetName='utf8', collationName='utf8_general_ci', columnType='varchar(20)', columnKey='', extra='', privileges='select', columnComment='', generationExpression=''}*/
private String status;

/**Column{tableCatalog='def', tableSchema='information_schema', tableName='FILES', columnName='EXTRA', ordinalPosition=38, columnDefault='null', isNullable='YES', dataType='varchar', characterMaximumLength=255, characterOctetLength=765, numericPrecision=0, numericScale=0, datetimePrecision=0, characterSetName='utf8', collationName='utf8_general_ci', columnType='varchar(255)', columnKey='', extra='', privileges='select', columnComment='', generationExpression=''}*/
private String extra;

public Long getFileId(){
return fileId;
}

public String getFileName(){
return fileName;
}

public String getFileType(){
return fileType;
}

public String getTablespaceName(){
return tablespaceName;
}

public String getTableCatalog(){
return tableCatalog;
}

public String getTableSchema(){
return tableSchema;
}

public String getTableName(){
return tableName;
}

public String getLogfileGroupName(){
return logfileGroupName;
}

public Long getLogfileGroupNumber(){
return logfileGroupNumber;
}

public String getEngine(){
return engine;
}

public String getFulltextKeys(){
return fulltextKeys;
}

public Long getDeletedRows(){
return deletedRows;
}

public Long getUpdateCount(){
return updateCount;
}

public Long getFreeExtents(){
return freeExtents;
}

public Long getTotalExtents(){
return totalExtents;
}

public Long getExtentSize(){
return extentSize;
}

public Long getInitialSize(){
return initialSize;
}

public Long getMaximumSize(){
return maximumSize;
}

public Long getAutoextendSize(){
return autoextendSize;
}

public Date getCreationTime(){
return creationTime;
}

public Date getLastUpdateTime(){
return lastUpdateTime;
}

public Date getLastAccessTime(){
return lastAccessTime;
}

public Long getRecoverTime(){
return recoverTime;
}

public Long getTransactionCounter(){
return transactionCounter;
}

public Long getVersion(){
return version;
}

public String getRowFormat(){
return rowFormat;
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

public String getStatus(){
return status;
}

public String getExtra(){
return extra;
}

}