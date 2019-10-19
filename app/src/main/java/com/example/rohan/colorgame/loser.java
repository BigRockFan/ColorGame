package com.example.rohan.colorgame;


import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.os.Handler;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import static com.example.rohan.colorgame.startup.PREFS;


public class loser extends AppCompatActivity {
    private static int NO_TIME = 1;
    @Override
    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_loser);
        SharedPreferences example = getSharedPreferences(PREFS, 0);
        String userString = example.getString("message", "N/A");
        TextView scoreBox1 = (TextView) findViewById(R.id.scoreFinal);
        scoreBox1.setText("Score: " + userString);
        Button back = (Button) findViewById(R.id.back_button);
        back.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                new Handler().postDelayed(new Runnable() {
                    @Override
                    public void run(){
                        Intent homeIntent = new Intent(loser.this, startup.class);
                        startActivity(homeIntent);
                        finish();
                    }
                }, NO_TIME);
            }
        });


    }

}