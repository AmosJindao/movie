package db.service;

import db.bean.DBUser;
import db.bean.Privilege;
import db.bean.Schema;
import db.bean.Table;

import java.util.List;

/**
 * @author amos
 * @date 2017-09-24
 */
public interface MetaDataService{
    default List<DBUser> getUsers(){return null;}

    default List<Privilege> getPrivilegesByUser(){return null;}

    default List<Schema> getSchemas(){return null;}

    default List<Table> getTables(){return null;}
}
