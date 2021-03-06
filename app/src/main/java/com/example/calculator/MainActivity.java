package com.example.calculator;

import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    private Button button1, button2, button3, button4, button5, button6, button7, button8, button9, button10, button15, button16, button17, button18, button19, button20, button21, button22, button23;

    private EditText edit;
    private float a;
    private int where=0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Toast.makeText(getApplicationContext(),"Calculator",Toast.LENGTH_SHORT).show();

        button23=(Button)findViewById(R.id.button23); //0
        button21=(Button)findViewById(R.id.button21); //1
        button22=(Button)findViewById(R.id.button22); //2
        button7=(Button)findViewById(R.id.button7); //3
        button19=(Button)findViewById(R.id.button19); //4
        button20=(Button)findViewById(R.id.button20); //5
        button5=(Button)findViewById(R.id.button5); //6
        button17=(Button)findViewById(R.id.button17); //7
        button18=(Button)findViewById(R.id.button18); //8
        button3=(Button)findViewById(R.id.button3); //9

        button10=(Button)findViewById(R.id.button10); //=
        button9=(Button)findViewById(R.id.button9); //.
        button8=(Button)findViewById(R.id.button8); //+
        button6=(Button)findViewById(R.id.button6); //-
        button4=(Button)findViewById(R.id.button4); //x
        button2=(Button)findViewById(R.id.button2); //÷

        button1=(Button)findViewById(R.id.button1); //%
        button16=(Button)findViewById(R.id.button16); //+/-
        button15=(Button)findViewById(R.id.button15); //AC

        edit=(EditText)findViewById(R.id.edit1);

        View.OnClickListener cl = new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(v==button21){
                    edit.setText(edit.getText().toString()+1);
                }
                else if(v==button22){
                    edit.setText(edit.getText().toString()+2);
                }
                else if(v==button7){
                    edit.setText(edit.getText().toString()+3);
                }
                else if(v==button8){
                    a=Integer.valueOf(edit.getText().toString().trim());
                    edit.setText("");
                    where=1;
                }
                else if(v==button19){
                    edit.setText(edit.getText().toString()+4);
                }
                else if(v==button20){
                    edit.setText(edit.getText().toString()+5);
                }
                else if(v==button5){
                    edit.setText(edit.getText().toString()+6);
                }
                else if(v==button4){
                    a=Integer.valueOf(edit.getText().toString().trim());
                    edit.setText("");
                    where=2;
                }
                else if(v==button17){
                    edit.setText(edit.getText().toString()+7);
                }
                else if(v==button18){
                    edit.setText(edit.getText().toString()+8);
                }
                else if(v==button3){
                    edit.setText(edit.getText().toString()+9);
                }
                else if(v==button2){
                    a=Integer.valueOf(edit.getText().toString().trim());
                    edit.setText("");
                    where=3;
                }
                else if(v==button23){
                    edit.setText(edit.getText().toString()+0);
                }
                else if(v==button10) {
                    if (where == 1) {
                        a = a + Float.valueOf(edit.getText().toString().trim());
                        edit.setText(Float.toString(a));
                    }
                    else if(where==2){
                        Log.v("test", Float.toString(a));
                        a = a * Float.valueOf(edit.getText().toString().trim());
                        edit.setText(Float.toString(a));
                    }
                    else if(where==3){
                        a = a / Float.valueOf(edit.getText().toString().trim());
                        edit.setText(Float.toString(a));
                    }
                    else if(where==4){
                        a = a - Float.valueOf(edit.getText().toString().trim());
                        edit.setText(Float.toString(a));
                    }
                }
                else if(v==button15){
                    edit.setText("");
                }
                else if(v==button6){
                    a=Integer.valueOf(edit.getText().toString().trim());
                    edit.setText("");
                    where=4;
                }
            }

        };
        button1.setOnClickListener(cl);
        button2.setOnClickListener(cl);
        button3.setOnClickListener(cl);
        button4.setOnClickListener(cl);
        button5.setOnClickListener(cl);
        button6.setOnClickListener(cl);
        button7.setOnClickListener(cl);
        button8.setOnClickListener(cl);
        button9.setOnClickListener(cl);
        button10.setOnClickListener(cl);

        button15.setOnClickListener(cl);
        button16.setOnClickListener(cl);
        button17.setOnClickListener(cl);
        button18.setOnClickListener(cl);
        button19.setOnClickListener(cl);
        button20.setOnClickListener(cl);
        button21.setOnClickListener(cl);
        button22.setOnClickListener(cl);
        button23.setOnClickListener(cl);

    }
}