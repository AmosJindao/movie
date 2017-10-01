package db.bean;

import java.util.Date;

/**
 * @author amos
 * @date 2017-09-24
 */
public class Table{
    private String tableCatalog; //TABLE_CATALOG   | varchar(512)        | NO   |     |         |       |
    private String tableSchema;// TABLE_SCHEMA  | varchar(64)         | NO   |     |         |       |
    private String tableName;// TABLE_NAME      | varchar(64)         | NO   |     |         |       |
    private String tableType;//  TABLE_TYPE      | varchar(64)         | NO   |     |         |       |
    private String engine; //ENGINE          | varchar(64)         | YES  |     | NULL    |       |
    private Long version;//VERSION         | bigint(21) unsigned | YES  |     | NULL    |       |
    private String rowFormat;// ROW_FORMAT      | varchar(10)         | YES  |     | NULL    |       |
    private Long tableRows;//TABLE_ROWS      | bigint(21) unsigned | YES  |     | NULL    |       |
    private Long avgRowLength;//AVG_ROW_LENGTH  | bigint(21) unsigned | YES  |     | NULL    |       |
    private Long dataLength;// DATA_LENGTH     | bigint(21) unsigned | YES  |     | NULL    |       |
    private Long maxDataLength;//MAX_DATA_LENGTH | bigint(21) unsigned | YES  |     | NULL    |       |
    private Long indexLength;//INDEX_LENGTH    | bigint(21) unsigned | YES  |     | NULL    |       |
    private Long dataFree;// DATA_FREE       | bigint(21) unsigned | YES  |     | NULL    |       |
    private Long autoIncrement;//AUTO_INCREMENT  | bigint(21) unsigned | YES  |     | NULL    |       |
    private Date createTime;//CREATE_TIME     | datetime            | YES  |     | NULL    |       |
    private Date updateTime;//UPDATE_TIME     | datetime            | YES  |     | NULL    |       |
    private Date checkTime;//CHECK_TIME      | datetime            | YES  |     | NULL    |       |
    private String tableCollation;// TABLE_COLLATION | varchar(32)         | YES  |     | NULL    |       |
    private Long checksum;//CHECKSUM        | bigint(21) unsigned | YES  |     | NULL    |       |
    private String createOptions;// CREATE_OPTIONS  | varchar(255)        | YES  |     | NULL    |       |
    private String tableComment;// TABLE_COMMENT   | varchar(2048)       | NO   |     |         |

    public String getTableName() {
        return tableName;
    }

    public void setTableName(String tableName) {
        this.tableName = tableName;
    }

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

    public String getTableType() {
        return tableType;
    }

    public void setTableType(String tableType) {
        this.tableType = tableType;
    }

    public String getEngine() {
        return engine;
    }

    public void setEngine(String engine) {
        this.engine = engine;
    }

    public Long getVersion() {
        return version;
    }

    public void setVersion(Long version) {
        this.version = version;
    }

    public String getRowFormat() {
        return rowFormat;
    }

    public void setRowFormat(String rowFormat) {
        this.rowFormat = rowFormat;
    }

    public Long getTableRows() {
        return tableRows;
    }

    public void setTableRows(Long tableRows) {
        this.tableRows = tableRows;
    }

    public Long getAvgRowLength() {
        return avgRowLength;
    }

    public void setAvgRowLength(Long avgRowLength) {
        this.avgRowLength = avgRowLength;
    }

    public Long getDataLength() {
        return dataLength;
    }

    public void setDataLength(Long dataLength) {
        this.dataLength = dataLength;
    }

    public Long getMaxDataLength() {
        return maxDataLength;
    }

    public void setMaxDataLength(Long maxDataLength) {
        this.maxDataLength = maxDataLength;
    }

    public Long getIndexLength() {
        return indexLength;
    }

    public void setIndexLength(Long indexLength) {
        this.indexLength = indexLength;
    }

    public Long getDataFree() {
        return dataFree;
    }

    public void setDataFree(Long dataFree) {
        this.dataFree = dataFree;
    }

    public Long getAutoIncrement() {
        return autoIncrement;
    }

    public void setAutoIncrement(Long autoIncrement) {
        this.autoIncrement = autoIncrement;
    }

    public Date getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    public Date getUpdateTime() {
        return updateTime;
    }

    public void setUpdateTime(Date updateTime) {
        this.updateTime = updateTime;
    }

    public Date getCheckTime() {
        return checkTime;
    }

    public void setCheckTime(Date checkTime) {
        this.checkTime = checkTime;
    }

    public String getTableCollation() {
        return tableCollation;
    }

    public void setTableCollation(String tableCollation) {
        this.tableCollation = tableCollation;
    }

    public Long getChecksum() {
        return checksum;
    }

    public void setChecksum(Long checksum) {
        this.checksum = checksum;
    }

    public String getCreateOptions() {
        return createOptions;
    }

    public void setCreateOptions(String createOptions) {
        this.createOptions = createOptions;
    }

    public String getTableComment() {
        return tableComment;
    }

    public void setTableComment(String tableComment) {
        this.tableComment = tableComment;
    }

    @Override
    public String toString() {
        return "Table{" + "tableCatalog='" + tableCatalog + '\'' + ", tableSchema='" + tableSchema + '\'' + ", tableName='" + tableName + '\'' + ", tableType='" + tableType + '\'' + ", engine='" + engine + '\'' + ", version=" + version + ", rowFormat='" + rowFormat + '\'' + ", tableRows=" + tableRows + ", avgRowLength=" + avgRowLength + ", dataLength=" + dataLength + ", maxDataLength=" + maxDataLength + ", indexLength=" + indexLength + ", dataFree=" + dataFree + ", autoIncrement=" + autoIncrement + ", createTime=" + createTime + ", updateTime=" + updateTime + ", checkTime=" + checkTime + ", tableCollation='" + tableCollation + '\'' + ", checksum=" + checksum + ", createOptions='" + createOptions + '\'' + ", tableComment='" + tableComment + '\'' + '}';
    }
}
