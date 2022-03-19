package com.example.project;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class securityquestions extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_securityquestions);
    }
    // sends you to CreateAccount screen
    public void save(View view) {
        Intent i = new Intent(this,
                CreateAccount.class);
        startActivity(i);
    }
}