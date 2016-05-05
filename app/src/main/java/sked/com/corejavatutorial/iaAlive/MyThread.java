package sked.com.corejavatutorial.iaAlive;

import java.io.IOException;

/**
 * Created by verma on 5/4/2016.
 */
public class MyThread extends Thread {

    public void run(){

        System.out.println("my thread is starting");

        try {
            Thread.sleep(5000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("thread is running after sleep");
    }


    public static void main(String args[]) {

        MyThread obj=new MyThread();
        MyThread obb2=new MyThread();

        obj.start();
        obb2.start();

        System.out.println(obj.isAlive());
        System.out.println(obb2.isAlive());
    }

}
