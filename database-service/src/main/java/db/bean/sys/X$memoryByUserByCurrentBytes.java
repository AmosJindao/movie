package db.bean.sys;


/**VIEW
*/
public class X$memoryByUserByCurrentBytes{
/**Column{tableCatalog='def', tableSchema='sys', tableName='x$memory_by_user_by_current_bytes', columnName='user', ordinalPosition=1, columnDefault='null', isNullable='YES', dataType='varchar', characterMaximumLength=32, characterOctetLength=96, numericPrecision=0, numericScale=0, datetimePrecision=0, characterSetName='utf8', collationName='utf8_bin', columnType='varchar(32)', columnKey='', extra='', privileges='select,insert,update,references', columnComment='', generationExpression=''}*/
private String user;

/**Column{tableCatalog='def', tableSchema='sys', tableName='x$memory_by_user_by_current_bytes', columnName='current_count_used', ordinalPosition=2, columnDefault='null', isNullable='YES', dataType='decimal', characterMaximumLength=0, characterOctetLength=0, numericPrecision=41, numericScale=0, datetimePrecision=0, characterSetName='null', collationName='null', columnType='decimal(41,0)', columnKey='', extra='', privileges='select,insert,update,references', columnComment='', generationExpression=''}*/
private Double currentCountUsed;

/**Column{tableCatalog='def', tableSchema='sys', tableName='x$memory_by_user_by_current_bytes', columnName='current_allocated', ordinalPosition=3, columnDefault='null', isNullable='YES', dataType='decimal', characterMaximumLength=0, characterOctetLength=0, numericPrecision=41, numericScale=0, datetimePrecision=0, characterSetName='null', collationName='null', columnType='decimal(41,0)', columnKey='', extra='', privileges='select,insert,update,references', columnComment='', generationExpression=''}*/
private Double currentAllocated;

/**Column{tableCatalog='def', tableSchema='sys', tableName='x$memory_by_user_by_current_bytes', columnName='current_avg_alloc', ordinalPosition=4, columnDefault='0.0000', isNullable='NO', dataType='decimal', characterMaximumLength=0, characterOctetLength=0, numericPrecision=45, numericScale=4, datetimePrecision=0, characterSetName='null', collationName='null', columnType='decimal(45,4)', columnKey='', extra='', privileges='select,insert,update,references', columnComment='', generationExpression=''}*/
private Double currentAvgAlloc;

/**Column{tableCatalog='def', tableSchema='sys', tableName='x$memory_by_user_by_current_bytes', columnName='current_max_alloc', ordinalPosition=5, columnDefault='null', isNullable='YES', dataType='bigint', characterMaximumLength=0, characterOctetLength=0, numericPrecision=19, numericScale=0, datetimePrecision=0, characterSetName='null', collationName='null', columnType='bigint(20)', columnKey='', extra='', privileges='select,insert,update,references', columnComment='', generationExpression=''}*/
private Long currentMaxAlloc;

/**Column{tableCatalog='def', tableSchema='sys', tableName='x$memory_by_user_by_current_bytes', columnName='total_allocated', ordinalPosition=6, columnDefault='null', isNullable='YES', dataType='decimal', characterMaximumLength=0, characterOctetLength=0, numericPrecision=42, numericScale=0, datetimePrecision=0, characterSetName='null', collationName='null', columnType='decimal(42,0)', columnKey='', extra='', privileges='select,insert,update,references', columnComment='', generationExpression=''}*/
private Double totalAllocated;

public String getUser(){
return user;
}

public Double getCurrentCountUsed(){
return currentCountUsed;
}

public Double getCurrentAllocated(){
return currentAllocated;
}

public Double getCurrentAvgAlloc(){
return currentAvgAlloc;
}

public Long getCurrentMaxAlloc(){
return currentMaxAlloc;
}

public Double getTotalAllocated(){
return totalAllocated;
}

}