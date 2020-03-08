package com.example.test;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.RadioButton;

public class Q8Activity extends AppCompatActivity {

    private RadioButton r81,r82,r83,r84,r85,r86,r87;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_q8);
    }
    public void next8 (View view){
        String result_string="";
        Intent intent=getIntent();
        result_string=intent.getExtras().getString("Q7result")+"\n"+"Q8:";
        r81=findViewById(R.id.q8rbtn1);
        r82=findViewById(R.id.q8rbtn2);
        r83=findViewById(R.id.q8rbtn3);
        r84=findViewById(R.id.q8rbtn4);
        r85=findViewById(R.id.q8rbtn5);
        r86=findViewById(R.id.q8rbtn6);
        r87=findViewById(R.id.q8rbtn7);
        if(r81.isChecked()){
            result_string+=r81.getText().toString();
        }
        if(r82.isChecked()){
            result_string+=r82.getText().toString();
        }
        if(r83.isChecked()){
            result_string+=r83.getText().toString();
        }
        if(r84.isChecked()){
            result_string+=r84.getText().toString();
        }
        if(r85.isChecked()){
            result_string+=r85.getText().toString();
        }
        if(r86.isChecked()){
            result_string+=r86.getText().toString();
        }
        if(r87.isChecked()){
            result_string+=r87.getText().toString();
        }
        intent = new Intent(this,Q9Activity.class);
        intent.putExtra("Q8result",result_string);
        startActivity(intent);
    }
}
