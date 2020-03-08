package com.example.test;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.RadioButton;

public class Q11Activity extends AppCompatActivity {

    private RadioButton r111,r112;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_q11);
    }
    public void next11(View view) {
        String result_string="";
        Intent intent=getIntent();
        result_string=intent.getExtras().getString("Q10result")+"\n"+"Q11:";
        r111=findViewById(R.id.q11rbtn1);
        r112=findViewById(R.id.q11rbtn2);
        if(r111.isChecked()){
            result_string+=r111.getText().toString();
        }
        if(r112.isChecked()){
            result_string+=r112.getText().toString();
        }
        intent = new Intent(this, Q12Activity.class);
        intent.putExtra("Q11result",result_string);
        startActivity(intent);
    }
}
