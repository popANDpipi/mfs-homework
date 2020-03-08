package com.example.test;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.RadioButton;

public class Q1Activity extends AppCompatActivity {

    private RadioButton r11,r12,r13,r14,r15,r16,r17;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_q1);
    }
    public void next1 (View view){
        r11=findViewById(R.id.q1rbtn1);
        r12=findViewById(R.id.q1rbtn2);
        r13=findViewById(R.id.q1rbtn3);
        r14=findViewById(R.id.q1rbtn4);
        r15=findViewById(R.id.q1rbtn5);
        r16=findViewById(R.id.q1rbtn6);
        r17=findViewById(R.id.q1rbtn7);
        String result_string="Q1:";
        if(r11.isChecked()){
            result_string+=r11.getText().toString();
        }
        if(r12.isChecked()){
            result_string+=r12.getText().toString();
        }
        if(r13.isChecked()){
            result_string+=r13.getText().toString();
        }
        if(r14.isChecked()){
            result_string+=r14.getText().toString();
        }
        if(r15.isChecked()){
            result_string+=r15.getText().toString();
        }
        if(r16.isChecked()){
            result_string+=r16.getText().toString();
        }
        if(r17.isChecked()){
            result_string+=r17.getText().toString();
        }
        Intent intent = new Intent(this,Q2Activity.class);
        intent.putExtra("Q1result",result_string);
        startActivity(intent);
    }
}
