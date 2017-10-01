package db.bean.mysql;


/**help topics
*/
public class HelpTopic{
/**Column{tableCatalog='def', tableSchema='mysql', tableName='help_topic', columnName='help_topic_id', ordinalPosition=1, columnDefault='null', isNullable='NO', dataType='int', characterMaximumLength=0, characterOctetLength=0, numericPrecision=10, numericScale=0, datetimePrecision=0, characterSetName='null', collationName='null', columnType='int(10) unsigned', columnKey='PRI', extra='', privileges='select,insert,update,references', columnComment='', generationExpression=''}*/
private Integer helpTopicId;

/**Column{tableCatalog='def', tableSchema='mysql', tableName='help_topic', columnName='name', ordinalPosition=2, columnDefault='null', isNullable='NO', dataType='char', characterMaximumLength=64, characterOctetLength=192, numericPrecision=0, numericScale=0, datetimePrecision=0, characterSetName='utf8', collationName='utf8_general_ci', columnType='char(64)', columnKey='UNI', extra='', privileges='select,insert,update,references', columnComment='', generationExpression=''}*/
private String name;

/**Column{tableCatalog='def', tableSchema='mysql', tableName='help_topic', columnName='help_category_id', ordinalPosition=3, columnDefault='null', isNullable='NO', dataType='smallint', characterMaximumLength=0, characterOctetLength=0, numericPrecision=5, numericScale=0, datetimePrecision=0, characterSetName='null', collationName='null', columnType='smallint(5) unsigned', columnKey='', extra='', privileges='select,insert,update,references', columnComment='', generationExpression=''}*/
private Integer helpCategoryId;

/**Column{tableCatalog='def', tableSchema='mysql', tableName='help_topic', columnName='description', ordinalPosition=4, columnDefault='null', isNullable='NO', dataType='text', characterMaximumLength=65535, characterOctetLength=65535, numericPrecision=0, numericScale=0, datetimePrecision=0, characterSetName='utf8', collationName='utf8_general_ci', columnType='text', columnKey='', extra='', privileges='select,insert,update,references', columnComment='', generationExpression=''}*/
private String description;

/**Column{tableCatalog='def', tableSchema='mysql', tableName='help_topic', columnName='example', ordinalPosition=5, columnDefault='null', isNullable='NO', dataType='text', characterMaximumLength=65535, characterOctetLength=65535, numericPrecision=0, numericScale=0, datetimePrecision=0, characterSetName='utf8', collationName='utf8_general_ci', columnType='text', columnKey='', extra='', privileges='select,insert,update,references', columnComment='', generationExpression=''}*/
private String example;

/**Column{tableCatalog='def', tableSchema='mysql', tableName='help_topic', columnName='url', ordinalPosition=6, columnDefault='null', isNullable='NO', dataType='text', characterMaximumLength=65535, characterOctetLength=65535, numericPrecision=0, numericScale=0, datetimePrecision=0, characterSetName='utf8', collationName='utf8_general_ci', columnType='text', columnKey='', extra='', privileges='select,insert,update,references', columnComment='', generationExpression=''}*/
private String url;

public Integer getHelpTopicId(){
return helpTopicId;
}

public String getName(){
return name;
}

public Integer getHelpCategoryId(){
return helpCategoryId;
}

public String getDescription(){
return description;
}

public String getExample(){
return example;
}

public String getUrl(){
return url;
}

}