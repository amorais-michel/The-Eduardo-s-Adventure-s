package com.example.theeduardosadventure;

import androidx.appcompat.app.AppCompatActivity;

import android.media.MediaPlayer;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Easteregg extends AppCompatActivity {

    Button seguir;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_easteregg);

        MediaPlayer musica = MediaPlayer.create(Easteregg.this, R.raw.atumalaca);
        musica.start();
        musica.setLooping(true);

        seguir = findViewById(R.id.btnseguir);
        seguir.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                finishAffinity();
                System.exit(10);
                musica.stop();
            }
        });



    }
}