package db.bean.information_schema;


/**
*/
public class InnodbCmpPerIndex{
/**Column{tableCatalog='def', tableSchema='information_schema', tableName='INNODB_CMP_PER_INDEX', columnName='database_name', ordinalPosition=1, columnDefault='', isNullable='NO', dataType='varchar', characterMaximumLength=192, characterOctetLength=576, numericPrecision=0, numericScale=0, datetimePrecision=0, characterSetName='utf8', collationName='utf8_general_ci', columnType='varchar(192)', columnKey='', extra='', privileges='select', columnComment='', generationExpression=''}*/
private String databaseName;

/**Column{tableCatalog='def', tableSchema='information_schema', tableName='INNODB_CMP_PER_INDEX', columnName='table_name', ordinalPosition=2, columnDefault='', isNullable='NO', dataType='varchar', characterMaximumLength=192, characterOctetLength=576, numericPrecision=0, numericScale=0, datetimePrecision=0, characterSetName='utf8', collationName='utf8_general_ci', columnType='varchar(192)', columnKey='', extra='', privileges='select', columnComment='', generationExpression=''}*/
private String tableName;

/**Column{tableCatalog='def', tableSchema='information_schema', tableName='INNODB_CMP_PER_INDEX', columnName='index_name', ordinalPosition=3, columnDefault='', isNullable='NO', dataType='varchar', characterMaximumLength=192, characterOctetLength=576, numericPrecision=0, numericScale=0, datetimePrecision=0, characterSetName='utf8', collationName='utf8_general_ci', columnType='varchar(192)', columnKey='', extra='', privileges='select', columnComment='', generationExpression=''}*/
private String indexName;

/**Column{tableCatalog='def', tableSchema='information_schema', tableName='INNODB_CMP_PER_INDEX', columnName='compress_ops', ordinalPosition=4, columnDefault='0', isNullable='NO', dataType='int', characterMaximumLength=0, characterOctetLength=0, numericPrecision=10, numericScale=0, datetimePrecision=0, characterSetName='null', collationName='null', columnType='int(11)', columnKey='', extra='', privileges='select', columnComment='', generationExpression=''}*/
private Integer compressOps;

/**Column{tableCatalog='def', tableSchema='information_schema', tableName='INNODB_CMP_PER_INDEX', columnName='compress_ops_ok', ordinalPosition=5, columnDefault='0', isNullable='NO', dataType='int', characterMaximumLength=0, characterOctetLength=0, numericPrecision=10, numericScale=0, datetimePrecision=0, characterSetName='null', collationName='null', columnType='int(11)', columnKey='', extra='', privileges='select', columnComment='', generationExpression=''}*/
private Integer compressOpsOk;

/**Column{tableCatalog='def', tableSchema='information_schema', tableName='INNODB_CMP_PER_INDEX', columnName='compress_time', ordinalPosition=6, columnDefault='0', isNullable='NO', dataType='int', characterMaximumLength=0, characterOctetLength=0, numericPrecision=10, numericScale=0, datetimePrecision=0, characterSetName='null', collationName='null', columnType='int(11)', columnKey='', extra='', privileges='select', columnComment='', generationExpression=''}*/
private Integer compressTime;

/**Column{tableCatalog='def', tableSchema='information_schema', tableName='INNODB_CMP_PER_INDEX', columnName='uncompress_ops', ordinalPosition=7, columnDefault='0', isNullable='NO', dataType='int', characterMaximumLength=0, characterOctetLength=0, numericPrecision=10, numericScale=0, datetimePrecision=0, characterSetName='null', collationName='null', columnType='int(11)', columnKey='', extra='', privileges='select', columnComment='', generationExpression=''}*/
private Integer uncompressOps;

/**Column{tableCatalog='def', tableSchema='information_schema', tableName='INNODB_CMP_PER_INDEX', columnName='uncompress_time', ordinalPosition=8, columnDefault='0', isNullable='NO', dataType='int', characterMaximumLength=0, characterOctetLength=0, numericPrecision=10, numericScale=0, datetimePrecision=0, characterSetName='null', collationName='null', columnType='int(11)', columnKey='', extra='', privileges='select', columnComment='', generationExpression=''}*/
private Integer uncompressTime;

public String getDatabaseName(){
return databaseName;
}

public String getTableName(){
return tableName;
}

public String getIndexName(){
return indexName;
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