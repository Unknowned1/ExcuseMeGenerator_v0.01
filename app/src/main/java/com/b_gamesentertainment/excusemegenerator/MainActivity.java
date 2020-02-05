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

    String[] arrayJob_English = {"EnglisJobText"};
    String[] arrayKinship_English = {"EnglisKinshipText"};
    String[] arrayLovers_English = {"EnglisLoversText"};
    String[] arrayFriends_English = {"EnglisFriendsText"};
    String[] arraySchool_English = {"EnglisSchooòText"};


    String[] arrayJob = {"Guarda scusami ma ho fatto tardi perchè alla mia vicina (nome)\n" +
                            "si è guastata l'auto e mi ha chiesto se gentilmente potevo aiutarla,\n" +
                            "nonostante fosse una questione di una mezz'oretta in realtà mi ha trattenuto\n" +
                            "più del dovuto",

            "Scusami ma non posso trattenermi più del dovuto perchè ho un appuntamento\n" +
                    "con il dentista/dottore ecc...",
            "Vorrei veramente partecipare a quella riunione, \n" +
                    "ma ne ho un'altra in programma, ho promesso ad un mio amico che\n" +
                    "lo avrei aiutato durante la sua presentazione presso un'azienda per\n" +
                    "questioni lavorative, sono mortificato\n",
            "Concordo su ciò che dici, ma a dire la verità sto organizzando una festa\n" +
                    "a sorpresa per la mia mamma.\n",
            "Guarda in questo momento non posso, a meno che non ci sia in mezzo\n" +
                    "una promozione o un aumento di stipendio, in tal caso pensò che potrò\n" +
                    "posticipare i miei impegni familiari oggi."};

    String[] arrayKinship = {"Amore non posso proprio in questo momento, \n" +
            "penso di essermi preso la diarreone",
    "No amore guarda ma penso che si debba rimandare il tutto, \n" +
            "il mio collega mi intima di spifferare tutta la mia inettitudine al \n" +
            "capo se non completo il mio task entro oggi",
    "Amore ma che dici ? Quella ragazza è solo l'ex del mio amico,\n" +
            "mi ha riconosciuto e ci siamo fermati perchè voleva consigli su \n" +
            "come riconquistarlo, quella foto è per fargli capire che non può \n" +
            "uscire dalla sua vita.",
    "Amore non pensare male, quella è la cugina di (nome), il mio amico,\n" +
            "stavamo organizzando un'uscita con lui e per farlo sbrigare abbiamo\n" +
            "pubblicato la foto in modo tale che si muovesse a raggiungerci",
    "Amore ma quella è la futura moglie di (nome), aspettavamo i suoi amici\n" +
            "per andare al sexy shop e comprare un regalo da mettere all'interno\n" +
            "della torta nuziale."};

    String[] arrayLovers = {"Wow come la fai tragica, pensavo di stare con una persona con una \n" +
            "mentalità più aperta, sono allibito",
    "Non farei mai l'amore con la sorella di (nome), il mio migliore amico",
    "Che problema c'è a farsi amica una lesbica ? Pensavo non avessi problemi\n" +
            "a riguardo, non parlare prima di sapere",
    "Non è vero. Dimostramelo.",
    "Ho chiesto a lei perchè avevo in mente di farti un mega\n" +
            "sorpresone con l'aiuto dei suoi consigli e delle sue amiche\n" +
            "mi spiace tu abbia capito altro."};

    String[] arrayFriends = {"Ragà non mi dite niente ma ho solo 100 euro interi e la macchinetta \n" +
            "col cavolo che mi torna il resto, non mi va neanche di cambiarli per\n" +
            "avere un sacco di monete.",
    "Ragà scusate ma mi so riaddormentato.",
    "Ragà non credo di poter venire perchè ho prestato l'auto a (nome), \n" +
            "penso che sarò libero dalla settimana prossima.",
    "Ragà mi è appena scaduta l'assicurazione dell'auto.",
    "Ragà penso che stasera non ci sto perchè domattina devo andare a (nome)\n" +
            "e mi devo svegliare presto."};

    String[] arraySchool = {"Non ho potuto farlo perchè ho aiutato mio padre/madre a finire alcuni servizi.",
    "Sto preparando il test di (nome) per l'università, quindi al momento mi sto\n" +
            "dedicando a quello.",
    "Non potrò perchè uscirò prima di scuola domani (o altro giorno), ho appuntamento\n" +
            "con il dottore per una visita medica\n",
    "Non ci sarò perchè sto aiutando (qualcuno) a con il lavoro dopo scuola",
    "Sinceramente questa cosa non mi attira più di tanto, la farò perchè \n" +
            "è mio dovere, ma mi dia del tempo in più per prepararla al meglio.\n",
    "Prof. non faccio i compiti altrimenti gli altri mi prendono in giro.",
    "Zio(a) stai soffete, i compiti te li porto domani.",
    "Ho fatto tardi perchè si è bloccato il distributore.",
    "Non ho potuto fare i compiti perchè ieri stavo a casa di mia nonna, quest'ultima si è allagata all'improvviso e abbiamo dovuto salvarla",
    };

    String[] scelta;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        buttonExcuse = findViewById(R.id.buttonExcuse);
        textViewScuse = findViewById(R.id.textViewScuse);
        backButton = findViewById(R.id.back_button_in_main);
        textViewScuse.setText("Salvati il culo! Genera la scusa");

        Intent i = getIntent();

        final int keyLanguage = i.getIntExtra("Language", 1);
        final int key = i.getIntExtra("Chiave", 1);


        if(keyLanguage==1){

            switch(key){
                case 1: scelta = arrayJob; break;
                case 2: scelta = arrayKinship; break;
                case 3: scelta = arrayLovers; break;
                case 4: scelta = arrayFriends; break;
                case 5: scelta = arraySchool; break;
                default: scelta = arrayJob;
            }

        } else{

            switch(key){
                case 1: scelta = arrayJob_English; break;
                case 2: scelta = arrayKinship_English; break;
                case 3: scelta = arrayLovers_English; break;
                case 4: scelta = arrayFriends_English; break;
                case 5: scelta = arraySchool_English; break;
                default: scelta = arrayJob_English;
            }
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
                i.putExtra("Language", keyLanguage);
                startActivity(i);
                finish();
            }
        });

    }
}
