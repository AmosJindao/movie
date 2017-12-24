package db.bean.sys;


/* SELECT user AS user, ios AS ios, io_latency AS ioLatency FROM sys.user_summary_by_file_io */
/**VIEW
*/
public class UserSummaryByFileIo{
/**Column{tableCatalog='def', tableSchema='sys', tableName='user_summary_by_file_io', columnName='user', ordinalPosition=1, columnDefault='null', isNullable='YES', dataType='varchar', characterMaximumLength=32, characterOctetLength=96, numericPrecision=0, numericScale=0, datetimePrecision=0, characterSetName='utf8', collationName='utf8_bin', columnType='varchar(32)', columnKey='', extra='', privileges='select,insert,update,references', columnComment='', generationExpression=''}*/
private String user;

/**Column{tableCatalog='def', tableSchema='sys', tableName='user_summary_by_file_io', columnName='ios', ordinalPosition=2, columnDefault='null', isNullable='YES', dataType='decimal', characterMaximumLength=0, characterOctetLength=0, numericPrecision=42, numericScale=0, datetimePrecision=0, characterSetName='null', collationName='null', columnType='decimal(42,0)', columnKey='', extra='', privileges='select,insert,update,references', columnComment='', generationExpression=''}*/
private Double ios;

/**Column{tableCatalog='def', tableSchema='sys', tableName='user_summary_by_file_io', columnName='io_latency', ordinalPosition=3, columnDefault='null', isNullable='YES', dataType='text', characterMaximumLength=65535, characterOctetLength=65535, numericPrecision=0, numericScale=0, datetimePrecision=0, characterSetName='utf8', collationName='utf8_general_ci', columnType='text', columnKey='', extra='', privileges='select,insert,update,references', columnComment='', generationExpression=''}*/
private String ioLatency;

public String getUser(){
return user;
}

public Double getIos(){
return ios;
}

public String getIoLatency(){
return ioLatency;
}

}