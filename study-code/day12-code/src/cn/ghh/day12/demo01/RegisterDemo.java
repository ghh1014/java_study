package cn.ghh.day12.demo01;

import java.util.Scanner;

public class RegisterDemo {
    public static String[] userNames = {"张三","李四","王五"};

    public static void main(String[] args) /*throws RegisterException*/ {
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入您要注册的用户名：");
        String userName = sc.next();
        checkUserName(userName);
    }

    public static void checkUserName(String userName) /*throws RegisterException*/ {
        for (String name : userNames) {
            if (name.equals(userName)){
                throw new RegisterException("该用户已经被注册了");
            }
        }
        System.out.println("注册成功！");
    }
}
