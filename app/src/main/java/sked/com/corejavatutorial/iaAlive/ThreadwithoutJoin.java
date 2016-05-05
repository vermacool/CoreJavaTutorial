package sked.com.corejavatutorial.iaAlive;

/**
 * Using ThreadwithoutJoin() method, we tell our thread to wait until the specified thread completes its execution
 */
public class ThreadwithoutJoin extends Thread {

    public void run(){

        System.out.println("thread is starting");

        try {
            Thread.sleep(500);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("thread is starting after sleep");
    }

    public static void main(String args[]){
        ThreadwithoutJoin obj=new ThreadwithoutJoin();
        ThreadwithoutJoin obj2=new ThreadwithoutJoin();

        obj.start();
        obj2.start();
    }
}

/**
 * In this above program two thread obj and obj2 are created.
 * obj starts first and after printing "thread is starting" on console thread obj goes to sleep for 500 mls.
 * At the same time Thread obj2 will start its process and print "thread is starting" on console and then 
 * goes into sleep for 500 mls. 
 * Thread obj will wake up from sleep and print "thread is starting after sleep" on console similarly
 * thread obj2 will wake up from sleep and print "thread is starting after sleep" on console.
 * So you will get output like 
 * thread is starting
 * thread is starting 
 * thread is starting after sleep
 * thread is starting after sleep
 */


