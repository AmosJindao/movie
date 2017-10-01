package db.bean.mysql;


/**help categories
*/
public class HelpCategory{
/**Column{tableCatalog='def', tableSchema='mysql', tableName='help_category', columnName='help_category_id', ordinalPosition=1, columnDefault='null', isNullable='NO', dataType='smallint', characterMaximumLength=0, characterOctetLength=0, numericPrecision=5, numericScale=0, datetimePrecision=0, characterSetName='null', collationName='null', columnType='smallint(5) unsigned', columnKey='PRI', extra='', privileges='select,insert,update,references', columnComment='', generationExpression=''}*/
private Integer helpCategoryId;

/**Column{tableCatalog='def', tableSchema='mysql', tableName='help_category', columnName='name', ordinalPosition=2, columnDefault='null', isNullable='NO', dataType='char', characterMaximumLength=64, characterOctetLength=192, numericPrecision=0, numericScale=0, datetimePrecision=0, characterSetName='utf8', collationName='utf8_general_ci', columnType='char(64)', columnKey='UNI', extra='', privileges='select,insert,update,references', columnComment='', generationExpression=''}*/
private String name;

/**Column{tableCatalog='def', tableSchema='mysql', tableName='help_category', columnName='parent_category_id', ordinalPosition=3, columnDefault='null', isNullable='YES', dataType='smallint', characterMaximumLength=0, characterOctetLength=0, numericPrecision=5, numericScale=0, datetimePrecision=0, characterSetName='null', collationName='null', columnType='smallint(5) unsigned', columnKey='', extra='', privileges='select,insert,update,references', columnComment='', generationExpression=''}*/
private Integer parentCategoryId;

/**Column{tableCatalog='def', tableSchema='mysql', tableName='help_category', columnName='url', ordinalPosition=4, columnDefault='null', isNullable='NO', dataType='text', characterMaximumLength=65535, characterOctetLength=65535, numericPrecision=0, numericScale=0, datetimePrecision=0, characterSetName='utf8', collationName='utf8_general_ci', columnType='text', columnKey='', extra='', privileges='select,insert,update,references', columnComment='', generationExpression=''}*/
private String url;

public Integer getHelpCategoryId(){
return helpCategoryId;
}

public String getName(){
return name;
}

public Integer getParentCategoryId(){
return parentCategoryId;
}

public String getUrl(){
return url;
}

}