package db.bean.performance_schema;

import java.util.Date;

/**
*/
public class SetupConsumers{
/**Column{tableCatalog='def', tableSchema='performance_schema', tableName='setup_consumers', columnName='NAME', ordinalPosition=1, columnDefault='null', isNullable='NO', dataType='varchar', characterMaximumLength=64, characterOctetLength=192, numericPrecision=0, numericScale=0, datetimePrecision=0, characterSetName='utf8', collationName='utf8_general_ci', columnType='varchar(64)', columnKey='', extra='', privileges='select,insert,update,references', columnComment='', generationExpression=''}*/
private String name;

/**Column{tableCatalog='def', tableSchema='performance_schema', tableName='setup_consumers', columnName='ENABLED', ordinalPosition=2, columnDefault='null', isNullable='NO', dataType='enum', characterMaximumLength=3, characterOctetLength=9, numericPrecision=0, numericScale=0, datetimePrecision=0, characterSetName='utf8', collationName='utf8_general_ci', columnType='enum('YES','NO')', columnKey='', extra='', privileges='select,insert,update,references', columnComment='', generationExpression=''}*/
private Date enabled;

public String getName(){
return name;
}

public Date getEnabled(){
return enabled;
}

}