package cn.itcast.idea.basicplus.inputoutput;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

/**
 * 输入流测试 class
 *
 * @author hzx
 * @date 2020-04-26
 */
public class InputStreamTest {
    public static void main(String[] args) throws IOException {
        show01();
    }

    private static void copyFileTest02() throws IOException {
        long s = System.currentTimeMillis();
        FileInputStream fis = new FileInputStream("E:\\黑马19\\02_JAVA语言进阶\\06-File类与IO流\\03 过滤器\\1_8_3_01_FileFilter过滤器的原理和使用.avi");
        FileOutputStream fos = new FileOutputStream("F:\\下载\\1_8_3_01_FileFilter过滤器的原理和使用.avi");
        byte[] bytes = new byte[1024];
        int len = 0;
        while ((len = fis.read(bytes)) != -1) {
            fos.write(bytes, 0, len);
        }
        fos.close();
        fis.close();
        long e = System.currentTimeMillis();
        //传输共用时：1086毫秒
        System.out.println("传输共用时：" + (e - s) + "毫秒");
    }

    /**
     * int read()
     *
     * @throws IOException
     */
    private static void copyFileTest01() throws IOException {
        long s = System.currentTimeMillis();
        FileInputStream fis = new FileInputStream("E:\\黑马19\\02_JAVA语言进阶\\06-File类与IO流\\04 IO字节流\\1_8_4_01_IO概述(概念&分类).avi");
        FileOutputStream fos = new FileOutputStream("F:\\下载\\1_8_4_01_IO概述(概念&分类).avi");
        int len = 0;
        while ((len = fis.read()) != -1) {
            fos.write(len);
        }
        fos.close();
        fis.close();
        long e = System.currentTimeMillis();
        //传输共用时：114472毫秒
        System.out.println("传输共用时：" + (e - s) + "毫秒");
    }

    private static void show02() throws IOException {
        FileInputStream fis = new FileInputStream("java-basic\\src\\cn\\itcast\\idea\\basicplus\\inputoutput\\a.txt");
        byte[] bytes = new byte[1024];
        int len = 0;
        while ((len = fis.read(bytes)) != -1) {
            /**
             * String的构造方法
             *      String(byte[] bytes) 把字节数组装换为字符串
             *      String(byte[] bytes, int offset, int length) 把字节数组的一部分转换为字符串
             *          int offset 数组的开始索引
             *          int length 转换的字节个数
             */
            System.out.print(new String(bytes, 0, len));
        }
        fis.close();
    }

    private static void show01() throws IOException {
        FileInputStream fis = new FileInputStream("java-basic\\src\\cn\\itcast\\idea\\basicplus\\inputoutput\\aaa.txt");
        int len = 0;
        while ((len = fis.read()) != -1) {
            System.out.print((char) len);
        }
        fis.close();
    }
}
