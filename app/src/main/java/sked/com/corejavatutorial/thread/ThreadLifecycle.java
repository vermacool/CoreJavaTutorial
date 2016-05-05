package sked.com.corejavatutorial.thread;

import java.io.IOException;

/**
 * Created by verma on 5/4/2016.
 */
public class ThreadLifecycle extends Thread {
    public void run() {

        System.out.println("thread of 1st class started");

        for (int i = 1; i < 10; i++) {

            if (i == 4) {

                yield();
            }
            System.out.println("thread of 1st class  " + i);

        }

        System.out.println("end of 1st class thread");

    }

}

class SecondClass extends Thread {

    public void run() {
        System.out.println("thread of 2nd class started");

        for (int i = 1; i <= 10; i++) {
            if (i == 5) {
                stop();
            }
            System.out.println("thread of 2nd class " + i);

        }
        System.out.println("End of thread of 2nd class ");
    }
}

class ThirdClass extends Thread {

    public void run() {
        System.out.println("thread of 3rd class started ");

        for (int i = 1; i <= 10; i++) {
            try {
                if (i == 7) {
                    sleep(5000);

                }
                System.out.println("thread of 3rd class "+i);

            } catch (InterruptedException e) {

                System.out.println(e);

            }

        }
        System.out.println("thread of 3rd class ends ");

    }
}
class MainClass{

    public static void main(String args[])throws IOException{
        ThreadLifecycle obj=new ThreadLifecycle();
        SecondClass obj2=new SecondClass();
        ThirdClass obj3=new ThirdClass();

        obj.start();
        obj2.start();
        obj3.start();
    }
}