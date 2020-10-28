package cn.ghh.day11.demo03;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

public class IteratorStudy {
    public static void main(String[] args) {
        Collection<String> coll = new ArrayList<>();
        coll.add("aaa");
        coll.add("张三");
        coll.add("李四");
        coll.add("李四");
        Iterator<String> iterator = coll.iterator();
        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }
        for (String item : coll) {
            System.out.println(item);
        }
    }
}
