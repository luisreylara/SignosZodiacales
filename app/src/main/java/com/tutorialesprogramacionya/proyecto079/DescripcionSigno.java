package com.tutorialesprogramacionya.proyecto079;

import androidx.appcompat.app.AppCompatActivity;
import android.content.res.Configuration;

import android.os.Bundle;

public class DescripcionSigno extends AppCompatActivity {
    private ListaSignos listaSignos;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_descripcion_signo);
        listaSignos=new ListaSignos();
        Bundle datos=getIntent().getExtras();
        getSupportFragmentManager().setFragmentResult("datos",datos);
        if (getResources().getConfiguration().orientation== Configuration.ORIENTATION_LANDSCAPE)
            finish();


    }
}