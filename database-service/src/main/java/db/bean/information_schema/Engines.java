package db.bean.information_schema;


/**
*/
public class Engines{
/**Column{tableCatalog='def', tableSchema='information_schema', tableName='ENGINES', columnName='ENGINE', ordinalPosition=1, columnDefault='', isNullable='NO', dataType='varchar', characterMaximumLength=64, characterOctetLength=192, numericPrecision=0, numericScale=0, datetimePrecision=0, characterSetName='utf8', collationName='utf8_general_ci', columnType='varchar(64)', columnKey='', extra='', privileges='select', columnComment='', generationExpression=''}*/
private String engine;

/**Column{tableCatalog='def', tableSchema='information_schema', tableName='ENGINES', columnName='SUPPORT', ordinalPosition=2, columnDefault='', isNullable='NO', dataType='varchar', characterMaximumLength=8, characterOctetLength=24, numericPrecision=0, numericScale=0, datetimePrecision=0, characterSetName='utf8', collationName='utf8_general_ci', columnType='varchar(8)', columnKey='', extra='', privileges='select', columnComment='', generationExpression=''}*/
private String support;

/**Column{tableCatalog='def', tableSchema='information_schema', tableName='ENGINES', columnName='COMMENT', ordinalPosition=3, columnDefault='', isNullable='NO', dataType='varchar', characterMaximumLength=80, characterOctetLength=240, numericPrecision=0, numericScale=0, datetimePrecision=0, characterSetName='utf8', collationName='utf8_general_ci', columnType='varchar(80)', columnKey='', extra='', privileges='select', columnComment='', generationExpression=''}*/
private String comment;

/**Column{tableCatalog='def', tableSchema='information_schema', tableName='ENGINES', columnName='TRANSACTIONS', ordinalPosition=4, columnDefault='null', isNullable='YES', dataType='varchar', characterMaximumLength=3, characterOctetLength=9, numericPrecision=0, numericScale=0, datetimePrecision=0, characterSetName='utf8', collationName='utf8_general_ci', columnType='varchar(3)', columnKey='', extra='', privileges='select', columnComment='', generationExpression=''}*/
private String transactions;

/**Column{tableCatalog='def', tableSchema='information_schema', tableName='ENGINES', columnName='XA', ordinalPosition=5, columnDefault='null', isNullable='YES', dataType='varchar', characterMaximumLength=3, characterOctetLength=9, numericPrecision=0, numericScale=0, datetimePrecision=0, characterSetName='utf8', collationName='utf8_general_ci', columnType='varchar(3)', columnKey='', extra='', privileges='select', columnComment='', generationExpression=''}*/
private String xa;

/**Column{tableCatalog='def', tableSchema='information_schema', tableName='ENGINES', columnName='SAVEPOINTS', ordinalPosition=6, columnDefault='null', isNullable='YES', dataType='varchar', characterMaximumLength=3, characterOctetLength=9, numericPrecision=0, numericScale=0, datetimePrecision=0, characterSetName='utf8', collationName='utf8_general_ci', columnType='varchar(3)', columnKey='', extra='', privileges='select', columnComment='', generationExpression=''}*/
private String savepoints;

public String getEngine(){
return engine;
}

public String getSupport(){
return support;
}

public String getComment(){
return comment;
}

public String getTransactions(){
return transactions;
}

public String getXa(){
return xa;
}

public String getSavepoints(){
return savepoints;
}

}