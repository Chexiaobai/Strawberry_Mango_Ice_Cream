package basic.collection.map.hashmap;

import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

public class HashMapTraining implements Runnable{

    private Map<String,Integer> map=new HashMap<>();

    @Override
    public void run() {

        for (int i=0;i<10;i++){

            map.clear();
            map.hashCode();
            map.size();
            map.entrySet();


            map.put("name"+i,i);

            System.out.println("线程:"+Thread.currentThread()+Thread.activeCount()+" i:"+i);
        }
    }

    public static void main(String[] args) {

        ConcurrentHashMap concurrentHashMap=new ConcurrentHashMap();

        HashMapTraining hashMapTraining1=new HashMapTraining();
        HashMapTraining hashMapTraining2=new HashMapTraining();

        Thread thread1=new Thread(hashMapTraining1,"线程1");
        Thread thread2=new Thread(hashMapTraining2,"线程2");

        thread1.start();
        thread2.start();
        /*thread1.run();
        thread2.run();*/

    }
}
