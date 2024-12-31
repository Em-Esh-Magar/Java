package MultiThreading;

class MyThread1 implements Runnable{
    public void run(){
        for(int i=0; i<5; i++){
            System.out.println(i);
        }
    }
}

public class RunnableThread {
    public static void main(String[] args) {
        MyThread1 myThread1 = new MyThread1();
        MyThread1 myThread2 = new MyThread1();
        MyThread1 myThread3 = new MyThread1();

        Thread thread1 = new Thread(myThread1);
        Thread thread2 = new Thread(myThread2);
        Thread thread3 = new Thread(myThread3);

        thread1.start();
        thread2.start();
        thread3.start();
    }
}
