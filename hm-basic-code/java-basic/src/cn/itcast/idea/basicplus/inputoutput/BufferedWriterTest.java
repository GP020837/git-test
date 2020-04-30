package cn.itcast.idea.basicplus.inputoutput;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

/**
 * 字符缓冲输出流测试 class
 *
 * @author hzx
 * @date 2020-04-28
 */
public class BufferedWriterTest {
    public static void main(String[] args) throws IOException {
        show01();
    }

    private static void show01() throws IOException {
        BufferedWriter bw = new BufferedWriter(new FileWriter("D:\\development\\hm-basic-code\\java-basic\\src\\cn\\itcast\\idea\\basicplus\\inputoutput\\BufferedWriter.txt",true));
        bw.write("我是程序员黄祖兴");
        //换行
        bw.newLine();
        bw.close();
    }
}
