package mg.studio.android.survey;
import android.os.Bundle;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.RadioButton;
import android.view.*;
import android.content.Intent;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {
    private CheckBox c0;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        c0=findViewById(R.id.checkBox1);
        super.onCreate(savedInstanceState);
        setContentView(R.layout.welcome);
    }
    public void start (View view){
        Intent intent = new Intent(this,Q1Activity.class);
        startActivity(intent);
        System.exit(0);
    }
}