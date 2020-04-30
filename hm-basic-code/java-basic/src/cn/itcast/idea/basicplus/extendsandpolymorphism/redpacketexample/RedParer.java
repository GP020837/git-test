package cn.itcast.idea.basicplus.extendsandpolymorphism.redpacketexample;

/**
 * 红包 class
 *
 * @author hzx
 * @date 2020-04-10
 */
public class RedParer {

    /**
     * 红包金额
     */
    Double money;

    /**
     * 红包数量
     */
    int count;

    public RedParer() {
    }

    public RedParer(Double money, int count) {
        this.money = money;
        this.count = count;
    }

    public Double getMoney() {
        return money;
    }

    public void setMoney(Double money) {
        this.money = money;
    }

    public int getCount() {
        return count;
    }

    public void setCount(int count) {
        this.count = count;
    }
}
