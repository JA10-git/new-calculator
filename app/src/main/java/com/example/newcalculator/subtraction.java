package com.example.newcalculator;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class subtraction extends AppCompatActivity {
    Button bt2,bt3;
    EditText et1,et2;
    TextView tv;
    int num1,num2,diff;
    String getN1,getN2,result;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_subtraction);

        bt2=(Button) findViewById(R.id.bek);
        bt3=(Button) findViewById(R.id.subi);
        tv=(TextView) findViewById(R.id.txt);
        et1=(EditText) findViewById(R.id.sno1);
        et2=(EditText) findViewById(R.id.sno2);



        bt2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent ob = new Intent(getApplicationContext(), MainActivity.class);
                startActivity(ob);
            }
        });

        bt3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                getN1=et1.getText().toString();
                getN2=et2.getText().toString();
                num1=Integer.parseInt(getN1);
                num2=Integer.parseInt(getN2);
                diff=num1-num2;
                result=String.valueOf(diff);
                System.out.println(result);
                tv.setText(result);
                Toast.makeText(getApplicationContext(),result,Toast.LENGTH_LONG).show();

            }
        });

    }
}