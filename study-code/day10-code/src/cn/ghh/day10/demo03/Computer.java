package cn.ghh.day10.demo03;

public class Computer {
    public void powerOn(){
        System.out.println("笔记本开机");
    }

    public void powerOff(){
        System.out.println("笔记本关机");
    }

    public void useDevice(USB usbDevice){
        usbDevice.open();
        if (usbDevice instanceof Mouse) {
            ((Mouse) usbDevice).click();
        }else if (usbDevice instanceof KeyBoard) {
            ((KeyBoard) usbDevice).type();
        }

        usbDevice.close();
    }
}
