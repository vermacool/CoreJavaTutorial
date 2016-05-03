package sked.com.corejavatutorial.statickeyword;

/**
 * Created by verma on 5/1/2016.
 */
import java.io.*;
public class SecondStaticClass{
    public static void main(String[] args) throws IOException{

        StaticVariable obj=new StaticVariable();
        obj.get(50);

        StaticVariable obj2=new StaticVariable();
        obj2.get(60);

        StaticVariable obj3=new StaticVariable();
        obj3.get(70);


        obj.show();
        obj2.show();
        obj3.show();
    }


}
