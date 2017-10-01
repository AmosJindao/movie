package db.bean.information_schema;


/**
*/
public class InnodbSysDatafiles{
/**Column{tableCatalog='def', tableSchema='information_schema', tableName='INNODB_SYS_DATAFILES', columnName='SPACE', ordinalPosition=1, columnDefault='0', isNullable='NO', dataType='int', characterMaximumLength=0, characterOctetLength=0, numericPrecision=10, numericScale=0, datetimePrecision=0, characterSetName='null', collationName='null', columnType='int(11) unsigned', columnKey='', extra='', privileges='select', columnComment='', generationExpression=''}*/
private Integer space;

/**Column{tableCatalog='def', tableSchema='information_schema', tableName='INNODB_SYS_DATAFILES', columnName='PATH', ordinalPosition=2, columnDefault='', isNullable='NO', dataType='varchar', characterMaximumLength=4000, characterOctetLength=12000, numericPrecision=0, numericScale=0, datetimePrecision=0, characterSetName='utf8', collationName='utf8_general_ci', columnType='varchar(4000)', columnKey='', extra='', privileges='select', columnComment='', generationExpression=''}*/
private String path;

public Integer getSpace(){
return space;
}

public String getPath(){
return path;
}

}