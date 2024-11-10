package com.example.practica2_ejercicio2;

import android.annotation.SuppressLint;
import android.os.Bundle;

import com.google.android.material.snackbar.Snackbar;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;

import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import androidx.navigation.NavController;
import androidx.navigation.Navigation;
import androidx.navigation.ui.AppBarConfiguration;
import androidx.navigation.ui.NavigationUI;

import com.example.practica2_ejercicio2.databinding.ActivityConversorBinding;

public class Conversor extends AppCompatActivity {

    private EditText celsius, celsius2, farhenheit, farhengeit2;
    private Button calcular, calcular2;

    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_conversor);

        celsius=findViewById(R.id.celsius);
        celsius2=findViewById(R.id.celsius2);
        farhenheit=findViewById(R.id.farenheit);
        farhengeit2=findViewById(R.id.farenheit2);
        calcular=findViewById(R.id.calcular1);
        calcular2=findViewById(R.id.calcular2);

        calcular.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                try {
                    String cels = celsius.getText().toString();
                    float c = Float.parseFloat(cels);
                    float calculado = (c * 9 / 5) + 32;
                    String cal = String.valueOf(calculado);
                    farhenheit.setText(cal);

                } catch (NumberFormatException e) {
                    celsius.setError("Por favor, introduce un número válido");
                }
            }

        });

        calcular2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                try{
                    String farh=farhengeit2.getText().toString();
                    float f=Float.parseFloat(farh);
                    float calcula=(f-32)*5/9;
                    String calc=String.valueOf(calcula);
                    celsius2.setText(calc);
                }
                catch (NumberFormatException e){
                    farhengeit2.setError("Por favor, intruduce un número válido");
                }
            }
        });
    }

}