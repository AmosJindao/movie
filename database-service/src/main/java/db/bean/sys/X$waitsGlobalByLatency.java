package db.bean.sys;


/**VIEW
*/
public class X$waitsGlobalByLatency{
/**Column{tableCatalog='def', tableSchema='sys', tableName='x$waits_global_by_latency', columnName='events', ordinalPosition=1, columnDefault='null', isNullable='NO', dataType='varchar', characterMaximumLength=128, characterOctetLength=384, numericPrecision=0, numericScale=0, datetimePrecision=0, characterSetName='utf8', collationName='utf8_general_ci', columnType='varchar(128)', columnKey='', extra='', privileges='select,insert,update,references', columnComment='', generationExpression=''}*/
private String events;

/**Column{tableCatalog='def', tableSchema='sys', tableName='x$waits_global_by_latency', columnName='total', ordinalPosition=2, columnDefault='null', isNullable='NO', dataType='bigint', characterMaximumLength=0, characterOctetLength=0, numericPrecision=20, numericScale=0, datetimePrecision=0, characterSetName='null', collationName='null', columnType='bigint(20) unsigned', columnKey='', extra='', privileges='select,insert,update,references', columnComment='', generationExpression=''}*/
private Long total;

/**Column{tableCatalog='def', tableSchema='sys', tableName='x$waits_global_by_latency', columnName='total_latency', ordinalPosition=3, columnDefault='null', isNullable='NO', dataType='bigint', characterMaximumLength=0, characterOctetLength=0, numericPrecision=20, numericScale=0, datetimePrecision=0, characterSetName='null', collationName='null', columnType='bigint(20) unsigned', columnKey='', extra='', privileges='select,insert,update,references', columnComment='', generationExpression=''}*/
private Long totalLatency;

/**Column{tableCatalog='def', tableSchema='sys', tableName='x$waits_global_by_latency', columnName='avg_latency', ordinalPosition=4, columnDefault='null', isNullable='NO', dataType='bigint', characterMaximumLength=0, characterOctetLength=0, numericPrecision=20, numericScale=0, datetimePrecision=0, characterSetName='null', collationName='null', columnType='bigint(20) unsigned', columnKey='', extra='', privileges='select,insert,update,references', columnComment='', generationExpression=''}*/
private Long avgLatency;

/**Column{tableCatalog='def', tableSchema='sys', tableName='x$waits_global_by_latency', columnName='max_latency', ordinalPosition=5, columnDefault='null', isNullable='NO', dataType='bigint', characterMaximumLength=0, characterOctetLength=0, numericPrecision=20, numericScale=0, datetimePrecision=0, characterSetName='null', collationName='null', columnType='bigint(20) unsigned', columnKey='', extra='', privileges='select,insert,update,references', columnComment='', generationExpression=''}*/
private Long maxLatency;

public String getEvents(){
return events;
}

public Long getTotal(){
return total;
}

public Long getTotalLatency(){
return totalLatency;
}

public Long getAvgLatency(){
return avgLatency;
}

public Long getMaxLatency(){
return maxLatency;
}

}