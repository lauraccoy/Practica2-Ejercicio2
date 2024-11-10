package com.example.practica2_ejercicio2;

import android.content.Intent;
import android.os.Bundle;

import com.google.android.material.snackbar.Snackbar;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;

import android.view.Menu;
import android.view.View;
import android.widget.Button;

import androidx.navigation.NavController;
import androidx.navigation.Navigation;
import androidx.navigation.ui.AppBarConfiguration;
import androidx.navigation.ui.NavigationUI;

import com.example.practica2_ejercicio2.databinding.ActivityMenuPrincipalBinding;

public class MenuPrincipal extends AppCompatActivity {

    private Button med, conver, config, cerrar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_menu_principal);
        med=findViewById(R.id.mediciontemp);
        conver=findViewById(R.id.conversor);
        config=findViewById(R.id.configuracion);
        cerrar=findViewById(R.id.cerrar);

        med.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent=new Intent(MenuPrincipal.this, MedicionTemp.class);
                startActivity(intent);
            }
        });

        conver.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent=new Intent(MenuPrincipal.this, Conversor.class);
                startActivity(intent);
            }
        });

        config.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent=new Intent(MenuPrincipal.this, Configuracion.class);
                startActivity(intent);
            }
        });

        cerrar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent=new Intent(MenuPrincipal.this, MainActivity.class);
                startActivity(intent);
            }
        });
    }
}