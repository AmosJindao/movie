package db.bean.tests;


/**this is a test
*/
public class Test{
/**Column{tableCatalog='def', tableSchema='tests', tableName='test', columnName='id', ordinalPosition=1, columnDefault='null', isNullable='NO', dataType='int', characterMaximumLength=0, characterOctetLength=0, numericPrecision=10, numericScale=0, datetimePrecision=0, characterSetName='null', collationName='null', columnType='int(11)', columnKey='PRI', extra='', privileges='select,insert,update,references', columnComment='primary key', generationExpression=''}*/
private Integer id;

/**Column{tableCatalog='def', tableSchema='tests', tableName='test', columnName='name', ordinalPosition=2, columnDefault='null', isNullable='YES', dataType='varchar', characterMaximumLength=45, characterOctetLength=135, numericPrecision=0, numericScale=0, datetimePrecision=0, characterSetName='utf8', collationName='utf8_bin', columnType='varchar(45)', columnKey='', extra='', privileges='select,insert,update,references', columnComment='table name', generationExpression=''}*/
private String name;

public Integer getId(){
return id;
}

public String getName(){
return name;
}

}