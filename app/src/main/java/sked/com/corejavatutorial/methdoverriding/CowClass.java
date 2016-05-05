package sked.com.corejavatutorial.methdoverriding;

import java.io.IOException;

/**
 * Created by verma on 5/3/2016.
 */
public class CowClass {

    public void show(){
        System.out.println("cow is a holy animal");
    }
}
class Calf extends CowClass{
    public void show(){

        System.out.println("calf is child of cow and is also a holy animal");
    }
    public static void main(String args[])throws IOException{
        Calf obj=new Calf();
        obj.show();
    }
}
