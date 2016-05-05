package sked.com.corejavatutorial.Interface;

import java.io.IOException;

/**
 * Created by verma on 5/3/2016.
 */
public interface InterfaceInheritance {

    void takeoff();
}

interface ChildInterface extends InterfaceInheritance {
    void fly();
}

class Plane implements ChildInterface {

    @Override
    public void takeoff() {
        System.out.println("Plane is taking off");
    }

    @Override
    public void fly() {
        System.out.println("Plane is flying");

    }
}

class Superman implements ChildInterface {

    @Override
    public void fly() {
        System.out.println("superman is flying");

    }

    @Override
    public void takeoff() {
        System.out.println("superman is taking off");

    }


}

class Main {

    public static void main(String args[]) throws IOException {
        Plane obj = new Plane();
        obj.fly();
        obj.takeoff();

        Superman obj2 = new Superman();
        obj2.fly();
        obj2.takeoff();
    }
}