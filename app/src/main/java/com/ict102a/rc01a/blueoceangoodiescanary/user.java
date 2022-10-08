package com.ict102a.rc01a.blueoceangoodiescanary;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.AppCompatButton;

import android.content.Intent;
import android.os.Bundle;

public class user extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_user);
        AppCompatButton btn1 = findViewById(R.id.backbtn3);
        btn1.setOnClickListener(v -> goback());
        AppCompatButton btn2 = findViewById(R.id.btn_logout);
        btn2.setOnClickListener(v -> logout());
    }
    public void goback(){
        Intent intent = new Intent(this, Home.class);
        startActivity(intent);
    }
    public void logout(){
        Intent intent = new Intent(this, MainActivity.class);
        startActivity(intent);
    }
}