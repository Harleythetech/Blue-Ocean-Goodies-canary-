package com.ict102a.rc01a.blueoceangoodiescanary;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.AppCompatButton;

import com.google.android.material.textfield.TextInputEditText;

import java.util.Objects;

public class MainActivity extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        TextInputEditText user = findViewById(R.id.inputnum);
        TextInputEditText pass = findViewById(R.id.inputnum2);
        AppCompatButton btn1 = findViewById(R.id.homereg);
        btn1.setOnClickListener(v -> openMainActivity2());
        AppCompatButton btn2 = findViewById(R.id.homelogin);
        btn2.setOnClickListener(view -> {
            String stxt1 = user.getText().toString();
            String stxt2 = pass.getText().toString();

            if (stxt1.equals("Harleyyyu@htthq.com") && stxt2.equals("ICT102A")) {
                Intent intent = new Intent(this, capmain.class);
                startActivity(intent);
            } else if (stxt1.equals("") || stxt2.equals("")) {
                Toast.makeText(this, "Enter both Name and Password", Toast.LENGTH_SHORT).show();
            } else {
                Toast.makeText(this, "Wrong Username and Password Entered", Toast.LENGTH_SHORT).show();
            }

        });
    }
    public void openMainActivity2(){
        Intent intent = new Intent(this, newuser.class);
        startActivity(intent);
    }
}