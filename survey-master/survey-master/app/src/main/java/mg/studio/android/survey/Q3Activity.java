package mg.studio.android.survey;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.RadioButton;

public class Q3Activity extends AppCompatActivity {

    private RadioButton r31,r32,r33,r34;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_q3);
    }
    public void next3 (View view){
        String result_string="";
        Intent intent=getIntent();
        result_string=intent.getExtras().getString("Q2result")+"\n"+"Q3:";
        r31=findViewById(R.id.q3rbtn1);
        r32=findViewById(R.id.q3rbtn2);
        r33=findViewById(R.id.q3rbtn3);
        r34=findViewById(R.id.q3rbtn4);
        if(r31.isChecked()){
            result_string+=r31.getText().toString();
        }
        if(r32.isChecked()){
            result_string+=r32.getText().toString();
        }
        if(r33.isChecked()){
            result_string+=r33.getText().toString();
        }
        if(r34.isChecked()){
            result_string+=r34.getText().toString();
        }
        intent = new Intent(this,Q4Activity.class);
        intent.putExtra("Q3result",result_string);
        startActivity(intent);
        this.finish();
    }
}