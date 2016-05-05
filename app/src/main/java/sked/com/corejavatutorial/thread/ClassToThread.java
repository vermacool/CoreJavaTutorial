package sked.com.corejavatutorial.thread;

import java.io.IOException;

/**
 * Created by verma on 5/4/2016.
 */
public class ClassToThread implements Runnable {
    @Override
    public void run() {
        System.out.println("1st thread started");
        for (int i = 1; i <= 5; i++) {

            System.out.println("thread of 1st class " + i);

        }
        System.out.println("thread of 1st class ends ");

    }
}

class Second implements Runnable {
    @Override
    public void run() {
        System.out.println("thread of b started");

        for (int i = 1; i <= 5; i++) {
            System.out.println("thread of 2nd class " + i);

        }
        System.out.println("ends of second class");

    }
}
class Main{

    public static void main(String args[])throws IOException{

        ClassToThread obj=new ClassToThread();
        Second obj2=new Second();


        Thread t1=new Thread(obj);
        Thread t2=new Thread(obj2);


        t1.start();
        t2.start();
    }
}