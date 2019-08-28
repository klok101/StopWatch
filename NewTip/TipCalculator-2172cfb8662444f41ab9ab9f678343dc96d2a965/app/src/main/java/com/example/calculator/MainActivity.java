package com.example.calculator;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import java.text.DecimalFormat;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void add(View v){

        EditText num1EditText = (EditText) findViewById(R.id.num1EditText);
        EditText num2EditText = (EditText) findViewById(R.id.num2EditText);
        TextView ansTextView = (TextView)findViewById(R.id.ansTextView);
        TextView ansTextView2 = (TextView)findViewById(R.id.ansTextView2);

        try {

            double num1 = Integer.parseInt(num1EditText.getText().toString());
            double num2 = Integer.parseInt(num2EditText.getText().toString());

            DecimalFormat df = new DecimalFormat("###########################.##");


            double tip = num2 / 100;

            tip = tip * num1;

            double total = num1 + tip;

            ansTextView.setText("Tip: $" + df.format(tip));
            ansTextView2.setText("Total: $" + df.format(total));

        }
        catch(Exception n){

            Toast.makeText(getApplicationContext(),"Fill in all fields properly",Toast.LENGTH_SHORT).show();

        }

    }

    public void output1(View v){

        EditText num1EditText = (EditText) findViewById(R.id.num1EditText);
        EditText num2EditText = (EditText) findViewById(R.id.num2EditText);
        TextView ansTextView = (TextView)findViewById(R.id.ansTextView);
        double num1;

        try {
            num1 = Integer.parseInt(num1EditText.getText().toString());

            double tip = 20/100;

            tip = tip * num1;

            double total = num1 + tip;


            num2EditText.setText("20");
        }
        catch(Exception n){
            Toast.makeText(getApplicationContext(),"Reminder to fill in the bill cost",Toast.LENGTH_SHORT).show();
        }

    }

    public void output2(View v){

        EditText num1EditText = (EditText) findViewById(R.id.num1EditText);
        EditText num2EditText = (EditText) findViewById(R.id.num2EditText);
        TextView ansTextView = (TextView)findViewById(R.id.ansTextView);
        double num1;

        try {
            num1 = Integer.parseInt(num1EditText.getText().toString());

            double tip = 15/100;

            tip = tip * num1;

            double total = num1 + tip;


            num2EditText.setText("15");
        }
        catch(Exception n){
            Toast.makeText(getApplicationContext(),"Reminder to fill in the bill cost",Toast.LENGTH_SHORT).show();
        }

    }

    public void output3(View v){

        EditText num1EditText = (EditText) findViewById(R.id.num1EditText);
        EditText num2EditText = (EditText) findViewById(R.id.num2EditText);
        TextView ansTextView = (TextView)findViewById(R.id.ansTextView);
        double num1;

        try {
            num1 = Integer.parseInt(num1EditText.getText().toString());

            double tip = 10/100;

            tip = tip * num1;

            double total = num1 + tip;


            num2EditText.setText("10");
        }
        catch(Exception n){
            Toast.makeText(getApplicationContext(),"Reminder to fill in the bill cost",Toast.LENGTH_SHORT).show();
        }

    }

    public void output4(View v){

        EditText num1EditText = (EditText) findViewById(R.id.num1EditText);
        EditText num2EditText = (EditText) findViewById(R.id.num2EditText);
        TextView ansTextView = (TextView)findViewById(R.id.ansTextView);
        double num1;

        try {
            num1 = Integer.parseInt(num1EditText.getText().toString());

            double tip = 5/100;

            tip = tip * num1;

            double total = num1 + tip;


            num2EditText.setText("5");
        }
        catch(Exception n){
            Toast.makeText(getApplicationContext(),"Reminder to fill in the bill cost",Toast.LENGTH_SHORT).show();
        }

    }



}
