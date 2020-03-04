package mg.studio.android.survey;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.os.Environment;
import android.view.View;
import android.widget.TextView;
import android.widget.Toast;

import java.io.IOException;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;

public class ResultActivity extends AppCompatActivity {
    private TextView result;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_result);

        Intent intent = getIntent();
        String result_string=intent.getExtras().getString("Q12result");
        result=findViewById(R.id.txt1);
        result_string=result.getText()+result_string;
        result.setText(result_string);
    }
    public void next_fin(View view) {
        Intent intent = new Intent(this, FinishActivity.class);
        startActivity(intent);
        this.finish();
    }
    public void save(View view){
       String msg = result.getText().toString();
       saveFile(msg);
       Toast.makeText(ResultActivity.this,"saving success",Toast.LENGTH_LONG).show();
    }
    private void saveFile(String msg){
        File sdFile= Environment.getExternalStorageDirectory();
        File saveData=new File(sdFile,"saveData.txt");
        try{
            FileOutputStream fout=new FileOutputStream(saveData);
            fout.write(msg.getBytes());
            fout.flush();
            fout.close();
        }
        catch(Exception e){
            e.printStackTrace();
        }
    }
}


