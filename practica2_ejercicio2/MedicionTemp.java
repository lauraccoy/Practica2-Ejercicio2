package com.example.practica2_ejercicio2;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;

import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.Toast;

public class MedicionTemp extends AppCompatActivity {

    private EditText nombre, apellidos, temperatura, ciudad, provincia;
    private RadioGroup tipo;
    private RadioButton celsius, fahrenheit;
    private Button finalizar;

    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_medicion_temp);

        nombre=findViewById(R.id.nombre);
        apellidos=findViewById(R.id.apellidos);
        temperatura=findViewById(R.id.temperatura);
        ciudad=findViewById(R.id.ciudad);
        provincia=findViewById(R.id.provincia);
        tipo=findViewById(R.id.tipo);
        celsius=findViewById(R.id.celsius);
        fahrenheit=findViewById(R.id.fahrenheit);

        finalizar=findViewById(R.id.finalizar);
        finalizar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String nom=nombre.getText().toString();
                String apell=apellidos.getText().toString();
                String temp=temperatura.getText().toString();
                String ciud=ciudad.getText().toString();
                String prov=provincia.getText().toString();

                String grados="";
                if(celsius.isChecked()){
                    grados="Celsius";
                }
                else if(fahrenheit.isChecked()){
                    grados="Fahrenheit";
                }
                else{
                    Toast.makeText(MedicionTemp.this, "Marca el tipo de grados", Toast.LENGTH_SHORT).show();
                    return;                }


                Intent intent=new Intent(MedicionTemp.this, ResumenForm.class);
                intent.putExtra("nombre", nom);
                intent.putExtra("apellidos", apell);
                intent.putExtra("temperatura", temp);
                intent.putExtra("ciudad", ciud);
                intent.putExtra("provincia", prov);
                intent.putExtra("grados", grados);
                startActivity(intent);
            }
        });

    }

}