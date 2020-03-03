package mg.studio.android.survey;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.CheckBox;

public class Q5Activity extends AppCompatActivity {

    private CheckBox c51,c52,c53,c54,c55,c56,c57;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_q5);
    }
    public void next5 (View view){
        String result_string="";
        Intent intent=getIntent();
        result_string=intent.getExtras().getString("Q4result")+"Q5:";
        c51=findViewById(R.id.q5cb1);
        c52=findViewById(R.id.q5cb2);
        c53=findViewById(R.id.q5cb3);
        c54=findViewById(R.id.q5cb4);
        c55=findViewById(R.id.q5cb5);
        c56=findViewById(R.id.q5cb6);
        c57=findViewById(R.id.q5cb7);
        if(c51.isChecked()){
            result_string+=c51.getText().toString()+"\n";
        }
        if(c52.isChecked()){
            result_string+=c52.getText().toString()+"\n";
        }
        if(c53.isChecked()){
            result_string+=c53.getText().toString()+"\n";
        }
        if(c54.isChecked()){
            result_string+=c54.getText().toString()+"\n";
        }
        if(c55.isChecked()){
            result_string+=c55.getText().toString()+"\n";
        }
        if(c56.isChecked()){
            result_string+=c56.getText().toString()+"\n";
        }
        if(c57.isChecked()){
            result_string+=c57.getText().toString()+"\n";
        }
        intent = new Intent(this,Q6Activity.class);
        intent.putExtra("Q5result",result_string);
        startActivity(intent);
        System.exit(0);
    }
}
