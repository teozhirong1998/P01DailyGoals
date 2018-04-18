package com.example.a16022635.p01_dailygoals;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class Summary extends AppCompatActivity {

    TextView tvSummary;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_summary);

        tvSummary = (TextView) findViewById(R.id.textViewSummary);

        Intent i = getIntent();
        String[] summary = i.getStringArrayExtra("summary");

        tvSummary.setText("Read on materials before class: " + summary[0]
        + "\n\nArrive on time so as not to miss important part of the lesson: " + summary[1]
        + "\n\nAttempt the problem myself: " + summary[2]
        + "\n\nReflection: " + summary[3]);
    }
}
