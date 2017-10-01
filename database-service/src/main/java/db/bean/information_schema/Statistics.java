package db.bean.information_schema;


/**
*/
public class Statistics{
/**Column{tableCatalog='def', tableSchema='information_schema', tableName='STATISTICS', columnName='TABLE_CATALOG', ordinalPosition=1, columnDefault='', isNullable='NO', dataType='varchar', characterMaximumLength=512, characterOctetLength=1536, numericPrecision=0, numericScale=0, datetimePrecision=0, characterSetName='utf8', collationName='utf8_general_ci', columnType='varchar(512)', columnKey='', extra='', privileges='select', columnComment='', generationExpression=''}*/
private String tableCatalog;

/**Column{tableCatalog='def', tableSchema='information_schema', tableName='STATISTICS', columnName='TABLE_SCHEMA', ordinalPosition=2, columnDefault='', isNullable='NO', dataType='varchar', characterMaximumLength=64, characterOctetLength=192, numericPrecision=0, numericScale=0, datetimePrecision=0, characterSetName='utf8', collationName='utf8_general_ci', columnType='varchar(64)', columnKey='', extra='', privileges='select', columnComment='', generationExpression=''}*/
private String tableSchema;

/**Column{tableCatalog='def', tableSchema='information_schema', tableName='STATISTICS', columnName='TABLE_NAME', ordinalPosition=3, columnDefault='', isNullable='NO', dataType='varchar', characterMaximumLength=64, characterOctetLength=192, numericPrecision=0, numericScale=0, datetimePrecision=0, characterSetName='utf8', collationName='utf8_general_ci', columnType='varchar(64)', columnKey='', extra='', privileges='select', columnComment='', generationExpression=''}*/
private String tableName;

/**Column{tableCatalog='def', tableSchema='information_schema', tableName='STATISTICS', columnName='NON_UNIQUE', ordinalPosition=4, columnDefault='0', isNullable='NO', dataType='bigint', characterMaximumLength=0, characterOctetLength=0, numericPrecision=19, numericScale=0, datetimePrecision=0, characterSetName='null', collationName='null', columnType='bigint(1)', columnKey='', extra='', privileges='select', columnComment='', generationExpression=''}*/
private Long nonUnique;

/**Column{tableCatalog='def', tableSchema='information_schema', tableName='STATISTICS', columnName='INDEX_SCHEMA', ordinalPosition=5, columnDefault='', isNullable='NO', dataType='varchar', characterMaximumLength=64, characterOctetLength=192, numericPrecision=0, numericScale=0, datetimePrecision=0, characterSetName='utf8', collationName='utf8_general_ci', columnType='varchar(64)', columnKey='', extra='', privileges='select', columnComment='', generationExpression=''}*/
private String indexSchema;

/**Column{tableCatalog='def', tableSchema='information_schema', tableName='STATISTICS', columnName='INDEX_NAME', ordinalPosition=6, columnDefault='', isNullable='NO', dataType='varchar', characterMaximumLength=64, characterOctetLength=192, numericPrecision=0, numericScale=0, datetimePrecision=0, characterSetName='utf8', collationName='utf8_general_ci', columnType='varchar(64)', columnKey='', extra='', privileges='select', columnComment='', generationExpression=''}*/
private String indexName;

/**Column{tableCatalog='def', tableSchema='information_schema', tableName='STATISTICS', columnName='SEQ_IN_INDEX', ordinalPosition=7, columnDefault='0', isNullable='NO', dataType='bigint', characterMaximumLength=0, characterOctetLength=0, numericPrecision=19, numericScale=0, datetimePrecision=0, characterSetName='null', collationName='null', columnType='bigint(2)', columnKey='', extra='', privileges='select', columnComment='', generationExpression=''}*/
private Long seqInIndex;

/**Column{tableCatalog='def', tableSchema='information_schema', tableName='STATISTICS', columnName='COLUMN_NAME', ordinalPosition=8, columnDefault='', isNullable='NO', dataType='varchar', characterMaximumLength=64, characterOctetLength=192, numericPrecision=0, numericScale=0, datetimePrecision=0, characterSetName='utf8', collationName='utf8_general_ci', columnType='varchar(64)', columnKey='', extra='', privileges='select', columnComment='', generationExpression=''}*/
private String columnName;

/**Column{tableCatalog='def', tableSchema='information_schema', tableName='STATISTICS', columnName='COLLATION', ordinalPosition=9, columnDefault='null', isNullable='YES', dataType='varchar', characterMaximumLength=1, characterOctetLength=3, numericPrecision=0, numericScale=0, datetimePrecision=0, characterSetName='utf8', collationName='utf8_general_ci', columnType='varchar(1)', columnKey='', extra='', privileges='select', columnComment='', generationExpression=''}*/
private String collation;

/**Column{tableCatalog='def', tableSchema='information_schema', tableName='STATISTICS', columnName='CARDINALITY', ordinalPosition=10, columnDefault='null', isNullable='YES', dataType='bigint', characterMaximumLength=0, characterOctetLength=0, numericPrecision=19, numericScale=0, datetimePrecision=0, characterSetName='null', collationName='null', columnType='bigint(21)', columnKey='', extra='', privileges='select', columnComment='', generationExpression=''}*/
private Long cardinality;

/**Column{tableCatalog='def', tableSchema='information_schema', tableName='STATISTICS', columnName='SUB_PART', ordinalPosition=11, columnDefault='null', isNullable='YES', dataType='bigint', characterMaximumLength=0, characterOctetLength=0, numericPrecision=19, numericScale=0, datetimePrecision=0, characterSetName='null', collationName='null', columnType='bigint(3)', columnKey='', extra='', privileges='select', columnComment='', generationExpression=''}*/
private Long subPart;

/**Column{tableCatalog='def', tableSchema='information_schema', tableName='STATISTICS', columnName='PACKED', ordinalPosition=12, columnDefault='null', isNullable='YES', dataType='varchar', characterMaximumLength=10, characterOctetLength=30, numericPrecision=0, numericScale=0, datetimePrecision=0, characterSetName='utf8', collationName='utf8_general_ci', columnType='varchar(10)', columnKey='', extra='', privileges='select', columnComment='', generationExpression=''}*/
private String packed;

/**Column{tableCatalog='def', tableSchema='information_schema', tableName='STATISTICS', columnName='NULLABLE', ordinalPosition=13, columnDefault='', isNullable='NO', dataType='varchar', characterMaximumLength=3, characterOctetLength=9, numericPrecision=0, numericScale=0, datetimePrecision=0, characterSetName='utf8', collationName='utf8_general_ci', columnType='varchar(3)', columnKey='', extra='', privileges='select', columnComment='', generationExpression=''}*/
private String nullable;

/**Column{tableCatalog='def', tableSchema='information_schema', tableName='STATISTICS', columnName='INDEX_TYPE', ordinalPosition=14, columnDefault='', isNullable='NO', dataType='varchar', characterMaximumLength=16, characterOctetLength=48, numericPrecision=0, numericScale=0, datetimePrecision=0, characterSetName='utf8', collationName='utf8_general_ci', columnType='varchar(16)', columnKey='', extra='', privileges='select', columnComment='', generationExpression=''}*/
private String indexType;

/**Column{tableCatalog='def', tableSchema='information_schema', tableName='STATISTICS', columnName='COMMENT', ordinalPosition=15, columnDefault='null', isNullable='YES', dataType='varchar', characterMaximumLength=16, characterOctetLength=48, numericPrecision=0, numericScale=0, datetimePrecision=0, characterSetName='utf8', collationName='utf8_general_ci', columnType='varchar(16)', columnKey='', extra='', privileges='select', columnComment='', generationExpression=''}*/
private String comment;

/**Column{tableCatalog='def', tableSchema='information_schema', tableName='STATISTICS', columnName='INDEX_COMMENT', ordinalPosition=16, columnDefault='', isNullable='NO', dataType='varchar', characterMaximumLength=1024, characterOctetLength=3072, numericPrecision=0, numericScale=0, datetimePrecision=0, characterSetName='utf8', collationName='utf8_general_ci', columnType='varchar(1024)', columnKey='', extra='', privileges='select', columnComment='', generationExpression=''}*/
private String indexComment;

public String getTableCatalog(){
return tableCatalog;
}

public String getTableSchema(){
return tableSchema;
}

public String getTableName(){
return tableName;
}

public Long getNonUnique(){
return nonUnique;
}

public String getIndexSchema(){
return indexSchema;
}

public String getIndexName(){
return indexName;
}

public Long getSeqInIndex(){
return seqInIndex;
}

public String getColumnName(){
return columnName;
}

public String getCollation(){
return collation;
}

public Long getCardinality(){
return cardinality;
}

public Long getSubPart(){
return subPart;
}

public String getPacked(){
return packed;
}

public String getNullable(){
return nullable;
}

public String getIndexType(){
return indexType;
}

public String getComment(){
return comment;
}

public String getIndexComment(){
return indexComment;
}

}