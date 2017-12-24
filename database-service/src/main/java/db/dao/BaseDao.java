package db.dao;

import db.exception.SystemException;
import db.utils.DBUtils;
import db.utils.MySQLSqls;
import org.movie.commons.utils.YamlUtils;

import java.io.IOException;
import java.lang.reflect.Field;
import java.lang.reflect.Modifier;
import java.sql.*;
import java.util.Date;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import java.util.function.Consumer;
import java.util.function.Predicate;

/**
 * @author amos
 * @date 2017-12-22
 */
public class BaseDao{
    private static final Map<Class<?>, Field[]> declaredFieldsCache = new ConcurrentHashMap<>(256);
    private static final Field[] NO_FIELDS = {};
    private static Map<String, String> sqlMap = null;

    public <T> List<T> find(String querySql, Class<T> clazz, Object... sqlParameters) {
        try (Connection conn = getDBConnection()) {
            PreparedStatement pst = conn.prepareStatement(querySql);

            if (sqlParameters != null && sqlParameters.length > 0) {
                int len = sqlParameters.length;
                for (int i = 0; i < len; i++) {
                    pst.setObject(i+1, sqlParameters[i]);
                }
            }

            ResultSet rs = pst.executeQuery();

            return convertToBean(rs, clazz);
        } catch (IllegalAccessException | InstantiationException | SQLException e) {
            throw new SystemException(e);
        }
    }

    private <T> List<T> convertToBean(ResultSet rs, Class<T> clazz) throws IllegalAccessException,
            InstantiationException, SQLException {
        List<T> beans = new LinkedList<>();
        while (rs.next()) {
            T bean = clazz.newInstance();

            doWithFields(clazz, field -> {
                makeAccessible(field);
                String fieldName = field.getName();
                Class<?> type = field.getType();
                try {
                    if (type == String.class) {
                        field.set(bean, rs.getString(fieldName));
                    } else if (type == Date.class) {
                        field.set(bean, rs.getDate(fieldName));
                    } else if (type == Short.class) {
                        field.set(bean, rs.getShort(fieldName));
                    } else if (type == Integer.class) {
                        field.set(bean, rs.getInt(fieldName));
                    } else if (type == Long.class) {
                        field.set(bean, rs.getLong(fieldName));

                    } else if (type == Double.class) {
                        field.set(bean, rs.getDouble(fieldName));
                    } else {
                        throw new UnsupportedOperationException(fieldName + "'s type is " + type.getName() + ", this " +
                                "" + "is unsupported!");

                    }
                } catch (IllegalAccessException | SQLException e) {
                    throw new SystemException(e);
                }
            }, null);

            beans.add(bean);
        }

        return beans;
    }

    public void doWithFields(Class<?> clazz, Consumer<Field> fc, Predicate<Field> ff) {
        Class<?> targetClass = clazz;
        do {
            Field[] fields = getDeclaredFields(targetClass);
            for (Field field : fields) {
                if (ff != null && !ff.test(field)) {
                    continue;
                }
                fc.accept(field);
            }
            targetClass = targetClass.getSuperclass();
        } while (targetClass != null && targetClass != Object.class);
    }

    private Field[] getDeclaredFields(Class<?> clazz) {
        Field[] result = declaredFieldsCache.get(clazz);
        if (result == null) {
            result = clazz.getDeclaredFields();
            declaredFieldsCache.put(clazz, (result.length == 0 ? NO_FIELDS : result));
        }
        return result;
    }

    private void makeAccessible(Field field) {
        if ((!Modifier.isPublic(field.getModifiers()) || !Modifier.isPublic(field.getDeclaringClass().getModifiers())
                || Modifier.isFinal(field.getModifiers())) && !field.isAccessible()) {
            field.setAccessible(true);
        }
    }

    public Connection getDBConnection() {
        Connection conn = DBConnFactory.getMysqlConnection(DBUtils.getDBUser());
        return conn;
    }

    public String getSql(String sqlKey) {
        if (sqlMap == null) {
            try {
                sqlMap = YamlUtils.readClass(MySQLSqls.MYSQL_SQL_PATH, Map.class);
            } catch (IOException e) {
                throw new SystemException(e);
            }
        }

        return sqlMap.get(sqlKey);
    }
}
