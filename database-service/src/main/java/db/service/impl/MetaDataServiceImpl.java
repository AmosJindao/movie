package db.service.impl;

import db.bean.DBUser;
import db.bean.Privilege;
import db.bean.Schema;
import db.bean.Table;
import db.dao.DBConnectionFactory;
import db.exception.SystemException;
import db.service.MetaDataService;
import db.utils.DBUtils;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.sql.*;
import java.util.Collections;
import java.util.LinkedList;
import java.util.List;

/**
 * @author amos
 * @date 2017-09-24
 */
public class MetaDataServiceImpl implements MetaDataService{
    private static final Logger LOGGER = LoggerFactory.getLogger(MetaDataServiceImpl.class);

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

    @Override
    public List<Table> getTables() {
        try (Connection conn = getDBConnection()) {

            Statement stat = conn.createStatement();

            ResultSet rs = stat.executeQuery("SELECT TABLE_NAME FROM INFORMATION_SCHEMA.TABLES");

            List<Table> ll = new LinkedList();

            // Fetch each row from the result set
            while (rs.next()) {
                String tableName = rs.getString("TABLE_NAME");
                System.out.println(rs.getMetaData().getColumnCount());
                System.out.println(rs.getMetaData().getColumnName(1));
                System.out.println(tableName);
            }

        } catch (SQLException e) {
           LOGGER.error("",e);
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
            List<Schema> schemas = new LinkedList<>();

            while (rs.next()) {
                System.out.println(rs.getString(1));
                System.out.println(rs.getMetaData().getColumnCount());
                System.out.println(rs.getMetaData().getColumnName(1));
                System.out.println();

                schemas.add(new Schema(rs.getString(1)));
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

    @Override
    public List<Schema> getSchemas() {
        try (Connection conn = getDBConnection()) {
            Statement st = conn.createStatement();

            ResultSet rs = st.executeQuery("show databases");

            //            System.out.println(rs.getType());
            List<Schema> schemas = new LinkedList<>();

            while (rs.next()) {
                System.out.println(rs.getString(1));
                System.out.println(rs.getMetaData().getColumnCount());
                System.out.println(rs.getMetaData().getColumnName(1));
                System.out.println();

                schemas.add(new Schema(rs.getString(1)));
            }

            //            rs.last();
            //            System.out.println(rs.getRow());
            //            rs.beforeFirst();

            rs.first();

            return schemas;
        } catch (Exception e) {

        }

        return Collections.emptyList();
    }

    private Connection getDBConnection() {
        DBUser dbUser = DBUtils.getDBUser();
        Connection conn = DBConnectionFactory.getMysqlConnection(DBUtils.getMysqlUrl(dbUser), dbUser.getUserName(), dbUser.getPassword());

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
