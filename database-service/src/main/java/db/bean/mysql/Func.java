package db.bean.mysql;

import java.util.Date;

/* SELECT name AS name, ret AS ret, dl AS dl, type AS type FROM mysql.func */
/**User defined functions
*/
public class Func{
/**Column{tableCatalog='def', tableSchema='mysql', tableName='func', columnName='name', ordinalPosition=1, columnDefault='', isNullable='NO', dataType='char', characterMaximumLength=64, characterOctetLength=192, numericPrecision=0, numericScale=0, datetimePrecision=0, characterSetName='utf8', collationName='utf8_bin', columnType='char(64)', columnKey='PRI', extra='', privileges='select,insert,update,references', columnComment='', generationExpression=''}*/
private String name;

/**Column{tableCatalog='def', tableSchema='mysql', tableName='func', columnName='ret', ordinalPosition=2, columnDefault='0', isNullable='NO', dataType='tinyint', characterMaximumLength=0, characterOctetLength=0, numericPrecision=3, numericScale=0, datetimePrecision=0, characterSetName='null', collationName='null', columnType='tinyint(1)', columnKey='', extra='', privileges='select,insert,update,references', columnComment='', generationExpression=''}*/
private Integer ret;

/**Column{tableCatalog='def', tableSchema='mysql', tableName='func', columnName='dl', ordinalPosition=3, columnDefault='', isNullable='NO', dataType='char', characterMaximumLength=128, characterOctetLength=384, numericPrecision=0, numericScale=0, datetimePrecision=0, characterSetName='utf8', collationName='utf8_bin', columnType='char(128)', columnKey='', extra='', privileges='select,insert,update,references', columnComment='', generationExpression=''}*/
private String dl;

/**Column{tableCatalog='def', tableSchema='mysql', tableName='func', columnName='type', ordinalPosition=4, columnDefault='null', isNullable='NO', dataType='enum', characterMaximumLength=9, characterOctetLength=27, numericPrecision=0, numericScale=0, datetimePrecision=0, characterSetName='utf8', collationName='utf8_general_ci', columnType='enum('function','aggregate')', columnKey='', extra='', privileges='select,insert,update,references', columnComment='', generationExpression=''}*/
private Date type;

public String getName(){
return name;
}

public Integer getRet(){
return ret;
}

public String getDl(){
return dl;
}

public Date getType(){
return type;
}

}