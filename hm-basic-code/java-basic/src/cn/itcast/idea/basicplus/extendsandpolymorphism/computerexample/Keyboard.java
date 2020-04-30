package cn.itcast.idea.basicplus.extendsandpolymorphism.computerexample;

/**
 * 键盘 class
 *
 * @author hzx
 * @date 2020-04-18
 */
public class Keyboard implements Usb {
    
    @Override
    public void Open() {
        System.out.println("开启键盘");
    }

    @Override
    public void Close() {
        System.out.println("关闭键盘");
    }

    public void Percussion(){
        System.out.println("敲击键盘");
    }
}
