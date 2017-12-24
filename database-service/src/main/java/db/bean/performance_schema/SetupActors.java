package db.bean.performance_schema;

import java.util.Date;

/* SELECT HOST AS host, USER AS user, ROLE AS role, ENABLED AS enabled, HISTORY AS history FROM performance_schema.setup_actors */
/**
*/
public class SetupActors{
/**Column{tableCatalog='def', tableSchema='performance_schema', tableName='setup_actors', columnName='HOST', ordinalPosition=1, columnDefault='%', isNullable='NO', dataType='char', characterMaximumLength=60, characterOctetLength=180, numericPrecision=0, numericScale=0, datetimePrecision=0, characterSetName='utf8', collationName='utf8_bin', columnType='char(60)', columnKey='', extra='', privileges='select,insert,update,references', columnComment='', generationExpression=''}*/
private String host;

/**Column{tableCatalog='def', tableSchema='performance_schema', tableName='setup_actors', columnName='USER', ordinalPosition=2, columnDefault='%', isNullable='NO', dataType='char', characterMaximumLength=32, characterOctetLength=96, numericPrecision=0, numericScale=0, datetimePrecision=0, characterSetName='utf8', collationName='utf8_bin', columnType='char(32)', columnKey='', extra='', privileges='select,insert,update,references', columnComment='', generationExpression=''}*/
private String user;

/**Column{tableCatalog='def', tableSchema='performance_schema', tableName='setup_actors', columnName='ROLE', ordinalPosition=3, columnDefault='%', isNullable='NO', dataType='char', characterMaximumLength=16, characterOctetLength=48, numericPrecision=0, numericScale=0, datetimePrecision=0, characterSetName='utf8', collationName='utf8_bin', columnType='char(16)', columnKey='', extra='', privileges='select,insert,update,references', columnComment='', generationExpression=''}*/
private String role;

/**Column{tableCatalog='def', tableSchema='performance_schema', tableName='setup_actors', columnName='ENABLED', ordinalPosition=4, columnDefault='YES', isNullable='NO', dataType='enum', characterMaximumLength=3, characterOctetLength=9, numericPrecision=0, numericScale=0, datetimePrecision=0, characterSetName='utf8', collationName='utf8_general_ci', columnType='enum('YES','NO')', columnKey='', extra='', privileges='select,insert,update,references', columnComment='', generationExpression=''}*/
private Date enabled;

/**Column{tableCatalog='def', tableSchema='performance_schema', tableName='setup_actors', columnName='HISTORY', ordinalPosition=5, columnDefault='YES', isNullable='NO', dataType='enum', characterMaximumLength=3, characterOctetLength=9, numericPrecision=0, numericScale=0, datetimePrecision=0, characterSetName='utf8', collationName='utf8_general_ci', columnType='enum('YES','NO')', columnKey='', extra='', privileges='select,insert,update,references', columnComment='', generationExpression=''}*/
private Date history;

public String getHost(){
return host;
}

public String getUser(){
return user;
}

public String getRole(){
return role;
}

public Date getEnabled(){
return enabled;
}

public Date getHistory(){
return history;
}

}