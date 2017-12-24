package db.bean.mysql;


/* SELECT name AS name, dl AS dl FROM mysql.plugin */
/**MySQL plugins
*/
public class Plugin{
/**Column{tableCatalog='def', tableSchema='mysql', tableName='plugin', columnName='name', ordinalPosition=1, columnDefault='', isNullable='NO', dataType='varchar', characterMaximumLength=64, characterOctetLength=192, numericPrecision=0, numericScale=0, datetimePrecision=0, characterSetName='utf8', collationName='utf8_general_ci', columnType='varchar(64)', columnKey='PRI', extra='', privileges='select,insert,update,references', columnComment='', generationExpression=''}*/
private String name;

/**Column{tableCatalog='def', tableSchema='mysql', tableName='plugin', columnName='dl', ordinalPosition=2, columnDefault='', isNullable='NO', dataType='varchar', characterMaximumLength=128, characterOctetLength=384, numericPrecision=0, numericScale=0, datetimePrecision=0, characterSetName='utf8', collationName='utf8_general_ci', columnType='varchar(128)', columnKey='', extra='', privileges='select,insert,update,references', columnComment='', generationExpression=''}*/
private String dl;

public String getName(){
return name;
}

public String getDl(){
return dl;
}

}