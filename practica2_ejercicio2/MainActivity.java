package com.example.practica2_ejercicio2;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class MainActivity extends AppCompatActivity {

    private Button entrar;
    private String usuario="admin", contraseña="admin";
    private EditText usu, contra;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_main);
        usu=findViewById(R.id.usuario);
        contra=findViewById(R.id.contraseña);
        entrar=findViewById(R.id.entrar);
        entrar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String inputUsuario=usu.getText().toString();
                String inputContraseña=contra.getText().toString();
                if (inputUsuario.equals(usuario)&&inputContraseña.equals(contraseña)){
                    Intent intent=new Intent(MainActivity.this, MenuPrincipal.class);
                    startActivity(intent);
                }
                else Toast.makeText(MainActivity.this, "Usuario o contraseña incorrectos", Toast.LENGTH_SHORT).show();
            }
        });
    }



}