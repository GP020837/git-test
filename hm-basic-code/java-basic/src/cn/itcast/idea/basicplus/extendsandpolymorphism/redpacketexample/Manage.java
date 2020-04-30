package cn.itcast.idea.basicplus.extendsandpolymorphism.redpacketexample;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Random;

/**
 * 群主 class
 *
 * @author hzx
 * @date 2020-04-10
 */
public class Manage extends Person {

    public Manage() {
    }

    public Manage(String name, Double money) {
        super(name, money);
    }

    /**
     * 发红包
     */
    public ArrayList<Double> send(Double money, int count) {
        super.setMoney(super.money - money);
        RedParer redParer = new RedParer();
        redParer.setMoney(money);
        redParer.setCount(count);
        return branch(redParer);
    }

    /**
     * 分红包
     */
    public ArrayList<Double> branch(RedParer redParer) {
        Double money = redParer.getMoney();
        int count = redParer.getCount();
        Random random = new Random();
        int tempnum = 0;
        int[] tempArrayInt = new int[count];
        int tempcount = 0;
        ArrayList<Double> tempArrayDouble = new ArrayList<>();
        for (int i = 0; i < tempArrayInt.length; i++) {
            tempnum = random.nextInt(10) + 1;
            tempArrayInt[i] = tempnum;
            tempcount += tempnum;
        }
        for (int j = 0; j < tempArrayInt.length; j++) {
            tempnum = tempArrayInt[j];
            BigDecimal b = new BigDecimal((double) tempnum / tempcount);
            tempArrayDouble.add(mul(money, b.setScale(2, BigDecimal.ROUND_HALF_UP).doubleValue()));
        }
        return tempArrayDouble;
    }

    /**
     * double 乘法
     *
     * @param d1
     * @param d2
     * @return
     */
    public double mul(double d1, double d2) {
        BigDecimal bd1 = new BigDecimal(Double.toString(d1));
        BigDecimal bd2 = new BigDecimal(Double.toString(d2));
        return bd1.multiply(bd2).doubleValue();
    }
}
