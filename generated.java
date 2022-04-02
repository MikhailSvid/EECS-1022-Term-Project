package com.example.project;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class generated extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_generated);
    }

    // sends you to password screen
    public void Save(View view) {
        Intent i = new Intent(this,
                Passwords.class);
        startActivity(i);
    }
}