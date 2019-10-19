package com.example.rohan.colorgame;


import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;


public class first extends AppCompatActivity {
    private static int NO_TIME = 1;
    @Override
    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_first);
        Button winner1 = (Button) findViewById(R.id.box4);
        Button loser11 = (Button) findViewById(R.id.box1);
        Button loser12 = (Button) findViewById(R.id.box6);
        Button loser13 = (Button) findViewById(R.id.box2);
        winner1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                new Handler().postDelayed(new Runnable() {
                    @Override
                    public void run(){
                        Intent homeIntent = new Intent(first.this, second.class);
                        startActivity(homeIntent);
                        finish();
                    }
                }, NO_TIME);
            }
        });
        loser11.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                new Handler().postDelayed(new Runnable() {
                    @Override
                    public void run(){
                        Intent homeIntent = new Intent(first.this, loser.class);
                        startActivity(homeIntent);
                        finish();
                    }
                }, NO_TIME);
            }
        });
        loser12.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                new Handler().postDelayed(new Runnable() {
                    @Override
                    public void run(){
                        Intent homeIntent = new Intent(first.this, loser.class);
                        startActivity(homeIntent);
                        finish();
                    }
                }, NO_TIME);
            }
        });
        loser13.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                new Handler().postDelayed(new Runnable() {
                    @Override
                    public void run(){
                        Intent homeIntent = new Intent(first.this, loser.class);
                        startActivity(homeIntent);
                        finish();
                    }
                }, NO_TIME);
            }
        });
    }

}