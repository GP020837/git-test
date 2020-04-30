package cn.itcast.idea.basicplus.inputoutput;

import java.io.BufferedOutputStream;
import java.io.FileOutputStream;
import java.io.IOException;

/**
 * 字节缓冲输出流测试 class
 *
 * @author hzx
 * @date 2020-04-27
 */
public class BufferedOutputStreamTest {
    public static void main(String[] args) throws IOException {
        show01();
    }

    private static void show01() throws IOException {
        FileOutputStream fos = new FileOutputStream("java-basic\\src\\cn\\itcast\\idea\\basicplus\\inputoutput\\BufferedOutputStreamTest.txt",true);
        BufferedOutputStream bos = new BufferedOutputStream(fos);
        bos.write("\n我是程序员黄祖兴".getBytes());
        bos.close();
    }
}
