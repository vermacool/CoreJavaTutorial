package sked.com.corejavatutorial.statickeyword;

import java.io.IOException;

/**
 * Created by verma on 5/1/2016.
 */
public class SecondStaticmethodClass {

    public static void main(String[] args) throws IOException{
        StaticMethod obj=new StaticMethod();
        obj.get(40);
        StaticMethod obj2=new StaticMethod();
        obj2.get(80);

        obj.show();
        obj.display();
        obj2.show();
        StaticMethod.display();
    }
}
