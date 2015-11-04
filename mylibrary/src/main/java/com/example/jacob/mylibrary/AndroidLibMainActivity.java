package com.example.jacob.mylibrary;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class AndroidLibMainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_android_lib_main);

        String newJoke = getIntent().getExtras().getString("jokeTransfer");

        TextView jokeTextView = (TextView) findViewById(R.id.textView);
        jokeTextView.setText(newJoke);
    }
}
