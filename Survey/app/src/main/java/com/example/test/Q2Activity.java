package com.example.test;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.RadioButton;

public class Q2Activity extends AppCompatActivity {

    private RadioButton r21,r22,r23,r24,r25;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_q2);
    }
    public void next2 (View view){
        String result_string="";
        Intent intent=getIntent();
        result_string=intent.getExtras().getString("Q1result")+"\n"+"Q2:";
        r21=findViewById(R.id.q2rbtn1);
        r22=findViewById(R.id.q2rbtn2);
        r23=findViewById(R.id.q2rbtn3);
        r24=findViewById(R.id.q2rbtn4);
        r25=findViewById(R.id.q2rbtn5);
        if(r21.isChecked()){
            result_string+=r21.getText().toString();
        }
        if(r22.isChecked()){
            result_string+=r22.getText().toString();
        }
        if(r23.isChecked()){
            result_string+=r23.getText().toString();
        }
        if(r24.isChecked()){
            result_string+=r24.getText().toString();
        }
        if(r25.isChecked()){
            result_string+=r25.getText().toString();
        }
        intent = new Intent(this,Q3Activity.class);
        intent.putExtra("Q2result",result_string);
        startActivity(intent);
    }
}
