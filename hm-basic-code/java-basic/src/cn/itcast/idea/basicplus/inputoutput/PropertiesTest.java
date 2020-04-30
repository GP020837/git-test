package cn.itcast.idea.basicplus.inputoutput;

import java.io.*;
import java.util.Properties;
import java.util.Set;

/**
 * 属性集测试 class
 *
 * @author hzx
 * @date 2020-04-27
 */
public class PropertiesTest {
    public static void main(String[] args) throws IOException {
        show04();
    }

    private static void show04() throws IOException {
        Properties properties = new Properties();
        properties.load(new FileReader("java-basic\\src\\cn\\itcast\\idea\\basicplus\\inputoutput\\prop.txt"));
        Set<String> sets = properties.stringPropertyNames();
        for (String key : sets) {
            System.out.println(key + "=" + properties.getProperty(key));
        }
    }

    private static void show03() throws IOException {
        Properties properties = new Properties();
        properties.setProperty("刘德华","50");
        properties.setProperty("周星驰","52");
        properties.setProperty("周润发","55");
        properties.store(new FileOutputStream("D:\\development\\hm-basic-code\\java-basic\\src\\cn\\itcast\\idea\\basicplus\\inputoutput\\prop02.txt"),"Test");
    }

    private static void show02() throws IOException {
        Properties properties = new Properties();
        properties.setProperty("刘德华","50");
        properties.setProperty("周星驰","52");
        properties.setProperty("周润发","55");
        FileWriter fileWriter = new FileWriter("D:\\development\\hm-basic-code\\java-basic\\src\\cn\\itcast\\idea\\basicplus\\inputoutput\\prop.txt");
        properties.store(fileWriter,"Test");
        fileWriter.close();
    }

    private static void show01() {
        Properties properties = new Properties();
        properties.setProperty("刘德华","50");
        properties.setProperty("周星驰","52");
        properties.setProperty("周润发","55");
        Set<String> sets = properties.stringPropertyNames();
        for (String set : sets) {
            System.out.println("姓名：" + set + "，年龄：" + properties.getProperty(set));
        }
    }
}
