package com.example.android.courtcounter;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    int t1 = 0 ;
    int t2 = 0 ;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        displayForTeamA(t1);
        displayForTeamB(t2);
    }

    public void T1plus3(View view){
        t1 = t1 + 3 ;
        displayForTeamA(t1);
    }
    public void T1plus2(View view){
        t1 = t1 + 2 ;
        displayForTeamA(t1);
    }
    public void T1plus1(View view){
        t1 = t1 + 1 ;
        displayForTeamA(t1);
    }

    public void T2plus3(View view){
        t2 = t2 + 3 ;
        displayForTeamB(t2);
    }
    public void T2plus2(View view){
        t2 = t2 + 2 ;
        displayForTeamB(t2);
    }
    public void T2plus1(View view){
        t2 = t2 + 1 ;
        displayForTeamB(t2);
    }

    public void reset(View view){
        displayForTeamB(0);
        displayForTeamA(0);
        t1 = 0 ;
        t2 = 0 ;
    }
    /**
     * Displays the given score for Team A.
     */
    public void displayForTeamA(int score) {
        TextView scoreView = (TextView) findViewById(R.id.team1);
        scoreView.setText(String.valueOf(score));
    }

    public void displayForTeamB(int score) {
        TextView scoreView = (TextView) findViewById(R.id.team2);
        scoreView.setText(String.valueOf(score));
    }


}