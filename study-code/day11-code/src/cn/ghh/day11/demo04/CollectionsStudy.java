package cn.ghh.day11.demo04;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class CollectionsStudy {
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<>();
       /* list.add("a");
        list.add("b");
        list.add("c");
        list.add("d");
        list.add("e");*/
        Collections.addAll(list,"add","dvb","cww","herd","esd");
        Collections.shuffle(list);
        Collections.sort(list, new Comparator<String>() {
            @Override
            public int compare(String o1, String o2) {
                return o2.charAt(0) - o1.charAt(0);
            }
        });
        System.out.println(list);
    }
}
