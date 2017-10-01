package db.bean.information_schema;


/**
*/
public class InnodbSysIndexes{
/**Column{tableCatalog='def', tableSchema='information_schema', tableName='INNODB_SYS_INDEXES', columnName='INDEX_ID', ordinalPosition=1, columnDefault='0', isNullable='NO', dataType='bigint', characterMaximumLength=0, characterOctetLength=0, numericPrecision=20, numericScale=0, datetimePrecision=0, characterSetName='null', collationName='null', columnType='bigint(21) unsigned', columnKey='', extra='', privileges='select', columnComment='', generationExpression=''}*/
private Long indexId;

/**Column{tableCatalog='def', tableSchema='information_schema', tableName='INNODB_SYS_INDEXES', columnName='NAME', ordinalPosition=2, columnDefault='', isNullable='NO', dataType='varchar', characterMaximumLength=193, characterOctetLength=579, numericPrecision=0, numericScale=0, datetimePrecision=0, characterSetName='utf8', collationName='utf8_general_ci', columnType='varchar(193)', columnKey='', extra='', privileges='select', columnComment='', generationExpression=''}*/
private String name;

/**Column{tableCatalog='def', tableSchema='information_schema', tableName='INNODB_SYS_INDEXES', columnName='TABLE_ID', ordinalPosition=3, columnDefault='0', isNullable='NO', dataType='bigint', characterMaximumLength=0, characterOctetLength=0, numericPrecision=20, numericScale=0, datetimePrecision=0, characterSetName='null', collationName='null', columnType='bigint(21) unsigned', columnKey='', extra='', privileges='select', columnComment='', generationExpression=''}*/
private Long tableId;

/**Column{tableCatalog='def', tableSchema='information_schema', tableName='INNODB_SYS_INDEXES', columnName='TYPE', ordinalPosition=4, columnDefault='0', isNullable='NO', dataType='int', characterMaximumLength=0, characterOctetLength=0, numericPrecision=10, numericScale=0, datetimePrecision=0, characterSetName='null', collationName='null', columnType='int(11)', columnKey='', extra='', privileges='select', columnComment='', generationExpression=''}*/
private Integer type;

/**Column{tableCatalog='def', tableSchema='information_schema', tableName='INNODB_SYS_INDEXES', columnName='N_FIELDS', ordinalPosition=5, columnDefault='0', isNullable='NO', dataType='int', characterMaximumLength=0, characterOctetLength=0, numericPrecision=10, numericScale=0, datetimePrecision=0, characterSetName='null', collationName='null', columnType='int(11)', columnKey='', extra='', privileges='select', columnComment='', generationExpression=''}*/
private Integer nFields;

/**Column{tableCatalog='def', tableSchema='information_schema', tableName='INNODB_SYS_INDEXES', columnName='PAGE_NO', ordinalPosition=6, columnDefault='0', isNullable='NO', dataType='int', characterMaximumLength=0, characterOctetLength=0, numericPrecision=10, numericScale=0, datetimePrecision=0, characterSetName='null', collationName='null', columnType='int(11)', columnKey='', extra='', privileges='select', columnComment='', generationExpression=''}*/
private Integer pageNo;

/**Column{tableCatalog='def', tableSchema='information_schema', tableName='INNODB_SYS_INDEXES', columnName='SPACE', ordinalPosition=7, columnDefault='0', isNullable='NO', dataType='int', characterMaximumLength=0, characterOctetLength=0, numericPrecision=10, numericScale=0, datetimePrecision=0, characterSetName='null', collationName='null', columnType='int(11)', columnKey='', extra='', privileges='select', columnComment='', generationExpression=''}*/
private Integer space;

/**Column{tableCatalog='def', tableSchema='information_schema', tableName='INNODB_SYS_INDEXES', columnName='MERGE_THRESHOLD', ordinalPosition=8, columnDefault='0', isNullable='NO', dataType='int', characterMaximumLength=0, characterOctetLength=0, numericPrecision=10, numericScale=0, datetimePrecision=0, characterSetName='null', collationName='null', columnType='int(11)', columnKey='', extra='', privileges='select', columnComment='', generationExpression=''}*/
private Integer mergeThreshold;

public Long getIndexId(){
return indexId;
}

public String getName(){
return name;
}

public Long getTableId(){
return tableId;
}

public Integer getType(){
return type;
}

public Integer getNFields(){
return nFields;
}

public Integer getPageNo(){
return pageNo;
}

public Integer getSpace(){
return space;
}

public Integer getMergeThreshold(){
return mergeThreshold;
}

}