package db.dao;

import db.bean.DBUser;
import db.exception.SystemException;
import db.utils.DBUtils;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

/**
 * @author amos
 * @date 2017-09-24
 */
public final class DBConnectionFactory{
    private DBConnectionFactory(){}

    public final static Connection getMysqlConnection(String url, String userName, String password)  {
        try {
            return DriverManager.getConnection(url, userName, password);
        }catch (SQLException e){
            throw new SystemException(e);
        }
    }

    public final static Connection getMysqlConnection(DBUser dbUser)  {
        try {
            return DriverManager.getConnection(DBUtils.getMysqlUrl(dbUser), dbUser.getUserName(), dbUser.getPassword());
        }catch (SQLException e){
            throw new SystemException(e);
        }
    }
}
