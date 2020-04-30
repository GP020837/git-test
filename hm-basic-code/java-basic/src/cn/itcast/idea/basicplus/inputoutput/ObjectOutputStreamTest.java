package cn.itcast.idea.basicplus.inputoutput;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

/**
 * 对象的序列化流 class
 *
 * @author hzx
 * @date 2020-04-29
 */
public class ObjectOutputStreamTest {
    public static void main(String[] args) throws IOException {
        show01();
    }

    private static void show01() throws IOException {
        ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("D:\\development\\hm-basic-code\\java-basic\\src\\cn\\itcast\\idea\\basicplus\\inputoutput\\person.txt"));
        oos.writeObject(new Person("周润发",50));
        oos.write("\n你好，世界".getBytes());
        oos.close();
    }
}
