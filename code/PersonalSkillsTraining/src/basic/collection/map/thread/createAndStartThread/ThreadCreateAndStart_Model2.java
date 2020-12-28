package basic.collection.map.thread.createAndStartThread;

public class ThreadCreateAndStart_Model2 {

    public static void main(String[] args) {

        DoSomething doSomething1=new DoSomething("吃吃吃");
        DoSomething doSomething2=new DoSomething("喝喝喝");

        Thread thread1=new Thread(doSomething1);
        Thread thread2=new Thread(doSomething2);

        thread1.start();
        thread2.start();
    }

}
