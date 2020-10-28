package cn.ghh.day11.demo04;

public class VarArgsStudy {
    public static void main(String[] args) {
        System.out.println(add(10,20,14,15));
    }

    public static int add(int...params){
        System.out.println(params.length);
        int sum = 0;
        for (int param : params) {
            sum+=param;
        }
        return sum;
    }
}
