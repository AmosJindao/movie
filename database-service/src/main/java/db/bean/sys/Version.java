package db.bean.sys;


/* SELECT sys_version AS sysVersion, mysql_version AS mysqlVersion FROM sys.version */
/**VIEW
*/
public class Version{
/**Column{tableCatalog='def', tableSchema='sys', tableName='version', columnName='sys_version', ordinalPosition=1, columnDefault='', isNullable='NO', dataType='varchar', characterMaximumLength=5, characterOctetLength=15, numericPrecision=0, numericScale=0, datetimePrecision=0, characterSetName='utf8', collationName='utf8_general_ci', columnType='varchar(5)', columnKey='', extra='', privileges='select,insert,update,references', columnComment='', generationExpression=''}*/
private String sysVersion;

/**Column{tableCatalog='def', tableSchema='sys', tableName='version', columnName='mysql_version', ordinalPosition=2, columnDefault='', isNullable='NO', dataType='varchar', characterMaximumLength=23, characterOctetLength=69, numericPrecision=0, numericScale=0, datetimePrecision=0, characterSetName='utf8', collationName='utf8_general_ci', columnType='varchar(23)', columnKey='', extra='', privileges='select,insert,update,references', columnComment='', generationExpression=''}*/
private String mysqlVersion;

public String getSysVersion(){
return sysVersion;
}

public String getMysqlVersion(){
return mysqlVersion;
}

}