package com.example.drivago_mad;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class TestActivity extends AppCompatActivity {
    EditText et1,et2;
    TextView tvadd;
    Button Add;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_test);

        et1.findViewById(R.id.add1);
        et2.findViewById(R.id.add2);
        tvadd.findViewById(R.id.tv_ans);
        Add.findViewById(R.id.add);

    }
    public void addnum(View view){
        int a,b,result;
        a=Integer.parseInt(et1.getText().toString());
        b=Integer.parseInt(et2.getText().toString());
        result=a+b;
        tvadd.setText(String.valueOf(result));
    }
    }
