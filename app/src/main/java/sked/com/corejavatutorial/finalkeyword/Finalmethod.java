package sked.com.corejavatutorial.finalkeyword;

import java.io.IOException;

/**
 * Created by verma on 5/1/2016.
 */
 class Base{
     final void show(){

        System.out.println("hello world");
    }

}
class Derive extends Base{
//we can't override/extend final method/class it is going to give compile time error that

    /**
     * error: show() in Derive cannot override show() in Base overridden method is final
     * */
/*
@Override
    void show(){
        System.out.println("hello world again");
    }
*/

}

public class Finalmethod  {

    public static void main(String args[])throws IOException{

        Derive derive=new Derive();
        derive.show();
    }
}
