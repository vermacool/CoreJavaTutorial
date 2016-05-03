package sked.com.corejavatutorial.commandlineargument;

/**
 * Created by verma on 5/1/2016.
 */

import java.io.IOException;

/**
 * we use command line argument to pass value to main() at runtime.
 * agrs[] length/size() should be same as number of arguments passed to it.
 */
public class CLA {

    public static void main(String args[]) throws IOException {


        int sum = 0;
        for (int i = 0; i < args.length; i++) {
            sum = sum + Integer.parseInt(args[i]);
        }
        System.out.println("The sum of the arguments passed is " + sum);
    }
    }

