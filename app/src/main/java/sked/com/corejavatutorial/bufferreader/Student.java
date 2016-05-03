package sked.com.corejavatutorial.bufferreader;

/**
 * Created by verma on 4/30/2016.
 */
import java.io.*;
public class Student {

    public static void main(String args[]) throws IOException{

        BufferedReader bufferedReader=new BufferedReader(new InputStreamReader(System.in));
        System.out.println("enter name of student");
        String name=bufferedReader.readLine();
        System.out.println("enter roll no");
        int roll=Integer.parseInt(bufferedReader.readLine());
        System.out.println("age of student");
        Double age=Double.parseDouble(bufferedReader.readLine());
        System.out.println("enter sex of student");
        char sex= (char) bufferedReader.readLine().charAt(0);
        bufferedReader.skip(2);

        System.out.println("student name is\t"+name);
        System.out.println(name+" roll is\t"+roll);
        System.out.println(name+" age is\t"+age);
        System.out.println(name+"sex is\t"+sex);
    }
}
