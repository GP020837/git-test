package cn.itcast.idea.basicplus.inputoutput;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;

/**
 * 对象的反序列化流 class
 *
 * @author hzx
 * @date 2020-04-29
 */
public class ObjectInputStreamTest {
    public static void main(String[] args) throws IOException, ClassNotFoundException {
        show01();
    }

    private static void show01() throws IOException, ClassNotFoundException {
        ObjectInputStream ois = new ObjectInputStream(new FileInputStream("D:\\development\\hm-basic-code\\java-basic\\src\\cn\\itcast\\idea\\basicplus\\inputoutput\\person.txt"));
        Object o = ois.readObject();
        ois.close();
        System.out.println(o);
        Person person = (Person) o;
        System.out.println(person.getName() + person.getAge());
    }
}
