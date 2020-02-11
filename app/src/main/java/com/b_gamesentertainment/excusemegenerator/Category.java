package com.b_gamesentertainment.excusemegenerator;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;

public class Category extends AppCompatActivity {

    Button jobButton, kinshipButton, loversButton, friendsButton, schoolButton, exitButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.category_layout);

        getSupportActionBar().hide();

        jobButton = findViewById(R.id.job_button);
        kinshipButton = findViewById(R.id.kinship_button);
        friendsButton = findViewById(R.id.friends_button);
        loversButton = findViewById(R.id.lovers_button);
        schoolButton = findViewById(R.id.school_button);
        exitButton = findViewById(R.id.exit_button);

        Intent i = getIntent();
        final int keyLanguage = i.getIntExtra("Language", 1);

        jobButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent i = new Intent(getApplicationContext(), MainActivity.class);
                i.putExtra("Chiave",1);
                i.putExtra("Language", keyLanguage);
                startActivity(i);
                finish();
            }
        });

        kinshipButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent i = new Intent(getApplicationContext(), MainActivity.class);
                i.putExtra("Chiave",2);
                i.putExtra("Language", keyLanguage);
                startActivity(i);
                finish();
            }
        });

        loversButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent i = new Intent(getApplicationContext(), MainActivity.class);
                i.putExtra("Chiave",3);
                i.putExtra("Language", keyLanguage);
                startActivity(i);
                finish();
            }
        });

        friendsButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent i = new Intent(getApplicationContext(), MainActivity.class);
                i.putExtra("Chiave",4);
                i.putExtra("Language", keyLanguage);
                startActivity(i);
                finish();
            }
        });

        schoolButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent i = new Intent(getApplicationContext(), MainActivity.class);
                i.putExtra("Chiave",5);
                i.putExtra("Language", keyLanguage);
                startActivity(i);
                finish();
            }
        });

        exitButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent i = new Intent(getApplicationContext(), MenuActivity.class);
                i.putExtra("Language", keyLanguage);
                startActivity(i);
                finish();
            }
        });
    }
}
