package db.bean.performance_schema;

import java.util.Date;

/* SELECT NAME AS name, ENABLED AS enabled, TIMED AS timed FROM performance_schema.setup_instruments */
/**
*/
public class SetupInstruments{
/**Column{tableCatalog='def', tableSchema='performance_schema', tableName='setup_instruments', columnName='NAME', ordinalPosition=1, columnDefault='null', isNullable='NO', dataType='varchar', characterMaximumLength=128, characterOctetLength=384, numericPrecision=0, numericScale=0, datetimePrecision=0, characterSetName='utf8', collationName='utf8_general_ci', columnType='varchar(128)', columnKey='', extra='', privileges='select,insert,update,references', columnComment='', generationExpression=''}*/
private String name;

/**Column{tableCatalog='def', tableSchema='performance_schema', tableName='setup_instruments', columnName='ENABLED', ordinalPosition=2, columnDefault='null', isNullable='NO', dataType='enum', characterMaximumLength=3, characterOctetLength=9, numericPrecision=0, numericScale=0, datetimePrecision=0, characterSetName='utf8', collationName='utf8_general_ci', columnType='enum('YES','NO')', columnKey='', extra='', privileges='select,insert,update,references', columnComment='', generationExpression=''}*/
private Date enabled;

/**Column{tableCatalog='def', tableSchema='performance_schema', tableName='setup_instruments', columnName='TIMED', ordinalPosition=3, columnDefault='null', isNullable='NO', dataType='enum', characterMaximumLength=3, characterOctetLength=9, numericPrecision=0, numericScale=0, datetimePrecision=0, characterSetName='utf8', collationName='utf8_general_ci', columnType='enum('YES','NO')', columnKey='', extra='', privileges='select,insert,update,references', columnComment='', generationExpression=''}*/
private Date timed;

public String getName(){
return name;
}

public Date getEnabled(){
return enabled;
}

public Date getTimed(){
return timed;
}

}