package db.bean.mysql;

import java.util.Date;

/**Database privileges
*/
public class Db{
/**Column{tableCatalog='def', tableSchema='mysql', tableName='db', columnName='Host', ordinalPosition=1, columnDefault='', isNullable='NO', dataType='char', characterMaximumLength=60, characterOctetLength=180, numericPrecision=0, numericScale=0, datetimePrecision=0, characterSetName='utf8', collationName='utf8_bin', columnType='char(60)', columnKey='PRI', extra='', privileges='select,insert,update,references', columnComment='', generationExpression=''}*/
private String host;

/**Column{tableCatalog='def', tableSchema='mysql', tableName='db', columnName='Db', ordinalPosition=2, columnDefault='', isNullable='NO', dataType='char', characterMaximumLength=64, characterOctetLength=192, numericPrecision=0, numericScale=0, datetimePrecision=0, characterSetName='utf8', collationName='utf8_bin', columnType='char(64)', columnKey='PRI', extra='', privileges='select,insert,update,references', columnComment='', generationExpression=''}*/
private String db;

/**Column{tableCatalog='def', tableSchema='mysql', tableName='db', columnName='User', ordinalPosition=3, columnDefault='', isNullable='NO', dataType='char', characterMaximumLength=32, characterOctetLength=96, numericPrecision=0, numericScale=0, datetimePrecision=0, characterSetName='utf8', collationName='utf8_bin', columnType='char(32)', columnKey='PRI', extra='', privileges='select,insert,update,references', columnComment='', generationExpression=''}*/
private String user;

/**Column{tableCatalog='def', tableSchema='mysql', tableName='db', columnName='Select_priv', ordinalPosition=4, columnDefault='N', isNullable='NO', dataType='enum', characterMaximumLength=1, characterOctetLength=3, numericPrecision=0, numericScale=0, datetimePrecision=0, characterSetName='utf8', collationName='utf8_general_ci', columnType='enum('N','Y')', columnKey='', extra='', privileges='select,insert,update,references', columnComment='', generationExpression=''}*/
private Date selectPriv;

/**Column{tableCatalog='def', tableSchema='mysql', tableName='db', columnName='Insert_priv', ordinalPosition=5, columnDefault='N', isNullable='NO', dataType='enum', characterMaximumLength=1, characterOctetLength=3, numericPrecision=0, numericScale=0, datetimePrecision=0, characterSetName='utf8', collationName='utf8_general_ci', columnType='enum('N','Y')', columnKey='', extra='', privileges='select,insert,update,references', columnComment='', generationExpression=''}*/
private Date insertPriv;

/**Column{tableCatalog='def', tableSchema='mysql', tableName='db', columnName='Update_priv', ordinalPosition=6, columnDefault='N', isNullable='NO', dataType='enum', characterMaximumLength=1, characterOctetLength=3, numericPrecision=0, numericScale=0, datetimePrecision=0, characterSetName='utf8', collationName='utf8_general_ci', columnType='enum('N','Y')', columnKey='', extra='', privileges='select,insert,update,references', columnComment='', generationExpression=''}*/
private Date updatePriv;

/**Column{tableCatalog='def', tableSchema='mysql', tableName='db', columnName='Delete_priv', ordinalPosition=7, columnDefault='N', isNullable='NO', dataType='enum', characterMaximumLength=1, characterOctetLength=3, numericPrecision=0, numericScale=0, datetimePrecision=0, characterSetName='utf8', collationName='utf8_general_ci', columnType='enum('N','Y')', columnKey='', extra='', privileges='select,insert,update,references', columnComment='', generationExpression=''}*/
private Date deletePriv;

/**Column{tableCatalog='def', tableSchema='mysql', tableName='db', columnName='Create_priv', ordinalPosition=8, columnDefault='N', isNullable='NO', dataType='enum', characterMaximumLength=1, characterOctetLength=3, numericPrecision=0, numericScale=0, datetimePrecision=0, characterSetName='utf8', collationName='utf8_general_ci', columnType='enum('N','Y')', columnKey='', extra='', privileges='select,insert,update,references', columnComment='', generationExpression=''}*/
private Date createPriv;

/**Column{tableCatalog='def', tableSchema='mysql', tableName='db', columnName='Drop_priv', ordinalPosition=9, columnDefault='N', isNullable='NO', dataType='enum', characterMaximumLength=1, characterOctetLength=3, numericPrecision=0, numericScale=0, datetimePrecision=0, characterSetName='utf8', collationName='utf8_general_ci', columnType='enum('N','Y')', columnKey='', extra='', privileges='select,insert,update,references', columnComment='', generationExpression=''}*/
private Date dropPriv;

/**Column{tableCatalog='def', tableSchema='mysql', tableName='db', columnName='Grant_priv', ordinalPosition=10, columnDefault='N', isNullable='NO', dataType='enum', characterMaximumLength=1, characterOctetLength=3, numericPrecision=0, numericScale=0, datetimePrecision=0, characterSetName='utf8', collationName='utf8_general_ci', columnType='enum('N','Y')', columnKey='', extra='', privileges='select,insert,update,references', columnComment='', generationExpression=''}*/
private Date grantPriv;

/**Column{tableCatalog='def', tableSchema='mysql', tableName='db', columnName='References_priv', ordinalPosition=11, columnDefault='N', isNullable='NO', dataType='enum', characterMaximumLength=1, characterOctetLength=3, numericPrecision=0, numericScale=0, datetimePrecision=0, characterSetName='utf8', collationName='utf8_general_ci', columnType='enum('N','Y')', columnKey='', extra='', privileges='select,insert,update,references', columnComment='', generationExpression=''}*/
private Date referencesPriv;

/**Column{tableCatalog='def', tableSchema='mysql', tableName='db', columnName='Index_priv', ordinalPosition=12, columnDefault='N', isNullable='NO', dataType='enum', characterMaximumLength=1, characterOctetLength=3, numericPrecision=0, numericScale=0, datetimePrecision=0, characterSetName='utf8', collationName='utf8_general_ci', columnType='enum('N','Y')', columnKey='', extra='', privileges='select,insert,update,references', columnComment='', generationExpression=''}*/
private Date indexPriv;

/**Column{tableCatalog='def', tableSchema='mysql', tableName='db', columnName='Alter_priv', ordinalPosition=13, columnDefault='N', isNullable='NO', dataType='enum', characterMaximumLength=1, characterOctetLength=3, numericPrecision=0, numericScale=0, datetimePrecision=0, characterSetName='utf8', collationName='utf8_general_ci', columnType='enum('N','Y')', columnKey='', extra='', privileges='select,insert,update,references', columnComment='', generationExpression=''}*/
private Date alterPriv;

/**Column{tableCatalog='def', tableSchema='mysql', tableName='db', columnName='Create_tmp_table_priv', ordinalPosition=14, columnDefault='N', isNullable='NO', dataType='enum', characterMaximumLength=1, characterOctetLength=3, numericPrecision=0, numericScale=0, datetimePrecision=0, characterSetName='utf8', collationName='utf8_general_ci', columnType='enum('N','Y')', columnKey='', extra='', privileges='select,insert,update,references', columnComment='', generationExpression=''}*/
private Date createTmpTablePriv;

/**Column{tableCatalog='def', tableSchema='mysql', tableName='db', columnName='Lock_tables_priv', ordinalPosition=15, columnDefault='N', isNullable='NO', dataType='enum', characterMaximumLength=1, characterOctetLength=3, numericPrecision=0, numericScale=0, datetimePrecision=0, characterSetName='utf8', collationName='utf8_general_ci', columnType='enum('N','Y')', columnKey='', extra='', privileges='select,insert,update,references', columnComment='', generationExpression=''}*/
private Date lockTablesPriv;

/**Column{tableCatalog='def', tableSchema='mysql', tableName='db', columnName='Create_view_priv', ordinalPosition=16, columnDefault='N', isNullable='NO', dataType='enum', characterMaximumLength=1, characterOctetLength=3, numericPrecision=0, numericScale=0, datetimePrecision=0, characterSetName='utf8', collationName='utf8_general_ci', columnType='enum('N','Y')', columnKey='', extra='', privileges='select,insert,update,references', columnComment='', generationExpression=''}*/
private Date createViewPriv;

/**Column{tableCatalog='def', tableSchema='mysql', tableName='db', columnName='Show_view_priv', ordinalPosition=17, columnDefault='N', isNullable='NO', dataType='enum', characterMaximumLength=1, characterOctetLength=3, numericPrecision=0, numericScale=0, datetimePrecision=0, characterSetName='utf8', collationName='utf8_general_ci', columnType='enum('N','Y')', columnKey='', extra='', privileges='select,insert,update,references', columnComment='', generationExpression=''}*/
private Date showViewPriv;

/**Column{tableCatalog='def', tableSchema='mysql', tableName='db', columnName='Create_routine_priv', ordinalPosition=18, columnDefault='N', isNullable='NO', dataType='enum', characterMaximumLength=1, characterOctetLength=3, numericPrecision=0, numericScale=0, datetimePrecision=0, characterSetName='utf8', collationName='utf8_general_ci', columnType='enum('N','Y')', columnKey='', extra='', privileges='select,insert,update,references', columnComment='', generationExpression=''}*/
private Date createRoutinePriv;

/**Column{tableCatalog='def', tableSchema='mysql', tableName='db', columnName='Alter_routine_priv', ordinalPosition=19, columnDefault='N', isNullable='NO', dataType='enum', characterMaximumLength=1, characterOctetLength=3, numericPrecision=0, numericScale=0, datetimePrecision=0, characterSetName='utf8', collationName='utf8_general_ci', columnType='enum('N','Y')', columnKey='', extra='', privileges='select,insert,update,references', columnComment='', generationExpression=''}*/
private Date alterRoutinePriv;

/**Column{tableCatalog='def', tableSchema='mysql', tableName='db', columnName='Execute_priv', ordinalPosition=20, columnDefault='N', isNullable='NO', dataType='enum', characterMaximumLength=1, characterOctetLength=3, numericPrecision=0, numericScale=0, datetimePrecision=0, characterSetName='utf8', collationName='utf8_general_ci', columnType='enum('N','Y')', columnKey='', extra='', privileges='select,insert,update,references', columnComment='', generationExpression=''}*/
private Date executePriv;

/**Column{tableCatalog='def', tableSchema='mysql', tableName='db', columnName='Event_priv', ordinalPosition=21, columnDefault='N', isNullable='NO', dataType='enum', characterMaximumLength=1, characterOctetLength=3, numericPrecision=0, numericScale=0, datetimePrecision=0, characterSetName='utf8', collationName='utf8_general_ci', columnType='enum('N','Y')', columnKey='', extra='', privileges='select,insert,update,references', columnComment='', generationExpression=''}*/
private Date eventPriv;

/**Column{tableCatalog='def', tableSchema='mysql', tableName='db', columnName='Trigger_priv', ordinalPosition=22, columnDefault='N', isNullable='NO', dataType='enum', characterMaximumLength=1, characterOctetLength=3, numericPrecision=0, numericScale=0, datetimePrecision=0, characterSetName='utf8', collationName='utf8_general_ci', columnType='enum('N','Y')', columnKey='', extra='', privileges='select,insert,update,references', columnComment='', generationExpression=''}*/
private Date triggerPriv;

public String getHost(){
return host;
}

public String getDb(){
return db;
}

public String getUser(){
return user;
}

public Date getSelectPriv(){
return selectPriv;
}

public Date getInsertPriv(){
return insertPriv;
}

public Date getUpdatePriv(){
return updatePriv;
}

public Date getDeletePriv(){
return deletePriv;
}

public Date getCreatePriv(){
return createPriv;
}

public Date getDropPriv(){
return dropPriv;
}

public Date getGrantPriv(){
return grantPriv;
}

public Date getReferencesPriv(){
return referencesPriv;
}

public Date getIndexPriv(){
return indexPriv;
}

public Date getAlterPriv(){
return alterPriv;
}

public Date getCreateTmpTablePriv(){
return createTmpTablePriv;
}

public Date getLockTablesPriv(){
return lockTablesPriv;
}

public Date getCreateViewPriv(){
return createViewPriv;
}

public Date getShowViewPriv(){
return showViewPriv;
}

public Date getCreateRoutinePriv(){
return createRoutinePriv;
}

public Date getAlterRoutinePriv(){
return alterRoutinePriv;
}

public Date getExecutePriv(){
return executePriv;
}

public Date getEventPriv(){
return eventPriv;
}

public Date getTriggerPriv(){
return triggerPriv;
}

}