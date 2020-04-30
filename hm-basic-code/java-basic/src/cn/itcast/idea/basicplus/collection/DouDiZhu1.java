package cn.itcast.idea.basicplus.collection;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * 斗地主1 class
 *      准备牌
 *      洗牌
 *      发牌
 *      看牌
 *
 * @author hzx
 * @date 2020-04-19
 */
public class DouDiZhu1 {
    public static void main(String[] args) {
        //准备牌
        List<String> allP = new ArrayList<>();
        allP.add("大王");
        allP.add("小王");
        String[] xingtais = {"♠","♥","♣","♦"};
        String[] xuhaos = {"2","A","K","Q","J","10","9","8","7","6","5","4","3"};
        for (String xuhao : xuhaos) {
            for (String xingtai : xingtais) {
                allP.add(xingtai + xuhao);
            }
        }

        //洗牌
        Collections.shuffle(allP);

        //发牌
        List<String> player01 = new ArrayList<>();
        List<String> player02 = new ArrayList<>();
        List<String> player03 = new ArrayList<>();
        List<String> dipai = new ArrayList<>();

        for (int i = 0; i < allP.size(); i++) {
            if(i >= 51){
                dipai.add(allP.get(i));
            }else if(i % 3 == 0){
                player01.add(allP.get(i));
            }else if(i % 3 == 1){
                player02.add(allP.get(i));
            }else if(i % 3 == 2){
                player03.add(allP.get(i));
            }
        }

        //看牌
        System.out.println("周润发：" + player01);
        System.out.println("周星驰：" + player02);
        System.out.println("刘德华：" + player03);
        System.out.println("底牌：" + dipai);
    }
}
