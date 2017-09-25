package db.dao;

import db.exception.SystemException;

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
}
