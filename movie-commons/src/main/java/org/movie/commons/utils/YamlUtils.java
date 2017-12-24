package org.movie.commons.utils;

import org.yaml.snakeyaml.Yaml;

import java.io.IOException;
import java.io.InputStream;

/**
 * @author amos
 * @date 2017-09-25
 */
public final class YamlUtils{
    private YamlUtils(){}

    private static ThreadLocal<Yaml> yamlThreadLocal = new ThreadLocal<>()
                                                            .withInitial(() ->{
                                                                return new Yaml();
                                                            });

    /**
     * read yaml file into java class
     * @param yamlPath
     * @param clazz
     * @param <T>
     * @return
     * @throws IOException
     */
    public static <T> T readClass(String yamlPath, Class<T> clazz) throws IOException {
        ClassLoader cl = ClassUtils.getDefaultClassLoader();

        try (InputStream inputStream = cl.getResourceAsStream(yamlPath)) {
            return new Yaml().loadAs(inputStream, clazz);
        }
    }
}
