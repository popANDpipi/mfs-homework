package mg.studio.android.survey;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.RadioButton;

public class Q9Activity extends AppCompatActivity {

    private RadioButton r91,r92,r93,r94;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_q9);
    }

    public void next9(View view) {
        String result_string="";
        Intent intent=getIntent();
        result_string=intent.getExtras().getString("Q8result")+"\n"+"Q9:";
        r91=findViewById(R.id.q9rbtn1);
        r92=findViewById(R.id.q9rbtn2);
        r93=findViewById(R.id.q9rbtn3);
        r94=findViewById(R.id.q9rbtn4);
        if(r91.isChecked()){
            result_string+=r91.getText().toString();
        }
        if(r92.isChecked()){
            result_string+=r92.getText().toString();
        }
        if(r93.isChecked()){
            result_string+=r93.getText().toString();
        }
        if(r94.isChecked()){
            result_string+=r94.getText().toString();
        }
        intent = new Intent(this, Q10Activity.class);
        intent.putExtra("Q9result",result_string);
        startActivity(intent);
        System.exit(0);
    }
}
