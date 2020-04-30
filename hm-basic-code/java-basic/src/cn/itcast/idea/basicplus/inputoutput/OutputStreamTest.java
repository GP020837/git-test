package cn.itcast.idea.basicplus.inputoutput;

import java.io.FileOutputStream;
import java.io.IOException;

/**
 * 输出流测试 class
 *
 * @author hzx
 * @date 2020-04-26
 */
public class OutputStreamTest {
    public static void main(String[] args) throws IOException {
        show02();
    }

    private static void show02() throws IOException {
        FileOutputStream fos = new FileOutputStream("java-basic\\src\\cn\\itcast\\idea\\basicplus\\inputoutput\\b.txt", true);
        for (int i = 0; i < 10; i++) {
            fos.write("世界".getBytes());
            fos.write("\r".getBytes());
        }
        fos.close();
    }

    private static void show01() throws IOException {
        FileOutputStream fos = new FileOutputStream("java-basic\\src\\cn\\itcast\\idea\\basicplus\\inputoutput\\a.txt");
        fos.write(98);
        byte[] bytes = {11,22,33,44,55};
        fos.write(bytes);
        fos.write(bytes,2,3);
        /**
         * 可以使用String类中的方法把字符串，转换为字节数组
         *      byte[] getBytes() 把字符串转换为字节数组
         */
        byte[] bytes2 = "你好，世界".getBytes();
        fos.write(bytes2);
        fos.close();
    }
}
