package db.bean.mysql;


/**keyword-topic relation
*/
public class HelpRelation{
/**Column{tableCatalog='def', tableSchema='mysql', tableName='help_relation', columnName='help_topic_id', ordinalPosition=1, columnDefault='null', isNullable='NO', dataType='int', characterMaximumLength=0, characterOctetLength=0, numericPrecision=10, numericScale=0, datetimePrecision=0, characterSetName='null', collationName='null', columnType='int(10) unsigned', columnKey='PRI', extra='', privileges='select,insert,update,references', columnComment='', generationExpression=''}*/
private Integer helpTopicId;

/**Column{tableCatalog='def', tableSchema='mysql', tableName='help_relation', columnName='help_keyword_id', ordinalPosition=2, columnDefault='null', isNullable='NO', dataType='int', characterMaximumLength=0, characterOctetLength=0, numericPrecision=10, numericScale=0, datetimePrecision=0, characterSetName='null', collationName='null', columnType='int(10) unsigned', columnKey='PRI', extra='', privileges='select,insert,update,references', columnComment='', generationExpression=''}*/
private Integer helpKeywordId;

public Integer getHelpTopicId(){
return helpTopicId;
}

public Integer getHelpKeywordId(){
return helpKeywordId;
}

}