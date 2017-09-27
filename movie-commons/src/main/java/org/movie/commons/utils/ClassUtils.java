package org.movie.commons.utils;

import java.lang.reflect.Field;

/**
 * Created by liushengri on 2017/1/16.
 */
public final class ClassUtils {
    private ClassUtils(){}
    
    public static String getSetMethodName(Field field) {
        String fieldName = field.getName();
        return String.format("set%s%s", fieldName.substring(0, 1).toUpperCase(), fieldName.substring(1));
    }

    public static String getGetMethodName(Field field) {
        String fieldName = field.getName();
        return String.format("get%s%s", fieldName.substring(0, 1).toUpperCase(), fieldName.substring(1));
    }

    public static ClassLoader getDefaultClassLoader() {
        ClassLoader cl = null;
        try {
            cl = Thread.currentThread().getContextClassLoader();
        }catch (Throwable ex) {
            // Cannot access thread context ClassLoader - falling back...
        }
        if (cl == null) {
            // No thread context class loader -> use class loader of this class.
            cl = ClassUtils.class.getClassLoader();
            if (cl == null) {
                // getClassLoader() returning null indicates the bootstrap ClassLoader
                try {
                    cl = ClassLoader.getSystemClassLoader();
                }catch (Throwable ex) {
                    // Cannot access system ClassLoader - oh well, maybe the caller can live with null...
                }
            }
        }
        return cl;
    }
}
