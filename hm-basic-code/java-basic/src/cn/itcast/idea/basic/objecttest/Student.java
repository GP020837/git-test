package cn.itcast.idea.basic.objecttest;

import java.util.Objects;

/**
 * 标准的学生类 class
 *
 *  一个标准的类通常要拥有下面四个组成部分：
 *      所有的成员变量都要使用private关键字修饰
 *      为每一个成员变量编写一对Getter/Setter方法
 *      编写一个无参数的构造方法
 *      编写一个全参数的构造方法
 *
 * @author hzx
 * @date 2020-04-06
 */
public class Student {
    private String name;
    private int age;

    public Student() {
    }

    public Student(String name, int age) {
        this.name = name;
        this.age = age;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        Student student = (Student) o;
        return age == student.age &&
                Objects.equals(name, student.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, age);
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
