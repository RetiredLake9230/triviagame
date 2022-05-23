package com.wadf.triviagame;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import triviagame.R;

public class AboutPage extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_about_page);
        Button button = (Button) findViewById(R.id.aboutback);
        button.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                //pat code here
                Intent intent = new Intent(AboutPage.this, MainActivity.class);
                startActivity(intent);
            }
        });
    }
}