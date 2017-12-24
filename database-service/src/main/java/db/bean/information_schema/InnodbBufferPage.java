package db.bean.information_schema;


/* SELECT POOL_ID AS poolId, BLOCK_ID AS blockId, SPACE AS space, PAGE_NUMBER AS pageNumber, PAGE_TYPE AS pageType, FLUSH_TYPE AS flushType, FIX_COUNT AS fixCount, IS_HASHED AS isHashed, NEWEST_MODIFICATION AS newestModification, OLDEST_MODIFICATION AS oldestModification, ACCESS_TIME AS accessTime, TABLE_NAME AS tableName, INDEX_NAME AS indexName, NUMBER_RECORDS AS numberRecords, DATA_SIZE AS dataSize, COMPRESSED_SIZE AS compressedSize, PAGE_STATE AS pageState, IO_FIX AS ioFix, IS_OLD AS isOld, FREE_PAGE_CLOCK AS freePageClock FROM information_schema.INNODB_BUFFER_PAGE */
/**
*/
public class InnodbBufferPage{
/**Column{tableCatalog='def', tableSchema='information_schema', tableName='INNODB_BUFFER_PAGE', columnName='POOL_ID', ordinalPosition=1, columnDefault='0', isNullable='NO', dataType='bigint', characterMaximumLength=0, characterOctetLength=0, numericPrecision=20, numericScale=0, datetimePrecision=0, characterSetName='null', collationName='null', columnType='bigint(21) unsigned', columnKey='', extra='', privileges='select', columnComment='', generationExpression=''}*/
private Long poolId;

/**Column{tableCatalog='def', tableSchema='information_schema', tableName='INNODB_BUFFER_PAGE', columnName='BLOCK_ID', ordinalPosition=2, columnDefault='0', isNullable='NO', dataType='bigint', characterMaximumLength=0, characterOctetLength=0, numericPrecision=20, numericScale=0, datetimePrecision=0, characterSetName='null', collationName='null', columnType='bigint(21) unsigned', columnKey='', extra='', privileges='select', columnComment='', generationExpression=''}*/
private Long blockId;

/**Column{tableCatalog='def', tableSchema='information_schema', tableName='INNODB_BUFFER_PAGE', columnName='SPACE', ordinalPosition=3, columnDefault='0', isNullable='NO', dataType='bigint', characterMaximumLength=0, characterOctetLength=0, numericPrecision=20, numericScale=0, datetimePrecision=0, characterSetName='null', collationName='null', columnType='bigint(21) unsigned', columnKey='', extra='', privileges='select', columnComment='', generationExpression=''}*/
private Long space;

/**Column{tableCatalog='def', tableSchema='information_schema', tableName='INNODB_BUFFER_PAGE', columnName='PAGE_NUMBER', ordinalPosition=4, columnDefault='0', isNullable='NO', dataType='bigint', characterMaximumLength=0, characterOctetLength=0, numericPrecision=20, numericScale=0, datetimePrecision=0, characterSetName='null', collationName='null', columnType='bigint(21) unsigned', columnKey='', extra='', privileges='select', columnComment='', generationExpression=''}*/
private Long pageNumber;

/**Column{tableCatalog='def', tableSchema='information_schema', tableName='INNODB_BUFFER_PAGE', columnName='PAGE_TYPE', ordinalPosition=5, columnDefault='null', isNullable='YES', dataType='varchar', characterMaximumLength=64, characterOctetLength=192, numericPrecision=0, numericScale=0, datetimePrecision=0, characterSetName='utf8', collationName='utf8_general_ci', columnType='varchar(64)', columnKey='', extra='', privileges='select', columnComment='', generationExpression=''}*/
private String pageType;

/**Column{tableCatalog='def', tableSchema='information_schema', tableName='INNODB_BUFFER_PAGE', columnName='FLUSH_TYPE', ordinalPosition=6, columnDefault='0', isNullable='NO', dataType='bigint', characterMaximumLength=0, characterOctetLength=0, numericPrecision=20, numericScale=0, datetimePrecision=0, characterSetName='null', collationName='null', columnType='bigint(21) unsigned', columnKey='', extra='', privileges='select', columnComment='', generationExpression=''}*/
private Long flushType;

/**Column{tableCatalog='def', tableSchema='information_schema', tableName='INNODB_BUFFER_PAGE', columnName='FIX_COUNT', ordinalPosition=7, columnDefault='0', isNullable='NO', dataType='bigint', characterMaximumLength=0, characterOctetLength=0, numericPrecision=20, numericScale=0, datetimePrecision=0, characterSetName='null', collationName='null', columnType='bigint(21) unsigned', columnKey='', extra='', privileges='select', columnComment='', generationExpression=''}*/
private Long fixCount;

/**Column{tableCatalog='def', tableSchema='information_schema', tableName='INNODB_BUFFER_PAGE', columnName='IS_HASHED', ordinalPosition=8, columnDefault='null', isNullable='YES', dataType='varchar', characterMaximumLength=3, characterOctetLength=9, numericPrecision=0, numericScale=0, datetimePrecision=0, characterSetName='utf8', collationName='utf8_general_ci', columnType='varchar(3)', columnKey='', extra='', privileges='select', columnComment='', generationExpression=''}*/
private String isHashed;

/**Column{tableCatalog='def', tableSchema='information_schema', tableName='INNODB_BUFFER_PAGE', columnName='NEWEST_MODIFICATION', ordinalPosition=9, columnDefault='0', isNullable='NO', dataType='bigint', characterMaximumLength=0, characterOctetLength=0, numericPrecision=20, numericScale=0, datetimePrecision=0, characterSetName='null', collationName='null', columnType='bigint(21) unsigned', columnKey='', extra='', privileges='select', columnComment='', generationExpression=''}*/
private Long newestModification;

/**Column{tableCatalog='def', tableSchema='information_schema', tableName='INNODB_BUFFER_PAGE', columnName='OLDEST_MODIFICATION', ordinalPosition=10, columnDefault='0', isNullable='NO', dataType='bigint', characterMaximumLength=0, characterOctetLength=0, numericPrecision=20, numericScale=0, datetimePrecision=0, characterSetName='null', collationName='null', columnType='bigint(21) unsigned', columnKey='', extra='', privileges='select', columnComment='', generationExpression=''}*/
private Long oldestModification;

/**Column{tableCatalog='def', tableSchema='information_schema', tableName='INNODB_BUFFER_PAGE', columnName='ACCESS_TIME', ordinalPosition=11, columnDefault='0', isNullable='NO', dataType='bigint', characterMaximumLength=0, characterOctetLength=0, numericPrecision=20, numericScale=0, datetimePrecision=0, characterSetName='null', collationName='null', columnType='bigint(21) unsigned', columnKey='', extra='', privileges='select', columnComment='', generationExpression=''}*/
private Long accessTime;

/**Column{tableCatalog='def', tableSchema='information_schema', tableName='INNODB_BUFFER_PAGE', columnName='TABLE_NAME', ordinalPosition=12, columnDefault='null', isNullable='YES', dataType='varchar', characterMaximumLength=1024, characterOctetLength=3072, numericPrecision=0, numericScale=0, datetimePrecision=0, characterSetName='utf8', collationName='utf8_general_ci', columnType='varchar(1024)', columnKey='', extra='', privileges='select', columnComment='', generationExpression=''}*/
private String tableName;

/**Column{tableCatalog='def', tableSchema='information_schema', tableName='INNODB_BUFFER_PAGE', columnName='INDEX_NAME', ordinalPosition=13, columnDefault='null', isNullable='YES', dataType='varchar', characterMaximumLength=1024, characterOctetLength=3072, numericPrecision=0, numericScale=0, datetimePrecision=0, characterSetName='utf8', collationName='utf8_general_ci', columnType='varchar(1024)', columnKey='', extra='', privileges='select', columnComment='', generationExpression=''}*/
private String indexName;

/**Column{tableCatalog='def', tableSchema='information_schema', tableName='INNODB_BUFFER_PAGE', columnName='NUMBER_RECORDS', ordinalPosition=14, columnDefault='0', isNullable='NO', dataType='bigint', characterMaximumLength=0, characterOctetLength=0, numericPrecision=20, numericScale=0, datetimePrecision=0, characterSetName='null', collationName='null', columnType='bigint(21) unsigned', columnKey='', extra='', privileges='select', columnComment='', generationExpression=''}*/
private Long numberRecords;

/**Column{tableCatalog='def', tableSchema='information_schema', tableName='INNODB_BUFFER_PAGE', columnName='DATA_SIZE', ordinalPosition=15, columnDefault='0', isNullable='NO', dataType='bigint', characterMaximumLength=0, characterOctetLength=0, numericPrecision=20, numericScale=0, datetimePrecision=0, characterSetName='null', collationName='null', columnType='bigint(21) unsigned', columnKey='', extra='', privileges='select', columnComment='', generationExpression=''}*/
private Long dataSize;

/**Column{tableCatalog='def', tableSchema='information_schema', tableName='INNODB_BUFFER_PAGE', columnName='COMPRESSED_SIZE', ordinalPosition=16, columnDefault='0', isNullable='NO', dataType='bigint', characterMaximumLength=0, characterOctetLength=0, numericPrecision=20, numericScale=0, datetimePrecision=0, characterSetName='null', collationName='null', columnType='bigint(21) unsigned', columnKey='', extra='', privileges='select', columnComment='', generationExpression=''}*/
private Long compressedSize;

/**Column{tableCatalog='def', tableSchema='information_schema', tableName='INNODB_BUFFER_PAGE', columnName='PAGE_STATE', ordinalPosition=17, columnDefault='null', isNullable='YES', dataType='varchar', characterMaximumLength=64, characterOctetLength=192, numericPrecision=0, numericScale=0, datetimePrecision=0, characterSetName='utf8', collationName='utf8_general_ci', columnType='varchar(64)', columnKey='', extra='', privileges='select', columnComment='', generationExpression=''}*/
private String pageState;

/**Column{tableCatalog='def', tableSchema='information_schema', tableName='INNODB_BUFFER_PAGE', columnName='IO_FIX', ordinalPosition=18, columnDefault='null', isNullable='YES', dataType='varchar', characterMaximumLength=64, characterOctetLength=192, numericPrecision=0, numericScale=0, datetimePrecision=0, characterSetName='utf8', collationName='utf8_general_ci', columnType='varchar(64)', columnKey='', extra='', privileges='select', columnComment='', generationExpression=''}*/
private String ioFix;

/**Column{tableCatalog='def', tableSchema='information_schema', tableName='INNODB_BUFFER_PAGE', columnName='IS_OLD', ordinalPosition=19, columnDefault='null', isNullable='YES', dataType='varchar', characterMaximumLength=3, characterOctetLength=9, numericPrecision=0, numericScale=0, datetimePrecision=0, characterSetName='utf8', collationName='utf8_general_ci', columnType='varchar(3)', columnKey='', extra='', privileges='select', columnComment='', generationExpression=''}*/
private String isOld;

/**Column{tableCatalog='def', tableSchema='information_schema', tableName='INNODB_BUFFER_PAGE', columnName='FREE_PAGE_CLOCK', ordinalPosition=20, columnDefault='0', isNullable='NO', dataType='bigint', characterMaximumLength=0, characterOctetLength=0, numericPrecision=20, numericScale=0, datetimePrecision=0, characterSetName='null', collationName='null', columnType='bigint(21) unsigned', columnKey='', extra='', privileges='select', columnComment='', generationExpression=''}*/
private Long freePageClock;

public Long getPoolId(){
return poolId;
}

public Long getBlockId(){
return blockId;
}

public Long getSpace(){
return space;
}

public Long getPageNumber(){
return pageNumber;
}

public String getPageType(){
return pageType;
}

public Long getFlushType(){
return flushType;
}

public Long getFixCount(){
return fixCount;
}

public String getIsHashed(){
return isHashed;
}

public Long getNewestModification(){
return newestModification;
}

public Long getOldestModification(){
return oldestModification;
}

public Long getAccessTime(){
return accessTime;
}

public String getTableName(){
return tableName;
}

public String getIndexName(){
return indexName;
}

public Long getNumberRecords(){
return numberRecords;
}

public Long getDataSize(){
return dataSize;
}

public Long getCompressedSize(){
return compressedSize;
}

public String getPageState(){
return pageState;
}

public String getIoFix(){
return ioFix;
}

public String getIsOld(){
return isOld;
}

public Long getFreePageClock(){
return freePageClock;
}

}