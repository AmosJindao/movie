package db.bean.mysql;

import java.util.Date;

/* SELECT Host AS host, User AS user, Select_priv AS selectPriv, Insert_priv AS insertPriv, Update_priv AS updatePriv, Delete_priv AS deletePriv, Create_priv AS createPriv, Drop_priv AS dropPriv, Reload_priv AS reloadPriv, Shutdown_priv AS shutdownPriv, Process_priv AS processPriv, File_priv AS filePriv, Grant_priv AS grantPriv, References_priv AS referencesPriv, Index_priv AS indexPriv, Alter_priv AS alterPriv, Show_db_priv AS showDbPriv, Super_priv AS superPriv, Create_tmp_table_priv AS createTmpTablePriv, Lock_tables_priv AS lockTablesPriv, Execute_priv AS executePriv, Repl_slave_priv AS replSlavePriv, Repl_client_priv AS replClientPriv, Create_view_priv AS createViewPriv, Show_view_priv AS showViewPriv, Create_routine_priv AS createRoutinePriv, Alter_routine_priv AS alterRoutinePriv, Create_user_priv AS createUserPriv, Event_priv AS eventPriv, Trigger_priv AS triggerPriv, Create_tablespace_priv AS createTablespacePriv, ssl_type AS sslType, ssl_cipher AS sslCipher, x509_issuer AS x509Issuer, x509_subject AS x509Subject, max_questions AS maxQuestions, max_updates AS maxUpdates, max_connections AS maxConnections, max_user_connections AS maxUserConnections, plugin AS plugin, authentication_string AS authenticationString, password_expired AS passwordExpired, password_last_changed AS passwordLastChanged, password_lifetime AS passwordLifetime, account_locked AS accountLocked FROM mysql.user */
/**Users and global privileges
*/
public class User{
/**Column{tableCatalog='def', tableSchema='mysql', tableName='user', columnName='Host', ordinalPosition=1, columnDefault='', isNullable='NO', dataType='char', characterMaximumLength=60, characterOctetLength=180, numericPrecision=0, numericScale=0, datetimePrecision=0, characterSetName='utf8', collationName='utf8_bin', columnType='char(60)', columnKey='PRI', extra='', privileges='select,insert,update,references', columnComment='', generationExpression=''}*/
private String host;

/**Column{tableCatalog='def', tableSchema='mysql', tableName='user', columnName='User', ordinalPosition=2, columnDefault='', isNullable='NO', dataType='char', characterMaximumLength=32, characterOctetLength=96, numericPrecision=0, numericScale=0, datetimePrecision=0, characterSetName='utf8', collationName='utf8_bin', columnType='char(32)', columnKey='PRI', extra='', privileges='select,insert,update,references', columnComment='', generationExpression=''}*/
private String user;

/**Column{tableCatalog='def', tableSchema='mysql', tableName='user', columnName='Select_priv', ordinalPosition=3, columnDefault='N', isNullable='NO', dataType='enum', characterMaximumLength=1, characterOctetLength=3, numericPrecision=0, numericScale=0, datetimePrecision=0, characterSetName='utf8', collationName='utf8_general_ci', columnType='enum('N','Y')', columnKey='', extra='', privileges='select,insert,update,references', columnComment='', generationExpression=''}*/
private Date selectPriv;

/**Column{tableCatalog='def', tableSchema='mysql', tableName='user', columnName='Insert_priv', ordinalPosition=4, columnDefault='N', isNullable='NO', dataType='enum', characterMaximumLength=1, characterOctetLength=3, numericPrecision=0, numericScale=0, datetimePrecision=0, characterSetName='utf8', collationName='utf8_general_ci', columnType='enum('N','Y')', columnKey='', extra='', privileges='select,insert,update,references', columnComment='', generationExpression=''}*/
private Date insertPriv;

/**Column{tableCatalog='def', tableSchema='mysql', tableName='user', columnName='Update_priv', ordinalPosition=5, columnDefault='N', isNullable='NO', dataType='enum', characterMaximumLength=1, characterOctetLength=3, numericPrecision=0, numericScale=0, datetimePrecision=0, characterSetName='utf8', collationName='utf8_general_ci', columnType='enum('N','Y')', columnKey='', extra='', privileges='select,insert,update,references', columnComment='', generationExpression=''}*/
private Date updatePriv;

/**Column{tableCatalog='def', tableSchema='mysql', tableName='user', columnName='Delete_priv', ordinalPosition=6, columnDefault='N', isNullable='NO', dataType='enum', characterMaximumLength=1, characterOctetLength=3, numericPrecision=0, numericScale=0, datetimePrecision=0, characterSetName='utf8', collationName='utf8_general_ci', columnType='enum('N','Y')', columnKey='', extra='', privileges='select,insert,update,references', columnComment='', generationExpression=''}*/
private Date deletePriv;

/**Column{tableCatalog='def', tableSchema='mysql', tableName='user', columnName='Create_priv', ordinalPosition=7, columnDefault='N', isNullable='NO', dataType='enum', characterMaximumLength=1, characterOctetLength=3, numericPrecision=0, numericScale=0, datetimePrecision=0, characterSetName='utf8', collationName='utf8_general_ci', columnType='enum('N','Y')', columnKey='', extra='', privileges='select,insert,update,references', columnComment='', generationExpression=''}*/
private Date createPriv;

/**Column{tableCatalog='def', tableSchema='mysql', tableName='user', columnName='Drop_priv', ordinalPosition=8, columnDefault='N', isNullable='NO', dataType='enum', characterMaximumLength=1, characterOctetLength=3, numericPrecision=0, numericScale=0, datetimePrecision=0, characterSetName='utf8', collationName='utf8_general_ci', columnType='enum('N','Y')', columnKey='', extra='', privileges='select,insert,update,references', columnComment='', generationExpression=''}*/
private Date dropPriv;

/**Column{tableCatalog='def', tableSchema='mysql', tableName='user', columnName='Reload_priv', ordinalPosition=9, columnDefault='N', isNullable='NO', dataType='enum', characterMaximumLength=1, characterOctetLength=3, numericPrecision=0, numericScale=0, datetimePrecision=0, characterSetName='utf8', collationName='utf8_general_ci', columnType='enum('N','Y')', columnKey='', extra='', privileges='select,insert,update,references', columnComment='', generationExpression=''}*/
private Date reloadPriv;

/**Column{tableCatalog='def', tableSchema='mysql', tableName='user', columnName='Shutdown_priv', ordinalPosition=10, columnDefault='N', isNullable='NO', dataType='enum', characterMaximumLength=1, characterOctetLength=3, numericPrecision=0, numericScale=0, datetimePrecision=0, characterSetName='utf8', collationName='utf8_general_ci', columnType='enum('N','Y')', columnKey='', extra='', privileges='select,insert,update,references', columnComment='', generationExpression=''}*/
private Date shutdownPriv;

/**Column{tableCatalog='def', tableSchema='mysql', tableName='user', columnName='Process_priv', ordinalPosition=11, columnDefault='N', isNullable='NO', dataType='enum', characterMaximumLength=1, characterOctetLength=3, numericPrecision=0, numericScale=0, datetimePrecision=0, characterSetName='utf8', collationName='utf8_general_ci', columnType='enum('N','Y')', columnKey='', extra='', privileges='select,insert,update,references', columnComment='', generationExpression=''}*/
private Date processPriv;

/**Column{tableCatalog='def', tableSchema='mysql', tableName='user', columnName='File_priv', ordinalPosition=12, columnDefault='N', isNullable='NO', dataType='enum', characterMaximumLength=1, characterOctetLength=3, numericPrecision=0, numericScale=0, datetimePrecision=0, characterSetName='utf8', collationName='utf8_general_ci', columnType='enum('N','Y')', columnKey='', extra='', privileges='select,insert,update,references', columnComment='', generationExpression=''}*/
private Date filePriv;

/**Column{tableCatalog='def', tableSchema='mysql', tableName='user', columnName='Grant_priv', ordinalPosition=13, columnDefault='N', isNullable='NO', dataType='enum', characterMaximumLength=1, characterOctetLength=3, numericPrecision=0, numericScale=0, datetimePrecision=0, characterSetName='utf8', collationName='utf8_general_ci', columnType='enum('N','Y')', columnKey='', extra='', privileges='select,insert,update,references', columnComment='', generationExpression=''}*/
private Date grantPriv;

/**Column{tableCatalog='def', tableSchema='mysql', tableName='user', columnName='References_priv', ordinalPosition=14, columnDefault='N', isNullable='NO', dataType='enum', characterMaximumLength=1, characterOctetLength=3, numericPrecision=0, numericScale=0, datetimePrecision=0, characterSetName='utf8', collationName='utf8_general_ci', columnType='enum('N','Y')', columnKey='', extra='', privileges='select,insert,update,references', columnComment='', generationExpression=''}*/
private Date referencesPriv;

/**Column{tableCatalog='def', tableSchema='mysql', tableName='user', columnName='Index_priv', ordinalPosition=15, columnDefault='N', isNullable='NO', dataType='enum', characterMaximumLength=1, characterOctetLength=3, numericPrecision=0, numericScale=0, datetimePrecision=0, characterSetName='utf8', collationName='utf8_general_ci', columnType='enum('N','Y')', columnKey='', extra='', privileges='select,insert,update,references', columnComment='', generationExpression=''}*/
private Date indexPriv;

/**Column{tableCatalog='def', tableSchema='mysql', tableName='user', columnName='Alter_priv', ordinalPosition=16, columnDefault='N', isNullable='NO', dataType='enum', characterMaximumLength=1, characterOctetLength=3, numericPrecision=0, numericScale=0, datetimePrecision=0, characterSetName='utf8', collationName='utf8_general_ci', columnType='enum('N','Y')', columnKey='', extra='', privileges='select,insert,update,references', columnComment='', generationExpression=''}*/
private Date alterPriv;

/**Column{tableCatalog='def', tableSchema='mysql', tableName='user', columnName='Show_db_priv', ordinalPosition=17, columnDefault='N', isNullable='NO', dataType='enum', characterMaximumLength=1, characterOctetLength=3, numericPrecision=0, numericScale=0, datetimePrecision=0, characterSetName='utf8', collationName='utf8_general_ci', columnType='enum('N','Y')', columnKey='', extra='', privileges='select,insert,update,references', columnComment='', generationExpression=''}*/
private Date showDbPriv;

/**Column{tableCatalog='def', tableSchema='mysql', tableName='user', columnName='Super_priv', ordinalPosition=18, columnDefault='N', isNullable='NO', dataType='enum', characterMaximumLength=1, characterOctetLength=3, numericPrecision=0, numericScale=0, datetimePrecision=0, characterSetName='utf8', collationName='utf8_general_ci', columnType='enum('N','Y')', columnKey='', extra='', privileges='select,insert,update,references', columnComment='', generationExpression=''}*/
private Date superPriv;

/**Column{tableCatalog='def', tableSchema='mysql', tableName='user', columnName='Create_tmp_table_priv', ordinalPosition=19, columnDefault='N', isNullable='NO', dataType='enum', characterMaximumLength=1, characterOctetLength=3, numericPrecision=0, numericScale=0, datetimePrecision=0, characterSetName='utf8', collationName='utf8_general_ci', columnType='enum('N','Y')', columnKey='', extra='', privileges='select,insert,update,references', columnComment='', generationExpression=''}*/
private Date createTmpTablePriv;

/**Column{tableCatalog='def', tableSchema='mysql', tableName='user', columnName='Lock_tables_priv', ordinalPosition=20, columnDefault='N', isNullable='NO', dataType='enum', characterMaximumLength=1, characterOctetLength=3, numericPrecision=0, numericScale=0, datetimePrecision=0, characterSetName='utf8', collationName='utf8_general_ci', columnType='enum('N','Y')', columnKey='', extra='', privileges='select,insert,update,references', columnComment='', generationExpression=''}*/
private Date lockTablesPriv;

/**Column{tableCatalog='def', tableSchema='mysql', tableName='user', columnName='Execute_priv', ordinalPosition=21, columnDefault='N', isNullable='NO', dataType='enum', characterMaximumLength=1, characterOctetLength=3, numericPrecision=0, numericScale=0, datetimePrecision=0, characterSetName='utf8', collationName='utf8_general_ci', columnType='enum('N','Y')', columnKey='', extra='', privileges='select,insert,update,references', columnComment='', generationExpression=''}*/
private Date executePriv;

/**Column{tableCatalog='def', tableSchema='mysql', tableName='user', columnName='Repl_slave_priv', ordinalPosition=22, columnDefault='N', isNullable='NO', dataType='enum', characterMaximumLength=1, characterOctetLength=3, numericPrecision=0, numericScale=0, datetimePrecision=0, characterSetName='utf8', collationName='utf8_general_ci', columnType='enum('N','Y')', columnKey='', extra='', privileges='select,insert,update,references', columnComment='', generationExpression=''}*/
private Date replSlavePriv;

/**Column{tableCatalog='def', tableSchema='mysql', tableName='user', columnName='Repl_client_priv', ordinalPosition=23, columnDefault='N', isNullable='NO', dataType='enum', characterMaximumLength=1, characterOctetLength=3, numericPrecision=0, numericScale=0, datetimePrecision=0, characterSetName='utf8', collationName='utf8_general_ci', columnType='enum('N','Y')', columnKey='', extra='', privileges='select,insert,update,references', columnComment='', generationExpression=''}*/
private Date replClientPriv;

/**Column{tableCatalog='def', tableSchema='mysql', tableName='user', columnName='Create_view_priv', ordinalPosition=24, columnDefault='N', isNullable='NO', dataType='enum', characterMaximumLength=1, characterOctetLength=3, numericPrecision=0, numericScale=0, datetimePrecision=0, characterSetName='utf8', collationName='utf8_general_ci', columnType='enum('N','Y')', columnKey='', extra='', privileges='select,insert,update,references', columnComment='', generationExpression=''}*/
private Date createViewPriv;

/**Column{tableCatalog='def', tableSchema='mysql', tableName='user', columnName='Show_view_priv', ordinalPosition=25, columnDefault='N', isNullable='NO', dataType='enum', characterMaximumLength=1, characterOctetLength=3, numericPrecision=0, numericScale=0, datetimePrecision=0, characterSetName='utf8', collationName='utf8_general_ci', columnType='enum('N','Y')', columnKey='', extra='', privileges='select,insert,update,references', columnComment='', generationExpression=''}*/
private Date showViewPriv;

/**Column{tableCatalog='def', tableSchema='mysql', tableName='user', columnName='Create_routine_priv', ordinalPosition=26, columnDefault='N', isNullable='NO', dataType='enum', characterMaximumLength=1, characterOctetLength=3, numericPrecision=0, numericScale=0, datetimePrecision=0, characterSetName='utf8', collationName='utf8_general_ci', columnType='enum('N','Y')', columnKey='', extra='', privileges='select,insert,update,references', columnComment='', generationExpression=''}*/
private Date createRoutinePriv;

/**Column{tableCatalog='def', tableSchema='mysql', tableName='user', columnName='Alter_routine_priv', ordinalPosition=27, columnDefault='N', isNullable='NO', dataType='enum', characterMaximumLength=1, characterOctetLength=3, numericPrecision=0, numericScale=0, datetimePrecision=0, characterSetName='utf8', collationName='utf8_general_ci', columnType='enum('N','Y')', columnKey='', extra='', privileges='select,insert,update,references', columnComment='', generationExpression=''}*/
private Date alterRoutinePriv;

/**Column{tableCatalog='def', tableSchema='mysql', tableName='user', columnName='Create_user_priv', ordinalPosition=28, columnDefault='N', isNullable='NO', dataType='enum', characterMaximumLength=1, characterOctetLength=3, numericPrecision=0, numericScale=0, datetimePrecision=0, characterSetName='utf8', collationName='utf8_general_ci', columnType='enum('N','Y')', columnKey='', extra='', privileges='select,insert,update,references', columnComment='', generationExpression=''}*/
private Date createUserPriv;

/**Column{tableCatalog='def', tableSchema='mysql', tableName='user', columnName='Event_priv', ordinalPosition=29, columnDefault='N', isNullable='NO', dataType='enum', characterMaximumLength=1, characterOctetLength=3, numericPrecision=0, numericScale=0, datetimePrecision=0, characterSetName='utf8', collationName='utf8_general_ci', columnType='enum('N','Y')', columnKey='', extra='', privileges='select,insert,update,references', columnComment='', generationExpression=''}*/
private Date eventPriv;

/**Column{tableCatalog='def', tableSchema='mysql', tableName='user', columnName='Trigger_priv', ordinalPosition=30, columnDefault='N', isNullable='NO', dataType='enum', characterMaximumLength=1, characterOctetLength=3, numericPrecision=0, numericScale=0, datetimePrecision=0, characterSetName='utf8', collationName='utf8_general_ci', columnType='enum('N','Y')', columnKey='', extra='', privileges='select,insert,update,references', columnComment='', generationExpression=''}*/
private Date triggerPriv;

/**Column{tableCatalog='def', tableSchema='mysql', tableName='user', columnName='Create_tablespace_priv', ordinalPosition=31, columnDefault='N', isNullable='NO', dataType='enum', characterMaximumLength=1, characterOctetLength=3, numericPrecision=0, numericScale=0, datetimePrecision=0, characterSetName='utf8', collationName='utf8_general_ci', columnType='enum('N','Y')', columnKey='', extra='', privileges='select,insert,update,references', columnComment='', generationExpression=''}*/
private Date createTablespacePriv;

/**Column{tableCatalog='def', tableSchema='mysql', tableName='user', columnName='ssl_type', ordinalPosition=32, columnDefault='', isNullable='NO', dataType='enum', characterMaximumLength=9, characterOctetLength=27, numericPrecision=0, numericScale=0, datetimePrecision=0, characterSetName='utf8', collationName='utf8_general_ci', columnType='enum('','ANY','X509','SPECIFIED')', columnKey='', extra='', privileges='select,insert,update,references', columnComment='', generationExpression=''}*/
private Date sslType;

/**Column{tableCatalog='def', tableSchema='mysql', tableName='user', columnName='ssl_cipher', ordinalPosition=33, columnDefault='null', isNullable='NO', dataType='blob', characterMaximumLength=65535, characterOctetLength=65535, numericPrecision=0, numericScale=0, datetimePrecision=0, characterSetName='null', collationName='null', columnType='blob', columnKey='', extra='', privileges='select,insert,update,references', columnComment='', generationExpression=''}*/
private String sslCipher;

/**Column{tableCatalog='def', tableSchema='mysql', tableName='user', columnName='x509_issuer', ordinalPosition=34, columnDefault='null', isNullable='NO', dataType='blob', characterMaximumLength=65535, characterOctetLength=65535, numericPrecision=0, numericScale=0, datetimePrecision=0, characterSetName='null', collationName='null', columnType='blob', columnKey='', extra='', privileges='select,insert,update,references', columnComment='', generationExpression=''}*/
private String x509Issuer;

/**Column{tableCatalog='def', tableSchema='mysql', tableName='user', columnName='x509_subject', ordinalPosition=35, columnDefault='null', isNullable='NO', dataType='blob', characterMaximumLength=65535, characterOctetLength=65535, numericPrecision=0, numericScale=0, datetimePrecision=0, characterSetName='null', collationName='null', columnType='blob', columnKey='', extra='', privileges='select,insert,update,references', columnComment='', generationExpression=''}*/
private String x509Subject;

/**Column{tableCatalog='def', tableSchema='mysql', tableName='user', columnName='max_questions', ordinalPosition=36, columnDefault='0', isNullable='NO', dataType='int', characterMaximumLength=0, characterOctetLength=0, numericPrecision=10, numericScale=0, datetimePrecision=0, characterSetName='null', collationName='null', columnType='int(11) unsigned', columnKey='', extra='', privileges='select,insert,update,references', columnComment='', generationExpression=''}*/
private Integer maxQuestions;

/**Column{tableCatalog='def', tableSchema='mysql', tableName='user', columnName='max_updates', ordinalPosition=37, columnDefault='0', isNullable='NO', dataType='int', characterMaximumLength=0, characterOctetLength=0, numericPrecision=10, numericScale=0, datetimePrecision=0, characterSetName='null', collationName='null', columnType='int(11) unsigned', columnKey='', extra='', privileges='select,insert,update,references', columnComment='', generationExpression=''}*/
private Integer maxUpdates;

/**Column{tableCatalog='def', tableSchema='mysql', tableName='user', columnName='max_connections', ordinalPosition=38, columnDefault='0', isNullable='NO', dataType='int', characterMaximumLength=0, characterOctetLength=0, numericPrecision=10, numericScale=0, datetimePrecision=0, characterSetName='null', collationName='null', columnType='int(11) unsigned', columnKey='', extra='', privileges='select,insert,update,references', columnComment='', generationExpression=''}*/
private Integer maxConnections;

/**Column{tableCatalog='def', tableSchema='mysql', tableName='user', columnName='max_user_connections', ordinalPosition=39, columnDefault='0', isNullable='NO', dataType='int', characterMaximumLength=0, characterOctetLength=0, numericPrecision=10, numericScale=0, datetimePrecision=0, characterSetName='null', collationName='null', columnType='int(11) unsigned', columnKey='', extra='', privileges='select,insert,update,references', columnComment='', generationExpression=''}*/
private Integer maxUserConnections;

/**Column{tableCatalog='def', tableSchema='mysql', tableName='user', columnName='plugin', ordinalPosition=40, columnDefault='mysql_native_password', isNullable='NO', dataType='char', characterMaximumLength=64, characterOctetLength=192, numericPrecision=0, numericScale=0, datetimePrecision=0, characterSetName='utf8', collationName='utf8_bin', columnType='char(64)', columnKey='', extra='', privileges='select,insert,update,references', columnComment='', generationExpression=''}*/
private String plugin;

/**Column{tableCatalog='def', tableSchema='mysql', tableName='user', columnName='authentication_string', ordinalPosition=41, columnDefault='null', isNullable='YES', dataType='text', characterMaximumLength=65535, characterOctetLength=65535, numericPrecision=0, numericScale=0, datetimePrecision=0, characterSetName='utf8', collationName='utf8_bin', columnType='text', columnKey='', extra='', privileges='select,insert,update,references', columnComment='', generationExpression=''}*/
private String authenticationString;

/**Column{tableCatalog='def', tableSchema='mysql', tableName='user', columnName='password_expired', ordinalPosition=42, columnDefault='N', isNullable='NO', dataType='enum', characterMaximumLength=1, characterOctetLength=3, numericPrecision=0, numericScale=0, datetimePrecision=0, characterSetName='utf8', collationName='utf8_general_ci', columnType='enum('N','Y')', columnKey='', extra='', privileges='select,insert,update,references', columnComment='', generationExpression=''}*/
private Date passwordExpired;

/**Column{tableCatalog='def', tableSchema='mysql', tableName='user', columnName='password_last_changed', ordinalPosition=43, columnDefault='null', isNullable='YES', dataType='timestamp', characterMaximumLength=0, characterOctetLength=0, numericPrecision=0, numericScale=0, datetimePrecision=0, characterSetName='null', collationName='null', columnType='timestamp', columnKey='', extra='', privileges='select,insert,update,references', columnComment='', generationExpression=''}*/
private Date passwordLastChanged;

/**Column{tableCatalog='def', tableSchema='mysql', tableName='user', columnName='password_lifetime', ordinalPosition=44, columnDefault='null', isNullable='YES', dataType='smallint', characterMaximumLength=0, characterOctetLength=0, numericPrecision=5, numericScale=0, datetimePrecision=0, characterSetName='null', collationName='null', columnType='smallint(5) unsigned', columnKey='', extra='', privileges='select,insert,update,references', columnComment='', generationExpression=''}*/
private Integer passwordLifetime;

/**Column{tableCatalog='def', tableSchema='mysql', tableName='user', columnName='account_locked', ordinalPosition=45, columnDefault='N', isNullable='NO', dataType='enum', characterMaximumLength=1, characterOctetLength=3, numericPrecision=0, numericScale=0, datetimePrecision=0, characterSetName='utf8', collationName='utf8_general_ci', columnType='enum('N','Y')', columnKey='', extra='', privileges='select,insert,update,references', columnComment='', generationExpression=''}*/
private Date accountLocked;

public String getHost(){
return host;
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

public Date getReloadPriv(){
return reloadPriv;
}

public Date getShutdownPriv(){
return shutdownPriv;
}

public Date getProcessPriv(){
return processPriv;
}

public Date getFilePriv(){
return filePriv;
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

public Date getShowDbPriv(){
return showDbPriv;
}

public Date getSuperPriv(){
return superPriv;
}

public Date getCreateTmpTablePriv(){
return createTmpTablePriv;
}

public Date getLockTablesPriv(){
return lockTablesPriv;
}

public Date getExecutePriv(){
return executePriv;
}

public Date getReplSlavePriv(){
return replSlavePriv;
}

public Date getReplClientPriv(){
return replClientPriv;
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

public Date getCreateUserPriv(){
return createUserPriv;
}

public Date getEventPriv(){
return eventPriv;
}

public Date getTriggerPriv(){
return triggerPriv;
}

public Date getCreateTablespacePriv(){
return createTablespacePriv;
}

public Date getSslType(){
return sslType;
}

public String getSslCipher(){
return sslCipher;
}

public String getX509Issuer(){
return x509Issuer;
}

public String getX509Subject(){
return x509Subject;
}

public Integer getMaxQuestions(){
return maxQuestions;
}

public Integer getMaxUpdates(){
return maxUpdates;
}

public Integer getMaxConnections(){
return maxConnections;
}

public Integer getMaxUserConnections(){
return maxUserConnections;
}

public String getPlugin(){
return plugin;
}

public String getAuthenticationString(){
return authenticationString;
}

public Date getPasswordExpired(){
return passwordExpired;
}

public Date getPasswordLastChanged(){
return passwordLastChanged;
}

public Integer getPasswordLifetime(){
return passwordLifetime;
}

public Date getAccountLocked(){
return accountLocked;
}

}