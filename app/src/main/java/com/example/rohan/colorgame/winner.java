package com.example.rohan.colorgame;


import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;


public class winner extends AppCompatActivity {
    private static int NO_TIME = 1;
    @Override
    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_winner);
        Button back = (Button) findViewById(R.id.back_button1);
        back.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                new Handler().postDelayed(new Runnable() {
                    @Override
                    public void run(){
                        Intent homeIntent = new Intent(winner.this, MainActivity.class);
                        startActivity(homeIntent);
                        finish();
                    }
                }, NO_TIME);
            }
        });


    }

}