package db.bean.mysql;


/* SELECT source_uuid AS sourceUuid, interval_start AS intervalStart, interval_end AS intervalEnd FROM mysql.gtid_executed */
/**
*/
public class GtidExecuted{
/**Column{tableCatalog='def', tableSchema='mysql', tableName='gtid_executed', columnName='source_uuid', ordinalPosition=1, columnDefault='null', isNullable='NO', dataType='char', characterMaximumLength=36, characterOctetLength=36, numericPrecision=0, numericScale=0, datetimePrecision=0, characterSetName='latin1', collationName='latin1_swedish_ci', columnType='char(36)', columnKey='PRI', extra='', privileges='select,insert,update,references', columnComment='uuid of the source where the transaction was originally executed.', generationExpression=''}*/
private String sourceUuid;

/**Column{tableCatalog='def', tableSchema='mysql', tableName='gtid_executed', columnName='interval_start', ordinalPosition=2, columnDefault='null', isNullable='NO', dataType='bigint', characterMaximumLength=0, characterOctetLength=0, numericPrecision=19, numericScale=0, datetimePrecision=0, characterSetName='null', collationName='null', columnType='bigint(20)', columnKey='PRI', extra='', privileges='select,insert,update,references', columnComment='First number of interval.', generationExpression=''}*/
private Long intervalStart;

/**Column{tableCatalog='def', tableSchema='mysql', tableName='gtid_executed', columnName='interval_end', ordinalPosition=3, columnDefault='null', isNullable='NO', dataType='bigint', characterMaximumLength=0, characterOctetLength=0, numericPrecision=19, numericScale=0, datetimePrecision=0, characterSetName='null', collationName='null', columnType='bigint(20)', columnKey='', extra='', privileges='select,insert,update,references', columnComment='Last number of interval.', generationExpression=''}*/
private Long intervalEnd;

public String getSourceUuid(){
return sourceUuid;
}

public Long getIntervalStart(){
return intervalStart;
}

public Long getIntervalEnd(){
return intervalEnd;
}

}