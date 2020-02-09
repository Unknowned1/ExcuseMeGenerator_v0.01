package com.b_gamesentertainment.excusemegenerator;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;

public class SettingsActivity extends AppCompatActivity {

    Button backButton, italianLanguageButton, englishLanguageButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.settings_activity);

        getSupportActionBar().hide();

        backButton = findViewById(R.id.back_button_in_settings);
        italianLanguageButton = findViewById(R.id.italian_language_button);
        englishLanguageButton = findViewById(R.id.english_language_button);

        backButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(getApplicationContext(), MenuActivity.class);
                startActivity(i);
                finish();
            }
        });

        italianLanguageButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent i = new Intent(getApplicationContext(), MenuActivity.class);
                i.putExtra("Language",1);
                startActivity(i);
                finish();
            }
        });

        englishLanguageButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent i = new Intent(getApplicationContext(), MenuActivity.class);
                i.putExtra("Language",2);
                startActivity(i);
                finish();
            }
        });

    }
}
