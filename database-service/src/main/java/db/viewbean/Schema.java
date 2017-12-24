package db.viewbean;

/**
 * @author amos
 * @date 2017-09-23
 */
public class Schema{
    private String catalogName;

    private String schemaName;

    private String defaultCharacterSetName;

    private String defaultCollationName;

    private String sqlPath;

    public String getCatalogName(){
        return catalogName;
    }

    public String getSchemaName(){
        return schemaName;
    }

    public String getDefaultCharacterSetName(){
        return defaultCharacterSetName;
    }

    public String getDefaultCollationName(){
        return defaultCollationName;
    }

    public String getSqlPath(){
        return sqlPath;
    }

    public void setCatalogName(String catalogName) {
        this.catalogName = catalogName;
    }

    public void setSchemaName(String schemaName) {
        this.schemaName = schemaName;
    }

    public void setDefaultCharacterSetName(String defaultCharacterSetName) {
        this.defaultCharacterSetName = defaultCharacterSetName;
    }

    public void setDefaultCollationName(String defaultCollationName) {
        this.defaultCollationName = defaultCollationName;
    }

    public void setSqlPath(String sqlPath) {
        this.sqlPath = sqlPath;
    }

    @Override
    public String toString() {
        return "Schema{" + "catalogName='" + catalogName + '\'' + ", schemaName='" + schemaName + '\'' + ", " +
                "defaultCharacterSetName='" + defaultCharacterSetName + '\'' + ", defaultCollationName='" +
                defaultCollationName + '\'' + ", sqlPath='" + sqlPath + '\'' + '}';
    }
}
