package db.bean.information_schema;


/**
*/
public class InnodbFtIndexCache{
/**Column{tableCatalog='def', tableSchema='information_schema', tableName='INNODB_FT_INDEX_CACHE', columnName='WORD', ordinalPosition=1, columnDefault='', isNullable='NO', dataType='varchar', characterMaximumLength=337, characterOctetLength=1011, numericPrecision=0, numericScale=0, datetimePrecision=0, characterSetName='utf8', collationName='utf8_general_ci', columnType='varchar(337)', columnKey='', extra='', privileges='select', columnComment='', generationExpression=''}*/
private String word;

/**Column{tableCatalog='def', tableSchema='information_schema', tableName='INNODB_FT_INDEX_CACHE', columnName='FIRST_DOC_ID', ordinalPosition=2, columnDefault='0', isNullable='NO', dataType='bigint', characterMaximumLength=0, characterOctetLength=0, numericPrecision=20, numericScale=0, datetimePrecision=0, characterSetName='null', collationName='null', columnType='bigint(21) unsigned', columnKey='', extra='', privileges='select', columnComment='', generationExpression=''}*/
private Long firstDocId;

/**Column{tableCatalog='def', tableSchema='information_schema', tableName='INNODB_FT_INDEX_CACHE', columnName='LAST_DOC_ID', ordinalPosition=3, columnDefault='0', isNullable='NO', dataType='bigint', characterMaximumLength=0, characterOctetLength=0, numericPrecision=20, numericScale=0, datetimePrecision=0, characterSetName='null', collationName='null', columnType='bigint(21) unsigned', columnKey='', extra='', privileges='select', columnComment='', generationExpression=''}*/
private Long lastDocId;

/**Column{tableCatalog='def', tableSchema='information_schema', tableName='INNODB_FT_INDEX_CACHE', columnName='DOC_COUNT', ordinalPosition=4, columnDefault='0', isNullable='NO', dataType='bigint', characterMaximumLength=0, characterOctetLength=0, numericPrecision=20, numericScale=0, datetimePrecision=0, characterSetName='null', collationName='null', columnType='bigint(21) unsigned', columnKey='', extra='', privileges='select', columnComment='', generationExpression=''}*/
private Long docCount;

/**Column{tableCatalog='def', tableSchema='information_schema', tableName='INNODB_FT_INDEX_CACHE', columnName='DOC_ID', ordinalPosition=5, columnDefault='0', isNullable='NO', dataType='bigint', characterMaximumLength=0, characterOctetLength=0, numericPrecision=20, numericScale=0, datetimePrecision=0, characterSetName='null', collationName='null', columnType='bigint(21) unsigned', columnKey='', extra='', privileges='select', columnComment='', generationExpression=''}*/
private Long docId;

/**Column{tableCatalog='def', tableSchema='information_schema', tableName='INNODB_FT_INDEX_CACHE', columnName='POSITION', ordinalPosition=6, columnDefault='0', isNullable='NO', dataType='bigint', characterMaximumLength=0, characterOctetLength=0, numericPrecision=20, numericScale=0, datetimePrecision=0, characterSetName='null', collationName='null', columnType='bigint(21) unsigned', columnKey='', extra='', privileges='select', columnComment='', generationExpression=''}*/
private Long position;

public String getWord(){
return word;
}

public Long getFirstDocId(){
return firstDocId;
}

public Long getLastDocId(){
return lastDocId;
}

public Long getDocCount(){
return docCount;
}

public Long getDocId(){
return docId;
}

public Long getPosition(){
return position;
}

}