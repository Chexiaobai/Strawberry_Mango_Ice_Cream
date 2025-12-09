package basic.collection.map.thread.order;

import java.util.concurrent.CountDownLatch;

/**
 * CountDownLatch是java并发库中一个同步辅助类，允许一个或多个线程等待其他线程完成操作
 *      在此借助他来让三个线程之间进行通信，以达到顺序执行的目的
 * @author wangxiaorui
 */
public class CountDownLatchThreadExecute {

    public static void main(String[] args) throws InterruptedException {

        // 创建CountDownLatch对象，用来做线程通信
        CountDownLatch countDownLatch = new CountDownLatch(1);
        CountDownLatch countDownLatch2 = new CountDownLatch(1);
        CountDownLatch countDownLatch3 = new CountDownLatch(1);

        // 创建并启动线程T1
        Thread t1 = new Thread(new MyThreadCountDownLatch(countDownLatch),"T1");
        t1.start();

        // 等待线程T1执行完
        countDownLatch.await();

        // 创建并启动线程T2
        Thread t2 = new Thread(new MyThreadCountDownLatch(countDownLatch2),"T2");
        t2.start();

        // 等待线程T2执行完
        countDownLatch2.await();

        // 创建并启动线程T3
        Thread t3 = new Thread(new MyThreadCountDownLatch(countDownLatch3),"T3");
        t3.start();

        // 等待线程T3执行完
        countDownLatch3.await();

    }
}
