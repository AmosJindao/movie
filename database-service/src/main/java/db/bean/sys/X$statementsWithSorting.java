package db.bean.sys;

import java.util.Date;

/**VIEW
*/
public class X$statementsWithSorting{
/**Column{tableCatalog='def', tableSchema='sys', tableName='x$statements_with_sorting', columnName='query', ordinalPosition=1, columnDefault='null', isNullable='YES', dataType='longtext', characterMaximumLength=4294967295, characterOctetLength=4294967295, numericPrecision=0, numericScale=0, datetimePrecision=0, characterSetName='utf8', collationName='utf8_general_ci', columnType='longtext', columnKey='', extra='', privileges='select,insert,update,references', columnComment='', generationExpression=''}*/
private String query;

/**Column{tableCatalog='def', tableSchema='sys', tableName='x$statements_with_sorting', columnName='db', ordinalPosition=2, columnDefault='null', isNullable='YES', dataType='varchar', characterMaximumLength=64, characterOctetLength=192, numericPrecision=0, numericScale=0, datetimePrecision=0, characterSetName='utf8', collationName='utf8_general_ci', columnType='varchar(64)', columnKey='', extra='', privileges='select,insert,update,references', columnComment='', generationExpression=''}*/
private String db;

/**Column{tableCatalog='def', tableSchema='sys', tableName='x$statements_with_sorting', columnName='exec_count', ordinalPosition=3, columnDefault='null', isNullable='NO', dataType='bigint', characterMaximumLength=0, characterOctetLength=0, numericPrecision=20, numericScale=0, datetimePrecision=0, characterSetName='null', collationName='null', columnType='bigint(20) unsigned', columnKey='', extra='', privileges='select,insert,update,references', columnComment='', generationExpression=''}*/
private Long execCount;

/**Column{tableCatalog='def', tableSchema='sys', tableName='x$statements_with_sorting', columnName='total_latency', ordinalPosition=4, columnDefault='null', isNullable='NO', dataType='bigint', characterMaximumLength=0, characterOctetLength=0, numericPrecision=20, numericScale=0, datetimePrecision=0, characterSetName='null', collationName='null', columnType='bigint(20) unsigned', columnKey='', extra='', privileges='select,insert,update,references', columnComment='', generationExpression=''}*/
private Long totalLatency;

/**Column{tableCatalog='def', tableSchema='sys', tableName='x$statements_with_sorting', columnName='sort_merge_passes', ordinalPosition=5, columnDefault='null', isNullable='NO', dataType='bigint', characterMaximumLength=0, characterOctetLength=0, numericPrecision=20, numericScale=0, datetimePrecision=0, characterSetName='null', collationName='null', columnType='bigint(20) unsigned', columnKey='', extra='', privileges='select,insert,update,references', columnComment='', generationExpression=''}*/
private Long sortMergePasses;

/**Column{tableCatalog='def', tableSchema='sys', tableName='x$statements_with_sorting', columnName='avg_sort_merges', ordinalPosition=6, columnDefault='0', isNullable='NO', dataType='decimal', characterMaximumLength=0, characterOctetLength=0, numericPrecision=21, numericScale=0, datetimePrecision=0, characterSetName='null', collationName='null', columnType='decimal(21,0)', columnKey='', extra='', privileges='select,insert,update,references', columnComment='', generationExpression=''}*/
private Double avgSortMerges;

/**Column{tableCatalog='def', tableSchema='sys', tableName='x$statements_with_sorting', columnName='sorts_using_scans', ordinalPosition=7, columnDefault='null', isNullable='NO', dataType='bigint', characterMaximumLength=0, characterOctetLength=0, numericPrecision=20, numericScale=0, datetimePrecision=0, characterSetName='null', collationName='null', columnType='bigint(20) unsigned', columnKey='', extra='', privileges='select,insert,update,references', columnComment='', generationExpression=''}*/
private Long sortsUsingScans;

/**Column{tableCatalog='def', tableSchema='sys', tableName='x$statements_with_sorting', columnName='sort_using_range', ordinalPosition=8, columnDefault='null', isNullable='NO', dataType='bigint', characterMaximumLength=0, characterOctetLength=0, numericPrecision=20, numericScale=0, datetimePrecision=0, characterSetName='null', collationName='null', columnType='bigint(20) unsigned', columnKey='', extra='', privileges='select,insert,update,references', columnComment='', generationExpression=''}*/
private Long sortUsingRange;

/**Column{tableCatalog='def', tableSchema='sys', tableName='x$statements_with_sorting', columnName='rows_sorted', ordinalPosition=9, columnDefault='null', isNullable='NO', dataType='bigint', characterMaximumLength=0, characterOctetLength=0, numericPrecision=20, numericScale=0, datetimePrecision=0, characterSetName='null', collationName='null', columnType='bigint(20) unsigned', columnKey='', extra='', privileges='select,insert,update,references', columnComment='', generationExpression=''}*/
private Long rowsSorted;

/**Column{tableCatalog='def', tableSchema='sys', tableName='x$statements_with_sorting', columnName='avg_rows_sorted', ordinalPosition=10, columnDefault='0', isNullable='NO', dataType='decimal', characterMaximumLength=0, characterOctetLength=0, numericPrecision=21, numericScale=0, datetimePrecision=0, characterSetName='null', collationName='null', columnType='decimal(21,0)', columnKey='', extra='', privileges='select,insert,update,references', columnComment='', generationExpression=''}*/
private Double avgRowsSorted;

/**Column{tableCatalog='def', tableSchema='sys', tableName='x$statements_with_sorting', columnName='first_seen', ordinalPosition=11, columnDefault='0000-00-00 00:00:00', isNullable='NO', dataType='timestamp', characterMaximumLength=0, characterOctetLength=0, numericPrecision=0, numericScale=0, datetimePrecision=0, characterSetName='null', collationName='null', columnType='timestamp', columnKey='', extra='', privileges='select,insert,update,references', columnComment='', generationExpression=''}*/
private Date firstSeen;

/**Column{tableCatalog='def', tableSchema='sys', tableName='x$statements_with_sorting', columnName='last_seen', ordinalPosition=12, columnDefault='0000-00-00 00:00:00', isNullable='NO', dataType='timestamp', characterMaximumLength=0, characterOctetLength=0, numericPrecision=0, numericScale=0, datetimePrecision=0, characterSetName='null', collationName='null', columnType='timestamp', columnKey='', extra='', privileges='select,insert,update,references', columnComment='', generationExpression=''}*/
private Date lastSeen;

/**Column{tableCatalog='def', tableSchema='sys', tableName='x$statements_with_sorting', columnName='digest', ordinalPosition=13, columnDefault='null', isNullable='YES', dataType='varchar', characterMaximumLength=32, characterOctetLength=96, numericPrecision=0, numericScale=0, datetimePrecision=0, characterSetName='utf8', collationName='utf8_general_ci', columnType='varchar(32)', columnKey='', extra='', privileges='select,insert,update,references', columnComment='', generationExpression=''}*/
private String digest;

public String getQuery(){
return query;
}

public String getDb(){
return db;
}

public Long getExecCount(){
return execCount;
}

public Long getTotalLatency(){
return totalLatency;
}

public Long getSortMergePasses(){
return sortMergePasses;
}

public Double getAvgSortMerges(){
return avgSortMerges;
}

public Long getSortsUsingScans(){
return sortsUsingScans;
}

public Long getSortUsingRange(){
return sortUsingRange;
}

public Long getRowsSorted(){
return rowsSorted;
}

public Double getAvgRowsSorted(){
return avgRowsSorted;
}

public Date getFirstSeen(){
return firstSeen;
}

public Date getLastSeen(){
return lastSeen;
}

public String getDigest(){
return digest;
}

}