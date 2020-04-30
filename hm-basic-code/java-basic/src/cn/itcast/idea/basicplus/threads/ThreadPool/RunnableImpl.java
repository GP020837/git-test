package cn.itcast.idea.basicplus.threads.ThreadPool;

/**
 * Runnable实现类 class
 *
 * @author hzx
 * @date 2020-04-25
 */
public class RunnableImpl implements Runnable {
    @Override
    public void run() {
        System.out.println(Thread.currentThread().getName() + "执行了一个任务");
    }
}
