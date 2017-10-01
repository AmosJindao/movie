package db.bean;

/**
 * @author amos
 * @date 2017-09-29
 */
public class Column{
    private String tableCatalog; //TABLE_CATALOG            | varchar(512)        | NO   |     |         |       |
    private String tableSchema;// TABLE_SCHEMA             | varchar(64)         | NO   |     |         |       |
    private String tableName;// TABLE_NAME               | varchar(64)         | NO   |     |         |       |
    private String columnName;// COLUMN_NAME              | varchar(64)         | NO   |     |         |       |
    private Long ordinalPosition;//ORDINAL_POSITION         | bigint(21) unsigned | NO   |     | 0       |       |
    private String columnDefault;//COLUMN_DEFAULT           | longtext            | YES  |     | NULL    |       |
    private String isNullable;//IS_NULLABLE              | varchar(3)          | NO   |     |         |       |
    private String dataType;//DATA_TYPE                | varchar(64)         | NO   |     |         |       |
    private Long characterMaximumLength;//CHARACTER_MAXIMUM_LENGTH | bigint(21) unsigned | YES  |     | NULL    |       |
    private Long characterOctetLength;//CHARACTER_OCTET_LENGTH   | bigint(21) unsigned | YES  |     | NULL    |       |
    private Long numericPrecision;//NUMERIC_PRECISION        | bigint(21) unsigned | YES  |     | NULL    |       |
    private Long numericScale;//NUMERIC_SCALE            | bigint(21) unsigned | YES  |     | NULL    |       |
    private Long datetimePrecision;//DATETIME_PRECISION       | bigint(21) unsigned | YES  |     | NULL    |       |
    private String characterSetName;//CHARACTER_SET_NAME       | varchar(32)         | YES  |     | NULL    |       |
    private String collationName;//COLLATION_NAME           | varchar(32)         | YES  |     | NULL    |       |
    private String columnType;//COLUMN_TYPE              | longtext            | NO   |     | NULL    |       |
    private String columnKey;//COLUMN_KEY               | varchar(3)          | NO   |     |         |       |
    private String extra;//EXTRA                    | varchar(30)         | NO   |     |         |       |
    private String privileges;//PRIVILEGES               | varchar(80)         | NO   |     |         |       |
    private String columnComment;//COLUMN_COMMENT           | varchar(1024)       | NO   |     |         |       |
    private String generationExpression;//GENERATION_EXPRESSION    | longtext

    public String getTableCatalog() {
        return tableCatalog;
    }

    public void setTableCatalog(String tableCatalog) {
        this.tableCatalog = tableCatalog;
    }

    public String getTableSchema() {
        return tableSchema;
    }

    public void setTableSchema(String tableSchema) {
        this.tableSchema = tableSchema;
    }

    public String getTableName() {
        return tableName;
    }

    public void setTableName(String tableName) {
        this.tableName = tableName;
    }

    public String getColumnName() {
        return columnName;
    }

    public void setColumnName(String columnName) {
        this.columnName = columnName;
    }

    public Long getOrdinalPosition() {
        return ordinalPosition;
    }

    public void setOrdinalPosition(Long ordinalPosition) {
        this.ordinalPosition = ordinalPosition;
    }

    public String getColumnDefault() {
        return columnDefault;
    }

    public void setColumnDefault(String columnDefault) {
        this.columnDefault = columnDefault;
    }

    public String getIsNullable() {
        return isNullable;
    }

    public void setIsNullable(String isNullable) {
        this.isNullable = isNullable;
    }

    public String getDataType() {
        return dataType;
    }

    public void setDataType(String dataType) {
        this.dataType = dataType;
    }

    public Long getCharacterMaximumLength() {
        return characterMaximumLength;
    }

    public void setCharacterMaximumLength(Long characterMaximumLength) {
        this.characterMaximumLength = characterMaximumLength;
    }

    public Long getCharacterOctetLength() {
        return characterOctetLength;
    }

    public void setCharacterOctetLength(Long characterOctetLength) {
        this.characterOctetLength = characterOctetLength;
    }

    public Long getNumericPrecision() {
        return numericPrecision;
    }

    public void setNumericPrecision(Long numericPrecision) {
        this.numericPrecision = numericPrecision;
    }

    public Long getNumericScale() {
        return numericScale;
    }

    public void setNumericScale(Long numericScale) {
        this.numericScale = numericScale;
    }

    public Long getDatetimePrecision() {
        return datetimePrecision;
    }

    public void setDatetimePrecision(Long datetimePrecision) {
        this.datetimePrecision = datetimePrecision;
    }

    public String getCharacterSetName() {
        return characterSetName;
    }

    public void setCharacterSetName(String characterSetName) {
        this.characterSetName = characterSetName;
    }

    public String getCollationName() {
        return collationName;
    }

    public void setCollationName(String collationName) {
        this.collationName = collationName;
    }

    public String getColumnType() {
        return columnType;
    }

    public void setColumnType(String columnType) {
        this.columnType = columnType;
    }

    public String getColumnKey() {
        return columnKey;
    }

    public void setColumnKey(String columnKey) {
        this.columnKey = columnKey;
    }

    public String getExtra() {
        return extra;
    }

    public void setExtra(String extra) {
        this.extra = extra;
    }

    public String getPrivileges() {
        return privileges;
    }

    public void setPrivileges(String privileges) {
        this.privileges = privileges;
    }

    public String getColumnComment() {
        return columnComment;
    }

    public void setColumnComment(String columnComment) {
        this.columnComment = columnComment;
    }

    public String getGenerationExpression() {
        return generationExpression;
    }

    public void setGenerationExpression(String generationExpression) {
        this.generationExpression = generationExpression;
    }

    @Override
    public String toString() {
        return "Column{" + "tableCatalog='" + tableCatalog + '\'' + ", tableSchema='" + tableSchema + '\'' + ", tableName='" + tableName + '\'' + ", columnName='" + columnName + '\'' + ", ordinalPosition=" + ordinalPosition + ", columnDefault='" + columnDefault + '\'' + ", isNullable='" + isNullable + '\'' + ", dataType='" + dataType + '\'' + ", characterMaximumLength=" + characterMaximumLength + ", characterOctetLength=" + characterOctetLength + ", numericPrecision=" + numericPrecision + ", numericScale=" + numericScale + ", datetimePrecision=" + datetimePrecision + ", characterSetName='" + characterSetName + '\'' + ", collationName='" + collationName + '\'' + ", columnType='" + columnType + '\'' + ", columnKey='" + columnKey + '\'' + ", extra='" + extra + '\'' + ", privileges='" + privileges + '\'' + ", columnComment='" + columnComment + '\'' + ", generationExpression='" + generationExpression + '\'' + '}';
    }
}
