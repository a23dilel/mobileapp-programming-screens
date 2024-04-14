package com.example.screens;

import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;
import android.widget.TextView;

public class SecondActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);

        // created a textView
        TextView textView = findViewById(R.id.textView);

        // receive intent value from MainActivity
        Bundle extras = getIntent().getExtras();
        // check if value is not null
        if (extras != null) {
            // get intent name
            String name = extras.getString("name");
            // set from an intent name to a textview
            textView.setText(name);
        }
    }
}