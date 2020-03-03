package mg.studio.android.survey;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.RadioButton;

public class Q7Activity extends AppCompatActivity {

    private RadioButton r71,r72,r73,r74,r75;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_q7);
    }
    public void next7 (View view){
        String result_string="";
        Intent intent=getIntent();
        result_string=intent.getExtras().getString("Q6result")+"\n"+"Q7:";
        r71=findViewById(R.id.q7rbtn1);
        r72=findViewById(R.id.q7rbtn2);
        r73=findViewById(R.id.q7rbtn3);
        r74=findViewById(R.id.q7rbtn4);
        r75=findViewById(R.id.q7rbtn5);
        if(r71.isChecked()){
            result_string+=r71.getText().toString();
        }
        if(r72.isChecked()){
            result_string+=r72.getText().toString();
        }
        if(r73.isChecked()){
            result_string+=r73.getText().toString();
        }
        if(r74.isChecked()){
            result_string+=r74.getText().toString();
        }
        if(r75.isChecked()){
            result_string+=r75.getText().toString();
        }
        intent = new Intent(this,Q8Activity.class);
        intent.putExtra("Q7result",result_string);
        startActivity(intent);
        System.exit(0);
    }
}
