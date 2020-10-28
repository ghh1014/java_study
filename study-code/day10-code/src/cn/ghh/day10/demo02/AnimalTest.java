package cn.ghh.day10.demo02;

public class AnimalTest {
    public static void main(String[] args) {
        Animal animal = new Cat();
        if (animal instanceof Dog){
            Dog dog = (Dog) animal;
            dog.watchHouse();
        }

        if (animal instanceof Cat){
            Cat cat = (Cat) animal;
            cat.catchMouse();
        }
    }
}
