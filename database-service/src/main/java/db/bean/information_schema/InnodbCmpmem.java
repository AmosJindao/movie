package db.bean.information_schema;


/**
*/
public class InnodbCmpmem{
/**Column{tableCatalog='def', tableSchema='information_schema', tableName='INNODB_CMPMEM', columnName='page_size', ordinalPosition=1, columnDefault='0', isNullable='NO', dataType='int', characterMaximumLength=0, characterOctetLength=0, numericPrecision=10, numericScale=0, datetimePrecision=0, characterSetName='null', collationName='null', columnType='int(5)', columnKey='', extra='', privileges='select', columnComment='', generationExpression=''}*/
private Integer pageSize;

/**Column{tableCatalog='def', tableSchema='information_schema', tableName='INNODB_CMPMEM', columnName='buffer_pool_instance', ordinalPosition=2, columnDefault='0', isNullable='NO', dataType='int', characterMaximumLength=0, characterOctetLength=0, numericPrecision=10, numericScale=0, datetimePrecision=0, characterSetName='null', collationName='null', columnType='int(11)', columnKey='', extra='', privileges='select', columnComment='', generationExpression=''}*/
private Integer bufferPoolInstance;

/**Column{tableCatalog='def', tableSchema='information_schema', tableName='INNODB_CMPMEM', columnName='pages_used', ordinalPosition=3, columnDefault='0', isNullable='NO', dataType='int', characterMaximumLength=0, characterOctetLength=0, numericPrecision=10, numericScale=0, datetimePrecision=0, characterSetName='null', collationName='null', columnType='int(11)', columnKey='', extra='', privileges='select', columnComment='', generationExpression=''}*/
private Integer pagesUsed;

/**Column{tableCatalog='def', tableSchema='information_schema', tableName='INNODB_CMPMEM', columnName='pages_free', ordinalPosition=4, columnDefault='0', isNullable='NO', dataType='int', characterMaximumLength=0, characterOctetLength=0, numericPrecision=10, numericScale=0, datetimePrecision=0, characterSetName='null', collationName='null', columnType='int(11)', columnKey='', extra='', privileges='select', columnComment='', generationExpression=''}*/
private Integer pagesFree;

/**Column{tableCatalog='def', tableSchema='information_schema', tableName='INNODB_CMPMEM', columnName='relocation_ops', ordinalPosition=5, columnDefault='0', isNullable='NO', dataType='bigint', characterMaximumLength=0, characterOctetLength=0, numericPrecision=19, numericScale=0, datetimePrecision=0, characterSetName='null', collationName='null', columnType='bigint(21)', columnKey='', extra='', privileges='select', columnComment='', generationExpression=''}*/
private Long relocationOps;

/**Column{tableCatalog='def', tableSchema='information_schema', tableName='INNODB_CMPMEM', columnName='relocation_time', ordinalPosition=6, columnDefault='0', isNullable='NO', dataType='int', characterMaximumLength=0, characterOctetLength=0, numericPrecision=10, numericScale=0, datetimePrecision=0, characterSetName='null', collationName='null', columnType='int(11)', columnKey='', extra='', privileges='select', columnComment='', generationExpression=''}*/
private Integer relocationTime;

public Integer getPageSize(){
return pageSize;
}

public Integer getBufferPoolInstance(){
return bufferPoolInstance;
}

public Integer getPagesUsed(){
return pagesUsed;
}

public Integer getPagesFree(){
return pagesFree;
}

public Long getRelocationOps(){
return relocationOps;
}

public Integer getRelocationTime(){
return relocationTime;
}

}