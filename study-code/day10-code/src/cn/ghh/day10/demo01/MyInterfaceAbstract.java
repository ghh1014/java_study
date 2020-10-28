package cn.ghh.day10.demo01;

public interface MyInterfaceAbstract {
    public static final int NUM_OF_MY_CLASS = 10;

    public static void methodStatic(){
        System.out.println("执行接口的静态方法");
    }

//    private static void methodCommon(){
//        System.out.println("执行接口的静态方法");
//    }

    public abstract void methodAbs();

    public void methodAbs1();

    abstract void methodAbs2();

    void methodAbs3();

    public default void methodDefault(){
        System.out.println("执行接口定义的默认方法");
    }
}
