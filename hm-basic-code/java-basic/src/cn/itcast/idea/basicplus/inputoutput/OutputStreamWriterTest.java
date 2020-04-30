package cn.itcast.idea.basicplus.inputoutput;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStreamWriter;

/**
 * 字符装换输出流 class
 *
 * @author hzx
 * @date 2020-04-29
 */
public class OutputStreamWriterTest {
    public static void main(String[] args) throws IOException {
        show01();
    }

    private static void show01() throws IOException {
        OutputStreamWriter osw = new OutputStreamWriter(new FileOutputStream("java-basic\\src\\cn\\itcast\\idea\\basicplus\\inputoutput\\gbk.txt"), "gbk");
        osw.write("你好，世界");
        osw.close();
    }
}
