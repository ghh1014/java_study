package cn.ghh.day04.demo02;

public class Demo02Test {
    public static void main(String[] args) {
        printMethod();
    }

    private static void printMethod(){
        for (int j = 0; j < 5; j++) {
            for (int i = 0; i < 20; i++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
