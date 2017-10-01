package db.bean.performance_schema;


/**
*/
public class ReplicationGroupMemberStats{
/**Column{tableCatalog='def', tableSchema='performance_schema', tableName='replication_group_member_stats', columnName='CHANNEL_NAME', ordinalPosition=1, columnDefault='null', isNullable='NO', dataType='char', characterMaximumLength=64, characterOctetLength=192, numericPrecision=0, numericScale=0, datetimePrecision=0, characterSetName='utf8', collationName='utf8_general_ci', columnType='char(64)', columnKey='', extra='', privileges='select,insert,update,references', columnComment='', generationExpression=''}*/
private String channelName;

/**Column{tableCatalog='def', tableSchema='performance_schema', tableName='replication_group_member_stats', columnName='VIEW_ID', ordinalPosition=2, columnDefault='null', isNullable='NO', dataType='char', characterMaximumLength=60, characterOctetLength=180, numericPrecision=0, numericScale=0, datetimePrecision=0, characterSetName='utf8', collationName='utf8_bin', columnType='char(60)', columnKey='', extra='', privileges='select,insert,update,references', columnComment='', generationExpression=''}*/
private String viewId;

/**Column{tableCatalog='def', tableSchema='performance_schema', tableName='replication_group_member_stats', columnName='MEMBER_ID', ordinalPosition=3, columnDefault='null', isNullable='NO', dataType='char', characterMaximumLength=36, characterOctetLength=108, numericPrecision=0, numericScale=0, datetimePrecision=0, characterSetName='utf8', collationName='utf8_bin', columnType='char(36)', columnKey='', extra='', privileges='select,insert,update,references', columnComment='', generationExpression=''}*/
private String memberId;

/**Column{tableCatalog='def', tableSchema='performance_schema', tableName='replication_group_member_stats', columnName='COUNT_TRANSACTIONS_IN_QUEUE', ordinalPosition=4, columnDefault='null', isNullable='NO', dataType='bigint', characterMaximumLength=0, characterOctetLength=0, numericPrecision=20, numericScale=0, datetimePrecision=0, characterSetName='null', collationName='null', columnType='bigint(20) unsigned', columnKey='', extra='', privileges='select,insert,update,references', columnComment='', generationExpression=''}*/
private Long countTransactionsInQueue;

/**Column{tableCatalog='def', tableSchema='performance_schema', tableName='replication_group_member_stats', columnName='COUNT_TRANSACTIONS_CHECKED', ordinalPosition=5, columnDefault='null', isNullable='NO', dataType='bigint', characterMaximumLength=0, characterOctetLength=0, numericPrecision=20, numericScale=0, datetimePrecision=0, characterSetName='null', collationName='null', columnType='bigint(20) unsigned', columnKey='', extra='', privileges='select,insert,update,references', columnComment='', generationExpression=''}*/
private Long countTransactionsChecked;

/**Column{tableCatalog='def', tableSchema='performance_schema', tableName='replication_group_member_stats', columnName='COUNT_CONFLICTS_DETECTED', ordinalPosition=6, columnDefault='null', isNullable='NO', dataType='bigint', characterMaximumLength=0, characterOctetLength=0, numericPrecision=20, numericScale=0, datetimePrecision=0, characterSetName='null', collationName='null', columnType='bigint(20) unsigned', columnKey='', extra='', privileges='select,insert,update,references', columnComment='', generationExpression=''}*/
private Long countConflictsDetected;

/**Column{tableCatalog='def', tableSchema='performance_schema', tableName='replication_group_member_stats', columnName='COUNT_TRANSACTIONS_ROWS_VALIDATING', ordinalPosition=7, columnDefault='null', isNullable='NO', dataType='bigint', characterMaximumLength=0, characterOctetLength=0, numericPrecision=20, numericScale=0, datetimePrecision=0, characterSetName='null', collationName='null', columnType='bigint(20) unsigned', columnKey='', extra='', privileges='select,insert,update,references', columnComment='', generationExpression=''}*/
private Long countTransactionsRowsValidating;

/**Column{tableCatalog='def', tableSchema='performance_schema', tableName='replication_group_member_stats', columnName='TRANSACTIONS_COMMITTED_ALL_MEMBERS', ordinalPosition=8, columnDefault='null', isNullable='NO', dataType='longtext', characterMaximumLength=4294967295, characterOctetLength=4294967295, numericPrecision=0, numericScale=0, datetimePrecision=0, characterSetName='utf8', collationName='utf8_general_ci', columnType='longtext', columnKey='', extra='', privileges='select,insert,update,references', columnComment='', generationExpression=''}*/
private String transactionsCommittedAllMembers;

/**Column{tableCatalog='def', tableSchema='performance_schema', tableName='replication_group_member_stats', columnName='LAST_CONFLICT_FREE_TRANSACTION', ordinalPosition=9, columnDefault='null', isNullable='NO', dataType='text', characterMaximumLength=65535, characterOctetLength=65535, numericPrecision=0, numericScale=0, datetimePrecision=0, characterSetName='utf8', collationName='utf8_general_ci', columnType='text', columnKey='', extra='', privileges='select,insert,update,references', columnComment='', generationExpression=''}*/
private String lastConflictFreeTransaction;

public String getChannelName(){
return channelName;
}

public String getViewId(){
return viewId;
}

public String getMemberId(){
return memberId;
}

public Long getCountTransactionsInQueue(){
return countTransactionsInQueue;
}

public Long getCountTransactionsChecked(){
return countTransactionsChecked;
}

public Long getCountConflictsDetected(){
return countConflictsDetected;
}

public Long getCountTransactionsRowsValidating(){
return countTransactionsRowsValidating;
}

public String getTransactionsCommittedAllMembers(){
return transactionsCommittedAllMembers;
}

public String getLastConflictFreeTransaction(){
return lastConflictFreeTransaction;
}

}