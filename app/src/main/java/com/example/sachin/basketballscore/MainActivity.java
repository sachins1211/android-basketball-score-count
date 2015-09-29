package com.example.sachin.basketballscore;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.TextView;


public class MainActivity extends AppCompatActivity {
    int a = 0;
    int b = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }


    public void inc1A(View view) {
        a = a + 1;
        dispA(a);
    }


    public void inc2A(View view) {
        a = a + 2;
        dispA(a);
    }


    public void inc3A(View view) {
        a = a + 3;
        dispA(a);
    }


    public void inc1B(View view) {
        b = b + 1;
        dispB(b);
    }


    public void inc2B(View view) {
        b = b + 2;
        dispB(b);
    }


    public void inc3B(View view) {
        b = b + 3;
        dispB(b);
    }


    public void resetScore(View view) {
        a = 0;
        b = 0;
        dispA(a);
        dispB(b);
    }


    public void dispA(int score) {
        TextView score1 = (TextView) findViewById(R.id.scoreA);
        score1.setText(String.valueOf(score));
    }


    public void dispB(int score) {
        TextView score1 = (TextView) findViewById(R.id.scoreB);
        score1.setText(String.valueOf(score));
    }
}
