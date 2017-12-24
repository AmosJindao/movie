package db.bean.sys;


/* SELECT object_schema AS objectSchema, object_name AS objectName, allocated AS allocated, data AS data, pages AS pages, pages_hashed AS pagesHashed, pages_old AS pagesOld, rows_cached AS rowsCached FROM sys.x$innodb_buffer_stats_by_table */
/**VIEW
*/
public class X$innodbBufferStatsByTable{
/**Column{tableCatalog='def', tableSchema='sys', tableName='x$innodb_buffer_stats_by_table', columnName='object_schema', ordinalPosition=1, columnDefault='null', isNullable='YES', dataType='text', characterMaximumLength=65535, characterOctetLength=65535, numericPrecision=0, numericScale=0, datetimePrecision=0, characterSetName='utf8', collationName='utf8_general_ci', columnType='text', columnKey='', extra='', privileges='select,insert,update,references', columnComment='', generationExpression=''}*/
private String objectSchema;

/**Column{tableCatalog='def', tableSchema='sys', tableName='x$innodb_buffer_stats_by_table', columnName='object_name', ordinalPosition=2, columnDefault='null', isNullable='YES', dataType='text', characterMaximumLength=65535, characterOctetLength=65535, numericPrecision=0, numericScale=0, datetimePrecision=0, characterSetName='utf8', collationName='utf8_general_ci', columnType='text', columnKey='', extra='', privileges='select,insert,update,references', columnComment='', generationExpression=''}*/
private String objectName;

/**Column{tableCatalog='def', tableSchema='sys', tableName='x$innodb_buffer_stats_by_table', columnName='allocated', ordinalPosition=3, columnDefault='null', isNullable='YES', dataType='decimal', characterMaximumLength=0, characterOctetLength=0, numericPrecision=43, numericScale=0, datetimePrecision=0, characterSetName='null', collationName='null', columnType='decimal(43,0)', columnKey='', extra='', privileges='select,insert,update,references', columnComment='', generationExpression=''}*/
private Double allocated;

/**Column{tableCatalog='def', tableSchema='sys', tableName='x$innodb_buffer_stats_by_table', columnName='data', ordinalPosition=4, columnDefault='null', isNullable='YES', dataType='decimal', characterMaximumLength=0, characterOctetLength=0, numericPrecision=43, numericScale=0, datetimePrecision=0, characterSetName='null', collationName='null', columnType='decimal(43,0)', columnKey='', extra='', privileges='select,insert,update,references', columnComment='', generationExpression=''}*/
private Double data;

/**Column{tableCatalog='def', tableSchema='sys', tableName='x$innodb_buffer_stats_by_table', columnName='pages', ordinalPosition=5, columnDefault='0', isNullable='NO', dataType='bigint', characterMaximumLength=0, characterOctetLength=0, numericPrecision=19, numericScale=0, datetimePrecision=0, characterSetName='null', collationName='null', columnType='bigint(21)', columnKey='', extra='', privileges='select,insert,update,references', columnComment='', generationExpression=''}*/
private Long pages;

/**Column{tableCatalog='def', tableSchema='sys', tableName='x$innodb_buffer_stats_by_table', columnName='pages_hashed', ordinalPosition=6, columnDefault='0', isNullable='NO', dataType='bigint', characterMaximumLength=0, characterOctetLength=0, numericPrecision=19, numericScale=0, datetimePrecision=0, characterSetName='null', collationName='null', columnType='bigint(21)', columnKey='', extra='', privileges='select,insert,update,references', columnComment='', generationExpression=''}*/
private Long pagesHashed;

/**Column{tableCatalog='def', tableSchema='sys', tableName='x$innodb_buffer_stats_by_table', columnName='pages_old', ordinalPosition=7, columnDefault='0', isNullable='NO', dataType='bigint', characterMaximumLength=0, characterOctetLength=0, numericPrecision=19, numericScale=0, datetimePrecision=0, characterSetName='null', collationName='null', columnType='bigint(21)', columnKey='', extra='', privileges='select,insert,update,references', columnComment='', generationExpression=''}*/
private Long pagesOld;

/**Column{tableCatalog='def', tableSchema='sys', tableName='x$innodb_buffer_stats_by_table', columnName='rows_cached', ordinalPosition=8, columnDefault='0', isNullable='NO', dataType='decimal', characterMaximumLength=0, characterOctetLength=0, numericPrecision=44, numericScale=0, datetimePrecision=0, characterSetName='null', collationName='null', columnType='decimal(44,0)', columnKey='', extra='', privileges='select,insert,update,references', columnComment='', generationExpression=''}*/
private Double rowsCached;

public String getObjectSchema(){
return objectSchema;
}

public String getObjectName(){
return objectName;
}

public Double getAllocated(){
return allocated;
}

public Double getData(){
return data;
}

public Long getPages(){
return pages;
}

public Long getPagesHashed(){
return pagesHashed;
}

public Long getPagesOld(){
return pagesOld;
}

public Double getRowsCached(){
return rowsCached;
}

}