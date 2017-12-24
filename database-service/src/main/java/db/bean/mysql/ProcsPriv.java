package db.bean.mysql;

import java.util.Date;
import java.util.Set;

/* SELECT Host AS host, Db AS db, User AS user, Routine_name AS routineName, Routine_type AS routineType, Grantor AS grantor, Proc_priv AS procPriv, Timestamp AS timestamp FROM mysql.procs_priv */
/**Procedure privileges
*/
public class ProcsPriv{
/**Column{tableCatalog='def', tableSchema='mysql', tableName='procs_priv', columnName='Host', ordinalPosition=1, columnDefault='', isNullable='NO', dataType='char', characterMaximumLength=60, characterOctetLength=180, numericPrecision=0, numericScale=0, datetimePrecision=0, characterSetName='utf8', collationName='utf8_bin', columnType='char(60)', columnKey='PRI', extra='', privileges='select,insert,update,references', columnComment='', generationExpression=''}*/
private String host;

/**Column{tableCatalog='def', tableSchema='mysql', tableName='procs_priv', columnName='Db', ordinalPosition=2, columnDefault='', isNullable='NO', dataType='char', characterMaximumLength=64, characterOctetLength=192, numericPrecision=0, numericScale=0, datetimePrecision=0, characterSetName='utf8', collationName='utf8_bin', columnType='char(64)', columnKey='PRI', extra='', privileges='select,insert,update,references', columnComment='', generationExpression=''}*/
private String db;

/**Column{tableCatalog='def', tableSchema='mysql', tableName='procs_priv', columnName='User', ordinalPosition=3, columnDefault='', isNullable='NO', dataType='char', characterMaximumLength=32, characterOctetLength=96, numericPrecision=0, numericScale=0, datetimePrecision=0, characterSetName='utf8', collationName='utf8_bin', columnType='char(32)', columnKey='PRI', extra='', privileges='select,insert,update,references', columnComment='', generationExpression=''}*/
private String user;

/**Column{tableCatalog='def', tableSchema='mysql', tableName='procs_priv', columnName='Routine_name', ordinalPosition=4, columnDefault='', isNullable='NO', dataType='char', characterMaximumLength=64, characterOctetLength=192, numericPrecision=0, numericScale=0, datetimePrecision=0, characterSetName='utf8', collationName='utf8_general_ci', columnType='char(64)', columnKey='PRI', extra='', privileges='select,insert,update,references', columnComment='', generationExpression=''}*/
private String routineName;

/**Column{tableCatalog='def', tableSchema='mysql', tableName='procs_priv', columnName='Routine_type', ordinalPosition=5, columnDefault='null', isNullable='NO', dataType='enum', characterMaximumLength=9, characterOctetLength=27, numericPrecision=0, numericScale=0, datetimePrecision=0, characterSetName='utf8', collationName='utf8_bin', columnType='enum('FUNCTION','PROCEDURE')', columnKey='PRI', extra='', privileges='select,insert,update,references', columnComment='', generationExpression=''}*/
private Date routineType;

/**Column{tableCatalog='def', tableSchema='mysql', tableName='procs_priv', columnName='Grantor', ordinalPosition=6, columnDefault='', isNullable='NO', dataType='char', characterMaximumLength=93, characterOctetLength=279, numericPrecision=0, numericScale=0, datetimePrecision=0, characterSetName='utf8', collationName='utf8_bin', columnType='char(93)', columnKey='MUL', extra='', privileges='select,insert,update,references', columnComment='', generationExpression=''}*/
private String grantor;

/**Column{tableCatalog='def', tableSchema='mysql', tableName='procs_priv', columnName='Proc_priv', ordinalPosition=7, columnDefault='', isNullable='NO', dataType='set', characterMaximumLength=27, characterOctetLength=81, numericPrecision=0, numericScale=0, datetimePrecision=0, characterSetName='utf8', collationName='utf8_general_ci', columnType='set('Execute','Alter Routine','Grant')', columnKey='', extra='', privileges='select,insert,update,references', columnComment='', generationExpression=''}*/
private Set<String> procPriv;

/**Column{tableCatalog='def', tableSchema='mysql', tableName='procs_priv', columnName='Timestamp', ordinalPosition=8, columnDefault='CURRENT_TIMESTAMP', isNullable='NO', dataType='timestamp', characterMaximumLength=0, characterOctetLength=0, numericPrecision=0, numericScale=0, datetimePrecision=0, characterSetName='null', collationName='null', columnType='timestamp', columnKey='', extra='on update CURRENT_TIMESTAMP', privileges='select,insert,update,references', columnComment='', generationExpression=''}*/
private Date timestamp;

public String getHost(){
return host;
}

public String getDb(){
return db;
}

public String getUser(){
return user;
}

public String getRoutineName(){
return routineName;
}

public Date getRoutineType(){
return routineType;
}

public String getGrantor(){
return grantor;
}

public Set<String> getProcPriv(){
return procPriv;
}

public Date getTimestamp(){
return timestamp;
}

}