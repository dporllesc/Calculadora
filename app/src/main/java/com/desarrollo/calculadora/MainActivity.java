package com.desarrollo.calculadora;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private Button btn_suma;
    private Button btn_resta;
    private Button btn_multiplicacion;
    private Button btn_division;

    private TextView respuesta;
    private EditText num1;
    private EditText num2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        respuesta = findViewById(R.id.Respuesta);
        num1=findViewById(R.id.num1);
        num2=findViewById(R.id.num2);

        btn_suma = findViewById(R.id.btn_suma);
        btn_suma.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                respuesta.setText(suma(Double.parseDouble(num1.getText().toString()),Double.parseDouble(num2.getText().toString()))+"");
            }
        });
        btn_resta = findViewById(R.id.btn_resta);
        btn_resta.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                respuesta.setText(resta(Double.parseDouble(num1.getText().toString()),Double.parseDouble(num2.getText().toString()))+"");
            }
        });
        btn_multiplicacion = findViewById(R.id.btn_multiplicacion);
        btn_multiplicacion.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                respuesta.setText(multiplicacion(Double.parseDouble(num1.getText().toString()),Double.parseDouble(num2.getText().toString()))+"");
            }
        });
        btn_division = findViewById(R.id.btn_division);
        btn_division.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                respuesta.setText(division(Double.parseDouble(num1.getText().toString()),Double.parseDouble(num2.getText().toString()))+"");
            }
        });


    }

    public double suma (double a, double b){
        return a+b;
    }
    public double resta (double a, double b){
        return a-b;
    }
    public double multiplicacion (double a, double b){
        return a*b;
    }
    public double division (double a, double b){
        double respuestad = 0;
        if(b!=0){
            respuestad=a/b;
        }
        return respuestad;
    }
}
