package com.ict102a.rc01a.blueoceangoodiescanary;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.AppCompatButton;

import android.content.Intent;
import android.os.Bundle;

public class Home extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);
        AppCompatButton btn1 = findViewById(R.id.mainbtn);
        btn1.setOnClickListener(v -> openmaindish());
        AppCompatButton btn2 = findViewById(R.id.sidebtn);
        btn2.setOnClickListener(v -> opensidedish());
        AppCompatButton btn3 = findViewById(R.id.dessertbtn);
        btn3.setOnClickListener(v -> opendesertdish());
        AppCompatButton btn4 = findViewById(R.id.drinksbtn);
        btn4.setOnClickListener(v -> opendrinksdish());
        AppCompatButton btn5 = findViewById(R.id.homereg);
        btn5.setOnClickListener(v -> openuserinfo());
        AppCompatButton btn6 = findViewById(R.id.homereg2);
        btn6.setOnClickListener(v -> opencart());
        AppCompatButton btn7 = findViewById(R.id.mp);
        btn7.setOnClickListener(v -> openfood1());
        AppCompatButton btn8 = findViewById(R.id.mp3);
        btn8.setOnClickListener(v -> openfood2());
    }
    public void openmaindish(){
        Intent intent = new Intent(this, maindish.class);
        startActivity(intent);
    }
    public void opensidedish(){
        Intent intent = new Intent(this, sidedish.class);
        startActivity(intent);
    }
    public void opendesertdish(){
        Intent intent = new Intent(this, desert.class);
        startActivity(intent);
    }
    public void opendrinksdish(){
        Intent intent = new Intent(this, drinks.class);
        startActivity(intent);
    }
    public void openuserinfo(){
        Intent intent = new Intent(this, user.class);
        startActivity(intent);
    }
    public void opencart(){
        Intent intent = new Intent(this, cart.class);
        startActivity(intent);
    }
    public void openfood1(){
        Intent intent = new Intent(this, mp1.class);
        startActivity(intent);
    }
    public void openfood2(){
        Intent intent = new Intent(this, mp2.class);
        startActivity(intent);
    }
}