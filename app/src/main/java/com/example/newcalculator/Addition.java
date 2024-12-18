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

import com.example.newcalculator.MainActivity;
import com.example.newcalculator.R;

public class Addition extends AppCompatActivity {
    Button bt1,bt2;

    EditText et1,et2;
    TextView tv;
    int num1,num2,sum;
    String getN1,getN2,result;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_addition);

        bt1 = (Button) findViewById(R.id.bek);


        et1=(EditText) findViewById(R.id.ano1);
        et2=(EditText) findViewById(R.id.ano2);

        bt1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent ob = new Intent(getApplicationContext(), MainActivity.class);
                startActivity(ob);
            }
        });

        bt2=(Button) findViewById(R.id.addi);
        tv=(TextView) findViewById(R.id.txt);

        bt2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                getN1=et1.getText().toString();
                getN2=et2.getText().toString();
                num1=Integer.parseInt(getN1);
                num2=Integer.parseInt(getN2);
                sum=num1+num2;
                result=String.valueOf(sum);
                System.out.println(result);
                tv.setText(result);
                Toast.makeText(getApplicationContext(),result,Toast.LENGTH_LONG).show();

            }
        });

    }
}