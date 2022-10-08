package com.ict102a.rc01a.blueoceangoodiescanary;

import android.content.Intent;
import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.AppCompatButton;

public class newuser extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_newuser);
        AppCompatButton btn = findViewById(R.id.btn_register);
        btn.setOnClickListener(v -> opencapmain());
    }
    public void opencapmain(){
        Intent intent = new Intent(this, capmain.class);
        startActivity(intent);
    }
}