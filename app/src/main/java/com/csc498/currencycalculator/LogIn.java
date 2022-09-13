package com.csc498.currencycalculator;

import androidx.appcompat.app.AppCompatActivity;
import androidx.constraintlayout.widget.ConstraintLayout;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

public class LogIn extends AppCompatActivity {

    boolean darkmode = true;

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

    public void switchTheme(View view){

        ImageView theme = (ImageView) findViewById(R.id.theme);
        ConstraintLayout page = (ConstraintLayout) findViewById(R.id.page);
        EditText user_name = (EditText) findViewById(R.id.Userinput);
        EditText password = (EditText) findViewById(R.id.Passinput);

        if (darkmode){
            theme.setImageResource(R.drawable.lightmode_nobg);
            page.setBackgroundColor(getResources().getColor(R.color.bg_Light));
            user_name.setTextColor(getResources().getColor(R.color.black));
            password.setTextColor(getResources().getColor(R.color.black));

            darkmode = false;
        }
        else{
         theme.setImageResource(R.drawable.darkmode_nobg);
         page.setBackgroundColor(getResources().getColor(R.color.bg_Dark));
         user_name.setTextColor(getResources().getColor(R.color.white));
         password.setTextColor(getResources().getColor(R.color.white));

         darkmode = true;
        }
    }
}