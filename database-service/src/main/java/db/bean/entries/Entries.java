package db.bean.entries;


/* SELECT word AS word, wordtype AS wordtype, definition AS definition FROM entries.entries */
/**
*/
public class Entries{
/**Column{tableCatalog='def', tableSchema='entries', tableName='entries', columnName='word', ordinalPosition=1, columnDefault='null', isNullable='NO', dataType='varchar', characterMaximumLength=25, characterOctetLength=25, numericPrecision=0, numericScale=0, datetimePrecision=0, characterSetName='latin1', collationName='latin1_swedish_ci', columnType='varchar(25)', columnKey='', extra='', privileges='select,insert,update,references', columnComment='', generationExpression=''}*/
private String word;

/**Column{tableCatalog='def', tableSchema='entries', tableName='entries', columnName='wordtype', ordinalPosition=2, columnDefault='null', isNullable='NO', dataType='varchar', characterMaximumLength=20, characterOctetLength=20, numericPrecision=0, numericScale=0, datetimePrecision=0, characterSetName='latin1', collationName='latin1_swedish_ci', columnType='varchar(20)', columnKey='', extra='', privileges='select,insert,update,references', columnComment='', generationExpression=''}*/
private String wordtype;

/**Column{tableCatalog='def', tableSchema='entries', tableName='entries', columnName='definition', ordinalPosition=3, columnDefault='null', isNullable='NO', dataType='text', characterMaximumLength=65535, characterOctetLength=65535, numericPrecision=0, numericScale=0, datetimePrecision=0, characterSetName='latin1', collationName='latin1_swedish_ci', columnType='text', columnKey='', extra='', privileges='select,insert,update,references', columnComment='', generationExpression=''}*/
private String definition;

public String getWord(){
return word;
}

public String getWordtype(){
return wordtype;
}

public String getDefinition(){
return definition;
}

}