package cn.ghh.day11.demo03;

import java.util.Collection;
import java.util.HashSet;

public class CollectionStudy {
    public static void main(String[] args) {
        Collection<String> coll = new HashSet<>();
        System.out.println(coll);
        coll.add("aaa");
        coll.add("张三");
        coll.add("李四");
        coll.add("李四");
        System.out.println(coll);
        coll.remove("aaa");
        System.out.println(coll);
        System.out.println(coll.contains("张三"));
        System.out.println(coll.isEmpty());
        System.out.println(coll.size());
        Object[] arr = coll.toArray();
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }
        coll.clear();
        System.out.println(coll.isEmpty());
        System.out.println(coll);
    }
}
