package com.example.project;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class Passwords extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_passwords);
    }

    // sends you to usergenerated screen
    public void add(View view) {
        Intent i = new Intent(this,
                UserGenerated.class);
        startActivity(i);
    }
}