package com.example.nz.classfour;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {


    CheckBox one, two,thre;
    Button order;
    TextView result;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);



        one = (CheckBox) findViewById(R.id.laptop);
        two = (CheckBox) findViewById(R.id.pc);
        thre = (CheckBox) findViewById(R.id.hdd);
        order = (Button) findViewById(R.id.order);
        result = (TextView) findViewById(R.id.result);




        order.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                StringBuilder stringBuilder = new StringBuilder();

                if(one.isChecked()){
                    String oneString = one.getText().toString();
                    stringBuilder.append("Your order is "+oneString+"\n");
                  //  result.setText("You ordered : "+stringBuilder);
                }


                else if (two.isChecked()){
                    String twoString = two.getText().toString();
                    stringBuilder.append("Your order is "+twoString+"\n");
                   // result.setText("You ordered : "+stringBuilder);
                }
                else if (thre.isChecked())
                {
                    String threString = thre.getText().toString();
                    stringBuilder.append("Your order is "+threString+"\n");

                }

                result.setText(stringBuilder);


            }
        });






    }
}
