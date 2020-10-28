package cn.ghh.day07.demo02;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Random;

public class RandomTest {
    public static void main(String[] args) {
        Random random = new Random();
        //System.out.println(random.nextInt(100));
        /*for (int i = 0; i < 100; i++) {
            System.out.println(random.nextInt(10) + 1);
        }*/
        //ArrayList<Student> students = new ArrayList<>();
        //students.add(new Student());
        //ArrayList<Integer> list = new ArrayList<>();
        ArrayList<String> names = new ArrayList<>();
        names.add("迪丽热巴");
        names.add(0,"古力娜扎");
        String[] newNames = new String[]{"赵丽颖","小七"};
        names.addAll(0,Arrays.asList(newNames));
        System.out.println(names.stream().findFirst().get());
        //names.forEach();
        System.out.println(names);
    }
}
