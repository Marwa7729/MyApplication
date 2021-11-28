package com.agamy.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        EditText num1 = findViewById(R.id.num1);
        EditText num2 = findViewById(R.id.num2);
        Button add = findViewById(R.id.btn1);

        TextView rz = findViewById(R.id.tex);

        Button any = findViewById(R.id.btn2);
        Button mul = findViewById(R.id.btn3);
        Button div = findViewById(R.id.btn4);


        add.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                double _num1, _num2;
                _num1 = Double.parseDouble(num1.getText().toString().trim());
                _num2 = Double.parseDouble(num2.getText().toString().trim());

                String _rez = String.valueOf(_num1 + _num2);
                rz.setText(_rez);


            }
        });

        any.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                double _num1, _num2;
                _num1 = Double.parseDouble(num1.getText().toString().trim());
                _num2 = Double.parseDouble(num2.getText().toString().trim());

                String _rez = String.valueOf(_num1 - _num2);
                rz.setText(_rez);


            }
        });

        div.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                double _num1, _num2;
                _num1 = Double.parseDouble(num1.getText().toString().trim());
                _num2 = Double.parseDouble(num2.getText().toString().trim());


                if (_num1 != 0 && _num2 != 0) {
                    String _rez = String.valueOf(_num1 / _num2);
                    rz.setText(_rez);

                } else {
                    Toast.makeText(MainActivity.this, "Your numer = 0", Toast.LENGTH_LONG).show();
                }


            }
        });

        mul.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                double _num1, _num2;
                _num1 = Double.parseDouble(num1.getText().toString().trim());
                _num2 = Double.parseDouble(num2.getText().toString().trim());

                String _rez = String.valueOf(_num1 * _num2);
                rz.setText(_rez);


            }
        });
    }
}