package com.ict102a.rc01a.blueoceangoodiescanary;
import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;
import android.widget.Toast;
import com.google.android.material.textfield.TextInputEditText;
import java.util.Objects;
import java.util.Random;
import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.AppCompatButton;

import android.os.Bundle;

public class capmain extends AppCompatActivity {
    //Identifier -- Identifies what type that thing is.
    TextView ccode;
    TextInputEditText inputnum;
    AppCompatButton btn_verify;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_capmain);
        FindViews();
        Coderunner();
        //EventHandler() is Handled by btn_verify (it will act as the verification button)
        btn_verify.setOnClickListener(view -> Eventhandler());
    }
    public void FindViews() {
        ccode = findViewById(R.id.textView3);
        inputnum = findViewById(R.id.inputnum);
        btn_verify = findViewById(R.id.btn_verify);
    }
    public String getRandomString(int size) {
        final String RandChars = "1234567890qwertyuiopasdfghjklzxcvbnmQWERTYUIOPASDFGHJKLZXCVBNM";
        Random rand = new Random();
        StringBuilder ret = new StringBuilder();
        for (int i = 0; i < size; ++i) {
            ret.append(RandChars.charAt(rand.nextInt(RandChars.length())));
        }
        return ret.toString();
    }
    //Evenhandler() is only Triggered when btn_verify is pressed
    public void Eventhandler() {
            /*This took me a while till i realize the {if else} thing here is similar to the second
            project i made which is [3Q] Activity Coding 02
            */
        // This time it requires Objects.requireNonNull to prevent it from crashing.
        if (ccode.getText().toString().equals(Objects.requireNonNull(inputnum.getText()).toString())){
            Toast.makeText(getApplicationContext(), "Welcome to Blue Ocean Goodies!", Toast.LENGTH_SHORT).show();
            Intent intent = new Intent(this, Home.class);
            startActivity(intent);
        }
        else{
                /*
                Added Code.setText here so that when the entered code is incorrect it will
                automatically generate another Code for the user to type.
                 */
            ccode.setText(getRandomString(7));
            Toast.makeText(getApplicationContext(), "Incorrect Code! Try again", Toast.LENGTH_SHORT).show();
        }
    }
    //Added Coderunner() to Automate Code Generation on App Startup.
    public void Coderunner(){
        Toast.makeText(getApplicationContext(), "Are you a Robot? If not please answer.", Toast.LENGTH_LONG).show();
        ccode.setText(getRandomString(7));
    }
}