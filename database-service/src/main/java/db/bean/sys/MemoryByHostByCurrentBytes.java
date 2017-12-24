package db.bean.sys;


/* SELECT host AS host, current_count_used AS currentCountUsed, current_allocated AS currentAllocated, current_avg_alloc AS currentAvgAlloc, current_max_alloc AS currentMaxAlloc, total_allocated AS totalAllocated FROM sys.memory_by_host_by_current_bytes */
/**VIEW
*/
public class MemoryByHostByCurrentBytes{
/**Column{tableCatalog='def', tableSchema='sys', tableName='memory_by_host_by_current_bytes', columnName='host', ordinalPosition=1, columnDefault='null', isNullable='YES', dataType='varchar', characterMaximumLength=60, characterOctetLength=180, numericPrecision=0, numericScale=0, datetimePrecision=0, characterSetName='utf8', collationName='utf8_bin', columnType='varchar(60)', columnKey='', extra='', privileges='select,insert,update,references', columnComment='', generationExpression=''}*/
private String host;

/**Column{tableCatalog='def', tableSchema='sys', tableName='memory_by_host_by_current_bytes', columnName='current_count_used', ordinalPosition=2, columnDefault='null', isNullable='YES', dataType='decimal', characterMaximumLength=0, characterOctetLength=0, numericPrecision=41, numericScale=0, datetimePrecision=0, characterSetName='null', collationName='null', columnType='decimal(41,0)', columnKey='', extra='', privileges='select,insert,update,references', columnComment='', generationExpression=''}*/
private Double currentCountUsed;

/**Column{tableCatalog='def', tableSchema='sys', tableName='memory_by_host_by_current_bytes', columnName='current_allocated', ordinalPosition=3, columnDefault='null', isNullable='YES', dataType='text', characterMaximumLength=65535, characterOctetLength=65535, numericPrecision=0, numericScale=0, datetimePrecision=0, characterSetName='utf8', collationName='utf8_general_ci', columnType='text', columnKey='', extra='', privileges='select,insert,update,references', columnComment='', generationExpression=''}*/
private String currentAllocated;

/**Column{tableCatalog='def', tableSchema='sys', tableName='memory_by_host_by_current_bytes', columnName='current_avg_alloc', ordinalPosition=4, columnDefault='null', isNullable='YES', dataType='text', characterMaximumLength=65535, characterOctetLength=65535, numericPrecision=0, numericScale=0, datetimePrecision=0, characterSetName='utf8', collationName='utf8_general_ci', columnType='text', columnKey='', extra='', privileges='select,insert,update,references', columnComment='', generationExpression=''}*/
private String currentAvgAlloc;

/**Column{tableCatalog='def', tableSchema='sys', tableName='memory_by_host_by_current_bytes', columnName='current_max_alloc', ordinalPosition=5, columnDefault='null', isNullable='YES', dataType='text', characterMaximumLength=65535, characterOctetLength=65535, numericPrecision=0, numericScale=0, datetimePrecision=0, characterSetName='utf8', collationName='utf8_general_ci', columnType='text', columnKey='', extra='', privileges='select,insert,update,references', columnComment='', generationExpression=''}*/
private String currentMaxAlloc;

/**Column{tableCatalog='def', tableSchema='sys', tableName='memory_by_host_by_current_bytes', columnName='total_allocated', ordinalPosition=6, columnDefault='null', isNullable='YES', dataType='text', characterMaximumLength=65535, characterOctetLength=65535, numericPrecision=0, numericScale=0, datetimePrecision=0, characterSetName='utf8', collationName='utf8_general_ci', columnType='text', columnKey='', extra='', privileges='select,insert,update,references', columnComment='', generationExpression=''}*/
private String totalAllocated;

public String getHost(){
return host;
}

public Double getCurrentCountUsed(){
return currentCountUsed;
}

public String getCurrentAllocated(){
return currentAllocated;
}

public String getCurrentAvgAlloc(){
return currentAvgAlloc;
}

public String getCurrentMaxAlloc(){
return currentMaxAlloc;
}

public String getTotalAllocated(){
return totalAllocated;
}

}