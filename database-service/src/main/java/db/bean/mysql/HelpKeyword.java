package db.bean.mysql;


/* SELECT help_keyword_id AS helpKeywordId, name AS name FROM mysql.help_keyword */
/**help keywords
*/
public class HelpKeyword{
/**Column{tableCatalog='def', tableSchema='mysql', tableName='help_keyword', columnName='help_keyword_id', ordinalPosition=1, columnDefault='null', isNullable='NO', dataType='int', characterMaximumLength=0, characterOctetLength=0, numericPrecision=10, numericScale=0, datetimePrecision=0, characterSetName='null', collationName='null', columnType='int(10) unsigned', columnKey='PRI', extra='', privileges='select,insert,update,references', columnComment='', generationExpression=''}*/
private Integer helpKeywordId;

/**Column{tableCatalog='def', tableSchema='mysql', tableName='help_keyword', columnName='name', ordinalPosition=2, columnDefault='null', isNullable='NO', dataType='char', characterMaximumLength=64, characterOctetLength=192, numericPrecision=0, numericScale=0, datetimePrecision=0, characterSetName='utf8', collationName='utf8_general_ci', columnType='char(64)', columnKey='UNI', extra='', privileges='select,insert,update,references', columnComment='', generationExpression=''}*/
private String name;

public Integer getHelpKeywordId(){
return helpKeywordId;
}

public String getName(){
return name;
}

}