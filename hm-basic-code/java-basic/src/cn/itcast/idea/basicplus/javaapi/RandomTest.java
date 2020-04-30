package cn.itcast.idea.basicplus.javaapi;

import java.util.Random;

/**
 * 随机测试 class
 *
 * @author hzx
 * @date 2020-04-08
 */
public class RandomTest {
    public static void main(String[] args) {
        Random random = new Random();
        int x = 100;
        //随机生成0-100以内的数字
        int num = random.nextInt(x);
        System.out.println(num);
    }
}
