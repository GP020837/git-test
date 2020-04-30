package cn.itcast.idea.basicplus.extendsandpolymorphism.computerexample;

/**
 * 测试 class
 *
 * @author hzx
 * @date 2020-04-18
 */
public class Test {
    public static void main(String[] args) {
        Computer computer = new Computer();
        computer.Bootup();
        computer.UseDevice(new Mouse());
        computer.UseDevice(new Keyboard());
        computer.Shutdown();
    }
}
