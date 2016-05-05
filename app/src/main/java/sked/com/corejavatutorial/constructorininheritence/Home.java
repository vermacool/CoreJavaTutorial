package sked.com.corejavatutorial.constructorininheritence;

import java.io.IOException;

/**
 * Created by verma on 5/3/2016.
 */
public class Home {

    public Home(){
        System.out.println("i am at home");
    }
      Home(int emi){
          System.out.println("emi is \t"+emi);
      }
}
class Room extends Home{

    public Room(){
        System.out.println("i am in my room");
    }
    public Room(int cash){
        super(cash);
        System.out.println("cash available for emi is"+cash);
    }

    public static void main(String args[]) throws IOException{

        Room obj=new Room();
        Room obj2=new Room(5000);
    }
}
