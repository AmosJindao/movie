package db.bean.sys;


/**VIEW
*/
public class X$ioGlobalByFileByBytes{
/**Column{tableCatalog='def', tableSchema='sys', tableName='x$io_global_by_file_by_bytes', columnName='file', ordinalPosition=1, columnDefault='null', isNullable='NO', dataType='varchar', characterMaximumLength=512, characterOctetLength=1536, numericPrecision=0, numericScale=0, datetimePrecision=0, characterSetName='utf8', collationName='utf8_general_ci', columnType='varchar(512)', columnKey='', extra='', privileges='select,insert,update,references', columnComment='', generationExpression=''}*/
private String file;

/**Column{tableCatalog='def', tableSchema='sys', tableName='x$io_global_by_file_by_bytes', columnName='count_read', ordinalPosition=2, columnDefault='null', isNullable='NO', dataType='bigint', characterMaximumLength=0, characterOctetLength=0, numericPrecision=20, numericScale=0, datetimePrecision=0, characterSetName='null', collationName='null', columnType='bigint(20) unsigned', columnKey='', extra='', privileges='select,insert,update,references', columnComment='', generationExpression=''}*/
private Long countRead;

/**Column{tableCatalog='def', tableSchema='sys', tableName='x$io_global_by_file_by_bytes', columnName='total_read', ordinalPosition=3, columnDefault='null', isNullable='NO', dataType='bigint', characterMaximumLength=0, characterOctetLength=0, numericPrecision=19, numericScale=0, datetimePrecision=0, characterSetName='null', collationName='null', columnType='bigint(20)', columnKey='', extra='', privileges='select,insert,update,references', columnComment='', generationExpression=''}*/
private Long totalRead;

/**Column{tableCatalog='def', tableSchema='sys', tableName='x$io_global_by_file_by_bytes', columnName='avg_read', ordinalPosition=4, columnDefault='0.0000', isNullable='NO', dataType='decimal', characterMaximumLength=0, characterOctetLength=0, numericPrecision=23, numericScale=4, datetimePrecision=0, characterSetName='null', collationName='null', columnType='decimal(23,4)', columnKey='', extra='', privileges='select,insert,update,references', columnComment='', generationExpression=''}*/
private Double avgRead;

/**Column{tableCatalog='def', tableSchema='sys', tableName='x$io_global_by_file_by_bytes', columnName='count_write', ordinalPosition=5, columnDefault='null', isNullable='NO', dataType='bigint', characterMaximumLength=0, characterOctetLength=0, numericPrecision=20, numericScale=0, datetimePrecision=0, characterSetName='null', collationName='null', columnType='bigint(20) unsigned', columnKey='', extra='', privileges='select,insert,update,references', columnComment='', generationExpression=''}*/
private Long countWrite;

/**Column{tableCatalog='def', tableSchema='sys', tableName='x$io_global_by_file_by_bytes', columnName='total_written', ordinalPosition=6, columnDefault='null', isNullable='NO', dataType='bigint', characterMaximumLength=0, characterOctetLength=0, numericPrecision=19, numericScale=0, datetimePrecision=0, characterSetName='null', collationName='null', columnType='bigint(20)', columnKey='', extra='', privileges='select,insert,update,references', columnComment='', generationExpression=''}*/
private Long totalWritten;

/**Column{tableCatalog='def', tableSchema='sys', tableName='x$io_global_by_file_by_bytes', columnName='avg_write', ordinalPosition=7, columnDefault='0.0000', isNullable='NO', dataType='decimal', characterMaximumLength=0, characterOctetLength=0, numericPrecision=23, numericScale=4, datetimePrecision=0, characterSetName='null', collationName='null', columnType='decimal(23,4)', columnKey='', extra='', privileges='select,insert,update,references', columnComment='', generationExpression=''}*/
private Double avgWrite;

/**Column{tableCatalog='def', tableSchema='sys', tableName='x$io_global_by_file_by_bytes', columnName='total', ordinalPosition=8, columnDefault='0', isNullable='NO', dataType='bigint', characterMaximumLength=0, characterOctetLength=0, numericPrecision=19, numericScale=0, datetimePrecision=0, characterSetName='null', collationName='null', columnType='bigint(21)', columnKey='', extra='', privileges='select,insert,update,references', columnComment='', generationExpression=''}*/
private Long total;

/**Column{tableCatalog='def', tableSchema='sys', tableName='x$io_global_by_file_by_bytes', columnName='write_pct', ordinalPosition=9, columnDefault='0.00', isNullable='NO', dataType='decimal', characterMaximumLength=0, characterOctetLength=0, numericPrecision=26, numericScale=2, datetimePrecision=0, characterSetName='null', collationName='null', columnType='decimal(26,2)', columnKey='', extra='', privileges='select,insert,update,references', columnComment='', generationExpression=''}*/
private Double writePct;

public String getFile(){
return file;
}

public Long getCountRead(){
return countRead;
}

public Long getTotalRead(){
return totalRead;
}

public Double getAvgRead(){
return avgRead;
}

public Long getCountWrite(){
return countWrite;
}

public Long getTotalWritten(){
return totalWritten;
}

public Double getAvgWrite(){
return avgWrite;
}

public Long getTotal(){
return total;
}

public Double getWritePct(){
return writePct;
}

}