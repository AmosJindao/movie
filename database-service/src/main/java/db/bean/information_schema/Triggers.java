package db.bean.information_schema;

import java.util.Date;

/**
*/
public class Triggers{
/**Column{tableCatalog='def', tableSchema='information_schema', tableName='TRIGGERS', columnName='TRIGGER_CATALOG', ordinalPosition=1, columnDefault='', isNullable='NO', dataType='varchar', characterMaximumLength=512, characterOctetLength=1536, numericPrecision=0, numericScale=0, datetimePrecision=0, characterSetName='utf8', collationName='utf8_general_ci', columnType='varchar(512)', columnKey='', extra='', privileges='select', columnComment='', generationExpression=''}*/
private String triggerCatalog;

/**Column{tableCatalog='def', tableSchema='information_schema', tableName='TRIGGERS', columnName='TRIGGER_SCHEMA', ordinalPosition=2, columnDefault='', isNullable='NO', dataType='varchar', characterMaximumLength=64, characterOctetLength=192, numericPrecision=0, numericScale=0, datetimePrecision=0, characterSetName='utf8', collationName='utf8_general_ci', columnType='varchar(64)', columnKey='', extra='', privileges='select', columnComment='', generationExpression=''}*/
private String triggerSchema;

/**Column{tableCatalog='def', tableSchema='information_schema', tableName='TRIGGERS', columnName='TRIGGER_NAME', ordinalPosition=3, columnDefault='', isNullable='NO', dataType='varchar', characterMaximumLength=64, characterOctetLength=192, numericPrecision=0, numericScale=0, datetimePrecision=0, characterSetName='utf8', collationName='utf8_general_ci', columnType='varchar(64)', columnKey='', extra='', privileges='select', columnComment='', generationExpression=''}*/
private String triggerName;

/**Column{tableCatalog='def', tableSchema='information_schema', tableName='TRIGGERS', columnName='EVENT_MANIPULATION', ordinalPosition=4, columnDefault='', isNullable='NO', dataType='varchar', characterMaximumLength=6, characterOctetLength=18, numericPrecision=0, numericScale=0, datetimePrecision=0, characterSetName='utf8', collationName='utf8_general_ci', columnType='varchar(6)', columnKey='', extra='', privileges='select', columnComment='', generationExpression=''}*/
private String eventManipulation;

/**Column{tableCatalog='def', tableSchema='information_schema', tableName='TRIGGERS', columnName='EVENT_OBJECT_CATALOG', ordinalPosition=5, columnDefault='', isNullable='NO', dataType='varchar', characterMaximumLength=512, characterOctetLength=1536, numericPrecision=0, numericScale=0, datetimePrecision=0, characterSetName='utf8', collationName='utf8_general_ci', columnType='varchar(512)', columnKey='', extra='', privileges='select', columnComment='', generationExpression=''}*/
private String eventObjectCatalog;

/**Column{tableCatalog='def', tableSchema='information_schema', tableName='TRIGGERS', columnName='EVENT_OBJECT_SCHEMA', ordinalPosition=6, columnDefault='', isNullable='NO', dataType='varchar', characterMaximumLength=64, characterOctetLength=192, numericPrecision=0, numericScale=0, datetimePrecision=0, characterSetName='utf8', collationName='utf8_general_ci', columnType='varchar(64)', columnKey='', extra='', privileges='select', columnComment='', generationExpression=''}*/
private String eventObjectSchema;

/**Column{tableCatalog='def', tableSchema='information_schema', tableName='TRIGGERS', columnName='EVENT_OBJECT_TABLE', ordinalPosition=7, columnDefault='', isNullable='NO', dataType='varchar', characterMaximumLength=64, characterOctetLength=192, numericPrecision=0, numericScale=0, datetimePrecision=0, characterSetName='utf8', collationName='utf8_general_ci', columnType='varchar(64)', columnKey='', extra='', privileges='select', columnComment='', generationExpression=''}*/
private String eventObjectTable;

/**Column{tableCatalog='def', tableSchema='information_schema', tableName='TRIGGERS', columnName='ACTION_ORDER', ordinalPosition=8, columnDefault='0', isNullable='NO', dataType='bigint', characterMaximumLength=0, characterOctetLength=0, numericPrecision=19, numericScale=0, datetimePrecision=0, characterSetName='null', collationName='null', columnType='bigint(4)', columnKey='', extra='', privileges='select', columnComment='', generationExpression=''}*/
private Long actionOrder;

/**Column{tableCatalog='def', tableSchema='information_schema', tableName='TRIGGERS', columnName='ACTION_CONDITION', ordinalPosition=9, columnDefault='null', isNullable='YES', dataType='longtext', characterMaximumLength=4294967295, characterOctetLength=4294967295, numericPrecision=0, numericScale=0, datetimePrecision=0, characterSetName='utf8', collationName='utf8_general_ci', columnType='longtext', columnKey='', extra='', privileges='select', columnComment='', generationExpression=''}*/
private String actionCondition;

/**Column{tableCatalog='def', tableSchema='information_schema', tableName='TRIGGERS', columnName='ACTION_STATEMENT', ordinalPosition=10, columnDefault='null', isNullable='NO', dataType='longtext', characterMaximumLength=4294967295, characterOctetLength=4294967295, numericPrecision=0, numericScale=0, datetimePrecision=0, characterSetName='utf8', collationName='utf8_general_ci', columnType='longtext', columnKey='', extra='', privileges='select', columnComment='', generationExpression=''}*/
private String actionStatement;

/**Column{tableCatalog='def', tableSchema='information_schema', tableName='TRIGGERS', columnName='ACTION_ORIENTATION', ordinalPosition=11, columnDefault='', isNullable='NO', dataType='varchar', characterMaximumLength=9, characterOctetLength=27, numericPrecision=0, numericScale=0, datetimePrecision=0, characterSetName='utf8', collationName='utf8_general_ci', columnType='varchar(9)', columnKey='', extra='', privileges='select', columnComment='', generationExpression=''}*/
private String actionOrientation;

/**Column{tableCatalog='def', tableSchema='information_schema', tableName='TRIGGERS', columnName='ACTION_TIMING', ordinalPosition=12, columnDefault='', isNullable='NO', dataType='varchar', characterMaximumLength=6, characterOctetLength=18, numericPrecision=0, numericScale=0, datetimePrecision=0, characterSetName='utf8', collationName='utf8_general_ci', columnType='varchar(6)', columnKey='', extra='', privileges='select', columnComment='', generationExpression=''}*/
private String actionTiming;

/**Column{tableCatalog='def', tableSchema='information_schema', tableName='TRIGGERS', columnName='ACTION_REFERENCE_OLD_TABLE', ordinalPosition=13, columnDefault='null', isNullable='YES', dataType='varchar', characterMaximumLength=64, characterOctetLength=192, numericPrecision=0, numericScale=0, datetimePrecision=0, characterSetName='utf8', collationName='utf8_general_ci', columnType='varchar(64)', columnKey='', extra='', privileges='select', columnComment='', generationExpression=''}*/
private String actionReferenceOldTable;

/**Column{tableCatalog='def', tableSchema='information_schema', tableName='TRIGGERS', columnName='ACTION_REFERENCE_NEW_TABLE', ordinalPosition=14, columnDefault='null', isNullable='YES', dataType='varchar', characterMaximumLength=64, characterOctetLength=192, numericPrecision=0, numericScale=0, datetimePrecision=0, characterSetName='utf8', collationName='utf8_general_ci', columnType='varchar(64)', columnKey='', extra='', privileges='select', columnComment='', generationExpression=''}*/
private String actionReferenceNewTable;

/**Column{tableCatalog='def', tableSchema='information_schema', tableName='TRIGGERS', columnName='ACTION_REFERENCE_OLD_ROW', ordinalPosition=15, columnDefault='', isNullable='NO', dataType='varchar', characterMaximumLength=3, characterOctetLength=9, numericPrecision=0, numericScale=0, datetimePrecision=0, characterSetName='utf8', collationName='utf8_general_ci', columnType='varchar(3)', columnKey='', extra='', privileges='select', columnComment='', generationExpression=''}*/
private String actionReferenceOldRow;

/**Column{tableCatalog='def', tableSchema='information_schema', tableName='TRIGGERS', columnName='ACTION_REFERENCE_NEW_ROW', ordinalPosition=16, columnDefault='', isNullable='NO', dataType='varchar', characterMaximumLength=3, characterOctetLength=9, numericPrecision=0, numericScale=0, datetimePrecision=0, characterSetName='utf8', collationName='utf8_general_ci', columnType='varchar(3)', columnKey='', extra='', privileges='select', columnComment='', generationExpression=''}*/
private String actionReferenceNewRow;

/**Column{tableCatalog='def', tableSchema='information_schema', tableName='TRIGGERS', columnName='CREATED', ordinalPosition=17, columnDefault='null', isNullable='YES', dataType='datetime', characterMaximumLength=0, characterOctetLength=0, numericPrecision=0, numericScale=0, datetimePrecision=2, characterSetName='null', collationName='null', columnType='datetime(2)', columnKey='', extra='', privileges='select', columnComment='', generationExpression=''}*/
private Date created;

/**Column{tableCatalog='def', tableSchema='information_schema', tableName='TRIGGERS', columnName='SQL_MODE', ordinalPosition=18, columnDefault='', isNullable='NO', dataType='varchar', characterMaximumLength=8192, characterOctetLength=24576, numericPrecision=0, numericScale=0, datetimePrecision=0, characterSetName='utf8', collationName='utf8_general_ci', columnType='varchar(8192)', columnKey='', extra='', privileges='select', columnComment='', generationExpression=''}*/
private String sqlMode;

/**Column{tableCatalog='def', tableSchema='information_schema', tableName='TRIGGERS', columnName='DEFINER', ordinalPosition=19, columnDefault='', isNullable='NO', dataType='varchar', characterMaximumLength=93, characterOctetLength=279, numericPrecision=0, numericScale=0, datetimePrecision=0, characterSetName='utf8', collationName='utf8_general_ci', columnType='varchar(93)', columnKey='', extra='', privileges='select', columnComment='', generationExpression=''}*/
private String definer;

/**Column{tableCatalog='def', tableSchema='information_schema', tableName='TRIGGERS', columnName='CHARACTER_SET_CLIENT', ordinalPosition=20, columnDefault='', isNullable='NO', dataType='varchar', characterMaximumLength=32, characterOctetLength=96, numericPrecision=0, numericScale=0, datetimePrecision=0, characterSetName='utf8', collationName='utf8_general_ci', columnType='varchar(32)', columnKey='', extra='', privileges='select', columnComment='', generationExpression=''}*/
private String characterSetClient;

/**Column{tableCatalog='def', tableSchema='information_schema', tableName='TRIGGERS', columnName='COLLATION_CONNECTION', ordinalPosition=21, columnDefault='', isNullable='NO', dataType='varchar', characterMaximumLength=32, characterOctetLength=96, numericPrecision=0, numericScale=0, datetimePrecision=0, characterSetName='utf8', collationName='utf8_general_ci', columnType='varchar(32)', columnKey='', extra='', privileges='select', columnComment='', generationExpression=''}*/
private String collationConnection;

/**Column{tableCatalog='def', tableSchema='information_schema', tableName='TRIGGERS', columnName='DATABASE_COLLATION', ordinalPosition=22, columnDefault='', isNullable='NO', dataType='varchar', characterMaximumLength=32, characterOctetLength=96, numericPrecision=0, numericScale=0, datetimePrecision=0, characterSetName='utf8', collationName='utf8_general_ci', columnType='varchar(32)', columnKey='', extra='', privileges='select', columnComment='', generationExpression=''}*/
private String databaseCollation;

public String getTriggerCatalog(){
return triggerCatalog;
}

public String getTriggerSchema(){
return triggerSchema;
}

public String getTriggerName(){
return triggerName;
}

public String getEventManipulation(){
return eventManipulation;
}

public String getEventObjectCatalog(){
return eventObjectCatalog;
}

public String getEventObjectSchema(){
return eventObjectSchema;
}

public String getEventObjectTable(){
return eventObjectTable;
}

public Long getActionOrder(){
return actionOrder;
}

public String getActionCondition(){
return actionCondition;
}

public String getActionStatement(){
return actionStatement;
}

public String getActionOrientation(){
return actionOrientation;
}

public String getActionTiming(){
return actionTiming;
}

public String getActionReferenceOldTable(){
return actionReferenceOldTable;
}

public String getActionReferenceNewTable(){
return actionReferenceNewTable;
}

public String getActionReferenceOldRow(){
return actionReferenceOldRow;
}

public String getActionReferenceNewRow(){
return actionReferenceNewRow;
}

public Date getCreated(){
return created;
}

public String getSqlMode(){
return sqlMode;
}

public String getDefiner(){
return definer;
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