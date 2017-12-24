package db.bean.information_schema;


/* SELECT COLLATION_NAME AS collationName, CHARACTER_SET_NAME AS characterSetName FROM information_schema.COLLATION_CHARACTER_SET_APPLICABILITY */
/**
*/
public class CollationCharacterSetApplicability{
/**Column{tableCatalog='def', tableSchema='information_schema', tableName='COLLATION_CHARACTER_SET_APPLICABILITY', columnName='COLLATION_NAME', ordinalPosition=1, columnDefault='', isNullable='NO', dataType='varchar', characterMaximumLength=32, characterOctetLength=96, numericPrecision=0, numericScale=0, datetimePrecision=0, characterSetName='utf8', collationName='utf8_general_ci', columnType='varchar(32)', columnKey='', extra='', privileges='select', columnComment='', generationExpression=''}*/
private String collationName;

/**Column{tableCatalog='def', tableSchema='information_schema', tableName='COLLATION_CHARACTER_SET_APPLICABILITY', columnName='CHARACTER_SET_NAME', ordinalPosition=2, columnDefault='', isNullable='NO', dataType='varchar', characterMaximumLength=32, characterOctetLength=96, numericPrecision=0, numericScale=0, datetimePrecision=0, characterSetName='utf8', collationName='utf8_general_ci', columnType='varchar(32)', columnKey='', extra='', privileges='select', columnComment='', generationExpression=''}*/
private String characterSetName;

public String getCollationName(){
return collationName;
}

public String getCharacterSetName(){
return characterSetName;
}

}