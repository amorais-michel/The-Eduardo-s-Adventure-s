package com.example.theeduardosadventure;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity7 extends AppCompatActivity {

    Button continuar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main7);


        continuar= findViewById(R.id. btnC);

        continuar.setOnClickListener(new View.OnClickListener(){ /*Fazendo o click*/
            @Override
            public void onClick(View v) {
                finishAffinity();
                Intent proximatela= new Intent(getApplicationContext(),MainActivity8.class); /*Dizendo qual a tela que queremos abrir*/
                startActivity(proximatela);/*Abrindo a proxima tela*/




            }

        });



    }
}