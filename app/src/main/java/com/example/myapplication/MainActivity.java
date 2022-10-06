package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
         EditText num1 = findViewById(R.id.et_firstnumber);
         EditText num2 = findViewById(R.id.et_secondnumber);
         TextView sum = findViewById(R.id.tv_result);
         Button equal = findViewById(R.id.btn_result);

        equal.setOnClickListener(new View.OnClickListener() {
            @SuppressLint("SetTextI18n")
            @Override
            public void onClick(View v) {
                String N1 = num1.getText().toString();
                String N2 = num2.getText().toString();
                int n1 = Integer.parseInt(N1);
                int n2 = Integer.parseInt(N2);
               int  res = n1 + n2 ;

                sum.setText("Result : " + res);

                
            }
        });


    }
}