package cn.itcast.idea.basicplus.threads.baozi;

/**
 * 包子铺 class
 *
 * @author hzx
 * @date 2020-04-25
 */
public class BaoZiPu implements Runnable {

    /**
     * 包子锁对象
     */
    private BaoZi baoZi;

    private int count = 1;

    public BaoZiPu(BaoZi baoZi) {
        this.baoZi = baoZi;
    }

    @Override
    public void run() {
        while (count <= 5) {
            synchronized (baoZi) {
                if (baoZi.isFlag()) {
                    try {
                        baoZi.wait();
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                } else {
                    System.out.println("第" + count + "天，没有包子，开始制作");
                    if (count % 2 == 0) {
                        baoZi.setPi("薄皮");
                        baoZi.setXian("三鲜馅");
                    } else {
                        baoZi.setPi("冰皮");
                        baoZi.setXian("牛肉大葱馅");
                    }
                    count++;
                    baoZi.setFlag(true);
                    try {
                        Thread.sleep(2000);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                    System.out.println("2秒后，" + baoZi.getPi() + baoZi.getXian() + "包子做好了");
                    baoZi.notify();
                }
            }
        }
    }
}
