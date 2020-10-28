package cn.ghh.day08.demo03;

import java.util.Arrays;

public class ArrayStudy {
    public static void main(String[] args) {
        //int[] intArray = {10,20,30};
        //System.out.println(Arrays.toString(intArray));
        int[] array1 = {2,5,1,47,14,54,14,74,24};
        Arrays.sort(array1);
        System.out.println(Arrays.toString(array1));
        for (int i = array1.length - 1; i >= 0; i--) {
            if (i == array1.length - 1){
                System.out.print("[");
            }
            System.out.print(i == 0 ? array1[i] + "]" : array1[i] + ", ");
        }
    }
}
