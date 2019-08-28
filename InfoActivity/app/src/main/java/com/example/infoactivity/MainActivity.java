package com.example.infoactivity;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void sendInfo(View n){

        EditText myName = (EditText) findViewById(R.id.nameET);
        EditText myAge = (EditText) findViewById(R.id.ageET);

        String myNameStr = myName.getText().toString();
        String myAgeStr = myAge.getText().toString();

        Intent intent = new Intent(this,infoActivity.class);

        intent.putExtra(infoActivity.MY_NAME, myNameStr);
        intent.putExtra(infoActivity.MY_AGE, myAgeStr);

        startActivity(intent);

    }

    public void shareInfo(View v){

        EditText myName = (EditText) findViewById(R.id.nameET);
        EditText myAge = (EditText) findViewById(R.id.ageET);

        String myNameStr = myName.getText().toString();
        String myAgeStr = myAge.getText().toString();

        String myMessage = "My Name is " + myName + " and I am " + myAge + " years old.";

        Intent intent = new Intent(Intent.ACTION_SEND);
        intent.setType("text/plain");
        intent.putExtra(Intent.EXTRA_TEXT, myMessage);
        String chooserTitle = getString(R.string.chooser);
        Intent chosenIntent = Intent.createChooser(intent,chooserTitle);
        startActivity(chosenIntent);

    }
}
