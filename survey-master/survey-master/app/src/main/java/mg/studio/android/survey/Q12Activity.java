package mg.studio.android.survey;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.RadioButton;

public class Q12Activity extends AppCompatActivity {

    private RadioButton r121,r122,r123,r124,r125;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_q12);
    }
    public void next12(View view) {
        String result_string="";
        Intent intent=getIntent();
        result_string=intent.getExtras().getString("Q11result")+"\n"+"Q12:";
        r121=findViewById(R.id.q12rbtn1);
        r122=findViewById(R.id.q12rbtn2);
        r123=findViewById(R.id.q12rbtn3);
        r124=findViewById(R.id.q12rbtn4);
        r125=findViewById(R.id.q12rbtn5);
        if(r121.isChecked()){
            result_string+=r121.getText().toString();
        }
        if(r122.isChecked()){
            result_string+=r122.getText().toString();
        }
        if(r123.isChecked()){
            result_string+=r123.getText().toString();
        }
        if(r124.isChecked()){
            result_string+=r124.getText().toString();
        }
        if(r125.isChecked()){
            result_string+=r125.getText().toString();
        }
        intent = new Intent(this, ResultActivity.class);
        intent.putExtra("Q12result",result_string);
        startActivity(intent);
        System.exit(0);
    }
}
