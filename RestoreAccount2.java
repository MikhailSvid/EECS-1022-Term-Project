package com.example.project;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class RestoreAccount2 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_restore_account2);
    }

    // sends you to home screen
    public void save(View view) {
        Intent i = new Intent(this,
                MainActivity.class);
        startActivity(i);
    }
}