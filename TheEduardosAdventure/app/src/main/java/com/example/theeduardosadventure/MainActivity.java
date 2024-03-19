package com.example.theeduardosadventure;

/*Importando bibliotecas*/

import androidx.appcompat.app.AppCompatActivity;
import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {  /*Classe Principal*/

    private EditText Name; /*Criando um editor de texto pro usuario*/
    private EditText Password;  /*Criando um editor de texto pra senha*/
    private TextView Info;  /*Criando um texto para avisar o usuario quantos logins ele pode fazer*/
    private Button Login;  /*Criando um botão de login*/
    private int counter = 3;  /*Criando um contador que armazena o numero de tentativas de login*/

    @Override
    protected void onCreate(Bundle savedInstanceState)
    {

        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        /*Exibindo uma notificação que diz quem criou o aplicativo*/
        Toast.makeText(getApplicationContext(), "Desenvolvido pelo grupo 4", Toast.LENGTH_LONG).show();

        /*Procurando e localizando os endereços dos elementos*/
        Name = findViewById(R.id.etName);
        Password = findViewById(R.id.etPassword);
        Info = findViewById(R.id.tvInfo);
        Login = findViewById(R.id.btnLogin);

        /*Criando uma mensagem que exibe o numero de logins que o usuário pode fazer*/
        Info.setText("Número de tentativas de login restantes: 3");

        /*Criando um click*/
        Login.setOnClickListener(view -> validate(Name.getText().toString(), Password.getText().toString()));
    }

    /*Criando as credenciais*/
    private void validate(String userName, String userPassword){
        if((userName.equals("jogador")) && (userPassword.equals("margot"))){ /*Definindo e verificando as credenciais*/
            Intent senha = new Intent(MainActivity.this, Realoufeiki.class); /*Se as credencias estiverem certas, carregando a proxima tela*/
            startActivity(senha); /*Chamando a proxima tela*/
            finish(); /*Finalizando a tela de login*/
        }else{
            counter--; /*Diminuindo o contador de tentativas de login*/

            Info.setText("Número de tentativas de login restantes: " + String.valueOf(counter));

            if(counter == 0){ /*Se o contador de tentativas de login, chegar a zero, o app encerra*/
                Login.setEnabled(false);
                System.exit(0);
            }
        }
    }

}