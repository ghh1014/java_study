package cn.ghh.day15.demo01;

import java.util.ArrayList;

public class StudentTest {
    public static void main(String[] args) throws ClassNotFoundException {
        /*Class cls1 = Class.forName("cn.ghh.day15.demo01.Person");
        System.out.println(cls1);
        Class cls2 = Student.class;
        System.out.println(cls2);*/
        ArrayList<Student> students = new ArrayList<>();
        TestParam(students);
    }

    private static void TestParam(ArrayList<? extends Person> persons){

    }
}
