package db.bean.sys;


/**VIEW
*/
public class LatestFileIo{
/**Column{tableCatalog='def', tableSchema='sys', tableName='latest_file_io', columnName='thread', ordinalPosition=1, columnDefault='null', isNullable='YES', dataType='varchar', characterMaximumLength=149, characterOctetLength=447, numericPrecision=0, numericScale=0, datetimePrecision=0, characterSetName='utf8', collationName='utf8_general_ci', columnType='varchar(149)', columnKey='', extra='', privileges='select,insert,update,references', columnComment='', generationExpression=''}*/
private String thread;

/**Column{tableCatalog='def', tableSchema='sys', tableName='latest_file_io', columnName='file', ordinalPosition=2, columnDefault='null', isNullable='YES', dataType='varchar', characterMaximumLength=512, characterOctetLength=1536, numericPrecision=0, numericScale=0, datetimePrecision=0, characterSetName='utf8', collationName='utf8_general_ci', columnType='varchar(512)', columnKey='', extra='', privileges='select,insert,update,references', columnComment='', generationExpression=''}*/
private String file;

/**Column{tableCatalog='def', tableSchema='sys', tableName='latest_file_io', columnName='latency', ordinalPosition=3, columnDefault='null', isNullable='YES', dataType='text', characterMaximumLength=65535, characterOctetLength=65535, numericPrecision=0, numericScale=0, datetimePrecision=0, characterSetName='utf8', collationName='utf8_general_ci', columnType='text', columnKey='', extra='', privileges='select,insert,update,references', columnComment='', generationExpression=''}*/
private String latency;

/**Column{tableCatalog='def', tableSchema='sys', tableName='latest_file_io', columnName='operation', ordinalPosition=4, columnDefault='null', isNullable='NO', dataType='varchar', characterMaximumLength=32, characterOctetLength=96, numericPrecision=0, numericScale=0, datetimePrecision=0, characterSetName='utf8', collationName='utf8_general_ci', columnType='varchar(32)', columnKey='', extra='', privileges='select,insert,update,references', columnComment='', generationExpression=''}*/
private String operation;

/**Column{tableCatalog='def', tableSchema='sys', tableName='latest_file_io', columnName='requested', ordinalPosition=5, columnDefault='null', isNullable='YES', dataType='text', characterMaximumLength=65535, characterOctetLength=65535, numericPrecision=0, numericScale=0, datetimePrecision=0, characterSetName='utf8', collationName='utf8_general_ci', columnType='text', columnKey='', extra='', privileges='select,insert,update,references', columnComment='', generationExpression=''}*/
private String requested;

public String getThread(){
return thread;
}

public String getFile(){
return file;
}

public String getLatency(){
return latency;
}

public String getOperation(){
return operation;
}

public String getRequested(){
return requested;
}

}