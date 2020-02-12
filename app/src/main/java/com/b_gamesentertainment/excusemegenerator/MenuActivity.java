package com.b_gamesentertainment.excusemegenerator;

import android.animation.AnimatorInflater;
import android.animation.AnimatorSet;
import android.content.Intent;
import android.media.MediaPlayer;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.Menu;
import android.view.View;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.view.animation.RotateAnimation;
import android.widget.Button;
import android.widget.TextView;


public class MenuActivity extends AppCompatActivity {

    Button startButton, settingsButton, exitButton;
    @Override
    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);
        setContentView(R.layout.menu_layout);

        getSupportActionBar().hide();

        final MediaPlayer mediaPlayer = MediaPlayer.create(MenuActivity.this, R.raw.launch_audio);
        mediaPlayer.start();

        startButton = findViewById(R.id.start_button);
        settingsButton = findViewById(R.id.settings_button);
        exitButton = findViewById(R.id.exit_button);

        TextView text_view = findViewById(R.id.titolo);
        Animation anim = AnimationUtils.loadAnimation(this, R.anim.rotate);
        text_view.startAnimation(anim);


        Intent i = getIntent();
        final int keyLanguage = i.getIntExtra("Language", 1);

        startButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent intent = new Intent(getApplicationContext(), Category.class );
                intent.putExtra("Language", keyLanguage);
                startActivity(intent);
                mediaPlayer.pause();
                finish();
            }
        });

        settingsButton.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v) {

                Intent intent = new Intent(getApplicationContext(), SettingsActivity.class );
                startActivity(intent);
                mediaPlayer.pause();
                finish();
            }
        });

        exitButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                finish();
                System.exit(0);
            }
        });
    }

}
