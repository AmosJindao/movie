package db.bean.sys;


/**VIEW
*/
public class MemoryGlobalTotal{
/**Column{tableCatalog='def', tableSchema='sys', tableName='memory_global_total', columnName='total_allocated', ordinalPosition=1, columnDefault='null', isNullable='YES', dataType='text', characterMaximumLength=65535, characterOctetLength=65535, numericPrecision=0, numericScale=0, datetimePrecision=0, characterSetName='utf8', collationName='utf8_general_ci', columnType='text', columnKey='', extra='', privileges='select,insert,update,references', columnComment='', generationExpression=''}*/
private String totalAllocated;

public String getTotalAllocated(){
return totalAllocated;
}

}