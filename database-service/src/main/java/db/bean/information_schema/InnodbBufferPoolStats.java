package db.bean.information_schema;


/**
*/
public class InnodbBufferPoolStats{
/**Column{tableCatalog='def', tableSchema='information_schema', tableName='INNODB_BUFFER_POOL_STATS', columnName='POOL_ID', ordinalPosition=1, columnDefault='0', isNullable='NO', dataType='bigint', characterMaximumLength=0, characterOctetLength=0, numericPrecision=20, numericScale=0, datetimePrecision=0, characterSetName='null', collationName='null', columnType='bigint(21) unsigned', columnKey='', extra='', privileges='select', columnComment='', generationExpression=''}*/
private Long poolId;

/**Column{tableCatalog='def', tableSchema='information_schema', tableName='INNODB_BUFFER_POOL_STATS', columnName='POOL_SIZE', ordinalPosition=2, columnDefault='0', isNullable='NO', dataType='bigint', characterMaximumLength=0, characterOctetLength=0, numericPrecision=20, numericScale=0, datetimePrecision=0, characterSetName='null', collationName='null', columnType='bigint(21) unsigned', columnKey='', extra='', privileges='select', columnComment='', generationExpression=''}*/
private Long poolSize;

/**Column{tableCatalog='def', tableSchema='information_schema', tableName='INNODB_BUFFER_POOL_STATS', columnName='FREE_BUFFERS', ordinalPosition=3, columnDefault='0', isNullable='NO', dataType='bigint', characterMaximumLength=0, characterOctetLength=0, numericPrecision=20, numericScale=0, datetimePrecision=0, characterSetName='null', collationName='null', columnType='bigint(21) unsigned', columnKey='', extra='', privileges='select', columnComment='', generationExpression=''}*/
private Long freeBuffers;

/**Column{tableCatalog='def', tableSchema='information_schema', tableName='INNODB_BUFFER_POOL_STATS', columnName='DATABASE_PAGES', ordinalPosition=4, columnDefault='0', isNullable='NO', dataType='bigint', characterMaximumLength=0, characterOctetLength=0, numericPrecision=20, numericScale=0, datetimePrecision=0, characterSetName='null', collationName='null', columnType='bigint(21) unsigned', columnKey='', extra='', privileges='select', columnComment='', generationExpression=''}*/
private Long databasePages;

/**Column{tableCatalog='def', tableSchema='information_schema', tableName='INNODB_BUFFER_POOL_STATS', columnName='OLD_DATABASE_PAGES', ordinalPosition=5, columnDefault='0', isNullable='NO', dataType='bigint', characterMaximumLength=0, characterOctetLength=0, numericPrecision=20, numericScale=0, datetimePrecision=0, characterSetName='null', collationName='null', columnType='bigint(21) unsigned', columnKey='', extra='', privileges='select', columnComment='', generationExpression=''}*/
private Long oldDatabasePages;

/**Column{tableCatalog='def', tableSchema='information_schema', tableName='INNODB_BUFFER_POOL_STATS', columnName='MODIFIED_DATABASE_PAGES', ordinalPosition=6, columnDefault='0', isNullable='NO', dataType='bigint', characterMaximumLength=0, characterOctetLength=0, numericPrecision=20, numericScale=0, datetimePrecision=0, characterSetName='null', collationName='null', columnType='bigint(21) unsigned', columnKey='', extra='', privileges='select', columnComment='', generationExpression=''}*/
private Long modifiedDatabasePages;

/**Column{tableCatalog='def', tableSchema='information_schema', tableName='INNODB_BUFFER_POOL_STATS', columnName='PENDING_DECOMPRESS', ordinalPosition=7, columnDefault='0', isNullable='NO', dataType='bigint', characterMaximumLength=0, characterOctetLength=0, numericPrecision=20, numericScale=0, datetimePrecision=0, characterSetName='null', collationName='null', columnType='bigint(21) unsigned', columnKey='', extra='', privileges='select', columnComment='', generationExpression=''}*/
private Long pendingDecompress;

/**Column{tableCatalog='def', tableSchema='information_schema', tableName='INNODB_BUFFER_POOL_STATS', columnName='PENDING_READS', ordinalPosition=8, columnDefault='0', isNullable='NO', dataType='bigint', characterMaximumLength=0, characterOctetLength=0, numericPrecision=20, numericScale=0, datetimePrecision=0, characterSetName='null', collationName='null', columnType='bigint(21) unsigned', columnKey='', extra='', privileges='select', columnComment='', generationExpression=''}*/
private Long pendingReads;

/**Column{tableCatalog='def', tableSchema='information_schema', tableName='INNODB_BUFFER_POOL_STATS', columnName='PENDING_FLUSH_LRU', ordinalPosition=9, columnDefault='0', isNullable='NO', dataType='bigint', characterMaximumLength=0, characterOctetLength=0, numericPrecision=20, numericScale=0, datetimePrecision=0, characterSetName='null', collationName='null', columnType='bigint(21) unsigned', columnKey='', extra='', privileges='select', columnComment='', generationExpression=''}*/
private Long pendingFlushLru;

/**Column{tableCatalog='def', tableSchema='information_schema', tableName='INNODB_BUFFER_POOL_STATS', columnName='PENDING_FLUSH_LIST', ordinalPosition=10, columnDefault='0', isNullable='NO', dataType='bigint', characterMaximumLength=0, characterOctetLength=0, numericPrecision=20, numericScale=0, datetimePrecision=0, characterSetName='null', collationName='null', columnType='bigint(21) unsigned', columnKey='', extra='', privileges='select', columnComment='', generationExpression=''}*/
private Long pendingFlushList;

/**Column{tableCatalog='def', tableSchema='information_schema', tableName='INNODB_BUFFER_POOL_STATS', columnName='PAGES_MADE_YOUNG', ordinalPosition=11, columnDefault='0', isNullable='NO', dataType='bigint', characterMaximumLength=0, characterOctetLength=0, numericPrecision=20, numericScale=0, datetimePrecision=0, characterSetName='null', collationName='null', columnType='bigint(21) unsigned', columnKey='', extra='', privileges='select', columnComment='', generationExpression=''}*/
private Long pagesMadeYoung;

/**Column{tableCatalog='def', tableSchema='information_schema', tableName='INNODB_BUFFER_POOL_STATS', columnName='PAGES_NOT_MADE_YOUNG', ordinalPosition=12, columnDefault='0', isNullable='NO', dataType='bigint', characterMaximumLength=0, characterOctetLength=0, numericPrecision=20, numericScale=0, datetimePrecision=0, characterSetName='null', collationName='null', columnType='bigint(21) unsigned', columnKey='', extra='', privileges='select', columnComment='', generationExpression=''}*/
private Long pagesNotMadeYoung;

/**Column{tableCatalog='def', tableSchema='information_schema', tableName='INNODB_BUFFER_POOL_STATS', columnName='PAGES_MADE_YOUNG_RATE', ordinalPosition=13, columnDefault='0', isNullable='NO', dataType='double', characterMaximumLength=0, characterOctetLength=0, numericPrecision=12, numericScale=0, datetimePrecision=0, characterSetName='null', collationName='null', columnType='double', columnKey='', extra='', privileges='select', columnComment='', generationExpression=''}*/
private Double pagesMadeYoungRate;

/**Column{tableCatalog='def', tableSchema='information_schema', tableName='INNODB_BUFFER_POOL_STATS', columnName='PAGES_MADE_NOT_YOUNG_RATE', ordinalPosition=14, columnDefault='0', isNullable='NO', dataType='double', characterMaximumLength=0, characterOctetLength=0, numericPrecision=12, numericScale=0, datetimePrecision=0, characterSetName='null', collationName='null', columnType='double', columnKey='', extra='', privileges='select', columnComment='', generationExpression=''}*/
private Double pagesMadeNotYoungRate;

/**Column{tableCatalog='def', tableSchema='information_schema', tableName='INNODB_BUFFER_POOL_STATS', columnName='NUMBER_PAGES_READ', ordinalPosition=15, columnDefault='0', isNullable='NO', dataType='bigint', characterMaximumLength=0, characterOctetLength=0, numericPrecision=20, numericScale=0, datetimePrecision=0, characterSetName='null', collationName='null', columnType='bigint(21) unsigned', columnKey='', extra='', privileges='select', columnComment='', generationExpression=''}*/
private Long numberPagesRead;

/**Column{tableCatalog='def', tableSchema='information_schema', tableName='INNODB_BUFFER_POOL_STATS', columnName='NUMBER_PAGES_CREATED', ordinalPosition=16, columnDefault='0', isNullable='NO', dataType='bigint', characterMaximumLength=0, characterOctetLength=0, numericPrecision=20, numericScale=0, datetimePrecision=0, characterSetName='null', collationName='null', columnType='bigint(21) unsigned', columnKey='', extra='', privileges='select', columnComment='', generationExpression=''}*/
private Long numberPagesCreated;

/**Column{tableCatalog='def', tableSchema='information_schema', tableName='INNODB_BUFFER_POOL_STATS', columnName='NUMBER_PAGES_WRITTEN', ordinalPosition=17, columnDefault='0', isNullable='NO', dataType='bigint', characterMaximumLength=0, characterOctetLength=0, numericPrecision=20, numericScale=0, datetimePrecision=0, characterSetName='null', collationName='null', columnType='bigint(21) unsigned', columnKey='', extra='', privileges='select', columnComment='', generationExpression=''}*/
private Long numberPagesWritten;

/**Column{tableCatalog='def', tableSchema='information_schema', tableName='INNODB_BUFFER_POOL_STATS', columnName='PAGES_READ_RATE', ordinalPosition=18, columnDefault='0', isNullable='NO', dataType='double', characterMaximumLength=0, characterOctetLength=0, numericPrecision=12, numericScale=0, datetimePrecision=0, characterSetName='null', collationName='null', columnType='double', columnKey='', extra='', privileges='select', columnComment='', generationExpression=''}*/
private Double pagesReadRate;

/**Column{tableCatalog='def', tableSchema='information_schema', tableName='INNODB_BUFFER_POOL_STATS', columnName='PAGES_CREATE_RATE', ordinalPosition=19, columnDefault='0', isNullable='NO', dataType='double', characterMaximumLength=0, characterOctetLength=0, numericPrecision=12, numericScale=0, datetimePrecision=0, characterSetName='null', collationName='null', columnType='double', columnKey='', extra='', privileges='select', columnComment='', generationExpression=''}*/
private Double pagesCreateRate;

/**Column{tableCatalog='def', tableSchema='information_schema', tableName='INNODB_BUFFER_POOL_STATS', columnName='PAGES_WRITTEN_RATE', ordinalPosition=20, columnDefault='0', isNullable='NO', dataType='double', characterMaximumLength=0, characterOctetLength=0, numericPrecision=12, numericScale=0, datetimePrecision=0, characterSetName='null', collationName='null', columnType='double', columnKey='', extra='', privileges='select', columnComment='', generationExpression=''}*/
private Double pagesWrittenRate;

/**Column{tableCatalog='def', tableSchema='information_schema', tableName='INNODB_BUFFER_POOL_STATS', columnName='NUMBER_PAGES_GET', ordinalPosition=21, columnDefault='0', isNullable='NO', dataType='bigint', characterMaximumLength=0, characterOctetLength=0, numericPrecision=20, numericScale=0, datetimePrecision=0, characterSetName='null', collationName='null', columnType='bigint(21) unsigned', columnKey='', extra='', privileges='select', columnComment='', generationExpression=''}*/
private Long numberPagesGet;

/**Column{tableCatalog='def', tableSchema='information_schema', tableName='INNODB_BUFFER_POOL_STATS', columnName='HIT_RATE', ordinalPosition=22, columnDefault='0', isNullable='NO', dataType='bigint', characterMaximumLength=0, characterOctetLength=0, numericPrecision=20, numericScale=0, datetimePrecision=0, characterSetName='null', collationName='null', columnType='bigint(21) unsigned', columnKey='', extra='', privileges='select', columnComment='', generationExpression=''}*/
private Long hitRate;

/**Column{tableCatalog='def', tableSchema='information_schema', tableName='INNODB_BUFFER_POOL_STATS', columnName='YOUNG_MAKE_PER_THOUSAND_GETS', ordinalPosition=23, columnDefault='0', isNullable='NO', dataType='bigint', characterMaximumLength=0, characterOctetLength=0, numericPrecision=20, numericScale=0, datetimePrecision=0, characterSetName='null', collationName='null', columnType='bigint(21) unsigned', columnKey='', extra='', privileges='select', columnComment='', generationExpression=''}*/
private Long youngMakePerThousandGets;

/**Column{tableCatalog='def', tableSchema='information_schema', tableName='INNODB_BUFFER_POOL_STATS', columnName='NOT_YOUNG_MAKE_PER_THOUSAND_GETS', ordinalPosition=24, columnDefault='0', isNullable='NO', dataType='bigint', characterMaximumLength=0, characterOctetLength=0, numericPrecision=20, numericScale=0, datetimePrecision=0, characterSetName='null', collationName='null', columnType='bigint(21) unsigned', columnKey='', extra='', privileges='select', columnComment='', generationExpression=''}*/
private Long notYoungMakePerThousandGets;

/**Column{tableCatalog='def', tableSchema='information_schema', tableName='INNODB_BUFFER_POOL_STATS', columnName='NUMBER_PAGES_READ_AHEAD', ordinalPosition=25, columnDefault='0', isNullable='NO', dataType='bigint', characterMaximumLength=0, characterOctetLength=0, numericPrecision=20, numericScale=0, datetimePrecision=0, characterSetName='null', collationName='null', columnType='bigint(21) unsigned', columnKey='', extra='', privileges='select', columnComment='', generationExpression=''}*/
private Long numberPagesReadAhead;

/**Column{tableCatalog='def', tableSchema='information_schema', tableName='INNODB_BUFFER_POOL_STATS', columnName='NUMBER_READ_AHEAD_EVICTED', ordinalPosition=26, columnDefault='0', isNullable='NO', dataType='bigint', characterMaximumLength=0, characterOctetLength=0, numericPrecision=20, numericScale=0, datetimePrecision=0, characterSetName='null', collationName='null', columnType='bigint(21) unsigned', columnKey='', extra='', privileges='select', columnComment='', generationExpression=''}*/
private Long numberReadAheadEvicted;

/**Column{tableCatalog='def', tableSchema='information_schema', tableName='INNODB_BUFFER_POOL_STATS', columnName='READ_AHEAD_RATE', ordinalPosition=27, columnDefault='0', isNullable='NO', dataType='double', characterMaximumLength=0, characterOctetLength=0, numericPrecision=12, numericScale=0, datetimePrecision=0, characterSetName='null', collationName='null', columnType='double', columnKey='', extra='', privileges='select', columnComment='', generationExpression=''}*/
private Double readAheadRate;

/**Column{tableCatalog='def', tableSchema='information_schema', tableName='INNODB_BUFFER_POOL_STATS', columnName='READ_AHEAD_EVICTED_RATE', ordinalPosition=28, columnDefault='0', isNullable='NO', dataType='double', characterMaximumLength=0, characterOctetLength=0, numericPrecision=12, numericScale=0, datetimePrecision=0, characterSetName='null', collationName='null', columnType='double', columnKey='', extra='', privileges='select', columnComment='', generationExpression=''}*/
private Double readAheadEvictedRate;

/**Column{tableCatalog='def', tableSchema='information_schema', tableName='INNODB_BUFFER_POOL_STATS', columnName='LRU_IO_TOTAL', ordinalPosition=29, columnDefault='0', isNullable='NO', dataType='bigint', characterMaximumLength=0, characterOctetLength=0, numericPrecision=20, numericScale=0, datetimePrecision=0, characterSetName='null', collationName='null', columnType='bigint(21) unsigned', columnKey='', extra='', privileges='select', columnComment='', generationExpression=''}*/
private Long lruIoTotal;

/**Column{tableCatalog='def', tableSchema='information_schema', tableName='INNODB_BUFFER_POOL_STATS', columnName='LRU_IO_CURRENT', ordinalPosition=30, columnDefault='0', isNullable='NO', dataType='bigint', characterMaximumLength=0, characterOctetLength=0, numericPrecision=20, numericScale=0, datetimePrecision=0, characterSetName='null', collationName='null', columnType='bigint(21) unsigned', columnKey='', extra='', privileges='select', columnComment='', generationExpression=''}*/
private Long lruIoCurrent;

/**Column{tableCatalog='def', tableSchema='information_schema', tableName='INNODB_BUFFER_POOL_STATS', columnName='UNCOMPRESS_TOTAL', ordinalPosition=31, columnDefault='0', isNullable='NO', dataType='bigint', characterMaximumLength=0, characterOctetLength=0, numericPrecision=20, numericScale=0, datetimePrecision=0, characterSetName='null', collationName='null', columnType='bigint(21) unsigned', columnKey='', extra='', privileges='select', columnComment='', generationExpression=''}*/
private Long uncompressTotal;

/**Column{tableCatalog='def', tableSchema='information_schema', tableName='INNODB_BUFFER_POOL_STATS', columnName='UNCOMPRESS_CURRENT', ordinalPosition=32, columnDefault='0', isNullable='NO', dataType='bigint', characterMaximumLength=0, characterOctetLength=0, numericPrecision=20, numericScale=0, datetimePrecision=0, characterSetName='null', collationName='null', columnType='bigint(21) unsigned', columnKey='', extra='', privileges='select', columnComment='', generationExpression=''}*/
private Long uncompressCurrent;

public Long getPoolId(){
return poolId;
}

public Long getPoolSize(){
return poolSize;
}

public Long getFreeBuffers(){
return freeBuffers;
}

public Long getDatabasePages(){
return databasePages;
}

public Long getOldDatabasePages(){
return oldDatabasePages;
}

public Long getModifiedDatabasePages(){
return modifiedDatabasePages;
}

public Long getPendingDecompress(){
return pendingDecompress;
}

public Long getPendingReads(){
return pendingReads;
}

public Long getPendingFlushLru(){
return pendingFlushLru;
}

public Long getPendingFlushList(){
return pendingFlushList;
}

public Long getPagesMadeYoung(){
return pagesMadeYoung;
}

public Long getPagesNotMadeYoung(){
return pagesNotMadeYoung;
}

public Double getPagesMadeYoungRate(){
return pagesMadeYoungRate;
}

public Double getPagesMadeNotYoungRate(){
return pagesMadeNotYoungRate;
}

public Long getNumberPagesRead(){
return numberPagesRead;
}

public Long getNumberPagesCreated(){
return numberPagesCreated;
}

public Long getNumberPagesWritten(){
return numberPagesWritten;
}

public Double getPagesReadRate(){
return pagesReadRate;
}

public Double getPagesCreateRate(){
return pagesCreateRate;
}

public Double getPagesWrittenRate(){
return pagesWrittenRate;
}

public Long getNumberPagesGet(){
return numberPagesGet;
}

public Long getHitRate(){
return hitRate;
}

public Long getYoungMakePerThousandGets(){
return youngMakePerThousandGets;
}

public Long getNotYoungMakePerThousandGets(){
return notYoungMakePerThousandGets;
}

public Long getNumberPagesReadAhead(){
return numberPagesReadAhead;
}

public Long getNumberReadAheadEvicted(){
return numberReadAheadEvicted;
}

public Double getReadAheadRate(){
return readAheadRate;
}

public Double getReadAheadEvictedRate(){
return readAheadEvictedRate;
}

public Long getLruIoTotal(){
return lruIoTotal;
}

public Long getLruIoCurrent(){
return lruIoCurrent;
}

public Long getUncompressTotal(){
return uncompressTotal;
}

public Long getUncompressCurrent(){
return uncompressCurrent;
}

}