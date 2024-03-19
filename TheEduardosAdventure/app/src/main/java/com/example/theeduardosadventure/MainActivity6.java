package com.example.theeduardosadventure;


import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.graphics.Color;
import android.media.MediaPlayer;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;



import android.app.AlertDialog;
import android.widget.Toast;

public class MainActivity6 extends AppCompatActivity implements View.OnClickListener {


    TextView totalQuestionsTextView; /*Criando um texto pra dizer qual é o numero de perguntas daquele nivel*/
    TextView questionTextView; /*Criando um texto para o enunciado */
    Button ansA, ansB, ansC, ansD; /*Criando botões para as respostas*/
    Button submitBtn; /*Criando um botão para verificar as respostas*/

    int score=0; /*Criando uma variavel que conta os pontos */
    int totalQuestion = QuestionAnswer.question.length; /*Criando uma variável que armazena o numero de questoes e procura a perguntas no SistemaPergunta*/
    int currentQuestionIndex = 0; /* */
    String selectedAnswer = "";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main6);


        /* Procurando e localizando os elemntos*/
        totalQuestionsTextView = findViewById(R.id.total_question);
        questionTextView = findViewById(R.id.question);
        ansA = findViewById(R.id.ans_A);
        ansB = findViewById(R.id.ans_B);
        ansC = findViewById(R.id.ans_C);
        ansD = findViewById(R.id.ans_D);
        submitBtn = findViewById(R.id.submit_btn);

        /*Criando um click */
        ansA.setOnClickListener(this);
        ansB.setOnClickListener(this);
        ansC.setOnClickListener(this);
        ansD.setOnClickListener(this);
        submitBtn.setOnClickListener(this);

        /*Escrevendo na tela o numero total de perguntas */
        totalQuestionsTextView.setText("Total de Perguntas : "+totalQuestion);

        loadNewQuestion();


    }

    @Override
    public void onClick(View view) {

        /* Setando uma cor de fundo para os botões das respostas*/
        ansA.setBackgroundColor(Color.TRANSPARENT);
        ansB.setBackgroundColor(Color.TRANSPARENT);
        ansC.setBackgroundColor(Color.TRANSPARENT);
        ansD.setBackgroundColor(Color.TRANSPARENT);

        /* fazendo um sistema de verificação*/
        Button clickedButton = (Button) view; /* fazendo um botao*/
        if(clickedButton.getId()==R.id.submit_btn){ /* faznedo o valor do botão ser atribuido ao botão verificar */
            if(selectedAnswer.equals(QuestionAnswer.correctAnswers[currentQuestionIndex])){ /*  */
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

        questionTextView.setText(QuestionAnswer.question[currentQuestionIndex]);
        ansA.setText(QuestionAnswer.choices[currentQuestionIndex][0]);
        ansB.setText(QuestionAnswer.choices[currentQuestionIndex][1]);
        ansC.setText(QuestionAnswer.choices[currentQuestionIndex][2]);
        ansD.setText(QuestionAnswer.choices[currentQuestionIndex][3]);

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
        Intent a = new Intent(MainActivity6.this,MainActivity7.class);
        startActivity(a);


    }


}

