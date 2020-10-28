package cn.ghh.day11.demo04;

import java.util.HashSet;

public class HashCodeStudy {
    public static void main(String[] args) {
        /*Person person = new Person();
        int h1= person.hashCode();
        System.out.println(h1);

        String s1 = new String("abc");
        String s2 = new String("abc");
        System.out.println(s1.hashCode());
        System.out.println(s2.hashCode());*/
        HashSet<Person> set = new HashSet<>();
        Person p1 = new Person("小妹妹", 18);
        Person p2 = new Person("小妹妹", 18);
        Person p3 = new Person("小妹妹", 19);
        System.out.println(p1.hashCode());
        System.out.println(p2.hashCode());
        System.out.println(p1 == p2);
        System.out.println(p1.equals(p2));
        set.add(p1);
        set.add(p2);
        set.add(p3);
        System.out.println(set);
    }
}
