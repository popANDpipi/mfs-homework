package com.example.test;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class ResultActivity extends AppCompatActivity {
    private TextView result;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_result);
        Intent intent = getIntent();
        String result_string=intent.getExtras().getString("Q12result");
        result=findViewById(R.id.txt1);
        result_string=result.getText()+result_string;
        result.setText(result_string);
    }
    public void next_fin(View view) {
        Intent intent = new Intent(this, FinishActivity.class);
        startActivity(intent);
    }
}
