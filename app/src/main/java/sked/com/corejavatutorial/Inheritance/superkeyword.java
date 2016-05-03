package sked.com.corejavatutorial.Inheritance;

import java.io.IOException;

/**
 * Created by verma on 5/3/2016.
 */
public class superkeyword {
    String name;

    public void details() {
        name = "parent";
        System.out.println(name);
    }
}

class ChildClass extends superkeyword {
    String name;

    public static void main(String args[]) throws IOException {
        ChildClass obj = new ChildClass();
        obj.details();
    }

    public void details() {
        super.details(); //refers to a parent class method
        name = "child";
        System.out.println(" \n" + name);
    }
}
