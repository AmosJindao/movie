package db.bean.information_schema;


/**
*/
public class InnodbCmp{
/**Column{tableCatalog='def', tableSchema='information_schema', tableName='INNODB_CMP', columnName='page_size', ordinalPosition=1, columnDefault='0', isNullable='NO', dataType='int', characterMaximumLength=0, characterOctetLength=0, numericPrecision=10, numericScale=0, datetimePrecision=0, characterSetName='null', collationName='null', columnType='int(5)', columnKey='', extra='', privileges='select', columnComment='', generationExpression=''}*/
private Integer pageSize;

/**Column{tableCatalog='def', tableSchema='information_schema', tableName='INNODB_CMP', columnName='compress_ops', ordinalPosition=2, columnDefault='0', isNullable='NO', dataType='int', characterMaximumLength=0, characterOctetLength=0, numericPrecision=10, numericScale=0, datetimePrecision=0, characterSetName='null', collationName='null', columnType='int(11)', columnKey='', extra='', privileges='select', columnComment='', generationExpression=''}*/
private Integer compressOps;

/**Column{tableCatalog='def', tableSchema='information_schema', tableName='INNODB_CMP', columnName='compress_ops_ok', ordinalPosition=3, columnDefault='0', isNullable='NO', dataType='int', characterMaximumLength=0, characterOctetLength=0, numericPrecision=10, numericScale=0, datetimePrecision=0, characterSetName='null', collationName='null', columnType='int(11)', columnKey='', extra='', privileges='select', columnComment='', generationExpression=''}*/
private Integer compressOpsOk;

/**Column{tableCatalog='def', tableSchema='information_schema', tableName='INNODB_CMP', columnName='compress_time', ordinalPosition=4, columnDefault='0', isNullable='NO', dataType='int', characterMaximumLength=0, characterOctetLength=0, numericPrecision=10, numericScale=0, datetimePrecision=0, characterSetName='null', collationName='null', columnType='int(11)', columnKey='', extra='', privileges='select', columnComment='', generationExpression=''}*/
private Integer compressTime;

/**Column{tableCatalog='def', tableSchema='information_schema', tableName='INNODB_CMP', columnName='uncompress_ops', ordinalPosition=5, columnDefault='0', isNullable='NO', dataType='int', characterMaximumLength=0, characterOctetLength=0, numericPrecision=10, numericScale=0, datetimePrecision=0, characterSetName='null', collationName='null', columnType='int(11)', columnKey='', extra='', privileges='select', columnComment='', generationExpression=''}*/
private Integer uncompressOps;

/**Column{tableCatalog='def', tableSchema='information_schema', tableName='INNODB_CMP', columnName='uncompress_time', ordinalPosition=6, columnDefault='0', isNullable='NO', dataType='int', characterMaximumLength=0, characterOctetLength=0, numericPrecision=10, numericScale=0, datetimePrecision=0, characterSetName='null', collationName='null', columnType='int(11)', columnKey='', extra='', privileges='select', columnComment='', generationExpression=''}*/
private Integer uncompressTime;

public Integer getPageSize(){
return pageSize;
}

public Integer getCompressOps(){
return compressOps;
}

public Integer getCompressOpsOk(){
return compressOpsOk;
}

public Integer getCompressTime(){
return compressTime;
}

public Integer getUncompressOps(){
return uncompressOps;
}

public Integer getUncompressTime(){
return uncompressTime;
}

}