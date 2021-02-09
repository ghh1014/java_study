package com.ghh;

public class TempDemo {
    public static void main(String[] args) throws InterruptedException {
        CustomThread customThread = new CustomThread();
        customThread.start();

        while (true){
            Thread.sleep(1000);
            if (customThread.isFlag())
            {
                System.out.println("主线程取到了Flag的值");
                break;
            }
        }
    }
}
