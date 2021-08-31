package com.example.myfirstapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

public class DetailsActivity extends AppCompatActivity {
    private TextView textView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_details);
        textView = findViewById(R.id.details_text_view);
        Intent intent = getIntent();
        String inputText = intent.getStringExtra(MainActivity.INTENT_KEY_INPUT_TEXT);
        textView.setText(inputText);
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
    }
}