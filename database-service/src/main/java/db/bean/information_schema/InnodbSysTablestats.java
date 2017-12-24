package db.bean.information_schema;


/* SELECT TABLE_ID AS tableId, NAME AS name, STATS_INITIALIZED AS statsInitialized, NUM_ROWS AS numRows, CLUST_INDEX_SIZE AS clustIndexSize, OTHER_INDEX_SIZE AS otherIndexSize, MODIFIED_COUNTER AS modifiedCounter, AUTOINC AS autoinc, REF_COUNT AS refCount FROM information_schema.INNODB_SYS_TABLESTATS */
/**
*/
public class InnodbSysTablestats{
/**Column{tableCatalog='def', tableSchema='information_schema', tableName='INNODB_SYS_TABLESTATS', columnName='TABLE_ID', ordinalPosition=1, columnDefault='0', isNullable='NO', dataType='bigint', characterMaximumLength=0, characterOctetLength=0, numericPrecision=20, numericScale=0, datetimePrecision=0, characterSetName='null', collationName='null', columnType='bigint(21) unsigned', columnKey='', extra='', privileges='select', columnComment='', generationExpression=''}*/
private Long tableId;

/**Column{tableCatalog='def', tableSchema='information_schema', tableName='INNODB_SYS_TABLESTATS', columnName='NAME', ordinalPosition=2, columnDefault='', isNullable='NO', dataType='varchar', characterMaximumLength=193, characterOctetLength=579, numericPrecision=0, numericScale=0, datetimePrecision=0, characterSetName='utf8', collationName='utf8_general_ci', columnType='varchar(193)', columnKey='', extra='', privileges='select', columnComment='', generationExpression=''}*/
private String name;

/**Column{tableCatalog='def', tableSchema='information_schema', tableName='INNODB_SYS_TABLESTATS', columnName='STATS_INITIALIZED', ordinalPosition=3, columnDefault='', isNullable='NO', dataType='varchar', characterMaximumLength=193, characterOctetLength=579, numericPrecision=0, numericScale=0, datetimePrecision=0, characterSetName='utf8', collationName='utf8_general_ci', columnType='varchar(193)', columnKey='', extra='', privileges='select', columnComment='', generationExpression=''}*/
private String statsInitialized;

/**Column{tableCatalog='def', tableSchema='information_schema', tableName='INNODB_SYS_TABLESTATS', columnName='NUM_ROWS', ordinalPosition=4, columnDefault='0', isNullable='NO', dataType='bigint', characterMaximumLength=0, characterOctetLength=0, numericPrecision=20, numericScale=0, datetimePrecision=0, characterSetName='null', collationName='null', columnType='bigint(21) unsigned', columnKey='', extra='', privileges='select', columnComment='', generationExpression=''}*/
private Long numRows;

/**Column{tableCatalog='def', tableSchema='information_schema', tableName='INNODB_SYS_TABLESTATS', columnName='CLUST_INDEX_SIZE', ordinalPosition=5, columnDefault='0', isNullable='NO', dataType='bigint', characterMaximumLength=0, characterOctetLength=0, numericPrecision=20, numericScale=0, datetimePrecision=0, characterSetName='null', collationName='null', columnType='bigint(21) unsigned', columnKey='', extra='', privileges='select', columnComment='', generationExpression=''}*/
private Long clustIndexSize;

/**Column{tableCatalog='def', tableSchema='information_schema', tableName='INNODB_SYS_TABLESTATS', columnName='OTHER_INDEX_SIZE', ordinalPosition=6, columnDefault='0', isNullable='NO', dataType='bigint', characterMaximumLength=0, characterOctetLength=0, numericPrecision=20, numericScale=0, datetimePrecision=0, characterSetName='null', collationName='null', columnType='bigint(21) unsigned', columnKey='', extra='', privileges='select', columnComment='', generationExpression=''}*/
private Long otherIndexSize;

/**Column{tableCatalog='def', tableSchema='information_schema', tableName='INNODB_SYS_TABLESTATS', columnName='MODIFIED_COUNTER', ordinalPosition=7, columnDefault='0', isNullable='NO', dataType='bigint', characterMaximumLength=0, characterOctetLength=0, numericPrecision=20, numericScale=0, datetimePrecision=0, characterSetName='null', collationName='null', columnType='bigint(21) unsigned', columnKey='', extra='', privileges='select', columnComment='', generationExpression=''}*/
private Long modifiedCounter;

/**Column{tableCatalog='def', tableSchema='information_schema', tableName='INNODB_SYS_TABLESTATS', columnName='AUTOINC', ordinalPosition=8, columnDefault='0', isNullable='NO', dataType='bigint', characterMaximumLength=0, characterOctetLength=0, numericPrecision=20, numericScale=0, datetimePrecision=0, characterSetName='null', collationName='null', columnType='bigint(21) unsigned', columnKey='', extra='', privileges='select', columnComment='', generationExpression=''}*/
private Long autoinc;

/**Column{tableCatalog='def', tableSchema='information_schema', tableName='INNODB_SYS_TABLESTATS', columnName='REF_COUNT', ordinalPosition=9, columnDefault='0', isNullable='NO', dataType='int', characterMaximumLength=0, characterOctetLength=0, numericPrecision=10, numericScale=0, datetimePrecision=0, characterSetName='null', collationName='null', columnType='int(11)', columnKey='', extra='', privileges='select', columnComment='', generationExpression=''}*/
private Integer refCount;

public Long getTableId(){
return tableId;
}

public String getName(){
return name;
}

public String getStatsInitialized(){
return statsInitialized;
}

public Long getNumRows(){
return numRows;
}

public Long getClustIndexSize(){
return clustIndexSize;
}

public Long getOtherIndexSize(){
return otherIndexSize;
}

public Long getModifiedCounter(){
return modifiedCounter;
}

public Long getAutoinc(){
return autoinc;
}

public Integer getRefCount(){
return refCount;
}

}