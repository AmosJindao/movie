package db.bean.sys;


/**VIEW
*/
public class X$psDigest95thPercentileByAvgUs{
/**Column{tableCatalog='def', tableSchema='sys', tableName='x$ps_digest_95th_percentile_by_avg_us', columnName='avg_us', ordinalPosition=1, columnDefault='null', isNullable='YES', dataType='decimal', characterMaximumLength=0, characterOctetLength=0, numericPrecision=21, numericScale=0, datetimePrecision=0, characterSetName='null', collationName='null', columnType='decimal(21,0)', columnKey='', extra='', privileges='select,insert,update,references', columnComment='', generationExpression=''}*/
private Double avgUs;

/**Column{tableCatalog='def', tableSchema='sys', tableName='x$ps_digest_95th_percentile_by_avg_us', columnName='percentile', ordinalPosition=2, columnDefault='0.0000', isNullable='NO', dataType='decimal', characterMaximumLength=0, characterOctetLength=0, numericPrecision=46, numericScale=4, datetimePrecision=0, characterSetName='null', collationName='null', columnType='decimal(46,4)', columnKey='', extra='', privileges='select,insert,update,references', columnComment='', generationExpression=''}*/
private Double percentile;

public Double getAvgUs(){
return avgUs;
}

public Double getPercentile(){
return percentile;
}

}