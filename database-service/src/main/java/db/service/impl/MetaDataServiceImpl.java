package db.service.impl;

import com.google.common.collect.Lists;
import db.bean.information_schema.Columns;
import db.bean.information_schema.Schemata;
import db.dao.MetaDataDao;
import db.viewbean.*;
import db.bean.information_schema.Tables;
import db.dao.DBConnFactory;
import db.exception.SystemException;
import db.service.MetaDataService;
import db.utils.DBUtils;
import org.apache.commons.beanutils.BeanUtils;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.lang.reflect.InvocationTargetException;
import java.sql.*;
import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedList;
import java.util.List;

/**
 * @author amos
 * @date 2017-09-24
 */
public class MetaDataServiceImpl implements MetaDataService{
    private static final Logger LOGGER = LoggerFactory.getLogger(MetaDataServiceImpl.class);

    private MetaDataDao metaDataDao;

    public MetaDataServiceImpl(){
        metaDataDao = new MetaDataDao();
    }

    @Override
    public List<Schema> getSchemas() {
       List<Schemata> schematas = metaDataDao.findSchemas();

        if(schematas != null && schematas.size() > 0){
            List<Schema> schemas = new ArrayList<>(schematas.size());
            schematas.forEach(schemata -> {
                Schema schema = new Schema();
                try {
                    BeanUtils.copyProperties(schema, schemata);
                } catch (IllegalAccessException | InvocationTargetException e) {
                    throw new SystemException(e);
                }

                schemas.add(schema);
            });

            return schemas;
        }

        return Collections.emptyList();
    }

    @Override
    public List<Table> getTables(String schema) {
        List<Tables> tablesdb = metaDataDao.findTables(schema);

        if(tablesdb != null && tablesdb.size() > 0){
            List<Table> tableList = new ArrayList<>(tablesdb.size());
            tablesdb.forEach(tabledb -> {
                Table table = new Table();
                try {
                    BeanUtils.copyProperties(table, tabledb);
                } catch (IllegalAccessException | InvocationTargetException e) {
                    throw new SystemException(e);
                }

                tableList.add(table);
            });

            return tableList;
        }

        return Collections.emptyList();
    }

    @Override
    public List<Column> getColumns(String schema, String tableName){
        List<Columns> columns = metaDataDao.findColumns(schema,tableName);

        if(columns != null && columns.size() > 0){
            List<Column> columnList = new ArrayList<>(columns.size());
            columns.forEach(columndb -> {
                Column columnView = new Column();
                try {
                    BeanUtils.copyProperties(columnView, columndb);
                } catch (IllegalAccessException | InvocationTargetException e) {
                    throw new SystemException(e);
                }

                columnList.add(columnView);
            });

            return columnList;
        }

        return Collections.emptyList();
    }


    public List<String> getHelp() {
        try (Connection conn = getDBConnection()) {
            Statement st = conn.createStatement();

            ResultSet rs = st.executeQuery("HELP");

            //            List<Privilege> privileges = new LinkedList<>();

            while (rs.next()) {
                System.out.println(rs.getString(1));
                System.out.println(rs.getMetaData().getColumnCount());
                System.out.println(rs.getMetaData().getColumnName(1));
                System.out.println();

                //                privileges.add(new Privilege(rs.getString(1),rs.getString(2),rs.getString(3)));
            }

            //            return privileges;
        } catch (SQLException e) {
            LOGGER.error("query privileges error!",e);
        }

        return Collections.emptyList();
    }

    public List<Privilege> getPrivileges() {
        try (Connection conn = getDBConnection()) {
            Statement st = conn.createStatement();

            ResultSet rs = st.executeQuery("SHOW PRIVILEGES");

            List<Privilege> privileges = new LinkedList<>();

            while (rs.next()) {
//                System.out.println(rs.getString(1));
//                System.out.println(rs.getMetaData().getColumnCount());
//                System.out.println(rs.getMetaData().getColumnName(1));
//                System.out.println();

                privileges.add(new Privilege(rs.getString(1),rs.getString(2),rs.getString(3)));
            }

            return privileges;
        } catch (SQLException e) {
            LOGGER.error("query privileges error!",e);
        }

        return Collections.emptyList();
    }

    @Override
    public List<Privilege> getPrivilegesByUser() {
//        SHOW GRANTS;
//        SHOW GRANTS FOR CURRENT_USER;
//        SHOW GRANTS FOR CURRENT_USER();

        try (Connection conn = getDBConnection()) {
            Statement st = conn.createStatement();

            ResultSet rs = st.executeQuery(" SHOW GRANTS FOR CURRENT_USER");

            //            System.out.println(rs.getType());
            List<Privilege> schemas = new LinkedList<>();

            while (rs.next()) {
                System.out.println(rs.getString(1));
                System.out.println(rs.getMetaData().getColumnCount());
                System.out.println(rs.getMetaData().getColumnName(1));
                System.out.println();

//                schemas.add(new Schema(rs.getString(1)));
            }

            //            rs.last();
            //            System.out.println(rs.getRow());
            //            rs.beforeFirst();

            rs.first();

        } catch (SQLException e) {
            LOGGER.error("",e);

        }

        return Collections.emptyList();
    }



    private Connection getDBConnection() {
        DBUser dbUser = DBUtils.getDBUser();
        Connection conn = DBConnFactory.getMysqlConnection(DBUtils.getMysqlUrl(dbUser), dbUser.getUserName(), dbUser.getPassword());

        return conn;
    }

    private ResultSet getResultSet(String queryScript){
//        SHOW TABLES;
        try (Connection conn = getDBConnection()) {
            Statement st = conn.createStatement();

            ResultSet rs = st.executeQuery(queryScript);

           return rs;
        } catch (SQLException e) {
            LOGGER.error("query error!",e);
            throw new SystemException(e);
        }
    }
}
