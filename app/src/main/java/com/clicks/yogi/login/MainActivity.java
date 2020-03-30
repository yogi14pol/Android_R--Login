package com.clicks.yogi.login;

import androidx.appcompat.app.AppCompatActivity;

import android.graphics.Color;
import android.os.Bundle;
import android.view.Gravity;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.RelativeLayout;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    EditText email,password;
    Button login;
    String mail,pass;
    RelativeLayout rel;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

    email = findViewById(R.id.email);
    password = findViewById(R.id.password);
    login = findViewById(R.id.login);
    rel = findViewById(R.id.rel);

    login.setOnClickListener(new View.OnClickListener() {
        @Override
        public void onClick(View v) {

            mail = email.getText().toString();
            pass = password.getText().toString();
            rel.setBackgroundColor(Color.GREEN);
            if (mail.isEmpty() || pass.isEmpty()){
                rel.setBackgroundColor(Color.WHITE);
                Toast toast = Toast.makeText(MainActivity.this, "Please enter email and password", Toast.LENGTH_SHORT);
                toast.setGravity(Gravity.CENTER,0,0);
                toast.show();
            } else if (mail.equals("abc@gmail.com") && pass.equals("hello")){
                email.setText("");
                password.setText("");
                rel.setBackgroundColor(Color.GREEN);
                Toast toast = Toast.makeText(MainActivity.this, "Login done successfully", Toast.LENGTH_SHORT);
                toast.setGravity(Gravity.CENTER,0,0);
                toast.show();
            }else{
                rel.setBackgroundColor(Color.RED);
                Toast toast = Toast.makeText(MainActivity.this, "Email or Password is wrong...", Toast.LENGTH_SHORT);
                toast.setGravity(Gravity.CENTER,0,0);
                toast.show();
            }
        }
    });

    }
}