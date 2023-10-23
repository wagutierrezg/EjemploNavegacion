package com.example.ejemplonavegacion;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class RegisterActivity extends AppCompatActivity {
    //Definir atributos de navegación (Button)
    Button registroUsuario;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_register2);

        //Encontrar y asociar la Vista 'button2R' con "registroUsuario"
        registroUsuario = findViewById(R.id.button2R);

        //Para navegación forzada usamos Intent (intención de hacia donde voy)
        Intent home = new Intent(getApplicationContext(), HomeActivity.class);

        //Se activa cuando usuario hace click en registroUsuario y envia a la vista home
        registroUsuario.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(home);
            }
        });
    }
}