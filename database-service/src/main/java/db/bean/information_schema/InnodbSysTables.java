package db.bean.information_schema;


/* SELECT TABLE_ID AS tableId, NAME AS name, FLAG AS flag, N_COLS AS nCols, SPACE AS space, FILE_FORMAT AS fileFormat, ROW_FORMAT AS rowFormat, ZIP_PAGE_SIZE AS zipPageSize, SPACE_TYPE AS spaceType FROM information_schema.INNODB_SYS_TABLES */
/**
*/
public class InnodbSysTables{
/**Column{tableCatalog='def', tableSchema='information_schema', tableName='INNODB_SYS_TABLES', columnName='TABLE_ID', ordinalPosition=1, columnDefault='0', isNullable='NO', dataType='bigint', characterMaximumLength=0, characterOctetLength=0, numericPrecision=20, numericScale=0, datetimePrecision=0, characterSetName='null', collationName='null', columnType='bigint(21) unsigned', columnKey='', extra='', privileges='select', columnComment='', generationExpression=''}*/
private Long tableId;

/**Column{tableCatalog='def', tableSchema='information_schema', tableName='INNODB_SYS_TABLES', columnName='NAME', ordinalPosition=2, columnDefault='', isNullable='NO', dataType='varchar', characterMaximumLength=655, characterOctetLength=1965, numericPrecision=0, numericScale=0, datetimePrecision=0, characterSetName='utf8', collationName='utf8_general_ci', columnType='varchar(655)', columnKey='', extra='', privileges='select', columnComment='', generationExpression=''}*/
private String name;

/**Column{tableCatalog='def', tableSchema='information_schema', tableName='INNODB_SYS_TABLES', columnName='FLAG', ordinalPosition=3, columnDefault='0', isNullable='NO', dataType='int', characterMaximumLength=0, characterOctetLength=0, numericPrecision=10, numericScale=0, datetimePrecision=0, characterSetName='null', collationName='null', columnType='int(11)', columnKey='', extra='', privileges='select', columnComment='', generationExpression=''}*/
private Integer flag;

/**Column{tableCatalog='def', tableSchema='information_schema', tableName='INNODB_SYS_TABLES', columnName='N_COLS', ordinalPosition=4, columnDefault='0', isNullable='NO', dataType='int', characterMaximumLength=0, characterOctetLength=0, numericPrecision=10, numericScale=0, datetimePrecision=0, characterSetName='null', collationName='null', columnType='int(11)', columnKey='', extra='', privileges='select', columnComment='', generationExpression=''}*/
private Integer nCols;

/**Column{tableCatalog='def', tableSchema='information_schema', tableName='INNODB_SYS_TABLES', columnName='SPACE', ordinalPosition=5, columnDefault='0', isNullable='NO', dataType='int', characterMaximumLength=0, characterOctetLength=0, numericPrecision=10, numericScale=0, datetimePrecision=0, characterSetName='null', collationName='null', columnType='int(11)', columnKey='', extra='', privileges='select', columnComment='', generationExpression=''}*/
private Integer space;

/**Column{tableCatalog='def', tableSchema='information_schema', tableName='INNODB_SYS_TABLES', columnName='FILE_FORMAT', ordinalPosition=6, columnDefault='null', isNullable='YES', dataType='varchar', characterMaximumLength=10, characterOctetLength=30, numericPrecision=0, numericScale=0, datetimePrecision=0, characterSetName='utf8', collationName='utf8_general_ci', columnType='varchar(10)', columnKey='', extra='', privileges='select', columnComment='', generationExpression=''}*/
private String fileFormat;

/**Column{tableCatalog='def', tableSchema='information_schema', tableName='INNODB_SYS_TABLES', columnName='ROW_FORMAT', ordinalPosition=7, columnDefault='null', isNullable='YES', dataType='varchar', characterMaximumLength=12, characterOctetLength=36, numericPrecision=0, numericScale=0, datetimePrecision=0, characterSetName='utf8', collationName='utf8_general_ci', columnType='varchar(12)', columnKey='', extra='', privileges='select', columnComment='', generationExpression=''}*/
private String rowFormat;

/**Column{tableCatalog='def', tableSchema='information_schema', tableName='INNODB_SYS_TABLES', columnName='ZIP_PAGE_SIZE', ordinalPosition=8, columnDefault='0', isNullable='NO', dataType='int', characterMaximumLength=0, characterOctetLength=0, numericPrecision=10, numericScale=0, datetimePrecision=0, characterSetName='null', collationName='null', columnType='int(11) unsigned', columnKey='', extra='', privileges='select', columnComment='', generationExpression=''}*/
private Integer zipPageSize;

/**Column{tableCatalog='def', tableSchema='information_schema', tableName='INNODB_SYS_TABLES', columnName='SPACE_TYPE', ordinalPosition=9, columnDefault='null', isNullable='YES', dataType='varchar', characterMaximumLength=10, characterOctetLength=30, numericPrecision=0, numericScale=0, datetimePrecision=0, characterSetName='utf8', collationName='utf8_general_ci', columnType='varchar(10)', columnKey='', extra='', privileges='select', columnComment='', generationExpression=''}*/
private String spaceType;

public Long getTableId(){
return tableId;
}

public String getName(){
return name;
}

public Integer getFlag(){
return flag;
}

public Integer getNCols(){
return nCols;
}

public Integer getSpace(){
return space;
}

public String getFileFormat(){
return fileFormat;
}

public String getRowFormat(){
return rowFormat;
}

public Integer getZipPageSize(){
return zipPageSize;
}

public String getSpaceType(){
return spaceType;
}

}