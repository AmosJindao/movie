package db.bean.information_schema;


/* SELECT PLUGIN_NAME AS pluginName, PLUGIN_VERSION AS pluginVersion, PLUGIN_STATUS AS pluginStatus, PLUGIN_TYPE AS pluginType, PLUGIN_TYPE_VERSION AS pluginTypeVersion, PLUGIN_LIBRARY AS pluginLibrary, PLUGIN_LIBRARY_VERSION AS pluginLibraryVersion, PLUGIN_AUTHOR AS pluginAuthor, PLUGIN_DESCRIPTION AS pluginDescription, PLUGIN_LICENSE AS pluginLicense, LOAD_OPTION AS loadOption FROM information_schema.PLUGINS */
/**
*/
public class Plugins{
/**Column{tableCatalog='def', tableSchema='information_schema', tableName='PLUGINS', columnName='PLUGIN_NAME', ordinalPosition=1, columnDefault='', isNullable='NO', dataType='varchar', characterMaximumLength=64, characterOctetLength=192, numericPrecision=0, numericScale=0, datetimePrecision=0, characterSetName='utf8', collationName='utf8_general_ci', columnType='varchar(64)', columnKey='', extra='', privileges='select', columnComment='', generationExpression=''}*/
private String pluginName;

/**Column{tableCatalog='def', tableSchema='information_schema', tableName='PLUGINS', columnName='PLUGIN_VERSION', ordinalPosition=2, columnDefault='', isNullable='NO', dataType='varchar', characterMaximumLength=20, characterOctetLength=60, numericPrecision=0, numericScale=0, datetimePrecision=0, characterSetName='utf8', collationName='utf8_general_ci', columnType='varchar(20)', columnKey='', extra='', privileges='select', columnComment='', generationExpression=''}*/
private String pluginVersion;

/**Column{tableCatalog='def', tableSchema='information_schema', tableName='PLUGINS', columnName='PLUGIN_STATUS', ordinalPosition=3, columnDefault='', isNullable='NO', dataType='varchar', characterMaximumLength=10, characterOctetLength=30, numericPrecision=0, numericScale=0, datetimePrecision=0, characterSetName='utf8', collationName='utf8_general_ci', columnType='varchar(10)', columnKey='', extra='', privileges='select', columnComment='', generationExpression=''}*/
private String pluginStatus;

/**Column{tableCatalog='def', tableSchema='information_schema', tableName='PLUGINS', columnName='PLUGIN_TYPE', ordinalPosition=4, columnDefault='', isNullable='NO', dataType='varchar', characterMaximumLength=80, characterOctetLength=240, numericPrecision=0, numericScale=0, datetimePrecision=0, characterSetName='utf8', collationName='utf8_general_ci', columnType='varchar(80)', columnKey='', extra='', privileges='select', columnComment='', generationExpression=''}*/
private String pluginType;

/**Column{tableCatalog='def', tableSchema='information_schema', tableName='PLUGINS', columnName='PLUGIN_TYPE_VERSION', ordinalPosition=5, columnDefault='', isNullable='NO', dataType='varchar', characterMaximumLength=20, characterOctetLength=60, numericPrecision=0, numericScale=0, datetimePrecision=0, characterSetName='utf8', collationName='utf8_general_ci', columnType='varchar(20)', columnKey='', extra='', privileges='select', columnComment='', generationExpression=''}*/
private String pluginTypeVersion;

/**Column{tableCatalog='def', tableSchema='information_schema', tableName='PLUGINS', columnName='PLUGIN_LIBRARY', ordinalPosition=6, columnDefault='null', isNullable='YES', dataType='varchar', characterMaximumLength=64, characterOctetLength=192, numericPrecision=0, numericScale=0, datetimePrecision=0, characterSetName='utf8', collationName='utf8_general_ci', columnType='varchar(64)', columnKey='', extra='', privileges='select', columnComment='', generationExpression=''}*/
private String pluginLibrary;

/**Column{tableCatalog='def', tableSchema='information_schema', tableName='PLUGINS', columnName='PLUGIN_LIBRARY_VERSION', ordinalPosition=7, columnDefault='null', isNullable='YES', dataType='varchar', characterMaximumLength=20, characterOctetLength=60, numericPrecision=0, numericScale=0, datetimePrecision=0, characterSetName='utf8', collationName='utf8_general_ci', columnType='varchar(20)', columnKey='', extra='', privileges='select', columnComment='', generationExpression=''}*/
private String pluginLibraryVersion;

/**Column{tableCatalog='def', tableSchema='information_schema', tableName='PLUGINS', columnName='PLUGIN_AUTHOR', ordinalPosition=8, columnDefault='null', isNullable='YES', dataType='varchar', characterMaximumLength=64, characterOctetLength=192, numericPrecision=0, numericScale=0, datetimePrecision=0, characterSetName='utf8', collationName='utf8_general_ci', columnType='varchar(64)', columnKey='', extra='', privileges='select', columnComment='', generationExpression=''}*/
private String pluginAuthor;

/**Column{tableCatalog='def', tableSchema='information_schema', tableName='PLUGINS', columnName='PLUGIN_DESCRIPTION', ordinalPosition=9, columnDefault='null', isNullable='YES', dataType='longtext', characterMaximumLength=4294967295, characterOctetLength=4294967295, numericPrecision=0, numericScale=0, datetimePrecision=0, characterSetName='utf8', collationName='utf8_general_ci', columnType='longtext', columnKey='', extra='', privileges='select', columnComment='', generationExpression=''}*/
private String pluginDescription;

/**Column{tableCatalog='def', tableSchema='information_schema', tableName='PLUGINS', columnName='PLUGIN_LICENSE', ordinalPosition=10, columnDefault='null', isNullable='YES', dataType='varchar', characterMaximumLength=80, characterOctetLength=240, numericPrecision=0, numericScale=0, datetimePrecision=0, characterSetName='utf8', collationName='utf8_general_ci', columnType='varchar(80)', columnKey='', extra='', privileges='select', columnComment='', generationExpression=''}*/
private String pluginLicense;

/**Column{tableCatalog='def', tableSchema='information_schema', tableName='PLUGINS', columnName='LOAD_OPTION', ordinalPosition=11, columnDefault='', isNullable='NO', dataType='varchar', characterMaximumLength=64, characterOctetLength=192, numericPrecision=0, numericScale=0, datetimePrecision=0, characterSetName='utf8', collationName='utf8_general_ci', columnType='varchar(64)', columnKey='', extra='', privileges='select', columnComment='', generationExpression=''}*/
private String loadOption;

public String getPluginName(){
return pluginName;
}

public String getPluginVersion(){
return pluginVersion;
}

public String getPluginStatus(){
return pluginStatus;
}

public String getPluginType(){
return pluginType;
}

public String getPluginTypeVersion(){
return pluginTypeVersion;
}

public String getPluginLibrary(){
return pluginLibrary;
}

public String getPluginLibraryVersion(){
return pluginLibraryVersion;
}

public String getPluginAuthor(){
return pluginAuthor;
}

public String getPluginDescription(){
return pluginDescription;
}

public String getPluginLicense(){
return pluginLicense;
}

public String getLoadOption(){
return loadOption;
}

}