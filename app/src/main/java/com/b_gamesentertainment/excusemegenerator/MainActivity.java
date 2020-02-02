package com.b_gamesentertainment.excusemegenerator;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.ListView;
import android.widget.TextView;

import java.util.ArrayList;
import java.util.Random;

public class MainActivity extends AppCompatActivity {

    Button buttonItalian, buttonEnglish;
    Button buttonJob, buttonKinship, buttonLovers, buttonSchool, buttonFriends;
    TextView textViewScuse;

    String[] arrayJob = {"Stringa1", "Stringa2", "Stringa3", "Stringa4", "Stringa5", "Stringa6", "Stringa7"};
    ArrayAdapter<String> adapter;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        buttonEnglish = findViewById(R.id.buttonEnglish);
        buttonItalian = findViewById(R.id.buttonItalian);
        buttonJob = findViewById(R.id.buttonJob);
        buttonKinship = findViewById(R.id.buttonKinship);
        buttonFriends = findViewById(R.id.buttonFriends);
        buttonSchool = findViewById(R.id.buttonSchool);
        buttonLovers = findViewById(R.id.buttonLovers);

        textViewScuse = findViewById(R.id.textViewScuse);
        textViewScuse.setText("ciao");


        buttonJob.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Random random = new Random();
                int indice = random.nextInt(arrayJob.length );
                textViewScuse.setText(arrayJob[indice]);
            }
        });

    }
}
