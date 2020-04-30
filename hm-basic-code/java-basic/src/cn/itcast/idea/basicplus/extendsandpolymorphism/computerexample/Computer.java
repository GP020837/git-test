package cn.itcast.idea.basicplus.extendsandpolymorphism.computerexample;

/**
 * 电脑 class
 *
 * @author hzx
 * @date 2020-04-18
 */
public class Computer {

    /**
     * 开机
     */
    public void Bootup(){
        System.out.println("开机");
    }

    /**
     * 关机
     */
    public void Shutdown(){
        System.out.println("关机");
    }

    /**
     * 使用设备
     * @param usb
     */
    public void UseDevice(Usb usb){
        usb.Open();
        if(usb instanceof Mouse){
            Mouse mouse = (Mouse)usb;
            mouse.Click();
        }else if(usb instanceof Keyboard){
            Keyboard keyboard = (Keyboard)usb;
            keyboard.Percussion();
        }
        usb.Close();
    }
}
