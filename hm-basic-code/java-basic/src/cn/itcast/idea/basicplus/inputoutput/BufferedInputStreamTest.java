package cn.itcast.idea.basicplus.inputoutput;

import java.io.*;

/**
 * 字节缓冲输入流测试 class
 *
 * @author hzx
 * @date 2020-04-28
 */
public class BufferedInputStreamTest {
    public static void main(String[] args) throws IOException {
        copyFileTest02();
    }

    private static void copyFileTest02() throws IOException {
        long s = System.currentTimeMillis();
        FileInputStream fis = new FileInputStream("E:\\黑马19\\02_JAVA语言进阶\\06-File类与IO流\\03 过滤器\\1_8_3_01_FileFilter过滤器的原理和使用.avi");
        FileOutputStream fos = new FileOutputStream("F:\\下载\\1_8_3_01_FileFilter过滤器的原理和使用.avi");
        BufferedInputStream bis = new BufferedInputStream(fis);
        BufferedOutputStream bos = new BufferedOutputStream(fos);

        byte[] bytes = new byte[1024];
        int len = 0;
        while ((len = bis.read(bytes)) != -1) {
            bos.write(bytes, 0, len);
        }
        bos.close();
        bis.close();
        fos.close();
        fis.close();
        long e = System.currentTimeMillis();
        //传输共用时：255毫秒
        System.out.println("传输共用时：" + (e - s) + "毫秒");
    }

    private static void show01() throws IOException {
        FileInputStream fis = new FileInputStream("java-basic\\src\\cn\\itcast\\idea\\basicplus\\inputoutput\\BufferedOutputStreamTest.txt");
        BufferedInputStream bis = new BufferedInputStream(fis);
        byte[] bytes = new byte[1024];
        int len;
        while ((len = bis.read(bytes)) != -1){
            System.out.print(new String(bytes,0,len));
        }
        bis.close();
        fis.close();
    }
}
