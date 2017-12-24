package db.bean.information_schema;


/* SELECT DOC_ID AS docId FROM information_schema.INNODB_FT_BEING_DELETED */
/**
*/
public class InnodbFtBeingDeleted{
/**Column{tableCatalog='def', tableSchema='information_schema', tableName='INNODB_FT_BEING_DELETED', columnName='DOC_ID', ordinalPosition=1, columnDefault='0', isNullable='NO', dataType='bigint', characterMaximumLength=0, characterOctetLength=0, numericPrecision=20, numericScale=0, datetimePrecision=0, characterSetName='null', collationName='null', columnType='bigint(21) unsigned', columnKey='', extra='', privileges='select', columnComment='', generationExpression=''}*/
private Long docId;

public Long getDocId(){
return docId;
}

}