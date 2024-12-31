/*
Write a program to create two threads, one thread is to display even numbers between 1 to 10 in 1 seconds
and other thread is to display oddd numbers between 10 to 20 in 2 seconds.
 */

package MultiThreading;

class MyThread3 extends Thread{
    public void run(){
        for(int i=1; i<10; i++){
            if(i%2==0){
                System.out.print(i + " ");
            }
            try{
                Thread.sleep(1000);
            }catch(InterruptedException e){
                e.printStackTrace();
            }
        }
    }
}

class MyThread4 implements Runnable{
    public void run(){
        for(int i=10; i<20; i++){
            if(i%2==1) {
                System.out.print(i + " ");
            }
            try{
                Thread.sleep(2000);
            }catch(InterruptedException e){
                e.printStackTrace();
            }
        }
    }
}

public class QuestionThread {
    public static void main(String[] args) {
        MyThread3 myThread3 = new MyThread3();
        MyThread4 myThread4 = new MyThread4();
        Thread thread = new Thread(myThread4);

        myThread3.start();
        thread.start();

    }
}
