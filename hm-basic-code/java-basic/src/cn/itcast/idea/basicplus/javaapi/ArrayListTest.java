package cn.itcast.idea.basicplus.javaapi;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Random;

/**
 * 数组集合测试 class
 *
 * @author hzx
 * @date 2020-04-08
 */
public class ArrayListTest {
    public static void main(String[] args) {
        /**
         * 生成n个1~10的随机整数
         * 保存到int数组
         * 相加得出总数
         * 随机整数除于总数取四舍五入值保存到double数组
         */
//        Random random = new Random();
//        int tempnum = 0;
//        int[] tempArrayInt = new int[5];
//        int tempcount = 0;
//        double[] tempArrayDouble = new double[5];
//        for (int i = 0; i < tempArrayInt.length; i++) {
//            tempnum = random.nextInt(10) + 1;
//            tempArrayInt[i] = tempnum;
//            tempcount += tempnum;
//        }
//        for (int j = 0; j < tempArrayInt.length; j++) {
//            tempnum = tempArrayInt[j];
//            BigDecimal b = new BigDecimal((double)tempnum / tempcount);
//            tempArrayDouble[j] = b.setScale(2, BigDecimal.ROUND_HALF_UP).doubleValue();
//        }
//        System.out.println(Arrays.toString(tempArrayDouble));
        List<Integer> list = new ArrayList<Integer>();
        System.out.println(list.toArray());
        list.add(1);
        System.out.println(list.toArray());
        list.add(2);
        System.out.println(list.toArray());
        list.add(3);
        System.out.println(list.toArray());
        list.add(2, 4);
        System.out.println(list.toArray());
    }
}
