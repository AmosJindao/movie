package db.service;

import db.service.impl.MetaDataServiceImpl;
import org.junit.Test;

/**
 * @author amos
 * @date 2017-09-24
 */
public class MetaDataServiceTest{
    MetaDataServiceImpl metaDataService = new MetaDataServiceImpl();

    @Test
    public void getTables() {
        metaDataService.getTables();
    }

    @Test
    public void getHelp() {
        System.out.println(metaDataService.getHelp());
    }

    @Test
    public void getSchemas() {
        metaDataService.getSchemas();
    }

    @Test
    public void getPrivileges() {
        metaDataService.getPrivileges().forEach(privilege -> System.out.println(privilege.getAction() + " " + privilege.getTarget()));
    }

    @Test
    public void getPrivilegesByUser() {
        metaDataService.getPrivilegesByUser();
    }


}
