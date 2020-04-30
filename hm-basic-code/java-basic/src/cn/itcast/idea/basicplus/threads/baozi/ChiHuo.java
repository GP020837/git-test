package cn.itcast.idea.basicplus.threads.baozi;

/**
 * 吃货 class
 *
 * @author hzx
 * @date 2020-04-25
 */
public class ChiHuo implements Runnable {

    /**
     * 包子
     */
    private BaoZi baoZi;

    private int count = 1;

    public ChiHuo(BaoZi baoZi) {
        this.baoZi = baoZi;
    }

    @Override
    public void run() {
        while (count <= 5) {
            synchronized (baoZi) {
                if (baoZi.isFlag()) {
                    count++;
                    System.out.println(baoZi.getPi() + baoZi.getXian() + "包子做好了，吃货开始吃");
                    baoZi.setFlag(false);
                    try {
                        Thread.sleep(1000);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                    System.out.println("1秒后，包子吃完了");
                    System.out.println("-------------------");
                    baoZi.notify();
                    if (count > 5) {
                        try {
                            Thread.sleep(1000);
                        } catch (InterruptedException e) {
                            e.printStackTrace();
                        }finally {
                            System.out.println("结束");
                        }
                    }
                } else {
                    try {
                        baoZi.wait();
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }
            }
        }
    }
}

