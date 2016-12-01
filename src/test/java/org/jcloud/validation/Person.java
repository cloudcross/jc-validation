package org.jcloud.validation;


import java.lang.annotation.Annotation;
import java.lang.reflect.Field;

/**
 * Created by S3 on 2016/11/25.
 */
public class Person {

    private String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }



    public static void main(String[] msg){
        Person p=new Person();
        Class pc=p.getClass();
        Field[] fs=pc.getDeclaredFields();
        for(Field f:fs){
            if(!f.isAccessible()){
                f.setAccessible(true);
            }


        }
    }
}
