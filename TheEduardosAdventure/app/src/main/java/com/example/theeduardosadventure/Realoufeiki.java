package com.example.theeduardosadventure;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.media.MediaPlayer;
import android.os.Bundle;
import android.provider.MediaStore;
import android.view.View;
import android.widget.Button;

public class Realoufeiki extends AppCompatActivity {

    Button pular; /*Criando uma variavel para controlar o botao*/

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_realoufeiki);



        MediaPlayer musica = MediaPlayer.create(Realoufeiki.this, R.raw.rapaz);
        musica.start();


        pular= findViewById(R.id.btnpular); /*Localizando o botao iniciar*/

        pular.setOnClickListener(new View.OnClickListener(){ /*Fazendo o click*/
            @Override
            public void onClick(View v) {
                Intent pular= new Intent(getApplicationContext(),MainActivity2.class); /*Dizendo qual a tela que queremos abrir*/
                startActivity(pular);/*Abrindo a proxima tela*/

            }

        });



    }
}