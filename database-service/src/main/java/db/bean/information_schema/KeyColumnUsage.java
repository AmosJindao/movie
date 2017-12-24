package db.bean.information_schema;


/* SELECT CONSTRAINT_CATALOG AS constraintCatalog, CONSTRAINT_SCHEMA AS constraintSchema, CONSTRAINT_NAME AS constraintName, TABLE_CATALOG AS tableCatalog, TABLE_SCHEMA AS tableSchema, TABLE_NAME AS tableName, COLUMN_NAME AS columnName, ORDINAL_POSITION AS ordinalPosition, POSITION_IN_UNIQUE_CONSTRAINT AS positionInUniqueConstraint, REFERENCED_TABLE_SCHEMA AS referencedTableSchema, REFERENCED_TABLE_NAME AS referencedTableName, REFERENCED_COLUMN_NAME AS referencedColumnName FROM information_schema.KEY_COLUMN_USAGE */
/**
*/
public class KeyColumnUsage{
/**Column{tableCatalog='def', tableSchema='information_schema', tableName='KEY_COLUMN_USAGE', columnName='CONSTRAINT_CATALOG', ordinalPosition=1, columnDefault='', isNullable='NO', dataType='varchar', characterMaximumLength=512, characterOctetLength=1536, numericPrecision=0, numericScale=0, datetimePrecision=0, characterSetName='utf8', collationName='utf8_general_ci', columnType='varchar(512)', columnKey='', extra='', privileges='select', columnComment='', generationExpression=''}*/
private String constraintCatalog;

/**Column{tableCatalog='def', tableSchema='information_schema', tableName='KEY_COLUMN_USAGE', columnName='CONSTRAINT_SCHEMA', ordinalPosition=2, columnDefault='', isNullable='NO', dataType='varchar', characterMaximumLength=64, characterOctetLength=192, numericPrecision=0, numericScale=0, datetimePrecision=0, characterSetName='utf8', collationName='utf8_general_ci', columnType='varchar(64)', columnKey='', extra='', privileges='select', columnComment='', generationExpression=''}*/
private String constraintSchema;

/**Column{tableCatalog='def', tableSchema='information_schema', tableName='KEY_COLUMN_USAGE', columnName='CONSTRAINT_NAME', ordinalPosition=3, columnDefault='', isNullable='NO', dataType='varchar', characterMaximumLength=64, characterOctetLength=192, numericPrecision=0, numericScale=0, datetimePrecision=0, characterSetName='utf8', collationName='utf8_general_ci', columnType='varchar(64)', columnKey='', extra='', privileges='select', columnComment='', generationExpression=''}*/
private String constraintName;

/**Column{tableCatalog='def', tableSchema='information_schema', tableName='KEY_COLUMN_USAGE', columnName='TABLE_CATALOG', ordinalPosition=4, columnDefault='', isNullable='NO', dataType='varchar', characterMaximumLength=512, characterOctetLength=1536, numericPrecision=0, numericScale=0, datetimePrecision=0, characterSetName='utf8', collationName='utf8_general_ci', columnType='varchar(512)', columnKey='', extra='', privileges='select', columnComment='', generationExpression=''}*/
private String tableCatalog;

/**Column{tableCatalog='def', tableSchema='information_schema', tableName='KEY_COLUMN_USAGE', columnName='TABLE_SCHEMA', ordinalPosition=5, columnDefault='', isNullable='NO', dataType='varchar', characterMaximumLength=64, characterOctetLength=192, numericPrecision=0, numericScale=0, datetimePrecision=0, characterSetName='utf8', collationName='utf8_general_ci', columnType='varchar(64)', columnKey='', extra='', privileges='select', columnComment='', generationExpression=''}*/
private String tableSchema;

/**Column{tableCatalog='def', tableSchema='information_schema', tableName='KEY_COLUMN_USAGE', columnName='TABLE_NAME', ordinalPosition=6, columnDefault='', isNullable='NO', dataType='varchar', characterMaximumLength=64, characterOctetLength=192, numericPrecision=0, numericScale=0, datetimePrecision=0, characterSetName='utf8', collationName='utf8_general_ci', columnType='varchar(64)', columnKey='', extra='', privileges='select', columnComment='', generationExpression=''}*/
private String tableName;

/**Column{tableCatalog='def', tableSchema='information_schema', tableName='KEY_COLUMN_USAGE', columnName='COLUMN_NAME', ordinalPosition=7, columnDefault='', isNullable='NO', dataType='varchar', characterMaximumLength=64, characterOctetLength=192, numericPrecision=0, numericScale=0, datetimePrecision=0, characterSetName='utf8', collationName='utf8_general_ci', columnType='varchar(64)', columnKey='', extra='', privileges='select', columnComment='', generationExpression=''}*/
private String columnName;

/**Column{tableCatalog='def', tableSchema='information_schema', tableName='KEY_COLUMN_USAGE', columnName='ORDINAL_POSITION', ordinalPosition=8, columnDefault='0', isNullable='NO', dataType='bigint', characterMaximumLength=0, characterOctetLength=0, numericPrecision=19, numericScale=0, datetimePrecision=0, characterSetName='null', collationName='null', columnType='bigint(10)', columnKey='', extra='', privileges='select', columnComment='', generationExpression=''}*/
private Long ordinalPosition;

/**Column{tableCatalog='def', tableSchema='information_schema', tableName='KEY_COLUMN_USAGE', columnName='POSITION_IN_UNIQUE_CONSTRAINT', ordinalPosition=9, columnDefault='null', isNullable='YES', dataType='bigint', characterMaximumLength=0, characterOctetLength=0, numericPrecision=19, numericScale=0, datetimePrecision=0, characterSetName='null', collationName='null', columnType='bigint(10)', columnKey='', extra='', privileges='select', columnComment='', generationExpression=''}*/
private Long positionInUniqueConstraint;

/**Column{tableCatalog='def', tableSchema='information_schema', tableName='KEY_COLUMN_USAGE', columnName='REFERENCED_TABLE_SCHEMA', ordinalPosition=10, columnDefault='null', isNullable='YES', dataType='varchar', characterMaximumLength=64, characterOctetLength=192, numericPrecision=0, numericScale=0, datetimePrecision=0, characterSetName='utf8', collationName='utf8_general_ci', columnType='varchar(64)', columnKey='', extra='', privileges='select', columnComment='', generationExpression=''}*/
private String referencedTableSchema;

/**Column{tableCatalog='def', tableSchema='information_schema', tableName='KEY_COLUMN_USAGE', columnName='REFERENCED_TABLE_NAME', ordinalPosition=11, columnDefault='null', isNullable='YES', dataType='varchar', characterMaximumLength=64, characterOctetLength=192, numericPrecision=0, numericScale=0, datetimePrecision=0, characterSetName='utf8', collationName='utf8_general_ci', columnType='varchar(64)', columnKey='', extra='', privileges='select', columnComment='', generationExpression=''}*/
private String referencedTableName;

/**Column{tableCatalog='def', tableSchema='information_schema', tableName='KEY_COLUMN_USAGE', columnName='REFERENCED_COLUMN_NAME', ordinalPosition=12, columnDefault='null', isNullable='YES', dataType='varchar', characterMaximumLength=64, characterOctetLength=192, numericPrecision=0, numericScale=0, datetimePrecision=0, characterSetName='utf8', collationName='utf8_general_ci', columnType='varchar(64)', columnKey='', extra='', privileges='select', columnComment='', generationExpression=''}*/
private String referencedColumnName;

public String getConstraintCatalog(){
return constraintCatalog;
}

public String getConstraintSchema(){
return constraintSchema;
}

public String getConstraintName(){
return constraintName;
}

public String getTableCatalog(){
return tableCatalog;
}

public String getTableSchema(){
return tableSchema;
}

public String getTableName(){
return tableName;
}

public String getColumnName(){
return columnName;
}

public Long getOrdinalPosition(){
return ordinalPosition;
}

public Long getPositionInUniqueConstraint(){
return positionInUniqueConstraint;
}

public String getReferencedTableSchema(){
return referencedTableSchema;
}

public String getReferencedTableName(){
return referencedTableName;
}

public String getReferencedColumnName(){
return referencedColumnName;
}

}