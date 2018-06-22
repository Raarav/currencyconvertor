package com.example.rahulprajapati.currencyconvertor;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {
    EditText editText = (EditText) findViewById(R.id.edt);
    EditText editText1 = (EditText) findViewById(R.id.et1);


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

    }


    public void dolar(View view) {


        Double dolaramount = Double.parseDouble(editText.getText().toString());
        Double vdolar = dolaramount * 67.81;
        editText1.setText(vdolar.toString() + "Dolars");
        Log.i("dolar", vdolar.toString());
        }

    public void euro(View view) {


        Double euroamount = Double.parseDouble(editText.getText().toString());
        Double veuro = euroamount * 78.80;
        editText1.setText(veuro.toString() + "Euros");
        Log.i("euro", veuro.toString());
    }

    public void yen(View view) {


        Double yenamount = Double.parseDouble(editText.getText().toString());
        Double vyen = yenamount * 0.62;
        editText1.setText(vyen.toString() + "Yens");
        Log.i("yen", vyen.toString());
    }

    public void ruble(View view) {

        Double rubleamount = Double.parseDouble(editText.getText().toString());
        Double vruble = rubleamount * 1.07;
        editText1.setText(vruble.toString() + "Rubles");
        Log.i("ruble", vruble.toString());




    }

}
