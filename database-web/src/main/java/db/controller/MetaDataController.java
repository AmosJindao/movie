package db.controller;

import com.google.gson.Gson;
import db.service.MetaDataService;
import db.service.impl.MetaDataServiceImpl;
import db.viewbean.Schema;
import db.viewbean.Table;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * @author amos
 * @date 2017-12-28
 */
@RestController
public class MetaDataController{

    private MetaDataService metaDataService;

    /*@Autowired
    private Gson gson;*/

    private MetaDataController() {
        metaDataService = new MetaDataServiceImpl();
    }

    @RequestMapping (path = "schema", method = RequestMethod.GET)
    public List<Schema> getSchemas() {
//        System.out.println(gson.toJson("gson works!"));
        return metaDataService.getSchemas();
    }

    @RequestMapping (path = "{schema}/tables", method = RequestMethod.GET)
    public List<Table> getTables(@PathVariable String schema) {
        return metaDataService.getTables(schema);
    }
}
