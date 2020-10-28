package cn.ghh.day11.demo02;

public class StringBuilderTest {
    public static void main(String[] args) {
        StringBuilder sb = new StringBuilder("aaa");
        sb.append("baaaac");
        System.out.println(sb);
        Integer int1 = Integer.valueOf(1);
        int int11 = int1.intValue();
        Integer int4 = Integer.valueOf("1");
        int int41 = int4.intValue();
        Integer int5 = 1;
        int int51 = int5;
        System.out.println(int51);
    }
}
