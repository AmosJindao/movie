package db.bean.performance_schema;

import java.util.Date;

/* SELECT CHANNEL_NAME AS channelName, HOST AS host, PORT AS port, USER AS user, NETWORK_INTERFACE AS networkInterface, AUTO_POSITION AS autoPosition, SSL_ALLOWED AS sslAllowed, SSL_CA_FILE AS sslCaFile, SSL_CA_PATH AS sslCaPath, SSL_CERTIFICATE AS sslCertificate, SSL_CIPHER AS sslCipher, SSL_KEY AS sslKey, SSL_VERIFY_SERVER_CERTIFICATE AS sslVerifyServerCertificate, SSL_CRL_FILE AS sslCrlFile, SSL_CRL_PATH AS sslCrlPath, CONNECTION_RETRY_INTERVAL AS connectionRetryInterval, CONNECTION_RETRY_COUNT AS connectionRetryCount, HEARTBEAT_INTERVAL AS heartbeatInterval, TLS_VERSION AS tlsVersion FROM performance_schema.replication_connection_configuration */
/**
*/
public class ReplicationConnectionConfiguration{
/**Column{tableCatalog='def', tableSchema='performance_schema', tableName='replication_connection_configuration', columnName='CHANNEL_NAME', ordinalPosition=1, columnDefault='null', isNullable='NO', dataType='char', characterMaximumLength=64, characterOctetLength=192, numericPrecision=0, numericScale=0, datetimePrecision=0, characterSetName='utf8', collationName='utf8_general_ci', columnType='char(64)', columnKey='', extra='', privileges='select,insert,update,references', columnComment='', generationExpression=''}*/
private String channelName;

/**Column{tableCatalog='def', tableSchema='performance_schema', tableName='replication_connection_configuration', columnName='HOST', ordinalPosition=2, columnDefault='null', isNullable='NO', dataType='char', characterMaximumLength=60, characterOctetLength=180, numericPrecision=0, numericScale=0, datetimePrecision=0, characterSetName='utf8', collationName='utf8_bin', columnType='char(60)', columnKey='', extra='', privileges='select,insert,update,references', columnComment='', generationExpression=''}*/
private String host;

/**Column{tableCatalog='def', tableSchema='performance_schema', tableName='replication_connection_configuration', columnName='PORT', ordinalPosition=3, columnDefault='null', isNullable='NO', dataType='int', characterMaximumLength=0, characterOctetLength=0, numericPrecision=10, numericScale=0, datetimePrecision=0, characterSetName='null', collationName='null', columnType='int(11)', columnKey='', extra='', privileges='select,insert,update,references', columnComment='', generationExpression=''}*/
private Integer port;

/**Column{tableCatalog='def', tableSchema='performance_schema', tableName='replication_connection_configuration', columnName='USER', ordinalPosition=4, columnDefault='null', isNullable='NO', dataType='char', characterMaximumLength=32, characterOctetLength=96, numericPrecision=0, numericScale=0, datetimePrecision=0, characterSetName='utf8', collationName='utf8_bin', columnType='char(32)', columnKey='', extra='', privileges='select,insert,update,references', columnComment='', generationExpression=''}*/
private String user;

/**Column{tableCatalog='def', tableSchema='performance_schema', tableName='replication_connection_configuration', columnName='NETWORK_INTERFACE', ordinalPosition=5, columnDefault='null', isNullable='NO', dataType='char', characterMaximumLength=60, characterOctetLength=180, numericPrecision=0, numericScale=0, datetimePrecision=0, characterSetName='utf8', collationName='utf8_bin', columnType='char(60)', columnKey='', extra='', privileges='select,insert,update,references', columnComment='', generationExpression=''}*/
private String networkInterface;

/**Column{tableCatalog='def', tableSchema='performance_schema', tableName='replication_connection_configuration', columnName='AUTO_POSITION', ordinalPosition=6, columnDefault='null', isNullable='NO', dataType='enum', characterMaximumLength=1, characterOctetLength=3, numericPrecision=0, numericScale=0, datetimePrecision=0, characterSetName='utf8', collationName='utf8_general_ci', columnType='enum('1','0')', columnKey='', extra='', privileges='select,insert,update,references', columnComment='', generationExpression=''}*/
private Date autoPosition;

/**Column{tableCatalog='def', tableSchema='performance_schema', tableName='replication_connection_configuration', columnName='SSL_ALLOWED', ordinalPosition=7, columnDefault='null', isNullable='NO', dataType='enum', characterMaximumLength=7, characterOctetLength=21, numericPrecision=0, numericScale=0, datetimePrecision=0, characterSetName='utf8', collationName='utf8_general_ci', columnType='enum('YES','NO','IGNORED')', columnKey='', extra='', privileges='select,insert,update,references', columnComment='', generationExpression=''}*/
private Date sslAllowed;

/**Column{tableCatalog='def', tableSchema='performance_schema', tableName='replication_connection_configuration', columnName='SSL_CA_FILE', ordinalPosition=8, columnDefault='null', isNullable='NO', dataType='varchar', characterMaximumLength=512, characterOctetLength=1536, numericPrecision=0, numericScale=0, datetimePrecision=0, characterSetName='utf8', collationName='utf8_general_ci', columnType='varchar(512)', columnKey='', extra='', privileges='select,insert,update,references', columnComment='', generationExpression=''}*/
private String sslCaFile;

/**Column{tableCatalog='def', tableSchema='performance_schema', tableName='replication_connection_configuration', columnName='SSL_CA_PATH', ordinalPosition=9, columnDefault='null', isNullable='NO', dataType='varchar', characterMaximumLength=512, characterOctetLength=1536, numericPrecision=0, numericScale=0, datetimePrecision=0, characterSetName='utf8', collationName='utf8_general_ci', columnType='varchar(512)', columnKey='', extra='', privileges='select,insert,update,references', columnComment='', generationExpression=''}*/
private String sslCaPath;

/**Column{tableCatalog='def', tableSchema='performance_schema', tableName='replication_connection_configuration', columnName='SSL_CERTIFICATE', ordinalPosition=10, columnDefault='null', isNullable='NO', dataType='varchar', characterMaximumLength=512, characterOctetLength=1536, numericPrecision=0, numericScale=0, datetimePrecision=0, characterSetName='utf8', collationName='utf8_general_ci', columnType='varchar(512)', columnKey='', extra='', privileges='select,insert,update,references', columnComment='', generationExpression=''}*/
private String sslCertificate;

/**Column{tableCatalog='def', tableSchema='performance_schema', tableName='replication_connection_configuration', columnName='SSL_CIPHER', ordinalPosition=11, columnDefault='null', isNullable='NO', dataType='varchar', characterMaximumLength=512, characterOctetLength=1536, numericPrecision=0, numericScale=0, datetimePrecision=0, characterSetName='utf8', collationName='utf8_general_ci', columnType='varchar(512)', columnKey='', extra='', privileges='select,insert,update,references', columnComment='', generationExpression=''}*/
private String sslCipher;

/**Column{tableCatalog='def', tableSchema='performance_schema', tableName='replication_connection_configuration', columnName='SSL_KEY', ordinalPosition=12, columnDefault='null', isNullable='NO', dataType='varchar', characterMaximumLength=512, characterOctetLength=1536, numericPrecision=0, numericScale=0, datetimePrecision=0, characterSetName='utf8', collationName='utf8_general_ci', columnType='varchar(512)', columnKey='', extra='', privileges='select,insert,update,references', columnComment='', generationExpression=''}*/
private String sslKey;

/**Column{tableCatalog='def', tableSchema='performance_schema', tableName='replication_connection_configuration', columnName='SSL_VERIFY_SERVER_CERTIFICATE', ordinalPosition=13, columnDefault='null', isNullable='NO', dataType='enum', characterMaximumLength=3, characterOctetLength=9, numericPrecision=0, numericScale=0, datetimePrecision=0, characterSetName='utf8', collationName='utf8_general_ci', columnType='enum('YES','NO')', columnKey='', extra='', privileges='select,insert,update,references', columnComment='', generationExpression=''}*/
private Date sslVerifyServerCertificate;

/**Column{tableCatalog='def', tableSchema='performance_schema', tableName='replication_connection_configuration', columnName='SSL_CRL_FILE', ordinalPosition=14, columnDefault='null', isNullable='NO', dataType='varchar', characterMaximumLength=255, characterOctetLength=765, numericPrecision=0, numericScale=0, datetimePrecision=0, characterSetName='utf8', collationName='utf8_general_ci', columnType='varchar(255)', columnKey='', extra='', privileges='select,insert,update,references', columnComment='', generationExpression=''}*/
private String sslCrlFile;

/**Column{tableCatalog='def', tableSchema='performance_schema', tableName='replication_connection_configuration', columnName='SSL_CRL_PATH', ordinalPosition=15, columnDefault='null', isNullable='NO', dataType='varchar', characterMaximumLength=255, characterOctetLength=765, numericPrecision=0, numericScale=0, datetimePrecision=0, characterSetName='utf8', collationName='utf8_general_ci', columnType='varchar(255)', columnKey='', extra='', privileges='select,insert,update,references', columnComment='', generationExpression=''}*/
private String sslCrlPath;

/**Column{tableCatalog='def', tableSchema='performance_schema', tableName='replication_connection_configuration', columnName='CONNECTION_RETRY_INTERVAL', ordinalPosition=16, columnDefault='null', isNullable='NO', dataType='int', characterMaximumLength=0, characterOctetLength=0, numericPrecision=10, numericScale=0, datetimePrecision=0, characterSetName='null', collationName='null', columnType='int(11)', columnKey='', extra='', privileges='select,insert,update,references', columnComment='', generationExpression=''}*/
private Integer connectionRetryInterval;

/**Column{tableCatalog='def', tableSchema='performance_schema', tableName='replication_connection_configuration', columnName='CONNECTION_RETRY_COUNT', ordinalPosition=17, columnDefault='null', isNullable='NO', dataType='bigint', characterMaximumLength=0, characterOctetLength=0, numericPrecision=20, numericScale=0, datetimePrecision=0, characterSetName='null', collationName='null', columnType='bigint(20) unsigned', columnKey='', extra='', privileges='select,insert,update,references', columnComment='', generationExpression=''}*/
private Long connectionRetryCount;

/**Column{tableCatalog='def', tableSchema='performance_schema', tableName='replication_connection_configuration', columnName='HEARTBEAT_INTERVAL', ordinalPosition=18, columnDefault='null', isNullable='NO', dataType='double', characterMaximumLength=0, characterOctetLength=0, numericPrecision=10, numericScale=3, datetimePrecision=0, characterSetName='null', collationName='null', columnType='double(10,3) unsigned', columnKey='', extra='', privileges='select,insert,update,references', columnComment='Number of seconds after which a heartbeat will be sent .', generationExpression=''}*/
private Double heartbeatInterval;

/**Column{tableCatalog='def', tableSchema='performance_schema', tableName='replication_connection_configuration', columnName='TLS_VERSION', ordinalPosition=19, columnDefault='null', isNullable='NO', dataType='varchar', characterMaximumLength=255, characterOctetLength=765, numericPrecision=0, numericScale=0, datetimePrecision=0, characterSetName='utf8', collationName='utf8_general_ci', columnType='varchar(255)', columnKey='', extra='', privileges='select,insert,update,references', columnComment='', generationExpression=''}*/
private String tlsVersion;

public String getChannelName(){
return channelName;
}

public String getHost(){
return host;
}

public Integer getPort(){
return port;
}

public String getUser(){
return user;
}

public String getNetworkInterface(){
return networkInterface;
}

public Date getAutoPosition(){
return autoPosition;
}

public Date getSslAllowed(){
return sslAllowed;
}

public String getSslCaFile(){
return sslCaFile;
}

public String getSslCaPath(){
return sslCaPath;
}

public String getSslCertificate(){
return sslCertificate;
}

public String getSslCipher(){
return sslCipher;
}

public String getSslKey(){
return sslKey;
}

public Date getSslVerifyServerCertificate(){
return sslVerifyServerCertificate;
}

public String getSslCrlFile(){
return sslCrlFile;
}

public String getSslCrlPath(){
return sslCrlPath;
}

public Integer getConnectionRetryInterval(){
return connectionRetryInterval;
}

public Long getConnectionRetryCount(){
return connectionRetryCount;
}

public Double getHeartbeatInterval(){
return heartbeatInterval;
}

public String getTlsVersion(){
return tlsVersion;
}

}