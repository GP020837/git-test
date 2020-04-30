package cn.itcast.idea.basicplus.extendsandpolymorphism.redpacketexample;

import java.util.Objects;

/**
 * 人 class
 *
 * @author hzx
 * @date 2020-04-10
 */
public class Person {

    /**
     * 姓名
     */
    String name;

    /**
     * 钱包金额
     */
    Double money;

    public Person() {
    }

    public Person(String name, Double money) {
        this.name = name;
        this.money = money;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Person person = (Person) o;
        return Objects.equals(name, person.name) &&
                Objects.equals(money, person.money);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, money);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Double getMoney() {
        return money;
    }

    public void setMoney(Double money) {
        this.money = money;
    }
}
