package db.dao;

import db.bean.information_schema.Columns;
import db.bean.information_schema.Schemata;
import db.bean.information_schema.Tables;
import db.utils.MySQLSqls;

import java.util.List;

/**
 * @author amos
 * @date 2017-12-23
 */
public class MetaDataDao extends BaseDao{
    public List<Schemata> findSchemas() {
        return find(getSql(MySQLSqls.QUERY_ALL_SCHEMAS), Schemata.class);
    }

    public List<Tables> findTables(String tableSchema) {
        return find(getSql(MySQLSqls.QUERY_ALL_TABLES), Tables.class,tableSchema);
    }

    public List<Columns> findColumns(String schema, String tableName) {
        return find(getSql(MySQLSqls.QUERY_ALL_COLUMNS), Columns.class,schema,tableName);
    }
}
