package com.example.rohan.colorgame;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.support.v7.app.AppCompatActivity;


public class correct extends AppCompatActivity
{
    private static int SPLASH = 500;
    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_correct);

        new Handler().postDelayed(new Runnable() {
            @Override
            public void run(){
                Intent homeIntent = new Intent(correct.this, cycle.class);
                startActivity(homeIntent);
                finish();
            }
        }, SPLASH);
    }

}