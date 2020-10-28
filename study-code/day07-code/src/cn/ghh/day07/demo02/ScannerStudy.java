package cn.ghh.day07.demo02;

import java.util.Scanner;

public class ScannerStudy {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int number = sc.nextInt();
        System.out.println("输入的数字是：" + number);
        String str = sc.next();
        System.out.println("输入的字符串是：" + str);
    }
}
