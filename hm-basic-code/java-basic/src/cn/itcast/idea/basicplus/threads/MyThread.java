package cn.itcast.idea.basicplus.threads;

/**
 * 我的线程 class
 *
 * @author hzx
 * @date 2020-04-24
 */
public class MyThread extends Thread {
    public MyThread() {
    }

    public MyThread(String name) {
        super(name);
    }

    @Override
    public void run() {
//        int sum = 1;
//        for (int i = 0; i < 20; i++) {
//            System.out.println("run" + sum++);
//        }
        System.out.println(currentThread());
    }
}
