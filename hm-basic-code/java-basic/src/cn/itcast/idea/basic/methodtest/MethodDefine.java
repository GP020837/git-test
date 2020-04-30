package cn.itcast.idea.basic.methodtest;

/**
 * 方法定义 class
 *
 * @author hzx
 * @date 2020-04-05
 */
public class MethodDefine {
    public static void main(String[] args) {
        String[] str = {"1","2","3"};
        str[0] = ";";
        for (int i = 0; i < str.length; i++) {
            System.out.println(str[i]);
        }
    }

    private static int sum(int a,int b) {
        System.out.println("方法正在执行...");
        int result = a + b;
        System.out.println("方法开始返回...");
        return result;
    }
}
