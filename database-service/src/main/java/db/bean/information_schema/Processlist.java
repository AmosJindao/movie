package db.bean.information_schema;


/* SELECT ID AS id, USER AS user, HOST AS host, DB AS db, COMMAND AS command, TIME AS time, STATE AS state, INFO AS info FROM information_schema.PROCESSLIST */
/**
*/
public class Processlist{
/**Column{tableCatalog='def', tableSchema='information_schema', tableName='PROCESSLIST', columnName='ID', ordinalPosition=1, columnDefault='0', isNullable='NO', dataType='bigint', characterMaximumLength=0, characterOctetLength=0, numericPrecision=20, numericScale=0, datetimePrecision=0, characterSetName='null', collationName='null', columnType='bigint(21) unsigned', columnKey='', extra='', privileges='select', columnComment='', generationExpression=''}*/
private Long id;

/**Column{tableCatalog='def', tableSchema='information_schema', tableName='PROCESSLIST', columnName='USER', ordinalPosition=2, columnDefault='', isNullable='NO', dataType='varchar', characterMaximumLength=32, characterOctetLength=96, numericPrecision=0, numericScale=0, datetimePrecision=0, characterSetName='utf8', collationName='utf8_general_ci', columnType='varchar(32)', columnKey='', extra='', privileges='select', columnComment='', generationExpression=''}*/
private String user;

/**Column{tableCatalog='def', tableSchema='information_schema', tableName='PROCESSLIST', columnName='HOST', ordinalPosition=3, columnDefault='', isNullable='NO', dataType='varchar', characterMaximumLength=64, characterOctetLength=192, numericPrecision=0, numericScale=0, datetimePrecision=0, characterSetName='utf8', collationName='utf8_general_ci', columnType='varchar(64)', columnKey='', extra='', privileges='select', columnComment='', generationExpression=''}*/
private String host;

/**Column{tableCatalog='def', tableSchema='information_schema', tableName='PROCESSLIST', columnName='DB', ordinalPosition=4, columnDefault='null', isNullable='YES', dataType='varchar', characterMaximumLength=64, characterOctetLength=192, numericPrecision=0, numericScale=0, datetimePrecision=0, characterSetName='utf8', collationName='utf8_general_ci', columnType='varchar(64)', columnKey='', extra='', privileges='select', columnComment='', generationExpression=''}*/
private String db;

/**Column{tableCatalog='def', tableSchema='information_schema', tableName='PROCESSLIST', columnName='COMMAND', ordinalPosition=5, columnDefault='', isNullable='NO', dataType='varchar', characterMaximumLength=16, characterOctetLength=48, numericPrecision=0, numericScale=0, datetimePrecision=0, characterSetName='utf8', collationName='utf8_general_ci', columnType='varchar(16)', columnKey='', extra='', privileges='select', columnComment='', generationExpression=''}*/
private String command;

/**Column{tableCatalog='def', tableSchema='information_schema', tableName='PROCESSLIST', columnName='TIME', ordinalPosition=6, columnDefault='0', isNullable='NO', dataType='int', characterMaximumLength=0, characterOctetLength=0, numericPrecision=10, numericScale=0, datetimePrecision=0, characterSetName='null', collationName='null', columnType='int(7)', columnKey='', extra='', privileges='select', columnComment='', generationExpression=''}*/
private Integer time;

/**Column{tableCatalog='def', tableSchema='information_schema', tableName='PROCESSLIST', columnName='STATE', ordinalPosition=7, columnDefault='null', isNullable='YES', dataType='varchar', characterMaximumLength=64, characterOctetLength=192, numericPrecision=0, numericScale=0, datetimePrecision=0, characterSetName='utf8', collationName='utf8_general_ci', columnType='varchar(64)', columnKey='', extra='', privileges='select', columnComment='', generationExpression=''}*/
private String state;

/**Column{tableCatalog='def', tableSchema='information_schema', tableName='PROCESSLIST', columnName='INFO', ordinalPosition=8, columnDefault='null', isNullable='YES', dataType='longtext', characterMaximumLength=4294967295, characterOctetLength=4294967295, numericPrecision=0, numericScale=0, datetimePrecision=0, characterSetName='utf8', collationName='utf8_general_ci', columnType='longtext', columnKey='', extra='', privileges='select', columnComment='', generationExpression=''}*/
private String info;

public Long getId(){
return id;
}

public String getUser(){
return user;
}

public String getHost(){
return host;
}

public String getDb(){
return db;
}

public String getCommand(){
return command;
}

public Integer getTime(){
return time;
}

public String getState(){
return state;
}

public String getInfo(){
return info;
}

}