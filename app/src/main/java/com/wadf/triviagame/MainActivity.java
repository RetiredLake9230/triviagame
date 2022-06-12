package com.wadf.triviagame;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;

import triviagame.R;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Button abt = (Button) findViewById(R.id.about);
        abt.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                //pat code here
                Intent intent = new Intent(MainActivity.this, AboutPage.class);
                startActivity(intent);
            }
        });
        Button start = (Button) findViewById(R.id.startkey);
        start.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                //pat code here
                Intent intent = new Intent(MainActivity.this, Question1.class);
                startActivity(intent);
            }
        });
    }
}