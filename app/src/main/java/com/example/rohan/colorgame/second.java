package com.example.rohan.colorgame;


import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;


public class second extends AppCompatActivity {
    private static int NO_TIME = 1;
    @Override
    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);
        Button winner2 = (Button) findViewById(R.id.box6);
        Button loser21 = (Button) findViewById(R.id.box1);
        Button loser22 = (Button) findViewById(R.id.box3);
        Button loser23 = (Button) findViewById(R.id.box2);
        Button loser24 = (Button) findViewById(R.id.box5);
        Button loser25 = (Button) findViewById(R.id.box7);
        Button loser26 = (Button) findViewById(R.id.black2);
        Button loser27 = (Button) findViewById(R.id.box4);

        winner2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                new Handler().postDelayed(new Runnable() {
                    @Override
                    public void run(){
                        Intent homeIntent = new Intent(second.this, cycle.class);
                        startActivity(homeIntent);
                        finish();
                    }
                }, NO_TIME);
            }
        });
        loser21.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                new Handler().postDelayed(new Runnable() {
                    @Override
                    public void run(){
                        Intent homeIntent = new Intent(second.this, loser.class);
                        startActivity(homeIntent);
                        finish();
                    }
                }, NO_TIME);
            }
        });
        loser22.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                new Handler().postDelayed(new Runnable() {
                    @Override
                    public void run(){
                        Intent homeIntent = new Intent(second.this, loser.class);
                        startActivity(homeIntent);
                        finish();
                    }
                }, NO_TIME);
            }
        });
        loser23.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                new Handler().postDelayed(new Runnable() {
                    @Override
                    public void run(){
                        Intent homeIntent = new Intent(second.this, loser.class);
                        startActivity(homeIntent);
                        finish();
                    }
                }, NO_TIME);
            }
        });
        loser24.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                new Handler().postDelayed(new Runnable() {
                    @Override
                    public void run(){
                        Intent homeIntent = new Intent(second.this, loser.class);
                        startActivity(homeIntent);
                        finish();
                    }
                }, NO_TIME);
            }
        });
        loser25.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                new Handler().postDelayed(new Runnable() {
                    @Override
                    public void run(){
                        Intent homeIntent = new Intent(second.this, loser.class);
                        startActivity(homeIntent);
                        finish();
                    }
                }, NO_TIME);
            }
        });
        loser26.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                new Handler().postDelayed(new Runnable() {
                    @Override
                    public void run(){
                        Intent homeIntent = new Intent(second.this, loser.class);
                        startActivity(homeIntent);
                        finish();
                    }
                }, NO_TIME);
            }
        });
        loser27.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                new Handler().postDelayed(new Runnable() {
                    @Override
                    public void run(){
                        Intent homeIntent = new Intent(second.this, loser.class);
                        startActivity(homeIntent);
                        finish();
                    }
                }, NO_TIME);
            }
        });
    }

}