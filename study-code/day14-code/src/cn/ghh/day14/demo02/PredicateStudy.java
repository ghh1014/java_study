package cn.ghh.day14.demo02;

import java.util.ArrayList;
import java.util.function.Predicate;

public class PredicateStudy {
    private static ArrayList<String> filter(String[] arr, Predicate<String> pre1, Predicate<String> pre2) {
        ArrayList<String> list = new ArrayList<>();
        for (String s : arr) {
            if (pre1.and(pre2).test(s)) {
                list.add(s);
            }
        }
        return list;
    }

    public static void main(String[] args) {
        String[] array = {"迪丽热巴，女", "古力娜扎，女", "马儿扎哈，男", "赵丽颖，女"};
        ArrayList<String> list = filter(array, t -> t.split("，")[1].equals("女"), t -> t.split("，")[0].length() == 4);
        for (String s : list) {
            System.out.println(s);
        }
    }
}
