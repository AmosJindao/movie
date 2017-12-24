package db.bean.information_schema;


/* SELECT QUERY_ID AS queryId, SEQ AS seq, STATE AS state, DURATION AS duration, CPU_USER AS cpuUser, CPU_SYSTEM AS cpuSystem, CONTEXT_VOLUNTARY AS contextVoluntary, CONTEXT_INVOLUNTARY AS contextInvoluntary, BLOCK_OPS_IN AS blockOpsIn, BLOCK_OPS_OUT AS blockOpsOut, MESSAGES_SENT AS messagesSent, MESSAGES_RECEIVED AS messagesReceived, PAGE_FAULTS_MAJOR AS pageFaultsMajor, PAGE_FAULTS_MINOR AS pageFaultsMinor, SWAPS AS swaps, SOURCE_FUNCTION AS sourceFunction, SOURCE_FILE AS sourceFile, SOURCE_LINE AS sourceLine FROM information_schema.PROFILING */
/**
*/
public class Profiling{
/**Column{tableCatalog='def', tableSchema='information_schema', tableName='PROFILING', columnName='QUERY_ID', ordinalPosition=1, columnDefault='0', isNullable='NO', dataType='int', characterMaximumLength=0, characterOctetLength=0, numericPrecision=10, numericScale=0, datetimePrecision=0, characterSetName='null', collationName='null', columnType='int(20)', columnKey='', extra='', privileges='select', columnComment='', generationExpression=''}*/
private Integer queryId;

/**Column{tableCatalog='def', tableSchema='information_schema', tableName='PROFILING', columnName='SEQ', ordinalPosition=2, columnDefault='0', isNullable='NO', dataType='int', characterMaximumLength=0, characterOctetLength=0, numericPrecision=10, numericScale=0, datetimePrecision=0, characterSetName='null', collationName='null', columnType='int(20)', columnKey='', extra='', privileges='select', columnComment='', generationExpression=''}*/
private Integer seq;

/**Column{tableCatalog='def', tableSchema='information_schema', tableName='PROFILING', columnName='STATE', ordinalPosition=3, columnDefault='', isNullable='NO', dataType='varchar', characterMaximumLength=30, characterOctetLength=90, numericPrecision=0, numericScale=0, datetimePrecision=0, characterSetName='utf8', collationName='utf8_general_ci', columnType='varchar(30)', columnKey='', extra='', privileges='select', columnComment='', generationExpression=''}*/
private String state;

/**Column{tableCatalog='def', tableSchema='information_schema', tableName='PROFILING', columnName='DURATION', ordinalPosition=4, columnDefault='0.000000', isNullable='NO', dataType='decimal', characterMaximumLength=0, characterOctetLength=0, numericPrecision=9, numericScale=6, datetimePrecision=0, characterSetName='null', collationName='null', columnType='decimal(9,6)', columnKey='', extra='', privileges='select', columnComment='', generationExpression=''}*/
private Double duration;

/**Column{tableCatalog='def', tableSchema='information_schema', tableName='PROFILING', columnName='CPU_USER', ordinalPosition=5, columnDefault='null', isNullable='YES', dataType='decimal', characterMaximumLength=0, characterOctetLength=0, numericPrecision=9, numericScale=6, datetimePrecision=0, characterSetName='null', collationName='null', columnType='decimal(9,6)', columnKey='', extra='', privileges='select', columnComment='', generationExpression=''}*/
private Double cpuUser;

/**Column{tableCatalog='def', tableSchema='information_schema', tableName='PROFILING', columnName='CPU_SYSTEM', ordinalPosition=6, columnDefault='null', isNullable='YES', dataType='decimal', characterMaximumLength=0, characterOctetLength=0, numericPrecision=9, numericScale=6, datetimePrecision=0, characterSetName='null', collationName='null', columnType='decimal(9,6)', columnKey='', extra='', privileges='select', columnComment='', generationExpression=''}*/
private Double cpuSystem;

/**Column{tableCatalog='def', tableSchema='information_schema', tableName='PROFILING', columnName='CONTEXT_VOLUNTARY', ordinalPosition=7, columnDefault='null', isNullable='YES', dataType='int', characterMaximumLength=0, characterOctetLength=0, numericPrecision=10, numericScale=0, datetimePrecision=0, characterSetName='null', collationName='null', columnType='int(20)', columnKey='', extra='', privileges='select', columnComment='', generationExpression=''}*/
private Integer contextVoluntary;

/**Column{tableCatalog='def', tableSchema='information_schema', tableName='PROFILING', columnName='CONTEXT_INVOLUNTARY', ordinalPosition=8, columnDefault='null', isNullable='YES', dataType='int', characterMaximumLength=0, characterOctetLength=0, numericPrecision=10, numericScale=0, datetimePrecision=0, characterSetName='null', collationName='null', columnType='int(20)', columnKey='', extra='', privileges='select', columnComment='', generationExpression=''}*/
private Integer contextInvoluntary;

/**Column{tableCatalog='def', tableSchema='information_schema', tableName='PROFILING', columnName='BLOCK_OPS_IN', ordinalPosition=9, columnDefault='null', isNullable='YES', dataType='int', characterMaximumLength=0, characterOctetLength=0, numericPrecision=10, numericScale=0, datetimePrecision=0, characterSetName='null', collationName='null', columnType='int(20)', columnKey='', extra='', privileges='select', columnComment='', generationExpression=''}*/
private Integer blockOpsIn;

/**Column{tableCatalog='def', tableSchema='information_schema', tableName='PROFILING', columnName='BLOCK_OPS_OUT', ordinalPosition=10, columnDefault='null', isNullable='YES', dataType='int', characterMaximumLength=0, characterOctetLength=0, numericPrecision=10, numericScale=0, datetimePrecision=0, characterSetName='null', collationName='null', columnType='int(20)', columnKey='', extra='', privileges='select', columnComment='', generationExpression=''}*/
private Integer blockOpsOut;

/**Column{tableCatalog='def', tableSchema='information_schema', tableName='PROFILING', columnName='MESSAGES_SENT', ordinalPosition=11, columnDefault='null', isNullable='YES', dataType='int', characterMaximumLength=0, characterOctetLength=0, numericPrecision=10, numericScale=0, datetimePrecision=0, characterSetName='null', collationName='null', columnType='int(20)', columnKey='', extra='', privileges='select', columnComment='', generationExpression=''}*/
private Integer messagesSent;

/**Column{tableCatalog='def', tableSchema='information_schema', tableName='PROFILING', columnName='MESSAGES_RECEIVED', ordinalPosition=12, columnDefault='null', isNullable='YES', dataType='int', characterMaximumLength=0, characterOctetLength=0, numericPrecision=10, numericScale=0, datetimePrecision=0, characterSetName='null', collationName='null', columnType='int(20)', columnKey='', extra='', privileges='select', columnComment='', generationExpression=''}*/
private Integer messagesReceived;

/**Column{tableCatalog='def', tableSchema='information_schema', tableName='PROFILING', columnName='PAGE_FAULTS_MAJOR', ordinalPosition=13, columnDefault='null', isNullable='YES', dataType='int', characterMaximumLength=0, characterOctetLength=0, numericPrecision=10, numericScale=0, datetimePrecision=0, characterSetName='null', collationName='null', columnType='int(20)', columnKey='', extra='', privileges='select', columnComment='', generationExpression=''}*/
private Integer pageFaultsMajor;

/**Column{tableCatalog='def', tableSchema='information_schema', tableName='PROFILING', columnName='PAGE_FAULTS_MINOR', ordinalPosition=14, columnDefault='null', isNullable='YES', dataType='int', characterMaximumLength=0, characterOctetLength=0, numericPrecision=10, numericScale=0, datetimePrecision=0, characterSetName='null', collationName='null', columnType='int(20)', columnKey='', extra='', privileges='select', columnComment='', generationExpression=''}*/
private Integer pageFaultsMinor;

/**Column{tableCatalog='def', tableSchema='information_schema', tableName='PROFILING', columnName='SWAPS', ordinalPosition=15, columnDefault='null', isNullable='YES', dataType='int', characterMaximumLength=0, characterOctetLength=0, numericPrecision=10, numericScale=0, datetimePrecision=0, characterSetName='null', collationName='null', columnType='int(20)', columnKey='', extra='', privileges='select', columnComment='', generationExpression=''}*/
private Integer swaps;

/**Column{tableCatalog='def', tableSchema='information_schema', tableName='PROFILING', columnName='SOURCE_FUNCTION', ordinalPosition=16, columnDefault='null', isNullable='YES', dataType='varchar', characterMaximumLength=30, characterOctetLength=90, numericPrecision=0, numericScale=0, datetimePrecision=0, characterSetName='utf8', collationName='utf8_general_ci', columnType='varchar(30)', columnKey='', extra='', privileges='select', columnComment='', generationExpression=''}*/
private String sourceFunction;

/**Column{tableCatalog='def', tableSchema='information_schema', tableName='PROFILING', columnName='SOURCE_FILE', ordinalPosition=17, columnDefault='null', isNullable='YES', dataType='varchar', characterMaximumLength=20, characterOctetLength=60, numericPrecision=0, numericScale=0, datetimePrecision=0, characterSetName='utf8', collationName='utf8_general_ci', columnType='varchar(20)', columnKey='', extra='', privileges='select', columnComment='', generationExpression=''}*/
private String sourceFile;

/**Column{tableCatalog='def', tableSchema='information_schema', tableName='PROFILING', columnName='SOURCE_LINE', ordinalPosition=18, columnDefault='null', isNullable='YES', dataType='int', characterMaximumLength=0, characterOctetLength=0, numericPrecision=10, numericScale=0, datetimePrecision=0, characterSetName='null', collationName='null', columnType='int(20)', columnKey='', extra='', privileges='select', columnComment='', generationExpression=''}*/
private Integer sourceLine;

public Integer getQueryId(){
return queryId;
}

public Integer getSeq(){
return seq;
}

public String getState(){
return state;
}

public Double getDuration(){
return duration;
}

public Double getCpuUser(){
return cpuUser;
}

public Double getCpuSystem(){
return cpuSystem;
}

public Integer getContextVoluntary(){
return contextVoluntary;
}

public Integer getContextInvoluntary(){
return contextInvoluntary;
}

public Integer getBlockOpsIn(){
return blockOpsIn;
}

public Integer getBlockOpsOut(){
return blockOpsOut;
}

public Integer getMessagesSent(){
return messagesSent;
}

public Integer getMessagesReceived(){
return messagesReceived;
}

public Integer getPageFaultsMajor(){
return pageFaultsMajor;
}

public Integer getPageFaultsMinor(){
return pageFaultsMinor;
}

public Integer getSwaps(){
return swaps;
}

public String getSourceFunction(){
return sourceFunction;
}

public String getSourceFile(){
return sourceFile;
}

public Integer getSourceLine(){
return sourceLine;
}

}