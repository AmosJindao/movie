package db.bean.information_schema;


/**
*/
public class InnodbFtConfig{
/**Column{tableCatalog='def', tableSchema='information_schema', tableName='INNODB_FT_CONFIG', columnName='KEY', ordinalPosition=1, columnDefault='', isNullable='NO', dataType='varchar', characterMaximumLength=193, characterOctetLength=579, numericPrecision=0, numericScale=0, datetimePrecision=0, characterSetName='utf8', collationName='utf8_general_ci', columnType='varchar(193)', columnKey='', extra='', privileges='select', columnComment='', generationExpression=''}*/
private String key;

/**Column{tableCatalog='def', tableSchema='information_schema', tableName='INNODB_FT_CONFIG', columnName='VALUE', ordinalPosition=2, columnDefault='', isNullable='NO', dataType='varchar', characterMaximumLength=193, characterOctetLength=579, numericPrecision=0, numericScale=0, datetimePrecision=0, characterSetName='utf8', collationName='utf8_general_ci', columnType='varchar(193)', columnKey='', extra='', privileges='select', columnComment='', generationExpression=''}*/
private String value;

public String getKey(){
return key;
}

public String getValue(){
return value;
}

}