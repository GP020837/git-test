package cn.itcast.idea.basic.objecttest;

/**
 * 手机对象 class
 *
 * @author hzx
 * @date 2020-04-06
 */
public class Phone {

    /**
     * 品牌
     */
    String brand;

    /**
     * 价格
     */
    Double price;

    /**
     * 颜色
     */
    String color;

    /**
     * 打电话
     * @param people
     */
    public void call(String people){
        System.out.println("给" + people + "打电话");
    }

    /**
     * 群发短信
     */
    public void sendMessage(){
        System.out.println("群发短信");
    }
}
