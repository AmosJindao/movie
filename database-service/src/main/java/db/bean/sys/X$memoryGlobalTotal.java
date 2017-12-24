package db.bean.sys;


/* SELECT total_allocated AS totalAllocated FROM sys.x$memory_global_total */
/**VIEW
*/
public class X$memoryGlobalTotal{
/**Column{tableCatalog='def', tableSchema='sys', tableName='x$memory_global_total', columnName='total_allocated', ordinalPosition=1, columnDefault='null', isNullable='YES', dataType='decimal', characterMaximumLength=0, characterOctetLength=0, numericPrecision=41, numericScale=0, datetimePrecision=0, characterSetName='null', collationName='null', columnType='decimal(41,0)', columnKey='', extra='', privileges='select,insert,update,references', columnComment='', generationExpression=''}*/
private Double totalAllocated;

public Double getTotalAllocated(){
return totalAllocated;
}

}