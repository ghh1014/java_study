package cn.ghh.day11.demo02;

import java.util.Calendar;

public class CalendarTest {
    public static void main(String[] args) {
        Calendar calendar = Calendar.getInstance();
        System.out.println(calendar);


        calendar.add(Calendar.MONTH,-10);
        //calendar.set(Calendar.MONTH,5);
//        int month = calendar.get(Calendar.MONTH);
//        int year = calendar.get(Calendar.YEAR);
//        System.out.println(year);
//        System.out.println(month + 1);
        System.out.println(calendar.getTime());
    }
}
