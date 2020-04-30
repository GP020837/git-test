package cn.itcast.idea.basicplus.extendsandpolymorphism.computerexample;

/**
 * 鼠标 class
 *
 * @author hzx
 * @date 2020-04-18
 */
public class Mouse implements Usb {

    @Override
    public void Open() {
        System.out.println("开启鼠标");
    }

    @Override
    public void Close() {
        System.out.println("关闭鼠标");
    }

    public void Click(){
        System.out.println("点击鼠标");
    }
}
