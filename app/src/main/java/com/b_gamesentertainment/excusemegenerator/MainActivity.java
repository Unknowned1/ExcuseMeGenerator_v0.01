package com.b_gamesentertainment.excusemegenerator;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import java.util.Random;

public class MainActivity extends AppCompatActivity {

    Button buttonExcuse, backButton;
    TextView textViewScuse;

    String[] arrayJob = {"Guarda scusami ma ho fatto tardi perchè alla mia vicina (nome)\n" +
                            "si è guastata l'auto e mi ha chiesto se gentilmente potevo aiutarla,\n" +
                            "nonostante fosse una questione di una mezz'oretta in realtà mi ha trattenuto\n" +
                            "più del dovuto",

            "Stringa2",
            "Stringa3",
            "Stringa4",
            "Stringa5",
            "Stringa6",
            "Stringa7"};

    String[] arrayKinship = {"kinship"};
    String[] arrayLovers = {"Lovers"};
    String[] arrayFriends = {"Friends"};
    String[] arraySchool = {"School"};

    String[] scelta;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        buttonExcuse = findViewById(R.id.buttonExcuse);
        textViewScuse = findViewById(R.id.textViewScuse);
        backButton = findViewById(R.id.back_button_in_main);
        textViewScuse.setText("ciao");

        Intent i = getIntent();
        int key = i.getIntExtra("Chiave", 1);
        switch(key){
            case 1: scelta = arrayJob; break;
            case 2: scelta = arrayKinship; break;
            case 3: scelta = arrayLovers; break;
            case 4: scelta = arrayFriends; break;
            case 5: scelta = arraySchool; break;
            default: scelta = arrayJob;
        }


        buttonExcuse.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Random random = new Random();
                int indice = random.nextInt(scelta.length);
                textViewScuse.setText(scelta[indice]);
            }
        });



        backButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(getApplicationContext(), MenuActivity.class);
                startActivity(i);
                finish();
            }
        });

    }
}
