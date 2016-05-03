package sked.com.corejavatutorial.statickeyword;

/**
 * Created by verma on 5/1/2016.
 */

public class StaticVariable {
    //Class variable
    static int b;
    //instance variable
    int a;

    public void get(int c) {
        a = c;
        ++b;
    }

    public void show() {

        System.out.println(a + " and " + b);
    }
}

