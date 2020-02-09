package com.b_gamesentertainment.excusemegenerator;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.support.v7.app.AppCompatActivity;
import android.view.animation.Animation;
import android.view.animation.RotateAnimation;
import android.widget.ImageView;

import static com.b_gamesentertainment.excusemegenerator.R.anim.rotate;

public class LaunchActivity extends AppCompatActivity {

    ImageView img_view;
    private static int TIME_OUT = 5000;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.launch_activity);

        getSupportActionBar().hide();
       /* img_view = findViewById(R.id.startingImage);
        RotateAnimation rotate = new RotateAnimation(0, 360,
                Animation.RELATIVE_TO_SELF, 0.5f, Animation.RELATIVE_TO_SELF,
                0.5f);
        rotate.setDuration(2000);
        rotate.setRepeatCount(Animation.INFINITE);
        img_view.setAnimation(rotate);*/


        new Handler().postDelayed(new Runnable() {
            @Override
            public void run() {

                Intent intent = new Intent(getApplicationContext(), MenuActivity.class );
                startActivity(intent);
                finish();
            }
        }, TIME_OUT);

    }
}
