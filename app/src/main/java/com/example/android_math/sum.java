package com.example.android_math;


import android.content.Intent;
import android.os.Bundle;
import android.os.SystemClock;
import android.view.View;
import android.widget.Button;
import android.widget.Chronometer;
import android.widget.TextView;


import androidx.appcompat.app.AppCompatActivity;

import org.w3c.dom.Text;

public class sum extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState){
        super.onCreate(savedInstanceState);

        setContentView(R.layout.sum1);

        //setup var
        int ans;

        //setup misc
        final Chronometer chronometer = (Chronometer) findViewById(R.id.chronometer);
        //setup buttons
        Button returnButton = findViewById(R.id.sum_return);
        final Button startButton = findViewById(R.id.button_start);
        Button ans0 = findViewById(R.id.ans0);
        Button ans1 = findViewById(R.id.ans1);
        Button ans2 = findViewById(R.id.ans2);
        Button ans3 = findViewById(R.id.ans3);
        Button ans4 = findViewById(R.id.ans4);
        Button ans5 = findViewById(R.id.ans5);
        Button ans6 = findViewById(R.id.ans6);
        Button ans7 = findViewById(R.id.ans7);
        Button ans8 = findViewById(R.id.ans8);
        Button ans9 = findViewById(R.id.ans9);
        Button ans_btn = findViewById(R.id.ans_btn);
        //setup texts
        TextView question = findViewById(R.id.question);



        //start button
        startButton.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view){
                //startbutton invisible
                startButton.setVisibility(View.INVISIBLE);
                //start countup
                chronometer.setBase(SystemClock.elapsedRealtime());
                chronometer.start();
            }
        });

        //answerbuttons
        ans0.setOnClickListener(new View.OnClickListener(){
            TextView answer = findViewById(R.id.answer);
            @Override
            public void onClick(View view){
                String ans = answer.getText().toString();
                answer.setText(ans.concat("0"));

            }
        });

        ans1.setOnClickListener(new View.OnClickListener(){
            TextView answer = findViewById(R.id.answer);
            @Override
            public void onClick(View view){
                String ans = answer.getText().toString();
                answer.setText(ans.concat("1"));

            }
        });

        ans2.setOnClickListener(new View.OnClickListener(){
            TextView answer = findViewById(R.id.answer);
            @Override
            public void onClick(View view){
                String ans = answer.getText().toString();
                answer.setText(ans.concat("2"));

            }
        });

        ans3.setOnClickListener(new View.OnClickListener(){
            TextView answer = findViewById(R.id.answer);
            @Override
            public void onClick(View view){
                String ans = answer.getText().toString();
                answer.setText(ans.concat("3"));

            }
        });

        ans4.setOnClickListener(new View.OnClickListener(){
            TextView answer = findViewById(R.id.answer);
            @Override
            public void onClick(View view){
                String ans = answer.getText().toString();
                answer.setText(ans.concat("4"));

            }
        });

        ans5.setOnClickListener(new View.OnClickListener(){
            TextView answer = findViewById(R.id.answer);
            @Override
            public void onClick(View view){
                String ans = answer.getText().toString();
                answer.setText(ans.concat("5"));

            }
        });

        ans6.setOnClickListener(new View.OnClickListener(){
            TextView answer = findViewById(R.id.answer);
            @Override
            public void onClick(View view){
                String ans = answer.getText().toString();
                answer.setText(ans.concat("6"));

            }
        });

        ans7.setOnClickListener(new View.OnClickListener(){
            TextView answer = findViewById(R.id.answer);
            @Override
            public void onClick(View view){
                String ans = answer.getText().toString();
                answer.setText(ans.concat("7"));

            }
        });

        ans8.setOnClickListener(new View.OnClickListener(){
            TextView answer = findViewById(R.id.answer);
            @Override
            public void onClick(View view){
                String ans = answer.getText().toString();
                answer.setText(ans.concat("8"));

            }
        });

        ans9.setOnClickListener(new View.OnClickListener(){
            TextView answer = findViewById(R.id.answer);
            @Override
            public void onClick(View view){
                String ans = answer.getText().toString();
                answer.setText(ans.concat(""));

            }
        });

        //return title
        returnButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                finish();
            }
        });
    }

}
