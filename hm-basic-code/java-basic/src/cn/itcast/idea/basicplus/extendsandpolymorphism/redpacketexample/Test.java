package cn.itcast.idea.basicplus.extendsandpolymorphism.redpacketexample;

import java.util.ArrayList;

/**
 * 抢红包测试 class
 * 金钱的算法不能有小数点，因为会精度丢失，所有全部使用int基本类型以‘分’为单位。即：1.0元 == 100分
 *
 * @author hzx
 * @date 2020-04-11
 */
public class Test {
    public static void main(String[] args) {
        Manage manage = new Manage("群主", 100.0);
        /*System.out.println("发红包前" + manage.getName() + "有" + manage.getMoney() + "块钱");
        ArrayList<Double> doubleArrayList = manage.send(60.0, 5);
        System.out.println("发红包后" + manage.getName() + "有" + manage.getMoney() + "块钱");

        Member xiaoming = new Member("小明", 0.0);
        Member xiaohong = new Member("小红", 0.0);
        Member xiaohuang = new Member("小黄", 0.0);
        Member xiaoli = new Member("小李", 0.0);
        Member xiaozhang = new Member("小张", 0.0);
        System.out.println("点红包前" + xiaoming.getName() + "有" + xiaoming.getMoney() + "块钱");
        System.out.println("点红包前" + xiaohong.getName() + "有" + xiaohong.getMoney() + "块钱");
        System.out.println("点红包前" + xiaohuang.getName() + "有" + xiaohuang.getMoney() + "块钱");
        System.out.println("点红包前" + xiaoli.getName() + "有" + xiaoli.getMoney() + "块钱");
        System.out.println("点红包前" + xiaozhang.getName() + "有" + xiaozhang.getMoney() + "块钱");
        xiaoming.income(doubleArrayList);
        xiaohong.income(doubleArrayList);
        xiaohuang.income(doubleArrayList);
        xiaoli.income(doubleArrayList);
        xiaozhang.income(doubleArrayList);
        System.out.println("点红包后" + xiaoming.getName() + "有" + xiaoming.getMoney() + "块钱");
        System.out.println("点红包后" + xiaohong.getName() + "有" + xiaohong.getMoney() + "块钱");
        System.out.println("点红包后" + xiaohuang.getName() + "有" + xiaohuang.getMoney() + "块钱");
        System.out.println("点红包后" + xiaoli.getName() + "有" + xiaoli.getMoney() + "块钱");
        System.out.println("点红包后" + xiaozhang.getName() + "有" + xiaozhang.getMoney() + "块钱");
        double result = xiaoming.getMoney() + xiaohong.getMoney() + xiaohuang.getMoney() + xiaoli.getMoney() +xiaozhang.getMoney();
        System.out.println("总数：" + result);*/
    }
}
