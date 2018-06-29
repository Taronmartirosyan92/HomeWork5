package com.example.sargis.tarproject5;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    private static int MY_COUNTER = 0;
    private static final String KEY_COUNTER = "isCounter";
    private TextView textCounter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Button minButton = findViewById(R.id.minId);
        Button plusButton = findViewById(R.id.plusId);
        textCounter = findViewById(R.id.counterId);
        minButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                MY_COUNTER++;
                textCounter.setText(String.valueOf(MY_COUNTER));
            }
        });
        plusButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                MY_COUNTER--;
                textCounter.setText(String.valueOf(MY_COUNTER));
            }
        });
    }

    @Override
    public void onSaveInstanceState(Bundle outState) {
        super.onSaveInstanceState(outState);
        outState.putInt(KEY_COUNTER, MY_COUNTER);
    }

    @Override
    protected void onRestoreInstanceState(Bundle savedInstanceState) {
        super.onRestoreInstanceState(savedInstanceState);
        MY_COUNTER = savedInstanceState.getInt(KEY_COUNTER);
        textCounter.setText(String.valueOf(MY_COUNTER));
    }
}
