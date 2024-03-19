package com.example.theeduardosadventure;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.media.MediaPlayer;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity2 extends AppCompatActivity {

    Button iniciartela; /*Criando uma variavel para controlar o botao*/


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);



        iniciartela = findViewById(R.id. btniniciar); /*Localizando o botao iniciar*/

            MediaPlayer musica = MediaPlayer.create(MainActivity2.this, R.raw.introducao);
            musica.start();
            musica.setLooping(true);






        iniciartela.setOnClickListener(new View.OnClickListener(){ /*Fazendo o click*/

            @Override
            public void onClick(View v) {

                Intent proximatela= new Intent(MainActivity2.this, MainActivity3.class); /*Dizendo qual a tela que queremos abrir*/
                startActivity(proximatela);/*Abrindo a proxima tela*/
                musica.stop();


            }

        });



    }


}