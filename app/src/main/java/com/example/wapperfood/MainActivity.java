package com.example.wapperfood;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    EditText user,password;
    Button btn_login;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        user = findViewById(R.id.user);
        password = findViewById(R.id.password);
        btn_login = findViewById(R.id.btn_login);


        btn_login.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                    //CODIGO PARA CREAR USUARIO
                if(user.getText().toString().equals("santiago") && password.getText().toString().equals("12345")){
                    //CODIGO PARA CAMBIAR DE ACTIVITY
                    //Intent intent = new Intent(MainActivity.this,MainActivity2.class);
                    startActivity(new Intent(MainActivity.this,MainActivity2.class));

                    Toast.makeText(MainActivity.this, "Credenciales correctas", Toast.LENGTH_SHORT).show();
                }else{
                    Toast.makeText(MainActivity.this, "Credenciales incorrectas", Toast.LENGTH_SHORT).show();
                }
            }
        });
    }
}