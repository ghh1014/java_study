package cn.ghh.day14.demo02;

import java.util.ArrayList;
import java.util.Arrays;

public class StreamStudy {
    public static void main(String[] args) {
        //String[] array = {"迪丽热巴，女", "古力娜扎，女", "马儿扎哈，男", "赵丽颖，女"};
        //Optional<String> first = Arrays.stream(array).findFirst();
        //Stream<String> stream = Stream.of("张三丰", "张翠山", "赵敏", "周芷若", "张无忌");
        //Stream<String> stream2 = stream.filter(t -> t.startsWith("张"));
        //stream2.forEach(t-> System.out.println(t));
        //Stream<String> stream = Stream.of("1", "2", "3", "4", "5");
        //stream.forEach(t-> System.out.println(t));
        //Stream<Integer> stream2 = stream.map(t -> Integer.parseInt(t));
        //stream2.forEach(t-> System.out.println(t));
        //System.out.println(stream.count());
        ArrayList<Integer> list = new ArrayList<>();
        Integer[] arrays = {1,2,3,4,5,6,7};
        list.addAll(Arrays.asList(arrays));
        //long count = list.stream().count();
        list.stream().skip(2).limit(3).forEach(t-> System.out.println(t));
        //System.out.println(count);
    }
}
