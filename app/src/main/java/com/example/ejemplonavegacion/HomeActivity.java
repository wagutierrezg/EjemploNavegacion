package com.example.ejemplonavegacion;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class HomeActivity extends AppCompatActivity {

    //Definir atributos de navegación (Buttons)
    Button recommendation, statistics, register;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);

        //Encontrar y asociar la Vistas "button"'button3' y "button4"
        // con "recommendation", "Statistics" y "Register"
        recommendation = findViewById(R.id.button);
        statistics = findViewById(R.id.button3);
        register = findViewById(R.id.button4);

        //Para navegación forzada usamos Intent (intención de hacia donde voy)
        Intent recomendaciones = new Intent(getApplicationContext(), RecommendationsActivity.class);
        Intent estadisticas = new Intent(getApplicationContext(), StatisticsActivity.class);
        Intent registrarItem = new Intent(getApplicationContext(), ItemsRegisterActivity2.class);

        //Se activa cuando usuario hace click en recommendation y envia a la vista recomendaciones
        recommendation.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(recomendaciones);
            }
        });

        //Se activa cuando usuario hace click en statistics y envia a la vista estadisticas
        statistics.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(estadisticas);
            }
        });

        //Se activa cuando usuario hace click en register y envia a la vista registrarItem
        register.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(registrarItem);
            }
        });
    }
}