package cn.itcast.idea.basicplus.javaapi;


/**
 * 点名测试 class
 *
 * @author hzx
 * @date 2020-04-07
 */
public class ScannerTest {
    public static void main(String[] args) {
        RadomPrintName rpn = new RadomPrintName();
        String[] aClassNum = {"爷爷","奶奶","外公","外婆","黄远忠","许桂兰","许炳坤","许素梅","许文生","黄佳丽","黄梓豪","黄紫涵","孙子","孙女","外孙","外女","黄祖兴","钟秀玉"};
        //设置数组的初始值
        rpn.setclassNum(aClassNum);
        System.out.println("欢迎来到点名系统！");
        //调用点名方法，并且得到数组的值，传给方法
        try {
            rpn.radomPrintName(rpn.getclassNum());
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
