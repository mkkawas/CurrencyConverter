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
        TextView usd = findViewById(R.id.numberUSD);
        TextView lbp = findViewById(R.id.numberLBP);

        String usdText = usd.getText().toString();
        String lbpText = lbp.getText().toString();

        String message= "koosa";
        if(usdText.equals("")&& lbpText.equals("")){
            message = "error enter nb ya hmar";

        }

    }

}