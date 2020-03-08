package com.example.test;
import android.content.res.AssetManager;
import android.graphics.Color;
import android.os.Bundle;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.LinearLayout;
import android.widget.RadioButton;
import android.view.*;
import android.content.Intent;
import android.widget.RelativeLayout;
import android.widget.TextView;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.io.StringWriter;

public class MainActivity extends AppCompatActivity {
    private CheckBox c0;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        c0=findViewById(R.id.checkBox1);
        super.onCreate(savedInstanceState);
        //setContentView(R.layout.welcome);
        //布局
        LinearLayout.LayoutParams params = new LinearLayout.LayoutParams(LinearLayout.LayoutParams.MATCH_PARENT, LinearLayout.LayoutParams.MATCH_PARENT);
        LinearLayout lineLayout = new LinearLayout(this);
        lineLayout.setOrientation(LinearLayout.VERTICAL);
        lineLayout.setLayoutParams(params);
        lineLayout.setGravity(Gravity.TOP );


        String result = getJson("Questions.txt");
        String print="";
        try {
            JSONObject json = new JSONObject(result);
            String Result="";

            String id=json.getJSONObject("survey").getString("id");
            String len=json.getJSONObject("survey").getString("len");
            String questions=json.getJSONObject("survey").getString("questions");
            String type=json.getJSONObject("survey").getJSONArray("questions").getJSONObject(0).getString("type");
            String question=json.getJSONObject("survey").getJSONArray("questions").getJSONObject(0).getString("question");
            String options=json.getJSONObject("survey").getJSONArray("questions").getJSONObject(0).getString("options");
            String no1=json.getJSONObject("survey").getJSONArray("questions").getJSONObject(0).getJSONArray("options").getJSONObject(0).getString("1");
            String no2=json.getJSONObject("survey").getJSONArray("questions").getJSONObject(0).getJSONArray("options").getJSONObject(1).getString("2");
            String type2=json.getJSONObject("survey").getJSONArray("questions").getJSONObject(1).getString("type");
            String question2=json.getJSONObject("survey").getJSONArray("questions").getJSONObject(1).getString("question");
            String options2=json.getJSONObject("survey").getJSONArray("questions").getJSONObject(1).getString("options");
            String no1_2=json.getJSONObject("survey").getJSONArray("questions").getJSONObject(1).getJSONArray("options").getJSONObject(0).getString("1");
            String no2_2=json.getJSONObject("survey").getJSONArray("questions").getJSONObject(1).getJSONArray("options").getJSONObject(1).getString("2");
            String no3_2=json.getJSONObject("survey").getJSONArray("questions").getJSONObject(1).getJSONArray("options").getJSONObject(2).getString("3");
            String no4_2=json.getJSONObject("survey").getJSONArray("questions").getJSONObject(1).getJSONArray("options").getJSONObject(3).getString("4");
            String no5_2=json.getJSONObject("survey").getJSONArray("questions").getJSONObject(1).getJSONArray("options").getJSONObject(4).getString("5");
            String survey=json.getString("survey");

            // set 文本大小
            LinearLayout.LayoutParams param = new LinearLayout.LayoutParams(LinearLayout.LayoutParams.MATCH_PARENT,
                    LinearLayout.LayoutParams.WRAP_CONTENT);
            param.setMargins(10,0,10,0);

            TextView Text1 = new TextView(this);
            Text1.setTextSize(20);
            Text1.setId(0);//设置 id
            Text1.setText("survey:");
            //添加文本到主布局
            Text1.setLayoutParams(param);
            lineLayout.addView(Text1);

            TextView Text2 = new TextView(this);
            Text2.setTextSize(20);
            String Id="id:"+id;
            Text2.setText(Id);
            Text2.setLayoutParams(param);
            lineLayout.addView(Text2);

            TextView Text3 = new TextView(this);
            Text3.setTextSize(20);
            String Len="len:"+len;
            Text3.setText(Len);
            Text3.setLayoutParams(param);
            lineLayout.addView(Text3);

            TextView Text4 = new TextView(this);
            Text4.setTextSize(20);
            String Questions="questions:";
            Text4.setText(Questions);
            Text4.setLayoutParams(param);
            lineLayout.addView(Text4);

            TextView Text5 = new TextView(this);
            Text5.setTextSize(20);
            String Type="type:"+type;
            Text5.setText(Type);
            Text5.setLayoutParams(param);
            lineLayout.addView(Text5);

            TextView Text6 = new TextView(this);
            Text6.setTextSize(20);
            Text6.setText("question");
            Text6.setLayoutParams(param);
            lineLayout.addView(Text6);

            TextView Text7 = new TextView(this);
            Text7.setTextSize(20);
            Text7.setText("options:");
            Text7.setLayoutParams(param);
            lineLayout.addView(Text7);

            RadioButton Text8 = new RadioButton(this);
            Text8.setTextSize(20);
            String No1="1:"+no1;
            Text8.setText(No1);
            if(Text8.isChecked()){
                Result+="{\"1\",\""+no1+"\"}";
            }
            Text8.setLayoutParams(param);
            lineLayout.addView(Text8);

            RadioButton Text9 = new RadioButton(this);
            Text9.setTextSize(20);
            String No2="2:"+no2;
            Text9.setText(No2);
            if(Text9.isChecked()){
                Result+="{\"2\",\""+no2+"\"}";
            }
            Text9.setLayoutParams(param);
            lineLayout.addView(Text9);

            TextView Text10 = new TextView(this);
            Text10.setTextSize(20);
            String Type2="type:"+type2;
            Text10.setText(Type2);
            Text10.setLayoutParams(param);
            lineLayout.addView(Text10);

            TextView Text11 = new TextView(this);
            Text11.setTextSize(20);
            Text11.setText("question:");
            Text11.setLayoutParams(param);
            lineLayout.addView(Text11);

            TextView Text12 = new TextView(this);
            Text12.setTextSize(20);
            Text12.setText("options:");
            Text12.setLayoutParams(param);
            lineLayout.addView(Text12);

            RadioButton Text13 = new RadioButton(this);
            Text13.setTextSize(20);
            String No1_2="1:"+no1_2;
            Text13.setText(No1_2);
            if(Text13.isChecked()){
                Result+="{\"1\",\""+no1_2+"\"}";
            }
            Text13.setLayoutParams(param);
            lineLayout.addView(Text13);

            RadioButton Text14 = new RadioButton(this);
            Text14.setTextSize(20);
            String No2_2="2:"+no2_2;
            Text14.setText(No2_2);
            if(Text14.isChecked()){
                Result+="{\"2\",\""+no2_2+"\"}";
            }
            Text14.setLayoutParams(param);
            lineLayout.addView(Text14);

            RadioButton Text15 = new RadioButton(this);
            Text15.setTextSize(20);
            String No3_2="3:"+no3_2;
            Text15.setText(No3_2);
            if(Text15.isChecked()){
                Result+="{\"3\",\""+no3_2+"\"}";
            }
            Text15.setLayoutParams(param);
            lineLayout.addView(Text15);

            RadioButton Text16 = new RadioButton(this);
            Text16.setTextSize(20);
            String No4_2="4:"+no4_2;
            Text16.setText(No4_2);
            if(Text16.isChecked()){
                Result+="{\"4\",\""+no4_2+"\"}";
            }
            Text16.setLayoutParams(param);
            lineLayout.addView(Text16);

            RadioButton Text17 = new RadioButton(this);
            Text17.setTextSize(20);
            String No5_2="5:"+no5_2;
            Text17.setText(No5_2);
            if(Text17.isChecked()){
                Result+="{\"5\",\""+no5_2+"\"}";
            }
            Text17.setLayoutParams(param);
            lineLayout.addView(Text17);

            Button Save=new Button(this);
            Save.setTextSize(20);
            Save.setText("Save");
            Save.setOnClickListener(new View.OnClickListener() {

                                        @Override
                                        public void onClick(View v) {

                                            saveJson("Result","");
                                        }
                                    });
            Save.setLayoutParams(param);
            lineLayout.addView(Save);

            /*测试时用的代码
            print=survey+"\n"
                    +id+"\n"
                    +len+"\n"
                    +questions+"\n"
                    +type+"\n"
                    +question+"\n"
                    +options+"\n"
                    +no1+"\n"
                    +no2+"\n"
                    +type2+"\n"
                    +question2+"\n"
                    +options2+"\n"
                    +no1_2+"\n"
                    +no2_2+"\n"
                    +no3_2+"\n"
                    +no4_2+"\n"
                    +no5_2+"\n"
            ;
            */
        } catch (JSONException e) {
            e.printStackTrace();
        }
        setContentView(lineLayout);
        //测试时用的代码
        //System.out.println(print);
    }
    //读取保存在txt文件中的json语句
    public String getJson(String fileName) {
        StringBuilder stringBuilder = new StringBuilder();
        try {
            AssetManager assetManager = MainActivity.this.getAssets();
            BufferedReader bf = new BufferedReader(new InputStreamReader(assetManager.open(fileName)));
            String line;
            while ((line = bf.readLine()) != null) {
                stringBuilder.append(line);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
        return stringBuilder.toString();
    }

    private void saveJson(String fileName,String data) {
        BufferedWriter writer = null;
        File file = new File("assets\\"+ fileName + ".txt");
        //如果文件不存在，则新建一个
        if(!file.exists()){
            try {
                file.createNewFile();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
        //写入
        try {
            writer = new BufferedWriter(new OutputStreamWriter(new FileOutputStream(file,false), "UTF-8"));
            writer.write(data);
        } catch (IOException e) {
            e.printStackTrace();
        }finally {
            try {
                if(writer != null){
                    writer.close();
                }
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
        System.out.println("文件写入成功！");
    }
/*
    private void addView(final LinearLayout lineLayout)
    {
        final TextView showText = new TextView(this);
        showText.setTextColor(Color.GREEN);
        showText.setTextSize(30);
        showText.setId(0);//设置 id
        showText.setText("我是在程序中添加的第一个文本");
        showText.setBackgroundColor(Color.GRAY);
        // set 文本大小
        LinearLayout.LayoutParams params = new LinearLayout.LayoutParams(LinearLayout.LayoutParams.MATCH_PARENT,
                LinearLayout.LayoutParams.WRAP_CONTENT);
        //set 四周距离
        params.setMargins(10, 10, 10, 10);

        showText.setLayoutParams(params);

        //添加文本到主布局
        lineLayout.addView(showText );

        //创建按钮
        Button btn = new Button(this);
        btn.setText("点击删除文本");
        btn.setBackgroundColor(Color.GRAY) ;
        LinearLayout.LayoutParams btn_params = new LinearLayout.LayoutParams(LinearLayout.LayoutParams.WRAP_CONTENT,
                LinearLayout.LayoutParams.WRAP_CONTENT);
        btn_params.setMargins(0, 60, 60, 0);
        btn_params.gravity = Gravity.CENTER_HORIZONTAL;
        btn.setLayoutParams(btn_params);
        // 动态添加按钮到主布局
        lineLayout.addView(btn);

        //点击按钮 动态删除文本
        btn.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                // TODO Auto-generated method stub
                if(null != lineLayout.findViewById(0))
                {
                    lineLayout.removeView(showText);
                }
                else
                {
                    Toast.makeText(MainActivity.this, "文本已被删除", Toast.LENGTH_SHORT).show();
                }
            }
        });

        //动态创建一个相对布局
        RelativeLayout relaLayout = new RelativeLayout(this);
        relaLayout.setBackgroundColor(Color.BLUE);
        RelativeLayout.LayoutParams lp11 = new RelativeLayout.LayoutParams(
                ViewGroup.LayoutParams.MATCH_PARENT, 120);


        relaLayout.setLayoutParams(lp11);
        //动态创建一个文本
        final TextView RelaText = new TextView(this);
        RelaText.setTextColor(Color.GREEN);
        RelaText.setTextSize(20);
        RelaText.setText("我是在程序中添加的第二个文本，在相对布局中");
        RelaText.setBackgroundColor(Color.GRAY);

        //设置文本的布局
        RelativeLayout.LayoutParams lp2 = new RelativeLayout.LayoutParams(
                ViewGroup.LayoutParams.FILL_PARENT, ViewGroup.LayoutParams.WRAP_CONTENT);

        lp2.addRule(RelativeLayout.CENTER_IN_PARENT, RelativeLayout.TRUE);
        lp2.setMargins(10, 10, 10, 10);
        //将文本添加到相对布局中
        relaLayout.addView(RelaText,lp2);
        //将这个布局添加到主布局中
        lineLayout.addView(relaLayout);

    }

 */
    /*
    public void start (View view){
        Intent intent = new Intent(this,Q1Activity.class);
        startActivity(intent);
    }
     */
}
