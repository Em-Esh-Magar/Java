package MultiThreading;

class MyThread extends Thread{
    public MyThread(String name){
        super(name);
    }

    public void run(){
        System.out.println("From : "+this.getName());
        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}

public class ThreadExtend {
    public static void main(String[] args) {
        MyThread myThread1 = new MyThread("myThread1");
        MyThread myThread2 = new MyThread("myThread2");
        MyThread myThread3 = new MyThread("myThread3");

        myThread1.start();
        myThread2.start();
        myThread3.start();

    }
}
