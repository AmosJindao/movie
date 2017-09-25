package db.service.impl;

import db.bean.Schema;
import db.dao.DBConnectionFactory;
import db.service.MetaDataService;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.List;

/**
 * @author amos
 * @date 2017-09-24
 */
public class MetaDataServiceImpl implements MetaDataService{

    @Override
    public List<Schema> getSchemas(){
        try(Connection conn = DBConnectionFactory.getMysqlConnection(
                "jdbc:mysql://localhost:3306/?useUnicode=true&characterEncoding=UTF-8",
                "root", "root123")){

            Statement st = conn.createStatement();

           ResultSet rs = st.executeQuery("show databases");

//            System.out.println(rs.getType());

            while (rs.next()){
                System.out.println(rs.getString(1));
                System.out.println(rs.getMetaData().getColumnCount());
                System.out.println(rs.getMetaData().getColumnName(1));
                System.out.println();
            }

//            rs.last();
//            System.out.println(rs.getRow());
//            rs.beforeFirst();

            rs.first();

        }catch (Exception e){

        }


        return null;
    }
}
