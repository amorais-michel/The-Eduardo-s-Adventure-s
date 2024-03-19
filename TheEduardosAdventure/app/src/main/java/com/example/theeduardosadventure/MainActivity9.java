package com.example.theeduardosadventure;

import androidx.appcompat.app.AppCompatActivity;

import android.app.AlertDialog;
import android.content.Intent;
import android.graphics.Color;

import android.media.MediaPlayer;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity9 extends AppCompatActivity implements View.OnClickListener{


    TextView totalQuestionsTextView;
    TextView questionTextView;
    Button ansA, ansB, ansC, ansD;
    Button submitBtn;

    int score=0;
    int totalQuestion = QuestionAnswer2.question2.length;
    int currentQuestionIndex = 0;
    String selectedAnswer = "";



    @Override
    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main9);


        totalQuestionsTextView = findViewById(R.id.total_question);
        questionTextView = findViewById(R.id.question);
        ansA = findViewById(R.id.ans_A);
        ansB = findViewById(R.id.ans_B);
        ansC = findViewById(R.id.ans_C);
        ansD = findViewById(R.id.ans_D);
        submitBtn = findViewById(R.id.submit_btn);

        ansA.setOnClickListener(this);
        ansB.setOnClickListener(this);
        ansC.setOnClickListener(this);
        ansD.setOnClickListener(this);
        submitBtn.setOnClickListener(this);

        totalQuestionsTextView.setText("Total de Perguntas : "+totalQuestion);

        loadNewQuestion();


    }

    @Override
    public void onClick(View view) {

        ansA.setBackgroundColor(Color.TRANSPARENT);
        ansB.setBackgroundColor(Color.TRANSPARENT);
        ansC.setBackgroundColor(Color.TRANSPARENT);
        ansD.setBackgroundColor(Color.TRANSPARENT);



        Button clickedButton = (Button) view;
        if(clickedButton.getId()==R.id.submit_btn){
            if(selectedAnswer.equals(QuestionAnswer2.correctAnswers2[currentQuestionIndex])){
                score++;
            }
            currentQuestionIndex++;
            loadNewQuestion();


        }else{
            //choices button clicked
            selectedAnswer  = clickedButton.getText().toString();
            clickedButton.setBackgroundColor(Color.CYAN);

        }

    }

    void loadNewQuestion(){

        if(currentQuestionIndex == totalQuestion ){
            finishQuiz();
            return;
        }

        questionTextView.setText(QuestionAnswer2.question2[currentQuestionIndex]);
        ansA.setText(QuestionAnswer2.choices2[currentQuestionIndex][0]);
        ansB.setText(QuestionAnswer2.choices2[currentQuestionIndex][1]);
        ansC.setText(QuestionAnswer2.choices2[currentQuestionIndex][2]);
        ansD.setText(QuestionAnswer2.choices2[currentQuestionIndex][3]);

    }

    void finishQuiz(){
        String passStatus = "";
        String passPerdeu = "";
        if(score > totalQuestion*0.98){
            passStatus = "Voce derrotou o chefe :)";

            new AlertDialog.Builder(this)
                    .setTitle(passStatus)
                    .setMessage("Voce está mais perto de conseguir a pedra mágica" )
                    .setPositiveButton("Próxima fase",(dialogInterface, i) -> restartQuiz() )
                    .setCancelable(false)
                    .show();



        } else{


            finishAffinity();
            Toast.makeText(getApplicationContext(), "Estude mais, e Tente novamente", Toast.LENGTH_LONG).show();
            System.exit(0);


        }

    }

    void restartQuiz(){
        Intent ab = new Intent(MainActivity9.this,MainActivity10.class);
        startActivity(ab);


    }

}

