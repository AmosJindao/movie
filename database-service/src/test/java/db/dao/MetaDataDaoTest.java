package db.dao;

import db.bean.information_schema.Schemata;
import db.bean.information_schema.Tables;
import org.junit.Assert;
import org.junit.Test;

import java.util.List;

/**
 * @author amos
 * @date 2017-12-23
 */
public class MetaDataDaoTest{
    private MetaDataDao metaDataDao = new MetaDataDao();

    @Test
    public void findSchemas() {
        List<Schemata> schematas = metaDataDao.findSchemas();

        Assert.assertNotNull(schematas);
    }

    @Test
    public void findTables(){
        List<Tables> tables = metaDataDao.findTables("mysql");

        Assert.assertNotNull(tables);
    }


}
