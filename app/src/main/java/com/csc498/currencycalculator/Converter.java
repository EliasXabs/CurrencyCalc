package com.csc498.currencycalculator;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

import org.w3c.dom.Text;

public class Converter extends AppCompatActivity {

    boolean reversed = false;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_converter);
    }

    public void convertusdlbp(View view){

        TextView lbp_ele = (TextView) findViewById(R.id.results);
        EditText usd_ele = (EditText) findViewById(R.id.toConvert);

        long to_Convert = Long.parseLong(usd_ele.getText().toString());
        double converted;

        if(reversed){
            converted = to_Convert * 0.000025;
        }
        else{
            converted = to_Convert * 40000;
        }

        lbp_ele.setText(Long.toString((long) converted));
    }

    public void switchCurrencies(View view){

        TextView top_ele = (TextView) findViewById(R.id.topCurrency);
        TextView bottom_ele = (TextView) findViewById(R.id.bottomCurrency);
        TextView rate_ele = (TextView) findViewById(R.id.conversionRate);

        if (!reversed){

            rate_ele.setText("1 LBP = 0.000025 USD");
            top_ele.setText("LBP");
            bottom_ele.setText("USD");

            reversed = true;
        }
        else {

            rate_ele.setText("1 USD = 40000 LBP");
            top_ele.setText("USD");
            bottom_ele.setText("LBP");

            reversed = false;
        }
    }
}