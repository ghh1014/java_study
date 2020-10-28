package cn.ghh.day06.demo02;

public class Person {
    String name;
    private int age;
    private boolean male;

    public boolean isMale() {
        return male;
    }

    public void setMale(boolean male) {
        this.male = male;
    }

    public void setAge(int num) {
        age = num;
    }

    public int getAge() {
        return age;
    }

    public void show() {
        System.out.println("姓名：" + name + ", 年龄：" + age);
    }
}
