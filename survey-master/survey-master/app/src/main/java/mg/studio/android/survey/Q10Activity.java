package mg.studio.android.survey;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.RadioButton;

public class Q10Activity extends AppCompatActivity {

    private RadioButton r101,r102,r103,r104;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_q10);
    }
    public void next10(View view) {
        String result_string="";
        Intent intent=getIntent();
        result_string=intent.getExtras().getString("Q9result")+"\n"+"Q10:";
        r101=findViewById(R.id.q10rbtn1);
        r102=findViewById(R.id.q10rbtn2);
        r103=findViewById(R.id.q10rbtn3);
        r104=findViewById(R.id.q10rbtn4);
        if(r101.isChecked()){
            result_string+=r101.getText().toString();
        }
        if(r102.isChecked()){
            result_string+=r102.getText().toString();
        }
        if(r103.isChecked()){
            result_string+=r103.getText().toString();
        }
        if(r104.isChecked()){
            result_string+=r104.getText().toString();
        }
        intent = new Intent(this, Q11Activity.class);
        intent.putExtra("Q10result",result_string);
        startActivity(intent);
        this.finish();
    }
}
