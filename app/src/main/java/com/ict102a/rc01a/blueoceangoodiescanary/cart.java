package com.ict102a.rc01a.blueoceangoodiescanary;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.AppCompatButton;

import android.content.Intent;
import android.os.Bundle;

public class cart extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_cart);
        AppCompatButton btn1 = findViewById(R.id.backbtn4);
        btn1.setOnClickListener(v -> goback());
        AppCompatButton btn2 = findViewById(R.id.btn_buy);
        btn2.setOnClickListener(v -> buynow());
    }
    public void goback(){
        Intent intent = new Intent(this, Home.class);
        startActivity(intent);
    }
    public void buynow(){
        Intent intent = new Intent(this, buy_complete.class);
        startActivity(intent);
    }
}