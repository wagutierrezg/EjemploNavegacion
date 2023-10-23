package com.example.ejemplonavegacion;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    //Definir atributos de navegación (TextView & Button)
    TextView registrarse;
    Button login;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

    //Encontrar y asociar la Vistas 'textView5' y 'button2' con "registrarse" y "login"
        registrarse = findViewById(R.id.textView5);
        login = findViewById(R.id.button2);

        //Para navegación forzada usamos Intent (intención de hacia donde voy)
        Intent register = new Intent(getApplicationContext(), RegisterActivity.class);
        Intent home = new Intent(getApplicationContext(), HomeActivity.class);

        //Se activa cuando usuario hace click en login y envia a la vista home
        login.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(home);
            }
        });

        //Se activa cuando usuario hace click en registrarse y envia a la vista register
        registrarse.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(register);
            }
        });
    }
}