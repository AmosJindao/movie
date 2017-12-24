package db.bean.mysql;


/* SELECT Server_name AS serverName, Host AS host, Db AS db, Username AS username, Password AS password, Port AS port, Socket AS socket, Wrapper AS wrapper, Owner AS owner FROM mysql.servers */
/**MySQL Foreign Servers table
*/
public class Servers{
/**Column{tableCatalog='def', tableSchema='mysql', tableName='servers', columnName='Server_name', ordinalPosition=1, columnDefault='', isNullable='NO', dataType='char', characterMaximumLength=64, characterOctetLength=192, numericPrecision=0, numericScale=0, datetimePrecision=0, characterSetName='utf8', collationName='utf8_general_ci', columnType='char(64)', columnKey='PRI', extra='', privileges='select,insert,update,references', columnComment='', generationExpression=''}*/
private String serverName;

/**Column{tableCatalog='def', tableSchema='mysql', tableName='servers', columnName='Host', ordinalPosition=2, columnDefault='', isNullable='NO', dataType='char', characterMaximumLength=64, characterOctetLength=192, numericPrecision=0, numericScale=0, datetimePrecision=0, characterSetName='utf8', collationName='utf8_general_ci', columnType='char(64)', columnKey='', extra='', privileges='select,insert,update,references', columnComment='', generationExpression=''}*/
private String host;

/**Column{tableCatalog='def', tableSchema='mysql', tableName='servers', columnName='Db', ordinalPosition=3, columnDefault='', isNullable='NO', dataType='char', characterMaximumLength=64, characterOctetLength=192, numericPrecision=0, numericScale=0, datetimePrecision=0, characterSetName='utf8', collationName='utf8_general_ci', columnType='char(64)', columnKey='', extra='', privileges='select,insert,update,references', columnComment='', generationExpression=''}*/
private String db;

/**Column{tableCatalog='def', tableSchema='mysql', tableName='servers', columnName='Username', ordinalPosition=4, columnDefault='', isNullable='NO', dataType='char', characterMaximumLength=64, characterOctetLength=192, numericPrecision=0, numericScale=0, datetimePrecision=0, characterSetName='utf8', collationName='utf8_general_ci', columnType='char(64)', columnKey='', extra='', privileges='select,insert,update,references', columnComment='', generationExpression=''}*/
private String username;

/**Column{tableCatalog='def', tableSchema='mysql', tableName='servers', columnName='Password', ordinalPosition=5, columnDefault='', isNullable='NO', dataType='char', characterMaximumLength=64, characterOctetLength=192, numericPrecision=0, numericScale=0, datetimePrecision=0, characterSetName='utf8', collationName='utf8_general_ci', columnType='char(64)', columnKey='', extra='', privileges='select,insert,update,references', columnComment='', generationExpression=''}*/
private String password;

/**Column{tableCatalog='def', tableSchema='mysql', tableName='servers', columnName='Port', ordinalPosition=6, columnDefault='0', isNullable='NO', dataType='int', characterMaximumLength=0, characterOctetLength=0, numericPrecision=10, numericScale=0, datetimePrecision=0, characterSetName='null', collationName='null', columnType='int(4)', columnKey='', extra='', privileges='select,insert,update,references', columnComment='', generationExpression=''}*/
private Integer port;

/**Column{tableCatalog='def', tableSchema='mysql', tableName='servers', columnName='Socket', ordinalPosition=7, columnDefault='', isNullable='NO', dataType='char', characterMaximumLength=64, characterOctetLength=192, numericPrecision=0, numericScale=0, datetimePrecision=0, characterSetName='utf8', collationName='utf8_general_ci', columnType='char(64)', columnKey='', extra='', privileges='select,insert,update,references', columnComment='', generationExpression=''}*/
private String socket;

/**Column{tableCatalog='def', tableSchema='mysql', tableName='servers', columnName='Wrapper', ordinalPosition=8, columnDefault='', isNullable='NO', dataType='char', characterMaximumLength=64, characterOctetLength=192, numericPrecision=0, numericScale=0, datetimePrecision=0, characterSetName='utf8', collationName='utf8_general_ci', columnType='char(64)', columnKey='', extra='', privileges='select,insert,update,references', columnComment='', generationExpression=''}*/
private String wrapper;

/**Column{tableCatalog='def', tableSchema='mysql', tableName='servers', columnName='Owner', ordinalPosition=9, columnDefault='', isNullable='NO', dataType='char', characterMaximumLength=64, characterOctetLength=192, numericPrecision=0, numericScale=0, datetimePrecision=0, characterSetName='utf8', collationName='utf8_general_ci', columnType='char(64)', columnKey='', extra='', privileges='select,insert,update,references', columnComment='', generationExpression=''}*/
private String owner;

public String getServerName(){
return serverName;
}

public String getHost(){
return host;
}

public String getDb(){
return db;
}

public String getUsername(){
return username;
}

public String getPassword(){
return password;
}

public Integer getPort(){
return port;
}

public String getSocket(){
return socket;
}

public String getWrapper(){
return wrapper;
}

public String getOwner(){
return owner;
}

}