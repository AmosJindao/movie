package db.bean.performance_schema;


/**
*/
public class FileInstances{
/**Column{tableCatalog='def', tableSchema='performance_schema', tableName='file_instances', columnName='FILE_NAME', ordinalPosition=1, columnDefault='null', isNullable='NO', dataType='varchar', characterMaximumLength=512, characterOctetLength=1536, numericPrecision=0, numericScale=0, datetimePrecision=0, characterSetName='utf8', collationName='utf8_general_ci', columnType='varchar(512)', columnKey='', extra='', privileges='select,insert,update,references', columnComment='', generationExpression=''}*/
private String fileName;

/**Column{tableCatalog='def', tableSchema='performance_schema', tableName='file_instances', columnName='EVENT_NAME', ordinalPosition=2, columnDefault='null', isNullable='NO', dataType='varchar', characterMaximumLength=128, characterOctetLength=384, numericPrecision=0, numericScale=0, datetimePrecision=0, characterSetName='utf8', collationName='utf8_general_ci', columnType='varchar(128)', columnKey='', extra='', privileges='select,insert,update,references', columnComment='', generationExpression=''}*/
private String eventName;

/**Column{tableCatalog='def', tableSchema='performance_schema', tableName='file_instances', columnName='OPEN_COUNT', ordinalPosition=3, columnDefault='null', isNullable='NO', dataType='int', characterMaximumLength=0, characterOctetLength=0, numericPrecision=10, numericScale=0, datetimePrecision=0, characterSetName='null', collationName='null', columnType='int(10) unsigned', columnKey='', extra='', privileges='select,insert,update,references', columnComment='', generationExpression=''}*/
private Integer openCount;

public String getFileName(){
return fileName;
}

public String getEventName(){
return eventName;
}

public Integer getOpenCount(){
return openCount;
}

}