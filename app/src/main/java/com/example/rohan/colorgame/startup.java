package com.example.rohan.colorgame;

import android.app.Application;
import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.os.Handler;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;


public class startup extends AppCompatActivity {
    private static int NO_TIME = 1;
    public static final String PREFS = "examplePrefs";
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_startup);
        Button red = (Button) findViewById(R.id.play);

        red.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                int score = -1;
                SharedPreferences scorepref = getSharedPreferences(PREFS, 0);
                SharedPreferences.Editor editor = scorepref.edit();
                editor.putString("message", Integer.toString(score));
                editor.apply();

                new Handler().postDelayed(new Runnable() {
                    @Override
                    public void run() {
                        Intent homeIntent = new Intent(startup.this, MainActivity.class);
                        startActivity(homeIntent);
                        finish();
                    }
                }, NO_TIME);
            }
        });
    }
}
