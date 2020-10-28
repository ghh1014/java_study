package cn.ghh.day13.demo01;

import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Properties;

public class ByteStreamStudy {
    public static void main(String[] args) {
        /*try(FileReader fr = new FileReader("E:\\Projects\\java\\study-code\\a.txt")) {
            char[] chars = new char[1024];
            int readLength = 0;
            while ((readLength = fr.read(chars)) != -1){
                System.out.println(new String(chars,0,readLength));
                //fos.write(bytes,0,readLength);
            }
        }catch (IOException e){
            System.out.println("文件流操作出现错误："+e.getMessage());
        }*/

        try (FileOutputStream fos = new FileOutputStream("E:\\Projects\\java\\study-code\\c.xml")){
            Properties prop = new Properties();
            prop.setProperty("赵丽颖", "168");
            prop.setProperty("迪丽热巴", "165");
            prop.setProperty("古力娜扎", "160");
            prop.storeToXML(fos,"add by ghh");
            //fw.write('a');
            //fw.flush();
            //fw.write("收到回复就开始房价快速导航尽快时刻提防回馈手机话费数据库的");
        }catch (IOException e){
            System.out.println("文件流操作出现错误："+e.getMessage());
        }
    }
}
