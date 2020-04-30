package cn.itcast.idea.basicplus.threads;

/**
 * 线程练习 class
 *      随机性打印结果
 *
 * @author hzx
 * @date 2020-04-24
 */
public class ThreadTest {
    public static void main(String[] args) {
        /*int sum = 1;
        MyThread myThread = new MyThread("自定义第一个线程");
        System.out.println(myThread);
        myThread.start();

        new MyThread("自定义第二个线程").start();
        System.out.println(Thread.currentThread());*/

        /*for (int i = 0; i < 20; i++) {
            System.out.println("main" + i);
            try {
                //一秒后执行
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }*/
        /*new Thread(){
            @Override
            public void run() {
                for (int i = 0; i < 20; i++) {
                    System.out.println("匿名内部类Thread一 " + i);
                }
            }
        }.start();


        new Thread(new Runnable(){
            @Override
            public void run() {
                for (int i = 0; i < 20; i++) {
                    System.out.println("匿名内部类Runable一 "+ i);
                }
            }
        }).start();*/

        RunableImpl runable = new RunableImpl();
        Thread thread01 = new Thread(runable);
        Thread thread02 = new Thread(runable);
        Thread thread03 = new Thread(runable);

        thread01.start();
        thread02.start();
        thread03.start();
    }
}
