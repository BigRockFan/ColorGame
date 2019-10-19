package com.example.rohan.colorgame;

import android.app.Application;
import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;


public class MainActivity extends AppCompatActivity {
    private static int NO_TIME = 1;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Button red = (Button)findViewById(R.id.box1);
        Button green = (Button)findViewById(R.id.box2);

        green.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                new Handler().postDelayed(new Runnable() {
                    @Override
                    public void run(){
                        Intent homeIntent = new Intent(MainActivity.this, first.class);
                        startActivity(homeIntent);
                        finish();
                    }
                }, NO_TIME);
            }
        });

        red.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                new Handler().postDelayed(new Runnable() {
                    @Override
                    public void run(){
                        Intent homeIntent = new Intent(MainActivity.this, loser.class);
                        startActivity(homeIntent);
                        finish();
                    }
                }, NO_TIME);
            }
        });



    }

}

