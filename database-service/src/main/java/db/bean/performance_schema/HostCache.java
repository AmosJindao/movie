package db.bean.performance_schema;

import java.util.Date;

/**
*/
public class HostCache{
/**Column{tableCatalog='def', tableSchema='performance_schema', tableName='host_cache', columnName='IP', ordinalPosition=1, columnDefault='null', isNullable='NO', dataType='varchar', characterMaximumLength=64, characterOctetLength=192, numericPrecision=0, numericScale=0, datetimePrecision=0, characterSetName='utf8', collationName='utf8_general_ci', columnType='varchar(64)', columnKey='', extra='', privileges='select,insert,update,references', columnComment='', generationExpression=''}*/
private String ip;

/**Column{tableCatalog='def', tableSchema='performance_schema', tableName='host_cache', columnName='HOST', ordinalPosition=2, columnDefault='null', isNullable='YES', dataType='varchar', characterMaximumLength=255, characterOctetLength=765, numericPrecision=0, numericScale=0, datetimePrecision=0, characterSetName='utf8', collationName='utf8_bin', columnType='varchar(255)', columnKey='', extra='', privileges='select,insert,update,references', columnComment='', generationExpression=''}*/
private String host;

/**Column{tableCatalog='def', tableSchema='performance_schema', tableName='host_cache', columnName='HOST_VALIDATED', ordinalPosition=3, columnDefault='null', isNullable='NO', dataType='enum', characterMaximumLength=3, characterOctetLength=9, numericPrecision=0, numericScale=0, datetimePrecision=0, characterSetName='utf8', collationName='utf8_general_ci', columnType='enum('YES','NO')', columnKey='', extra='', privileges='select,insert,update,references', columnComment='', generationExpression=''}*/
private Date hostValidated;

/**Column{tableCatalog='def', tableSchema='performance_schema', tableName='host_cache', columnName='SUM_CONNECT_ERRORS', ordinalPosition=4, columnDefault='null', isNullable='NO', dataType='bigint', characterMaximumLength=0, characterOctetLength=0, numericPrecision=19, numericScale=0, datetimePrecision=0, characterSetName='null', collationName='null', columnType='bigint(20)', columnKey='', extra='', privileges='select,insert,update,references', columnComment='', generationExpression=''}*/
private Long sumConnectErrors;

/**Column{tableCatalog='def', tableSchema='performance_schema', tableName='host_cache', columnName='COUNT_HOST_BLOCKED_ERRORS', ordinalPosition=5, columnDefault='null', isNullable='NO', dataType='bigint', characterMaximumLength=0, characterOctetLength=0, numericPrecision=19, numericScale=0, datetimePrecision=0, characterSetName='null', collationName='null', columnType='bigint(20)', columnKey='', extra='', privileges='select,insert,update,references', columnComment='', generationExpression=''}*/
private Long countHostBlockedErrors;

/**Column{tableCatalog='def', tableSchema='performance_schema', tableName='host_cache', columnName='COUNT_NAMEINFO_TRANSIENT_ERRORS', ordinalPosition=6, columnDefault='null', isNullable='NO', dataType='bigint', characterMaximumLength=0, characterOctetLength=0, numericPrecision=19, numericScale=0, datetimePrecision=0, characterSetName='null', collationName='null', columnType='bigint(20)', columnKey='', extra='', privileges='select,insert,update,references', columnComment='', generationExpression=''}*/
private Long countNameinfoTransientErrors;

/**Column{tableCatalog='def', tableSchema='performance_schema', tableName='host_cache', columnName='COUNT_NAMEINFO_PERMANENT_ERRORS', ordinalPosition=7, columnDefault='null', isNullable='NO', dataType='bigint', characterMaximumLength=0, characterOctetLength=0, numericPrecision=19, numericScale=0, datetimePrecision=0, characterSetName='null', collationName='null', columnType='bigint(20)', columnKey='', extra='', privileges='select,insert,update,references', columnComment='', generationExpression=''}*/
private Long countNameinfoPermanentErrors;

/**Column{tableCatalog='def', tableSchema='performance_schema', tableName='host_cache', columnName='COUNT_FORMAT_ERRORS', ordinalPosition=8, columnDefault='null', isNullable='NO', dataType='bigint', characterMaximumLength=0, characterOctetLength=0, numericPrecision=19, numericScale=0, datetimePrecision=0, characterSetName='null', collationName='null', columnType='bigint(20)', columnKey='', extra='', privileges='select,insert,update,references', columnComment='', generationExpression=''}*/
private Long countFormatErrors;

/**Column{tableCatalog='def', tableSchema='performance_schema', tableName='host_cache', columnName='COUNT_ADDRINFO_TRANSIENT_ERRORS', ordinalPosition=9, columnDefault='null', isNullable='NO', dataType='bigint', characterMaximumLength=0, characterOctetLength=0, numericPrecision=19, numericScale=0, datetimePrecision=0, characterSetName='null', collationName='null', columnType='bigint(20)', columnKey='', extra='', privileges='select,insert,update,references', columnComment='', generationExpression=''}*/
private Long countAddrinfoTransientErrors;

/**Column{tableCatalog='def', tableSchema='performance_schema', tableName='host_cache', columnName='COUNT_ADDRINFO_PERMANENT_ERRORS', ordinalPosition=10, columnDefault='null', isNullable='NO', dataType='bigint', characterMaximumLength=0, characterOctetLength=0, numericPrecision=19, numericScale=0, datetimePrecision=0, characterSetName='null', collationName='null', columnType='bigint(20)', columnKey='', extra='', privileges='select,insert,update,references', columnComment='', generationExpression=''}*/
private Long countAddrinfoPermanentErrors;

/**Column{tableCatalog='def', tableSchema='performance_schema', tableName='host_cache', columnName='COUNT_FCRDNS_ERRORS', ordinalPosition=11, columnDefault='null', isNullable='NO', dataType='bigint', characterMaximumLength=0, characterOctetLength=0, numericPrecision=19, numericScale=0, datetimePrecision=0, characterSetName='null', collationName='null', columnType='bigint(20)', columnKey='', extra='', privileges='select,insert,update,references', columnComment='', generationExpression=''}*/
private Long countFcrdnsErrors;

/**Column{tableCatalog='def', tableSchema='performance_schema', tableName='host_cache', columnName='COUNT_HOST_ACL_ERRORS', ordinalPosition=12, columnDefault='null', isNullable='NO', dataType='bigint', characterMaximumLength=0, characterOctetLength=0, numericPrecision=19, numericScale=0, datetimePrecision=0, characterSetName='null', collationName='null', columnType='bigint(20)', columnKey='', extra='', privileges='select,insert,update,references', columnComment='', generationExpression=''}*/
private Long countHostAclErrors;

/**Column{tableCatalog='def', tableSchema='performance_schema', tableName='host_cache', columnName='COUNT_NO_AUTH_PLUGIN_ERRORS', ordinalPosition=13, columnDefault='null', isNullable='NO', dataType='bigint', characterMaximumLength=0, characterOctetLength=0, numericPrecision=19, numericScale=0, datetimePrecision=0, characterSetName='null', collationName='null', columnType='bigint(20)', columnKey='', extra='', privileges='select,insert,update,references', columnComment='', generationExpression=''}*/
private Long countNoAuthPluginErrors;

/**Column{tableCatalog='def', tableSchema='performance_schema', tableName='host_cache', columnName='COUNT_AUTH_PLUGIN_ERRORS', ordinalPosition=14, columnDefault='null', isNullable='NO', dataType='bigint', characterMaximumLength=0, characterOctetLength=0, numericPrecision=19, numericScale=0, datetimePrecision=0, characterSetName='null', collationName='null', columnType='bigint(20)', columnKey='', extra='', privileges='select,insert,update,references', columnComment='', generationExpression=''}*/
private Long countAuthPluginErrors;

/**Column{tableCatalog='def', tableSchema='performance_schema', tableName='host_cache', columnName='COUNT_HANDSHAKE_ERRORS', ordinalPosition=15, columnDefault='null', isNullable='NO', dataType='bigint', characterMaximumLength=0, characterOctetLength=0, numericPrecision=19, numericScale=0, datetimePrecision=0, characterSetName='null', collationName='null', columnType='bigint(20)', columnKey='', extra='', privileges='select,insert,update,references', columnComment='', generationExpression=''}*/
private Long countHandshakeErrors;

/**Column{tableCatalog='def', tableSchema='performance_schema', tableName='host_cache', columnName='COUNT_PROXY_USER_ERRORS', ordinalPosition=16, columnDefault='null', isNullable='NO', dataType='bigint', characterMaximumLength=0, characterOctetLength=0, numericPrecision=19, numericScale=0, datetimePrecision=0, characterSetName='null', collationName='null', columnType='bigint(20)', columnKey='', extra='', privileges='select,insert,update,references', columnComment='', generationExpression=''}*/
private Long countProxyUserErrors;

/**Column{tableCatalog='def', tableSchema='performance_schema', tableName='host_cache', columnName='COUNT_PROXY_USER_ACL_ERRORS', ordinalPosition=17, columnDefault='null', isNullable='NO', dataType='bigint', characterMaximumLength=0, characterOctetLength=0, numericPrecision=19, numericScale=0, datetimePrecision=0, characterSetName='null', collationName='null', columnType='bigint(20)', columnKey='', extra='', privileges='select,insert,update,references', columnComment='', generationExpression=''}*/
private Long countProxyUserAclErrors;

/**Column{tableCatalog='def', tableSchema='performance_schema', tableName='host_cache', columnName='COUNT_AUTHENTICATION_ERRORS', ordinalPosition=18, columnDefault='null', isNullable='NO', dataType='bigint', characterMaximumLength=0, characterOctetLength=0, numericPrecision=19, numericScale=0, datetimePrecision=0, characterSetName='null', collationName='null', columnType='bigint(20)', columnKey='', extra='', privileges='select,insert,update,references', columnComment='', generationExpression=''}*/
private Long countAuthenticationErrors;

/**Column{tableCatalog='def', tableSchema='performance_schema', tableName='host_cache', columnName='COUNT_SSL_ERRORS', ordinalPosition=19, columnDefault='null', isNullable='NO', dataType='bigint', characterMaximumLength=0, characterOctetLength=0, numericPrecision=19, numericScale=0, datetimePrecision=0, characterSetName='null', collationName='null', columnType='bigint(20)', columnKey='', extra='', privileges='select,insert,update,references', columnComment='', generationExpression=''}*/
private Long countSslErrors;

/**Column{tableCatalog='def', tableSchema='performance_schema', tableName='host_cache', columnName='COUNT_MAX_USER_CONNECTIONS_ERRORS', ordinalPosition=20, columnDefault='null', isNullable='NO', dataType='bigint', characterMaximumLength=0, characterOctetLength=0, numericPrecision=19, numericScale=0, datetimePrecision=0, characterSetName='null', collationName='null', columnType='bigint(20)', columnKey='', extra='', privileges='select,insert,update,references', columnComment='', generationExpression=''}*/
private Long countMaxUserConnectionsErrors;

/**Column{tableCatalog='def', tableSchema='performance_schema', tableName='host_cache', columnName='COUNT_MAX_USER_CONNECTIONS_PER_HOUR_ERRORS', ordinalPosition=21, columnDefault='null', isNullable='NO', dataType='bigint', characterMaximumLength=0, characterOctetLength=0, numericPrecision=19, numericScale=0, datetimePrecision=0, characterSetName='null', collationName='null', columnType='bigint(20)', columnKey='', extra='', privileges='select,insert,update,references', columnComment='', generationExpression=''}*/
private Long countMaxUserConnectionsPerHourErrors;

/**Column{tableCatalog='def', tableSchema='performance_schema', tableName='host_cache', columnName='COUNT_DEFAULT_DATABASE_ERRORS', ordinalPosition=22, columnDefault='null', isNullable='NO', dataType='bigint', characterMaximumLength=0, characterOctetLength=0, numericPrecision=19, numericScale=0, datetimePrecision=0, characterSetName='null', collationName='null', columnType='bigint(20)', columnKey='', extra='', privileges='select,insert,update,references', columnComment='', generationExpression=''}*/
private Long countDefaultDatabaseErrors;

/**Column{tableCatalog='def', tableSchema='performance_schema', tableName='host_cache', columnName='COUNT_INIT_CONNECT_ERRORS', ordinalPosition=23, columnDefault='null', isNullable='NO', dataType='bigint', characterMaximumLength=0, characterOctetLength=0, numericPrecision=19, numericScale=0, datetimePrecision=0, characterSetName='null', collationName='null', columnType='bigint(20)', columnKey='', extra='', privileges='select,insert,update,references', columnComment='', generationExpression=''}*/
private Long countInitConnectErrors;

/**Column{tableCatalog='def', tableSchema='performance_schema', tableName='host_cache', columnName='COUNT_LOCAL_ERRORS', ordinalPosition=24, columnDefault='null', isNullable='NO', dataType='bigint', characterMaximumLength=0, characterOctetLength=0, numericPrecision=19, numericScale=0, datetimePrecision=0, characterSetName='null', collationName='null', columnType='bigint(20)', columnKey='', extra='', privileges='select,insert,update,references', columnComment='', generationExpression=''}*/
private Long countLocalErrors;

/**Column{tableCatalog='def', tableSchema='performance_schema', tableName='host_cache', columnName='COUNT_UNKNOWN_ERRORS', ordinalPosition=25, columnDefault='null', isNullable='NO', dataType='bigint', characterMaximumLength=0, characterOctetLength=0, numericPrecision=19, numericScale=0, datetimePrecision=0, characterSetName='null', collationName='null', columnType='bigint(20)', columnKey='', extra='', privileges='select,insert,update,references', columnComment='', generationExpression=''}*/
private Long countUnknownErrors;

/**Column{tableCatalog='def', tableSchema='performance_schema', tableName='host_cache', columnName='FIRST_SEEN', ordinalPosition=26, columnDefault='0000-00-00 00:00:00', isNullable='NO', dataType='timestamp', characterMaximumLength=0, characterOctetLength=0, numericPrecision=0, numericScale=0, datetimePrecision=0, characterSetName='null', collationName='null', columnType='timestamp', columnKey='', extra='', privileges='select,insert,update,references', columnComment='', generationExpression=''}*/
private Date firstSeen;

/**Column{tableCatalog='def', tableSchema='performance_schema', tableName='host_cache', columnName='LAST_SEEN', ordinalPosition=27, columnDefault='0000-00-00 00:00:00', isNullable='NO', dataType='timestamp', characterMaximumLength=0, characterOctetLength=0, numericPrecision=0, numericScale=0, datetimePrecision=0, characterSetName='null', collationName='null', columnType='timestamp', columnKey='', extra='', privileges='select,insert,update,references', columnComment='', generationExpression=''}*/
private Date lastSeen;

/**Column{tableCatalog='def', tableSchema='performance_schema', tableName='host_cache', columnName='FIRST_ERROR_SEEN', ordinalPosition=28, columnDefault='0000-00-00 00:00:00', isNullable='YES', dataType='timestamp', characterMaximumLength=0, characterOctetLength=0, numericPrecision=0, numericScale=0, datetimePrecision=0, characterSetName='null', collationName='null', columnType='timestamp', columnKey='', extra='', privileges='select,insert,update,references', columnComment='', generationExpression=''}*/
private Date firstErrorSeen;

/**Column{tableCatalog='def', tableSchema='performance_schema', tableName='host_cache', columnName='LAST_ERROR_SEEN', ordinalPosition=29, columnDefault='0000-00-00 00:00:00', isNullable='YES', dataType='timestamp', characterMaximumLength=0, characterOctetLength=0, numericPrecision=0, numericScale=0, datetimePrecision=0, characterSetName='null', collationName='null', columnType='timestamp', columnKey='', extra='', privileges='select,insert,update,references', columnComment='', generationExpression=''}*/
private Date lastErrorSeen;

public String getIp(){
return ip;
}

public String getHost(){
return host;
}

public Date getHostValidated(){
return hostValidated;
}

public Long getSumConnectErrors(){
return sumConnectErrors;
}

public Long getCountHostBlockedErrors(){
return countHostBlockedErrors;
}

public Long getCountNameinfoTransientErrors(){
return countNameinfoTransientErrors;
}

public Long getCountNameinfoPermanentErrors(){
return countNameinfoPermanentErrors;
}

public Long getCountFormatErrors(){
return countFormatErrors;
}

public Long getCountAddrinfoTransientErrors(){
return countAddrinfoTransientErrors;
}

public Long getCountAddrinfoPermanentErrors(){
return countAddrinfoPermanentErrors;
}

public Long getCountFcrdnsErrors(){
return countFcrdnsErrors;
}

public Long getCountHostAclErrors(){
return countHostAclErrors;
}

public Long getCountNoAuthPluginErrors(){
return countNoAuthPluginErrors;
}

public Long getCountAuthPluginErrors(){
return countAuthPluginErrors;
}

public Long getCountHandshakeErrors(){
return countHandshakeErrors;
}

public Long getCountProxyUserErrors(){
return countProxyUserErrors;
}

public Long getCountProxyUserAclErrors(){
return countProxyUserAclErrors;
}

public Long getCountAuthenticationErrors(){
return countAuthenticationErrors;
}

public Long getCountSslErrors(){
return countSslErrors;
}

public Long getCountMaxUserConnectionsErrors(){
return countMaxUserConnectionsErrors;
}

public Long getCountMaxUserConnectionsPerHourErrors(){
return countMaxUserConnectionsPerHourErrors;
}

public Long getCountDefaultDatabaseErrors(){
return countDefaultDatabaseErrors;
}

public Long getCountInitConnectErrors(){
return countInitConnectErrors;
}

public Long getCountLocalErrors(){
return countLocalErrors;
}

public Long getCountUnknownErrors(){
return countUnknownErrors;
}

public Date getFirstSeen(){
return firstSeen;
}

public Date getLastSeen(){
return lastSeen;
}

public Date getFirstErrorSeen(){
return firstErrorSeen;
}

public Date getLastErrorSeen(){
return lastErrorSeen;
}

}