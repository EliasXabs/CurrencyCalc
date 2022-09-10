package com.csc498.currencycalculator;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class LogIn extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);
    }

    public void login(View view){

        EditText user_name = (EditText) findViewById(R.id.Userinput);
        EditText password = (EditText) findViewById(R.id.Passinput);

        if (user_name.getText().toString().equals("user.leb")
                && password.getText().toString().equals("123456")){
            Toast.makeText(getApplicationContext(), "Logged in", Toast.LENGTH_LONG).show();
            Intent converter = new Intent(this, Converter.class);
            startActivity(converter);
        }
        else{
            TextView error = (TextView) findViewById(R.id.Wrongcreds);
            error.setVisibility(View.VISIBLE);
        }
    }
}