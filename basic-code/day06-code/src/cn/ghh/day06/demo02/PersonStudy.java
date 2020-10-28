package cn.ghh.day06.demo02;

public class PersonStudy {
    public static void main(String[] args) {
        Person person = new Person();
        person.show();

        person.name = "赵丽颖";
        person.setAge(18);
        person.show();
    }
}
