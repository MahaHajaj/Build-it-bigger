package com.example.androidlibjoke;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.TextView;

public class AndroidLibActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.joke_activity);

        TextView textView = findViewById(R.id.joke_view);
        Intent intent = getIntent();
        String joke = intent.getStringExtra(getString(R.string.joke));
        if (joke != null && joke.length() != 0) {
            textView.setText(joke);
        }
    }
}
