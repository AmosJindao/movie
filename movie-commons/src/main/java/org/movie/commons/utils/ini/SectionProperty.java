package org.movie.commons.utils.ini;

/**
 * @author liusr
 * @date 2016年9月30日
 */
public class SectionProperty{
    private String name;
    private String value;

    public SectionProperty(String name, String value){
        this.name = name;
        this.value = value;
    }

    public String getName(){
        return name;
    }

    public void setName(String name){
        this.name = name;
    }

    public String getValue(){
        return value;
    }

    public void setValue(String value){
        this.value = value;
    }

    @Override
    public String toString(){
        return "SectionProperty [name=" + name + ", value=" + value + "]";
    }
}
