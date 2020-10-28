package cn.ghh.day04.demo02;

public class MethodParam {
    public static void main(String[] args) {
        method1(10, 20);
        method2();
        System.out.println(sum(50,20));
    }

    public static void method1(int a, int b) {
        System.out.println(a + b);
    }

    public static void method2() {
        System.out.println(50);
    }

    public static int sum(int a, int b) {
       return a + b;
    }
}
