package cn.itcast.idea.basic.objecttest;

/**
 * 测试 class
 *
 * @author hzx
 * @date 2020-04-06
 */
public class Test {
    static int age;
    static String name = "钟南山";
    public static void main(String[] args) {
        /*Phone phone = new Phone();
        phone.brand = "华为";
        phone.price = 6199.0;
        phone.color = "黑色";
        System.out.println("手机品牌："+ phone.brand);
        System.out.println("手机价格："+ phone.price);
        System.out.println("手机颜色：" + phone.color);
        phone.call(name);
        phone.sendMessage();*/
        Student s1 = new Student("刘德华",42);
        Student s2 = new Student("刘德华",42);
        s1.setAge(20);
        System.out.println(s1);
        System.out.println(s2);
        System.out.println(s1.hashCode());
        System.out.println(s2.hashCode());
        System.out.println(s1 == s2);
        System.out.println(s1.equals(s2));
        System.out.println(System.identityHashCode(s1));
        System.out.println(System.identityHashCode(s2));
    }
}
