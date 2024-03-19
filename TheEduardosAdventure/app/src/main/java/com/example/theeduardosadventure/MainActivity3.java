package com.example.theeduardosadventure;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.media.MediaPlayer;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity3 extends AppCompatActivity {

    Button iniciart4;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main3);

        iniciart4 = findViewById(R.id.btnproximo);

        iniciart4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent t4 = new Intent(getApplicationContext(),MainActivity4.class);
                startActivity(t4);

            }
        });

    }






}