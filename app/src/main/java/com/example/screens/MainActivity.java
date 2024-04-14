package com.example.screens;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // created a button
        Button button = findViewById(R.id.button);

        // listening for when user clicked a button
        button.setOnClickListener( new View.OnClickListener() {
            public void onClick(View v){

                // send intent value to SecondActivity
                Intent intent = new Intent(MainActivity.this, SecondActivity.class);
                intent.putExtra("name", "Charlie");
                startActivity(intent);
            }
        });
    }
}
