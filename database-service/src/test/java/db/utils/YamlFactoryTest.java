package db.utils;

import db.viewbean.DBUser;
import org.junit.Assert;
import org.junit.Test;
import org.movie.commons.utils.ClassUtils;
import org.yaml.snakeyaml.Yaml;

import java.io.InputStream;

/**
 * @author amos
 * @date 2017-09-25
 */
public class YamlFactoryTest{

    @Test
    public void getYaml() {
        ClassLoader cl = ClassUtils.getDefaultClassLoader();

        InputStream inputStream = cl.getResourceAsStream("db.yaml");

        DBUser o = new Yaml().loadAs(inputStream, DBUser.class);

        Assert.assertNotNull(o);
    }
}
