package com.b_gamesentertainment.excusemegenerator;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.ListView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    Button buttonItalian, buttonEnglish;
    Button buttonJob, buttonKinship, buttonLovers, buttonSchool, buttonFriends;
    ListView listaScuse;

    String[] array = {"Stringa1", "Stringa2", "Stringa3", "Stringa4", "Stringa5", "Stringa6", "Stringa7"};



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



        listaScuse = findViewById(R.id.listaScuse);
        ArrayAdapter<String> adapter = new ArrayAdapter<String>(this,R.layout.list_element,
                R.id.textViewList, array );

        listaScuse.setAdapter(adapter);


    }
}
