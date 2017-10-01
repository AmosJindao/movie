package db.bean.information_schema;


/**
*/
public class InnodbLocks{
/**Column{tableCatalog='def', tableSchema='information_schema', tableName='INNODB_LOCKS', columnName='lock_id', ordinalPosition=1, columnDefault='', isNullable='NO', dataType='varchar', characterMaximumLength=81, characterOctetLength=243, numericPrecision=0, numericScale=0, datetimePrecision=0, characterSetName='utf8', collationName='utf8_general_ci', columnType='varchar(81)', columnKey='', extra='', privileges='select', columnComment='', generationExpression=''}*/
private String lockId;

/**Column{tableCatalog='def', tableSchema='information_schema', tableName='INNODB_LOCKS', columnName='lock_trx_id', ordinalPosition=2, columnDefault='', isNullable='NO', dataType='varchar', characterMaximumLength=18, characterOctetLength=54, numericPrecision=0, numericScale=0, datetimePrecision=0, characterSetName='utf8', collationName='utf8_general_ci', columnType='varchar(18)', columnKey='', extra='', privileges='select', columnComment='', generationExpression=''}*/
private String lockTrxId;

/**Column{tableCatalog='def', tableSchema='information_schema', tableName='INNODB_LOCKS', columnName='lock_mode', ordinalPosition=3, columnDefault='', isNullable='NO', dataType='varchar', characterMaximumLength=32, characterOctetLength=96, numericPrecision=0, numericScale=0, datetimePrecision=0, characterSetName='utf8', collationName='utf8_general_ci', columnType='varchar(32)', columnKey='', extra='', privileges='select', columnComment='', generationExpression=''}*/
private String lockMode;

/**Column{tableCatalog='def', tableSchema='information_schema', tableName='INNODB_LOCKS', columnName='lock_type', ordinalPosition=4, columnDefault='', isNullable='NO', dataType='varchar', characterMaximumLength=32, characterOctetLength=96, numericPrecision=0, numericScale=0, datetimePrecision=0, characterSetName='utf8', collationName='utf8_general_ci', columnType='varchar(32)', columnKey='', extra='', privileges='select', columnComment='', generationExpression=''}*/
private String lockType;

/**Column{tableCatalog='def', tableSchema='information_schema', tableName='INNODB_LOCKS', columnName='lock_table', ordinalPosition=5, columnDefault='', isNullable='NO', dataType='varchar', characterMaximumLength=1024, characterOctetLength=3072, numericPrecision=0, numericScale=0, datetimePrecision=0, characterSetName='utf8', collationName='utf8_general_ci', columnType='varchar(1024)', columnKey='', extra='', privileges='select', columnComment='', generationExpression=''}*/
private String lockTable;

/**Column{tableCatalog='def', tableSchema='information_schema', tableName='INNODB_LOCKS', columnName='lock_index', ordinalPosition=6, columnDefault='null', isNullable='YES', dataType='varchar', characterMaximumLength=1024, characterOctetLength=3072, numericPrecision=0, numericScale=0, datetimePrecision=0, characterSetName='utf8', collationName='utf8_general_ci', columnType='varchar(1024)', columnKey='', extra='', privileges='select', columnComment='', generationExpression=''}*/
private String lockIndex;

/**Column{tableCatalog='def', tableSchema='information_schema', tableName='INNODB_LOCKS', columnName='lock_space', ordinalPosition=7, columnDefault='null', isNullable='YES', dataType='bigint', characterMaximumLength=0, characterOctetLength=0, numericPrecision=20, numericScale=0, datetimePrecision=0, characterSetName='null', collationName='null', columnType='bigint(21) unsigned', columnKey='', extra='', privileges='select', columnComment='', generationExpression=''}*/
private Long lockSpace;

/**Column{tableCatalog='def', tableSchema='information_schema', tableName='INNODB_LOCKS', columnName='lock_page', ordinalPosition=8, columnDefault='null', isNullable='YES', dataType='bigint', characterMaximumLength=0, characterOctetLength=0, numericPrecision=20, numericScale=0, datetimePrecision=0, characterSetName='null', collationName='null', columnType='bigint(21) unsigned', columnKey='', extra='', privileges='select', columnComment='', generationExpression=''}*/
private Long lockPage;

/**Column{tableCatalog='def', tableSchema='information_schema', tableName='INNODB_LOCKS', columnName='lock_rec', ordinalPosition=9, columnDefault='null', isNullable='YES', dataType='bigint', characterMaximumLength=0, characterOctetLength=0, numericPrecision=20, numericScale=0, datetimePrecision=0, characterSetName='null', collationName='null', columnType='bigint(21) unsigned', columnKey='', extra='', privileges='select', columnComment='', generationExpression=''}*/
private Long lockRec;

/**Column{tableCatalog='def', tableSchema='information_schema', tableName='INNODB_LOCKS', columnName='lock_data', ordinalPosition=10, columnDefault='null', isNullable='YES', dataType='varchar', characterMaximumLength=8192, characterOctetLength=24576, numericPrecision=0, numericScale=0, datetimePrecision=0, characterSetName='utf8', collationName='utf8_general_ci', columnType='varchar(8192)', columnKey='', extra='', privileges='select', columnComment='', generationExpression=''}*/
private String lockData;

public String getLockId(){
return lockId;
}

public String getLockTrxId(){
return lockTrxId;
}

public String getLockMode(){
return lockMode;
}

public String getLockType(){
return lockType;
}

public String getLockTable(){
return lockTable;
}

public String getLockIndex(){
return lockIndex;
}

public Long getLockSpace(){
return lockSpace;
}

public Long getLockPage(){
return lockPage;
}

public Long getLockRec(){
return lockRec;
}

public String getLockData(){
return lockData;
}

}