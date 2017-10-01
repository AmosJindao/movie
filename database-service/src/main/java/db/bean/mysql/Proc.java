package db.bean.mysql;

import java.util.Date;
import java.util.Set;

/**Stored Procedures
*/
public class Proc{
/**Column{tableCatalog='def', tableSchema='mysql', tableName='proc', columnName='db', ordinalPosition=1, columnDefault='', isNullable='NO', dataType='char', characterMaximumLength=64, characterOctetLength=192, numericPrecision=0, numericScale=0, datetimePrecision=0, characterSetName='utf8', collationName='utf8_bin', columnType='char(64)', columnKey='PRI', extra='', privileges='select,insert,update,references', columnComment='', generationExpression=''}*/
private String db;

/**Column{tableCatalog='def', tableSchema='mysql', tableName='proc', columnName='name', ordinalPosition=2, columnDefault='', isNullable='NO', dataType='char', characterMaximumLength=64, characterOctetLength=192, numericPrecision=0, numericScale=0, datetimePrecision=0, characterSetName='utf8', collationName='utf8_general_ci', columnType='char(64)', columnKey='PRI', extra='', privileges='select,insert,update,references', columnComment='', generationExpression=''}*/
private String name;

/**Column{tableCatalog='def', tableSchema='mysql', tableName='proc', columnName='type', ordinalPosition=3, columnDefault='null', isNullable='NO', dataType='enum', characterMaximumLength=9, characterOctetLength=27, numericPrecision=0, numericScale=0, datetimePrecision=0, characterSetName='utf8', collationName='utf8_general_ci', columnType='enum('FUNCTION','PROCEDURE')', columnKey='PRI', extra='', privileges='select,insert,update,references', columnComment='', generationExpression=''}*/
private Date type;

/**Column{tableCatalog='def', tableSchema='mysql', tableName='proc', columnName='specific_name', ordinalPosition=4, columnDefault='', isNullable='NO', dataType='char', characterMaximumLength=64, characterOctetLength=192, numericPrecision=0, numericScale=0, datetimePrecision=0, characterSetName='utf8', collationName='utf8_general_ci', columnType='char(64)', columnKey='', extra='', privileges='select,insert,update,references', columnComment='', generationExpression=''}*/
private String specificName;

/**Column{tableCatalog='def', tableSchema='mysql', tableName='proc', columnName='language', ordinalPosition=5, columnDefault='SQL', isNullable='NO', dataType='enum', characterMaximumLength=3, characterOctetLength=9, numericPrecision=0, numericScale=0, datetimePrecision=0, characterSetName='utf8', collationName='utf8_general_ci', columnType='enum('SQL')', columnKey='', extra='', privileges='select,insert,update,references', columnComment='', generationExpression=''}*/
private Date language;

/**Column{tableCatalog='def', tableSchema='mysql', tableName='proc', columnName='sql_data_access', ordinalPosition=6, columnDefault='CONTAINS_SQL', isNullable='NO', dataType='enum', characterMaximumLength=17, characterOctetLength=51, numericPrecision=0, numericScale=0, datetimePrecision=0, characterSetName='utf8', collationName='utf8_general_ci', columnType='enum('CONTAINS_SQL','NO_SQL','READS_SQL_DATA','MODIFIES_SQL_DATA')', columnKey='', extra='', privileges='select,insert,update,references', columnComment='', generationExpression=''}*/
private Date sqlDataAccess;

/**Column{tableCatalog='def', tableSchema='mysql', tableName='proc', columnName='is_deterministic', ordinalPosition=7, columnDefault='NO', isNullable='NO', dataType='enum', characterMaximumLength=3, characterOctetLength=9, numericPrecision=0, numericScale=0, datetimePrecision=0, characterSetName='utf8', collationName='utf8_general_ci', columnType='enum('YES','NO')', columnKey='', extra='', privileges='select,insert,update,references', columnComment='', generationExpression=''}*/
private Date isDeterministic;

/**Column{tableCatalog='def', tableSchema='mysql', tableName='proc', columnName='security_type', ordinalPosition=8, columnDefault='DEFINER', isNullable='NO', dataType='enum', characterMaximumLength=7, characterOctetLength=21, numericPrecision=0, numericScale=0, datetimePrecision=0, characterSetName='utf8', collationName='utf8_general_ci', columnType='enum('INVOKER','DEFINER')', columnKey='', extra='', privileges='select,insert,update,references', columnComment='', generationExpression=''}*/
private Date securityType;

/**Column{tableCatalog='def', tableSchema='mysql', tableName='proc', columnName='param_list', ordinalPosition=9, columnDefault='null', isNullable='NO', dataType='blob', characterMaximumLength=65535, characterOctetLength=65535, numericPrecision=0, numericScale=0, datetimePrecision=0, characterSetName='null', collationName='null', columnType='blob', columnKey='', extra='', privileges='select,insert,update,references', columnComment='', generationExpression=''}*/
private String paramList;

/**Column{tableCatalog='def', tableSchema='mysql', tableName='proc', columnName='returns', ordinalPosition=10, columnDefault='null', isNullable='NO', dataType='longblob', characterMaximumLength=4294967295, characterOctetLength=4294967295, numericPrecision=0, numericScale=0, datetimePrecision=0, characterSetName='null', collationName='null', columnType='longblob', columnKey='', extra='', privileges='select,insert,update,references', columnComment='', generationExpression=''}*/
private String returns;

/**Column{tableCatalog='def', tableSchema='mysql', tableName='proc', columnName='body', ordinalPosition=11, columnDefault='null', isNullable='NO', dataType='longblob', characterMaximumLength=4294967295, characterOctetLength=4294967295, numericPrecision=0, numericScale=0, datetimePrecision=0, characterSetName='null', collationName='null', columnType='longblob', columnKey='', extra='', privileges='select,insert,update,references', columnComment='', generationExpression=''}*/
private String body;

/**Column{tableCatalog='def', tableSchema='mysql', tableName='proc', columnName='definer', ordinalPosition=12, columnDefault='', isNullable='NO', dataType='char', characterMaximumLength=93, characterOctetLength=279, numericPrecision=0, numericScale=0, datetimePrecision=0, characterSetName='utf8', collationName='utf8_bin', columnType='char(93)', columnKey='', extra='', privileges='select,insert,update,references', columnComment='', generationExpression=''}*/
private String definer;

/**Column{tableCatalog='def', tableSchema='mysql', tableName='proc', columnName='created', ordinalPosition=13, columnDefault='CURRENT_TIMESTAMP', isNullable='NO', dataType='timestamp', characterMaximumLength=0, characterOctetLength=0, numericPrecision=0, numericScale=0, datetimePrecision=0, characterSetName='null', collationName='null', columnType='timestamp', columnKey='', extra='on update CURRENT_TIMESTAMP', privileges='select,insert,update,references', columnComment='', generationExpression=''}*/
private Date created;

/**Column{tableCatalog='def', tableSchema='mysql', tableName='proc', columnName='modified', ordinalPosition=14, columnDefault='0000-00-00 00:00:00', isNullable='NO', dataType='timestamp', characterMaximumLength=0, characterOctetLength=0, numericPrecision=0, numericScale=0, datetimePrecision=0, characterSetName='null', collationName='null', columnType='timestamp', columnKey='', extra='', privileges='select,insert,update,references', columnComment='', generationExpression=''}*/
private Date modified;

/**Column{tableCatalog='def', tableSchema='mysql', tableName='proc', columnName='sql_mode', ordinalPosition=15, columnDefault='', isNullable='NO', dataType='set', characterMaximumLength=478, characterOctetLength=1434, numericPrecision=0, numericScale=0, datetimePrecision=0, characterSetName='utf8', collationName='utf8_general_ci', columnType='set('REAL_AS_FLOAT','PIPES_AS_CONCAT','ANSI_QUOTES','IGNORE_SPACE','NOT_USED','ONLY_FULL_GROUP_BY','NO_UNSIGNED_SUBTRACTION','NO_DIR_IN_CREATE','POSTGRESQL','ORACLE','MSSQL','DB2','MAXDB','NO_KEY_OPTIONS','NO_TABLE_OPTIONS','NO_FIELD_OPTIONS','MYSQL323','MYSQL40','ANSI','NO_AUTO_VALUE_ON_ZERO','NO_BACKSLASH_ESCAPES','STRICT_TRANS_TABLES','STRICT_ALL_TABLES','NO_ZERO_IN_DATE','NO_ZERO_DATE','INVALID_DATES','ERROR_FOR_DIVISION_BY_ZERO','TRADITIONAL','NO_AUTO_CREATE_USER','HIGH_NOT_PRECEDENCE','NO_ENGINE_SUBSTITUTION','PAD_CHAR_TO_FULL_LENGTH')', columnKey='', extra='', privileges='select,insert,update,references', columnComment='', generationExpression=''}*/
private Set<String> sqlMode;

/**Column{tableCatalog='def', tableSchema='mysql', tableName='proc', columnName='comment', ordinalPosition=16, columnDefault='null', isNullable='NO', dataType='text', characterMaximumLength=65535, characterOctetLength=65535, numericPrecision=0, numericScale=0, datetimePrecision=0, characterSetName='utf8', collationName='utf8_bin', columnType='text', columnKey='', extra='', privileges='select,insert,update,references', columnComment='', generationExpression=''}*/
private String comment;

/**Column{tableCatalog='def', tableSchema='mysql', tableName='proc', columnName='character_set_client', ordinalPosition=17, columnDefault='null', isNullable='YES', dataType='char', characterMaximumLength=32, characterOctetLength=96, numericPrecision=0, numericScale=0, datetimePrecision=0, characterSetName='utf8', collationName='utf8_bin', columnType='char(32)', columnKey='', extra='', privileges='select,insert,update,references', columnComment='', generationExpression=''}*/
private String characterSetClient;

/**Column{tableCatalog='def', tableSchema='mysql', tableName='proc', columnName='collation_connection', ordinalPosition=18, columnDefault='null', isNullable='YES', dataType='char', characterMaximumLength=32, characterOctetLength=96, numericPrecision=0, numericScale=0, datetimePrecision=0, characterSetName='utf8', collationName='utf8_bin', columnType='char(32)', columnKey='', extra='', privileges='select,insert,update,references', columnComment='', generationExpression=''}*/
private String collationConnection;

/**Column{tableCatalog='def', tableSchema='mysql', tableName='proc', columnName='db_collation', ordinalPosition=19, columnDefault='null', isNullable='YES', dataType='char', characterMaximumLength=32, characterOctetLength=96, numericPrecision=0, numericScale=0, datetimePrecision=0, characterSetName='utf8', collationName='utf8_bin', columnType='char(32)', columnKey='', extra='', privileges='select,insert,update,references', columnComment='', generationExpression=''}*/
private String dbCollation;

/**Column{tableCatalog='def', tableSchema='mysql', tableName='proc', columnName='body_utf8', ordinalPosition=20, columnDefault='null', isNullable='YES', dataType='longblob', characterMaximumLength=4294967295, characterOctetLength=4294967295, numericPrecision=0, numericScale=0, datetimePrecision=0, characterSetName='null', collationName='null', columnType='longblob', columnKey='', extra='', privileges='select,insert,update,references', columnComment='', generationExpression=''}*/
private String bodyUtf8;

public String getDb(){
return db;
}

public String getName(){
return name;
}

public Date getType(){
return type;
}

public String getSpecificName(){
return specificName;
}

public Date getLanguage(){
return language;
}

public Date getSqlDataAccess(){
return sqlDataAccess;
}

public Date getIsDeterministic(){
return isDeterministic;
}

public Date getSecurityType(){
return securityType;
}

public String getParamList(){
return paramList;
}

public String getReturns(){
return returns;
}

public String getBody(){
return body;
}

public String getDefiner(){
return definer;
}

public Date getCreated(){
return created;
}

public Date getModified(){
return modified;
}

public Set<String> getSqlMode(){
return sqlMode;
}

public String getComment(){
return comment;
}

public String getCharacterSetClient(){
return characterSetClient;
}

public String getCollationConnection(){
return collationConnection;
}

public String getDbCollation(){
return dbCollation;
}

public String getBodyUtf8(){
return bodyUtf8;
}

}