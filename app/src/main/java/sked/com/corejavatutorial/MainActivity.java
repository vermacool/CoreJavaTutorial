package sked.com.corejavatutorial;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import com.facebook.shimmer.ShimmerFrameLayout;

import sked.com.corejavatutorial.bufferreader.CoreJava;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ShimmerFrameLayout shimmerFrameLayout= (ShimmerFrameLayout) findViewById(R.id.shimmer);
       try{
           shimmerFrameLayout.setDuration(2000);
           shimmerFrameLayout.setTilt(20);
           /*shimmerFrameLayout.setRepeatCount(20);*/

       } catch (Exception e){
           e.printStackTrace();
       }
      /*  shimmerFrameLayout.setMaskShape(ShimmerFrameLayout.MaskShape.LINEAR);
        shimmerFrameLayout.setFixedHeight(ViewGroup.FOCUS_BEFORE_DESCENDANTS);*/
        shimmerFrameLayout.startShimmerAnimation();
        TextView run= (TextView) findViewById(R.id.runbtn);
        run.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        Intent intent=new Intent(MainActivity.this,CoreJava.class);
        startActivity(intent);
    }
}
