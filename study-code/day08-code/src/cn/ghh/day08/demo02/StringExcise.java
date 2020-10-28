package cn.ghh.day08.demo02;

import java.util.Scanner;

public class StringExcise {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("请输入一个字符串：");
        String input = scanner.next();

        int upperCount = 0;
        int lowerCount = 0;
        int numberCount = 0;
        int otherCount = 0;

        char[] charArray = input.toCharArray();
        for (int i = 0; i < charArray.length; i++) {
            char ch = charArray[i];
            if ('A' <= ch && ch <= 'Z')
                upperCount++;
            else if ('a' <= ch && ch <= 'z')
                lowerCount++;
            else if ('0' <= ch && ch <= '9')
                numberCount++;
            else
                otherCount++;
        }
        System.out.println(upperCount + "," + lowerCount + "," + numberCount + "," + otherCount);
    }
}
