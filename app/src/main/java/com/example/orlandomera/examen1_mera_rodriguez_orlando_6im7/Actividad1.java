package com.example.orlandomera.examen1_mera_rodriguez_orlando_6im7;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

public class Actividad1 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_actividad1);
    }

    public void onClickConvertir(View v){

        Intent conversion = new Intent(Actividad1.this, Actividad2.class);

        float dol =0;

        EditText cantidad = (EditText) findViewById(R.id.cantidad);
        String pesosC = cantidad.getText().toString();
        float pesos = Float.valueOf(pesosC);
        dol = pesos/15;
        String auxdol = String.valueOf(dol);

        conversion.putExtra("conversion",auxdol);

        startActivity(conversion);
    }
}
