package com.example.wapperfood;

import static com.example.wapperfood.R.*;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;

public class MainActivity4 extends AppCompatActivity {

    ImageButton imgbtn_1,imgbtn_2,imgbtn_3,imgbtn_4;
    Button btn_back2;

    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(layout.activity_main4);

        imgbtn_1 = findViewById(id.imgbtn_1);
        imgbtn_2 = findViewById(id.imgbtn_2);
        imgbtn_3 = findViewById(id.imgbtn_3);
        imgbtn_4 = findViewById(id.imgbtn_4);
        btn_back2 =findViewById(id.btn_back2);

        btn_back2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(MainActivity4.this,MainActivity2.class));
            }
        });

    }
}