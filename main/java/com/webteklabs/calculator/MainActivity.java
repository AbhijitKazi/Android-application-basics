package com.webteklabs.calculator;

import android.content.Intent;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import java.nio.file.OpenOption;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    EditText et1, et2;
    Button add, sub, div;
    TextView tv;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        et1 = (EditText) findViewById(R.id.et1);
        et2 = (EditText) findViewById(R.id.et2);
        add = (Button) findViewById(R.id.sum);
        sub = (Button) findViewById(R.id.sub);
        div = (Button) findViewById(R.id.div);
        tv = (TextView) findViewById(R.id.result);
        div.setOnClickListener(this);

        add.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                String value1 = et1.getText().toString();
                String value2 = et2.getText().toString();

                int a =   Integer.parseInt(value1);
                int b =   Integer.parseInt(value2);
                int c = a+b;

                tv.setText("The Sum is :"+c);



            }
        });

        sub.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {


                String value1 = et1.getText().toString();
                String value2 = et2.getText().toString();

                int a =   Integer.parseInt(value1);
                int b =   Integer.parseInt(value2);
                int c = a-b;

                tv.setText("The Sub is :"+c);


            }
        }) ;


    }

    public void  mul(View v)
    {


        String value1 = et1.getText().toString();
        String value2 = et2.getText().toString();

        int a =   Integer.parseInt(value1);
        int b =   Integer.parseInt(value2);
        int c = a*b;

        tv.setText("The Mul is :"+c);

    }

    @Override
    public void onClick(View view) {
        try {
            String value1 = et1.getText().toString();
            String value2 = et2.getText().toString();

            int a =   Integer.parseInt(value1);
            int b =   Integer.parseInt(value2);
            int c = a/b;

            tv.setText("The Div is :"+c);

        }
        catch (Exception ex)
        {
            tv.setText("Bhai 0 se Divide Na Kar...");

        }


    }
}

