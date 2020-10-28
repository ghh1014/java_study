package cn.ghh.day16.demo01;

public class Student implements Comparable<Student> {
    private int age;
    private String userName;

    public Student() {
    }

    public Student(int age, String userName) {
        this.age = age;
        this.userName = userName;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    @Override
    public String toString() {
        return "Student{" +
                "age=" + age +
                ", userName='" + userName + '\'' +
                '}';
    }

    @Override
    public int compareTo(Student o) {
        return this.age - o.getAge();
    }
}
