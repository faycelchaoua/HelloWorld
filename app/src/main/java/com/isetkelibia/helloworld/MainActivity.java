package com.isetkelibia.helloworld;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        /*TextView helloTextView = findViewById(R.id.text_view_id);
        helloTextView.setText(R.string.user_greeting);*/
    }
}
