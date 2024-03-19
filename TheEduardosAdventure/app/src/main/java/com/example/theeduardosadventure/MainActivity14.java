package com.example.theeduardosadventure;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.media.MediaPlayer;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity14 extends AppCompatActivity {


    Button sair;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main14);


        MediaPlayer musica = MediaPlayer.create(MainActivity14.this, R.raw.finalsom);
        musica.start();
        musica.setLooping(true);

        sair = findViewById(R.id.sair);

        sair.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                musica.stop();
                finishAffinity();
                System.exit(0);
            }
        });
    }
}