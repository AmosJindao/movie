package db.bean.information_schema;


/* SELECT COLLATION_NAME AS collationName, CHARACTER_SET_NAME AS characterSetName, ID AS id, IS_DEFAULT AS isDefault, IS_COMPILED AS isCompiled, SORTLEN AS sortlen FROM information_schema.COLLATIONS */
/**
*/
public class Collations{
/**Column{tableCatalog='def', tableSchema='information_schema', tableName='COLLATIONS', columnName='COLLATION_NAME', ordinalPosition=1, columnDefault='', isNullable='NO', dataType='varchar', characterMaximumLength=32, characterOctetLength=96, numericPrecision=0, numericScale=0, datetimePrecision=0, characterSetName='utf8', collationName='utf8_general_ci', columnType='varchar(32)', columnKey='', extra='', privileges='select', columnComment='', generationExpression=''}*/
private String collationName;

/**Column{tableCatalog='def', tableSchema='information_schema', tableName='COLLATIONS', columnName='CHARACTER_SET_NAME', ordinalPosition=2, columnDefault='', isNullable='NO', dataType='varchar', characterMaximumLength=32, characterOctetLength=96, numericPrecision=0, numericScale=0, datetimePrecision=0, characterSetName='utf8', collationName='utf8_general_ci', columnType='varchar(32)', columnKey='', extra='', privileges='select', columnComment='', generationExpression=''}*/
private String characterSetName;

/**Column{tableCatalog='def', tableSchema='information_schema', tableName='COLLATIONS', columnName='ID', ordinalPosition=3, columnDefault='0', isNullable='NO', dataType='bigint', characterMaximumLength=0, characterOctetLength=0, numericPrecision=19, numericScale=0, datetimePrecision=0, characterSetName='null', collationName='null', columnType='bigint(11)', columnKey='', extra='', privileges='select', columnComment='', generationExpression=''}*/
private Long id;

/**Column{tableCatalog='def', tableSchema='information_schema', tableName='COLLATIONS', columnName='IS_DEFAULT', ordinalPosition=4, columnDefault='', isNullable='NO', dataType='varchar', characterMaximumLength=3, characterOctetLength=9, numericPrecision=0, numericScale=0, datetimePrecision=0, characterSetName='utf8', collationName='utf8_general_ci', columnType='varchar(3)', columnKey='', extra='', privileges='select', columnComment='', generationExpression=''}*/
private String isDefault;

/**Column{tableCatalog='def', tableSchema='information_schema', tableName='COLLATIONS', columnName='IS_COMPILED', ordinalPosition=5, columnDefault='', isNullable='NO', dataType='varchar', characterMaximumLength=3, characterOctetLength=9, numericPrecision=0, numericScale=0, datetimePrecision=0, characterSetName='utf8', collationName='utf8_general_ci', columnType='varchar(3)', columnKey='', extra='', privileges='select', columnComment='', generationExpression=''}*/
private String isCompiled;

/**Column{tableCatalog='def', tableSchema='information_schema', tableName='COLLATIONS', columnName='SORTLEN', ordinalPosition=6, columnDefault='0', isNullable='NO', dataType='bigint', characterMaximumLength=0, characterOctetLength=0, numericPrecision=19, numericScale=0, datetimePrecision=0, characterSetName='null', collationName='null', columnType='bigint(3)', columnKey='', extra='', privileges='select', columnComment='', generationExpression=''}*/
private Long sortlen;

public String getCollationName(){
return collationName;
}

public String getCharacterSetName(){
return characterSetName;
}

public Long getId(){
return id;
}

public String getIsDefault(){
return isDefault;
}

public String getIsCompiled(){
return isCompiled;
}

public Long getSortlen(){
return sortlen;
}

}