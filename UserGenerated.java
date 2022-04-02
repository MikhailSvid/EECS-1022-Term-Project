package com.example.project;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class UserGenerated extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_user_generated);
    }

    // sends you to home screen
    public void Save(View view) {
        Intent i = new Intent(this,
                Passwords.class);
        startActivity(i);
    }
}
