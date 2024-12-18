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

public class multiplication extends AppCompatActivity {
    Button bt3,bt4;
    EditText et1,et2;
    int num1,num2,prod;
    TextView tv;
    String getN1,getN2,result;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_multiplication);

        bt3=(Button) findViewById(R.id.bek);
        bt4=(Button) findViewById(R.id.multi);
        et1=(EditText) findViewById(R.id.mno1);
        et2=(EditText) findViewById(R.id.mno2);
        tv=(TextView) findViewById(R.id.txt);

        bt3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent ob3 = new Intent(getApplicationContext(), MainActivity.class);
                startActivity(ob3);
            }
        });

        bt4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                getN1=et1.getText().toString();
                getN2=et2.getText().toString();
                num1=Integer.parseInt(getN1);
                num2=Integer.parseInt(getN2);
                prod=num1*num2;
                result=String.valueOf(prod);
                System.out.println(result);
                tv.setText(result);
                Toast.makeText(getApplicationContext(),result,Toast.LENGTH_LONG).show();

            }
        });

    }
}