package cn.ghh.day10.demo03;

public class ComputerTest {
    public static void main(String[] args) {
        Computer computer = new Computer();
        computer.powerOn();
        computer.useDevice(new Mouse());
        computer.useDevice(new KeyBoard());

        computer.powerOff();
    }
}
