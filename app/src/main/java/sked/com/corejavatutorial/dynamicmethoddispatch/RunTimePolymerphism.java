package sked.com.corejavatutorial.dynamicmethoddispatch;

import java.io.IOException;

/**
 * object of base class can get reference of base class as well as reference
 * of all the derive class deriving from base class
 */


public class RunTimePolymerphism {

    void f1(){

        System.out.println("hii from f1 base class");
    }
    void f2(){
        System.out.println("hello from f2 base class");
    }
}
class DeriveClass extends RunTimePolymerphism{

    void f2(){
        System.out.println("byeee from f2 in Derive class");
    }

    void f3(){
        System.out.println("see you soon");
    }

    public static void main(String args[])throws IOException{

        RunTimePolymerphism obj=new RunTimePolymerphism();
        obj.f1();
        obj.f2();

        DeriveClass obj2=new DeriveClass();
        obj2.f1();
        obj2.f2();
        obj2.f3();


        RunTimePolymerphism obj3=new DeriveClass();
        obj3.f1();
        obj3.f2(); //it will check at runtime on behalf of object whether this will be of base class mathod or derive class
    }
}
