package db.bean.performance_schema;


/**
*/
public class ReplicationGroupMembers{
/**Column{tableCatalog='def', tableSchema='performance_schema', tableName='replication_group_members', columnName='CHANNEL_NAME', ordinalPosition=1, columnDefault='null', isNullable='NO', dataType='char', characterMaximumLength=64, characterOctetLength=192, numericPrecision=0, numericScale=0, datetimePrecision=0, characterSetName='utf8', collationName='utf8_general_ci', columnType='char(64)', columnKey='', extra='', privileges='select,insert,update,references', columnComment='', generationExpression=''}*/
private String channelName;

/**Column{tableCatalog='def', tableSchema='performance_schema', tableName='replication_group_members', columnName='MEMBER_ID', ordinalPosition=2, columnDefault='null', isNullable='NO', dataType='char', characterMaximumLength=36, characterOctetLength=108, numericPrecision=0, numericScale=0, datetimePrecision=0, characterSetName='utf8', collationName='utf8_bin', columnType='char(36)', columnKey='', extra='', privileges='select,insert,update,references', columnComment='', generationExpression=''}*/
private String memberId;

/**Column{tableCatalog='def', tableSchema='performance_schema', tableName='replication_group_members', columnName='MEMBER_HOST', ordinalPosition=3, columnDefault='null', isNullable='NO', dataType='char', characterMaximumLength=60, characterOctetLength=180, numericPrecision=0, numericScale=0, datetimePrecision=0, characterSetName='utf8', collationName='utf8_bin', columnType='char(60)', columnKey='', extra='', privileges='select,insert,update,references', columnComment='', generationExpression=''}*/
private String memberHost;

/**Column{tableCatalog='def', tableSchema='performance_schema', tableName='replication_group_members', columnName='MEMBER_PORT', ordinalPosition=4, columnDefault='null', isNullable='YES', dataType='int', characterMaximumLength=0, characterOctetLength=0, numericPrecision=10, numericScale=0, datetimePrecision=0, characterSetName='null', collationName='null', columnType='int(11)', columnKey='', extra='', privileges='select,insert,update,references', columnComment='', generationExpression=''}*/
private Integer memberPort;

/**Column{tableCatalog='def', tableSchema='performance_schema', tableName='replication_group_members', columnName='MEMBER_STATE', ordinalPosition=5, columnDefault='null', isNullable='NO', dataType='char', characterMaximumLength=64, characterOctetLength=192, numericPrecision=0, numericScale=0, datetimePrecision=0, characterSetName='utf8', collationName='utf8_bin', columnType='char(64)', columnKey='', extra='', privileges='select,insert,update,references', columnComment='', generationExpression=''}*/
private String memberState;

public String getChannelName(){
return channelName;
}

public String getMemberId(){
return memberId;
}

public String getMemberHost(){
return memberHost;
}

public Integer getMemberPort(){
return memberPort;
}

public String getMemberState(){
return memberState;
}

}