package com.ict102a.rc01a.blueoceangoodiescanary;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.AppCompatButton;

import android.content.Intent;
import android.os.Bundle;

import java.io.IOException;

import pl.droidsonroids.gif.GifDrawable;

public class buy_complete extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_buy_complete);
        AppCompatButton btn1 = findViewById(R.id.btn_shop);
        btn1.setOnClickListener(v -> goback());
    }
    public void goback(){
        Intent intent = new Intent(this, Home.class);
        startActivity(intent);
    }
}