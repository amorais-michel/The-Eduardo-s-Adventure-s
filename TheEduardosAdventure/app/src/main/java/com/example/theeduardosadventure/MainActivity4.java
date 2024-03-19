package com.example.theeduardosadventure;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity4 extends AppCompatActivity {

    Button iniciart5;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main4);



        iniciart5 = findViewById(R.id.btnprox2);

        iniciart5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent t5 = new Intent(getApplicationContext(),MainActivity5.class);
                startActivity(t5);
            }
        });
    }
}