package cn.itcast.idea.basic.arraytest;

/**
 * 数组反转 class
 *
 * @author hzx
 * @date 2020-04-06
 */
public class ArrayReverse {
    /**
    本来的样子{1,2,3,4}
    之后的样子{4,3,2,1}

    要求不能使用新数组，就用原来的唯一一个数组
     思路：看‘数组反转的思路图’
    */
    public static void main(String[] args) {
        int[] arrayA =  {1,2,3,4};
        int temp;
        for (int i = 0; i < arrayA.length; i++) {
            if(i < arrayA.length-i-1){
                temp = arrayA[i];
                arrayA[i] = arrayA[arrayA.length-i-1];
                arrayA[arrayA.length-i-1] = temp;
            }
            System.out.println("数组索引" + i + "的值为：" + arrayA[i]);
            System.out.println(arrayA);
        }
    }
}
