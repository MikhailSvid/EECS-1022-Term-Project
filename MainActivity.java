package com.example.project;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
    // sends you to RestoreAccount1 screen
    public void Restore(View view) {
        Intent i = new Intent(this,
                RestoreAccount1.class);
        startActivity(i);
    }
    // sends you to password screen
    public void Login(View view) {
        Intent i = new Intent(this,
                Passwords.class);
        startActivity(i);
    }
    // sends you to Createaccount screen
    public void Create(View view) {
        Intent i = new Intent(this,
                CreateAccount.class);
        startActivity(i);
    }
}