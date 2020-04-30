package cn.itcast.idea.basicplus.extendsandpolymorphism.redpacketexample;

import java.util.ArrayList;
import java.util.Random;

/**
 * 群员 class
 *
 * @author hzx
 * @date 2020-04-10
 */
public class Member extends Person {

    public Member() {
    }

    public Member(String name, Double money) {
        super(name, money);
    }

    public void income(ArrayList<Double> arrayDoubles) {
        //从数组中随机获取索引值
        int index = new Random().nextInt(arrayDoubles.size());
        Double delta = arrayDoubles.remove(index);
        super.setMoney(super.getMoney() + delta);
    }
}
