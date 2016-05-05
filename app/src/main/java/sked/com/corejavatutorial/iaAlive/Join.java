package sked.com.corejavatutorial.iaAlive;

/**
 * In this above program join() method on thread t1 ensure that t1 finishes it process before thread t2 starts.
 */
public class Join extends Thread {

    public void run(){


        System.out.println("thread is Starting");

        try {
            Thread.sleep(500);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        System.out.println("Thread is starting after sleep");
    }


    public static void main(String args[]){

        Join obj=new Join();
        Join obj2=new Join();


        obj.start();

        try {
            obj.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        obj2.start();
    }
}
