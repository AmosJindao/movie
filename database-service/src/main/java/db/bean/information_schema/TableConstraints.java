package db.bean.information_schema;


/* SELECT CONSTRAINT_CATALOG AS constraintCatalog, CONSTRAINT_SCHEMA AS constraintSchema, CONSTRAINT_NAME AS constraintName, TABLE_SCHEMA AS tableSchema, TABLE_NAME AS tableName, CONSTRAINT_TYPE AS constraintType FROM information_schema.TABLE_CONSTRAINTS */
/**
*/
public class TableConstraints{
/**Column{tableCatalog='def', tableSchema='information_schema', tableName='TABLE_CONSTRAINTS', columnName='CONSTRAINT_CATALOG', ordinalPosition=1, columnDefault='', isNullable='NO', dataType='varchar', characterMaximumLength=512, characterOctetLength=1536, numericPrecision=0, numericScale=0, datetimePrecision=0, characterSetName='utf8', collationName='utf8_general_ci', columnType='varchar(512)', columnKey='', extra='', privileges='select', columnComment='', generationExpression=''}*/
private String constraintCatalog;

/**Column{tableCatalog='def', tableSchema='information_schema', tableName='TABLE_CONSTRAINTS', columnName='CONSTRAINT_SCHEMA', ordinalPosition=2, columnDefault='', isNullable='NO', dataType='varchar', characterMaximumLength=64, characterOctetLength=192, numericPrecision=0, numericScale=0, datetimePrecision=0, characterSetName='utf8', collationName='utf8_general_ci', columnType='varchar(64)', columnKey='', extra='', privileges='select', columnComment='', generationExpression=''}*/
private String constraintSchema;

/**Column{tableCatalog='def', tableSchema='information_schema', tableName='TABLE_CONSTRAINTS', columnName='CONSTRAINT_NAME', ordinalPosition=3, columnDefault='', isNullable='NO', dataType='varchar', characterMaximumLength=64, characterOctetLength=192, numericPrecision=0, numericScale=0, datetimePrecision=0, characterSetName='utf8', collationName='utf8_general_ci', columnType='varchar(64)', columnKey='', extra='', privileges='select', columnComment='', generationExpression=''}*/
private String constraintName;

/**Column{tableCatalog='def', tableSchema='information_schema', tableName='TABLE_CONSTRAINTS', columnName='TABLE_SCHEMA', ordinalPosition=4, columnDefault='', isNullable='NO', dataType='varchar', characterMaximumLength=64, characterOctetLength=192, numericPrecision=0, numericScale=0, datetimePrecision=0, characterSetName='utf8', collationName='utf8_general_ci', columnType='varchar(64)', columnKey='', extra='', privileges='select', columnComment='', generationExpression=''}*/
private String tableSchema;

/**Column{tableCatalog='def', tableSchema='information_schema', tableName='TABLE_CONSTRAINTS', columnName='TABLE_NAME', ordinalPosition=5, columnDefault='', isNullable='NO', dataType='varchar', characterMaximumLength=64, characterOctetLength=192, numericPrecision=0, numericScale=0, datetimePrecision=0, characterSetName='utf8', collationName='utf8_general_ci', columnType='varchar(64)', columnKey='', extra='', privileges='select', columnComment='', generationExpression=''}*/
private String tableName;

/**Column{tableCatalog='def', tableSchema='information_schema', tableName='TABLE_CONSTRAINTS', columnName='CONSTRAINT_TYPE', ordinalPosition=6, columnDefault='', isNullable='NO', dataType='varchar', characterMaximumLength=64, characterOctetLength=192, numericPrecision=0, numericScale=0, datetimePrecision=0, characterSetName='utf8', collationName='utf8_general_ci', columnType='varchar(64)', columnKey='', extra='', privileges='select', columnComment='', generationExpression=''}*/
private String constraintType;

public String getConstraintCatalog(){
return constraintCatalog;
}

public String getConstraintSchema(){
return constraintSchema;
}

public String getConstraintName(){
return constraintName;
}

public String getTableSchema(){
return tableSchema;
}

public String getTableName(){
return tableName;
}

public String getConstraintType(){
return constraintType;
}

}