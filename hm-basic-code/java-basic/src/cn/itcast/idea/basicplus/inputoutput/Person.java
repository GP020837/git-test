package cn.itcast.idea.basicplus.inputoutput;

import java.io.Serializable;

/**
 * XXX class
 *
 * @author hzx
 * @date 2020-04-29
 */
public class Person implements Serializable {

    private static final long serialVersionUID = 1L;

    private String name;

    private int age;

    public Person() {
    }

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
}
