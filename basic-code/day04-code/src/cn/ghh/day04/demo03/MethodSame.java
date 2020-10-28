package cn.ghh.day04.demo03;

public class MethodSame {
    public static void main(String[] args) {
        System.out.println(isSame(20, 20));
        System.out.println(isSame(20, 15));
    }

    public static boolean isSame(int a, int b) {
        return a == b;
    }
}
