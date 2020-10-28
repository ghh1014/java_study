package cn.ghh.day10.demo02;

public class Cat extends Animal{
    @Override
    public void eat() {
        System .out.println("猫吃鱼");
    }

    public void catchMouse(){
        System .out.println("猫抓老鼠");
    }
}
