package sked.com.corejavatutorial.Interface;

import java.io.IOException;

/**
 * Created by verma on 5/3/2016.
 */
public interface Cvrce {
    public void branch();
}
class IT implements Cvrce{

    @Override
    public void branch() {
        System.out.println("hod is rachita mishra");
    }
}
class EE implements Cvrce{
    @Override
    public void branch() {
        System.out.println("\n hod is PP");

    }

    public void strength(){

        System.out.println("\n No of stududents are 180");

    }

    public static void main(String args[]) throws IOException{

        Cvrce obj=new IT();
        obj.branch();
        Cvrce obj2=new EE();
        obj2.branch();

        EE obj3=new EE();
        obj3.branch();
        obj3.strength();


    }
}