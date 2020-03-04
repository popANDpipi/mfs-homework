package mg.studio.android.survey;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

public class Q6Activity extends AppCompatActivity {

    private EditText e61;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_q6);
    }
    public void next6 (View view){
        String result_string="";
        Intent intent=getIntent();
        result_string=intent.getExtras().getString("Q5result")+"Q6:";
        e61=findViewById(R.id.etxt);
        result_string+=e61.getText().toString();
        intent = new Intent(this,Q7Activity.class);
        intent.putExtra("Q6result",result_string);
        startActivity(intent);
        this.finish();
    }
}