package com.example.android.scorekeeper;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    // Tracks the score for Home
    int scoreRunsHome = 0, outsHome = 0, foulsHome = 0, inningsHome = 0;

    /**
     * Displays the given score for Home.
     */
    public void displayForHomeScoreRuns(int score) {
        TextView scoreView = (TextView) findViewById(R.id.home_scoreRuns);
        scoreView.setText(String.valueOf(score));
    }

    /**
     * Increase the score for Home by 1 points.
     */
    public void addOneRunForHome(View view) {
        scoreRunsHome += 1;
        displayForHomeScoreRuns(scoreRunsHome);
    }

    /**
     * Displays the given outs for Home.
     */
    public void displayForHomeOuts(int score) {
        TextView scoreView = (TextView) findViewById(R.id.home_outs);
        scoreView.setText(String.valueOf(score));
    }

    /**
     * Increase the score for Home by 1 point.
     */
    public void addOneOutForHome(View view) {
        outsHome += 1;
        displayForHomeOuts(outsHome);
    }

    /**
     * Displays the given fouls for Home.
     */
    public void displayForHomeFouls(int score) {
        TextView scoreView = (TextView) findViewById(R.id.home_fouls);
        scoreView.setText(String.valueOf(score));
    }

    /**
     * Increase the score for Home by 1 point.
     */
    public void addOneFoulForHome(View view) {
        foulsHome += 1;
        displayForHomeFouls(foulsHome);
    }

    /**
     * Displays the given innings for Home.
     */
    public void displayForHomeInnings(int score) {
        TextView scoreView = (TextView) findViewById(R.id.home_innings);
        scoreView.setText(String.valueOf(score));
    }

    /**
     * Increase the innings for Home by 1 point.
     */
    public void addOneInningForHome(View view) {
        inningsHome += 1;
        displayForHomeInnings(inningsHome);
    }

    // Tracks the score for Visitors
    int scoreRunsVisitors = 0, outsVisitors = 0, foulsVisitors = 0, inningsVisitors = 0;

    /**
     * Displays the given score for Visitors.
     */
    public void displayForVisitorsScoreRuns(int score) {
        TextView scoreView = (TextView) findViewById(R.id.visitors_scoreRuns);
        scoreView.setText(String.valueOf(score));
    }

    /**
     * Increase the score for Visitors by 1 points.
     */
    public void addOneRunForVisitors(View view) {
        scoreRunsVisitors += 1;
        displayForVisitorsScoreRuns(scoreRunsVisitors);
    }

    /**
     * Displays the given outs for Visitors.
     */
    public void displayForVisitorsOuts(int score) {
        TextView scoreView = (TextView) findViewById(R.id.visitors_outs);
        scoreView.setText(String.valueOf(score));
    }

    /**
     * Increase the outs for Visitors by 1 points.
     */
    public void addOneOutForVisitors(View view) {
        outsVisitors += 1;
        displayForVisitorsOuts(outsVisitors);
    }

    /**
     * Displays the given fouls for Visitors.
     */
    public void displayForVisitorsFouls(int score) {
        TextView scoreView = (TextView) findViewById(R.id.visitors_fouls);
        scoreView.setText(String.valueOf(score));
    }

    /**
     * Increase the fouls for Visitors by 1 point.
     */
    public void addOneFoulForVisitors(View view) {
        foulsVisitors += 1;
        displayForVisitorsFouls(foulsVisitors);
    }

    /**
     * Displays the given innings for Visitors.
     */
    public void displayForVisitorsInnings(int score) {
        TextView scoreView = (TextView) findViewById(R.id.visitors_innings);
        scoreView.setText(String.valueOf(score));
    }

    /**
     * Increase the innings for Visitors by 1 point.
     */
    public void addOneInningForVisitors(View view) {
        inningsVisitors += 1;
        displayForVisitorsInnings(inningsVisitors);
    }

    /**
     * Resets the score for both teams.
     */
    public void resetScore(View view) {
        scoreRunsHome = 0;
        outsHome = 0;
        foulsHome = 0;
        inningsHome = 0;
        scoreRunsVisitors = 0;
        outsVisitors = 0;
        foulsVisitors = 0;
        inningsVisitors = 0;
        displayForHomeScoreRuns(scoreRunsHome);
        displayForHomeOuts(outsHome);
        displayForHomeFouls(foulsHome);
        displayForHomeInnings(inningsHome);
        displayForVisitorsScoreRuns(scoreRunsVisitors);
        displayForVisitorsOuts(outsVisitors);
        displayForVisitorsFouls(foulsVisitors);
        displayForVisitorsInnings(inningsVisitors);
    }
}