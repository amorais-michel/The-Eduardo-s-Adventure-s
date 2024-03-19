package com.example.theeduardosadventure;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity13 extends AppCompatActivity {

    Button iniciart14;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main13);



        iniciart14 = findViewById(R.id.btnprox24);

        iniciart14.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                finishAffinity();
                Intent t14 = new Intent(getApplicationContext(),MainActivity14.class);
                startActivity(t14);
            }
        });
    }
}