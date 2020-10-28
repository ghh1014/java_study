package cn.ghh.day16.demo01;

import java.util.Arrays;

public class BubbleTest {
    public static void main(String[] args) {
        Integer[] arr = {4,5,6,3,2,1};
        Bubble.sort(arr);
        System.out.println(Arrays.toString(arr));
    }
}
