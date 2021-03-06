package com.example.eduardo.mimoneda3;

import android.content.Intent;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    TextView Pdiario,Pmes,Sfinal;
    Button btnIdiario,btnGdiario,btnPresu;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Pdiario=(TextView)findViewById(R.id.txtPdiario);
        Pmes=(TextView)findViewById(R.id.txtPmes);
        Sfinal=(TextView)findViewById(R.id.txtSituacion);
        btnIdiario=(Button)findViewById(R.id.btnID);
        btnGdiario=(Button)findViewById(R.id.btnGD);
        btnPresu=(Button)findViewById(R.id.btnPre);

       btnIdiario.setOnClickListener(new View.OnClickListener() {
           @Override
           public void onClick(View v) {
               Intent i=new Intent(getApplicationContext(),IngresosDiario.class);
               startActivity(i);
           }
       });

       btnGdiario.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i=new Intent(getApplicationContext(),GastosDiario.class);
                startActivity(i);
            }
       });

       btnPresu.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i=new Intent(getApplicationContext(),Presupuesto.class);
                startActivity(i);
            }
       });
    }
}
