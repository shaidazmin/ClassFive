package com.example.nz.classfive;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    RadioGroup radioGroup;
    RadioButton gender;
    Button button;
    TextView textView;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        radioGroup = (RadioGroup) findViewById(R.id.radioGroup);
        button = (Button) findViewById(R.id.btn);
        textView =(TextView)findViewById(R.id.result);

        try{



        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int id = radioGroup.getCheckedRadioButtonId();
                gender = (RadioButton) findViewById(id);
                String value = gender.getText().toString();
                textView.setText(" You selected "+value);

            }
        });

        }
        catch (Exception e){
            Toast.makeText(MainActivity.this,"Please Select a genger ",Toast.LENGTH_LONG).show();
        }
    }
}
