package com.example.project;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class CreateAccount extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_create_account);
    }
    // sends you to security question screen
    public void security(View view) {
        Intent i = new Intent(this,
                securityquestions.class);
        startActivity(i);
    }
    // sends you to home screen
    public void create(View view) {
        Intent i = new Intent(this,
                MainActivity.class);
        startActivity(i);
    }
}