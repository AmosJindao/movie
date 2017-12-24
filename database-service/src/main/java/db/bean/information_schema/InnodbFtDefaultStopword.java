package db.bean.information_schema;


/* SELECT value AS value FROM information_schema.INNODB_FT_DEFAULT_STOPWORD */
/**
*/
public class InnodbFtDefaultStopword{
/**Column{tableCatalog='def', tableSchema='information_schema', tableName='INNODB_FT_DEFAULT_STOPWORD', columnName='value', ordinalPosition=1, columnDefault='', isNullable='NO', dataType='varchar', characterMaximumLength=18, characterOctetLength=54, numericPrecision=0, numericScale=0, datetimePrecision=0, characterSetName='utf8', collationName='utf8_general_ci', columnType='varchar(18)', columnKey='', extra='', privileges='select', columnComment='', generationExpression=''}*/
private String value;

public String getValue(){
return value;
}

}