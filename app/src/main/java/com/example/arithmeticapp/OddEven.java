package com.example.arithmeticapp;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.AppCompatButton;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class OddEven extends AppCompatActivity {
    EditText ed1;
    AppCompatButton b1,b2;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_odd_even);
        ed1=(EditText) findViewById(R.id.num1);

        b1=(AppCompatButton) findViewById(R.id.oddEvenbtn);
        b2=(AppCompatButton) findViewById(R.id.bkmenu);
        b2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent s=new Intent(getApplicationContext(), MainActivity.class);
                startActivity(s);
            }
        });
        b1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String num1=ed1.getText().toString();

                int n1=Integer.parseInt(num1);

                if (n1%2==0)
                {
                    Toast.makeText(getApplicationContext(),String.valueOf(n1)+" is even",Toast.LENGTH_LONG).show();
                }
                else
                {
                    Toast.makeText(getApplicationContext(),String.valueOf(n1)+ " is odd",Toast.LENGTH_LONG).show();
                }



            }
        });
    }
}