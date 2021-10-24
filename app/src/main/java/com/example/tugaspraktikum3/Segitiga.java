package com.example.tugaspraktikum3;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class Segitiga extends AppCompatActivity{
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.fragment_segitiga);


        final EditText tinggi_i = (EditText) findViewById(R.id.input_tinggi);
        final EditText alas_i = (EditText) findViewById(R.id.input_alas);
        final TextView hasil_o = (TextView) findViewById(R.id.hasil_luas);

        final Button hitung = (Button) findViewById(R.id.btn_luas);
        hitung.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String alas = alas_i.getText().toString();
                String tinggi = tinggi_i.getText().toString();

                double t = Double.parseDouble(alas);
                double a = Double.parseDouble(tinggi);
                double l = 0.5*(a*t);

                String luas = Double.toString(l);
                hasil_o.setText(luas);

            }
        });

    }
}