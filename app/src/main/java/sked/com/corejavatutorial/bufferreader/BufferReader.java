package sked.com.corejavatutorial.bufferreader;

/**
 * Created by verma on 4/30/2016.
 */
import java.io.*;
public class BufferReader {

    public static void main(String args[]) throws IOException{
         BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
         System.out.println("enter a integer ");
        int number=Integer.parseInt(br.readLine());
        System.out.println("number is \n"+number);


    }
}
