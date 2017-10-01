package db.bean.performance_schema;

import java.util.Date;

/**
*/
public class PreparedStatementsInstances{
/**Column{tableCatalog='def', tableSchema='performance_schema', tableName='prepared_statements_instances', columnName='OBJECT_INSTANCE_BEGIN', ordinalPosition=1, columnDefault='null', isNullable='NO', dataType='bigint', characterMaximumLength=0, characterOctetLength=0, numericPrecision=20, numericScale=0, datetimePrecision=0, characterSetName='null', collationName='null', columnType='bigint(20) unsigned', columnKey='', extra='', privileges='select,insert,update,references', columnComment='', generationExpression=''}*/
private Long objectInstanceBegin;

/**Column{tableCatalog='def', tableSchema='performance_schema', tableName='prepared_statements_instances', columnName='STATEMENT_ID', ordinalPosition=2, columnDefault='null', isNullable='NO', dataType='bigint', characterMaximumLength=0, characterOctetLength=0, numericPrecision=20, numericScale=0, datetimePrecision=0, characterSetName='null', collationName='null', columnType='bigint(20) unsigned', columnKey='', extra='', privileges='select,insert,update,references', columnComment='', generationExpression=''}*/
private Long statementId;

/**Column{tableCatalog='def', tableSchema='performance_schema', tableName='prepared_statements_instances', columnName='STATEMENT_NAME', ordinalPosition=3, columnDefault='null', isNullable='YES', dataType='varchar', characterMaximumLength=64, characterOctetLength=192, numericPrecision=0, numericScale=0, datetimePrecision=0, characterSetName='utf8', collationName='utf8_general_ci', columnType='varchar(64)', columnKey='', extra='', privileges='select,insert,update,references', columnComment='', generationExpression=''}*/
private String statementName;

/**Column{tableCatalog='def', tableSchema='performance_schema', tableName='prepared_statements_instances', columnName='SQL_TEXT', ordinalPosition=4, columnDefault='null', isNullable='NO', dataType='longtext', characterMaximumLength=4294967295, characterOctetLength=4294967295, numericPrecision=0, numericScale=0, datetimePrecision=0, characterSetName='utf8', collationName='utf8_general_ci', columnType='longtext', columnKey='', extra='', privileges='select,insert,update,references', columnComment='', generationExpression=''}*/
private String sqlText;

/**Column{tableCatalog='def', tableSchema='performance_schema', tableName='prepared_statements_instances', columnName='OWNER_THREAD_ID', ordinalPosition=5, columnDefault='null', isNullable='NO', dataType='bigint', characterMaximumLength=0, characterOctetLength=0, numericPrecision=20, numericScale=0, datetimePrecision=0, characterSetName='null', collationName='null', columnType='bigint(20) unsigned', columnKey='', extra='', privileges='select,insert,update,references', columnComment='', generationExpression=''}*/
private Long ownerThreadId;

/**Column{tableCatalog='def', tableSchema='performance_schema', tableName='prepared_statements_instances', columnName='OWNER_EVENT_ID', ordinalPosition=6, columnDefault='null', isNullable='NO', dataType='bigint', characterMaximumLength=0, characterOctetLength=0, numericPrecision=20, numericScale=0, datetimePrecision=0, characterSetName='null', collationName='null', columnType='bigint(20) unsigned', columnKey='', extra='', privileges='select,insert,update,references', columnComment='', generationExpression=''}*/
private Long ownerEventId;

/**Column{tableCatalog='def', tableSchema='performance_schema', tableName='prepared_statements_instances', columnName='OWNER_OBJECT_TYPE', ordinalPosition=7, columnDefault='null', isNullable='YES', dataType='enum', characterMaximumLength=9, characterOctetLength=27, numericPrecision=0, numericScale=0, datetimePrecision=0, characterSetName='utf8', collationName='utf8_general_ci', columnType='enum('EVENT','FUNCTION','PROCEDURE','TABLE','TRIGGER')', columnKey='', extra='', privileges='select,insert,update,references', columnComment='', generationExpression=''}*/
private Date ownerObjectType;

/**Column{tableCatalog='def', tableSchema='performance_schema', tableName='prepared_statements_instances', columnName='OWNER_OBJECT_SCHEMA', ordinalPosition=8, columnDefault='null', isNullable='YES', dataType='varchar', characterMaximumLength=64, characterOctetLength=192, numericPrecision=0, numericScale=0, datetimePrecision=0, characterSetName='utf8', collationName='utf8_general_ci', columnType='varchar(64)', columnKey='', extra='', privileges='select,insert,update,references', columnComment='', generationExpression=''}*/
private String ownerObjectSchema;

/**Column{tableCatalog='def', tableSchema='performance_schema', tableName='prepared_statements_instances', columnName='OWNER_OBJECT_NAME', ordinalPosition=9, columnDefault='null', isNullable='YES', dataType='varchar', characterMaximumLength=64, characterOctetLength=192, numericPrecision=0, numericScale=0, datetimePrecision=0, characterSetName='utf8', collationName='utf8_general_ci', columnType='varchar(64)', columnKey='', extra='', privileges='select,insert,update,references', columnComment='', generationExpression=''}*/
private String ownerObjectName;

/**Column{tableCatalog='def', tableSchema='performance_schema', tableName='prepared_statements_instances', columnName='TIMER_PREPARE', ordinalPosition=10, columnDefault='null', isNullable='NO', dataType='bigint', characterMaximumLength=0, characterOctetLength=0, numericPrecision=20, numericScale=0, datetimePrecision=0, characterSetName='null', collationName='null', columnType='bigint(20) unsigned', columnKey='', extra='', privileges='select,insert,update,references', columnComment='', generationExpression=''}*/
private Long timerPrepare;

/**Column{tableCatalog='def', tableSchema='performance_schema', tableName='prepared_statements_instances', columnName='COUNT_REPREPARE', ordinalPosition=11, columnDefault='null', isNullable='NO', dataType='bigint', characterMaximumLength=0, characterOctetLength=0, numericPrecision=20, numericScale=0, datetimePrecision=0, characterSetName='null', collationName='null', columnType='bigint(20) unsigned', columnKey='', extra='', privileges='select,insert,update,references', columnComment='', generationExpression=''}*/
private Long countReprepare;

/**Column{tableCatalog='def', tableSchema='performance_schema', tableName='prepared_statements_instances', columnName='COUNT_EXECUTE', ordinalPosition=12, columnDefault='null', isNullable='NO', dataType='bigint', characterMaximumLength=0, characterOctetLength=0, numericPrecision=20, numericScale=0, datetimePrecision=0, characterSetName='null', collationName='null', columnType='bigint(20) unsigned', columnKey='', extra='', privileges='select,insert,update,references', columnComment='', generationExpression=''}*/
private Long countExecute;

/**Column{tableCatalog='def', tableSchema='performance_schema', tableName='prepared_statements_instances', columnName='SUM_TIMER_EXECUTE', ordinalPosition=13, columnDefault='null', isNullable='NO', dataType='bigint', characterMaximumLength=0, characterOctetLength=0, numericPrecision=20, numericScale=0, datetimePrecision=0, characterSetName='null', collationName='null', columnType='bigint(20) unsigned', columnKey='', extra='', privileges='select,insert,update,references', columnComment='', generationExpression=''}*/
private Long sumTimerExecute;

/**Column{tableCatalog='def', tableSchema='performance_schema', tableName='prepared_statements_instances', columnName='MIN_TIMER_EXECUTE', ordinalPosition=14, columnDefault='null', isNullable='NO', dataType='bigint', characterMaximumLength=0, characterOctetLength=0, numericPrecision=20, numericScale=0, datetimePrecision=0, characterSetName='null', collationName='null', columnType='bigint(20) unsigned', columnKey='', extra='', privileges='select,insert,update,references', columnComment='', generationExpression=''}*/
private Long minTimerExecute;

/**Column{tableCatalog='def', tableSchema='performance_schema', tableName='prepared_statements_instances', columnName='AVG_TIMER_EXECUTE', ordinalPosition=15, columnDefault='null', isNullable='NO', dataType='bigint', characterMaximumLength=0, characterOctetLength=0, numericPrecision=20, numericScale=0, datetimePrecision=0, characterSetName='null', collationName='null', columnType='bigint(20) unsigned', columnKey='', extra='', privileges='select,insert,update,references', columnComment='', generationExpression=''}*/
private Long avgTimerExecute;

/**Column{tableCatalog='def', tableSchema='performance_schema', tableName='prepared_statements_instances', columnName='MAX_TIMER_EXECUTE', ordinalPosition=16, columnDefault='null', isNullable='NO', dataType='bigint', characterMaximumLength=0, characterOctetLength=0, numericPrecision=20, numericScale=0, datetimePrecision=0, characterSetName='null', collationName='null', columnType='bigint(20) unsigned', columnKey='', extra='', privileges='select,insert,update,references', columnComment='', generationExpression=''}*/
private Long maxTimerExecute;

/**Column{tableCatalog='def', tableSchema='performance_schema', tableName='prepared_statements_instances', columnName='SUM_LOCK_TIME', ordinalPosition=17, columnDefault='null', isNullable='NO', dataType='bigint', characterMaximumLength=0, characterOctetLength=0, numericPrecision=20, numericScale=0, datetimePrecision=0, characterSetName='null', collationName='null', columnType='bigint(20) unsigned', columnKey='', extra='', privileges='select,insert,update,references', columnComment='', generationExpression=''}*/
private Long sumLockTime;

/**Column{tableCatalog='def', tableSchema='performance_schema', tableName='prepared_statements_instances', columnName='SUM_ERRORS', ordinalPosition=18, columnDefault='null', isNullable='NO', dataType='bigint', characterMaximumLength=0, characterOctetLength=0, numericPrecision=20, numericScale=0, datetimePrecision=0, characterSetName='null', collationName='null', columnType='bigint(20) unsigned', columnKey='', extra='', privileges='select,insert,update,references', columnComment='', generationExpression=''}*/
private Long sumErrors;

/**Column{tableCatalog='def', tableSchema='performance_schema', tableName='prepared_statements_instances', columnName='SUM_WARNINGS', ordinalPosition=19, columnDefault='null', isNullable='NO', dataType='bigint', characterMaximumLength=0, characterOctetLength=0, numericPrecision=20, numericScale=0, datetimePrecision=0, characterSetName='null', collationName='null', columnType='bigint(20) unsigned', columnKey='', extra='', privileges='select,insert,update,references', columnComment='', generationExpression=''}*/
private Long sumWarnings;

/**Column{tableCatalog='def', tableSchema='performance_schema', tableName='prepared_statements_instances', columnName='SUM_ROWS_AFFECTED', ordinalPosition=20, columnDefault='null', isNullable='NO', dataType='bigint', characterMaximumLength=0, characterOctetLength=0, numericPrecision=20, numericScale=0, datetimePrecision=0, characterSetName='null', collationName='null', columnType='bigint(20) unsigned', columnKey='', extra='', privileges='select,insert,update,references', columnComment='', generationExpression=''}*/
private Long sumRowsAffected;

/**Column{tableCatalog='def', tableSchema='performance_schema', tableName='prepared_statements_instances', columnName='SUM_ROWS_SENT', ordinalPosition=21, columnDefault='null', isNullable='NO', dataType='bigint', characterMaximumLength=0, characterOctetLength=0, numericPrecision=20, numericScale=0, datetimePrecision=0, characterSetName='null', collationName='null', columnType='bigint(20) unsigned', columnKey='', extra='', privileges='select,insert,update,references', columnComment='', generationExpression=''}*/
private Long sumRowsSent;

/**Column{tableCatalog='def', tableSchema='performance_schema', tableName='prepared_statements_instances', columnName='SUM_ROWS_EXAMINED', ordinalPosition=22, columnDefault='null', isNullable='NO', dataType='bigint', characterMaximumLength=0, characterOctetLength=0, numericPrecision=20, numericScale=0, datetimePrecision=0, characterSetName='null', collationName='null', columnType='bigint(20) unsigned', columnKey='', extra='', privileges='select,insert,update,references', columnComment='', generationExpression=''}*/
private Long sumRowsExamined;

/**Column{tableCatalog='def', tableSchema='performance_schema', tableName='prepared_statements_instances', columnName='SUM_CREATED_TMP_DISK_TABLES', ordinalPosition=23, columnDefault='null', isNullable='NO', dataType='bigint', characterMaximumLength=0, characterOctetLength=0, numericPrecision=20, numericScale=0, datetimePrecision=0, characterSetName='null', collationName='null', columnType='bigint(20) unsigned', columnKey='', extra='', privileges='select,insert,update,references', columnComment='', generationExpression=''}*/
private Long sumCreatedTmpDiskTables;

/**Column{tableCatalog='def', tableSchema='performance_schema', tableName='prepared_statements_instances', columnName='SUM_CREATED_TMP_TABLES', ordinalPosition=24, columnDefault='null', isNullable='NO', dataType='bigint', characterMaximumLength=0, characterOctetLength=0, numericPrecision=20, numericScale=0, datetimePrecision=0, characterSetName='null', collationName='null', columnType='bigint(20) unsigned', columnKey='', extra='', privileges='select,insert,update,references', columnComment='', generationExpression=''}*/
private Long sumCreatedTmpTables;

/**Column{tableCatalog='def', tableSchema='performance_schema', tableName='prepared_statements_instances', columnName='SUM_SELECT_FULL_JOIN', ordinalPosition=25, columnDefault='null', isNullable='NO', dataType='bigint', characterMaximumLength=0, characterOctetLength=0, numericPrecision=20, numericScale=0, datetimePrecision=0, characterSetName='null', collationName='null', columnType='bigint(20) unsigned', columnKey='', extra='', privileges='select,insert,update,references', columnComment='', generationExpression=''}*/
private Long sumSelectFullJoin;

/**Column{tableCatalog='def', tableSchema='performance_schema', tableName='prepared_statements_instances', columnName='SUM_SELECT_FULL_RANGE_JOIN', ordinalPosition=26, columnDefault='null', isNullable='NO', dataType='bigint', characterMaximumLength=0, characterOctetLength=0, numericPrecision=20, numericScale=0, datetimePrecision=0, characterSetName='null', collationName='null', columnType='bigint(20) unsigned', columnKey='', extra='', privileges='select,insert,update,references', columnComment='', generationExpression=''}*/
private Long sumSelectFullRangeJoin;

/**Column{tableCatalog='def', tableSchema='performance_schema', tableName='prepared_statements_instances', columnName='SUM_SELECT_RANGE', ordinalPosition=27, columnDefault='null', isNullable='NO', dataType='bigint', characterMaximumLength=0, characterOctetLength=0, numericPrecision=20, numericScale=0, datetimePrecision=0, characterSetName='null', collationName='null', columnType='bigint(20) unsigned', columnKey='', extra='', privileges='select,insert,update,references', columnComment='', generationExpression=''}*/
private Long sumSelectRange;

/**Column{tableCatalog='def', tableSchema='performance_schema', tableName='prepared_statements_instances', columnName='SUM_SELECT_RANGE_CHECK', ordinalPosition=28, columnDefault='null', isNullable='NO', dataType='bigint', characterMaximumLength=0, characterOctetLength=0, numericPrecision=20, numericScale=0, datetimePrecision=0, characterSetName='null', collationName='null', columnType='bigint(20) unsigned', columnKey='', extra='', privileges='select,insert,update,references', columnComment='', generationExpression=''}*/
private Long sumSelectRangeCheck;

/**Column{tableCatalog='def', tableSchema='performance_schema', tableName='prepared_statements_instances', columnName='SUM_SELECT_SCAN', ordinalPosition=29, columnDefault='null', isNullable='NO', dataType='bigint', characterMaximumLength=0, characterOctetLength=0, numericPrecision=20, numericScale=0, datetimePrecision=0, characterSetName='null', collationName='null', columnType='bigint(20) unsigned', columnKey='', extra='', privileges='select,insert,update,references', columnComment='', generationExpression=''}*/
private Long sumSelectScan;

/**Column{tableCatalog='def', tableSchema='performance_schema', tableName='prepared_statements_instances', columnName='SUM_SORT_MERGE_PASSES', ordinalPosition=30, columnDefault='null', isNullable='NO', dataType='bigint', characterMaximumLength=0, characterOctetLength=0, numericPrecision=20, numericScale=0, datetimePrecision=0, characterSetName='null', collationName='null', columnType='bigint(20) unsigned', columnKey='', extra='', privileges='select,insert,update,references', columnComment='', generationExpression=''}*/
private Long sumSortMergePasses;

/**Column{tableCatalog='def', tableSchema='performance_schema', tableName='prepared_statements_instances', columnName='SUM_SORT_RANGE', ordinalPosition=31, columnDefault='null', isNullable='NO', dataType='bigint', characterMaximumLength=0, characterOctetLength=0, numericPrecision=20, numericScale=0, datetimePrecision=0, characterSetName='null', collationName='null', columnType='bigint(20) unsigned', columnKey='', extra='', privileges='select,insert,update,references', columnComment='', generationExpression=''}*/
private Long sumSortRange;

/**Column{tableCatalog='def', tableSchema='performance_schema', tableName='prepared_statements_instances', columnName='SUM_SORT_ROWS', ordinalPosition=32, columnDefault='null', isNullable='NO', dataType='bigint', characterMaximumLength=0, characterOctetLength=0, numericPrecision=20, numericScale=0, datetimePrecision=0, characterSetName='null', collationName='null', columnType='bigint(20) unsigned', columnKey='', extra='', privileges='select,insert,update,references', columnComment='', generationExpression=''}*/
private Long sumSortRows;

/**Column{tableCatalog='def', tableSchema='performance_schema', tableName='prepared_statements_instances', columnName='SUM_SORT_SCAN', ordinalPosition=33, columnDefault='null', isNullable='NO', dataType='bigint', characterMaximumLength=0, characterOctetLength=0, numericPrecision=20, numericScale=0, datetimePrecision=0, characterSetName='null', collationName='null', columnType='bigint(20) unsigned', columnKey='', extra='', privileges='select,insert,update,references', columnComment='', generationExpression=''}*/
private Long sumSortScan;

/**Column{tableCatalog='def', tableSchema='performance_schema', tableName='prepared_statements_instances', columnName='SUM_NO_INDEX_USED', ordinalPosition=34, columnDefault='null', isNullable='NO', dataType='bigint', characterMaximumLength=0, characterOctetLength=0, numericPrecision=20, numericScale=0, datetimePrecision=0, characterSetName='null', collationName='null', columnType='bigint(20) unsigned', columnKey='', extra='', privileges='select,insert,update,references', columnComment='', generationExpression=''}*/
private Long sumNoIndexUsed;

/**Column{tableCatalog='def', tableSchema='performance_schema', tableName='prepared_statements_instances', columnName='SUM_NO_GOOD_INDEX_USED', ordinalPosition=35, columnDefault='null', isNullable='NO', dataType='bigint', characterMaximumLength=0, characterOctetLength=0, numericPrecision=20, numericScale=0, datetimePrecision=0, characterSetName='null', collationName='null', columnType='bigint(20) unsigned', columnKey='', extra='', privileges='select,insert,update,references', columnComment='', generationExpression=''}*/
private Long sumNoGoodIndexUsed;

public Long getObjectInstanceBegin(){
return objectInstanceBegin;
}

public Long getStatementId(){
return statementId;
}

public String getStatementName(){
return statementName;
}

public String getSqlText(){
return sqlText;
}

public Long getOwnerThreadId(){
return ownerThreadId;
}

public Long getOwnerEventId(){
return ownerEventId;
}

public Date getOwnerObjectType(){
return ownerObjectType;
}

public String getOwnerObjectSchema(){
return ownerObjectSchema;
}

public String getOwnerObjectName(){
return ownerObjectName;
}

public Long getTimerPrepare(){
return timerPrepare;
}

public Long getCountReprepare(){
return countReprepare;
}

public Long getCountExecute(){
return countExecute;
}

public Long getSumTimerExecute(){
return sumTimerExecute;
}

public Long getMinTimerExecute(){
return minTimerExecute;
}

public Long getAvgTimerExecute(){
return avgTimerExecute;
}

public Long getMaxTimerExecute(){
return maxTimerExecute;
}

public Long getSumLockTime(){
return sumLockTime;
}

public Long getSumErrors(){
return sumErrors;
}

public Long getSumWarnings(){
return sumWarnings;
}

public Long getSumRowsAffected(){
return sumRowsAffected;
}

public Long getSumRowsSent(){
return sumRowsSent;
}

public Long getSumRowsExamined(){
return sumRowsExamined;
}

public Long getSumCreatedTmpDiskTables(){
return sumCreatedTmpDiskTables;
}

public Long getSumCreatedTmpTables(){
return sumCreatedTmpTables;
}

public Long getSumSelectFullJoin(){
return sumSelectFullJoin;
}

public Long getSumSelectFullRangeJoin(){
return sumSelectFullRangeJoin;
}

public Long getSumSelectRange(){
return sumSelectRange;
}

public Long getSumSelectRangeCheck(){
return sumSelectRangeCheck;
}

public Long getSumSelectScan(){
return sumSelectScan;
}

public Long getSumSortMergePasses(){
return sumSortMergePasses;
}

public Long getSumSortRange(){
return sumSortRange;
}

public Long getSumSortRows(){
return sumSortRows;
}

public Long getSumSortScan(){
return sumSortScan;
}

public Long getSumNoIndexUsed(){
return sumNoIndexUsed;
}

public Long getSumNoGoodIndexUsed(){
return sumNoGoodIndexUsed;
}

}