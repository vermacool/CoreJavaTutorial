package sked.com.corejavatutorial.statickeyword;

import java.io.IOException;

/**
 * Created by verma on 5/1/2016.
 */
public class StaticBlock {
    static int a=5;
//static block execute first
    static {
        a=4;
        System.out.println("this is in class StaticBlock");
        System.out.println(a);

    }
}
class Second{
    public static void main(String agrs[])throws IOException{
        StaticBlock staticBlock=new StaticBlock();
        System.out.println("this is in main function");
        System.out.println(staticBlock.a);
    }
}
