package com.example.orlandomera.examen1_mera_rodriguez_orlando_6im7;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class Actividad2 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_actividad2);
        Intent intent=getIntent();
        Bundle extras =intent.getExtras();
        String rest = (String)extras.get("conversion");

        TextView resultado = (TextView) findViewById(R.id.rest);
        resultado.setText(rest);
    }

    public void onClickENVIAR(View v){
        TextView resultado= (TextView)findViewById(R.id.rest);
        String txt = (String) resultado.getText();

        Intent envio = new Intent();
        envio.setAction(Intent.ACTION_SEND);
        envio.setType("text/plain");
        envio.putExtra(Intent.EXTRA_EMAIL,new String[]{"orlando080499@gmail.com"});
        envio.putExtra(Intent.EXTRA_SUBJECT,"Examen 1er parcial");
        envio.putExtra(Intent.EXTRA_TEXT, txt);

        startActivity(envio);

    }
}
