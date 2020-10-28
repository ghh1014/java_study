package cn.ghh.day13.demo02;

import java.io.FileReader;
import java.io.IOException;
import java.util.Properties;
import java.util.Set;

public class PropertiesStudy {
    public static void main(String[] args) {
        try (FileReader fr = new FileReader("E:\\Projects\\java\\study-code\\b.txt")){
            Properties prop = new Properties();
            prop.load(fr);
            Set<String> set = prop.stringPropertyNames();
            for (String s : set) {
                System.out.println(s +"="+ prop.getProperty(s));
            }
        }catch (IOException e){
            System.out.println("文件流操作出现错误："+e.getMessage());
        }
    }

    private static void show() {
        Properties prop = new Properties();
        prop.setProperty("赵丽颖", "168");
        prop.setProperty("迪丽热巴", "165");
        prop.setProperty("古力娜扎", "160");
        Set<String> set = prop.stringPropertyNames();
        for (String s : set) {
            System.out.println(s +"="+ prop.getProperty(s));
        }
    }
}
