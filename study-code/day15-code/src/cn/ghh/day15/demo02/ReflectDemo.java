package cn.ghh.day15.demo02;

import cn.ghh.day15.demo01.Person;

import java.lang.reflect.Field;

@Pro("你好")
public class ReflectDemo {
    public static void main(String[] args) throws IllegalAccessException, InstantiationException {
        Class personClass = Person.class;
        Field[] fields = personClass.getDeclaredFields();
        for (Field field : fields) {
            //field.set();
            System.out.println(field.getName());
        }
        Object o = personClass.newInstance();
    }
}
