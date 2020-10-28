package cn.ghh.day11.demo02;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class DateStudy {
    public static void main(String[] args) {
        System.out.println(System.currentTimeMillis());
        Date date  =new Date(System.currentTimeMillis());
        System.out.println(date.getTime());
        SimpleDateFormat format = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        String dateStr = format.format(date);
        System.out.println(dateStr);
        try {
            Date parseDate = format.parse(dateStr);
            System.out.println(parseDate);
        } catch (ParseException e) {
            e.printStackTrace();
        }
    }
}
