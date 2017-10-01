package db.bean.information_schema;

import java.util.Date;

/**
*/
public class InnodbMetrics{
/**Column{tableCatalog='def', tableSchema='information_schema', tableName='INNODB_METRICS', columnName='NAME', ordinalPosition=1, columnDefault='', isNullable='NO', dataType='varchar', characterMaximumLength=193, characterOctetLength=579, numericPrecision=0, numericScale=0, datetimePrecision=0, characterSetName='utf8', collationName='utf8_general_ci', columnType='varchar(193)', columnKey='', extra='', privileges='select', columnComment='', generationExpression=''}*/
private String name;

/**Column{tableCatalog='def', tableSchema='information_schema', tableName='INNODB_METRICS', columnName='SUBSYSTEM', ordinalPosition=2, columnDefault='', isNullable='NO', dataType='varchar', characterMaximumLength=193, characterOctetLength=579, numericPrecision=0, numericScale=0, datetimePrecision=0, characterSetName='utf8', collationName='utf8_general_ci', columnType='varchar(193)', columnKey='', extra='', privileges='select', columnComment='', generationExpression=''}*/
private String subsystem;

/**Column{tableCatalog='def', tableSchema='information_schema', tableName='INNODB_METRICS', columnName='COUNT', ordinalPosition=3, columnDefault='0', isNullable='NO', dataType='bigint', characterMaximumLength=0, characterOctetLength=0, numericPrecision=19, numericScale=0, datetimePrecision=0, characterSetName='null', collationName='null', columnType='bigint(21)', columnKey='', extra='', privileges='select', columnComment='', generationExpression=''}*/
private Long count;

/**Column{tableCatalog='def', tableSchema='information_schema', tableName='INNODB_METRICS', columnName='MAX_COUNT', ordinalPosition=4, columnDefault='null', isNullable='YES', dataType='bigint', characterMaximumLength=0, characterOctetLength=0, numericPrecision=19, numericScale=0, datetimePrecision=0, characterSetName='null', collationName='null', columnType='bigint(21)', columnKey='', extra='', privileges='select', columnComment='', generationExpression=''}*/
private Long maxCount;

/**Column{tableCatalog='def', tableSchema='information_schema', tableName='INNODB_METRICS', columnName='MIN_COUNT', ordinalPosition=5, columnDefault='null', isNullable='YES', dataType='bigint', characterMaximumLength=0, characterOctetLength=0, numericPrecision=19, numericScale=0, datetimePrecision=0, characterSetName='null', collationName='null', columnType='bigint(21)', columnKey='', extra='', privileges='select', columnComment='', generationExpression=''}*/
private Long minCount;

/**Column{tableCatalog='def', tableSchema='information_schema', tableName='INNODB_METRICS', columnName='AVG_COUNT', ordinalPosition=6, columnDefault='null', isNullable='YES', dataType='double', characterMaximumLength=0, characterOctetLength=0, numericPrecision=12, numericScale=0, datetimePrecision=0, characterSetName='null', collationName='null', columnType='double', columnKey='', extra='', privileges='select', columnComment='', generationExpression=''}*/
private Double avgCount;

/**Column{tableCatalog='def', tableSchema='information_schema', tableName='INNODB_METRICS', columnName='COUNT_RESET', ordinalPosition=7, columnDefault='0', isNullable='NO', dataType='bigint', characterMaximumLength=0, characterOctetLength=0, numericPrecision=19, numericScale=0, datetimePrecision=0, characterSetName='null', collationName='null', columnType='bigint(21)', columnKey='', extra='', privileges='select', columnComment='', generationExpression=''}*/
private Long countReset;

/**Column{tableCatalog='def', tableSchema='information_schema', tableName='INNODB_METRICS', columnName='MAX_COUNT_RESET', ordinalPosition=8, columnDefault='null', isNullable='YES', dataType='bigint', characterMaximumLength=0, characterOctetLength=0, numericPrecision=19, numericScale=0, datetimePrecision=0, characterSetName='null', collationName='null', columnType='bigint(21)', columnKey='', extra='', privileges='select', columnComment='', generationExpression=''}*/
private Long maxCountReset;

/**Column{tableCatalog='def', tableSchema='information_schema', tableName='INNODB_METRICS', columnName='MIN_COUNT_RESET', ordinalPosition=9, columnDefault='null', isNullable='YES', dataType='bigint', characterMaximumLength=0, characterOctetLength=0, numericPrecision=19, numericScale=0, datetimePrecision=0, characterSetName='null', collationName='null', columnType='bigint(21)', columnKey='', extra='', privileges='select', columnComment='', generationExpression=''}*/
private Long minCountReset;

/**Column{tableCatalog='def', tableSchema='information_schema', tableName='INNODB_METRICS', columnName='AVG_COUNT_RESET', ordinalPosition=10, columnDefault='null', isNullable='YES', dataType='double', characterMaximumLength=0, characterOctetLength=0, numericPrecision=12, numericScale=0, datetimePrecision=0, characterSetName='null', collationName='null', columnType='double', columnKey='', extra='', privileges='select', columnComment='', generationExpression=''}*/
private Double avgCountReset;

/**Column{tableCatalog='def', tableSchema='information_schema', tableName='INNODB_METRICS', columnName='TIME_ENABLED', ordinalPosition=11, columnDefault='null', isNullable='YES', dataType='datetime', characterMaximumLength=0, characterOctetLength=0, numericPrecision=0, numericScale=0, datetimePrecision=0, characterSetName='null', collationName='null', columnType='datetime', columnKey='', extra='', privileges='select', columnComment='', generationExpression=''}*/
private Date timeEnabled;

/**Column{tableCatalog='def', tableSchema='information_schema', tableName='INNODB_METRICS', columnName='TIME_DISABLED', ordinalPosition=12, columnDefault='null', isNullable='YES', dataType='datetime', characterMaximumLength=0, characterOctetLength=0, numericPrecision=0, numericScale=0, datetimePrecision=0, characterSetName='null', collationName='null', columnType='datetime', columnKey='', extra='', privileges='select', columnComment='', generationExpression=''}*/
private Date timeDisabled;

/**Column{tableCatalog='def', tableSchema='information_schema', tableName='INNODB_METRICS', columnName='TIME_ELAPSED', ordinalPosition=13, columnDefault='null', isNullable='YES', dataType='bigint', characterMaximumLength=0, characterOctetLength=0, numericPrecision=19, numericScale=0, datetimePrecision=0, characterSetName='null', collationName='null', columnType='bigint(21)', columnKey='', extra='', privileges='select', columnComment='', generationExpression=''}*/
private Long timeElapsed;

/**Column{tableCatalog='def', tableSchema='information_schema', tableName='INNODB_METRICS', columnName='TIME_RESET', ordinalPosition=14, columnDefault='null', isNullable='YES', dataType='datetime', characterMaximumLength=0, characterOctetLength=0, numericPrecision=0, numericScale=0, datetimePrecision=0, characterSetName='null', collationName='null', columnType='datetime', columnKey='', extra='', privileges='select', columnComment='', generationExpression=''}*/
private Date timeReset;

/**Column{tableCatalog='def', tableSchema='information_schema', tableName='INNODB_METRICS', columnName='STATUS', ordinalPosition=15, columnDefault='', isNullable='NO', dataType='varchar', characterMaximumLength=193, characterOctetLength=579, numericPrecision=0, numericScale=0, datetimePrecision=0, characterSetName='utf8', collationName='utf8_general_ci', columnType='varchar(193)', columnKey='', extra='', privileges='select', columnComment='', generationExpression=''}*/
private String status;

/**Column{tableCatalog='def', tableSchema='information_schema', tableName='INNODB_METRICS', columnName='TYPE', ordinalPosition=16, columnDefault='', isNullable='NO', dataType='varchar', characterMaximumLength=193, characterOctetLength=579, numericPrecision=0, numericScale=0, datetimePrecision=0, characterSetName='utf8', collationName='utf8_general_ci', columnType='varchar(193)', columnKey='', extra='', privileges='select', columnComment='', generationExpression=''}*/
private String type;

/**Column{tableCatalog='def', tableSchema='information_schema', tableName='INNODB_METRICS', columnName='COMMENT', ordinalPosition=17, columnDefault='', isNullable='NO', dataType='varchar', characterMaximumLength=193, characterOctetLength=579, numericPrecision=0, numericScale=0, datetimePrecision=0, characterSetName='utf8', collationName='utf8_general_ci', columnType='varchar(193)', columnKey='', extra='', privileges='select', columnComment='', generationExpression=''}*/
private String comment;

public String getName(){
return name;
}

public String getSubsystem(){
return subsystem;
}

public Long getCount(){
return count;
}

public Long getMaxCount(){
return maxCount;
}

public Long getMinCount(){
return minCount;
}

public Double getAvgCount(){
return avgCount;
}

public Long getCountReset(){
return countReset;
}

public Long getMaxCountReset(){
return maxCountReset;
}

public Long getMinCountReset(){
return minCountReset;
}

public Double getAvgCountReset(){
return avgCountReset;
}

public Date getTimeEnabled(){
return timeEnabled;
}

public Date getTimeDisabled(){
return timeDisabled;
}

public Long getTimeElapsed(){
return timeElapsed;
}

public Date getTimeReset(){
return timeReset;
}

public String getStatus(){
return status;
}

public String getType(){
return type;
}

public String getComment(){
return comment;
}

}