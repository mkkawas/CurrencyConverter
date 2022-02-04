package com.example.currencyconverter;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

public class MainActivity extends AppCompatActivity {
    int operator =0;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

    }
    public void adder() {
        operator++;

    }
    public void Swich(){
        TextView t1 = (TextView)findViewById(t1);
        if(operator%2 == 0){
            t1.setText("Dollar to LBP");
        }else {
            t1.setText("LBP to Dollar");
        }
    }
}