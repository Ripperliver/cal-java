package com.example.beto.calculadora_java;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import bsh.EvalError;
import bsh.Interpreter;

public class Calcu_java extends AppCompatActivity implements View.OnClickListener{

    Button btn1,btn2,btn3,btn4,btn5,btn6,btn7,btn8,btn9,
    btn0,btn_punto,btn_suma,btn_resta,btn_multi,btn_div,
    btn_igual,btn_c;

    EditText espacio;

    String operacion = "";

    boolean punto = false;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_calcu_java);
        btn1 = (Button) findViewById(R.id.btn1);
        btn2 = (Button) findViewById(R.id.btn2);
        btn3 = (Button) findViewById(R.id.btn3);
        btn4 = (Button) findViewById(R.id.btn4);
        btn5 = (Button) findViewById(R.id.btn5);
        btn6 = (Button) findViewById(R.id.btn6);
        btn7 = (Button) findViewById(R.id.btn7);
        btn8 = (Button) findViewById(R.id.btn8);
        btn9 = (Button) findViewById(R.id.btn9);
        btn0 = (Button) findViewById(R.id.btn0);
        btn_punto = (Button) findViewById(R.id.btn_punto);
        btn_suma = (Button) findViewById(R.id.btn_mas);
        btn_resta = (Button) findViewById(R.id.btn_menos);
        btn_multi = (Button) findViewById(R.id.btn_multi);
        btn_div = (Button) findViewById(R.id.btn_div);
        btn_igual = (Button) findViewById(R.id.btn_igual);
        btn_c = (Button) findViewById(R.id.btn_c);
        espacio = (EditText)findViewById(R.id.espacio);



        btn1.setOnClickListener(this);
        btn2.setOnClickListener(this);
        btn3.setOnClickListener(this);
        btn4.setOnClickListener(this);
        btn5.setOnClickListener(this);
        btn6.setOnClickListener(this);
        btn7.setOnClickListener(this);
        btn8.setOnClickListener(this);
        btn9.setOnClickListener(this);
        btn0.setOnClickListener(this);
        btn_punto.setOnClickListener(this);
        btn_suma.setOnClickListener(this);
        btn_resta.setOnClickListener(this);
        btn_multi.setOnClickListener(this);
        btn_div.setOnClickListener(this);
        btn_igual.setOnClickListener(this);
        btn_c.setOnClickListener(this);




    }

    @Override
    public void onClick(View view) {

        switch (view.getId()){

            case R.id.btn1:
                operacion = operacion+"1";
                espacio.setText(operacion);
                break;

            case R.id.btn2:
                operacion = operacion+"2";
                espacio.setText(operacion);
                break;

            case R.id.btn3:
                operacion = operacion+"3";
                espacio.setText(operacion);
                break;

            case R.id.btn4:
                operacion = operacion+"4";
                espacio.setText(operacion);
                break;

            case R.id.btn5:
                operacion = operacion+"5";
                espacio.setText(operacion);
                break;

            case R.id.btn6:
                operacion = operacion+"6";
                espacio.setText(operacion);
                break;

            case R.id.btn7:
                operacion = operacion+"7";
                espacio.setText(operacion);
                break;

            case R.id.btn8:
                operacion = operacion+"8";
                espacio.setText(operacion);
                break;

            case R.id.btn9:
                operacion = operacion+"9";
                espacio.setText(operacion);
                break;

            case R.id.btn0:
                operacion = operacion+"0";
                espacio.setText(operacion);
                break;

            case R.id.btn_punto:
                if(punto==false){
                   operacion = operacion + ".";
                   espacio.setText(operacion);
                   punto = true;
                }
                break;

            case R.id.btn_mas:
                operacion = operacion+"+";
                espacio.setText(operacion);
                break;

            case R.id.btn_menos:
                operacion = operacion+"-";
                espacio.setText(operacion);
                break;

            case R.id.btn_multi:
                operacion = operacion+"*";
                espacio.setText(operacion);
                break;

            case R.id.btn_div:
                operacion = operacion+"-";
                espacio.setText(operacion);
                break;

            case R.id.btn_c:
                espacio.setText("");
                operacion = "";
                break;

            case R.id.btn_igual:

                try { Interpreter intrpt = new Interpreter();
                    intrpt.eval("result ="+operacion);
                    String resultado = intrpt.get("result").toString();
                    espacio.setText(resultado);
                }catch (Exception e){
                    Toast.makeText(getApplicationContext(),"Error"+e,Toast.LENGTH_SHORT).show();
                }

        }

    }
}
