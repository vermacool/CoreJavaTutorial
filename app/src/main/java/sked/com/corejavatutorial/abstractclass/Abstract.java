package sked.com.corejavatutorial.abstractclass;

import java.io.IOException;

/**
 * abstract method declaration must be present in abstract class
 * but its definition must be present in dynamic class(child class) of that base class
 */
public abstract class Abstract {

    abstract void paneer();

}

class Restaurant extends Abstract{

    @Override
    void paneer() {
        System.out.println("paneer masala is tasty ");
    }
}
class Hotel extends Abstract{

    @Override
    void paneer() {
       System.out.println("from hotel you can order paneer masala");
    }

    public static void main(String args[]) throws IOException{
      //we can not create object of abstract class

        /*Abstract obj=new Abstract(); */

        Abstract obj=new Restaurant();
        obj.paneer();
        Abstract obj2=new Hotel();
        obj2.paneer();

    }
}