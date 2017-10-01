package db.bean.sys;


/**VIEW
*/
public class InnodbBufferStatsBySchema{
/**Column{tableCatalog='def', tableSchema='sys', tableName='innodb_buffer_stats_by_schema', columnName='object_schema', ordinalPosition=1, columnDefault='null', isNullable='YES', dataType='text', characterMaximumLength=65535, characterOctetLength=65535, numericPrecision=0, numericScale=0, datetimePrecision=0, characterSetName='utf8', collationName='utf8_general_ci', columnType='text', columnKey='', extra='', privileges='select,insert,update,references', columnComment='', generationExpression=''}*/
private String objectSchema;

/**Column{tableCatalog='def', tableSchema='sys', tableName='innodb_buffer_stats_by_schema', columnName='allocated', ordinalPosition=2, columnDefault='null', isNullable='YES', dataType='text', characterMaximumLength=65535, characterOctetLength=65535, numericPrecision=0, numericScale=0, datetimePrecision=0, characterSetName='utf8', collationName='utf8_general_ci', columnType='text', columnKey='', extra='', privileges='select,insert,update,references', columnComment='', generationExpression=''}*/
private String allocated;

/**Column{tableCatalog='def', tableSchema='sys', tableName='innodb_buffer_stats_by_schema', columnName='data', ordinalPosition=3, columnDefault='null', isNullable='YES', dataType='text', characterMaximumLength=65535, characterOctetLength=65535, numericPrecision=0, numericScale=0, datetimePrecision=0, characterSetName='utf8', collationName='utf8_general_ci', columnType='text', columnKey='', extra='', privileges='select,insert,update,references', columnComment='', generationExpression=''}*/
private String data;

/**Column{tableCatalog='def', tableSchema='sys', tableName='innodb_buffer_stats_by_schema', columnName='pages', ordinalPosition=4, columnDefault='0', isNullable='NO', dataType='bigint', characterMaximumLength=0, characterOctetLength=0, numericPrecision=19, numericScale=0, datetimePrecision=0, characterSetName='null', collationName='null', columnType='bigint(21)', columnKey='', extra='', privileges='select,insert,update,references', columnComment='', generationExpression=''}*/
private Long pages;

/**Column{tableCatalog='def', tableSchema='sys', tableName='innodb_buffer_stats_by_schema', columnName='pages_hashed', ordinalPosition=5, columnDefault='0', isNullable='NO', dataType='bigint', characterMaximumLength=0, characterOctetLength=0, numericPrecision=19, numericScale=0, datetimePrecision=0, characterSetName='null', collationName='null', columnType='bigint(21)', columnKey='', extra='', privileges='select,insert,update,references', columnComment='', generationExpression=''}*/
private Long pagesHashed;

/**Column{tableCatalog='def', tableSchema='sys', tableName='innodb_buffer_stats_by_schema', columnName='pages_old', ordinalPosition=6, columnDefault='0', isNullable='NO', dataType='bigint', characterMaximumLength=0, characterOctetLength=0, numericPrecision=19, numericScale=0, datetimePrecision=0, characterSetName='null', collationName='null', columnType='bigint(21)', columnKey='', extra='', privileges='select,insert,update,references', columnComment='', generationExpression=''}*/
private Long pagesOld;

/**Column{tableCatalog='def', tableSchema='sys', tableName='innodb_buffer_stats_by_schema', columnName='rows_cached', ordinalPosition=7, columnDefault='null', isNullable='YES', dataType='decimal', characterMaximumLength=0, characterOctetLength=0, numericPrecision=44, numericScale=0, datetimePrecision=0, characterSetName='null', collationName='null', columnType='decimal(44,0)', columnKey='', extra='', privileges='select,insert,update,references', columnComment='', generationExpression=''}*/
private Double rowsCached;

public String getObjectSchema(){
return objectSchema;
}

public String getAllocated(){
return allocated;
}

public String getData(){
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