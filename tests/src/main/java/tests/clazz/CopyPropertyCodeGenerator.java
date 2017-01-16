package tests.clazz;

import org.movie.commons.utils.ClassUtils;

import java.lang.reflect.Field;

/**
 * Created by liushengri on 2017/1/16.
 */
public class CopyPropertyCodeGenerator<T> {
    private Class<T> clazz;

    public CopyPropertyCodeGenerator(Class<T> clazz) {
        this.clazz = clazz;
    }

    public String generateCode() {
        StringBuilder sb = new StringBuilder();

        String setter = "setter";
        String getter = "getter";

        Field[] fields = clazz.getDeclaredFields();

        if (fields != null && fields.length > 0) {
            for (Field field : fields) {
                sb.append(String.format("%s.%s(%s.%s());\n", setter, ClassUtils.getSetMethodStr(field),getter, ClassUtils.getGetMethodStr(field)));
            }
        }
        return sb.toString();
    }

    public static void main(String[] args) {
        System.out.println(new CopyPropertyCodeGenerator(Test.class).generateCode());
    }
}


