package com.example.passwordmanager;
import androidx.appcompat.app.AppCompatActivity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.LinearLayout;
import android.widget.TextView;

public class Generated extends AppCompatActivity {

    CheckBox cb1, cb2, cb3, cb4;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_generated);
        cb1 = findViewById(R.id.LOWERCASE);
        cb2 = findViewById(R.id.uppercase);
        cb3 = findViewById(R.id.numbers);
        cb4 = findViewById(R.id.special);
        }

    public void generate(View view) {
        boolean lower = false;
        boolean upper = false;
        boolean numbers = false;
        boolean special = false;
        EditText edUsername = (EditText)findViewById(R.id.username);
        String username = (String)edUsername.getText().toString();

        EditText edLength = (EditText)findViewById(R.id.length);
        String length = (String)edLength.getText().toString();

        if (cb1.isChecked()) {
            lower = true;
        }
        if (cb2.isChecked()) {
            upper = true;
        }
        if (cb3.isChecked()) {
            numbers = true;
        }
        if (cb3.isChecked()) {
            special = true;
        }
        PasswordGenerator password = new PasswordGenerator(username, Integer.parseInt(length), numbers, upper, lower, special);
        password.generatePassword();
        String generatedPassword = password.getPassword();

        TextView tv = (TextView) findViewById(R.id.password);
        tv.setText(generatedPassword);
    }

    // sends you to home screen
    public void Save(View view) {
        TextView tv = (TextView) findViewById(R.id.password);
        tv.setText("_______________________________________");
        LinearLayout linearLayout = (LinearLayout) findViewById(R.id.linlay);
        TextView txtV = new TextView(this);
        txtV.setText("password");
        linearLayout.addView(txtV);
        Intent i = new Intent(this,
                Passwords.class);
        startActivity(i);
    }

}




