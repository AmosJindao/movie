package db.bean.information_schema;


/* SELECT INDEX_ID AS indexId, NAME AS name, POS AS pos FROM information_schema.INNODB_SYS_FIELDS */
/**
*/
public class InnodbSysFields{
/**Column{tableCatalog='def', tableSchema='information_schema', tableName='INNODB_SYS_FIELDS', columnName='INDEX_ID', ordinalPosition=1, columnDefault='0', isNullable='NO', dataType='bigint', characterMaximumLength=0, characterOctetLength=0, numericPrecision=20, numericScale=0, datetimePrecision=0, characterSetName='null', collationName='null', columnType='bigint(21) unsigned', columnKey='', extra='', privileges='select', columnComment='', generationExpression=''}*/
private Long indexId;

/**Column{tableCatalog='def', tableSchema='information_schema', tableName='INNODB_SYS_FIELDS', columnName='NAME', ordinalPosition=2, columnDefault='', isNullable='NO', dataType='varchar', characterMaximumLength=193, characterOctetLength=579, numericPrecision=0, numericScale=0, datetimePrecision=0, characterSetName='utf8', collationName='utf8_general_ci', columnType='varchar(193)', columnKey='', extra='', privileges='select', columnComment='', generationExpression=''}*/
private String name;

/**Column{tableCatalog='def', tableSchema='information_schema', tableName='INNODB_SYS_FIELDS', columnName='POS', ordinalPosition=3, columnDefault='0', isNullable='NO', dataType='int', characterMaximumLength=0, characterOctetLength=0, numericPrecision=10, numericScale=0, datetimePrecision=0, characterSetName='null', collationName='null', columnType='int(11) unsigned', columnKey='', extra='', privileges='select', columnComment='', generationExpression=''}*/
private Integer pos;

public Long getIndexId(){
return indexId;
}

public String getName(){
return name;
}

public Integer getPos(){
return pos;
}

}