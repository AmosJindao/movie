package db.bean.information_schema;


/**
*/
public class CharacterSets{
/**Column{tableCatalog='def', tableSchema='information_schema', tableName='CHARACTER_SETS', columnName='CHARACTER_SET_NAME', ordinalPosition=1, columnDefault='', isNullable='NO', dataType='varchar', characterMaximumLength=32, characterOctetLength=96, numericPrecision=0, numericScale=0, datetimePrecision=0, characterSetName='utf8', collationName='utf8_general_ci', columnType='varchar(32)', columnKey='', extra='', privileges='select', columnComment='', generationExpression=''}*/
private String characterSetName;

/**Column{tableCatalog='def', tableSchema='information_schema', tableName='CHARACTER_SETS', columnName='DEFAULT_COLLATE_NAME', ordinalPosition=2, columnDefault='', isNullable='NO', dataType='varchar', characterMaximumLength=32, characterOctetLength=96, numericPrecision=0, numericScale=0, datetimePrecision=0, characterSetName='utf8', collationName='utf8_general_ci', columnType='varchar(32)', columnKey='', extra='', privileges='select', columnComment='', generationExpression=''}*/
private String defaultCollateName;

/**Column{tableCatalog='def', tableSchema='information_schema', tableName='CHARACTER_SETS', columnName='DESCRIPTION', ordinalPosition=3, columnDefault='', isNullable='NO', dataType='varchar', characterMaximumLength=60, characterOctetLength=180, numericPrecision=0, numericScale=0, datetimePrecision=0, characterSetName='utf8', collationName='utf8_general_ci', columnType='varchar(60)', columnKey='', extra='', privileges='select', columnComment='', generationExpression=''}*/
private String description;

/**Column{tableCatalog='def', tableSchema='information_schema', tableName='CHARACTER_SETS', columnName='MAXLEN', ordinalPosition=4, columnDefault='0', isNullable='NO', dataType='bigint', characterMaximumLength=0, characterOctetLength=0, numericPrecision=19, numericScale=0, datetimePrecision=0, characterSetName='null', collationName='null', columnType='bigint(3)', columnKey='', extra='', privileges='select', columnComment='', generationExpression=''}*/
private Long maxlen;

public String getCharacterSetName(){
return characterSetName;
}

public String getDefaultCollateName(){
return defaultCollateName;
}

public String getDescription(){
return description;
}

public Long getMaxlen(){
return maxlen;
}

}