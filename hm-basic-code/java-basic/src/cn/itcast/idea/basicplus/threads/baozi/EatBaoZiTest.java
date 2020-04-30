package cn.itcast.idea.basicplus.threads.baozi;

/**
 * 吃包子测试 class
 *
 * @author hzx
 * @date 2020-04-25
 */
public class EatBaoZiTest {
    public static void main(String[] args) {
        BaoZi baoZi = new BaoZi();
        new Thread(new BaoZiPu(baoZi)).start();
        new Thread(new ChiHuo(baoZi)).start();
    }
}
