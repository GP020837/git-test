package cn.itcast.idea.basicplus.inputoutput;

import java.io.*;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * 练习测试 class
 *
 * @author hzx
 * @date 2020-04-29
 */
public class DemoTest {
    public static void main(String[] args) throws IOException, ClassNotFoundException {
        show03();
    }

    private static void show03() throws IOException, ClassNotFoundException {
        List<Person> list = new ArrayList<>();
        list.add(new Person("刘德华",55));
        list.add(new Person("周星驰",52));
        list.add(new Person("周润发",50));
        ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("java-basic\\src\\cn\\itcast\\idea\\basicplus\\inputoutput\\Person03.txt"));
        ObjectInputStream ois = new ObjectInputStream(new FileInputStream("java-basic\\src\\cn\\itcast\\idea\\basicplus\\inputoutput\\Person03.txt"));
        oos.writeObject(list);
        oos.flush();
        List<Person> personList = (List<Person>) ois.readObject();
        for (Person person : personList) {
            System.out.println(person);
        }
        ois.close();
        oos.close();
    }

    /**
     * 练习
     *      转换文件编码 （将GBK编码的文本文件，装换为UTF-8的文本文件）
     *
     * @throws IOException
     */
    private static void show02() throws IOException {
        InputStreamReader isr = new InputStreamReader(new BufferedInputStream(new FileInputStream("java-basic\\src\\cn\\itcast\\idea\\basicplus\\inputoutput\\gbk.txt")),"gbk");
        OutputStreamWriter osw = new OutputStreamWriter(new BufferedOutputStream(new FileOutputStream("java-basic\\src\\cn\\itcast\\idea\\basicplus\\inputoutput\\utf-8.txt")));
        char[] chars = new char[1024];
        int len;
        while ((len = isr.read(chars)) != -1){
            osw.write(chars,0,len);
        }
        osw.close();
        isr.close();
    }

    /**
     * 练习
     *      文本排序（将文本信息恢复顺序）
     *
     * @throws IOException
     */
    private static void show01() throws IOException {
        HashMap<String,String> hashMap = new HashMap<>(16);
        BufferedReader br = new BufferedReader(new FileReader("java-basic\\src\\cn\\itcast\\idea\\basicplus\\inputoutput\\in.txt"));
        BufferedWriter bw = new BufferedWriter(new FileWriter("java-basic\\src\\cn\\itcast\\idea\\basicplus\\inputoutput\\out.txt"));
        String len;
        while ((len = br.readLine()) != null){
            String[] arr = len.split("-");
            hashMap.put(arr[0], arr[1]);
        }
        for (String key : hashMap.keySet()) {
            bw.write(key + "、" + hashMap.get(key));
            bw.newLine();
        }
        bw.close();
        br.close();
    }

    /**
     * 练习
     *      文件的复制
     *
     * @throws IOException
     */
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
}
