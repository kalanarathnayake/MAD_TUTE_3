package com.example.intentsproj;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class SecondActivity extends AppCompatActivity {

    //Initialize elements
    TextView TextInput4 , TextInput3 , txtAns;
    Button btnMinus , btnPlus , btnMulty , btnSub;

    // variables need for calculation
    float result;
    float num1 , num2 ;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);
        Log.i("Lifecycle" , "OnCreate called...");

        TextInput3 = (TextView)findViewById(R.id.TextInput3);
        TextInput4 = (TextView)findViewById(R.id.TextInput4);

        txtAns = (TextView)findViewById(R.id.txtAns);

        btnPlus =(Button) findViewById(R.id.btnPlus);
        btnMinus =(Button) findViewById(R.id.btnMinus);
        btnSub =(Button) findViewById(R.id.btnSub);
        btnMulty =(Button) findViewById(R.id.btnMulty);

    }

    @Override
    protected void onStart() {
        super.onStart();

        Log.i("Lifecycle" , "OnStart called...");

        TextInput3.setText(getIntent().getStringExtra("No1"));
        TextInput4.setText(getIntent().getStringExtra("No2"));

        //Assigning numbers
        num1 = Integer.parseInt(TextInput3.getText().toString());
        num2 = Integer.parseInt(TextInput4.getText().toString());

        //Minus Button Function
        btnMinus.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                result = num1 - num2;

                txtAns.setText(String.valueOf(num1) + " - " + String.valueOf(num2)+ " = " + String.valueOf(result));

            }
        });

        //Plus Button Function
        btnPlus.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                result = num1 + num2;

                txtAns.setText(String.valueOf(num1) + " + " + String.valueOf(num2) + " = " + String.valueOf(result));

            }
        });

        //Multiply Button Function
        btnMulty.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                result = num1 * num2;

                txtAns.setText(String.valueOf(num1) + " * " + String.valueOf(num2) + " = " + String.valueOf(result));

            }
        });

        //Subtract Button Function
        btnSub.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                result = num1 / num2;

                txtAns.setText(String.valueOf(num1) + " / " + String.valueOf(num2) + " = " + String.valueOf(result));

            }
        });
    }

    @Override
    protected void onResume() {
        super.onResume();
        Log.i("Lifecycle" , "OnResume called...");




    }

    @Override
    protected void onPause() {
        super.onPause();

        Log.i("Lifecycle" , "OnPause called...");

    }

    @Override
    protected void onStop() {
        super.onStop();

        Log.i("Lifecycle" , "OnStop called...");

    }

    @Override
    protected void onDestroy() {
        super.onDestroy();

        Log.i("Lifecycle" , "OnDestroy called...");
    }
}