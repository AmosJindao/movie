package db.utils;

import db.viewbean.DBUser;
import db.exception.SystemException;
import org.movie.commons.utils.YamlUtils;

import java.io.IOException;

/**
 * @author amos
 * @date 2017-09-25
 */
public final class DBUtils{
    private DBUtils() {
    }

    private final static String DB_CONFIG_YAML = "db.yaml";

    public static DBUser getDBUser() {
          try  {
            return YamlUtils.readClass(DB_CONFIG_YAML,DBUser.class);
        } catch (IOException e) {
            throw new SystemException(e);
        }
    }

    public static String getMysqlUrl(DBUser dbUser) {
        return String.format("jdbc:mysql://%s:%d/%s?useUnicode=true&characterEncoding=UTF-8",
                dbUser.getHost(), dbUser.getPort(), dbUser.getSchema());
    }
}
