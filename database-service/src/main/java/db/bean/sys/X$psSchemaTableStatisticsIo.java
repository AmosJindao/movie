package db.bean.sys;


/**VIEW
*/
public class X$psSchemaTableStatisticsIo{
/**Column{tableCatalog='def', tableSchema='sys', tableName='x$ps_schema_table_statistics_io', columnName='table_schema', ordinalPosition=1, columnDefault='null', isNullable='YES', dataType='varchar', characterMaximumLength=64, characterOctetLength=192, numericPrecision=0, numericScale=0, datetimePrecision=0, characterSetName='utf8', collationName='utf8_general_ci', columnType='varchar(64)', columnKey='', extra='', privileges='select,insert,update,references', columnComment='', generationExpression=''}*/
private String tableSchema;

/**Column{tableCatalog='def', tableSchema='sys', tableName='x$ps_schema_table_statistics_io', columnName='table_name', ordinalPosition=2, columnDefault='null', isNullable='YES', dataType='varchar', characterMaximumLength=64, characterOctetLength=192, numericPrecision=0, numericScale=0, datetimePrecision=0, characterSetName='utf8', collationName='utf8_general_ci', columnType='varchar(64)', columnKey='', extra='', privileges='select,insert,update,references', columnComment='', generationExpression=''}*/
private String tableName;

/**Column{tableCatalog='def', tableSchema='sys', tableName='x$ps_schema_table_statistics_io', columnName='count_read', ordinalPosition=3, columnDefault='null', isNullable='YES', dataType='decimal', characterMaximumLength=0, characterOctetLength=0, numericPrecision=42, numericScale=0, datetimePrecision=0, characterSetName='null', collationName='null', columnType='decimal(42,0)', columnKey='', extra='', privileges='select,insert,update,references', columnComment='', generationExpression=''}*/
private Double countRead;

/**Column{tableCatalog='def', tableSchema='sys', tableName='x$ps_schema_table_statistics_io', columnName='sum_number_of_bytes_read', ordinalPosition=4, columnDefault='null', isNullable='YES', dataType='decimal', characterMaximumLength=0, characterOctetLength=0, numericPrecision=41, numericScale=0, datetimePrecision=0, characterSetName='null', collationName='null', columnType='decimal(41,0)', columnKey='', extra='', privileges='select,insert,update,references', columnComment='', generationExpression=''}*/
private Double sumNumberOfBytesRead;

/**Column{tableCatalog='def', tableSchema='sys', tableName='x$ps_schema_table_statistics_io', columnName='sum_timer_read', ordinalPosition=5, columnDefault='null', isNullable='YES', dataType='decimal', characterMaximumLength=0, characterOctetLength=0, numericPrecision=42, numericScale=0, datetimePrecision=0, characterSetName='null', collationName='null', columnType='decimal(42,0)', columnKey='', extra='', privileges='select,insert,update,references', columnComment='', generationExpression=''}*/
private Double sumTimerRead;

/**Column{tableCatalog='def', tableSchema='sys', tableName='x$ps_schema_table_statistics_io', columnName='count_write', ordinalPosition=6, columnDefault='null', isNullable='YES', dataType='decimal', characterMaximumLength=0, characterOctetLength=0, numericPrecision=42, numericScale=0, datetimePrecision=0, characterSetName='null', collationName='null', columnType='decimal(42,0)', columnKey='', extra='', privileges='select,insert,update,references', columnComment='', generationExpression=''}*/
private Double countWrite;

/**Column{tableCatalog='def', tableSchema='sys', tableName='x$ps_schema_table_statistics_io', columnName='sum_number_of_bytes_write', ordinalPosition=7, columnDefault='null', isNullable='YES', dataType='decimal', characterMaximumLength=0, characterOctetLength=0, numericPrecision=41, numericScale=0, datetimePrecision=0, characterSetName='null', collationName='null', columnType='decimal(41,0)', columnKey='', extra='', privileges='select,insert,update,references', columnComment='', generationExpression=''}*/
private Double sumNumberOfBytesWrite;

/**Column{tableCatalog='def', tableSchema='sys', tableName='x$ps_schema_table_statistics_io', columnName='sum_timer_write', ordinalPosition=8, columnDefault='null', isNullable='YES', dataType='decimal', characterMaximumLength=0, characterOctetLength=0, numericPrecision=42, numericScale=0, datetimePrecision=0, characterSetName='null', collationName='null', columnType='decimal(42,0)', columnKey='', extra='', privileges='select,insert,update,references', columnComment='', generationExpression=''}*/
private Double sumTimerWrite;

/**Column{tableCatalog='def', tableSchema='sys', tableName='x$ps_schema_table_statistics_io', columnName='count_misc', ordinalPosition=9, columnDefault='null', isNullable='YES', dataType='decimal', characterMaximumLength=0, characterOctetLength=0, numericPrecision=42, numericScale=0, datetimePrecision=0, characterSetName='null', collationName='null', columnType='decimal(42,0)', columnKey='', extra='', privileges='select,insert,update,references', columnComment='', generationExpression=''}*/
private Double countMisc;

/**Column{tableCatalog='def', tableSchema='sys', tableName='x$ps_schema_table_statistics_io', columnName='sum_timer_misc', ordinalPosition=10, columnDefault='null', isNullable='YES', dataType='decimal', characterMaximumLength=0, characterOctetLength=0, numericPrecision=42, numericScale=0, datetimePrecision=0, characterSetName='null', collationName='null', columnType='decimal(42,0)', columnKey='', extra='', privileges='select,insert,update,references', columnComment='', generationExpression=''}*/
private Double sumTimerMisc;

public String getTableSchema(){
return tableSchema;
}

public String getTableName(){
return tableName;
}

public Double getCountRead(){
return countRead;
}

public Double getSumNumberOfBytesRead(){
return sumNumberOfBytesRead;
}

public Double getSumTimerRead(){
return sumTimerRead;
}

public Double getCountWrite(){
return countWrite;
}

public Double getSumNumberOfBytesWrite(){
return sumNumberOfBytesWrite;
}

public Double getSumTimerWrite(){
return sumTimerWrite;
}

public Double getCountMisc(){
return countMisc;
}

public Double getSumTimerMisc(){
return sumTimerMisc;
}

}