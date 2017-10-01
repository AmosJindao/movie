package db.bean.mysql;

import java.util.Date;

/**
*/
public class InnodbTableStats{
/**Column{tableCatalog='def', tableSchema='mysql', tableName='innodb_table_stats', columnName='database_name', ordinalPosition=1, columnDefault='null', isNullable='NO', dataType='varchar', characterMaximumLength=64, characterOctetLength=192, numericPrecision=0, numericScale=0, datetimePrecision=0, characterSetName='utf8', collationName='utf8_bin', columnType='varchar(64)', columnKey='PRI', extra='', privileges='select,insert,update,references', columnComment='', generationExpression=''}*/
private String databaseName;

/**Column{tableCatalog='def', tableSchema='mysql', tableName='innodb_table_stats', columnName='table_name', ordinalPosition=2, columnDefault='null', isNullable='NO', dataType='varchar', characterMaximumLength=64, characterOctetLength=192, numericPrecision=0, numericScale=0, datetimePrecision=0, characterSetName='utf8', collationName='utf8_bin', columnType='varchar(64)', columnKey='PRI', extra='', privileges='select,insert,update,references', columnComment='', generationExpression=''}*/
private String tableName;

/**Column{tableCatalog='def', tableSchema='mysql', tableName='innodb_table_stats', columnName='last_update', ordinalPosition=3, columnDefault='CURRENT_TIMESTAMP', isNullable='NO', dataType='timestamp', characterMaximumLength=0, characterOctetLength=0, numericPrecision=0, numericScale=0, datetimePrecision=0, characterSetName='null', collationName='null', columnType='timestamp', columnKey='', extra='on update CURRENT_TIMESTAMP', privileges='select,insert,update,references', columnComment='', generationExpression=''}*/
private Date lastUpdate;

/**Column{tableCatalog='def', tableSchema='mysql', tableName='innodb_table_stats', columnName='n_rows', ordinalPosition=4, columnDefault='null', isNullable='NO', dataType='bigint', characterMaximumLength=0, characterOctetLength=0, numericPrecision=20, numericScale=0, datetimePrecision=0, characterSetName='null', collationName='null', columnType='bigint(20) unsigned', columnKey='', extra='', privileges='select,insert,update,references', columnComment='', generationExpression=''}*/
private Long nRows;

/**Column{tableCatalog='def', tableSchema='mysql', tableName='innodb_table_stats', columnName='clustered_index_size', ordinalPosition=5, columnDefault='null', isNullable='NO', dataType='bigint', characterMaximumLength=0, characterOctetLength=0, numericPrecision=20, numericScale=0, datetimePrecision=0, characterSetName='null', collationName='null', columnType='bigint(20) unsigned', columnKey='', extra='', privileges='select,insert,update,references', columnComment='', generationExpression=''}*/
private Long clusteredIndexSize;

/**Column{tableCatalog='def', tableSchema='mysql', tableName='innodb_table_stats', columnName='sum_of_other_index_sizes', ordinalPosition=6, columnDefault='null', isNullable='NO', dataType='bigint', characterMaximumLength=0, characterOctetLength=0, numericPrecision=20, numericScale=0, datetimePrecision=0, characterSetName='null', collationName='null', columnType='bigint(20) unsigned', columnKey='', extra='', privileges='select,insert,update,references', columnComment='', generationExpression=''}*/
private Long sumOfOtherIndexSizes;

public String getDatabaseName(){
return databaseName;
}

public String getTableName(){
return tableName;
}

public Date getLastUpdate(){
return lastUpdate;
}

public Long getNRows(){
return nRows;
}

public Long getClusteredIndexSize(){
return clusteredIndexSize;
}

public Long getSumOfOtherIndexSizes(){
return sumOfOtherIndexSizes;
}

}