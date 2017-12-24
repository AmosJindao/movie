package db.bean.mysql;

import java.util.Date;

/* SELECT database_name AS databaseName, table_name AS tableName, index_name AS indexName, last_update AS lastUpdate, stat_name AS statName, stat_value AS statValue, sample_size AS sampleSize, stat_description AS statDescription FROM mysql.innodb_index_stats */
/**
*/
public class InnodbIndexStats{
/**Column{tableCatalog='def', tableSchema='mysql', tableName='innodb_index_stats', columnName='database_name', ordinalPosition=1, columnDefault='null', isNullable='NO', dataType='varchar', characterMaximumLength=64, characterOctetLength=192, numericPrecision=0, numericScale=0, datetimePrecision=0, characterSetName='utf8', collationName='utf8_bin', columnType='varchar(64)', columnKey='PRI', extra='', privileges='select,insert,update,references', columnComment='', generationExpression=''}*/
private String databaseName;

/**Column{tableCatalog='def', tableSchema='mysql', tableName='innodb_index_stats', columnName='table_name', ordinalPosition=2, columnDefault='null', isNullable='NO', dataType='varchar', characterMaximumLength=64, characterOctetLength=192, numericPrecision=0, numericScale=0, datetimePrecision=0, characterSetName='utf8', collationName='utf8_bin', columnType='varchar(64)', columnKey='PRI', extra='', privileges='select,insert,update,references', columnComment='', generationExpression=''}*/
private String tableName;

/**Column{tableCatalog='def', tableSchema='mysql', tableName='innodb_index_stats', columnName='index_name', ordinalPosition=3, columnDefault='null', isNullable='NO', dataType='varchar', characterMaximumLength=64, characterOctetLength=192, numericPrecision=0, numericScale=0, datetimePrecision=0, characterSetName='utf8', collationName='utf8_bin', columnType='varchar(64)', columnKey='PRI', extra='', privileges='select,insert,update,references', columnComment='', generationExpression=''}*/
private String indexName;

/**Column{tableCatalog='def', tableSchema='mysql', tableName='innodb_index_stats', columnName='last_update', ordinalPosition=4, columnDefault='CURRENT_TIMESTAMP', isNullable='NO', dataType='timestamp', characterMaximumLength=0, characterOctetLength=0, numericPrecision=0, numericScale=0, datetimePrecision=0, characterSetName='null', collationName='null', columnType='timestamp', columnKey='', extra='on update CURRENT_TIMESTAMP', privileges='select,insert,update,references', columnComment='', generationExpression=''}*/
private Date lastUpdate;

/**Column{tableCatalog='def', tableSchema='mysql', tableName='innodb_index_stats', columnName='stat_name', ordinalPosition=5, columnDefault='null', isNullable='NO', dataType='varchar', characterMaximumLength=64, characterOctetLength=192, numericPrecision=0, numericScale=0, datetimePrecision=0, characterSetName='utf8', collationName='utf8_bin', columnType='varchar(64)', columnKey='PRI', extra='', privileges='select,insert,update,references', columnComment='', generationExpression=''}*/
private String statName;

/**Column{tableCatalog='def', tableSchema='mysql', tableName='innodb_index_stats', columnName='stat_value', ordinalPosition=6, columnDefault='null', isNullable='NO', dataType='bigint', characterMaximumLength=0, characterOctetLength=0, numericPrecision=20, numericScale=0, datetimePrecision=0, characterSetName='null', collationName='null', columnType='bigint(20) unsigned', columnKey='', extra='', privileges='select,insert,update,references', columnComment='', generationExpression=''}*/
private Long statValue;

/**Column{tableCatalog='def', tableSchema='mysql', tableName='innodb_index_stats', columnName='sample_size', ordinalPosition=7, columnDefault='null', isNullable='YES', dataType='bigint', characterMaximumLength=0, characterOctetLength=0, numericPrecision=20, numericScale=0, datetimePrecision=0, characterSetName='null', collationName='null', columnType='bigint(20) unsigned', columnKey='', extra='', privileges='select,insert,update,references', columnComment='', generationExpression=''}*/
private Long sampleSize;

/**Column{tableCatalog='def', tableSchema='mysql', tableName='innodb_index_stats', columnName='stat_description', ordinalPosition=8, columnDefault='null', isNullable='NO', dataType='varchar', characterMaximumLength=1024, characterOctetLength=3072, numericPrecision=0, numericScale=0, datetimePrecision=0, characterSetName='utf8', collationName='utf8_bin', columnType='varchar(1024)', columnKey='', extra='', privileges='select,insert,update,references', columnComment='', generationExpression=''}*/
private String statDescription;

public String getDatabaseName(){
return databaseName;
}

public String getTableName(){
return tableName;
}

public String getIndexName(){
return indexName;
}

public Date getLastUpdate(){
return lastUpdate;
}

public String getStatName(){
return statName;
}

public Long getStatValue(){
return statValue;
}

public Long getSampleSize(){
return sampleSize;
}

public String getStatDescription(){
return statDescription;
}

}