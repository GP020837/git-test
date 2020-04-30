package cn.itcast.idea.basic.methodtest;

/**
 * 方法测试 class
 *
 * @author hzx
 * @date 2020-04-05
 */
public class DemoMethod {
    public static void main(String[] args) {
        methodTest();
    }

    /*
    生成以*号为主的长20，宽5的长方形
     */
    private static void methodTest() {
        int num = 100;
        for (int i = 1; i <= num; i++) {
            System.out.print("*");
            if(i % 20 == 0){
                System.out.println();
            }
        }
    }
}
