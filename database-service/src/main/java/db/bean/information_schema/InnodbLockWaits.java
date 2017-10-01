package db.bean.information_schema;


/**
*/
public class InnodbLockWaits{
/**Column{tableCatalog='def', tableSchema='information_schema', tableName='INNODB_LOCK_WAITS', columnName='requesting_trx_id', ordinalPosition=1, columnDefault='', isNullable='NO', dataType='varchar', characterMaximumLength=18, characterOctetLength=54, numericPrecision=0, numericScale=0, datetimePrecision=0, characterSetName='utf8', collationName='utf8_general_ci', columnType='varchar(18)', columnKey='', extra='', privileges='select', columnComment='', generationExpression=''}*/
private String requestingTrxId;

/**Column{tableCatalog='def', tableSchema='information_schema', tableName='INNODB_LOCK_WAITS', columnName='requested_lock_id', ordinalPosition=2, columnDefault='', isNullable='NO', dataType='varchar', characterMaximumLength=81, characterOctetLength=243, numericPrecision=0, numericScale=0, datetimePrecision=0, characterSetName='utf8', collationName='utf8_general_ci', columnType='varchar(81)', columnKey='', extra='', privileges='select', columnComment='', generationExpression=''}*/
private String requestedLockId;

/**Column{tableCatalog='def', tableSchema='information_schema', tableName='INNODB_LOCK_WAITS', columnName='blocking_trx_id', ordinalPosition=3, columnDefault='', isNullable='NO', dataType='varchar', characterMaximumLength=18, characterOctetLength=54, numericPrecision=0, numericScale=0, datetimePrecision=0, characterSetName='utf8', collationName='utf8_general_ci', columnType='varchar(18)', columnKey='', extra='', privileges='select', columnComment='', generationExpression=''}*/
private String blockingTrxId;

/**Column{tableCatalog='def', tableSchema='information_schema', tableName='INNODB_LOCK_WAITS', columnName='blocking_lock_id', ordinalPosition=4, columnDefault='', isNullable='NO', dataType='varchar', characterMaximumLength=81, characterOctetLength=243, numericPrecision=0, numericScale=0, datetimePrecision=0, characterSetName='utf8', collationName='utf8_general_ci', columnType='varchar(81)', columnKey='', extra='', privileges='select', columnComment='', generationExpression=''}*/
private String blockingLockId;

public String getRequestingTrxId(){
return requestingTrxId;
}

public String getRequestedLockId(){
return requestedLockId;
}

public String getBlockingTrxId(){
return blockingTrxId;
}

public String getBlockingLockId(){
return blockingLockId;
}

}