package sked.com.corejavatutorial.exceptionhandling;

import java.io.IOException;
import java.util.Scanner;

/**
 * Created by verma on 5/4/2016.
 */
public class ArithmeticException {

    public static void main(String args[]) throws IOException {

        int a, b;
        Scanner sc = new Scanner(System.in);
        System.out.println("please enter two number");

        a = sc.nextInt();
        b = sc.nextInt();
        try {
            int c = a / b;
            System.out.println(c);


        } catch (java.lang.ArithmeticException e) {
            System.out.println(e);
        }


    }
}
