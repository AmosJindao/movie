package db.bean.sys;


/* SELECT thread_id AS threadId, ssl_version AS sslVersion, ssl_cipher AS sslCipher, ssl_sessions_reused AS sslSessionsReused FROM sys.session_ssl_status */
/**VIEW
*/
public class SessionSslStatus{
/**Column{tableCatalog='def', tableSchema='sys', tableName='session_ssl_status', columnName='thread_id', ordinalPosition=1, columnDefault='null', isNullable='NO', dataType='bigint', characterMaximumLength=0, characterOctetLength=0, numericPrecision=20, numericScale=0, datetimePrecision=0, characterSetName='null', collationName='null', columnType='bigint(20) unsigned', columnKey='', extra='', privileges='select,insert,update,references', columnComment='', generationExpression=''}*/
private Long threadId;

/**Column{tableCatalog='def', tableSchema='sys', tableName='session_ssl_status', columnName='ssl_version', ordinalPosition=2, columnDefault='null', isNullable='YES', dataType='varchar', characterMaximumLength=1024, characterOctetLength=3072, numericPrecision=0, numericScale=0, datetimePrecision=0, characterSetName='utf8', collationName='utf8_general_ci', columnType='varchar(1024)', columnKey='', extra='', privileges='select,insert,update,references', columnComment='', generationExpression=''}*/
private String sslVersion;

/**Column{tableCatalog='def', tableSchema='sys', tableName='session_ssl_status', columnName='ssl_cipher', ordinalPosition=3, columnDefault='null', isNullable='YES', dataType='varchar', characterMaximumLength=1024, characterOctetLength=3072, numericPrecision=0, numericScale=0, datetimePrecision=0, characterSetName='utf8', collationName='utf8_general_ci', columnType='varchar(1024)', columnKey='', extra='', privileges='select,insert,update,references', columnComment='', generationExpression=''}*/
private String sslCipher;

/**Column{tableCatalog='def', tableSchema='sys', tableName='session_ssl_status', columnName='ssl_sessions_reused', ordinalPosition=4, columnDefault='null', isNullable='YES', dataType='varchar', characterMaximumLength=1024, characterOctetLength=3072, numericPrecision=0, numericScale=0, datetimePrecision=0, characterSetName='utf8', collationName='utf8_general_ci', columnType='varchar(1024)', columnKey='', extra='', privileges='select,insert,update,references', columnComment='', generationExpression=''}*/
private String sslSessionsReused;

public Long getThreadId(){
return threadId;
}

public String getSslVersion(){
return sslVersion;
}

public String getSslCipher(){
return sslCipher;
}

public String getSslSessionsReused(){
return sslSessionsReused;
}

}