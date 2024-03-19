package com.example.theeduardosadventure;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity10 extends AppCompatActivity {

    Button iniciart10;
    Button carregae;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main10);





        iniciart10 = findViewById(R.id.btn10);

        iniciart10.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent t10 = new Intent(getApplicationContext(),MainActivity11.class);
                startActivity(t10);
            }
        });
        carregae = findViewById(R.id.btncarrega);
        carregae.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                finishAffinity();
                Intent easteregg = new Intent(getApplicationContext(), Easteregg.class);
                startActivity(easteregg);

            }
        });

    }
}