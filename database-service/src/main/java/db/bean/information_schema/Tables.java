package db.bean.information_schema;

import java.util.Date;

/* SELECT TABLE_CATALOG AS tableCatalog, TABLE_SCHEMA AS tableSchema, TABLE_NAME AS tableName, TABLE_TYPE AS tableType, ENGINE AS engine, VERSION AS version, ROW_FORMAT AS rowFormat, TABLE_ROWS AS tableRows, AVG_ROW_LENGTH AS avgRowLength, DATA_LENGTH AS dataLength, MAX_DATA_LENGTH AS maxDataLength, INDEX_LENGTH AS indexLength, DATA_FREE AS dataFree, AUTO_INCREMENT AS autoIncrement, CREATE_TIME AS createTime, UPDATE_TIME AS updateTime, CHECK_TIME AS checkTime, TABLE_COLLATION AS tableCollation, CHECKSUM AS checksum, CREATE_OPTIONS AS createOptions, TABLE_COMMENT AS tableComment FROM information_schema.TABLES */
/**
*/
public class Tables{
/**Column{tableCatalog='def', tableSchema='information_schema', tableName='TABLES', columnName='TABLE_CATALOG', ordinalPosition=1, columnDefault='', isNullable='NO', dataType='varchar', characterMaximumLength=512, characterOctetLength=1536, numericPrecision=0, numericScale=0, datetimePrecision=0, characterSetName='utf8', collationName='utf8_general_ci', columnType='varchar(512)', columnKey='', extra='', privileges='select', columnComment='', generationExpression=''}*/
private String tableCatalog;

/**Column{tableCatalog='def', tableSchema='information_schema', tableName='TABLES', columnName='TABLE_SCHEMA', ordinalPosition=2, columnDefault='', isNullable='NO', dataType='varchar', characterMaximumLength=64, characterOctetLength=192, numericPrecision=0, numericScale=0, datetimePrecision=0, characterSetName='utf8', collationName='utf8_general_ci', columnType='varchar(64)', columnKey='', extra='', privileges='select', columnComment='', generationExpression=''}*/
private String tableSchema;

/**Column{tableCatalog='def', tableSchema='information_schema', tableName='TABLES', columnName='TABLE_NAME', ordinalPosition=3, columnDefault='', isNullable='NO', dataType='varchar', characterMaximumLength=64, characterOctetLength=192, numericPrecision=0, numericScale=0, datetimePrecision=0, characterSetName='utf8', collationName='utf8_general_ci', columnType='varchar(64)', columnKey='', extra='', privileges='select', columnComment='', generationExpression=''}*/
private String tableName;

/**Column{tableCatalog='def', tableSchema='information_schema', tableName='TABLES', columnName='TABLE_TYPE', ordinalPosition=4, columnDefault='', isNullable='NO', dataType='varchar', characterMaximumLength=64, characterOctetLength=192, numericPrecision=0, numericScale=0, datetimePrecision=0, characterSetName='utf8', collationName='utf8_general_ci', columnType='varchar(64)', columnKey='', extra='', privileges='select', columnComment='', generationExpression=''}*/
private String tableType;

/**Column{tableCatalog='def', tableSchema='information_schema', tableName='TABLES', columnName='ENGINE', ordinalPosition=5, columnDefault='null', isNullable='YES', dataType='varchar', characterMaximumLength=64, characterOctetLength=192, numericPrecision=0, numericScale=0, datetimePrecision=0, characterSetName='utf8', collationName='utf8_general_ci', columnType='varchar(64)', columnKey='', extra='', privileges='select', columnComment='', generationExpression=''}*/
private String engine;

/**Column{tableCatalog='def', tableSchema='information_schema', tableName='TABLES', columnName='VERSION', ordinalPosition=6, columnDefault='null', isNullable='YES', dataType='bigint', characterMaximumLength=0, characterOctetLength=0, numericPrecision=20, numericScale=0, datetimePrecision=0, characterSetName='null', collationName='null', columnType='bigint(21) unsigned', columnKey='', extra='', privileges='select', columnComment='', generationExpression=''}*/
private Long version;

/**Column{tableCatalog='def', tableSchema='information_schema', tableName='TABLES', columnName='ROW_FORMAT', ordinalPosition=7, columnDefault='null', isNullable='YES', dataType='varchar', characterMaximumLength=10, characterOctetLength=30, numericPrecision=0, numericScale=0, datetimePrecision=0, characterSetName='utf8', collationName='utf8_general_ci', columnType='varchar(10)', columnKey='', extra='', privileges='select', columnComment='', generationExpression=''}*/
private String rowFormat;

/**Column{tableCatalog='def', tableSchema='information_schema', tableName='TABLES', columnName='TABLE_ROWS', ordinalPosition=8, columnDefault='null', isNullable='YES', dataType='bigint', characterMaximumLength=0, characterOctetLength=0, numericPrecision=20, numericScale=0, datetimePrecision=0, characterSetName='null', collationName='null', columnType='bigint(21) unsigned', columnKey='', extra='', privileges='select', columnComment='', generationExpression=''}*/
private Long tableRows;

/**Column{tableCatalog='def', tableSchema='information_schema', tableName='TABLES', columnName='AVG_ROW_LENGTH', ordinalPosition=9, columnDefault='null', isNullable='YES', dataType='bigint', characterMaximumLength=0, characterOctetLength=0, numericPrecision=20, numericScale=0, datetimePrecision=0, characterSetName='null', collationName='null', columnType='bigint(21) unsigned', columnKey='', extra='', privileges='select', columnComment='', generationExpression=''}*/
private Long avgRowLength;

/**Column{tableCatalog='def', tableSchema='information_schema', tableName='TABLES', columnName='DATA_LENGTH', ordinalPosition=10, columnDefault='null', isNullable='YES', dataType='bigint', characterMaximumLength=0, characterOctetLength=0, numericPrecision=20, numericScale=0, datetimePrecision=0, characterSetName='null', collationName='null', columnType='bigint(21) unsigned', columnKey='', extra='', privileges='select', columnComment='', generationExpression=''}*/
private Long dataLength;

/**Column{tableCatalog='def', tableSchema='information_schema', tableName='TABLES', columnName='MAX_DATA_LENGTH', ordinalPosition=11, columnDefault='null', isNullable='YES', dataType='bigint', characterMaximumLength=0, characterOctetLength=0, numericPrecision=20, numericScale=0, datetimePrecision=0, characterSetName='null', collationName='null', columnType='bigint(21) unsigned', columnKey='', extra='', privileges='select', columnComment='', generationExpression=''}*/
private Long maxDataLength;

/**Column{tableCatalog='def', tableSchema='information_schema', tableName='TABLES', columnName='INDEX_LENGTH', ordinalPosition=12, columnDefault='null', isNullable='YES', dataType='bigint', characterMaximumLength=0, characterOctetLength=0, numericPrecision=20, numericScale=0, datetimePrecision=0, characterSetName='null', collationName='null', columnType='bigint(21) unsigned', columnKey='', extra='', privileges='select', columnComment='', generationExpression=''}*/
private Long indexLength;

/**Column{tableCatalog='def', tableSchema='information_schema', tableName='TABLES', columnName='DATA_FREE', ordinalPosition=13, columnDefault='null', isNullable='YES', dataType='bigint', characterMaximumLength=0, characterOctetLength=0, numericPrecision=20, numericScale=0, datetimePrecision=0, characterSetName='null', collationName='null', columnType='bigint(21) unsigned', columnKey='', extra='', privileges='select', columnComment='', generationExpression=''}*/
private Long dataFree;

/**Column{tableCatalog='def', tableSchema='information_schema', tableName='TABLES', columnName='AUTO_INCREMENT', ordinalPosition=14, columnDefault='null', isNullable='YES', dataType='bigint', characterMaximumLength=0, characterOctetLength=0, numericPrecision=20, numericScale=0, datetimePrecision=0, characterSetName='null', collationName='null', columnType='bigint(21) unsigned', columnKey='', extra='', privileges='select', columnComment='', generationExpression=''}*/
private Long autoIncrement;

/**Column{tableCatalog='def', tableSchema='information_schema', tableName='TABLES', columnName='CREATE_TIME', ordinalPosition=15, columnDefault='null', isNullable='YES', dataType='datetime', characterMaximumLength=0, characterOctetLength=0, numericPrecision=0, numericScale=0, datetimePrecision=0, characterSetName='null', collationName='null', columnType='datetime', columnKey='', extra='', privileges='select', columnComment='', generationExpression=''}*/
private Date createTime;

/**Column{tableCatalog='def', tableSchema='information_schema', tableName='TABLES', columnName='UPDATE_TIME', ordinalPosition=16, columnDefault='null', isNullable='YES', dataType='datetime', characterMaximumLength=0, characterOctetLength=0, numericPrecision=0, numericScale=0, datetimePrecision=0, characterSetName='null', collationName='null', columnType='datetime', columnKey='', extra='', privileges='select', columnComment='', generationExpression=''}*/
private Date updateTime;

/**Column{tableCatalog='def', tableSchema='information_schema', tableName='TABLES', columnName='CHECK_TIME', ordinalPosition=17, columnDefault='null', isNullable='YES', dataType='datetime', characterMaximumLength=0, characterOctetLength=0, numericPrecision=0, numericScale=0, datetimePrecision=0, characterSetName='null', collationName='null', columnType='datetime', columnKey='', extra='', privileges='select', columnComment='', generationExpression=''}*/
private Date checkTime;

/**Column{tableCatalog='def', tableSchema='information_schema', tableName='TABLES', columnName='TABLE_COLLATION', ordinalPosition=18, columnDefault='null', isNullable='YES', dataType='varchar', characterMaximumLength=32, characterOctetLength=96, numericPrecision=0, numericScale=0, datetimePrecision=0, characterSetName='utf8', collationName='utf8_general_ci', columnType='varchar(32)', columnKey='', extra='', privileges='select', columnComment='', generationExpression=''}*/
private String tableCollation;

/**Column{tableCatalog='def', tableSchema='information_schema', tableName='TABLES', columnName='CHECKSUM', ordinalPosition=19, columnDefault='null', isNullable='YES', dataType='bigint', characterMaximumLength=0, characterOctetLength=0, numericPrecision=20, numericScale=0, datetimePrecision=0, characterSetName='null', collationName='null', columnType='bigint(21) unsigned', columnKey='', extra='', privileges='select', columnComment='', generationExpression=''}*/
private Long checksum;

/**Column{tableCatalog='def', tableSchema='information_schema', tableName='TABLES', columnName='CREATE_OPTIONS', ordinalPosition=20, columnDefault='null', isNullable='YES', dataType='varchar', characterMaximumLength=255, characterOctetLength=765, numericPrecision=0, numericScale=0, datetimePrecision=0, characterSetName='utf8', collationName='utf8_general_ci', columnType='varchar(255)', columnKey='', extra='', privileges='select', columnComment='', generationExpression=''}*/
private String createOptions;

/**Column{tableCatalog='def', tableSchema='information_schema', tableName='TABLES', columnName='TABLE_COMMENT', ordinalPosition=21, columnDefault='', isNullable='NO', dataType='varchar', characterMaximumLength=2048, characterOctetLength=6144, numericPrecision=0, numericScale=0, datetimePrecision=0, characterSetName='utf8', collationName='utf8_general_ci', columnType='varchar(2048)', columnKey='', extra='', privileges='select', columnComment='', generationExpression=''}*/
private String tableComment;

public String getTableCatalog(){
return tableCatalog;
}

public String getTableSchema(){
return tableSchema;
}

public String getTableName(){
return tableName;
}

public String getTableType(){
return tableType;
}

public String getEngine(){
return engine;
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

public Long getAutoIncrement(){
return autoIncrement;
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

public String getTableCollation(){
return tableCollation;
}

public Long getChecksum(){
return checksum;
}

public String getCreateOptions(){
return createOptions;
}

public String getTableComment(){
return tableComment;
}

}