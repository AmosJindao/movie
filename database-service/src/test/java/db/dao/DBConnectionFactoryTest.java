package db.dao;

import org.junit.Assert;
import org.junit.Test;

import java.sql.Connection;

/**
 * @author amos
 * @date 2017-09-24
 */
public class DBConnectionFactoryTest{
//    public static void main(String[] args) {
//
//        System.out.println(System.getProperty("jdbc.drivers"));
//    }

    @Test
    public void getMysqlConnection() {
//        jdbc:mysql://localhost:3306/mysql?useUnicode=true&characterEncoding=UTF-8&useJDBCCompliantTimezoneShift=true&zeroDateTimeBehavior=convertToNull
        Connection conn = DBConnectionFactory.getMysqlConnection(
                "jdbc:mysql://localhost:3306/mysql?useUnicode=true&characterEncoding=UTF-8",
                "root", "root123");

        Assert.assertNotNull(conn);
    }
}
