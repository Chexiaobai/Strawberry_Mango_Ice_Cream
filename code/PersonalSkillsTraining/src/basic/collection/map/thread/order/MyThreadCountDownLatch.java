package basic.collection.map.thread.order;

import java.util.concurrent.CountDownLatch;

public class MyThread implements Runnable{

    private CountDownLatch countDownLatch ;

    public MyThread(CountDownLatch countDownLatch) {
        this.countDownLatch = countDownLatch;
    }

    @Override
    public void run() {

        try {
            // 模拟执行任务
            Thread.sleep(1000);
            System.out.println(Thread.currentThread().getName() + " is Running");
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }finally {
            // 完成一个线程，计数器减1
            countDownLatch.countDown();
        }
    }
}
