package db.service;

import db.service.impl.MetaDataServiceImpl;
import org.junit.Test;

/**
 * @author amos
 * @date 2017-09-24
 */
public class MetaDataServiceTest{
    MetaDataService metaDataService = new MetaDataServiceImpl();

    @Test
    public void getSchemas(){
        metaDataService.getSchemas();
    }
}
