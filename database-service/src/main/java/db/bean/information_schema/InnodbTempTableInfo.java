package db.bean.information_schema;


/**
*/
public class InnodbTempTableInfo{
/**Column{tableCatalog='def', tableSchema='information_schema', tableName='INNODB_TEMP_TABLE_INFO', columnName='TABLE_ID', ordinalPosition=1, columnDefault='0', isNullable='NO', dataType='bigint', characterMaximumLength=0, characterOctetLength=0, numericPrecision=20, numericScale=0, datetimePrecision=0, characterSetName='null', collationName='null', columnType='bigint(21) unsigned', columnKey='', extra='', privileges='select', columnComment='', generationExpression=''}*/
private Long tableId;

/**Column{tableCatalog='def', tableSchema='information_schema', tableName='INNODB_TEMP_TABLE_INFO', columnName='NAME', ordinalPosition=2, columnDefault='null', isNullable='YES', dataType='varchar', characterMaximumLength=202, characterOctetLength=606, numericPrecision=0, numericScale=0, datetimePrecision=0, characterSetName='utf8', collationName='utf8_general_ci', columnType='varchar(202)', columnKey='', extra='', privileges='select', columnComment='', generationExpression=''}*/
private String name;

/**Column{tableCatalog='def', tableSchema='information_schema', tableName='INNODB_TEMP_TABLE_INFO', columnName='N_COLS', ordinalPosition=3, columnDefault='0', isNullable='NO', dataType='int', characterMaximumLength=0, characterOctetLength=0, numericPrecision=10, numericScale=0, datetimePrecision=0, characterSetName='null', collationName='null', columnType='int(11) unsigned', columnKey='', extra='', privileges='select', columnComment='', generationExpression=''}*/
private Integer nCols;

/**Column{tableCatalog='def', tableSchema='information_schema', tableName='INNODB_TEMP_TABLE_INFO', columnName='SPACE', ordinalPosition=4, columnDefault='0', isNullable='NO', dataType='int', characterMaximumLength=0, characterOctetLength=0, numericPrecision=10, numericScale=0, datetimePrecision=0, characterSetName='null', collationName='null', columnType='int(11) unsigned', columnKey='', extra='', privileges='select', columnComment='', generationExpression=''}*/
private Integer space;

/**Column{tableCatalog='def', tableSchema='information_schema', tableName='INNODB_TEMP_TABLE_INFO', columnName='PER_TABLE_TABLESPACE', ordinalPosition=5, columnDefault='null', isNullable='YES', dataType='varchar', characterMaximumLength=64, characterOctetLength=192, numericPrecision=0, numericScale=0, datetimePrecision=0, characterSetName='utf8', collationName='utf8_general_ci', columnType='varchar(64)', columnKey='', extra='', privileges='select', columnComment='', generationExpression=''}*/
private String perTableTablespace;

/**Column{tableCatalog='def', tableSchema='information_schema', tableName='INNODB_TEMP_TABLE_INFO', columnName='IS_COMPRESSED', ordinalPosition=6, columnDefault='null', isNullable='YES', dataType='varchar', characterMaximumLength=64, characterOctetLength=192, numericPrecision=0, numericScale=0, datetimePrecision=0, characterSetName='utf8', collationName='utf8_general_ci', columnType='varchar(64)', columnKey='', extra='', privileges='select', columnComment='', generationExpression=''}*/
private String isCompressed;

public Long getTableId(){
return tableId;
}

public String getName(){
return name;
}

public Integer getNCols(){
return nCols;
}

public Integer getSpace(){
return space;
}

public String getPerTableTablespace(){
return perTableTablespace;
}

public String getIsCompressed(){
return isCompressed;
}

}