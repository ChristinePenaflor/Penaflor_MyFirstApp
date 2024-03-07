package com.example.penaflor1stapp;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
TextView name;
TextView MyName;
TextView Number;
TextView MyNumber;
TextView Email;
TextView MyEmail;
TextView Display;
Button MyButton;
Button MyClear;
EditText myinputname;
TextView mytitle;




    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        name = (TextView) findViewById(R.id.txtName);
        Number = (TextView) findViewById(R.id.txtNumber);
        MyNumber = (TextView) findViewById(R.id.txtMyNumber);
        Email = (TextView) findViewById(R.id.txtEmail);
        MyEmail = (TextView) findViewById(R.id.txtMyEmail);
        Display = (TextView) findViewById(R.id.txtDisplay);
        MyButton = (Button) findViewById(R.id.btnClick);
        MyClear = (Button) findViewById(R.id.btnClear);
        myinputname = (EditText) findViewById(R.id.txtMyinputname);
        mytitle = (TextView) findViewById(R.id.txtMytitle);


        //Display.setText("Hello Luz!");

        MyButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String myValue = myinputname.getText().toString();
                Display.setText("Hello" + myValue + "!");
            }
        });
        MyClear.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Display.setText("Hello!");
            }
        });
    }
}