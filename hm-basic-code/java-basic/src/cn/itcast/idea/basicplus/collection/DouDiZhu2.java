package cn.itcast.idea.basicplus.collection;

import java.util.*;

/**
 * 斗地主2 class
 *      准备牌
 *      洗牌
 *      发牌
 *      排序
 *      看牌
 *
 * @author hzx
 * @date 2020-04-23
 */
public class DouDiZhu2 {
    public static void main(String[] args) {
        //准备牌
        Map<Integer,String> poker = new HashMap<>();
        List<Integer> pokerIndex = new ArrayList<>();
        List<String> colors = List.of("♠", "♥", "♣", "♦");
        List<String> numbers = List.of("2", "3", "4", "5", "6", "7", "8", "9", "10", "J", "Q", "K", "A");
        int index = 0;
        poker.put(index,"大王");
        pokerIndex.add(index);
        index++;
        poker.put(index,"小王");
        pokerIndex.add(index);
        index++;
        for (String number : numbers) {
            for (String color : colors) {
                poker.put(index,color + number);
                pokerIndex.add(index);
                index++;
            }
        }

        //洗牌
        Collections.shuffle(pokerIndex);

        //发牌
        List<Integer> player01 = new ArrayList<>();
        List<Integer> player02 = new ArrayList<>();
        List<Integer> player03 = new ArrayList<>();
        List<Integer> dipai = new ArrayList<>();

        for (int i = 0; i < pokerIndex.size(); i++) {
            Integer integer = pokerIndex.get(i);
            if(i >= 51){
                dipai.add(integer);
            }else if (i % 3 == 0 ){
                player01.add(integer);
            }else if (i % 3 == 1 ){
                player02.add(integer);
            }else if (i % 3 == 2 ){
                player03.add(integer);
            }
        }

        //排序
        Collections.sort(player01);
        Collections.sort(player02);
        Collections.sort(player03);
        Collections.sort(dipai);

        //看牌
        seePoker("周星驰",player01,poker);
        seePoker("刘德华",player02,poker);
        seePoker("周润发",player03,poker);
        seePoker("底牌",dipai,poker);
    }

    /**
     *  看牌
     *
     * @param name  玩家名称
     * @param pais   玩家索引的牌
     * @param poker     带索引的扑克
     */
    private static void seePoker(String name, List<Integer> pais, Map<Integer,String> poker) {
        System.out.print(name +":");
        for (Integer pai : pais) {
            System.out.print(poker.get(pai) + "  ");
        }
        System.out.println();
    }
}
