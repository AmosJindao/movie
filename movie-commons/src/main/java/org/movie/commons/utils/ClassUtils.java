package org.movie.commons.utils;

import java.lang.reflect.Field;

/**
 * Created by liushengri on 2017/1/16.
 */
public final class ClassUtils {
    private ClassUtils(){}
    
    public static String getSetMethodStr(Field field) {
        String fieldName = field.getName();
        return String.format("set%s%s", fieldName.substring(0, 1).toUpperCase(), fieldName.substring(1));
    }

    public static String getGetMethodStr(Field field) {
        String fieldName = field.getName();
        return String.format("get%s%s", fieldName.substring(0, 1).toUpperCase(), fieldName.substring(1));
    }
}
