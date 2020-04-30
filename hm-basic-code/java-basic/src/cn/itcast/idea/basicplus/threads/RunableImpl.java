package cn.itcast.idea.basicplus.threads;

import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

/**
 * 实现买票案例 class
 *
 * @author hzx
 * @date 2020-04-25
 */
public class RunableImpl implements Runnable {
    /**
     * 定义一个多个线程共享的票源
     */
    private int ticket = 100;

    /**
     * 创建一个共享锁对象
     */
    Object obj = new Object();

    /**
     * 在成员位置创建一个ReetrantLock对象
     */
    Lock l = new ReentrantLock();

    @Override
    public void run() {
        //第解决同步问题的第一种方案
        /*//同步代码块
        synchronized (obj){
            //让卖票操作重复执行
            while (ticket > 0){
                if(ticket > 0){
                    try {
                        Thread.sleep(10);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                    System.out.println(Thread.currentThread().getName() + "-->正在卖第" + ticket + "张票");
                    ticket--;
                }
            }
        }*/
//        payTicket();



        //解决同步问题的第三种方案
        //让卖票操作重复执行
        while (ticket > 0){
            l.lock();
            try {
                if(ticket > 0){
                    Thread.sleep(10);
                    System.out.println(Thread.currentThread().getName() + "-->正在卖第" + ticket + "张票");
                    ticket--;
                }
            } catch (InterruptedException e) {
                e.printStackTrace();
            }finally {
                l.unlock();
            }
        }
    }

    //解决同步问题的第二种方案
    /**
     * 定义一个同步方法
     *      static 静态同步方法
     */
    /*private synchronized  void payTicket() {
        //让卖票操作重复执行
        while (ticket > 0){
            if(ticket > 0){
                try {
                    Thread.sleep(10);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                System.out.println(Thread.currentThread().getName() + "-->正在卖第" + ticket + "张票");
                ticket--;
            }
        }
    }*/
}
