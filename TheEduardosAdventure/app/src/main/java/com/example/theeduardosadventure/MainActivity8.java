package com.example.theeduardosadventure;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.media.MediaPlayer;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity8 extends AppCompatActivity {

    Button iniciart8 ;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main8);





        iniciart8 = findViewById(R.id. btnpro); /*Localizando o botao iniciar*/

        iniciart8.setOnClickListener(new View.OnClickListener(){ /*Fazendo o click*/
            @Override
            public void onClick(View v) {
                Intent simplefuture = new Intent(getApplicationContext(),MainActivity9.class); /*Dizendo qual a tela que queremos abrir*/
                startActivity(simplefuture);/*Abrindo a proxima tela*/


            }

        });



    }
}
