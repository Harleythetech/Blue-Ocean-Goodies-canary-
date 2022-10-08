package com.ict102a.rc01a.blueoceangoodiescanary;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.AppCompatButton;

import android.content.Intent;
import android.os.Bundle;

public class sidedish extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sidedish);
        AppCompatButton btn1 = findViewById(R.id.backbtn2);
        btn1.setOnClickListener(v -> goback());
        AppCompatButton btn6 = findViewById(R.id.mp1);
        btn6.setOnClickListener(v -> openfood1());
        AppCompatButton btn7 = findViewById(R.id.mp2);
        btn7.setOnClickListener(v -> openfood2());
    }
    public void openfood1(){
        Intent intent = new Intent(this, sidedish1.class);
        startActivity(intent);
    }
    public void goback(){
        Intent intent = new Intent(this, Home.class);
        startActivity(intent);
    }
    public void openfood2(){
        Intent intent = new Intent(this, sidedish2.class);
        startActivity(intent);
    }
}