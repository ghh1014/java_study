package cn.ghh.day12.demo01;

import java.util.*;

public class DouDiZhu {
    public static void main(String[] args) {
        HashMap<Integer, String> poker = new HashMap<>();
        ArrayList<Integer> pokerIndex = new ArrayList<>();
        List<String> colors = Arrays.asList(new String[]{"红桃", "黑桃", "方块", "梅花"});
        List<String> numbers = Arrays.asList(new String[]{"2", "A", "K", "Q", "J", "10", "9", "8", "7", "6", "5", "4", "3"});
        int index = 0;
        poker.put(index, "大王");
        pokerIndex.add(index);
        index++;
        poker.put(index, "小王");
        pokerIndex.add(index);
        index++;
        for (String number : numbers) {
            for (String color : colors) {
                poker.put(index, color + number);
                pokerIndex.add(index);
                index++;
            }
        }
        //System.out.println(poker);
        //System.out.println(pokerIndex);
        Collections.shuffle(pokerIndex);
        ArrayList<Integer> player01 = new ArrayList<>();
        ArrayList<Integer> player02 = new ArrayList<>();
        ArrayList<Integer> player03 = new ArrayList<>();
        ArrayList<Integer> diPai = new ArrayList<>();
        for (int i = 0; i < pokerIndex.size(); i++) {
            Integer in = pokerIndex.get(i);
            if (i >= 51) {
                diPai.add(in);
            } else if (i % 3 == 0) {
                player01.add(in);
            } else if (i % 3 == 1) {
                player02.add(in);
            } else if (i % 3 == 2) {
                player03.add(in);
            }
        }
        Collections.sort(player01);
        Collections.sort(player02);
        Collections.sort(player03);
        Collections.sort(diPai);
        lookPoker("玩家一",poker,player01);
        lookPoker("玩家二",poker,player02);
        lookPoker("玩家三",poker,player03);
        lookPoker("底牌",poker,diPai);
    }

    private static void lookPoker(String name,HashMap<Integer, String> poker,ArrayList<Integer> list){
        System.out.print(name+"：");
        for (Integer key : list) {
            String value = poker.get(key);
            System.out.print(value + " ");
        }
        System.out.println();
    }
}
