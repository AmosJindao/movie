package tests.clazz;

import org.movie.commons.utils.ClassUtils;

import java.lang.reflect.Field;

/**
 * Created on 2017/1/16.
 */
public class CopyPropertyCodeGenerator<T> {
    private Class<T> clazz;

    public CopyPropertyCodeGenerator(Class<T> clazz) {
        this.clazz = clazz;
    }

    public String generateCode() {
        StringBuilder sb = new StringBuilder();

        String setter = "s" + clazz.getSimpleName().substring(0, 1).toLowerCase() + clazz.getSimpleName().substring(1);
        String getter = "g" + clazz.getSimpleName().substring(0, 1).toLowerCase() + clazz.getSimpleName().substring(1);

        Field[] fields = clazz.getDeclaredFields();

        if (fields != null && fields.length > 0) {
            for (Field field : fields) {
                sb.append(String.format("%s.%s(%s.%s());\n", setter, ClassUtils.getSetMethodName(field), getter, ClassUtils.getGetMethodName(field)));
            }
        }
        return sb.toString();
    }

    public static void main(String[] args) {
//        System.out.println(new CopyPropertyCodeGenerator(VndrInfoChk.class).generateCode());
    }
}


