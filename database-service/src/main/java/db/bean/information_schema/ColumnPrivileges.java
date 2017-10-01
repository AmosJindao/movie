package db.bean.information_schema;


/**
*/
public class ColumnPrivileges{
/**Column{tableCatalog='def', tableSchema='information_schema', tableName='COLUMN_PRIVILEGES', columnName='GRANTEE', ordinalPosition=1, columnDefault='', isNullable='NO', dataType='varchar', characterMaximumLength=81, characterOctetLength=243, numericPrecision=0, numericScale=0, datetimePrecision=0, characterSetName='utf8', collationName='utf8_general_ci', columnType='varchar(81)', columnKey='', extra='', privileges='select', columnComment='', generationExpression=''}*/
private String grantee;

/**Column{tableCatalog='def', tableSchema='information_schema', tableName='COLUMN_PRIVILEGES', columnName='TABLE_CATALOG', ordinalPosition=2, columnDefault='', isNullable='NO', dataType='varchar', characterMaximumLength=512, characterOctetLength=1536, numericPrecision=0, numericScale=0, datetimePrecision=0, characterSetName='utf8', collationName='utf8_general_ci', columnType='varchar(512)', columnKey='', extra='', privileges='select', columnComment='', generationExpression=''}*/
private String tableCatalog;

/**Column{tableCatalog='def', tableSchema='information_schema', tableName='COLUMN_PRIVILEGES', columnName='TABLE_SCHEMA', ordinalPosition=3, columnDefault='', isNullable='NO', dataType='varchar', characterMaximumLength=64, characterOctetLength=192, numericPrecision=0, numericScale=0, datetimePrecision=0, characterSetName='utf8', collationName='utf8_general_ci', columnType='varchar(64)', columnKey='', extra='', privileges='select', columnComment='', generationExpression=''}*/
private String tableSchema;

/**Column{tableCatalog='def', tableSchema='information_schema', tableName='COLUMN_PRIVILEGES', columnName='TABLE_NAME', ordinalPosition=4, columnDefault='', isNullable='NO', dataType='varchar', characterMaximumLength=64, characterOctetLength=192, numericPrecision=0, numericScale=0, datetimePrecision=0, characterSetName='utf8', collationName='utf8_general_ci', columnType='varchar(64)', columnKey='', extra='', privileges='select', columnComment='', generationExpression=''}*/
private String tableName;

/**Column{tableCatalog='def', tableSchema='information_schema', tableName='COLUMN_PRIVILEGES', columnName='COLUMN_NAME', ordinalPosition=5, columnDefault='', isNullable='NO', dataType='varchar', characterMaximumLength=64, characterOctetLength=192, numericPrecision=0, numericScale=0, datetimePrecision=0, characterSetName='utf8', collationName='utf8_general_ci', columnType='varchar(64)', columnKey='', extra='', privileges='select', columnComment='', generationExpression=''}*/
private String columnName;

/**Column{tableCatalog='def', tableSchema='information_schema', tableName='COLUMN_PRIVILEGES', columnName='PRIVILEGE_TYPE', ordinalPosition=6, columnDefault='', isNullable='NO', dataType='varchar', characterMaximumLength=64, characterOctetLength=192, numericPrecision=0, numericScale=0, datetimePrecision=0, characterSetName='utf8', collationName='utf8_general_ci', columnType='varchar(64)', columnKey='', extra='', privileges='select', columnComment='', generationExpression=''}*/
private String privilegeType;

/**Column{tableCatalog='def', tableSchema='information_schema', tableName='COLUMN_PRIVILEGES', columnName='IS_GRANTABLE', ordinalPosition=7, columnDefault='', isNullable='NO', dataType='varchar', characterMaximumLength=3, characterOctetLength=9, numericPrecision=0, numericScale=0, datetimePrecision=0, characterSetName='utf8', collationName='utf8_general_ci', columnType='varchar(3)', columnKey='', extra='', privileges='select', columnComment='', generationExpression=''}*/
private String isGrantable;

public String getGrantee(){
return grantee;
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

public String getPrivilegeType(){
return privilegeType;
}

public String getIsGrantable(){
return isGrantable;
}

}