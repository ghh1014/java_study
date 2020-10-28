package cn.ghh.day11.demo03;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class SetStudy {
    public static void main(String[] args) {
        Set<Integer> set = new HashSet<>();
        set.add(1);
        set.add(3);
        set.add(2);
        for (Integer integer : set) {
            System.out.println(integer);
        }

        Iterator<Integer> iterator = set.iterator();
        while (iterator.hasNext()){
            System.out.println( iterator.next());
        }
    }
}
