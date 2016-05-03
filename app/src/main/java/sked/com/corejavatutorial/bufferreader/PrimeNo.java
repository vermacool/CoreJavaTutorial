package sked.com.corejavatutorial.bufferreader;

/**
 * Created by verma on 4/30/2016.
 */

import java.io.*;
public class PrimeNo {

    public static void main(String args[])throws IOException{
        BufferedReader bufferedReader=new BufferedReader(new InputStreamReader(System.in));
        System.out.println("please enter a number");
        int num=Integer.parseInt(bufferedReader.readLine());
        int count=0;
        for (int i=1;i<=num;i++)
        {
            if(num%i==0){
                count++;
            }
        }
        if(count==2){

            System.out.println("it is prime number");}
            else{
            System.out.println("it is not a prime number");
        }

        }
    }

