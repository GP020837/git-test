package cn.itcast.idea.basicplus.inputoutput;

import java.io.FileWriter;
import java.io.IOException;

/**
 * 字符输出流测试 class
 *
 * @author hzx
 * @date 2020-04-27
 */
public class WriterTest {
    public static void main(String[] args) throws IOException {
        show02();
    }

    private static void show02() throws IOException {
        FileWriter fileWriter = new FileWriter("D:\\development\\hm-basic-code\\java-basic\\src\\cn\\itcast\\idea\\basicplus\\inputoutput\\d.txt");
        char[] cs = {'a','b','c','d','e'};
        fileWriter.write(cs);

        fileWriter.write(cs,1,3);

        fileWriter.write("创智播客");

        fileWriter.write("黑马程序员",2,3);

        fileWriter.close();
    }

    private static void show01() throws IOException {
        FileWriter fileWriter = new FileWriter("D:\\development\\hm-basic-code\\java-basic\\src\\cn\\itcast\\idea\\basicplus\\inputoutput\\c.txt");
        fileWriter.write(97);
        fileWriter.flush();
        fileWriter.close();
    }
}
