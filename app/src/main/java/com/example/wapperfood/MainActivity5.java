package com.example.wapperfood;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.Button;

public class MainActivity5 extends AppCompatActivity {

    Button btn_back5;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main5);

        btn_back5 = findViewById(R.id.btn_back5);
    }
}