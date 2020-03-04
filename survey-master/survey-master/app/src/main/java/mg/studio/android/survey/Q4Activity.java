package mg.studio.android.survey;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.CheckBox;

public class Q4Activity extends AppCompatActivity {

    private CheckBox c41,c42,c43,c44,c45,c46,c47;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_q4);
    }
    public void next4 (View view){
        String result_string="";
        Intent intent=getIntent();
        result_string=intent.getExtras().getString("Q3result")+"\n"+"Q4:";
        c41=findViewById(R.id.q4cb1);
        c42=findViewById(R.id.q4cb2);
        c43=findViewById(R.id.q4cb3);
        c44=findViewById(R.id.q4cb4);
        c45=findViewById(R.id.q4cb5);
        c46=findViewById(R.id.q4cb6);
        c47=findViewById(R.id.q4cb7);
        if(c41.isChecked()){
            result_string+=c41.getText().toString()+"\n";
        }
        if(c42.isChecked()){
            result_string+=c42.getText().toString()+"\n";
        }
        if(c43.isChecked()){
            result_string+=c43.getText().toString()+"\n";
        }
        if(c44.isChecked()){
            result_string+=c44.getText().toString()+"\n";
        }
        if(c45.isChecked()){
            result_string+=c45.getText().toString()+"\n";
        }
        if(c46.isChecked()){
            result_string+=c46.getText().toString()+"\n";
        }
        if(c47.isChecked()){
            result_string+=c47.getText().toString()+"\n";
        }
        intent = new Intent(this,Q5Activity.class);
        intent.putExtra("Q4result",result_string);
        startActivity(intent);
        this.finish();
    }
}