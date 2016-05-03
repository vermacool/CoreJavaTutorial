package sked.com.corejavatutorial.bufferreader;

/**
 * Created by verma on 4/30/2016.
 */
import android.app.Activity;
import android.test.ActivityTestCase;
import android.util.Log;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class CoreJava extends Activity {

    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader=new BufferedReader(new InputStreamReader(System.in));
        System.out.println("please enter a line");

        String st=bufferedReader.readLine();
        System.out.println("line is  \n" +st);

    }
}
