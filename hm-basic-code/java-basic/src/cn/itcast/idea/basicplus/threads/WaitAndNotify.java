package cn.itcast.idea.basicplus.threads;

/**
 * 等待唤醒机制 class
 *
 * @author hzx
 * @date 2020-04-25
 */
public class WaitAndNotify {
    public static void main(String[] args) {
        Object obj = new Object();

        /**
         * 创建一个顾客线程买包子
         */
        new Thread(){
            @Override
            public void run() {
                synchronized (obj){
                    System.out.println("告知老板的包子和种类数量");
                    try {
                        obj.wait();
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                    System.out.println("包子已做好，开吃");
                }
            }
        }.start();

        /**
         * 创建一个老板线程做包子
         */
        new Thread(){
            @Override
            public void run() {
                synchronized (obj){
                    try {
                        //要用2秒做包子
                        Thread.sleep(2000);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                    System.out.println("2秒过后，包子做好了，告知顾客");
                    obj.notify();
                }
            }
        }.start();
    }
}
