package cn.ghh.day16.demo01;

public class TestComparable {

    public static void main(String[] args) {
        Student c1 = new Student(18,"张三");
        Student c2 = new Student(20,"李四");
        Comparable max = getMax(c1, c2);
        System.out.println(max);
    }

    /**
     * 获取较大的值
     * @param c1
     * @param c2
     * @return
     */
    public static Comparable getMax(Comparable c1, Comparable c2) {
        int result = c1.compareTo(c2);
        if (result >= 0) {
            return c1;
        }
        return c2;
    }
}
