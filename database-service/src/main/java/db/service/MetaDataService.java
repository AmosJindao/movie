package db.service;

import db.viewbean.*;
import db.bean.information_schema.Columns;
import db.bean.information_schema.Schemata;
import db.bean.information_schema.Tables;

import java.util.Collections;
import java.util.List;

/**
 * @author amos
 * @date 2017-09-24
 */
public interface MetaDataService{


    default List<Schema> getSchemas(){return Collections.emptyList();}

    default List<Table> getTables(String schema){return Collections.emptyList();}

    default List<Column> getColumns(String schema, String tableName){return Collections.emptyList();}

    default List<DBUser> getUsers(){return Collections.emptyList();}

    default List<Privilege> getPrivilegesByUser(){return Collections.emptyList();}

}
