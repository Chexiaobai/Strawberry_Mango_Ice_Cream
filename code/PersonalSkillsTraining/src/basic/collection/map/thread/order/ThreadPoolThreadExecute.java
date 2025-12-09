package basic.collection.map.thread.order;

import java.util.concurrent.CountDownLatch;
import java.util.concurrent.Semaphore;

/**
 * CountDownLatch是java并发库中一个同步辅助类，允许一个或多个线程等待其他线程完成操作
 *      在此借助他来让三个线程之间进行通信，以达到顺序执行的目的
 * @author wangxiaorui
 */
public class SemaphoreThreadExecute {

    public static void main(String[] args) throws InterruptedException {

        // 创建Semaphore对象，用来做线程通信
        Semaphore semaphore = new Semaphore(1);

        // 等待线程T1执行完
        semaphore.acquire();

        // 创建并启动线程T1
        Thread t1 = new Thread(new MyThreadSemaphore(semaphore),"T1");
        t1.start();



        // 等待线程T2执行完
        semaphore.acquire();


        // 创建并启动线程T2
        Thread t2 = new Thread(new MyThreadSemaphore(semaphore),"T2");
        t2.start();


        // 等待线程T3执行完
        semaphore.acquire();

        // 创建并启动线程T3
        Thread t3 = new Thread(new MyThreadSemaphore(semaphore),"T3");
        t3.start();



    }
}
