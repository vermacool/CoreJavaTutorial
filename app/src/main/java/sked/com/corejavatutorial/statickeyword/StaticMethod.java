package sked.com.corejavatutorial.statickeyword;

/**
 * Created by verma on 5/1/2016.
 */
public class StaticMethod {
    int a;
    static int b;

    public void get(int c){
        a=c;
        ++b;
    }
    public static void display(){
        System.out.println(b);
    }
    public void show(){
        System.out.println(a);
    }
}
