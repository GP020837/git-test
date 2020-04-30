package cn.itcast.idea.basicplus.inputoutput;

import java.io.File;
import java.io.FileFilter;
import java.io.FilenameFilter;
import java.io.IOException;

/**
 * 文件测试 class
 *
 * @author hzx
 * @date 2020-04-26
 */
public class FileTest {
    public static void main(String[] args) throws IOException {
        getAllFileToJava03(new File("java-basic\\src\\cn\\itcast\\idea\\basicplus\\inputoutput"));
    }

    private static void getAllFileToJava03(File file) {
        /*File[] files = file.listFiles(new FilenameFilter() {
            @Override
            public boolean accept(File dir, String name) {
                return new File(dir, name).isDirectory() || new File(dir, name).getName().toLowerCase().endsWith(".java");
            }
        });*/
        File[] files = file.listFiles((dir, name) -> new File(dir, name).isDirectory() || new File(dir, name).getName().toLowerCase().endsWith(".java"));
        for (File file1 : files) {
            if(file1.isDirectory()){
                getAllFileToJava03(file1);
            }else {
                System.out.println(file1);
            }
        }
    }

    private static void getAllFileToJava02(File file) {
        File[] files = file.listFiles(new FileFilter() {
            @Override
            public boolean accept(File pathname) {
                return pathname.isDirectory() || pathname.getName().toLowerCase().endsWith(".java");
            }
        });
        for (File file1 : files) {
            if(file1.isDirectory()){
                getAllFileToJava02(file1);
            }else {
                System.out.println(file1);
            }
        }
    }

    /**
     * 获取这个文件夹目录下的.java文件
     *
     * @param file
     */
    private static void getAllFileToJava(File file) {
        File[] files = file.listFiles();
        for (File file1 : files) {
            if(file1.isDirectory()){
                getAllFileToJava(file1);
            }else {
                String name = file1.getName();
                if(name.endsWith(".java")){
                    System.out.println(file1);
                }
            }
        }
    }

    /**
     * 获取这个文件夹目录下的所有文件和文件目录，包括他本身
     *
     * @param file
     */
    private static void getAllFile(File file) {
        System.out.println(file);
        File[] files = file.listFiles();
        for (File file1 : files) {
            if(file1.isDirectory()){
                getAllFile(file1);
            }else {
                System.out.println(file1);
            }
        }
    }

    private static void show04() {
        File file02 = new File("java-basic\\src\\cn\\itcast\\idea\\basicplus\\inputoutput\\111\\222");
        boolean mkdirs = file02.delete();
        System.out.println(mkdirs);
    }

    private static void show03() {
        File file = new File("java-basic\\src\\cn\\itcast\\idea\\basicplus\\inputoutput\\aaa");
        boolean mkdir = file.mkdir();
        System.out.println(mkdir);
        File file02 = new File("java-basic\\src\\cn\\itcast\\idea\\basicplus\\inputoutput\\111\\222\\333\\444");
        boolean mkdirs = file02.mkdirs();
        System.out.println(mkdirs);
    }

    private static void show02() throws IOException {
        File file = new File("D:\\development\\hm-basic-code\\java-basic\\src\\cn\\itcast\\idea\\basicplus\\inputoutput\\CreateFileTest.java");
        boolean newFile = file.createNewFile();
        System.out.println(newFile);
    }

    private static void show01() {
        File file = new File("D:\\development\\hm-basic-code\\a.txt");
        System.out.println(file.getName());
    }
}
