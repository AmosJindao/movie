package tests.clazz;

import org.movie.commons.utils.ClassUtils;

import java.lang.reflect.Field;

/**
 * Created by liushengri on 2017/1/16.
 */
public class SetPropertyCodeGenerator<T> {
    private Class<T> clazz;

    public SetPropertyCodeGenerator(Class<T> clazz){
        this.clazz = clazz;
    }

    public String genarateCode(){
        Field[] fields = clazz.getDeclaredFields();
        
        StringBuilder sb = new StringBuilder();
        
        if(fields != null && fields.length > 0){
            for(Field field:fields) {
                sb.append(String.format("setter.%s();\n", ClassUtils.getSetMethodStr(field)));
            }
        }

        return sb.toString();
    }

    public static void main(String[] args) {
        System.out.println(new SetPropertyCodeGenerator(Test.class).genarateCode());
    }
}
