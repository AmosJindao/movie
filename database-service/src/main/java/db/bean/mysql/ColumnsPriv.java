package db.bean.mysql;

import java.util.Date;
import java.util.Set;

/**Column privileges
*/
public class ColumnsPriv{
/**Column{tableCatalog='def', tableSchema='mysql', tableName='columns_priv', columnName='Host', ordinalPosition=1, columnDefault='', isNullable='NO', dataType='char', characterMaximumLength=60, characterOctetLength=180, numericPrecision=0, numericScale=0, datetimePrecision=0, characterSetName='utf8', collationName='utf8_bin', columnType='char(60)', columnKey='PRI', extra='', privileges='select,insert,update,references', columnComment='', generationExpression=''}*/
private String host;

/**Column{tableCatalog='def', tableSchema='mysql', tableName='columns_priv', columnName='Db', ordinalPosition=2, columnDefault='', isNullable='NO', dataType='char', characterMaximumLength=64, characterOctetLength=192, numericPrecision=0, numericScale=0, datetimePrecision=0, characterSetName='utf8', collationName='utf8_bin', columnType='char(64)', columnKey='PRI', extra='', privileges='select,insert,update,references', columnComment='', generationExpression=''}*/
private String db;

/**Column{tableCatalog='def', tableSchema='mysql', tableName='columns_priv', columnName='User', ordinalPosition=3, columnDefault='', isNullable='NO', dataType='char', characterMaximumLength=32, characterOctetLength=96, numericPrecision=0, numericScale=0, datetimePrecision=0, characterSetName='utf8', collationName='utf8_bin', columnType='char(32)', columnKey='PRI', extra='', privileges='select,insert,update,references', columnComment='', generationExpression=''}*/
private String user;

/**Column{tableCatalog='def', tableSchema='mysql', tableName='columns_priv', columnName='Table_name', ordinalPosition=4, columnDefault='', isNullable='NO', dataType='char', characterMaximumLength=64, characterOctetLength=192, numericPrecision=0, numericScale=0, datetimePrecision=0, characterSetName='utf8', collationName='utf8_bin', columnType='char(64)', columnKey='PRI', extra='', privileges='select,insert,update,references', columnComment='', generationExpression=''}*/
private String tableName;

/**Column{tableCatalog='def', tableSchema='mysql', tableName='columns_priv', columnName='Column_name', ordinalPosition=5, columnDefault='', isNullable='NO', dataType='char', characterMaximumLength=64, characterOctetLength=192, numericPrecision=0, numericScale=0, datetimePrecision=0, characterSetName='utf8', collationName='utf8_bin', columnType='char(64)', columnKey='PRI', extra='', privileges='select,insert,update,references', columnComment='', generationExpression=''}*/
private String columnName;

/**Column{tableCatalog='def', tableSchema='mysql', tableName='columns_priv', columnName='Timestamp', ordinalPosition=6, columnDefault='CURRENT_TIMESTAMP', isNullable='NO', dataType='timestamp', characterMaximumLength=0, characterOctetLength=0, numericPrecision=0, numericScale=0, datetimePrecision=0, characterSetName='null', collationName='null', columnType='timestamp', columnKey='', extra='on update CURRENT_TIMESTAMP', privileges='select,insert,update,references', columnComment='', generationExpression=''}*/
private Date timestamp;

/**Column{tableCatalog='def', tableSchema='mysql', tableName='columns_priv', columnName='Column_priv', ordinalPosition=7, columnDefault='', isNullable='NO', dataType='set', characterMaximumLength=31, characterOctetLength=93, numericPrecision=0, numericScale=0, datetimePrecision=0, characterSetName='utf8', collationName='utf8_general_ci', columnType='set('Select','Insert','Update','References')', columnKey='', extra='', privileges='select,insert,update,references', columnComment='', generationExpression=''}*/
private Set<String> columnPriv;

public String getHost(){
return host;
}

public String getDb(){
return db;
}

public String getUser(){
return user;
}

public String getTableName(){
return tableName;
}

public String getColumnName(){
return columnName;
}

public Date getTimestamp(){
return timestamp;
}

public Set<String> getColumnPriv(){
return columnPriv;
}

}