package com.ict102a.rc01a.blueoceangoodiescanary;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.AppCompatButton;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Toast;

public class sidedish2 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sidedish2);
        AppCompatButton btn1 = findViewById(R.id.backbtn);
        btn1.setOnClickListener(v -> goback());
        AppCompatButton btn2 = findViewById(R.id.homereg3);
        btn2.setOnClickListener(v -> gotocart());
        AppCompatButton btn3 = findViewById(R.id.store);
        btn3.setOnClickListener(v -> visitstore());
        AppCompatButton btn4 = findViewById(R.id.adc);
        btn4.setOnClickListener(v -> addtocart());
        AppCompatButton btn5 = findViewById(R.id.Buy);
        btn5.setOnClickListener(v -> buynow());
    }
    public void goback(){
        Intent intent = new Intent(this, sidedish.class);
        startActivity(intent);
    }
    public void gotocart(){
        Intent intent = new Intent(this, cart.class);
        startActivity(intent);
    }
    public void visitstore(){
        Toast.makeText(getApplicationContext(), "Not Implemented Yet.", Toast.LENGTH_SHORT).show();
    }
    public void addtocart(){
        Toast.makeText(getApplicationContext(), "Successfully added to cart", Toast.LENGTH_SHORT).show();
    }
    public void buynow(){
        Intent intent = new Intent(this, buy_complete.class);
        startActivity(intent);
    }
}