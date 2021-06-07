package com.example.android.courtcounter;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private int scoreTeamA=0;
    private int scoreTeamB=0;
    private TextView textView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        displayForTeamA(0);
        displayForTeamB(0);
    }

    /**
     * This method is called  when free throw is clicked for Team A.
     */
    public void minpointA(View view){
        if (scoreTeamA < 50)
        scoreTeamA+=1;
        displayForTeamA(scoreTeamA);
    }

    /**
     * This method is called  when +2POINTS is clicked for Team A.
     */
    public void midpointA(View view){
        if (scoreTeamA < 50)
        scoreTeamA+=2;
        displayForTeamA(scoreTeamA);
    }

    /**
     * This method is called  when +3POINTS is clicked for Team A.
     */
    public void maxpointA(View view){
        if (scoreTeamA < 50)
        scoreTeamA+=3;
        displayForTeamA(scoreTeamA);
    }

    /**
     * This method is called  when free throw is clicked for Team B.
     */
    public void minpointB(View view){
        if (scoreTeamB < 50)
        scoreTeamB+=1;
        displayForTeamB(scoreTeamB);
    }

    /**
     * This method is called  when +2POINTS is clicked for Team B.
     */
    public void midpointB(View view){
        if (scoreTeamB < 50)
        scoreTeamB+=2;
        displayForTeamB(scoreTeamB);
    }

    /**
     * This method is called  when +3POINTS is clicked for Team B.
     */
    public void maxpointB(View view){
        if (scoreTeamB < 50)
        scoreTeamB+=3;
        displayForTeamB(scoreTeamB);
    }

    /**
     * This method is called  when reset is clicked..
    */
    public void reset(View view){
        scoreTeamA=0;
        scoreTeamB=0;
        displayForTeamA(scoreTeamA);
        displayForTeamB(scoreTeamB);
        textView.setText("");
    }

    /**
     * Displays the given score for Team A.
     */
    public void displayForTeamA(int score) {
        TextView scoreView = (TextView) findViewById(R.id.team_a_score);
        scoreView.setText(String.valueOf(score));
    }

    /**
     * Displays the given score for Team B.
    */
    public void displayForTeamB(int score) {
        TextView scoreView = (TextView) findViewById(R.id.team_b_score);
        scoreView.setText(String.valueOf(score));
    }

    public void submit(View view) {
        textView = findViewById(R.id.winner);
        if(scoreTeamA > scoreTeamB)
            textView.setText("!!!Congratulation Team A!!!");
        else if(scoreTeamA < scoreTeamB)
            textView.setText("!!!Congratulation Team B!!!");
        else
            textView.setText("Match Draw");
    }
}
