package basic.collection.map.thread.createAndStartThread;

public class TestThread extends  Thread{

    public TestThread(String name){
        super(name);
    }

    @Override
    public void run() {
        for (int i=0;i<10;i++){
            System.out.println(this.getName()+"i:"+i);
        }
    }

    public static void main(String[] args) {

        TestThread testThread=new TestThread("吃吃吃");
        TestThread testThread1=new TestThread("呵呵呵");
        testThread.start();
        testThread1.start();
    }
}
