package com.example.intentsproj;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.Gravity;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

public class FirstActivity extends AppCompatActivity {

    //initializing objects
    Button   BtnOk;
    TextView TextInput1;
    TextView TextInput2;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_first);

        //Buttons and texts assign by id
        BtnOk = findViewById(R.id.BtnOk);
        TextInput1 = findViewById(R.id.TextInput1);
        TextInput2 = findViewById(R.id.TextInput2);
    }


    @Override
    protected void onResume()
    {
        super.onResume();


        BtnOk.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {


                String Num1 = TextInput1.getText().toString();
                String Num2 = TextInput2.getText().toString();

                //Adding button onpress location
                Intent intent = new Intent(FirstActivity.this , SecondActivity.class);

                //passing value with the intent to the next page
                intent.putExtra("No1" , Num1);
                intent.putExtra("No2" , Num2);

                startActivity(intent);

                //Adding the Toast

                /*
                    toast.makeText(FirstActivity.this, "You just clicked the OK button...", Toast.LENGTH_SHORT).show();
                */

                Context context = getApplicationContext();
                CharSequence message = "You just clicked the OK button...";
                int duration = Toast.LENGTH_SHORT;
                Toast toast = Toast.makeText(context,message,duration);
                toast.show();
                toast.setGravity(Gravity.BOTTOM|Gravity.CENTER,0,0);

            }
        });



    }
}