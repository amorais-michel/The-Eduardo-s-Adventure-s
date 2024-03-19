package com.example.theeduardosadventure;

public class QuestionAnswer {

    public static String question[] ={  // Sistema que registra as perguntas

            "Pedro______(print) the test five minutes ago?",
            "Carlos ______(wash) his car of hers last weekend",
            "Rebeca ______(talk) a lot about me ",
            "Voce não assistiu o filme ontem",
            "Fez o trabalho de ingles e estudou para prova?"
    };

    public static String choices[][] = { //Sistema que registra as escolhas das respostas
            {"Print","Printeded","Printedy","Printed"},
            {"Washey","Washied","Washed","Washerd"},
            {"Talked","Talkedy","Talkend","Talqueid"},
            {"You noti watch the movie yesterday.","You doesn't watch the movie yesterday.","You don't the movie yesterday. ","You didn't watch the movie yesterday."},
            {"Did she is going do your English homework and study for the test?","Did you do your English homework and study for the test?","Did you do your English homeworked and studyied for the test?","You did do your English homework and study for the test?"}
    };


    public static String correctAnswers[] = { //Sistema que armazena as respostas corretas
            "Printed",
            "Washed",
            "Talked",
            "You didn't watch the movie yesterday.",
            "Did you do your English homework and study for the test?"
    };

}
