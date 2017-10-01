package db.bean.mysql;


/**Master Information
*/
public class SlaveMasterInfo{
/**Column{tableCatalog='def', tableSchema='mysql', tableName='slave_master_info', columnName='Number_of_lines', ordinalPosition=1, columnDefault='null', isNullable='NO', dataType='int', characterMaximumLength=0, characterOctetLength=0, numericPrecision=10, numericScale=0, datetimePrecision=0, characterSetName='null', collationName='null', columnType='int(10) unsigned', columnKey='', extra='', privileges='select,insert,update,references', columnComment='Number of lines in the file.', generationExpression=''}*/
private Integer numberOfLines;

/**Column{tableCatalog='def', tableSchema='mysql', tableName='slave_master_info', columnName='Master_log_name', ordinalPosition=2, columnDefault='null', isNullable='NO', dataType='text', characterMaximumLength=65535, characterOctetLength=65535, numericPrecision=0, numericScale=0, datetimePrecision=0, characterSetName='utf8', collationName='utf8_bin', columnType='text', columnKey='', extra='', privileges='select,insert,update,references', columnComment='The name of the master binary log currently being read from the master.', generationExpression=''}*/
private String masterLogName;

/**Column{tableCatalog='def', tableSchema='mysql', tableName='slave_master_info', columnName='Master_log_pos', ordinalPosition=3, columnDefault='null', isNullable='NO', dataType='bigint', characterMaximumLength=0, characterOctetLength=0, numericPrecision=20, numericScale=0, datetimePrecision=0, characterSetName='null', collationName='null', columnType='bigint(20) unsigned', columnKey='', extra='', privileges='select,insert,update,references', columnComment='The master log position of the last read event.', generationExpression=''}*/
private Long masterLogPos;

/**Column{tableCatalog='def', tableSchema='mysql', tableName='slave_master_info', columnName='Host', ordinalPosition=4, columnDefault='null', isNullable='YES', dataType='char', characterMaximumLength=64, characterOctetLength=192, numericPrecision=0, numericScale=0, datetimePrecision=0, characterSetName='utf8', collationName='utf8_bin', columnType='char(64)', columnKey='', extra='', privileges='select,insert,update,references', columnComment='The host name of the master.', generationExpression=''}*/
private String host;

/**Column{tableCatalog='def', tableSchema='mysql', tableName='slave_master_info', columnName='User_name', ordinalPosition=5, columnDefault='null', isNullable='YES', dataType='text', characterMaximumLength=65535, characterOctetLength=65535, numericPrecision=0, numericScale=0, datetimePrecision=0, characterSetName='utf8', collationName='utf8_bin', columnType='text', columnKey='', extra='', privileges='select,insert,update,references', columnComment='The user name used to connect to the master.', generationExpression=''}*/
private String userName;

/**Column{tableCatalog='def', tableSchema='mysql', tableName='slave_master_info', columnName='User_password', ordinalPosition=6, columnDefault='null', isNullable='YES', dataType='text', characterMaximumLength=65535, characterOctetLength=65535, numericPrecision=0, numericScale=0, datetimePrecision=0, characterSetName='utf8', collationName='utf8_bin', columnType='text', columnKey='', extra='', privileges='select,insert,update,references', columnComment='The password used to connect to the master.', generationExpression=''}*/
private String userPassword;

/**Column{tableCatalog='def', tableSchema='mysql', tableName='slave_master_info', columnName='Port', ordinalPosition=7, columnDefault='null', isNullable='NO', dataType='int', characterMaximumLength=0, characterOctetLength=0, numericPrecision=10, numericScale=0, datetimePrecision=0, characterSetName='null', collationName='null', columnType='int(10) unsigned', columnKey='', extra='', privileges='select,insert,update,references', columnComment='The network port used to connect to the master.', generationExpression=''}*/
private Integer port;

/**Column{tableCatalog='def', tableSchema='mysql', tableName='slave_master_info', columnName='Connect_retry', ordinalPosition=8, columnDefault='null', isNullable='NO', dataType='int', characterMaximumLength=0, characterOctetLength=0, numericPrecision=10, numericScale=0, datetimePrecision=0, characterSetName='null', collationName='null', columnType='int(10) unsigned', columnKey='', extra='', privileges='select,insert,update,references', columnComment='The period (in seconds) that the slave will wait before trying to reconnect to the master.', generationExpression=''}*/
private Integer connectRetry;

/**Column{tableCatalog='def', tableSchema='mysql', tableName='slave_master_info', columnName='Enabled_ssl', ordinalPosition=9, columnDefault='null', isNullable='NO', dataType='tinyint', characterMaximumLength=0, characterOctetLength=0, numericPrecision=3, numericScale=0, datetimePrecision=0, characterSetName='null', collationName='null', columnType='tinyint(1)', columnKey='', extra='', privileges='select,insert,update,references', columnComment='Indicates whether the server supports SSL connections.', generationExpression=''}*/
private Integer enabledSsl;

/**Column{tableCatalog='def', tableSchema='mysql', tableName='slave_master_info', columnName='Ssl_ca', ordinalPosition=10, columnDefault='null', isNullable='YES', dataType='text', characterMaximumLength=65535, characterOctetLength=65535, numericPrecision=0, numericScale=0, datetimePrecision=0, characterSetName='utf8', collationName='utf8_bin', columnType='text', columnKey='', extra='', privileges='select,insert,update,references', columnComment='The file used for the Certificate Authority (CA) certificate.', generationExpression=''}*/
private String sslCa;

/**Column{tableCatalog='def', tableSchema='mysql', tableName='slave_master_info', columnName='Ssl_capath', ordinalPosition=11, columnDefault='null', isNullable='YES', dataType='text', characterMaximumLength=65535, characterOctetLength=65535, numericPrecision=0, numericScale=0, datetimePrecision=0, characterSetName='utf8', collationName='utf8_bin', columnType='text', columnKey='', extra='', privileges='select,insert,update,references', columnComment='The path to the Certificate Authority (CA) certificates.', generationExpression=''}*/
private String sslCapath;

/**Column{tableCatalog='def', tableSchema='mysql', tableName='slave_master_info', columnName='Ssl_cert', ordinalPosition=12, columnDefault='null', isNullable='YES', dataType='text', characterMaximumLength=65535, characterOctetLength=65535, numericPrecision=0, numericScale=0, datetimePrecision=0, characterSetName='utf8', collationName='utf8_bin', columnType='text', columnKey='', extra='', privileges='select,insert,update,references', columnComment='The name of the SSL certificate file.', generationExpression=''}*/
private String sslCert;

/**Column{tableCatalog='def', tableSchema='mysql', tableName='slave_master_info', columnName='Ssl_cipher', ordinalPosition=13, columnDefault='null', isNullable='YES', dataType='text', characterMaximumLength=65535, characterOctetLength=65535, numericPrecision=0, numericScale=0, datetimePrecision=0, characterSetName='utf8', collationName='utf8_bin', columnType='text', columnKey='', extra='', privileges='select,insert,update,references', columnComment='The name of the cipher in use for the SSL connection.', generationExpression=''}*/
private String sslCipher;

/**Column{tableCatalog='def', tableSchema='mysql', tableName='slave_master_info', columnName='Ssl_key', ordinalPosition=14, columnDefault='null', isNullable='YES', dataType='text', characterMaximumLength=65535, characterOctetLength=65535, numericPrecision=0, numericScale=0, datetimePrecision=0, characterSetName='utf8', collationName='utf8_bin', columnType='text', columnKey='', extra='', privileges='select,insert,update,references', columnComment='The name of the SSL key file.', generationExpression=''}*/
private String sslKey;

/**Column{tableCatalog='def', tableSchema='mysql', tableName='slave_master_info', columnName='Ssl_verify_server_cert', ordinalPosition=15, columnDefault='null', isNullable='NO', dataType='tinyint', characterMaximumLength=0, characterOctetLength=0, numericPrecision=3, numericScale=0, datetimePrecision=0, characterSetName='null', collationName='null', columnType='tinyint(1)', columnKey='', extra='', privileges='select,insert,update,references', columnComment='Whether to verify the server certificate.', generationExpression=''}*/
private Integer sslVerifyServerCert;

/**Column{tableCatalog='def', tableSchema='mysql', tableName='slave_master_info', columnName='Heartbeat', ordinalPosition=16, columnDefault='null', isNullable='NO', dataType='float', characterMaximumLength=0, characterOctetLength=0, numericPrecision=12, numericScale=0, datetimePrecision=0, characterSetName='null', collationName='null', columnType='float', columnKey='', extra='', privileges='select,insert,update,references', columnComment='', generationExpression=''}*/
private Float heartbeat;

/**Column{tableCatalog='def', tableSchema='mysql', tableName='slave_master_info', columnName='Bind', ordinalPosition=17, columnDefault='null', isNullable='YES', dataType='text', characterMaximumLength=65535, characterOctetLength=65535, numericPrecision=0, numericScale=0, datetimePrecision=0, characterSetName='utf8', collationName='utf8_bin', columnType='text', columnKey='', extra='', privileges='select,insert,update,references', columnComment='Displays which interface is employed when connecting to the MySQL server', generationExpression=''}*/
private String bind;

/**Column{tableCatalog='def', tableSchema='mysql', tableName='slave_master_info', columnName='Ignored_server_ids', ordinalPosition=18, columnDefault='null', isNullable='YES', dataType='text', characterMaximumLength=65535, characterOctetLength=65535, numericPrecision=0, numericScale=0, datetimePrecision=0, characterSetName='utf8', collationName='utf8_bin', columnType='text', columnKey='', extra='', privileges='select,insert,update,references', columnComment='The number of server IDs to be ignored, followed by the actual server IDs', generationExpression=''}*/
private String ignoredServerIds;

/**Column{tableCatalog='def', tableSchema='mysql', tableName='slave_master_info', columnName='Uuid', ordinalPosition=19, columnDefault='null', isNullable='YES', dataType='text', characterMaximumLength=65535, characterOctetLength=65535, numericPrecision=0, numericScale=0, datetimePrecision=0, characterSetName='utf8', collationName='utf8_bin', columnType='text', columnKey='', extra='', privileges='select,insert,update,references', columnComment='The master server uuid.', generationExpression=''}*/
private String uuid;

/**Column{tableCatalog='def', tableSchema='mysql', tableName='slave_master_info', columnName='Retry_count', ordinalPosition=20, columnDefault='null', isNullable='NO', dataType='bigint', characterMaximumLength=0, characterOctetLength=0, numericPrecision=20, numericScale=0, datetimePrecision=0, characterSetName='null', collationName='null', columnType='bigint(20) unsigned', columnKey='', extra='', privileges='select,insert,update,references', columnComment='Number of reconnect attempts, to the master, before giving up.', generationExpression=''}*/
private Long retryCount;

/**Column{tableCatalog='def', tableSchema='mysql', tableName='slave_master_info', columnName='Ssl_crl', ordinalPosition=21, columnDefault='null', isNullable='YES', dataType='text', characterMaximumLength=65535, characterOctetLength=65535, numericPrecision=0, numericScale=0, datetimePrecision=0, characterSetName='utf8', collationName='utf8_bin', columnType='text', columnKey='', extra='', privileges='select,insert,update,references', columnComment='The file used for the Certificate Revocation List (CRL)', generationExpression=''}*/
private String sslCrl;

/**Column{tableCatalog='def', tableSchema='mysql', tableName='slave_master_info', columnName='Ssl_crlpath', ordinalPosition=22, columnDefault='null', isNullable='YES', dataType='text', characterMaximumLength=65535, characterOctetLength=65535, numericPrecision=0, numericScale=0, datetimePrecision=0, characterSetName='utf8', collationName='utf8_bin', columnType='text', columnKey='', extra='', privileges='select,insert,update,references', columnComment='The path used for Certificate Revocation List (CRL) files', generationExpression=''}*/
private String sslCrlpath;

/**Column{tableCatalog='def', tableSchema='mysql', tableName='slave_master_info', columnName='Enabled_auto_position', ordinalPosition=23, columnDefault='null', isNullable='NO', dataType='tinyint', characterMaximumLength=0, characterOctetLength=0, numericPrecision=3, numericScale=0, datetimePrecision=0, characterSetName='null', collationName='null', columnType='tinyint(1)', columnKey='', extra='', privileges='select,insert,update,references', columnComment='Indicates whether GTIDs will be used to retrieve events from the master.', generationExpression=''}*/
private Integer enabledAutoPosition;

/**Column{tableCatalog='def', tableSchema='mysql', tableName='slave_master_info', columnName='Channel_name', ordinalPosition=24, columnDefault='null', isNullable='NO', dataType='char', characterMaximumLength=64, characterOctetLength=192, numericPrecision=0, numericScale=0, datetimePrecision=0, characterSetName='utf8', collationName='utf8_general_ci', columnType='char(64)', columnKey='PRI', extra='', privileges='select,insert,update,references', columnComment='The channel on which the slave is connected to a source. Used in Multisource Replication', generationExpression=''}*/
private String channelName;

/**Column{tableCatalog='def', tableSchema='mysql', tableName='slave_master_info', columnName='Tls_version', ordinalPosition=25, columnDefault='null', isNullable='YES', dataType='text', characterMaximumLength=65535, characterOctetLength=65535, numericPrecision=0, numericScale=0, datetimePrecision=0, characterSetName='utf8', collationName='utf8_bin', columnType='text', columnKey='', extra='', privileges='select,insert,update,references', columnComment='Tls version', generationExpression=''}*/
private String tlsVersion;

public Integer getNumberOfLines(){
return numberOfLines;
}

public String getMasterLogName(){
return masterLogName;
}

public Long getMasterLogPos(){
return masterLogPos;
}

public String getHost(){
return host;
}

public String getUserName(){
return userName;
}

public String getUserPassword(){
return userPassword;
}

public Integer getPort(){
return port;
}

public Integer getConnectRetry(){
return connectRetry;
}

public Integer getEnabledSsl(){
return enabledSsl;
}

public String getSslCa(){
return sslCa;
}

public String getSslCapath(){
return sslCapath;
}

public String getSslCert(){
return sslCert;
}

public String getSslCipher(){
return sslCipher;
}

public String getSslKey(){
return sslKey;
}

public Integer getSslVerifyServerCert(){
return sslVerifyServerCert;
}

public Float getHeartbeat(){
return heartbeat;
}

public String getBind(){
return bind;
}

public String getIgnoredServerIds(){
return ignoredServerIds;
}

public String getUuid(){
return uuid;
}

public Long getRetryCount(){
return retryCount;
}

public String getSslCrl(){
return sslCrl;
}

public String getSslCrlpath(){
return sslCrlpath;
}

public Integer getEnabledAutoPosition(){
return enabledAutoPosition;
}

public String getChannelName(){
return channelName;
}

public String getTlsVersion(){
return tlsVersion;
}

}