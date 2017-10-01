package db.bean.sys;

import java.util.Date;

/**
*/
public class SysConfig{
/**Column{tableCatalog='def', tableSchema='sys', tableName='sys_config', columnName='variable', ordinalPosition=1, columnDefault='null', isNullable='NO', dataType='varchar', characterMaximumLength=128, characterOctetLength=384, numericPrecision=0, numericScale=0, datetimePrecision=0, characterSetName='utf8', collationName='utf8_general_ci', columnType='varchar(128)', columnKey='PRI', extra='', privileges='select,insert,update,references', columnComment='', generationExpression=''}*/
private String variable;

/**Column{tableCatalog='def', tableSchema='sys', tableName='sys_config', columnName='value', ordinalPosition=2, columnDefault='null', isNullable='YES', dataType='varchar', characterMaximumLength=128, characterOctetLength=384, numericPrecision=0, numericScale=0, datetimePrecision=0, characterSetName='utf8', collationName='utf8_general_ci', columnType='varchar(128)', columnKey='', extra='', privileges='select,insert,update,references', columnComment='', generationExpression=''}*/
private String value;

/**Column{tableCatalog='def', tableSchema='sys', tableName='sys_config', columnName='set_time', ordinalPosition=3, columnDefault='CURRENT_TIMESTAMP', isNullable='NO', dataType='timestamp', characterMaximumLength=0, characterOctetLength=0, numericPrecision=0, numericScale=0, datetimePrecision=0, characterSetName='null', collationName='null', columnType='timestamp', columnKey='', extra='on update CURRENT_TIMESTAMP', privileges='select,insert,update,references', columnComment='', generationExpression=''}*/
private Date setTime;

/**Column{tableCatalog='def', tableSchema='sys', tableName='sys_config', columnName='set_by', ordinalPosition=4, columnDefault='null', isNullable='YES', dataType='varchar', characterMaximumLength=128, characterOctetLength=384, numericPrecision=0, numericScale=0, datetimePrecision=0, characterSetName='utf8', collationName='utf8_general_ci', columnType='varchar(128)', columnKey='', extra='', privileges='select,insert,update,references', columnComment='', generationExpression=''}*/
private String setBy;

public String getVariable(){
return variable;
}

public String getValue(){
return value;
}

public Date getSetTime(){
return setTime;
}

public String getSetBy(){
return setBy;
}

}