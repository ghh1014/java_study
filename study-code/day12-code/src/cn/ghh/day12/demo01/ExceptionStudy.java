package cn.ghh.day12.demo01;

import java.io.FileInputStream;
import java.util.Objects;

public class ExceptionStudy {
    public static void main(String[] args) {
        //Throwable
        try {
            method(null);
            System.out.println("我可能无法执行");
        } catch (Exception e) {
            e.printStackTrace();
        }finally {
            System.out.println("我怎么都能执行");
        }
        System.out.println("正常退出");
    }

    public static void method(Object obj) throws Exception{
        Objects.requireNonNull(obj,"对象不允许为空！");
        //NullPointerException
        try (FileInputStream fileInputStream = new FileInputStream("")){

        }catch (Exception ex){

        }
    }
}
