package db.bean;

/**
 * @author amos
 * @date 2017-09-24
 */
public class Schema{
    private String schemaName;

    public Schema(String schemaName){
        this.schemaName = schemaName;
    }

    public String getSchemaName() {
        return schemaName;
    }

    public void setSchemaName(String schemaName) {
        this.schemaName = schemaName;
    }


}
