package com.example.currencyconverter;

import androidx.appcompat.app.AppCompatActivity;
import android.widget.TextView;
import android.view.View;
import android.widget.Toast;


import android.os.Bundle;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

    }
    public void convert(View v){
        double money;
        TextView usd = findViewById(R.id.numberUSD);
        TextView lbp = findViewById(R.id.numberLBP);

        String usdText = usd.getText().toString();
        String lbpText = lbp.getText().toString();

        String message= "koosa";
        if(usdText.equals("")&& lbpText.equals("")){
            message = "error enter nb ya hmar";

        }else if(!usdText.equals("")){
            message = "converting to LBP";
            money = Double.parseDouble(usdText);
            money= money*22000;
            money = Math.round(money*100)/100;
            lbp.setText(""+money);
            usd.setText("");

        }else if(!lbpText.equals("")){
            message = "converting to USD";
            money = Double.parseDouble(lbpText);
            money= money/22000;
            money = Math.round(money*100)/100;
            usd.setText(""+money);
            lbp.setText("");

        }

        Toast t1 = Toast.makeText(getApplicationContext(), message, Toast.LENGTH_SHORT);
        t1.show();



    }

}