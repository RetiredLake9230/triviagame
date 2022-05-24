package com.wadf.triviagame;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

import triviagame.R;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Button btn1 = (Button) findViewById(R.id.about);
        btn1.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                //pat code here
                Intent intent = new Intent(MainActivity.this, AboutPage.class);
                startActivity(intent);
            }
        });
        Button btn2 = (Button) findViewById(R.id.startkey);
        btn2.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                //pat code here
                Intent intent = new Intent(MainActivity.this, AboutPage.class);
                startActivity(intent);
                //toast
                String message = "Starting now.. Try your best!";
                int duration = Toast.LENGTH_SHORT;
                Toast toast = Toast.makeText(MainActivity.this, message, duration);
                toast.show();
            }
});
    }
}