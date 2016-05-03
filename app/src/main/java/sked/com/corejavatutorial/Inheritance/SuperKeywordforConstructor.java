package sked.com.corejavatutorial.Inheritance;

import java.io.IOException;

/**
 * Example of Child class calling Parent class constructor using super keyword
 */

public class SuperKeywordforConstructor {

    String name;

    public SuperKeywordforConstructor(String n) {
        name = n;
    }


}

class Child extends SuperKeywordforConstructor {

    String name;

    public Child(String n, String m) {
        super(n);  //passing argument to parent class constructor
        this.name=m;
    }

    public void detail(){

        System.out.println(super.name+"\t and \t"+name);
    }

    public static void main(String args[]) throws IOException{

        Child obj=new Child("parent","child");
        obj.detail();
    }
}
