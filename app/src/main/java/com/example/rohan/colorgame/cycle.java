package com.example.rohan.colorgame;


import android.annotation.SuppressLint;
import android.annotation.TargetApi;
import android.content.Intent;
import android.content.SharedPreferences;
import android.graphics.Color;
import android.graphics.drawable.ColorDrawable;
import android.os.Build;
import android.os.Bundle;
import android.os.CountDownTimer;
import android.os.Handler;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import java.math.BigDecimal;
import java.math.RoundingMode;
import java.util.Random;

import java.util.concurrent.TimeUnit;


@TargetApi(Build.VERSION_CODES.GINGERBREAD)
@SuppressLint("NewApi")

public class cycle extends AppCompatActivity {
    private static int NO_TIME = 1;

    public static final String PREFS = "examplePrefs";
    @Override
    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_cycle);

        TextView score = (TextView) findViewById(R.id.scoreBox);
        SharedPreferences example = getSharedPreferences(PREFS, 0);
        String userString = example.getString("message", "N/A");
        int newScore = Integer.parseInt(userString) + 1;
        SharedPreferences.Editor editor = example.edit();
        editor.putString("message", Integer.toString(newScore));
        editor.apply();
        score.setText(Integer.toString(newScore));

        final Button button1 = (Button) findViewById(R.id.box1);
        final Button button2 = (Button) findViewById(R.id.box2);
        final Button button3 = (Button) findViewById(R.id.box3);
        final Button button4 = (Button) findViewById(R.id.box4);
        final Button button5 = (Button) findViewById(R.id.box5);
        final Button button6 = (Button) findViewById(R.id.box6);
        final Button button7 = (Button) findViewById(R.id.box7);
        final Button button8 = (Button) findViewById(R.id.box8);
        final TextView text = (TextView) findViewById(R.id.chooseColor);
        final TextView textViewTime = (TextView) findViewById(R.id.textViewTime);
        final CounterClass timer;
        if (newScore < 5) {
            timer = new CounterClass(5050, 1);
            timer.start();
        }
        else if (newScore >= 5 && newScore < 10) {
            timer = new CounterClass(3050, 1);
            timer.start();
        }
        else if (newScore >= 10 && newScore < 15) {
            timer = new CounterClass(2050, 1);
            timer.start();
        }
        else {
            timer = new CounterClass(1050, 1);
            timer.start();
        }

        String arrColors[] = new String[8]; //Red, green, blue, white, black, yellow, orange, pink
        arrColors[0] = "#ff0000";
        arrColors[1] = "#00ff00";
        arrColors[2] = "#0000ff";
        arrColors[3] = "#00fffa";
        arrColors[4] = "#000000";
        arrColors[5] = "#ffff00";
        arrColors[6] = "#ff6400";
        arrColors[7] = "#ff30e0";

        String arrColorsNames[] = new String[8];
        arrColorsNames[0] = "red";
        arrColorsNames[1] = "green";
        arrColorsNames[2] = "blue";
        arrColorsNames[3] = "aqua";
        arrColorsNames[4] = "black";
        arrColorsNames[5] = "yellow";
        arrColorsNames[6] = "orange";
        arrColorsNames[7] = "pink";

        String newColors[] = randomize(arrColors, arrColors.length, arrColorsNames);

        int decode0 = Color.parseColor(newColors[0]);
        ColorDrawable colorDrawable1 = new ColorDrawable(decode0);
        button1.setBackground(colorDrawable1);

        int decode1 = Color.parseColor(newColors[1]);
        ColorDrawable colorDrawable2 = new ColorDrawable(decode1);
        button2.setBackground(colorDrawable2);

        int decode2 = Color.parseColor(newColors[2]);
        ColorDrawable colorDrawable3 = new ColorDrawable(decode2);
        button3.setBackground(colorDrawable3);

        int decode3 = Color.parseColor(newColors[3]);
        ColorDrawable colorDrawable4 = new ColorDrawable(decode3);
        button4.setBackground(colorDrawable4);

        int decode4 = Color.parseColor(newColors[4]);
        ColorDrawable colorDrawable5 = new ColorDrawable(decode4);
        button5.setBackground(colorDrawable5);

        int decode5 = Color.parseColor(newColors[5]);
        ColorDrawable colorDrawable6 = new ColorDrawable(decode5);
        button6.setBackground(colorDrawable6);

        int decode6 = Color.parseColor(newColors[6]);
        ColorDrawable colorDrawable7 = new ColorDrawable(decode6);
        button7.setBackground(colorDrawable7);

        int decode7 = Color.parseColor(newColors[7]);
        ColorDrawable colorDrawable8 = new ColorDrawable(decode7);
        button8.setBackground(colorDrawable8);

        Random random = new Random();
        int ran = random.nextInt(8);
        final String winnercolor = arrColors[ran];
        text.setText("Choose the " + arrColorsNames[ran] + " one");
        button1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                ColorDrawable color1 = (ColorDrawable) button1.getBackground();
                //text.setText(String.valueOf(color1.getColor()) + " " + String.valueOf(Color.parseColor(winnercolor))); //-- TEST BY PRINTING TO SEE WHY IF STATEMENTS NEVER MATCH
                timer.cancel();
                if (color1.getColor() == Color.parseColor(winnercolor))
                    new Handler().postDelayed(new Runnable() {
                        @Override
                        public void run() {
                            Intent homeIntent = new Intent(cycle.this, correct.class);
                            startActivity(homeIntent);
                            finish();
                        }
                    }, NO_TIME);
                else
                    new Handler().postDelayed(new Runnable() {
                        @Override
                        public void run() {
                            Intent homeIntent = new Intent(cycle.this, loser.class);
                            startActivity(homeIntent);
                            finish();
                        }
                    }, NO_TIME);
            }
        });
        button2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                ColorDrawable color1 = (ColorDrawable) button2.getBackground();
                timer.cancel();
                if (color1.getColor() == Color.parseColor(winnercolor))
                    new Handler().postDelayed(new Runnable() {
                        @Override
                        public void run() {
                            Intent homeIntent = new Intent(cycle.this, correct.class);
                            startActivity(homeIntent);
                            finish();
                        }
                    }, NO_TIME);
                else
                    new Handler().postDelayed(new Runnable() {
                        @Override
                        public void run() {
                            Intent homeIntent = new Intent(cycle.this, loser.class);
                            startActivity(homeIntent);
                            finish();
                        }
                    }, NO_TIME);
            }
        });
        button3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                ColorDrawable color1 = (ColorDrawable) button3.getBackground();
                timer.cancel();
                if (color1.getColor() == Color.parseColor(winnercolor))
                    new Handler().postDelayed(new Runnable() {
                        @Override
                        public void run() {
                            Intent homeIntent = new Intent(cycle.this, correct.class);
                            startActivity(homeIntent);
                            finish();
                        }
                    }, NO_TIME);
                else
                    new Handler().postDelayed(new Runnable() {
                        @Override
                        public void run() {
                            Intent homeIntent = new Intent(cycle.this, loser.class);
                            startActivity(homeIntent);
                            finish();
                        }
                    }, NO_TIME);
            }
        });
        button4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                ColorDrawable color1 = (ColorDrawable) button4.getBackground();
                timer.cancel();
                if (color1.getColor() == Color.parseColor(winnercolor))
                    new Handler().postDelayed(new Runnable() {
                        @Override
                        public void run() {
                            Intent homeIntent = new Intent(cycle.this, correct.class);
                            startActivity(homeIntent);
                            finish();
                        }
                    }, NO_TIME);
                else
                    new Handler().postDelayed(new Runnable() {
                        @Override
                        public void run() {
                            Intent homeIntent = new Intent(cycle.this, loser.class);
                            startActivity(homeIntent);
                            finish();
                        }
                    }, NO_TIME);
            }
        });
        button5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                ColorDrawable color1 = (ColorDrawable) button5.getBackground();
                timer.cancel();
                if (color1.getColor() == Color.parseColor(winnercolor))
                    new Handler().postDelayed(new Runnable() {
                        @Override
                        public void run() {
                            Intent homeIntent = new Intent(cycle.this, correct.class);
                            startActivity(homeIntent);
                            finish();
                        }
                    }, NO_TIME);
                else
                    new Handler().postDelayed(new Runnable() {
                        @Override
                        public void run() {
                            Intent homeIntent = new Intent(cycle.this, loser.class);
                            startActivity(homeIntent);
                            finish();
                        }
                    }, NO_TIME);
            }
        });
        button6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                ColorDrawable color1 = (ColorDrawable) button6.getBackground();
                timer.cancel();
                if (color1.getColor() == Color.parseColor(winnercolor))
                    new Handler().postDelayed(new Runnable() {
                        @Override
                        public void run() {
                            Intent homeIntent = new Intent(cycle.this, correct.class);
                            startActivity(homeIntent);
                            finish();
                        }
                    }, NO_TIME);
                else
                    new Handler().postDelayed(new Runnable() {
                        @Override
                        public void run() {
                            Intent homeIntent = new Intent(cycle.this, loser.class);
                            startActivity(homeIntent);
                            finish();
                        }
                    }, NO_TIME);
            }
        });
        button7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                ColorDrawable color1 = (ColorDrawable) button7.getBackground();
                timer.cancel();
                if (color1.getColor() == Color.parseColor(winnercolor))
                    new Handler().postDelayed(new Runnable() {
                        @Override
                        public void run() {
                            Intent homeIntent = new Intent(cycle.this, correct.class);
                            startActivity(homeIntent);
                            finish();
                        }
                    }, NO_TIME);
                else
                    new Handler().postDelayed(new Runnable() {
                        @Override
                        public void run() {
                            Intent homeIntent = new Intent(cycle.this, loser.class);
                            startActivity(homeIntent);
                            finish();
                        }
                    }, NO_TIME);
            }
        });
        button8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                ColorDrawable color1 = (ColorDrawable) button8.getBackground();
                timer.cancel();
                if (color1.getColor() == Color.parseColor(winnercolor))
                    new Handler().postDelayed(new Runnable() {
                        @Override
                        public void run() {
                            Intent homeIntent = new Intent(cycle.this, correct.class);
                            startActivity(homeIntent);
                            finish();
                        }
                    }, NO_TIME);
                else
                    new Handler().postDelayed(new Runnable() {
                        @Override
                        public void run() {
                            Intent homeIntent = new Intent(cycle.this, loser.class);
                            startActivity(homeIntent);
                            finish();
                        }
                    }, NO_TIME);
            }
        });
    }

    @TargetApi(Build.VERSION_CODES.GINGERBREAD)
    @SuppressLint("NewApi")
    public class CounterClass extends CountDownTimer {
        final TextView textViewTime = (TextView) findViewById(R.id.textViewTime);
        public CounterClass(long millisInFuture, long countDownInterval) {
            super(millisInFuture, countDownInterval);
        }

        @TargetApi(Build.VERSION_CODES.GINGERBREAD)
        @SuppressLint("NewApi")
        @Override
        public void onTick(long millisUntilFinished) {
            float times = TimeUnit.MILLISECONDS.toMillis(millisUntilFinished);
            times = times / 1000;
            BigDecimal a = new BigDecimal(times);
            BigDecimal b = a.setScale(2, RoundingMode.DOWN);

            //String hms = String.format("%f", times);
            String hms = b.toString();
            textViewTime.setText(hms);
        }

        @Override
        public void onFinish() {
            new Handler().postDelayed(new Runnable() {
                @Override
                public void run() {
                    Intent homeIntent = new Intent(cycle.this, loser.class);
                    startActivity(homeIntent);
                    finish();
                }
            }, NO_TIME);
        }
    }
    protected String[] randomize( String arr[], int n, String arr2[])
    {
        Random r = new Random();
        String temp;


        for (int i = n-1; i > 0; i--) {

            int j = r.nextInt(i);

            temp = arr[i];
            arr[i] = arr[j];
            arr[j] = temp;

            temp = arr2[i];
            arr2[i] = arr2[j];
            arr2[j] = temp;
        }
        return arr;
    }


}