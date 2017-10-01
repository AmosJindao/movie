package db.bean.performance_schema;


/**
*/
public class Accounts{
/**Column{tableCatalog='def', tableSchema='performance_schema', tableName='accounts', columnName='USER', ordinalPosition=1, columnDefault='null', isNullable='YES', dataType='char', characterMaximumLength=32, characterOctetLength=96, numericPrecision=0, numericScale=0, datetimePrecision=0, characterSetName='utf8', collationName='utf8_bin', columnType='char(32)', columnKey='', extra='', privileges='select,insert,update,references', columnComment='', generationExpression=''}*/
private String user;

/**Column{tableCatalog='def', tableSchema='performance_schema', tableName='accounts', columnName='HOST', ordinalPosition=2, columnDefault='null', isNullable='YES', dataType='char', characterMaximumLength=60, characterOctetLength=180, numericPrecision=0, numericScale=0, datetimePrecision=0, characterSetName='utf8', collationName='utf8_bin', columnType='char(60)', columnKey='', extra='', privileges='select,insert,update,references', columnComment='', generationExpression=''}*/
private String host;

/**Column{tableCatalog='def', tableSchema='performance_schema', tableName='accounts', columnName='CURRENT_CONNECTIONS', ordinalPosition=3, columnDefault='null', isNullable='NO', dataType='bigint', characterMaximumLength=0, characterOctetLength=0, numericPrecision=19, numericScale=0, datetimePrecision=0, characterSetName='null', collationName='null', columnType='bigint(20)', columnKey='', extra='', privileges='select,insert,update,references', columnComment='', generationExpression=''}*/
private Long currentConnections;

/**Column{tableCatalog='def', tableSchema='performance_schema', tableName='accounts', columnName='TOTAL_CONNECTIONS', ordinalPosition=4, columnDefault='null', isNullable='NO', dataType='bigint', characterMaximumLength=0, characterOctetLength=0, numericPrecision=19, numericScale=0, datetimePrecision=0, characterSetName='null', collationName='null', columnType='bigint(20)', columnKey='', extra='', privileges='select,insert,update,references', columnComment='', generationExpression=''}*/
private Long totalConnections;

public String getUser(){
return user;
}

public String getHost(){
return host;
}

public Long getCurrentConnections(){
return currentConnections;
}

public Long getTotalConnections(){
return totalConnections;
}

}