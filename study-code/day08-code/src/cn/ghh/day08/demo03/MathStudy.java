package cn.ghh.day08.demo03;

public class MathStudy {
    public static void main(String[] args) {
//        System.out.println(Math.abs(-3.14));
//        System.out.println(Math.ceil(11.2));
//        System.out.println(Math.floor(46.9));
//        System.out.println(Math.round(12.35));
        double min = -10.8;
        double max = 5.9;
        int count = 0;
        for (int i = (int) min; i < max; i++) {
            int abs = Math.abs(i);
            if (abs > 6 || abs <2.1){
                System.out.println(abs);
                count++;
            }
        }
        System.out.println(count);
    }
}
