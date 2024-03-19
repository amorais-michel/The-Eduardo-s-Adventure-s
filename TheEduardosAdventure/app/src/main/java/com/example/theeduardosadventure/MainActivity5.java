package com.example.theeduardosadventure;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;

import android.os.Bundle;

import android.view.View;
import android.widget.Button;



public class MainActivity5 extends AppCompatActivity  {



    Button iniciart6;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main5);


        iniciart6 = findViewById(R.id.btnprox3);

        iniciart6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent t6 = new Intent(getApplicationContext(), MainActivity6.class);
                startActivity(t6);




            }
        });
    }


        




}