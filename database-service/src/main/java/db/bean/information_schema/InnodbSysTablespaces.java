package db.bean.information_schema;


/* SELECT SPACE AS space, NAME AS name, FLAG AS flag, FILE_FORMAT AS fileFormat, ROW_FORMAT AS rowFormat, PAGE_SIZE AS pageSize, ZIP_PAGE_SIZE AS zipPageSize, SPACE_TYPE AS spaceType, FS_BLOCK_SIZE AS fsBlockSize, FILE_SIZE AS fileSize, ALLOCATED_SIZE AS allocatedSize FROM information_schema.INNODB_SYS_TABLESPACES */
/**
*/
public class InnodbSysTablespaces{
/**Column{tableCatalog='def', tableSchema='information_schema', tableName='INNODB_SYS_TABLESPACES', columnName='SPACE', ordinalPosition=1, columnDefault='0', isNullable='NO', dataType='int', characterMaximumLength=0, characterOctetLength=0, numericPrecision=10, numericScale=0, datetimePrecision=0, characterSetName='null', collationName='null', columnType='int(11) unsigned', columnKey='', extra='', privileges='select', columnComment='', generationExpression=''}*/
private Integer space;

/**Column{tableCatalog='def', tableSchema='information_schema', tableName='INNODB_SYS_TABLESPACES', columnName='NAME', ordinalPosition=2, columnDefault='', isNullable='NO', dataType='varchar', characterMaximumLength=655, characterOctetLength=1965, numericPrecision=0, numericScale=0, datetimePrecision=0, characterSetName='utf8', collationName='utf8_general_ci', columnType='varchar(655)', columnKey='', extra='', privileges='select', columnComment='', generationExpression=''}*/
private String name;

/**Column{tableCatalog='def', tableSchema='information_schema', tableName='INNODB_SYS_TABLESPACES', columnName='FLAG', ordinalPosition=3, columnDefault='0', isNullable='NO', dataType='int', characterMaximumLength=0, characterOctetLength=0, numericPrecision=10, numericScale=0, datetimePrecision=0, characterSetName='null', collationName='null', columnType='int(11) unsigned', columnKey='', extra='', privileges='select', columnComment='', generationExpression=''}*/
private Integer flag;

/**Column{tableCatalog='def', tableSchema='information_schema', tableName='INNODB_SYS_TABLESPACES', columnName='FILE_FORMAT', ordinalPosition=4, columnDefault='null', isNullable='YES', dataType='varchar', characterMaximumLength=10, characterOctetLength=30, numericPrecision=0, numericScale=0, datetimePrecision=0, characterSetName='utf8', collationName='utf8_general_ci', columnType='varchar(10)', columnKey='', extra='', privileges='select', columnComment='', generationExpression=''}*/
private String fileFormat;

/**Column{tableCatalog='def', tableSchema='information_schema', tableName='INNODB_SYS_TABLESPACES', columnName='ROW_FORMAT', ordinalPosition=5, columnDefault='null', isNullable='YES', dataType='varchar', characterMaximumLength=22, characterOctetLength=66, numericPrecision=0, numericScale=0, datetimePrecision=0, characterSetName='utf8', collationName='utf8_general_ci', columnType='varchar(22)', columnKey='', extra='', privileges='select', columnComment='', generationExpression=''}*/
private String rowFormat;

/**Column{tableCatalog='def', tableSchema='information_schema', tableName='INNODB_SYS_TABLESPACES', columnName='PAGE_SIZE', ordinalPosition=6, columnDefault='0', isNullable='NO', dataType='int', characterMaximumLength=0, characterOctetLength=0, numericPrecision=10, numericScale=0, datetimePrecision=0, characterSetName='null', collationName='null', columnType='int(11) unsigned', columnKey='', extra='', privileges='select', columnComment='', generationExpression=''}*/
private Integer pageSize;

/**Column{tableCatalog='def', tableSchema='information_schema', tableName='INNODB_SYS_TABLESPACES', columnName='ZIP_PAGE_SIZE', ordinalPosition=7, columnDefault='0', isNullable='NO', dataType='int', characterMaximumLength=0, characterOctetLength=0, numericPrecision=10, numericScale=0, datetimePrecision=0, characterSetName='null', collationName='null', columnType='int(11) unsigned', columnKey='', extra='', privileges='select', columnComment='', generationExpression=''}*/
private Integer zipPageSize;

/**Column{tableCatalog='def', tableSchema='information_schema', tableName='INNODB_SYS_TABLESPACES', columnName='SPACE_TYPE', ordinalPosition=8, columnDefault='null', isNullable='YES', dataType='varchar', characterMaximumLength=10, characterOctetLength=30, numericPrecision=0, numericScale=0, datetimePrecision=0, characterSetName='utf8', collationName='utf8_general_ci', columnType='varchar(10)', columnKey='', extra='', privileges='select', columnComment='', generationExpression=''}*/
private String spaceType;

/**Column{tableCatalog='def', tableSchema='information_schema', tableName='INNODB_SYS_TABLESPACES', columnName='FS_BLOCK_SIZE', ordinalPosition=9, columnDefault='0', isNullable='NO', dataType='int', characterMaximumLength=0, characterOctetLength=0, numericPrecision=10, numericScale=0, datetimePrecision=0, characterSetName='null', collationName='null', columnType='int(11) unsigned', columnKey='', extra='', privileges='select', columnComment='', generationExpression=''}*/
private Integer fsBlockSize;

/**Column{tableCatalog='def', tableSchema='information_schema', tableName='INNODB_SYS_TABLESPACES', columnName='FILE_SIZE', ordinalPosition=10, columnDefault='0', isNullable='NO', dataType='bigint', characterMaximumLength=0, characterOctetLength=0, numericPrecision=20, numericScale=0, datetimePrecision=0, characterSetName='null', collationName='null', columnType='bigint(21) unsigned', columnKey='', extra='', privileges='select', columnComment='', generationExpression=''}*/
private Long fileSize;

/**Column{tableCatalog='def', tableSchema='information_schema', tableName='INNODB_SYS_TABLESPACES', columnName='ALLOCATED_SIZE', ordinalPosition=11, columnDefault='0', isNullable='NO', dataType='bigint', characterMaximumLength=0, characterOctetLength=0, numericPrecision=20, numericScale=0, datetimePrecision=0, characterSetName='null', collationName='null', columnType='bigint(21) unsigned', columnKey='', extra='', privileges='select', columnComment='', generationExpression=''}*/
private Long allocatedSize;

public Integer getSpace(){
return space;
}

public String getName(){
return name;
}

public Integer getFlag(){
return flag;
}

public String getFileFormat(){
return fileFormat;
}

public String getRowFormat(){
return rowFormat;
}

public Integer getPageSize(){
return pageSize;
}

public Integer getZipPageSize(){
return zipPageSize;
}

public String getSpaceType(){
return spaceType;
}

public Integer getFsBlockSize(){
return fsBlockSize;
}

public Long getFileSize(){
return fileSize;
}

public Long getAllocatedSize(){
return allocatedSize;
}

}