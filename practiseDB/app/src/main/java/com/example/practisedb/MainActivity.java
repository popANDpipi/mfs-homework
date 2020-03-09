package com.example.practisedb;

import androidx.appcompat.app.AppCompatActivity;

import android.content.ContentValues;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {
    private EditText etname;
    private EditText etemail;
    private EditText etphone;
    private Button btnadd;
    private Button btndel;
    private Button btnupd;
    private Button btnsel;
    private TextView tvshow;
    MyHelper myhelper;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        etname=findViewById(R.id.etname);
        etemail=findViewById(R.id.etemail);
        etphone=findViewById(R.id.etphone);
        btnadd=findViewById(R.id.btnadd);
        btnsel=findViewById(R.id.btnsel);
        btnupd=findViewById(R.id.btnupd);
        btndel=findViewById(R.id.btndel);
        tvshow=findViewById(R.id.tvshow);
        myhelper=new MyHelper(this);
        btnadd.setOnClickListener(this);
        btnsel.setOnClickListener(this);
        btnupd.setOnClickListener(this);
        btndel.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        String name;
        String email;
        String phone;
        SQLiteDatabase db;
        ContentValues values;
        switch(v.getId()){
            case R.id.btnadd:
                if(btnadd.getText()==""){
                    Toast.makeText(this,"Don't be empty",Toast.LENGTH_SHORT).show();
                }
                name=etname.getText().toString();
                email=etemail.getText().toString();
                phone=etphone.getText().toString();
                db=myhelper.getWritableDatabase();
                values=new ContentValues();
                values.put("name",name);
                values.put("email",email);
                values.put("phone",phone);
                db.insert("info",null,values);
                Toast.makeText(this,"write success",Toast.LENGTH_SHORT).show();
                db.close();
                break;
            case R.id.btnsel:
                db=myhelper.getWritableDatabase();
                Cursor cursor=db.query("info",null,null,null,null,null,null,null);
                if(cursor.getCount()==0){
                    Toast.makeText(this,"no data",Toast.LENGTH_SHORT).show();
                }
                else{
                    cursor.moveToFirst();
                    tvshow.setText("Name:"+cursor.getString(1)+" Email:"+cursor.getString(2)+" Phone:"+cursor.getString(3));
                }
                while(cursor.moveToNext()){
                    tvshow.append("\n"+"Name:"+cursor.getString(1)+" Email:"+cursor.getString(2)+" Phone:"+cursor.getString(3));
                }
                cursor.close();
                db.close();
                Toast.makeText(this,"read success",Toast.LENGTH_SHORT).show();
                break;
            case R.id.btnupd:
                db=myhelper.getWritableDatabase();
                db=myhelper.getWritableDatabase();
                values=new ContentValues();
                values.put("email",etemail.getText().toString());
                values.put("phone",etphone.getText().toString());
                db.update("info",values,"name=?",new String[] {etname.getText().toString()});
                Toast.makeText(this,"update success",Toast.LENGTH_SHORT).show();
                db.close();
                break;
            case R.id.btndel:
                db=myhelper.getWritableDatabase();
                db.delete("info",null,null);
                Toast.makeText(this,"remove success",Toast.LENGTH_SHORT).show();
                db.close();
                tvshow.setText("---no records---");
                break;
        }
    }
}
