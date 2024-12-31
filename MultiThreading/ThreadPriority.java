package MultiThreading;

class MyThread2 extends Thread{
    public MyThread2(String name){
        super();
    }

    public void run(){
        for(int i=0; i<10; i++) {
            System.out.println("Name : " + this.getName());
        }
    }
}

public class ThreadPriority {
    public static void main(String[] args) {
        MyThread2 myThread1 = new MyThread2("myThread1");
        MyThread2 myThread2 = new MyThread2("myThread2");
        MyThread2 myThread3 = new MyThread2("myThread3");

        myThread1.setPriority(Thread.MIN_PRIORITY);
        myThread2.setPriority(Thread.NORM_PRIORITY);
        myThread3.setPriority(Thread.MAX_PRIORITY);

        myThread1.start();
        myThread3.start();
        myThread2.start();


    }
}
