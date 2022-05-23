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
        Button button = (Button) findViewById(R.id.about);
        button.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                //pat code here
                Intent intent = new Intent(MainActivity.this, AboutPage.class);
                startActivity(intent);
            }
        });
    }
}