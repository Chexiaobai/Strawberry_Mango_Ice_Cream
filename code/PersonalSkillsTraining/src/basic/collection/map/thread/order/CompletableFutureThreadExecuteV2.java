package basic.collection.map.thread.order;

import java.util.concurrent.CompletableFuture;

import static java.util.concurrent.Executors.newFixedThreadPool;

/**
 * CompletableFuture 异步编程的强大工具，
 * CompletableFuture 可以用来创建、组合、转换和管理异步任务，
 *      在此借助他来让三个线程之间进行通信，以达到顺序执行的目的
 * @author wangxiaorui
 */
public class CompletableFutureThreadExecuteV1 {

    public static void main(String[] args)  {

        // 创建 CompletableFuture 对象
        CompletableFuture<Void> future = CompletableFuture.runAsync(new MyThread("T1"));

        // 等待线程T1完成
        future.join();

        // 创建 CompletableFuture 对象
        CompletableFuture<Void> future2 = CompletableFuture.runAsync(new MyThread("T2"));

        // 等待线程T1完成
        future2.join();

        // 创建 CompletableFuture 对象
        CompletableFuture<Void> future3 = CompletableFuture.runAsync(new MyThread("T3"));

        // 等待线程T1完成
        future3.join();

    }
}
