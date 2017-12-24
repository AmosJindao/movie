package db.bean.information_schema;


/* SELECT TABLE_ID AS tableId, POS AS pos, BASE_POS AS basePos FROM information_schema.INNODB_SYS_VIRTUAL */
/**
*/
public class InnodbSysVirtual{
/**Column{tableCatalog='def', tableSchema='information_schema', tableName='INNODB_SYS_VIRTUAL', columnName='TABLE_ID', ordinalPosition=1, columnDefault='0', isNullable='NO', dataType='bigint', characterMaximumLength=0, characterOctetLength=0, numericPrecision=20, numericScale=0, datetimePrecision=0, characterSetName='null', collationName='null', columnType='bigint(21) unsigned', columnKey='', extra='', privileges='select', columnComment='', generationExpression=''}*/
private Long tableId;

/**Column{tableCatalog='def', tableSchema='information_schema', tableName='INNODB_SYS_VIRTUAL', columnName='POS', ordinalPosition=2, columnDefault='0', isNullable='NO', dataType='int', characterMaximumLength=0, characterOctetLength=0, numericPrecision=10, numericScale=0, datetimePrecision=0, characterSetName='null', collationName='null', columnType='int(11) unsigned', columnKey='', extra='', privileges='select', columnComment='', generationExpression=''}*/
private Integer pos;

/**Column{tableCatalog='def', tableSchema='information_schema', tableName='INNODB_SYS_VIRTUAL', columnName='BASE_POS', ordinalPosition=3, columnDefault='0', isNullable='NO', dataType='int', characterMaximumLength=0, characterOctetLength=0, numericPrecision=10, numericScale=0, datetimePrecision=0, characterSetName='null', collationName='null', columnType='int(11) unsigned', columnKey='', extra='', privileges='select', columnComment='', generationExpression=''}*/
private Integer basePos;

public Long getTableId(){
return tableId;
}

public Integer getPos(){
return pos;
}

public Integer getBasePos(){
return basePos;
}

}