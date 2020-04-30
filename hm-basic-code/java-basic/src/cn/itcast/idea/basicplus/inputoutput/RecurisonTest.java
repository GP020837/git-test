package cn.itcast.idea.basicplus.inputoutput;

/**
 * 递归测试 class
 *
 * @author hzx
 * @date 2020-04-26
 */
public class RecurisonTest {
    public static void main(String[] args) {
        show02();
    }

    private static void show02() {
        System.out.println(jc(5));
    }

    private static int jc(int i) {
        if(i == 1){
            return 1;
        }
        return i * jc(i-1);
    }

    private static void show01() {
        int sum = sum(2);
        System.out.println(sum);
    }

    private static int sum(int i) {
        if(i == 1){
            //必须有个跳出递归的逻辑
            return 1;
        }
        return i + sum(i-1);
    }
}
