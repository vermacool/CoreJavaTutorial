package sked.com.corejavatutorial.scannerclass;

import java.io.IOException;
import java.util.Scanner;

/**
 * Created by verma on 4/30/2016.
 */
public class Employee {

    public static void main(String xyz[]) throws IOException{
        System.out.println("enter Id \n name \n Salary \n ");

        Scanner scanner=new Scanner(System.in);

        int id=scanner.nextInt();
        String name=scanner.next();
        Double salary=scanner.nextDouble();

        System.out.println("Id of employee \n "+id);
        System.out.println("Name of employee \n"+name);
        System.out.println("Salary of employee is \n"+ salary);


    }
}
