package db.bean.mysql;

import java.util.Date;

/* SELECT Host AS host, User AS user, Proxied_host AS proxiedHost, Proxied_user AS proxiedUser, With_grant AS withGrant, Grantor AS grantor, Timestamp AS timestamp FROM mysql.proxies_priv */
/**User proxy privileges
*/
public class ProxiesPriv{
/**Column{tableCatalog='def', tableSchema='mysql', tableName='proxies_priv', columnName='Host', ordinalPosition=1, columnDefault='', isNullable='NO', dataType='char', characterMaximumLength=60, characterOctetLength=180, numericPrecision=0, numericScale=0, datetimePrecision=0, characterSetName='utf8', collationName='utf8_bin', columnType='char(60)', columnKey='PRI', extra='', privileges='select,insert,update,references', columnComment='', generationExpression=''}*/
private String host;

/**Column{tableCatalog='def', tableSchema='mysql', tableName='proxies_priv', columnName='User', ordinalPosition=2, columnDefault='', isNullable='NO', dataType='char', characterMaximumLength=32, characterOctetLength=96, numericPrecision=0, numericScale=0, datetimePrecision=0, characterSetName='utf8', collationName='utf8_bin', columnType='char(32)', columnKey='PRI', extra='', privileges='select,insert,update,references', columnComment='', generationExpression=''}*/
private String user;

/**Column{tableCatalog='def', tableSchema='mysql', tableName='proxies_priv', columnName='Proxied_host', ordinalPosition=3, columnDefault='', isNullable='NO', dataType='char', characterMaximumLength=60, characterOctetLength=180, numericPrecision=0, numericScale=0, datetimePrecision=0, characterSetName='utf8', collationName='utf8_bin', columnType='char(60)', columnKey='PRI', extra='', privileges='select,insert,update,references', columnComment='', generationExpression=''}*/
private String proxiedHost;

/**Column{tableCatalog='def', tableSchema='mysql', tableName='proxies_priv', columnName='Proxied_user', ordinalPosition=4, columnDefault='', isNullable='NO', dataType='char', characterMaximumLength=32, characterOctetLength=96, numericPrecision=0, numericScale=0, datetimePrecision=0, characterSetName='utf8', collationName='utf8_bin', columnType='char(32)', columnKey='PRI', extra='', privileges='select,insert,update,references', columnComment='', generationExpression=''}*/
private String proxiedUser;

/**Column{tableCatalog='def', tableSchema='mysql', tableName='proxies_priv', columnName='With_grant', ordinalPosition=5, columnDefault='0', isNullable='NO', dataType='tinyint', characterMaximumLength=0, characterOctetLength=0, numericPrecision=3, numericScale=0, datetimePrecision=0, characterSetName='null', collationName='null', columnType='tinyint(1)', columnKey='', extra='', privileges='select,insert,update,references', columnComment='', generationExpression=''}*/
private Integer withGrant;

/**Column{tableCatalog='def', tableSchema='mysql', tableName='proxies_priv', columnName='Grantor', ordinalPosition=6, columnDefault='', isNullable='NO', dataType='char', characterMaximumLength=93, characterOctetLength=279, numericPrecision=0, numericScale=0, datetimePrecision=0, characterSetName='utf8', collationName='utf8_bin', columnType='char(93)', columnKey='MUL', extra='', privileges='select,insert,update,references', columnComment='', generationExpression=''}*/
private String grantor;

/**Column{tableCatalog='def', tableSchema='mysql', tableName='proxies_priv', columnName='Timestamp', ordinalPosition=7, columnDefault='CURRENT_TIMESTAMP', isNullable='NO', dataType='timestamp', characterMaximumLength=0, characterOctetLength=0, numericPrecision=0, numericScale=0, datetimePrecision=0, characterSetName='null', collationName='null', columnType='timestamp', columnKey='', extra='on update CURRENT_TIMESTAMP', privileges='select,insert,update,references', columnComment='', generationExpression=''}*/
private Date timestamp;

public String getHost(){
return host;
}

public String getUser(){
return user;
}

public String getProxiedHost(){
return proxiedHost;
}

public String getProxiedUser(){
return proxiedUser;
}

public Integer getWithGrant(){
return withGrant;
}

public String getGrantor(){
return grantor;
}

public Date getTimestamp(){
return timestamp;
}

}