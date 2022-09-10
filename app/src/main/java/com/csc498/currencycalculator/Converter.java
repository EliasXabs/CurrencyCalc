package com.csc498.currencycalculator;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class Converter extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_converter);
    }

    public void convertusdlbp(View view){

        TextView lbp_ele = (TextView) findViewById(R.id.results);
        EditText usd_ele = (EditText) findViewById(R.id.toConvert);

        float to_Convert = Float.parseFloat(usd_ele.getText().toString());
        float converted = to_Convert*40000;

        if (to_Convert < 250){
            lbp_ele.setTextSize(50);
        }
        else{
            lbp_ele.setTextSize(20);
        }
        lbp_ele.setText(Float.toString(converted));
    }
}