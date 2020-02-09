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

    String[] arrayJob_English = {"\n" +
            "Sorry I'm late because my neighbor's car (name)\n" +
                    "broke down and she/he asked me if I could kindly help her, despite it was a matter of half an hour actually she held me more than necessary",

            "Sorry but I can't hold back longer than I should because I have an appointment with the dentist / doctor etc...",

            "I would really like to attend that meeting but I have another one scheduled, I promised a friend of mine that I would help him with his presentation to get him hired him in a company",

            "I agree with what you say, but to tell the truth I'm organizing a surprise party for my mom.",

            "Look right now I can't, unless there is a promotion or salary increase in the middle, in which case I think I could postpone my family commitments today."

    };

    String[] arrayKinship_English = {"\n"+
            "My love, I can't right now, I think I took the diarreona.",

            "look sweetie but I think we have to postpone everything, my colleague intimates me to spread all my ineptitude to the boss if I don't complete my task today.",

            "Love what are you saying? That girl is only my friend's ex, she recognized me and we stopped to talk because she wanted advice on how to win him back, that photo is to make him understand that he cannot get out of his life.",

            "Love don't think badly, that is the cousin of (name), my friend, we were organizing an exit with him and to make him hurry we published the photo in such a way that he moved to reach us.",

            "Love but that is the future wife of (name), we were waiting for her friends to go to the sex shop and buy a gift to put inside the wedding cake"
    };

    String[] arrayLovers_English = {"\n"+
            "Wow you are making it tragic, I thought I was with a person with a more open minded, I'm amazed.",

            "I would never make love with (name)'s sister, my best friend.",

            "",

            "",
    };

    String[] arrayFriends_English = {"\n"+
            ""
    };

    String[] arraySchool_English = {"\n"+
            ""
    };


    String[] arrayJob = {
            "Guarda scusami ma ho fatto tardi perchè alla mia vicina (nome)\n" +
                            "si è guastata l'auto e mi ha chiesto se gentilmente potevo aiutarla,\n" +
                            "nonostante fosse una questione di una mezz'oretta in realtà mi ha trattenuto\n" +
                            "più del dovuto",

            "Scusami ma non posso trattenermi più del dovuto perchè ho un appuntamento\n" +
                            "con il dentista/dottore ecc...",

            "Vorrei veramente partecipare a quella riunione, \n" +
                            "ma ne ho un'altra in programma, ho promesso ad un mio amico che\n" +
                            "lo avrei aiutato con la sua presentazione per farlo assumere in un'azienda.\n",

            "Concordo su ciò che dici, ma a dire la verità sto organizzando una festa\n" +
                            "a sorpresa per la mia mamma.\n",

            "Guarda in questo momento non posso, a meno che non ci sia in mezzo\n" +
                            "una promozione o un aumento di stipendio, in tal caso penso che potrò\n" +
                            "posticipare i miei impegni familiari oggi."
    };

    String[] arrayKinship = {
            "Amore non posso proprio in questo momento, \n" +
                            "penso di essermi preso la diarreona.",

            "No amore guarda ma penso che si debba rimandare il tutto, \n" +
                            "il mio collega mi intima di spifferare tutta la mia inettitudine al \n" +
                            "capo se non completo il mio task entro oggi",

            "Amore ma che dici ? Quella ragazza è solo l'ex del mio amico,\n" +
                            "mi ha riconosciuto e ci siamo fermati perchè voleva consigli su \n" +
                            "come riconquistarlo, quella foto è per fargli capire che non può \n" +
                            "uscire dalla sua vita.",

            "Amore non pensare male, quella è la cugina di (nome), il mio amico,\n" +
                            "stavamo organizzando un'uscita con lui e per farlo sbrigare abbiamo\n" +
                            "pubblicato la foto in modo tale che si muovesse a raggiungerci.",

            "Amore ma quella è la futura moglie di (nome), aspettavamo i suoi amici\n" +
                            "per andare al sexy shop e comprare un regalo da mettere all'interno\n" +
                            "della torta nuziale."
    };

    String[] arrayLovers = {
            "Wow come la fai tragica, pensavo di stare con una persona con una \n" +
                            "mentalità più aperta, sono allibito.",

            "Non farei mai l'amore con la sorella di (nome), il mio migliore amico",

            "Che problema c'è a farsi amica una lesbica ? Pensavo non avessi problemi\n" +
                            "a riguardo, non parlare prima di sapere",

            "Non è vero. Dimostramelo.",

            "Ho chiesto a lei perchè avevo in mente di farti un mega\n" +
                            "sorpresone con l'aiuto dei suoi consigli e delle sue amiche\n" +
                            "mi spiace tu abbia capito altro."};

    String[] arrayFriends = {
            "Ragà non mi dite niente ma ho solo 100 euro interi e la macchinetta \n" +
                            "col cavolo che mi torna il resto, non mi va neanche di cambiarli per\n" +
                            "avere un sacco di monete.",

            "Ragà scusate ma mi so riaddormentato.",

            "Ragà non credo di poter venire perchè ho prestato l'auto a (nome), \n" +
                            "penso che sarò libero dalla settimana prossima.",

            "Ragà mi è appena scaduta l'assicurazione dell'auto.",

            "Ragà penso che stasera non ci sto perchè domattina devo andare a (nome)\n" +
                            "e mi devo svegliare presto."};

    String[] arraySchool = {
            "Non ho potuto farlo perchè ho aiutato mio padre/madre a finire alcuni servizi.",
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

        getSupportActionBar().hide();

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
