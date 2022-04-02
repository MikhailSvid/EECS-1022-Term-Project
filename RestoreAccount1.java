package com.example.project;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class RestoreAccount1 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_restore_account1);
    }

    // sends you to restore2 screen
    public void restore(View view) {
        Intent i = new Intent(this,
                RestoreAccount2.class);
        startActivity(i);
    }
}