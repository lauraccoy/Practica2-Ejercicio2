package com.example.practica2_ejercicio2;

import android.content.Intent;
import android.os.Bundle;

import com.google.android.material.snackbar.Snackbar;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;

import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

import androidx.navigation.NavController;
import androidx.navigation.Navigation;
import androidx.navigation.ui.AppBarConfiguration;
import androidx.navigation.ui.NavigationUI;

import com.example.practica2_ejercicio2.databinding.ActivityResumenFormBinding;

public class ResumenForm extends AppCompatActivity {
    private TextView nombre, apellidos, temperatura, ciudad, provincia;
    private Button menu, color;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_resumen_form);
        nombre=findViewById(R.id.nombre);
        apellidos=findViewById(R.id.apellidos);
        temperatura=findViewById(R.id.temperatura);
        ciudad=findViewById(R.id.ciudad);
        provincia=findViewById(R.id.provincia);
        menu=findViewById(R.id.menu);
        color=findViewById(R.id.color);

        Intent intent=getIntent();
        String nom=intent.getStringExtra("nombre");
        String apell=intent.getStringExtra("apellidos");
        String temp=intent.getStringExtra("temperatura");
        String ciud=intent.getStringExtra("ciudad");
        String prov=intent.getStringExtra("provincia");
        String grados=intent.getStringExtra("grados");

        nombre.setText(nom);
        apellidos.setText(apell);
        temperatura.setText(temp);
        ciudad.setText(ciud);
        provincia.setText(prov);

        try {
            float temperature = Float.parseFloat(temp);


            if (grados.equals("Celsius")) {
                if (temperature > 38) {
                    color.setBackgroundColor(getResources().getColor(android.R.color.holo_red_dark));
                } else
                    color.setBackgroundColor(getResources().getColor(android.R.color.holo_green_dark));
            }

            if (grados.equals("Fahrenheit")) {
                if (temperature > 100) {
                    color.setBackgroundColor(getResources().getColor(android.R.color.holo_red_dark));
                } else
                    color.setBackgroundColor(getResources().getColor(android.R.color.holo_green_dark));
            }
        }
        catch (NumberFormatException e) {
            Toast.makeText(this, "Error al obtener la temperatura", Toast.LENGTH_SHORT).show();
        }


        menu.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent1=new Intent(ResumenForm.this, MenuPrincipal.class);
                startActivity(intent1);
            }
        });
    }

}