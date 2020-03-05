package com.example.mrpotato;


import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.CheckBox;
import android.widget.CompoundButton;
import android.widget.ImageView;

public class MainActivity extends AppCompatActivity implements CompoundButton.OnCheckedChangeListener{
    private CheckBox cb1,cb2,cb3,cb4,cb5,cb6,cb7,cb8,cb9,cb10,cb11,cb12;
    private ImageView i1,i2,i3,i4,i5,i6,i7,i8,i9,i10,i11,i12;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        i1=findViewById(R.id.Pic_arms);
        i2=findViewById(R.id.Pic_body);
        i3=findViewById(R.id.Pic_ears);
        i4=findViewById(R.id.Pic_eyebrows);
        i5=findViewById(R.id.Pic_eyes);
        i6=findViewById(R.id.Pic_glasses);
        i7=findViewById(R.id.Pic_hat);
        i8=findViewById(R.id.Pic_mouth);
        i9=findViewById(R.id.Pic_mustache);
        i10=findViewById(R.id.Pic_nose);
        i11=findViewById(R.id.Pic_shoes);
        i12=findViewById(R.id.Pic_mr);

        cb1=findViewById(R.id.arms);
        cb1.setOnCheckedChangeListener(this);
        cb2=findViewById(R.id.body);
        cb2.setOnCheckedChangeListener(this);
        cb3=findViewById(R.id.ears);
        cb3.setOnCheckedChangeListener(this);
        cb4=findViewById(R.id.eyebrows);
        cb4.setOnCheckedChangeListener(this);
        cb5=findViewById(R.id.eyes);
        cb5.setOnCheckedChangeListener(this);
        cb6=findViewById(R.id.glasses);
        cb6.setOnCheckedChangeListener(this);
        cb7=findViewById(R.id.hat);
        cb7.setOnCheckedChangeListener(this);
        cb8=findViewById(R.id.mouth);
        cb8.setOnCheckedChangeListener(this);
        cb9=findViewById(R.id.mustache);
        cb9.setOnCheckedChangeListener(this);
        cb10=findViewById(R.id.nose);
        cb10.setOnCheckedChangeListener(this);
        cb11=findViewById(R.id.shoes);
        cb11.setOnCheckedChangeListener(this);
        cb12=findViewById(R.id.mr);
        cb12.setOnCheckedChangeListener(this);

    }
    public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
        /*
        buttonView代表被点击控件的本身，isChecked代表状态
         */

        if (cb1.isChecked()) {
            i1.setVisibility(View.VISIBLE);
        } else {
            i1.setVisibility(View.INVISIBLE);
        }

        if (cb2.isChecked()) {
            i2.setVisibility(View.VISIBLE);
        } else {
            i2.setVisibility(View.INVISIBLE);
        }

        if (cb3.isChecked()) {
            i3.setVisibility(View.VISIBLE);
        } else {
            i3.setVisibility(View.INVISIBLE);
        }

        if (cb4.isChecked()) {
            i4.setVisibility(View.VISIBLE);
        } else {
            i4.setVisibility(View.INVISIBLE);
        }

        if (cb5.isChecked()) {
            i5.setVisibility(View.VISIBLE);
        } else {
            i5.setVisibility(View.INVISIBLE);
        }

        if (cb6.isChecked()) {
            i6.setVisibility(View.VISIBLE);
        } else {
            i6.setVisibility(View.INVISIBLE);
        }

        if (cb7.isChecked()) {
            i7.setVisibility(View.VISIBLE);
        } else {
            i7.setVisibility(View.INVISIBLE);
        }

        if (cb8.isChecked()) {
            i8.setVisibility(View.VISIBLE);
        } else {
            i8.setVisibility(View.INVISIBLE);
        }

        if (cb9.isChecked()) {
            i9.setVisibility(View.VISIBLE);
        } else {
            i9.setVisibility(View.INVISIBLE);
        }

        if (cb10.isChecked()) {
            i10.setVisibility(View.VISIBLE);
        } else {
            i10.setVisibility(View.INVISIBLE);
        }

        if (cb11.isChecked()) {
            i11.setVisibility(View.VISIBLE);
        } else {
            i11.setVisibility(View.INVISIBLE);
        }

        if (cb12.isChecked()) {
            i12.setVisibility(View.VISIBLE);
        } else {
            i12.setVisibility(View.INVISIBLE);
        }
    }
}
