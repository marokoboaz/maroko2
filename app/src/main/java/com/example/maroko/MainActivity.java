package com.example.maroko;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


    }

    public void MySeccondButton(View view) {
        //writing variables

        EditText MyFirstEditText = (EditText) findViewById(R.id.MyFirstEditText);
        EditText MyEditText = (EditText) findViewById(R.id.MyEditText);
        TextView MyFirstTextView = (TextView) findViewById(R.id.MyFirstTextView);

        //coverting val;ue



        double number = Double.parseDouble(MyFirstEditText.getText().toString());
        double numbertwo = Double.parseDouble(MyEditText.getText().toString());


        // add value

        double results = number +numbertwo;

        //setting the display text

        MyFirstTextView.setText(results + "");

    }


    public void TheButtonTwo(View view) {
        //writing variables

        EditText MyFirstEditText = (EditText) findViewById(R.id.MyFirstEditText);
        EditText MyEditText = (EditText) findViewById(R.id.MyEditText);
        TextView MyFirstTextView = (TextView) findViewById(R.id.MyFirstTextView);

        //coverting val;ue

        double number = Double.parseDouble(MyFirstEditText.getText().toString());
        double numbertwo = Double.parseDouble(MyEditText.getText().toString());

      double results = numbertwo - number;

        //setting the display text

        MyFirstTextView.setText(results + "");


    }






    public void MyButtonSix(View view) {
        //writing variables

        EditText MyFirstEditText = (EditText) findViewById(R.id.MyFirstEditText);
        EditText MyEditText = (EditText) findViewById(R.id.MyEditText);
        TextView MyFirstTextView = (TextView) findViewById(R.id.MyFirstTextView);

        //coverting val;ue

        double number = Double.parseDouble(MyFirstEditText.getText().toString());
        double numbertwo = Double.parseDouble(MyEditText.getText().toString());

        double results = numbertwo / number;

        //setting the display text

        MyFirstTextView.setText(results + "");


}


    public void MyButtonSeven(View view) {
        //writing variables

        EditText MyFirstEditText = (EditText) findViewById(R.id.MyFirstEditText);
        EditText MyEditText = (EditText) findViewById(R.id.MyEditText);
        TextView MyFirstTextView = (TextView) findViewById(R.id.MyFirstTextView);

        //coverting val;ue

        double number = Double.parseDouble(MyFirstEditText.getText().toString());
        double numbertwo = Double.parseDouble(MyEditText.getText().toString());


        // add value

        double results = number*numbertwo;

        //setting the display text

        MyFirstTextView.setText(results + "");


    }

    }
