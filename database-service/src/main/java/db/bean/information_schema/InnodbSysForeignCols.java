package db.bean.information_schema;


/**
*/
public class InnodbSysForeignCols{
/**Column{tableCatalog='def', tableSchema='information_schema', tableName='INNODB_SYS_FOREIGN_COLS', columnName='ID', ordinalPosition=1, columnDefault='', isNullable='NO', dataType='varchar', characterMaximumLength=193, characterOctetLength=579, numericPrecision=0, numericScale=0, datetimePrecision=0, characterSetName='utf8', collationName='utf8_general_ci', columnType='varchar(193)', columnKey='', extra='', privileges='select', columnComment='', generationExpression=''}*/
private String id;

/**Column{tableCatalog='def', tableSchema='information_schema', tableName='INNODB_SYS_FOREIGN_COLS', columnName='FOR_COL_NAME', ordinalPosition=2, columnDefault='', isNullable='NO', dataType='varchar', characterMaximumLength=193, characterOctetLength=579, numericPrecision=0, numericScale=0, datetimePrecision=0, characterSetName='utf8', collationName='utf8_general_ci', columnType='varchar(193)', columnKey='', extra='', privileges='select', columnComment='', generationExpression=''}*/
private String forColName;

/**Column{tableCatalog='def', tableSchema='information_schema', tableName='INNODB_SYS_FOREIGN_COLS', columnName='REF_COL_NAME', ordinalPosition=3, columnDefault='', isNullable='NO', dataType='varchar', characterMaximumLength=193, characterOctetLength=579, numericPrecision=0, numericScale=0, datetimePrecision=0, characterSetName='utf8', collationName='utf8_general_ci', columnType='varchar(193)', columnKey='', extra='', privileges='select', columnComment='', generationExpression=''}*/
private String refColName;

/**Column{tableCatalog='def', tableSchema='information_schema', tableName='INNODB_SYS_FOREIGN_COLS', columnName='POS', ordinalPosition=4, columnDefault='0', isNullable='NO', dataType='int', characterMaximumLength=0, characterOctetLength=0, numericPrecision=10, numericScale=0, datetimePrecision=0, characterSetName='null', collationName='null', columnType='int(11) unsigned', columnKey='', extra='', privileges='select', columnComment='', generationExpression=''}*/
private Integer pos;

public String getId(){
return id;
}

public String getForColName(){
return forColName;
}

public String getRefColName(){
return refColName;
}

public Integer getPos(){
return pos;
}

}