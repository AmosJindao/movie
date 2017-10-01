package db.bean.sys;


/**VIEW
*/
public class X$waitClassesGlobalByLatency{
/**Column{tableCatalog='def', tableSchema='sys', tableName='x$wait_classes_global_by_latency', columnName='event_class', ordinalPosition=1, columnDefault='null', isNullable='YES', dataType='varchar', characterMaximumLength=128, characterOctetLength=384, numericPrecision=0, numericScale=0, datetimePrecision=0, characterSetName='utf8', collationName='utf8_general_ci', columnType='varchar(128)', columnKey='', extra='', privileges='select,insert,update,references', columnComment='', generationExpression=''}*/
private String eventClass;

/**Column{tableCatalog='def', tableSchema='sys', tableName='x$wait_classes_global_by_latency', columnName='total', ordinalPosition=2, columnDefault='null', isNullable='YES', dataType='decimal', characterMaximumLength=0, characterOctetLength=0, numericPrecision=42, numericScale=0, datetimePrecision=0, characterSetName='null', collationName='null', columnType='decimal(42,0)', columnKey='', extra='', privileges='select,insert,update,references', columnComment='', generationExpression=''}*/
private Double total;

/**Column{tableCatalog='def', tableSchema='sys', tableName='x$wait_classes_global_by_latency', columnName='total_latency', ordinalPosition=3, columnDefault='null', isNullable='YES', dataType='decimal', characterMaximumLength=0, characterOctetLength=0, numericPrecision=42, numericScale=0, datetimePrecision=0, characterSetName='null', collationName='null', columnType='decimal(42,0)', columnKey='', extra='', privileges='select,insert,update,references', columnComment='', generationExpression=''}*/
private Double totalLatency;

/**Column{tableCatalog='def', tableSchema='sys', tableName='x$wait_classes_global_by_latency', columnName='min_latency', ordinalPosition=4, columnDefault='null', isNullable='YES', dataType='bigint', characterMaximumLength=0, characterOctetLength=0, numericPrecision=20, numericScale=0, datetimePrecision=0, characterSetName='null', collationName='null', columnType='bigint(20) unsigned', columnKey='', extra='', privileges='select,insert,update,references', columnComment='', generationExpression=''}*/
private Long minLatency;

/**Column{tableCatalog='def', tableSchema='sys', tableName='x$wait_classes_global_by_latency', columnName='avg_latency', ordinalPosition=5, columnDefault='0.0000', isNullable='NO', dataType='decimal', characterMaximumLength=0, characterOctetLength=0, numericPrecision=46, numericScale=4, datetimePrecision=0, characterSetName='null', collationName='null', columnType='decimal(46,4)', columnKey='', extra='', privileges='select,insert,update,references', columnComment='', generationExpression=''}*/
private Double avgLatency;

/**Column{tableCatalog='def', tableSchema='sys', tableName='x$wait_classes_global_by_latency', columnName='max_latency', ordinalPosition=6, columnDefault='null', isNullable='YES', dataType='bigint', characterMaximumLength=0, characterOctetLength=0, numericPrecision=20, numericScale=0, datetimePrecision=0, characterSetName='null', collationName='null', columnType='bigint(20) unsigned', columnKey='', extra='', privileges='select,insert,update,references', columnComment='', generationExpression=''}*/
private Long maxLatency;

public String getEventClass(){
return eventClass;
}

public Double getTotal(){
return total;
}

public Double getTotalLatency(){
return totalLatency;
}

public Long getMinLatency(){
return minLatency;
}

public Double getAvgLatency(){
return avgLatency;
}

public Long getMaxLatency(){
return maxLatency;
}

}