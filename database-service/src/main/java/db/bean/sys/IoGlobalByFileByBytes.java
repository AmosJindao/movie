package db.bean.sys;


/**VIEW
*/
public class IoGlobalByFileByBytes{
/**Column{tableCatalog='def', tableSchema='sys', tableName='io_global_by_file_by_bytes', columnName='file', ordinalPosition=1, columnDefault='null', isNullable='YES', dataType='varchar', characterMaximumLength=512, characterOctetLength=1536, numericPrecision=0, numericScale=0, datetimePrecision=0, characterSetName='utf8', collationName='utf8_general_ci', columnType='varchar(512)', columnKey='', extra='', privileges='select,insert,update,references', columnComment='', generationExpression=''}*/
private String file;

/**Column{tableCatalog='def', tableSchema='sys', tableName='io_global_by_file_by_bytes', columnName='count_read', ordinalPosition=2, columnDefault='null', isNullable='NO', dataType='bigint', characterMaximumLength=0, characterOctetLength=0, numericPrecision=20, numericScale=0, datetimePrecision=0, characterSetName='null', collationName='null', columnType='bigint(20) unsigned', columnKey='', extra='', privileges='select,insert,update,references', columnComment='', generationExpression=''}*/
private Long countRead;

/**Column{tableCatalog='def', tableSchema='sys', tableName='io_global_by_file_by_bytes', columnName='total_read', ordinalPosition=3, columnDefault='null', isNullable='YES', dataType='text', characterMaximumLength=65535, characterOctetLength=65535, numericPrecision=0, numericScale=0, datetimePrecision=0, characterSetName='utf8', collationName='utf8_general_ci', columnType='text', columnKey='', extra='', privileges='select,insert,update,references', columnComment='', generationExpression=''}*/
private String totalRead;

/**Column{tableCatalog='def', tableSchema='sys', tableName='io_global_by_file_by_bytes', columnName='avg_read', ordinalPosition=4, columnDefault='null', isNullable='YES', dataType='text', characterMaximumLength=65535, characterOctetLength=65535, numericPrecision=0, numericScale=0, datetimePrecision=0, characterSetName='utf8', collationName='utf8_general_ci', columnType='text', columnKey='', extra='', privileges='select,insert,update,references', columnComment='', generationExpression=''}*/
private String avgRead;

/**Column{tableCatalog='def', tableSchema='sys', tableName='io_global_by_file_by_bytes', columnName='count_write', ordinalPosition=5, columnDefault='null', isNullable='NO', dataType='bigint', characterMaximumLength=0, characterOctetLength=0, numericPrecision=20, numericScale=0, datetimePrecision=0, characterSetName='null', collationName='null', columnType='bigint(20) unsigned', columnKey='', extra='', privileges='select,insert,update,references', columnComment='', generationExpression=''}*/
private Long countWrite;

/**Column{tableCatalog='def', tableSchema='sys', tableName='io_global_by_file_by_bytes', columnName='total_written', ordinalPosition=6, columnDefault='null', isNullable='YES', dataType='text', characterMaximumLength=65535, characterOctetLength=65535, numericPrecision=0, numericScale=0, datetimePrecision=0, characterSetName='utf8', collationName='utf8_general_ci', columnType='text', columnKey='', extra='', privileges='select,insert,update,references', columnComment='', generationExpression=''}*/
private String totalWritten;

/**Column{tableCatalog='def', tableSchema='sys', tableName='io_global_by_file_by_bytes', columnName='avg_write', ordinalPosition=7, columnDefault='null', isNullable='YES', dataType='text', characterMaximumLength=65535, characterOctetLength=65535, numericPrecision=0, numericScale=0, datetimePrecision=0, characterSetName='utf8', collationName='utf8_general_ci', columnType='text', columnKey='', extra='', privileges='select,insert,update,references', columnComment='', generationExpression=''}*/
private String avgWrite;

/**Column{tableCatalog='def', tableSchema='sys', tableName='io_global_by_file_by_bytes', columnName='total', ordinalPosition=8, columnDefault='null', isNullable='YES', dataType='text', characterMaximumLength=65535, characterOctetLength=65535, numericPrecision=0, numericScale=0, datetimePrecision=0, characterSetName='utf8', collationName='utf8_general_ci', columnType='text', columnKey='', extra='', privileges='select,insert,update,references', columnComment='', generationExpression=''}*/
private String total;

/**Column{tableCatalog='def', tableSchema='sys', tableName='io_global_by_file_by_bytes', columnName='write_pct', ordinalPosition=9, columnDefault='0.00', isNullable='NO', dataType='decimal', characterMaximumLength=0, characterOctetLength=0, numericPrecision=26, numericScale=2, datetimePrecision=0, characterSetName='null', collationName='null', columnType='decimal(26,2)', columnKey='', extra='', privileges='select,insert,update,references', columnComment='', generationExpression=''}*/
private Double writePct;

public String getFile(){
return file;
}

public Long getCountRead(){
return countRead;
}

public String getTotalRead(){
return totalRead;
}

public String getAvgRead(){
return avgRead;
}

public Long getCountWrite(){
return countWrite;
}

public String getTotalWritten(){
return totalWritten;
}

public String getAvgWrite(){
return avgWrite;
}

public String getTotal(){
return total;
}

public Double getWritePct(){
return writePct;
}

}