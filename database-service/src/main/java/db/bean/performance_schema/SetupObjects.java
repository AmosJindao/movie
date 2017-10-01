package db.bean.performance_schema;

import java.util.Date;

/**
*/
public class SetupObjects{
/**Column{tableCatalog='def', tableSchema='performance_schema', tableName='setup_objects', columnName='OBJECT_TYPE', ordinalPosition=1, columnDefault='TABLE', isNullable='NO', dataType='enum', characterMaximumLength=9, characterOctetLength=27, numericPrecision=0, numericScale=0, datetimePrecision=0, characterSetName='utf8', collationName='utf8_general_ci', columnType='enum('EVENT','FUNCTION','PROCEDURE','TABLE','TRIGGER')', columnKey='', extra='', privileges='select,insert,update,references', columnComment='', generationExpression=''}*/
private Date objectType;

/**Column{tableCatalog='def', tableSchema='performance_schema', tableName='setup_objects', columnName='OBJECT_SCHEMA', ordinalPosition=2, columnDefault='%', isNullable='YES', dataType='varchar', characterMaximumLength=64, characterOctetLength=192, numericPrecision=0, numericScale=0, datetimePrecision=0, characterSetName='utf8', collationName='utf8_general_ci', columnType='varchar(64)', columnKey='', extra='', privileges='select,insert,update,references', columnComment='', generationExpression=''}*/
private String objectSchema;

/**Column{tableCatalog='def', tableSchema='performance_schema', tableName='setup_objects', columnName='OBJECT_NAME', ordinalPosition=3, columnDefault='%', isNullable='NO', dataType='varchar', characterMaximumLength=64, characterOctetLength=192, numericPrecision=0, numericScale=0, datetimePrecision=0, characterSetName='utf8', collationName='utf8_general_ci', columnType='varchar(64)', columnKey='', extra='', privileges='select,insert,update,references', columnComment='', generationExpression=''}*/
private String objectName;

/**Column{tableCatalog='def', tableSchema='performance_schema', tableName='setup_objects', columnName='ENABLED', ordinalPosition=4, columnDefault='YES', isNullable='NO', dataType='enum', characterMaximumLength=3, characterOctetLength=9, numericPrecision=0, numericScale=0, datetimePrecision=0, characterSetName='utf8', collationName='utf8_general_ci', columnType='enum('YES','NO')', columnKey='', extra='', privileges='select,insert,update,references', columnComment='', generationExpression=''}*/
private Date enabled;

/**Column{tableCatalog='def', tableSchema='performance_schema', tableName='setup_objects', columnName='TIMED', ordinalPosition=5, columnDefault='YES', isNullable='NO', dataType='enum', characterMaximumLength=3, characterOctetLength=9, numericPrecision=0, numericScale=0, datetimePrecision=0, characterSetName='utf8', collationName='utf8_general_ci', columnType='enum('YES','NO')', columnKey='', extra='', privileges='select,insert,update,references', columnComment='', generationExpression=''}*/
private Date timed;

public Date getObjectType(){
return objectType;
}

public String getObjectSchema(){
return objectSchema;
}

public String getObjectName(){
return objectName;
}

public Date getEnabled(){
return enabled;
}

public Date getTimed(){
return timed;
}

}