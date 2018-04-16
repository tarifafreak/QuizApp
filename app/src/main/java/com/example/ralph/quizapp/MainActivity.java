package com.example.ralph.quizapp;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    final int maxScore = 7;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

                findViewById(R.id.button_result).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                //set initial score to 0
                int score = 0;

                //check if question is answered correctly and increase score by 1 if true
                CheckBox q1a2 = findViewById(R.id.question1answer2);
                if (q1a2.isChecked()) {
                    score++;
                }
                //check if question is answered correctly and increase score by 1 if true
                CheckBox q1a3 = findViewById(R.id.question1answer3);
                if (q1a3.isChecked()) {
                    score++;
                }
                //check if question is answered correctly and increase score by 1 if true
                EditText q2 = findViewById(R.id.question2edittext);
                if (q2.getText().toString().contains("never")) {
                    score++;
                }
                //check if question is answered correctly and increase score by 1 if true
                RadioButton q3a2 = findViewById(R.id.question3answer2);
                if (q3a2.isChecked()) {
                    score++;
                }
                //check if question is answered correctly and increase score by 1 if true
                RadioButton q4a2 = findViewById(R.id.question4answer2);
                if (q4a2.isChecked()) {
                    score++;
                }
                //check if question is answered correctly and increase score by 1 if true
                RadioButton q5a2 = findViewById(R.id.question5answer2);
                if (q5a2.isChecked()) {
                    score++;
                }
                //check if question is answered correctly and increase score by 1 if true
                RadioButton q6a2 = findViewById(R.id.question6answer2);
                if (q6a2.isChecked()) {
                    score++;
                }

                //display toast message with score reached compared to maximum score
                if (score == maxScore) {
                    Toast.makeText(MainActivity.this, "Wow! You got " + score + " out of " + maxScore + " answers right - great job!" , Toast.LENGTH_SHORT).show();
                } else{
                    Toast.makeText(MainActivity.this, "Not bad! You answered " + score + " out of " + maxScore + " answers correctly - better luck next time!" , Toast.LENGTH_SHORT).show();
                }
            }
        });

    }
}