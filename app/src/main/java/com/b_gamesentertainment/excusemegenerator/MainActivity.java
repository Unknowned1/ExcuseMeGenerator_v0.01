package com.b_gamesentertainment.excusemegenerator;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import java.util.Random;

public class MainActivity extends AppCompatActivity {

    Button buttonExcuse, buttonBack;
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




    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        buttonExcuse = findViewById(R.id.buttonExcuse);

        textViewScuse = findViewById(R.id.textViewScuse);
        textViewScuse.setText("ciao");


        buttonExcuse.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Random random = new Random();
                int indice = random.nextInt(arrayJob.length);
                textViewScuse.setText(arrayJob[indice]);
            }
        });

    }
}
