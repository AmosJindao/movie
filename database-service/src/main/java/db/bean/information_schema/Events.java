package db.bean.information_schema;

import java.util.Date;

/* SELECT EVENT_CATALOG AS eventCatalog, EVENT_SCHEMA AS eventSchema, EVENT_NAME AS eventName, DEFINER AS definer, TIME_ZONE AS timeZone, EVENT_BODY AS eventBody, EVENT_DEFINITION AS eventDefinition, EVENT_TYPE AS eventType, EXECUTE_AT AS executeAt, INTERVAL_VALUE AS intervalValue, INTERVAL_FIELD AS intervalField, SQL_MODE AS sqlMode, STARTS AS starts, ENDS AS ends, STATUS AS status, ON_COMPLETION AS onCompletion, CREATED AS created, LAST_ALTERED AS lastAltered, LAST_EXECUTED AS lastExecuted, EVENT_COMMENT AS eventComment, ORIGINATOR AS originator, CHARACTER_SET_CLIENT AS characterSetClient, COLLATION_CONNECTION AS collationConnection, DATABASE_COLLATION AS databaseCollation FROM information_schema.EVENTS */
/**
*/
public class Events{
/**Column{tableCatalog='def', tableSchema='information_schema', tableName='EVENTS', columnName='EVENT_CATALOG', ordinalPosition=1, columnDefault='', isNullable='NO', dataType='varchar', characterMaximumLength=64, characterOctetLength=192, numericPrecision=0, numericScale=0, datetimePrecision=0, characterSetName='utf8', collationName='utf8_general_ci', columnType='varchar(64)', columnKey='', extra='', privileges='select', columnComment='', generationExpression=''}*/
private String eventCatalog;

/**Column{tableCatalog='def', tableSchema='information_schema', tableName='EVENTS', columnName='EVENT_SCHEMA', ordinalPosition=2, columnDefault='', isNullable='NO', dataType='varchar', characterMaximumLength=64, characterOctetLength=192, numericPrecision=0, numericScale=0, datetimePrecision=0, characterSetName='utf8', collationName='utf8_general_ci', columnType='varchar(64)', columnKey='', extra='', privileges='select', columnComment='', generationExpression=''}*/
private String eventSchema;

/**Column{tableCatalog='def', tableSchema='information_schema', tableName='EVENTS', columnName='EVENT_NAME', ordinalPosition=3, columnDefault='', isNullable='NO', dataType='varchar', characterMaximumLength=64, characterOctetLength=192, numericPrecision=0, numericScale=0, datetimePrecision=0, characterSetName='utf8', collationName='utf8_general_ci', columnType='varchar(64)', columnKey='', extra='', privileges='select', columnComment='', generationExpression=''}*/
private String eventName;

/**Column{tableCatalog='def', tableSchema='information_schema', tableName='EVENTS', columnName='DEFINER', ordinalPosition=4, columnDefault='', isNullable='NO', dataType='varchar', characterMaximumLength=93, characterOctetLength=279, numericPrecision=0, numericScale=0, datetimePrecision=0, characterSetName='utf8', collationName='utf8_general_ci', columnType='varchar(93)', columnKey='', extra='', privileges='select', columnComment='', generationExpression=''}*/
private String definer;

/**Column{tableCatalog='def', tableSchema='information_schema', tableName='EVENTS', columnName='TIME_ZONE', ordinalPosition=5, columnDefault='', isNullable='NO', dataType='varchar', characterMaximumLength=64, characterOctetLength=192, numericPrecision=0, numericScale=0, datetimePrecision=0, characterSetName='utf8', collationName='utf8_general_ci', columnType='varchar(64)', columnKey='', extra='', privileges='select', columnComment='', generationExpression=''}*/
private String timeZone;

/**Column{tableCatalog='def', tableSchema='information_schema', tableName='EVENTS', columnName='EVENT_BODY', ordinalPosition=6, columnDefault='', isNullable='NO', dataType='varchar', characterMaximumLength=8, characterOctetLength=24, numericPrecision=0, numericScale=0, datetimePrecision=0, characterSetName='utf8', collationName='utf8_general_ci', columnType='varchar(8)', columnKey='', extra='', privileges='select', columnComment='', generationExpression=''}*/
private String eventBody;

/**Column{tableCatalog='def', tableSchema='information_schema', tableName='EVENTS', columnName='EVENT_DEFINITION', ordinalPosition=7, columnDefault='null', isNullable='NO', dataType='longtext', characterMaximumLength=4294967295, characterOctetLength=4294967295, numericPrecision=0, numericScale=0, datetimePrecision=0, characterSetName='utf8', collationName='utf8_general_ci', columnType='longtext', columnKey='', extra='', privileges='select', columnComment='', generationExpression=''}*/
private String eventDefinition;

/**Column{tableCatalog='def', tableSchema='information_schema', tableName='EVENTS', columnName='EVENT_TYPE', ordinalPosition=8, columnDefault='', isNullable='NO', dataType='varchar', characterMaximumLength=9, characterOctetLength=27, numericPrecision=0, numericScale=0, datetimePrecision=0, characterSetName='utf8', collationName='utf8_general_ci', columnType='varchar(9)', columnKey='', extra='', privileges='select', columnComment='', generationExpression=''}*/
private String eventType;

/**Column{tableCatalog='def', tableSchema='information_schema', tableName='EVENTS', columnName='EXECUTE_AT', ordinalPosition=9, columnDefault='null', isNullable='YES', dataType='datetime', characterMaximumLength=0, characterOctetLength=0, numericPrecision=0, numericScale=0, datetimePrecision=0, characterSetName='null', collationName='null', columnType='datetime', columnKey='', extra='', privileges='select', columnComment='', generationExpression=''}*/
private Date executeAt;

/**Column{tableCatalog='def', tableSchema='information_schema', tableName='EVENTS', columnName='INTERVAL_VALUE', ordinalPosition=10, columnDefault='null', isNullable='YES', dataType='varchar', characterMaximumLength=256, characterOctetLength=768, numericPrecision=0, numericScale=0, datetimePrecision=0, characterSetName='utf8', collationName='utf8_general_ci', columnType='varchar(256)', columnKey='', extra='', privileges='select', columnComment='', generationExpression=''}*/
private String intervalValue;

/**Column{tableCatalog='def', tableSchema='information_schema', tableName='EVENTS', columnName='INTERVAL_FIELD', ordinalPosition=11, columnDefault='null', isNullable='YES', dataType='varchar', characterMaximumLength=18, characterOctetLength=54, numericPrecision=0, numericScale=0, datetimePrecision=0, characterSetName='utf8', collationName='utf8_general_ci', columnType='varchar(18)', columnKey='', extra='', privileges='select', columnComment='', generationExpression=''}*/
private String intervalField;

/**Column{tableCatalog='def', tableSchema='information_schema', tableName='EVENTS', columnName='SQL_MODE', ordinalPosition=12, columnDefault='', isNullable='NO', dataType='varchar', characterMaximumLength=8192, characterOctetLength=24576, numericPrecision=0, numericScale=0, datetimePrecision=0, characterSetName='utf8', collationName='utf8_general_ci', columnType='varchar(8192)', columnKey='', extra='', privileges='select', columnComment='', generationExpression=''}*/
private String sqlMode;

/**Column{tableCatalog='def', tableSchema='information_schema', tableName='EVENTS', columnName='STARTS', ordinalPosition=13, columnDefault='null', isNullable='YES', dataType='datetime', characterMaximumLength=0, characterOctetLength=0, numericPrecision=0, numericScale=0, datetimePrecision=0, characterSetName='null', collationName='null', columnType='datetime', columnKey='', extra='', privileges='select', columnComment='', generationExpression=''}*/
private Date starts;

/**Column{tableCatalog='def', tableSchema='information_schema', tableName='EVENTS', columnName='ENDS', ordinalPosition=14, columnDefault='null', isNullable='YES', dataType='datetime', characterMaximumLength=0, characterOctetLength=0, numericPrecision=0, numericScale=0, datetimePrecision=0, characterSetName='null', collationName='null', columnType='datetime', columnKey='', extra='', privileges='select', columnComment='', generationExpression=''}*/
private Date ends;

/**Column{tableCatalog='def', tableSchema='information_schema', tableName='EVENTS', columnName='STATUS', ordinalPosition=15, columnDefault='', isNullable='NO', dataType='varchar', characterMaximumLength=18, characterOctetLength=54, numericPrecision=0, numericScale=0, datetimePrecision=0, characterSetName='utf8', collationName='utf8_general_ci', columnType='varchar(18)', columnKey='', extra='', privileges='select', columnComment='', generationExpression=''}*/
private String status;

/**Column{tableCatalog='def', tableSchema='information_schema', tableName='EVENTS', columnName='ON_COMPLETION', ordinalPosition=16, columnDefault='', isNullable='NO', dataType='varchar', characterMaximumLength=12, characterOctetLength=36, numericPrecision=0, numericScale=0, datetimePrecision=0, characterSetName='utf8', collationName='utf8_general_ci', columnType='varchar(12)', columnKey='', extra='', privileges='select', columnComment='', generationExpression=''}*/
private String onCompletion;

/**Column{tableCatalog='def', tableSchema='information_schema', tableName='EVENTS', columnName='CREATED', ordinalPosition=17, columnDefault='0000-00-00 00:00:00', isNullable='NO', dataType='datetime', characterMaximumLength=0, characterOctetLength=0, numericPrecision=0, numericScale=0, datetimePrecision=0, characterSetName='null', collationName='null', columnType='datetime', columnKey='', extra='', privileges='select', columnComment='', generationExpression=''}*/
private Date created;

/**Column{tableCatalog='def', tableSchema='information_schema', tableName='EVENTS', columnName='LAST_ALTERED', ordinalPosition=18, columnDefault='0000-00-00 00:00:00', isNullable='NO', dataType='datetime', characterMaximumLength=0, characterOctetLength=0, numericPrecision=0, numericScale=0, datetimePrecision=0, characterSetName='null', collationName='null', columnType='datetime', columnKey='', extra='', privileges='select', columnComment='', generationExpression=''}*/
private Date lastAltered;

/**Column{tableCatalog='def', tableSchema='information_schema', tableName='EVENTS', columnName='LAST_EXECUTED', ordinalPosition=19, columnDefault='null', isNullable='YES', dataType='datetime', characterMaximumLength=0, characterOctetLength=0, numericPrecision=0, numericScale=0, datetimePrecision=0, characterSetName='null', collationName='null', columnType='datetime', columnKey='', extra='', privileges='select', columnComment='', generationExpression=''}*/
private Date lastExecuted;

/**Column{tableCatalog='def', tableSchema='information_schema', tableName='EVENTS', columnName='EVENT_COMMENT', ordinalPosition=20, columnDefault='', isNullable='NO', dataType='varchar', characterMaximumLength=64, characterOctetLength=192, numericPrecision=0, numericScale=0, datetimePrecision=0, characterSetName='utf8', collationName='utf8_general_ci', columnType='varchar(64)', columnKey='', extra='', privileges='select', columnComment='', generationExpression=''}*/
private String eventComment;

/**Column{tableCatalog='def', tableSchema='information_schema', tableName='EVENTS', columnName='ORIGINATOR', ordinalPosition=21, columnDefault='0', isNullable='NO', dataType='bigint', characterMaximumLength=0, characterOctetLength=0, numericPrecision=19, numericScale=0, datetimePrecision=0, characterSetName='null', collationName='null', columnType='bigint(10)', columnKey='', extra='', privileges='select', columnComment='', generationExpression=''}*/
private Long originator;

/**Column{tableCatalog='def', tableSchema='information_schema', tableName='EVENTS', columnName='CHARACTER_SET_CLIENT', ordinalPosition=22, columnDefault='', isNullable='NO', dataType='varchar', characterMaximumLength=32, characterOctetLength=96, numericPrecision=0, numericScale=0, datetimePrecision=0, characterSetName='utf8', collationName='utf8_general_ci', columnType='varchar(32)', columnKey='', extra='', privileges='select', columnComment='', generationExpression=''}*/
private String characterSetClient;

/**Column{tableCatalog='def', tableSchema='information_schema', tableName='EVENTS', columnName='COLLATION_CONNECTION', ordinalPosition=23, columnDefault='', isNullable='NO', dataType='varchar', characterMaximumLength=32, characterOctetLength=96, numericPrecision=0, numericScale=0, datetimePrecision=0, characterSetName='utf8', collationName='utf8_general_ci', columnType='varchar(32)', columnKey='', extra='', privileges='select', columnComment='', generationExpression=''}*/
private String collationConnection;

/**Column{tableCatalog='def', tableSchema='information_schema', tableName='EVENTS', columnName='DATABASE_COLLATION', ordinalPosition=24, columnDefault='', isNullable='NO', dataType='varchar', characterMaximumLength=32, characterOctetLength=96, numericPrecision=0, numericScale=0, datetimePrecision=0, characterSetName='utf8', collationName='utf8_general_ci', columnType='varchar(32)', columnKey='', extra='', privileges='select', columnComment='', generationExpression=''}*/
private String databaseCollation;

public String getEventCatalog(){
return eventCatalog;
}

public String getEventSchema(){
return eventSchema;
}

public String getEventName(){
return eventName;
}

public String getDefiner(){
return definer;
}

public String getTimeZone(){
return timeZone;
}

public String getEventBody(){
return eventBody;
}

public String getEventDefinition(){
return eventDefinition;
}

public String getEventType(){
return eventType;
}

public Date getExecuteAt(){
return executeAt;
}

public String getIntervalValue(){
return intervalValue;
}

public String getIntervalField(){
return intervalField;
}

public String getSqlMode(){
return sqlMode;
}

public Date getStarts(){
return starts;
}

public Date getEnds(){
return ends;
}

public String getStatus(){
return status;
}

public String getOnCompletion(){
return onCompletion;
}

public Date getCreated(){
return created;
}

public Date getLastAltered(){
return lastAltered;
}

public Date getLastExecuted(){
return lastExecuted;
}

public String getEventComment(){
return eventComment;
}

public Long getOriginator(){
return originator;
}

public String getCharacterSetClient(){
return characterSetClient;
}

public String getCollationConnection(){
return collationConnection;
}

public String getDatabaseCollation(){
return databaseCollation;
}

}