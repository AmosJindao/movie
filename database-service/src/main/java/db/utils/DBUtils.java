package db.utils;

import db.bean.DBUser;
import db.exception.SystemException;
import org.movie.commons.utils.ClassUtils;
import org.yaml.snakeyaml.Yaml;

import java.io.IOException;
import java.io.InputStream;

/**
 * @author amos
 * @date 2017-09-25
 */
public final class DBUtils{
    private DBUtils() {
    }

    private final static String DB_CONFIG_YAML = "db.yaml";

    public static DBUser getDBUser() {
        ClassLoader cl = ClassUtils.getDefaultClassLoader();

        try (InputStream inputStream = cl.getResourceAsStream(DB_CONFIG_YAML)) {
            return new Yaml().loadAs(inputStream, DBUser.class);
        } catch (IOException e) {
            throw new SystemException(e);
        }
    }

    public static String getMysqlUrl(DBUser dbUser) {
        return String.format("jdbc:mysql://%s:%d/%s?useUnicode=true&characterEncoding=UTF-8",
                dbUser.getHost(), dbUser.getPort(), dbUser.getSchema());
    }
}
