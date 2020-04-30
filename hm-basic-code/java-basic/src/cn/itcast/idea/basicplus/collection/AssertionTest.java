package cn.itcast.idea.basicplus.collection;

/**
 * （assert）断言测试 class
 *
 * @author hzx
 * @date 2020-04-21
 */
public class AssertionTest {
    public static void main(String[] args) {

        /*boolean isSafe = false;
        *//**
         * 需要使用断言时，需将其开启
         *//*
        assert isSafe: "Not Safe at all";
        System.out.println("断言通过!");*/
        String s1 = new String("abc");
        String s2 = new String("abc");
        System.out.println(s1.hashCode());
        System.out.println(s2.hashCode());
        System.out.println(s1);
        System.out.println(s2);
        System.out.println(s1 == s2);
        System.out.println(s1.equals(s2));
        String s3 = "abc";
        String s4 = "abc";
        System.out.println(s3 == s4);
    }
}
