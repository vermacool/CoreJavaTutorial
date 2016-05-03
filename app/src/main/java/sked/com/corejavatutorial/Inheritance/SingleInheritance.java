package sked.com.corejavatutorial.Inheritance;

import java.io.IOException;

/**
 * Created by verma on 5/1/2016.
 */
public class SingleInheritance {

    int a,b;
    public void get(int x,int y){
        a=x;
        b=y;
    }

}

class DeriveClass extends SingleInheritance{
int c;

   public void show(){
       System.out.println(a+"\t"+ b +"\t"+c);
   }

}
class Main{

    public static void main(String args[])throws IOException{
        DeriveClass obj=new DeriveClass();
        obj.get(3,5);
        obj.c=7;
        /*we cant give obj reference of super class to the object of child class*/


        /**
         *   @param DeriveClass object=new SingleInheritance();
         */


       /*we can't access method of derive class through object of super class*/

        SingleInheritance object=new SingleInheritance();
        /**
         *   @param  obj3.show();
         */


       /* method of derive class can't be call from object of superclass referencing derive class */

          SingleInheritance obj1=new DeriveClass();

            /**
             *  @param obj1.show()
             */

        obj.show();
    }
}