package db.bean.sys;


/* SELECT cnt AS cnt, avg_us AS avgUs FROM sys.x$ps_digest_avg_latency_distribution */
/**VIEW
*/
public class X$psDigestAvgLatencyDistribution{
/**Column{tableCatalog='def', tableSchema='sys', tableName='x$ps_digest_avg_latency_distribution', columnName='cnt', ordinalPosition=1, columnDefault='0', isNullable='NO', dataType='bigint', characterMaximumLength=0, characterOctetLength=0, numericPrecision=19, numericScale=0, datetimePrecision=0, characterSetName='null', collationName='null', columnType='bigint(21)', columnKey='', extra='', privileges='select,insert,update,references', columnComment='', generationExpression=''}*/
private Long cnt;

/**Column{tableCatalog='def', tableSchema='sys', tableName='x$ps_digest_avg_latency_distribution', columnName='avg_us', ordinalPosition=2, columnDefault='null', isNullable='YES', dataType='decimal', characterMaximumLength=0, characterOctetLength=0, numericPrecision=21, numericScale=0, datetimePrecision=0, characterSetName='null', collationName='null', columnType='decimal(21,0)', columnKey='', extra='', privileges='select,insert,update,references', columnComment='', generationExpression=''}*/
private Double avgUs;

public Long getCnt(){
return cnt;
}

public Double getAvgUs(){
return avgUs;
}

}