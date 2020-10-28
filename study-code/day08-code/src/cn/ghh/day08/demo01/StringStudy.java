package cn.ghh.day08.demo01;

import java.util.ArrayList;
import java.util.Arrays;

public class StringStudy {
    public static void main(String[] args) {
//        String str1 = new String();
//        char[] charArrays = {'A', 'B', 'C'};
//        String str2 = new String(charArrays);
//        byte[] byteArray = {97, 98, 99};
//        String str3 = new String(byteArray);
//        String str4 = "hello";
//        int index = str4.indexOf("aaa");
//        System.out.println(index);
//        String str5 = str4.substring(0,3);
//        System.out.println(str5);
        //String.format("");
        String str6 = "aaa,bbb,ccc";
        char[] charArray = str6.toCharArray();
        System.out.println(charArray);
        String[] array1 = str6.split(",");
        System.out.println(array1.toString());
        ArrayList<String> strList = new ArrayList<>();
        strList.addAll(Arrays.asList(array1));
        System.out.println(strList.toString());
        //String.join(';', Arrays.asList(array1));
        //StringBuilder
    }
}
