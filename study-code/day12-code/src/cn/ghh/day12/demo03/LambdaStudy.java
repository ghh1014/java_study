package cn.ghh.day12.demo03;

import java.util.Arrays;

public class LambdaStudy {
    public static void main(String[] args) {
        //new Thread(() -> System.out.println(Thread.currentThread().getName() + "新的线程执行")).start();
        Person[] arr = {
                new Person("柳岩", 38),
                new Person("迪丽热巴", 18),
                new Person("古力娜扎", 19)
        };
        Arrays.sort(arr, (o1, o2) -> o1.getAge() - o2.getAge());
        for (Person person : arr) {
            System.out.println(person);
        }
    }
}
