package basic.collection.map.thread.createAndStartThread;

public class ThreadCreateAndStart_Model1 extends  Thread{




    @Override
    public void run() {
        super.run();
        System.out.println("1");
    }

    public static void main(String[] args) {
        ThreadCreateAndStart_Model1 model1=new ThreadCreateAndStart_Model1();//创建一个线城时，会独立调用其中的run方法
        model1.run();


    }
}
