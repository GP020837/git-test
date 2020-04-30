package cn.itcast.idea.basicplus.inputoutput;

import java.io.FileReader;
import java.io.IOException;

/**
 * 字符输入流测试 class
 *
 * @author hzx
 * @date 2020-04-27
 */
public class ReaderTest {
    public static void main(String[] args) throws IOException {
        show02();
    }

    private static void show02() throws IOException {
        FileReader fileReader = new FileReader("D:\\development\\hm-basic-code\\java-basic\\src\\cn\\itcast\\idea\\basicplus\\inputoutput\\b.txt");
        int len;
        char[] chars = new char[1024];
        while ((len = fileReader.read(chars)) != -1) {
            System.out.print(new String(chars, 0, len));
        }
        fileReader.close();
    }

    private static void show01() throws IOException {
        FileReader fileReader = new FileReader("D:\\development\\hm-basic-code\\java-basic\\src\\cn\\itcast\\idea\\basicplus\\inputoutput\\b.txt");
        int len;
        while ((len = fileReader.read()) != -1) {
            System.out.print((char) len);
        }
        fileReader.close();
    }
}
