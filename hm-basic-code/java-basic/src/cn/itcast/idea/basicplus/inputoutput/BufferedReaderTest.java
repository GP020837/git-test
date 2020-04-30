package cn.itcast.idea.basicplus.inputoutput;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

/**
 * 字符缓冲输入流测试 class
 *
 * @author hzx
 * @date 2020-04-28
 */
public class BufferedReaderTest {
    public static void main(String[] args) throws IOException {
        show01();
    }

    private static void show01() throws IOException {
        BufferedReader br = new BufferedReader(new FileReader("D:\\development\\hm-basic-code\\java-basic\\src\\cn\\itcast\\idea\\basicplus\\inputoutput\\BufferedWriter.txt"));
        String s;
        while ((s = br.readLine()) != null){
            System.out.println(s);
        }
        br.close();
    }
}
