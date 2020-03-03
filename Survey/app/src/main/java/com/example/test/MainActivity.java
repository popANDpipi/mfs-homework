package com.example.test;
import android.os.Bundle;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.RadioButton;
import android.view.*;
import android.content.Intent;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {
    private CheckBox c0;
    private Button b0;
    private RadioButton r11,r12,r13,r14,r15,r16,r17;
    private RadioButton r21,r22,r23,r24,r25;
    private RadioButton r31,r32,r33,r34;
    private CheckBox c41,c42,c43,c44,c45,c46,c47;
    private CheckBox c51,c52,c53,c54,c55,c56,c57;
    private EditText e61;
    private RadioButton r71,r72,r73,r74,r75;
    private RadioButton r81,r82,r83,r84,r85,r86,r87;
    private RadioButton r91,r92,r93,r94;
    private RadioButton r101,r102,r103,r104;
    private RadioButton r111,r112;
    private RadioButton r121,r122,r123,r124;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.welcome);
        /*
        c0=findViewById(R.id.checkBox1);
        r11=findViewById(R.id.q1rbtn1);
        r12=findViewById(R.id.q1rbtn2);
        r13=findViewById(R.id.q1rbtn3);
        r14=findViewById(R.id.q1rbtn4);
        r15=findViewById(R.id.q1rbtn5);
        r16=findViewById(R.id.q1rbtn6);
        r17=findViewById(R.id.q1rbtn7);

         */
    }
    public void start (View view){
        Intent intent = new Intent(this,Q1Activity.class);
        startActivity(intent);
    }
}
