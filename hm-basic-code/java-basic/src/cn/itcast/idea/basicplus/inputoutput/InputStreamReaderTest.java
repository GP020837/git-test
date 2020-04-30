package cn.itcast.idea.basicplus.inputoutput;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * 字符转换输入流测试 class
 *
 * @author hzx
 * @date 2020-04-29
 */
public class InputStreamReaderTest {
    public static void main(String[] args) throws IOException {
        show01();
    }

    private static void show01() throws IOException {
        InputStreamReader isr = new InputStreamReader(new FileInputStream("D:\\development\\hm-basic-code\\java-basic\\src\\cn\\itcast\\idea\\basicplus\\inputoutput\\gbk.txt"),"gbk");
        int len;
        while ((len = isr.read()) != -1){
            System.out.print((char) len);
        }
        isr.close();
    }
}
