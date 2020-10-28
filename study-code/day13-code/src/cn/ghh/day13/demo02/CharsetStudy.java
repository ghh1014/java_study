package cn.ghh.day13.demo02;

import java.io.FileReader;

public class CharsetStudy {
    public static void main(String[] args) {
        try (FileReader fileReader = new FileReader("a.txt")){
            int read = 0;
            while ((read = fileReader.read()) != -1){
                System.out.print((char) read);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
