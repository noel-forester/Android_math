package com.example.android_math;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setScreenMain();
    }

    private void setScreenMain(){
        setContentView(R.layout.activity_main);

        Button sum1Button = findViewById(R.id.sum1_button);
        Button sub1Button = findViewById(R.id.sub1);

        sum1Button.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getApplication(), sum.class);
                startActivity(intent);
            }
        });


        sub1Button.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getApplication(), diff.class);
                startActivity(intent);
            }
        });
    }



}