package cn.itcast.idea.basic.arraytest;

/**
 * 数组测试 class
 *
 * @author hzx
 * @date 2020-04-06
 */
public class ArrayTest {
    public static void main(String[] args) {
        //    数组的三种定义格式
        /**
         * 动态格式初始化
         * 使用动态初始化数组的时候，其中的元素将会自动拥有一个默认值。
         * 整数类型     0
         * 浮点类型     0.0
         * 字符类型     '\u0000'
         * 布尔类型     false
         * 引用类型     null
         */
        String[] str1 = new String[5];

        /**
         * 静态格式初始化
         */
        String[] str2 = new String[] {"1","2","3","4","5"};

        /**
         * 静态省略格式初始化
         */
        String[] str3 = {"1","2","3","4","5"};
//        直接访问数组获取内存地址哈希值
        System.out.println(str3);
//        访问数组元素进行获取值
        System.out.println(str3[1]);

        String[] str4 = null;
        str4 = new String[4];
        System.out.println(str4[0]);
    }
}

