package db.bean.information_schema;


/**
*/
public class InnodbSysForeign{
/**Column{tableCatalog='def', tableSchema='information_schema', tableName='INNODB_SYS_FOREIGN', columnName='ID', ordinalPosition=1, columnDefault='', isNullable='NO', dataType='varchar', characterMaximumLength=193, characterOctetLength=579, numericPrecision=0, numericScale=0, datetimePrecision=0, characterSetName='utf8', collationName='utf8_general_ci', columnType='varchar(193)', columnKey='', extra='', privileges='select', columnComment='', generationExpression=''}*/
private String id;

/**Column{tableCatalog='def', tableSchema='information_schema', tableName='INNODB_SYS_FOREIGN', columnName='FOR_NAME', ordinalPosition=2, columnDefault='', isNullable='NO', dataType='varchar', characterMaximumLength=193, characterOctetLength=579, numericPrecision=0, numericScale=0, datetimePrecision=0, characterSetName='utf8', collationName='utf8_general_ci', columnType='varchar(193)', columnKey='', extra='', privileges='select', columnComment='', generationExpression=''}*/
private String forName;

/**Column{tableCatalog='def', tableSchema='information_schema', tableName='INNODB_SYS_FOREIGN', columnName='REF_NAME', ordinalPosition=3, columnDefault='', isNullable='NO', dataType='varchar', characterMaximumLength=193, characterOctetLength=579, numericPrecision=0, numericScale=0, datetimePrecision=0, characterSetName='utf8', collationName='utf8_general_ci', columnType='varchar(193)', columnKey='', extra='', privileges='select', columnComment='', generationExpression=''}*/
private String refName;

/**Column{tableCatalog='def', tableSchema='information_schema', tableName='INNODB_SYS_FOREIGN', columnName='N_COLS', ordinalPosition=4, columnDefault='0', isNullable='NO', dataType='int', characterMaximumLength=0, characterOctetLength=0, numericPrecision=10, numericScale=0, datetimePrecision=0, characterSetName='null', collationName='null', columnType='int(11) unsigned', columnKey='', extra='', privileges='select', columnComment='', generationExpression=''}*/
private Integer nCols;

/**Column{tableCatalog='def', tableSchema='information_schema', tableName='INNODB_SYS_FOREIGN', columnName='TYPE', ordinalPosition=5, columnDefault='0', isNullable='NO', dataType='int', characterMaximumLength=0, characterOctetLength=0, numericPrecision=10, numericScale=0, datetimePrecision=0, characterSetName='null', collationName='null', columnType='int(11) unsigned', columnKey='', extra='', privileges='select', columnComment='', generationExpression=''}*/
private Integer type;

public String getId(){
return id;
}

public String getForName(){
return forName;
}

public String getRefName(){
return refName;
}

public Integer getNCols(){
return nCols;
}

public Integer getType(){
return type;
}

}