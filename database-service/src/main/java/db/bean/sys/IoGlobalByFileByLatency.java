package db.bean.sys;


/* SELECT file AS file, total AS total, total_latency AS totalLatency, count_read AS countRead, read_latency AS readLatency, count_write AS countWrite, write_latency AS writeLatency, count_misc AS countMisc, misc_latency AS miscLatency FROM sys.io_global_by_file_by_latency */
/**VIEW
*/
public class IoGlobalByFileByLatency{
/**Column{tableCatalog='def', tableSchema='sys', tableName='io_global_by_file_by_latency', columnName='file', ordinalPosition=1, columnDefault='null', isNullable='YES', dataType='varchar', characterMaximumLength=512, characterOctetLength=1536, numericPrecision=0, numericScale=0, datetimePrecision=0, characterSetName='utf8', collationName='utf8_general_ci', columnType='varchar(512)', columnKey='', extra='', privileges='select,insert,update,references', columnComment='', generationExpression=''}*/
private String file;

/**Column{tableCatalog='def', tableSchema='sys', tableName='io_global_by_file_by_latency', columnName='total', ordinalPosition=2, columnDefault='null', isNullable='NO', dataType='bigint', characterMaximumLength=0, characterOctetLength=0, numericPrecision=20, numericScale=0, datetimePrecision=0, characterSetName='null', collationName='null', columnType='bigint(20) unsigned', columnKey='', extra='', privileges='select,insert,update,references', columnComment='', generationExpression=''}*/
private Long total;

/**Column{tableCatalog='def', tableSchema='sys', tableName='io_global_by_file_by_latency', columnName='total_latency', ordinalPosition=3, columnDefault='null', isNullable='YES', dataType='text', characterMaximumLength=65535, characterOctetLength=65535, numericPrecision=0, numericScale=0, datetimePrecision=0, characterSetName='utf8', collationName='utf8_general_ci', columnType='text', columnKey='', extra='', privileges='select,insert,update,references', columnComment='', generationExpression=''}*/
private String totalLatency;

/**Column{tableCatalog='def', tableSchema='sys', tableName='io_global_by_file_by_latency', columnName='count_read', ordinalPosition=4, columnDefault='null', isNullable='NO', dataType='bigint', characterMaximumLength=0, characterOctetLength=0, numericPrecision=20, numericScale=0, datetimePrecision=0, characterSetName='null', collationName='null', columnType='bigint(20) unsigned', columnKey='', extra='', privileges='select,insert,update,references', columnComment='', generationExpression=''}*/
private Long countRead;

/**Column{tableCatalog='def', tableSchema='sys', tableName='io_global_by_file_by_latency', columnName='read_latency', ordinalPosition=5, columnDefault='null', isNullable='YES', dataType='text', characterMaximumLength=65535, characterOctetLength=65535, numericPrecision=0, numericScale=0, datetimePrecision=0, characterSetName='utf8', collationName='utf8_general_ci', columnType='text', columnKey='', extra='', privileges='select,insert,update,references', columnComment='', generationExpression=''}*/
private String readLatency;

/**Column{tableCatalog='def', tableSchema='sys', tableName='io_global_by_file_by_latency', columnName='count_write', ordinalPosition=6, columnDefault='null', isNullable='NO', dataType='bigint', characterMaximumLength=0, characterOctetLength=0, numericPrecision=20, numericScale=0, datetimePrecision=0, characterSetName='null', collationName='null', columnType='bigint(20) unsigned', columnKey='', extra='', privileges='select,insert,update,references', columnComment='', generationExpression=''}*/
private Long countWrite;

/**Column{tableCatalog='def', tableSchema='sys', tableName='io_global_by_file_by_latency', columnName='write_latency', ordinalPosition=7, columnDefault='null', isNullable='YES', dataType='text', characterMaximumLength=65535, characterOctetLength=65535, numericPrecision=0, numericScale=0, datetimePrecision=0, characterSetName='utf8', collationName='utf8_general_ci', columnType='text', columnKey='', extra='', privileges='select,insert,update,references', columnComment='', generationExpression=''}*/
private String writeLatency;

/**Column{tableCatalog='def', tableSchema='sys', tableName='io_global_by_file_by_latency', columnName='count_misc', ordinalPosition=8, columnDefault='null', isNullable='NO', dataType='bigint', characterMaximumLength=0, characterOctetLength=0, numericPrecision=20, numericScale=0, datetimePrecision=0, characterSetName='null', collationName='null', columnType='bigint(20) unsigned', columnKey='', extra='', privileges='select,insert,update,references', columnComment='', generationExpression=''}*/
private Long countMisc;

/**Column{tableCatalog='def', tableSchema='sys', tableName='io_global_by_file_by_latency', columnName='misc_latency', ordinalPosition=9, columnDefault='null', isNullable='YES', dataType='text', characterMaximumLength=65535, characterOctetLength=65535, numericPrecision=0, numericScale=0, datetimePrecision=0, characterSetName='utf8', collationName='utf8_general_ci', columnType='text', columnKey='', extra='', privileges='select,insert,update,references', columnComment='', generationExpression=''}*/
private String miscLatency;

public String getFile(){
return file;
}

public Long getTotal(){
return total;
}

public String getTotalLatency(){
return totalLatency;
}

public Long getCountRead(){
return countRead;
}

public String getReadLatency(){
return readLatency;
}

public Long getCountWrite(){
return countWrite;
}

public String getWriteLatency(){
return writeLatency;
}

public Long getCountMisc(){
return countMisc;
}

public String getMiscLatency(){
return miscLatency;
}

}