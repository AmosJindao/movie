package db.bean.information_schema;


/**
*/
public class ReferentialConstraints{
/**Column{tableCatalog='def', tableSchema='information_schema', tableName='REFERENTIAL_CONSTRAINTS', columnName='CONSTRAINT_CATALOG', ordinalPosition=1, columnDefault='', isNullable='NO', dataType='varchar', characterMaximumLength=512, characterOctetLength=1536, numericPrecision=0, numericScale=0, datetimePrecision=0, characterSetName='utf8', collationName='utf8_general_ci', columnType='varchar(512)', columnKey='', extra='', privileges='select', columnComment='', generationExpression=''}*/
private String constraintCatalog;

/**Column{tableCatalog='def', tableSchema='information_schema', tableName='REFERENTIAL_CONSTRAINTS', columnName='CONSTRAINT_SCHEMA', ordinalPosition=2, columnDefault='', isNullable='NO', dataType='varchar', characterMaximumLength=64, characterOctetLength=192, numericPrecision=0, numericScale=0, datetimePrecision=0, characterSetName='utf8', collationName='utf8_general_ci', columnType='varchar(64)', columnKey='', extra='', privileges='select', columnComment='', generationExpression=''}*/
private String constraintSchema;

/**Column{tableCatalog='def', tableSchema='information_schema', tableName='REFERENTIAL_CONSTRAINTS', columnName='CONSTRAINT_NAME', ordinalPosition=3, columnDefault='', isNullable='NO', dataType='varchar', characterMaximumLength=64, characterOctetLength=192, numericPrecision=0, numericScale=0, datetimePrecision=0, characterSetName='utf8', collationName='utf8_general_ci', columnType='varchar(64)', columnKey='', extra='', privileges='select', columnComment='', generationExpression=''}*/
private String constraintName;

/**Column{tableCatalog='def', tableSchema='information_schema', tableName='REFERENTIAL_CONSTRAINTS', columnName='UNIQUE_CONSTRAINT_CATALOG', ordinalPosition=4, columnDefault='', isNullable='NO', dataType='varchar', characterMaximumLength=512, characterOctetLength=1536, numericPrecision=0, numericScale=0, datetimePrecision=0, characterSetName='utf8', collationName='utf8_general_ci', columnType='varchar(512)', columnKey='', extra='', privileges='select', columnComment='', generationExpression=''}*/
private String uniqueConstraintCatalog;

/**Column{tableCatalog='def', tableSchema='information_schema', tableName='REFERENTIAL_CONSTRAINTS', columnName='UNIQUE_CONSTRAINT_SCHEMA', ordinalPosition=5, columnDefault='', isNullable='NO', dataType='varchar', characterMaximumLength=64, characterOctetLength=192, numericPrecision=0, numericScale=0, datetimePrecision=0, characterSetName='utf8', collationName='utf8_general_ci', columnType='varchar(64)', columnKey='', extra='', privileges='select', columnComment='', generationExpression=''}*/
private String uniqueConstraintSchema;

/**Column{tableCatalog='def', tableSchema='information_schema', tableName='REFERENTIAL_CONSTRAINTS', columnName='UNIQUE_CONSTRAINT_NAME', ordinalPosition=6, columnDefault='null', isNullable='YES', dataType='varchar', characterMaximumLength=64, characterOctetLength=192, numericPrecision=0, numericScale=0, datetimePrecision=0, characterSetName='utf8', collationName='utf8_general_ci', columnType='varchar(64)', columnKey='', extra='', privileges='select', columnComment='', generationExpression=''}*/
private String uniqueConstraintName;

/**Column{tableCatalog='def', tableSchema='information_schema', tableName='REFERENTIAL_CONSTRAINTS', columnName='MATCH_OPTION', ordinalPosition=7, columnDefault='', isNullable='NO', dataType='varchar', characterMaximumLength=64, characterOctetLength=192, numericPrecision=0, numericScale=0, datetimePrecision=0, characterSetName='utf8', collationName='utf8_general_ci', columnType='varchar(64)', columnKey='', extra='', privileges='select', columnComment='', generationExpression=''}*/
private String matchOption;

/**Column{tableCatalog='def', tableSchema='information_schema', tableName='REFERENTIAL_CONSTRAINTS', columnName='UPDATE_RULE', ordinalPosition=8, columnDefault='', isNullable='NO', dataType='varchar', characterMaximumLength=64, characterOctetLength=192, numericPrecision=0, numericScale=0, datetimePrecision=0, characterSetName='utf8', collationName='utf8_general_ci', columnType='varchar(64)', columnKey='', extra='', privileges='select', columnComment='', generationExpression=''}*/
private String updateRule;

/**Column{tableCatalog='def', tableSchema='information_schema', tableName='REFERENTIAL_CONSTRAINTS', columnName='DELETE_RULE', ordinalPosition=9, columnDefault='', isNullable='NO', dataType='varchar', characterMaximumLength=64, characterOctetLength=192, numericPrecision=0, numericScale=0, datetimePrecision=0, characterSetName='utf8', collationName='utf8_general_ci', columnType='varchar(64)', columnKey='', extra='', privileges='select', columnComment='', generationExpression=''}*/
private String deleteRule;

/**Column{tableCatalog='def', tableSchema='information_schema', tableName='REFERENTIAL_CONSTRAINTS', columnName='TABLE_NAME', ordinalPosition=10, columnDefault='', isNullable='NO', dataType='varchar', characterMaximumLength=64, characterOctetLength=192, numericPrecision=0, numericScale=0, datetimePrecision=0, characterSetName='utf8', collationName='utf8_general_ci', columnType='varchar(64)', columnKey='', extra='', privileges='select', columnComment='', generationExpression=''}*/
private String tableName;

/**Column{tableCatalog='def', tableSchema='information_schema', tableName='REFERENTIAL_CONSTRAINTS', columnName='REFERENCED_TABLE_NAME', ordinalPosition=11, columnDefault='', isNullable='NO', dataType='varchar', characterMaximumLength=64, characterOctetLength=192, numericPrecision=0, numericScale=0, datetimePrecision=0, characterSetName='utf8', collationName='utf8_general_ci', columnType='varchar(64)', columnKey='', extra='', privileges='select', columnComment='', generationExpression=''}*/
private String referencedTableName;

public String getConstraintCatalog(){
return constraintCatalog;
}

public String getConstraintSchema(){
return constraintSchema;
}

public String getConstraintName(){
return constraintName;
}

public String getUniqueConstraintCatalog(){
return uniqueConstraintCatalog;
}

public String getUniqueConstraintSchema(){
return uniqueConstraintSchema;
}

public String getUniqueConstraintName(){
return uniqueConstraintName;
}

public String getMatchOption(){
return matchOption;
}

public String getUpdateRule(){
return updateRule;
}

public String getDeleteRule(){
return deleteRule;
}

public String getTableName(){
return tableName;
}

public String getReferencedTableName(){
return referencedTableName;
}

}